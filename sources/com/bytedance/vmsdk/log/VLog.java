package com.bytedance.vmsdk.log;

import X.C1FP;
import X.C39137FXp;
import android.os.Build;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;

/* loaded from: classes7.dex */
public class VLog {
    public static long alogNativePtr = 0;
    public static int[] sNativeLevelMap = null;
    public static int sNativeMinLogLevel = 6;
    public static int sTryCounts;

    public static native void nativeInitALogNative(long j, boolean z);

    public static native void nativeInternalLog(int i, String str, String str2);

    public static native void nativeSetNativeMinLogLevel(int i);

    public static void onEnvReady() {
        setMinimumLoggingLevel(4);
    }

    public static void initNativeLogLevelMap() {
        if (sNativeLevelMap == null) {
            sNativeLevelMap = r4;
            int[] iArr = {0, 0, -1, 0, 0, 1, 2, 3};
        }
    }

    public static boolean detectALogDependence() {
        long LJIIJ = C1FP.LJIIJ();
        if (LJIIJ != 0) {
            initALog(LJIIJ);
            return true;
        }
        int i = sTryCounts + 1;
        sTryCounts = i;
        if (i == 120) {
            return true;
        }
        return false;
    }

    public static void init() {
        try {
            onEnvReady();
            long LJIIJ = C1FP.LJIIJ();
            if (LJIIJ != 0) {
                initALog(LJIIJ);
            }
        } catch (Throwable unused) {
        }
    }

    public static void loadALogDependency() {
        if (!detectALogDependence()) {
            new PthreadTimer("msdk/log/VLog").schedule(new C39137FXp(), 0L, 500L);
        }
    }

    public static long getALogPtr() {
        return alogNativePtr;
    }

    public static void initALogLazy() {
        loadALogDependency();
    }

    public static void initALog(long j) {
        boolean z;
        if (Build.VERSION.SDK_INT > 24) {
            z = true;
        } else {
            z = false;
        }
        alogNativePtr = j;
        nativeInitALogNative(j, z);
    }

    public static void setMinimumLoggingLevel(int i) {
        try {
            initNativeLogLevelMap();
            nativeSetNativeMinLogLevel(sNativeLevelMap[i]);
            if (sNativeMinLogLevel != i) {
                sNativeMinLogLevel = i;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            sNativeMinLogLevel = 6;
            nativeSetNativeMinLogLevel(sNativeLevelMap[6]);
        }
    }

    public static void d(String str, String str2) {
        try {
            nativeInternalLog(3, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void e(String str, String str2) {
        try {
            nativeInternalLog(6, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void i(String str, String str2) {
        try {
            nativeInternalLog(4, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void v(String str, String str2) {
        try {
            nativeInternalLog(2, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void w(String str, String str2) {
        try {
            nativeInternalLog(5, str, str2);
        } catch (Throwable unused) {
        }
    }

    public static void internalLog(int i, String str, String str2) {
        try {
            nativeInternalLog(i, str, str2);
        } catch (Throwable unused) {
        }
    }
}
