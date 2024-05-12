package com.bytedance.keva;

import X.AbstractC38658FFe;
import X.C141335gf;
import X.C16880lQ;
import X.C38655FFb;
import X.C38657FFd;
import X.C3C5;
import X.C76800UCe;
import X.KMP;
import X.X1D;
import android.content.Context;
import android.os.Environment;
import android.util.ArrayMap;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.keva.KevaInfo;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class KevaImpl extends Keva {
    public static int sExecuteKevaType;
    public static final Executor sExecutor;
    public static final boolean sIsAsyncWriteEnable;
    public static final boolean sIsEnableArrayMap;
    public static final boolean sIsEnableExecutorOpt;
    public static int sIsEnableLoadFromNative;
    public static final boolean sIsEnableLockOpt;
    public static final boolean sIsLoadOptEnable;
    public static final KevaMonitor sMonitor;
    public static final ConcurrentHashMap<String, Map<String, Keva>> sPathRepoMap;
    public static final String sPortedSpRepoName;
    public static final Map<String, Keva> sRepoMap;
    public static final File sSharedPrefsDir;
    public static final File sWorkDir;
    public volatile long mHandle;
    public final boolean mIsMultiProcess;
    public final int mMode;
    public final String mName;
    public String mSpecifiedPath;
    public volatile Map<String, KevaValueWrapper> mValueMap = obtainMap();
    public final ConcurrentLinkedQueue<Keva.OnChangeListener> mChangeListeners = new ConcurrentLinkedQueue<>();
    public List<KevaValueWrapper> mDuplicatedOldWrappers = new ArrayList();

    /* loaded from: classes16.dex */
    public static class KevaValueWrapper {
        public volatile boolean loaded;
        public volatile long offset;
        public volatile int type;
        public volatile Object value;
    }

    /* loaded from: classes16.dex */
    public static class PortedSpRepoHolder {
        public static final KevaImpl sInstance;
        public static final Map<String, ?> sPortedSpMap;

        static {
            KevaMultiProcessImpl kevaMultiProcessImpl = new KevaMultiProcessImpl(KevaImpl.sPortedSpRepoName, null, 1);
            sInstance = kevaMultiProcessImpl;
            kevaMultiProcessImpl.init(true);
            Map<String, ?> obtainMap = KevaImpl.obtainMap();
            kevaMultiProcessImpl.buildNewMap(obtainMap);
            sPortedSpMap = obtainMap;
        }
    }

    /* loaded from: classes16.dex */
    public interface PrivateConstants {
    }

    public static native void checkReportException(long j);

    public static native void clear(long j);

    public static native boolean delete(String str);

    private native void dump(long j);

    private native void erase(long j, String str, long j2);

    private native void eraseUnusedChunk(long j, long j2);

    public static void forceInitImpl() {
    }

    public static Keva getRepoImpl(String str, String str2, int i, boolean z) {
        return com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_KevaImplLancet_getRepoImpl(str, str2, i, z);
    }

    public static native void initialize(String str);

    private native long loadRepo(String str, int i, boolean z);

    private native long loadRepoWithPath(String str, String str2, int i);

    private native int protectPortingInterProcess(String str, boolean z, int i);

    private native long storeBoolean(long j, String str, long j2, boolean z);

    private native long storeBytes(long j, String str, long j2, byte[] bArr, int i);

    private native long storeDouble(long j, String str, long j2, double d);

    private native long storeFloat(long j, String str, long j2, float f);

    private native long storeInt(long j, String str, long j2, int i);

    private native long storeLong(long j, String str, long j2, long j3);

    private native long storeString(long j, String str, long j2, String str2);

    private native long storeStringArray(long j, String str, long j2, String[] strArr, int i);

    @Override // com.bytedance.keva.Keva
    public void clear() {
        synchronized (this) {
            try {
                this.mValueMap.clear();
                clear(this.mHandle);
            } finally {
            }
        }
    }

    public native boolean contains(long j, String str, long j2);

    @Override // com.bytedance.keva.Keva
    public void dump() {
        synchronized (this) {
            KevaMonitor kevaMonitor = sMonitor;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("start dumping keva ");
            LIZ.append(this.mName);
            LIZ.append(", size=");
            LIZ.append(this.mValueMap.size());
            kevaMonitor.logDebug(X1D.LIZIZ(LIZ));
            for (Map.Entry<String, KevaValueWrapper> entry : this.mValueMap.entrySet()) {
                KevaValueWrapper value = entry.getValue();
                String key = entry.getKey();
                KevaMonitor kevaMonitor2 = sMonitor;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("key: ");
                LIZ2.append(key);
                LIZ2.append(", value: ");
                LIZ2.append(value.value);
                LIZ2.append(", offset: ");
                LIZ2.append(value.offset);
                LIZ2.append(", loaded: ");
                LIZ2.append(value.loaded);
                kevaMonitor2.logDebug(X1D.LIZIZ(LIZ2));
            }
            KevaMonitor kevaMonitor3 = sMonitor;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("finish dumping keva ");
            LIZ3.append(this.mName);
            LIZ3.append(", size=");
            LIZ3.append(this.mValueMap.size());
            kevaMonitor3.logDebug(X1D.LIZIZ(LIZ3));
        }
    }

    public void dumpNative() {
        synchronized (this) {
            dump(this.mHandle);
        }
    }

    public native boolean fetchBoolean(long j, String str, long j2, boolean z);

    public abstract boolean fetchBoolean(String str, boolean z);

    public native byte[] fetchBytes(long j, String str, long j2, byte[] bArr, int i);

    public abstract byte[] fetchBytes(String str, byte[] bArr, int i, boolean z);

    public native double fetchDouble(long j, String str, long j2, double d);

    public abstract double fetchDouble(String str, double d);

    public native float fetchFloat(long j, String str, long j2, float f);

    public abstract float fetchFloat(String str, float f);

    public native int fetchInt(long j, String str, long j2, int i);

    public abstract int fetchInt(String str, int i);

    public native long fetchLong(long j, String str, long j2, long j3);

    public abstract long fetchLong(String str, long j);

    public native String fetchString(long j, String str, long j2, String str2);

    public abstract String fetchString(String str, String str2, boolean z);

    public native String[] fetchStringArray(long j, String str, long j2, String[] strArr, int i);

    public abstract String[] fetchStringArray(String str, String[] strArr, boolean z);

    public native void rebuildValueMap(long j);

    private void cleanUpAfterLoadRepo() {
        if (this.mHandle == 0) {
            KevaMonitor kevaMonitor = sMonitor;
            String str = this.mName;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("free space is ");
            LIZ.append(Environment.getDataDirectory().getFreeSpace());
            kevaMonitor.reportWarning(1, str, null, null, X1D.LIZIZ(LIZ));
            return;
        }
        try {
            Iterator<KevaValueWrapper> it = this.mDuplicatedOldWrappers.iterator();
            while (it.hasNext()) {
                eraseUnusedChunk(this.mHandle, it.next().offset);
            }
            this.mDuplicatedOldWrappers = null;
            checkReportException(this.mHandle);
        } catch (Throwable th) {
            sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    public static Map obtainMap() {
        if (!sIsEnableArrayMap) {
            return new HashMap();
        }
        return new ArrayMap();
    }

    static {
        KevaBuilder kevaBuilder = KevaBuilder.getInstance();
        KevaBuilder.clearInstance();
        sRepoMap = obtainMap();
        sPathRepoMap = new ConcurrentHashMap<>();
        Executor executor = kevaBuilder.mExecutor;
        boolean z = true;
        if (executor != null) {
            sExecutor = executor;
        } else {
            int max = Math.max(Runtime.getRuntime().availableProcessors() * 2, 6);
            PThreadPoolExecutor pThreadPoolExecutor = new PThreadPoolExecutor(max, max, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DefaultThreadFactory("keva/KevaImpl"));
            pThreadPoolExecutor.allowCoreThreadTimeOut(true);
            sExecutor = pThreadPoolExecutor;
        }
        String str = kevaBuilder.mPortedRepoName;
        if (str == null) {
            str = "keva_porting_sp";
        }
        sPortedSpRepoName = str;
        Context context = kevaBuilder.mContext;
        File LLIIJLIL = C16880lQ.LLIIJLIL(context);
        if (LLIIJLIL == null) {
            LLIIJLIL = new File(context.getApplicationInfo().dataDir, "files");
        }
        if (!LLIIJLIL.exists()) {
            LLIIJLIL.mkdirs();
        }
        File file = kevaBuilder.mWorkDir;
        if (file == null) {
            file = new File(LLIIJLIL, "keva");
        }
        sSharedPrefsDir = new File(LLIIJLIL.getParent(), "shared_prefs");
        KevaMonitor kevaMonitor = kevaBuilder.mMonitor;
        if (kevaMonitor == null) {
            kevaMonitor = new KevaMonitor();
        }
        sMonitor = kevaMonitor;
        kevaMonitor.logDebug("Keva version: 1.6.6.SHARED-alpha.26-TikTokOptimizedGetRepoTime-keva-excuter");
        if (!file.exists() && !file.mkdirs()) {
            kevaMonitor.reportThrowable(1, null, null, null, new IllegalStateException("fail to create work dir " + file.getPath()));
        }
        boolean z2 = kevaBuilder.mEnableAsyncWrite;
        sIsAsyncWriteEnable = z2;
        if (z2 || !kevaBuilder.mEnableLoadOpt) {
            z = false;
        }
        sIsLoadOptEnable = z;
        sIsEnableLockOpt = kevaBuilder.mEnableLockOpt;
        sIsEnableExecutorOpt = kevaBuilder.mEnableExecutorOpt;
        sExecuteKevaType = kevaBuilder.mExecuteKevaType;
        sWorkDir = file;
        sIsEnableArrayMap = kevaBuilder.mEnableArrayMap;
        sIsEnableLoadFromNative = kevaBuilder.mIsLoadFromNative;
        try {
            kevaMonitor.loadLibrary("keva");
            initialize(file.getAbsolutePath());
        } catch (Throwable th) {
            KevaMonitor kevaMonitor2 = sMonitor;
            kevaMonitor2.logDebug("fail to load so and init");
            kevaMonitor2.reportThrowable(1, null, null, null, th);
        }
    }

    public static Keva getPortedSpRepo() {
        return PortedSpRepoHolder.sInstance;
    }

    @Override // com.bytedance.keva.Keva
    public String name() {
        return this.mName;
    }

    public static boolean existSharedPrefs(String str) {
        return new File(sSharedPrefsDir, i0.LJFF(str, ".xml")).exists();
    }

    public static boolean isRepoPorted(String str) {
        if (PortedSpRepoHolder.sPortedSpMap.get(str) != null) {
            return true;
        }
        return getPortedSpRepo().getBoolean(str, false);
    }

    private KevaValueWrapper obtainWrapperLocked(String str) {
        KevaValueWrapper kevaValueWrapper = this.mValueMap.get(str);
        if (kevaValueWrapper == null) {
            KevaValueWrapper kevaValueWrapper2 = new KevaValueWrapper();
            this.mValueMap.put(str, kevaValueWrapper2);
            return kevaValueWrapper2;
        }
        return kevaValueWrapper;
    }

    @Override // com.bytedance.keva.Keva
    public Map<String, Object> buildNewMap(Map<String, Object> map) {
        synchronized (this) {
            for (Map.Entry<String, KevaValueWrapper> entry : this.mValueMap.entrySet()) {
                KevaValueWrapper value = entry.getValue();
                if (value.offset != 0) {
                    String key = entry.getKey();
                    try {
                        if (!value.loaded) {
                            int i = value.type;
                            if (i != 6) {
                                if (i != 7) {
                                    if (i != 23 && i != 39) {
                                        if (i != 55) {
                                            if (!this.mIsMultiProcess || value.type > 5) {
                                                StringBuilder LIZ = X1D.LIZ();
                                                LIZ.append("keva has not implemented type ");
                                                LIZ.append(value.type);
                                                throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
                                            }
                                        } else {
                                            value.value = fetchStringArray(this.mHandle, key, value.offset, null, 3);
                                        }
                                    } else {
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append("keva has not implemented type ");
                                        LIZ2.append(value.type);
                                        throw new UnsupportedOperationException(X1D.LIZIZ(LIZ2));
                                    }
                                } else {
                                    value.value = fetchBytes(this.mHandle, key, value.offset, null, 0);
                                }
                            } else {
                                value.value = fetchString(this.mHandle, key, value.offset, null);
                            }
                            if (!this.mIsMultiProcess) {
                                value.loaded = true;
                            }
                        }
                        map.put(key, value.value);
                    } catch (Throwable th) {
                        sMonitor.reportThrowable(2, this.mName, key, Long.valueOf(value.offset), th);
                    }
                }
            }
        }
        return map;
    }

    public void checkMode(int i) {
        if (this.mHandle != 0 && this.mMode != i) {
            KevaMonitor kevaMonitor = sMonitor;
            String str = this.mName;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mode is different: ");
            LIZ.append(this.mMode);
            LIZ.append(" != ");
            LIZ.append(i);
            kevaMonitor.reportThrowable(1, str, null, null, new IllegalStateException(X1D.LIZIZ(LIZ)));
        }
    }

    public void doLoadRepo(boolean z) {
        try {
            String str = this.mSpecifiedPath;
            if (str == null) {
                this.mHandle = loadRepo(this.mName, this.mMode, z);
            } else {
                this.mHandle = loadRepoWithPath(this.mName, str, this.mMode);
            }
            cleanUpAfterLoadRepo();
            if (!z) {
                sMonitor.onLoadRepo(this.mName, this.mMode);
            }
        } catch (Throwable th) {
            sMonitor.reportThrowable(1, this.mName, null, null, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[Catch: all -> 0x01ff, DONT_GENERATE, TryCatch #3 {, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x000d, B:11:0x0014, B:13:0x0022, B:14:0x002a, B:17:0x0038, B:19:0x0058, B:22:0x005c, B:23:0x005f, B:24:0x009d, B:26:0x00a3, B:29:0x00b6, B:32:0x00bf, B:46:0x01c4, B:74:0x01d5, B:76:0x01e0, B:77:0x01e6, B:80:0x002c), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void doPortingFromSp(android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.doPortingFromSp(android.content.Context):void");
    }

    @Override // com.bytedance.keva.Keva
    public void erase(String str) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
                erase(this.mHandle, str2, obtainWrapperLocked.offset);
                obtainWrapperLocked.value = null;
                obtainWrapperLocked.offset = 0L;
                if (!this.mIsMultiProcess) {
                    obtainWrapperLocked.loaded = true;
                }
            } finally {
            }
        }
    }

    public void init(boolean z) {
        synchronized (this) {
            if (this.mHandle != 0) {
                return;
            }
            doLoadRepo(z);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void registerChangeListener(Keva.OnChangeListener onChangeListener) {
        if (!this.mChangeListeners.contains(onChangeListener)) {
            this.mChangeListeners.add(onChangeListener);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void unRegisterChangeListener(Keva.OnChangeListener onChangeListener) {
        synchronized (this) {
            this.mChangeListeners.remove(onChangeListener);
        }
    }

    public static Keva getRepo(String str, int i) {
        return com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_KevaImplLancet_getRepoImpl(str, null, i, false);
    }

    public static Keva getRepoSync(String str, int i) {
        return com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_KevaImplLancet_getRepoImpl(str, null, i, true);
    }

    @Override // com.bytedance.keva.Keva
    public boolean getBoolean(String str, boolean z) {
        boolean fetchBoolean;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchBoolean = fetchBoolean(str2, z);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, null, th);
                return z;
            }
        }
        return fetchBoolean;
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytes(String str, byte[] bArr) {
        byte[] fetchBytes;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchBytes = fetchBytes(str2, bArr, 0, false);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, bArr, th);
                return bArr;
            }
        }
        return fetchBytes;
    }

    @Override // com.bytedance.keva.Keva
    public byte[] getBytesJustDisk(String str, byte[] bArr) {
        byte[] fetchBytes;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchBytes = fetchBytes(str2, bArr, 0, true);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, bArr, th);
                return bArr;
            }
        }
        return fetchBytes;
    }

    @Override // com.bytedance.keva.Keva
    public double getDouble(String str, double d) {
        double fetchDouble;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchDouble = fetchDouble(str2, d);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, Double.valueOf(d), th);
                return d;
            }
        }
        return fetchDouble;
    }

    @Override // com.bytedance.keva.Keva
    public float getFloat(String str, float f) {
        float fetchFloat;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchFloat = fetchFloat(str2, f);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, Float.valueOf(f), th);
                return f;
            }
        }
        return fetchFloat;
    }

    @Override // com.bytedance.keva.Keva
    public int getInt(String str, int i) {
        int fetchInt;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchInt = fetchInt(str2, i);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, Integer.valueOf(i), th);
                return i;
            }
        }
        return fetchInt;
    }

    @Override // com.bytedance.keva.Keva
    public long getLong(String str, long j) {
        long fetchLong;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchLong = fetchLong(str2, j);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, Long.valueOf(j), th);
                return j;
            }
        }
        return fetchLong;
    }

    @Override // com.bytedance.keva.Keva
    public String getString(String str, String str2) {
        String fetchString;
        String str3 = str;
        if ("".equals(str3)) {
            str3 = null;
        }
        synchronized (this) {
            try {
                fetchString = fetchString(str3, str2, false);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str3, str2, th);
                return str2;
            }
        }
        return fetchString;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArray(String str, String[] strArr) {
        String[] fetchStringArray;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchStringArray = fetchStringArray(str2, strArr, false);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, strArr, th);
                return strArr;
            }
        }
        return fetchStringArray;
    }

    @Override // com.bytedance.keva.Keva
    public String[] getStringArrayJustDisk(String str, String[] strArr) {
        String[] fetchStringArray;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchStringArray = fetchStringArray(str2, strArr, true);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, strArr, th);
                return strArr;
            }
        }
        return fetchStringArray;
    }

    @Override // com.bytedance.keva.Keva
    public String getStringJustDisk(String str, String str2) {
        String fetchString;
        String str3 = str;
        if ("".equals(str3)) {
            str3 = null;
        }
        synchronized (this) {
            try {
                fetchString = fetchString(str3, str2, true);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str3, str2, th);
                return str2;
            }
        }
        return fetchString;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> fetchStringSet;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchStringSet = fetchStringSet(str2, set, false);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, set, th);
                return set;
            }
        }
        return fetchStringSet;
    }

    @Override // com.bytedance.keva.Keva
    public Set<String> getStringSetJustDisk(String str, Set<String> set) {
        Set<String> fetchStringSet;
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            try {
                fetchStringSet = fetchStringSet(str2, set, true);
            } catch (Throwable th) {
                sMonitor.reportThrowable(2, this.mName, str2, set, th);
                return set;
            }
        }
        return fetchStringSet;
    }

    public void notifyChangeListeners(Keva keva, String str) {
        if (this.mChangeListeners.isEmpty()) {
            return;
        }
        Iterator<Keva.OnChangeListener> it = this.mChangeListeners.iterator();
        while (it.hasNext()) {
            it.next().onChanged(keva, str);
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeBoolean(String str, boolean z) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
            if (!this.mIsMultiProcess && obtainWrapperLocked.loaded && obtainWrapperLocked.value != null && obtainWrapperLocked.value.equals(Boolean.valueOf(z))) {
                return;
            }
            try {
                obtainWrapperLocked.offset = storeBoolean(this.mHandle, str2, obtainWrapperLocked.offset, z);
                obtainWrapperLocked.value = Boolean.valueOf(z);
                if (!this.mIsMultiProcess) {
                    obtainWrapperLocked.loaded = true;
                }
                notifyChangeListeners(this, str2);
            } catch (Throwable th) {
                sMonitor.reportThrowable(3, this.mName, str2, Boolean.valueOf(z), th);
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytes(String str, byte[] bArr) {
        storeBytes(str, bArr, 0, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeBytesJustDisk(String str, byte[] bArr) {
        storeBytes(str, bArr, 0, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeDouble(String str, double d) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
            if (!this.mIsMultiProcess && obtainWrapperLocked.loaded && obtainWrapperLocked.value != null && obtainWrapperLocked.value.equals(Double.valueOf(d))) {
                return;
            }
            try {
                obtainWrapperLocked.offset = storeDouble(this.mHandle, str2, obtainWrapperLocked.offset, d);
                obtainWrapperLocked.value = Double.valueOf(d);
                if (!this.mIsMultiProcess) {
                    obtainWrapperLocked.loaded = true;
                }
                notifyChangeListeners(this, str2);
            } catch (Throwable th) {
                sMonitor.reportThrowable(3, this.mName, str2, Double.valueOf(d), th);
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeFloat(String str, float f) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
            if (!this.mIsMultiProcess && obtainWrapperLocked.loaded && obtainWrapperLocked.value != null && obtainWrapperLocked.value.equals(Float.valueOf(f))) {
                return;
            }
            try {
                obtainWrapperLocked.offset = storeFloat(this.mHandle, str2, obtainWrapperLocked.offset, f);
                obtainWrapperLocked.value = Float.valueOf(f);
                if (!this.mIsMultiProcess) {
                    obtainWrapperLocked.loaded = true;
                }
                notifyChangeListeners(this, str2);
            } catch (Throwable th) {
                sMonitor.reportThrowable(3, this.mName, str2, Float.valueOf(f), th);
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeInt(String str, int i) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
            if (!this.mIsMultiProcess && obtainWrapperLocked.loaded && obtainWrapperLocked.value != null && obtainWrapperLocked.value.equals(Integer.valueOf(i))) {
                return;
            }
            try {
                obtainWrapperLocked.offset = storeInt(this.mHandle, str2, obtainWrapperLocked.offset, i);
                obtainWrapperLocked.value = Integer.valueOf(i);
                if (!this.mIsMultiProcess) {
                    obtainWrapperLocked.loaded = true;
                }
                notifyChangeListeners(this, str2);
            } catch (Throwable th) {
                sMonitor.reportThrowable(3, this.mName, str2, Integer.valueOf(i), th);
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeLong(String str, long j) {
        String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
            if (!this.mIsMultiProcess && obtainWrapperLocked.loaded && obtainWrapperLocked.value != null && obtainWrapperLocked.value.equals(Long.valueOf(j))) {
                return;
            }
            try {
                obtainWrapperLocked.offset = storeLong(this.mHandle, str2, obtainWrapperLocked.offset, j);
                obtainWrapperLocked.value = Long.valueOf(j);
                if (!this.mIsMultiProcess) {
                    obtainWrapperLocked.loaded = true;
                }
                notifyChangeListeners(this, str2);
            } catch (Throwable th) {
                sMonitor.reportThrowable(3, this.mName, str2, Long.valueOf(j), th);
            }
        }
    }

    @Override // com.bytedance.keva.Keva
    public void storeString(String str, String str2) {
        storeString(str, str2, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArray(String str, String[] strArr) {
        storeStringArray(str, strArr, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringArrayJustDisk(String str, String[] strArr) {
        storeStringArray(str, strArr, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringJustDisk(String str, String str2) {
        storeString(str, str2, true);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSet(String str, Set<String> set) {
        storeStringSet(str, set, false);
    }

    @Override // com.bytedance.keva.Keva
    public void storeStringSetJustDisk(String str, Set<String> set) {
        storeStringSet(str, set, true);
    }

    public KevaImpl(String str, String str2, int i) {
        this.mName = str;
        this.mMode = i;
        this.mSpecifiedPath = str2;
        this.mIsMultiProcess = (i & 1) != 0;
    }

    private Set<String> fetchStringSet(String str, Set<String> set, boolean z) {
        String[] strArr;
        if (set != null) {
            strArr = (String[]) set.toArray(new String[0]);
        } else {
            strArr = null;
        }
        String[] fetchStringArray = fetchStringArray(str, strArr, z);
        if (fetchStringArray == null) {
            return null;
        }
        return new HashSet(Arrays.asList(fetchStringArray));
    }

    public static Keva getRepoFromSp(Context context, String str, int i) {
        return getRepoFromSpImpl(context, str, i, false);
    }

    public static Keva getRepoFromSpSync(Context context, String str, int i) {
        return getRepoFromSpImpl(context, str, i, true);
    }

    private void reportBigValue(final String str, final Object obj, final int i) {
        if (i > 10000) {
            sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    com_bytedance_keva_KevaImpl$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_bytedance_keva_KevaImpl$2__run$___twin___() {
                    KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                    String str2 = KevaImpl.this.mName;
                    String str3 = str;
                    Object obj2 = obj;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("value too big, size=");
                    LIZ.append(i);
                    kevaMonitor.reportWarning(3, str2, str3, obj2, X1D.LIZIZ(LIZ));
                }

                public static void com_bytedance_keva_KevaImpl$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_bytedance_keva_KevaImpl$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    private void storeString(String str, final String str2, boolean z) {
        final int length;
        final String str3 = str;
        if ("".equals(str3)) {
            str3 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str3);
            if (!this.mIsMultiProcess && obtainWrapperLocked.loaded && obtainWrapperLocked.value != null && obtainWrapperLocked.value.equals(str2)) {
                return;
            }
            try {
                obtainWrapperLocked.offset = storeString(this.mHandle, str3, obtainWrapperLocked.offset, str2);
                obtainWrapperLocked.type = 6;
                if (z) {
                    obtainWrapperLocked.value = null;
                    obtainWrapperLocked.loaded = false;
                } else {
                    obtainWrapperLocked.value = str2;
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                }
                notifyChangeListeners(this, str3);
            } catch (Throwable th) {
                sMonitor.reportThrowable(3, this.mName, str3, str2, th);
            }
            if (str2 != null && (length = str2.length()) > 10000) {
                sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaImpl.3
                    @Override // java.lang.Runnable
                    public void run() {
                        com_bytedance_keva_KevaImpl$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_bytedance_keva_KevaImpl$3__run$___twin___() {
                        KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                        String str4 = KevaImpl.this.mName;
                        String str5 = str3;
                        String str6 = str2;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("value too big, size=");
                        LIZ.append(length);
                        kevaMonitor.reportWarning(3, str4, str5, str6, X1D.LIZIZ(LIZ));
                    }

                    public static void com_bytedance_keva_KevaImpl$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                        boolean LIZ;
                        try {
                            anonymousClass3.com_bytedance_keva_KevaImpl$3__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
        }
    }

    private void storeStringArray(String str, String[] strArr, boolean z) {
        final String arrays;
        final int length;
        final String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
            try {
                obtainWrapperLocked.offset = storeStringArray(this.mHandle, str2, obtainWrapperLocked.offset, strArr, 3);
                obtainWrapperLocked.type = 55;
                if (z) {
                    obtainWrapperLocked.value = null;
                    obtainWrapperLocked.loaded = false;
                } else {
                    obtainWrapperLocked.value = strArr;
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                }
                notifyChangeListeners(this, str2);
            } catch (Throwable th) {
                sMonitor.reportThrowable(3, this.mName, str2, null, th);
            }
        }
        if (strArr != null && (length = (arrays = Arrays.toString(strArr)).length()) > 10000) {
            sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    com_bytedance_keva_KevaImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_bytedance_keva_KevaImpl$5__run$___twin___() {
                    KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                    String str3 = KevaImpl.this.mName;
                    String str4 = str2;
                    String str5 = arrays;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("value too big, size=");
                    LIZ.append(length);
                    kevaMonitor.reportWarning(3, str3, str4, str5, X1D.LIZIZ(LIZ));
                }

                public static void com_bytedance_keva_KevaImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                    boolean LIZ;
                    try {
                        anonymousClass5.com_bytedance_keva_KevaImpl$5__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    private void storeStringSet(String str, Set<String> set, boolean z) {
        String[] strArr;
        if (set != null) {
            strArr = new String[set.size()];
            set.toArray(strArr);
        } else {
            strArr = null;
        }
        storeStringArray(str, strArr, z);
    }

    public void addMapBoolWhenLoading(String str, boolean z, long j) {
        addMapObjectWhenLoading(str, Boolean.valueOf(z), j, 2);
    }

    public void addMapDoubleWhenLoading(String str, double d, long j) {
        addMapObjectWhenLoading(str, Double.valueOf(d), j, 5);
    }

    public void addMapFloatWhenLoading(String str, float f, long j) {
        addMapObjectWhenLoading(str, Float.valueOf(f), j, 4);
    }

    public void addMapIntWhenLoading(String str, int i, long j) {
        addMapObjectWhenLoading(str, Integer.valueOf(i), j, 1);
    }

    public void addMapLongWhenLoading(String str, long j, long j2) {
        addMapObjectWhenLoading(str, Long.valueOf(j), j2, 3);
    }

    public void addMapOffsetWhenLoading(String str, long j, int i) {
        List<KevaValueWrapper> list;
        if ("".equals(str)) {
            str = null;
        }
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        kevaValueWrapper.offset = j;
        kevaValueWrapper.type = i;
        KevaValueWrapper put = this.mValueMap.put(str, kevaValueWrapper);
        if (put != null && (list = this.mDuplicatedOldWrappers) != null) {
            list.add(put);
        }
    }

    private void addMapObjectWhenLoading(String str, Object obj, long j, int i) {
        List<KevaValueWrapper> list;
        if ("".equals(str)) {
            str = null;
        }
        KevaValueWrapper kevaValueWrapper = new KevaValueWrapper();
        kevaValueWrapper.value = obj;
        kevaValueWrapper.offset = j;
        kevaValueWrapper.type = i;
        if (!this.mIsMultiProcess) {
            kevaValueWrapper.loaded = true;
        }
        KevaValueWrapper put = this.mValueMap.put(str, kevaValueWrapper);
        if (put != null && (list = this.mDuplicatedOldWrappers) != null) {
            list.add(put);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.keva.Keva com_bytedance_keva_KevaImpl__getRepoImpl$___twin___(java.lang.String r6, java.lang.String r7, int r8, boolean r9) {
        /*
            boolean r0 = com.bytedance.keva.KevaImpl.sIsEnableLockOpt
            r5 = 0
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L3a
            if (r7 != 0) goto Ld
            java.util.Map<java.lang.String, com.bytedance.keva.Keva> r1 = com.bytedance.keva.KevaImpl.sRepoMap
        Lb:
            monitor-enter(r1)
            goto L1d
        Ld:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, com.bytedance.keva.Keva>> r1 = com.bytedance.keva.KevaImpl.sPathRepoMap
            java.util.Map r0 = obtainMap()
            r1.putIfAbsent(r7, r0)
            java.lang.Object r1 = r1.get(r7)
            java.util.Map r1 = (java.util.Map) r1
            goto Lb
        L1d:
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L37
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2     // Catch: java.lang.Throwable -> L37
            if (r2 != 0) goto L2c
            if (r9 == 0) goto L2e
            com.bytedance.keva.KevaImpl r2 = getEmptyRepoImplWithPath(r6, r7, r8, r3)     // Catch: java.lang.Throwable -> L37
            goto L32
        L2c:
            r4 = 0
            goto L35
        L2e:
            com.bytedance.keva.Keva r2 = getAsyncKeva(r5, r6, r7, r8, r3)     // Catch: java.lang.Throwable -> L37
        L32:
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> L37
        L35:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            goto L87
        L37:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            throw r0
        L3a:
            if (r7 != 0) goto L48
            java.util.Map<java.lang.String, com.bytedance.keva.Keva> r1 = com.bytedance.keva.KevaImpl.sRepoMap
        L3e:
            java.lang.Object r2 = r1.get(r6)
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2
            if (r2 != 0) goto L75
            monitor-enter(r1)
            goto L58
        L48:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.Map<java.lang.String, com.bytedance.keva.Keva>> r1 = com.bytedance.keva.KevaImpl.sPathRepoMap
            java.util.Map r0 = obtainMap()
            r1.putIfAbsent(r7, r0)
            java.lang.Object r1 = r1.get(r7)
            java.util.Map r1 = (java.util.Map) r1
            goto L3e
        L58:
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L72
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2     // Catch: java.lang.Throwable -> L72
            if (r2 != 0) goto L67
            if (r9 == 0) goto L69
            com.bytedance.keva.KevaImpl r2 = getEmptyRepoImplWithPath(r6, r7, r8, r3)     // Catch: java.lang.Throwable -> L72
            goto L6d
        L67:
            r4 = 0
            goto L70
        L69:
            com.bytedance.keva.Keva r2 = getAsyncKeva(r5, r6, r7, r8, r3)     // Catch: java.lang.Throwable -> L72
        L6d:
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> L72
        L70:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            goto L87
        L72:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L72
            throw r0
        L75:
            boolean r0 = r2 instanceof com.bytedance.keva.KevaFuture
            if (r0 != 0) goto L80
            r0 = r2
            com.bytedance.keva.KevaImpl r0 = (com.bytedance.keva.KevaImpl) r0
            r0.checkMode(r8)
            goto L93
        L80:
            r0 = r2
            com.bytedance.keva.KevaFuture r0 = (com.bytedance.keva.KevaFuture) r0
            r0.checkMode(r8)
            goto L93
        L87:
            if (r4 == 0) goto L75
            boolean r0 = r2 instanceof com.bytedance.keva.KevaFuture
            if (r0 != 0) goto L93
            r0 = r2
            com.bytedance.keva.KevaImpl r0 = (com.bytedance.keva.KevaImpl) r0
            r0.init(r3)
        L93:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.com_bytedance_keva_KevaImpl__getRepoImpl$___twin___(java.lang.String, java.lang.String, int, boolean):com.bytedance.keva.Keva");
    }

    public static Keva com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_KevaImplLancet_getRepoImpl(String repoName, String str, int i, boolean z) {
        Object LIZ;
        o.LJIIIZ(repoName, "repoName");
        if (C38657FFd.LIZ.get()) {
            Thread LLLLIIIILLL = C16880lQ.LLLLIIIILLL();
            Thread thread = C38657FFd.LIZJ;
            if (thread != null) {
                if (o.LJ(LLLLIIIILLL, thread)) {
                    try {
                        C38655FFb c38655FFb = C38657FFd.LIZIZ;
                        if (c38655FFb != null) {
                            Map<String, AbstractC38658FFe> map = c38655FFb.LIZIZ;
                            if (!map.isEmpty()) {
                                try {
                                    Iterator<Map.Entry<String, AbstractC38658FFe>> it = map.entrySet().iterator();
                                    while (it.hasNext()) {
                                        AbstractC38658FFe value = it.next().getValue();
                                        value.getClass();
                                        if (value.LIZ && !value.LIZIZ.get()) {
                                            value.LIZJ.add(new KevaInfo(repoName, i, z));
                                        }
                                    }
                                    LIZ = C76800UCe.LIZ;
                                    C3C5.m7constructorimpl(LIZ);
                                } catch (Throwable th) {
                                    LIZ = C141335gf.LIZ(th);
                                    C3C5.m7constructorimpl(LIZ);
                                }
                                C3C5.m6boximpl(LIZ);
                            }
                        } else {
                            o.LJIJI("preload");
                            throw null;
                        }
                    } catch (Exception unused) {
                    }
                }
            } else {
                o.LJIJI("mainThread");
                throw null;
            }
        }
        return com_bytedance_keva_KevaImpl__getRepoImpl$___twin___(repoName, str, i, z);
    }

    public static KevaImpl getEmptyRepoImpl(String str, String str2, int i, boolean z) {
        return getEmptyRepoImplWithPath(str, str2, i, z);
    }

    public static KevaImpl getEmptyRepoImplWithPath(String str, String str2, int i, boolean z) {
        if (i < 0 || i >= 2) {
            sMonitor.reportThrowable(1, str, null, null, new IllegalArgumentException(KMP.LJ("mode is not valid! ", i)));
        }
        if ((i & 1) == 0) {
            if (!z) {
                int i2 = sIsEnableLoadFromNative;
                if (i2 == 1) {
                    return new KevaPrivateNativeImpl(str, str2, i);
                }
                if (i2 == 2) {
                    return new KevaPrivateOnlyNativeImpl(str, str2, i);
                }
                return new KevaPrivateImpl(str, str2, i);
            }
            return new KevaPrivateImpl(str, str2, i);
        }
        return new KevaMultiProcessImpl(str, str2, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.keva.Keva getRepoFromSpImpl(android.content.Context r7, java.lang.String r8, int r9, boolean r10) {
        /*
            r5 = r8
            boolean r0 = isRepoPorted(r5)
            if (r0 == 0) goto Lc
            com.bytedance.keva.Keva r0 = getRepo(r5, r9)
            return r0
        Lc:
            boolean r0 = existSharedPrefs(r5)
            r4 = 1
            if (r0 != 0) goto L1f
            com.bytedance.keva.Keva r0 = getPortedSpRepo()
            r0.storeBoolean(r5, r4)
            com.bytedance.keva.Keva r0 = getRepo(r5, r9)
            return r0
        L1f:
            com.bytedance.keva.KevaMonitor r2 = com.bytedance.keva.KevaImpl.sMonitor
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "do poring from sp: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.logDebug(r0)
            boolean r1 = com.bytedance.keva.KevaImpl.sIsEnableLockOpt
            r0 = 0
            r6 = 0
            if (r1 != 0) goto L5a
            java.util.Map<java.lang.String, com.bytedance.keva.Keva> r1 = com.bytedance.keva.KevaImpl.sRepoMap
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L57
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2     // Catch: java.lang.Throwable -> L57
            if (r2 != 0) goto L55
            r0 = 1
            if (r10 == 0) goto L4e
        L49:
            com.bytedance.keva.KevaImpl r2 = getEmptyRepoImplWithPath(r5, r6, r9, r4)     // Catch: java.lang.Throwable -> L57
            goto L52
        L4e:
            com.bytedance.keva.Keva r2 = getAsyncKeva(r7, r5, r6, r9, r4)     // Catch: java.lang.Throwable -> L57
        L52:
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L57
        L55:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            goto L7e
        L57:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r0
        L5a:
            java.util.Map<java.lang.String, com.bytedance.keva.Keva> r1 = com.bytedance.keva.KevaImpl.sRepoMap
            java.lang.Object r2 = r1.get(r5)
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2
            if (r2 != 0) goto L8e
            monitor-enter(r1)
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L8b
            com.bytedance.keva.Keva r2 = (com.bytedance.keva.Keva) r2     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L7d
            r0 = 1
            if (r10 == 0) goto L76
        L71:
            com.bytedance.keva.KevaImpl r2 = getEmptyRepoImplWithPath(r5, r6, r9, r4)     // Catch: java.lang.Throwable -> L8b
            goto L7a
        L76:
            com.bytedance.keva.Keva r2 = getAsyncKeva(r7, r5, r6, r9, r4)     // Catch: java.lang.Throwable -> L8b
        L7a:
            r1.put(r5, r2)     // Catch: java.lang.Throwable -> L8b
        L7d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
        L7e:
            if (r0 == 0) goto L8e
            boolean r0 = r2 instanceof com.bytedance.keva.KevaImpl
            if (r0 == 0) goto La7
            r0 = r2
            com.bytedance.keva.KevaImpl r0 = (com.bytedance.keva.KevaImpl) r0     // Catch: java.lang.UnsatisfiedLinkError -> La0
            r0.doPortingFromSp(r7)     // Catch: java.lang.UnsatisfiedLinkError -> La0
            goto La7
        L8b:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r0
        L8e:
            boolean r0 = r2 instanceof com.bytedance.keva.KevaImpl
            if (r0 == 0) goto L99
            r0 = r2
            com.bytedance.keva.KevaImpl r0 = (com.bytedance.keva.KevaImpl) r0
            r0.checkMode(r9)
            goto La7
        L99:
            r0 = r2
            com.bytedance.keva.KevaFuture r0 = (com.bytedance.keva.KevaFuture) r0
            r0.checkMode(r9)
            goto La7
        La0:
            r8 = move-exception
            com.bytedance.keva.KevaMonitor r3 = com.bytedance.keva.KevaImpl.sMonitor
            r7 = r6
            r3.reportThrowable(r4, r5, r6, r7, r8)
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.keva.KevaImpl.getRepoFromSpImpl(android.content.Context, java.lang.String, int, boolean):com.bytedance.keva.Keva");
    }

    public static Keva getRepoWithPath(String str, String str2, int i, boolean z) {
        if (str2 != null && !"".equals(str2) && !str2.startsWith("/") && str2.endsWith("/")) {
            return com_bytedance_keva_KevaImpl_com_ss_android_ugc_aweme_lancet_KevaImplLancet_getRepoImpl(str, str2, i, z);
        }
        throw new IllegalArgumentException("The path passed in is wrong!");
    }

    private void storeBytes(String str, byte[] bArr, int i, boolean z) {
        final int length;
        final String str2 = str;
        if ("".equals(str2)) {
            str2 = null;
        }
        synchronized (this) {
            KevaValueWrapper obtainWrapperLocked = obtainWrapperLocked(str2);
            try {
                obtainWrapperLocked.offset = storeBytes(this.mHandle, str2, obtainWrapperLocked.offset, bArr, i);
                obtainWrapperLocked.type = (i << 4) | 7;
                if (z) {
                    obtainWrapperLocked.value = null;
                    obtainWrapperLocked.loaded = false;
                } else {
                    obtainWrapperLocked.value = bArr;
                    if (!this.mIsMultiProcess) {
                        obtainWrapperLocked.loaded = true;
                    }
                }
                notifyChangeListeners(this, str2);
            } catch (Throwable th) {
                sMonitor.reportThrowable(3, this.mName, str2, bArr, th);
            }
        }
        if (bArr != null && (length = bArr.length) > 10000) {
            sExecutor.execute(new Runnable() { // from class: com.bytedance.keva.KevaImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    com_bytedance_keva_KevaImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_bytedance_keva_KevaImpl$4__run$___twin___() {
                    KevaMonitor kevaMonitor = KevaImpl.sMonitor;
                    String str3 = KevaImpl.this.mName;
                    String str4 = str2;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("value too big, size=");
                    LIZ.append(length);
                    kevaMonitor.reportWarning(3, str3, str4, null, X1D.LIZIZ(LIZ));
                }

                public static void com_bytedance_keva_KevaImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                    boolean LIZ;
                    try {
                        anonymousClass4.com_bytedance_keva_KevaImpl$4__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public static Keva getAsyncKeva(final Context context, final String str, final String str2, final int i, final boolean z) {
        Callable<KevaImpl> callable = new Callable<KevaImpl>() { // from class: com.bytedance.keva.KevaImpl.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public KevaImpl call() {
                if (z) {
                    KevaImpl emptyRepoImplWithPath = KevaImpl.getEmptyRepoImplWithPath(str, str2, i, true);
                    emptyRepoImplWithPath.doPortingFromSp(context);
                    return emptyRepoImplWithPath;
                }
                KevaImpl emptyRepoImplWithPath2 = KevaImpl.getEmptyRepoImplWithPath(str, str2, i, false);
                emptyRepoImplWithPath2.init(false);
                return emptyRepoImplWithPath2;
            }
        };
        if (sIsAsyncWriteEnable && i == 0) {
            return new KevaAsyncWriter(str, str2, 0, callable, z);
        }
        return new KevaFuture(str, str2, i, callable, z);
    }

    public static void passWarning(int i, String str, String str2, Object obj, String str3) {
        sMonitor.reportWarning(i, str, str2, obj, str3);
    }
}
