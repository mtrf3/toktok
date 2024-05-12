package com.bytedance.keva;

import X.C16880lQ;
import X.X1D;
import android.os.Looper;
import android.util.Log;
import com.bytedance.keva.Keva;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes16.dex */
public class KevaFuture extends Keva {
    public boolean isFromSp;
    public KevaImpl mFallBackInstance;
    public FutureTask<KevaImpl> mFuture;
    public volatile KevaImpl mKeva;
    public Callable<KevaImpl> mKevaCallable;
    public int mMode;
    public String mName;
    public String mPath;

    private KevaImpl getKeva() {
        try {
            if (this.mFuture.cancel(false)) {
                KevaImpl.sMonitor.logDebug("pass to cancel keva future instance");
                return this.mKevaCallable.call();
            }
            return this.mFuture.get();
        } catch (Exception e) {
            KevaMonitor kevaMonitor = KevaImpl.sMonitor;
            kevaMonitor.logDebug("fail to obtain keva future instance");
            kevaMonitor.reportThrowable(5, this.mName, null, null, e);
            if (this.mFallBackInstance == null) {
                KevaImpl emptyRepoImplWithPath = KevaImpl.getEmptyRepoImplWithPath(this.mName, this.mPath, this.mMode, this.isFromSp);
                this.mFallBackInstance = emptyRepoImplWithPath;
                emptyRepoImplWithPath.init(false);
            }
            return this.mFallBackInstance;
        }
    }

    public void onRepoLoad() {
    }

    private void directRunCallable() {
        try {
            KevaImpl.sMonitor.logDebug("main thread, direct execution");
            ((KevaFutureTask) this.mFuture).set(this.mKevaCallable.call());
        } catch (Exception e) {
            KevaMonitor kevaMonitor = KevaImpl.sMonitor;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Failed to execute: ");
            LIZ.append(Log.getStackTraceString(e));
            kevaMonitor.logDebug(X1D.LIZIZ(LIZ));
            ((KevaFutureTask) this.mFuture).setException(e);
        }
    }

    private KevaImpl obtain() {
        if (KevaImpl.sIsLoadOptEnable) {
            return obtainLoadOpt();
        }
        return obtainOrigin();
    }

    private KevaImpl obtainLoadOpt() {
        if (this.mKeva == null) {
            synchronized (this) {
                if (this.mKeva == null) {
                    this.mKeva = getKeva();
                }
            }
        }
        return this.mKeva;
    }

    private KevaImpl obtainOrigin() {
        try {
            return this.mFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            KevaMonitor kevaMonitor = KevaImpl.sMonitor;
            kevaMonitor.logDebug("fail to obtain keva future instance");
            kevaMonitor.reportThrowable(5, this.mName, null, null, e);
            if (this.mFallBackInstance == null) {
                KevaImpl emptyRepoImplWithPath = KevaImpl.getEmptyRepoImplWithPath(this.mName, this.mPath, this.mMode, this.isFromSp);
                this.mFallBackInstance = emptyRepoImplWithPath;
                emptyRepoImplWithPath.init(false);
            }
            return this.mFallBackInstance;
        }
    }

    @Override // com.bytedance.keva.Keva
    public void clear() {
        obtain().clear();
    }

    @Override // com.bytedance.keva.Keva
    public int count() {
        return obtain().count();
    }

    @Override // com.bytedance.keva.Keva
    public void dump() {
        obtain().dump();
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, ?> getAll() {
        return obtain().getAll();
    }

    @Override // com.bytedance.keva.Keva
    public String name() {
        return obtain().name();
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, Object> buildNewMap(Map<String, Object> map) {
        return obtain().buildNewMap(map);
    }

    public void checkMode(int i) {
        if (this.mFuture.isDone()) {
            obtain().checkMode(i);
        }
    }

    @Override // com.bytedance.keva.Keva
    public boolean contains(String str) {
        return obtain().contains(str);
    }

    @Override // com.bytedance.keva.Keva
    public void erase(String str) {
        obtain().erase(str);
    }

    public void initTask(final Callable<KevaImpl> callable) {
        if (KevaImpl.sIsLoadOptEnable) {
            this.mKevaCallable = new Callable<KevaImpl>() { // from class: com.bytedance.keva.KevaFuture.1
                public KevaImpl mResult;

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public KevaImpl call() {
                    synchronized (this) {
                        if (this.mResult == null) {
                            this.mResult = (KevaImpl) callable.call();
                            KevaFuture.this.onRepoLoad();
                        }
                    }
                    return this.mResult;
                }
            };
        } else {
            this.mKevaCallable = new Callable<KevaImpl>() { // from class: com.bytedance.keva.KevaFuture.2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public KevaImpl call() {
                    KevaImpl kevaImpl = (KevaImpl) callable.call();
                    KevaFuture.this.onRepoLoad();
                    return kevaImpl;
                }
            };
        }
        KevaFutureTask kevaFutureTask = new KevaFutureTask(this.mKevaCallable);
        this.mFuture = kevaFutureTask;
        if (KevaImpl.sIsEnableExecutorOpt) {
            int i = KevaImpl.sExecuteKevaType;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        KevaImpl.sExecutor.execute(kevaFutureTask);
                        return;
                    } else {
                        directRunCallable();
                        return;
                    }
                }
                if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
                    directRunCallable();
                    return;
                } else {
                    KevaImpl.sExecutor.execute(this.mFuture);
                    return;
                }
            }
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                directRunCallable();
                return;
            } else {
                KevaImpl.sExecutor.execute(this.mFuture);
                return;
            }
        }
        KevaImpl.sExecutor.execute(kevaFutureTask);
    }

    @Override // com.bytedance.keva.Keva
    public void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        obtain().registerChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.Keva
    public void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        obtain().unRegisterChangeListener(onChangeListener);
    }

    @Override // com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        return obtain().getBoolean(str, z);
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        return obtain().getBytes(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        return obtain().getBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public double getDouble(String str, double d) {
        return obtain().getDouble(str, d);
    }

    @Override // com.bytedance.keva.Keva
    public float getFloat(String str, float f) {
        return obtain().getFloat(str, f);
    }

    @Override // com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        return obtain().getInt(str, i);
    }

    @Override // com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        return obtain().getLong(str, j);
    }

    @Override // com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        return obtain().getString(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        return obtain().getStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        return obtain().getStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        return obtain().getStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        return obtain().getStringSet(str, set);
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        return obtain().getStringSetJustDisk(str, set);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        obtain().storeBoolean(str, z);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        obtain().storeBytes(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        obtain().storeBytesJustDisk(str, bArr);
    }

    @Override // com.bytedance.keva.Keva
    public void storeDouble(String str, double d) {
        obtain().storeDouble(str, d);
    }

    @Override // com.bytedance.keva.Keva
    public void storeFloat(String str, float f) {
        obtain().storeFloat(str, f);
    }

    @Override // com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        obtain().storeInt(str, i);
    }

    @Override // com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        obtain().storeLong(str, j);
    }

    @Override // com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        obtain().storeString(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        obtain().storeStringArray(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        obtain().storeStringArrayJustDisk(str, strArr);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        obtain().storeStringJustDisk(str, str2);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        obtain().storeStringSet(str, set);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        obtain().storeStringSetJustDisk(str, set);
    }

    public KevaFuture(String str, String str2, int i, Callable<KevaImpl> callable, boolean z) {
        this.mName = str;
        this.mMode = i;
        this.isFromSp = z;
        this.mPath = str2;
        initTask(callable);
    }
}
