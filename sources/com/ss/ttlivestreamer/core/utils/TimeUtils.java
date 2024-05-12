package com.ss.ttlivestreamer.core.utils;

import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;

/* loaded from: classes12.dex */
public class TimeUtils {
    public static int sLocalTimeGapWithServerMSec;

    static {
        MediaEngineFactory.nativeGetVersion();
    }

    public static native long nativeNanoTime();

    public static native long nativeTimeUTCMicros();

    public static long currentTimeMs() {
        return nativeNanoTime() / 1000000;
    }

    public static long getServerTimeMSec() {
        return System.currentTimeMillis() + sLocalTimeGapWithServerMSec;
    }

    public static long nanoTime() {
        return nativeNanoTime();
    }

    public static long timeUTCMicros() {
        return nativeTimeUTCMicros();
    }

    public static void setLocalTimeGapWithServer(int i) {
        sLocalTimeGapWithServerMSec = i;
    }
}
