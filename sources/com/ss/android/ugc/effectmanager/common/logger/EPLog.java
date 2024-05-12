package com.ss.android.ugc.effectmanager.common.logger;

import X.C00F;
import X.C025908h;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class EPLog {
    public static final EPLog INSTANCE = new EPLog();
    public static ILogger sLogger = DefaultLogger.INSTANCE;
    public static boolean sEnableLog = true;
    public static String sdkTag = "EffectPlatform";

    public final boolean getSEnableLog() {
        return sEnableLog;
    }

    public static final void addSDKTagString(String str) {
        sdkTag = C00F.LIZIZ(sdkTag, '-', str);
    }

    private final String getSDKTag(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(sdkTag);
        LIZ.append('#');
        LIZ.append(str);
        LIZ.append("]:");
        return X1D.LIZIZ(LIZ);
    }

    public static final void setEnableLog(boolean z) {
        sEnableLog = z;
    }

    public static final void setLogger(ILogger logger) {
        o.LJIIJ(logger, "logger");
        sLogger = logger;
    }

    public final void setSEnableLog(boolean z) {
        sEnableLog = z;
    }

    public static final void d(String tag, String msg) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(msg, "msg");
        ILogger iLogger = sLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(INSTANCE.getSDKTag(tag));
        LIZ.append("  ");
        LIZ.append(msg);
        iLogger.d(X1D.LIZIZ(LIZ));
    }

    public static final void e(String tag, String str) {
        o.LJIIJ(tag, "tag");
        ILogger iLogger = sLogger;
        StringBuilder LIZ = X1D.LIZ();
        iLogger.e(C025908h.LIZIZ(LIZ, INSTANCE.getSDKTag(tag), "  ", str, LIZ), null);
    }

    public static final void i(String tag, String msg) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(msg, "msg");
        ILogger iLogger = sLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(INSTANCE.getSDKTag(tag));
        LIZ.append("  ");
        LIZ.append(msg);
        iLogger.i(X1D.LIZIZ(LIZ));
    }

    public static final void w(String tag, String msg) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(msg, "msg");
        ILogger iLogger = sLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(INSTANCE.getSDKTag(tag));
        LIZ.append("  ");
        LIZ.append(msg);
        iLogger.w(X1D.LIZIZ(LIZ));
    }

    public static final void e(String tag, String str, Throwable th) {
        o.LJIIJ(tag, "tag");
        ILogger iLogger = sLogger;
        StringBuilder LIZ = X1D.LIZ();
        iLogger.e(C025908h.LIZIZ(LIZ, INSTANCE.getSDKTag(tag), "  ", str, LIZ), th);
    }
}
