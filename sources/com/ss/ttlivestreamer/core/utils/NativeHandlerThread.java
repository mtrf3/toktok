package com.ss.ttlivestreamer.core.utils;

import X.C16880lQ;
import X.X1D;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.util.AndroidRuntimeException;
import android.util.Log;
import java.lang.Thread;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class NativeHandlerThread extends HandlerThread implements Runnable {
    public boolean mIsAlive;
    public final boolean mIsNative;
    public Looper mLooper;
    public final String mName;
    public int mPriority;
    public volatile Thread.State mState;
    public int mTid;

    public static native int nativeCreatePThread(String str, Runnable runnable);

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public void run() {
        com_ss_ttlivestreamer_core_utils_NativeHandlerThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    @Override // java.lang.Thread
    public synchronized void start() {
        if (this.mIsNative) {
            int nativeCreatePThread = nativeCreatePThread(this.mName, this);
            if (nativeCreatePThread != 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("event", "create_thread_fail");
                    jSONObject.put("thread_name", this.mName);
                    jSONObject.put("ret", nativeCreatePThread);
                    jSONObject.put("current_thread", Monitor.nativeGetThreadCount());
                    jSONObject.put("current_vss", Monitor.nativeGetAppVSSKB());
                    jSONObject.put("current_rss", Monitor.nativeGetAppRSSKB());
                    AVLog.logKibana(6, "NativeHandlerThread", jSONObject.toString(), null);
                    Thread.sleep(100L);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
                throw new AndroidRuntimeException("OOM!", new Exception(jSONObject.toString()));
            }
        } else {
            super.start();
        }
    }

    public void com_ss_ttlivestreamer_core_utils_NativeHandlerThread__run$___twin___() {
        if (this.mIsNative) {
            this.mIsAlive = true;
            this.mTid = Process.myTid();
            Looper.prepare();
            synchronized (this) {
                this.mLooper = Looper.myLooper();
                notifyAll();
            }
            Process.setThreadPriority(this.mPriority);
            onLooperPrepared();
            this.mState = Thread.State.RUNNABLE;
            Looper.loop();
            this.mTid = -1;
            this.mIsAlive = false;
            return;
        }
        super.run();
    }

    @Override // android.os.HandlerThread
    public Looper getLooper() {
        Looper looper;
        if (this.mIsNative) {
            synchronized (this) {
                while (true) {
                    looper = this.mLooper;
                    if (looper == null) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
            return looper;
        }
        return super.getLooper();
    }

    @Override // java.lang.Thread
    public Thread.State getState() {
        if (this.mIsNative) {
            return this.mState;
        }
        return super.getState();
    }

    public boolean isThreadAlive() {
        if (this.mIsNative) {
            return this.mIsAlive;
        }
        return super.isAlive();
    }

    public void release() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Release Native thread:");
        LIZ.append(getName());
        AVLog.ioi("NativeHandlerThread", X1D.LIZIZ(LIZ));
        try {
            getLooper().quitSafely();
        } catch (Throwable unused) {
            getLooper().quit();
        }
    }

    @Override // android.os.HandlerThread
    public int getThreadId() {
        return this.mTid;
    }

    public NativeHandlerThread(String str) {
        this(str, 0);
    }

    public static void com_ss_ttlivestreamer_core_utils_NativeHandlerThread_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(NativeHandlerThread nativeHandlerThread) {
        boolean LIZ;
        try {
            nativeHandlerThread.com_ss_ttlivestreamer_core_utils_NativeHandlerThread__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static void onPThreadCreate(Runnable runnable) {
        if (runnable != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onNativeThreadStart:");
            LIZ.append(runnable);
            AVLog.ioi("NativeHandlerThread", X1D.LIZIZ(LIZ));
            try {
                runnable.run();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("onNativeThreadStop:");
                LIZ2.append(runnable);
                AVLog.ioi("NativeHandlerThread", X1D.LIZIZ(LIZ2));
            } catch (Throwable th) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("onNativeThreadCrash:");
                LIZ3.append(Log.getStackTraceString(th));
                AVLog.e("NativeHandlerThread-Crash", X1D.LIZIZ(LIZ3));
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("onNativeThreadCrash: ");
                LIZ4.append(th);
                AVLog.logKibana(6, "NativeHandlerThread", X1D.LIZIZ(LIZ4), th);
                throw th;
            }
        }
    }

    public void setThreadName(String str) {
        if (!this.mIsNative) {
            super.setName(str);
            return;
        }
        throw new AndroidRuntimeException("NativeThread not support setThreadName");
    }

    public NativeHandlerThread(String str, int i) {
        super(str, i);
        this.mPriority = 1;
        this.mTid = -1;
        this.mName = str;
        this.mState = Thread.State.NEW;
        boolean usingNativeThread = SafeHandlerThreadPoolExecutor.usingNativeThread();
        this.mIsNative = usingNativeThread;
        if (usingNativeThread && i != 0) {
            this.mPriority = i;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Create a NativeHandlerThread ");
        LIZ.append(str);
        AVLog.iod("NativeHandlerThread", X1D.LIZIZ(LIZ));
    }
}
