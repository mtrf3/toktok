package com.ss.ttlivestreamer.core.utils;

/* loaded from: classes6.dex */
public class TTLSBuildConfig {
    public static boolean canThrowException;
    public static boolean isDebug;

    public static boolean canThrowException() {
        if (isDebug && canThrowException) {
            return true;
        }
        return false;
    }

    public static boolean isDebug() {
        return isDebug;
    }

    public static void setDebug(boolean z) {
        isDebug = z;
    }

    public static void setThrowExceptionEnable(boolean z) {
        canThrowException = z;
    }
}
