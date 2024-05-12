package com.ss.ttlivestreamer.core.utils;

/* loaded from: classes12.dex */
public class TTLSPreInitBusinessHelper {
    public static void onLeavePreViewPage() {
        TTLSPreInitBusiness.getInstance().destroyPreInitInfos(null);
    }

    public static void preInitAllThreads() {
        TTLSPreInitBusiness.getInstance().preInitAllThreads();
    }

    public static void preInitLiveCore(Runnable runnable) {
        TTLSPreInitBusiness.getInstance().preInitLiveCore(runnable);
    }
}
