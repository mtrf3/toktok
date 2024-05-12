package com.ss.ttlivestreamer.core.utils;

import X.InterfaceC65784Pro;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DebugLogUtils {
    public static final DebugLogUtils INSTANCE = new DebugLogUtils();
    public static boolean isDebugLogEnabled;

    public static final boolean isEnableDebugLog() {
        if (isDebugLogEnabled && TTLSBuildConfig.isDebug()) {
            return true;
        }
        return false;
    }

    public static final void log(InterfaceC65784Pro<? extends Object> log) {
        o.LJIIJ(log, "log");
        if (isDebugLogEnabled) {
            log.invoke();
        }
    }

    public static final void setIsEnableDebugLog(boolean z) {
        isDebugLogEnabled = z;
    }
}
