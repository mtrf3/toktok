package com.ss.ttlivestreamer.core.utils;

import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class LogUtil {
    public static final LogUtil INSTANCE = new LogUtil();
    public static boolean logFilterSwitch = true;

    public static final boolean logFilterSwitch() {
        if (logFilterSwitch || DebugLogUtils.isEnableDebugLog()) {
            return true;
        }
        return false;
    }

    public static final void setLogFilterSwitch(boolean z) {
        if (!z) {
            AVLog.disableLogFile(true);
            AVLog.disableLogIODevice(true);
        }
        DebugLogUtils.isEnableDebugLog();
        logFilterSwitch = z;
    }

    public static final void d(String tag, String... str) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(str, "str");
        if (logFilterSwitch()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            AVLog.d(tag, X1D.LIZIZ(LIZ));
        }
    }

    public static final void i(String tag, String... str) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(str, "str");
        if (logFilterSwitch()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            AVLog.i(tag, X1D.LIZIZ(LIZ));
        }
    }

    public static final void w(String tag, String... str) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(str, "str");
        if (logFilterSwitch()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            AVLog.w(tag, X1D.LIZIZ(LIZ));
        }
    }

    public static final void androidLog(int i, String str, String... strArr) {
        if (!DebugLogUtils.isEnableDebugLog()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArr) {
            sb.append(str2);
        }
        o.LJFF(sb.toString(), "StringBuilder().also {\n …   }\n        }.toString()");
    }

    public static final void e(String tag, String[] str, Exception exception) {
        o.LJIIJ(tag, "tag");
        o.LJIIJ(str, "str");
        o.LJIIJ(exception, "exception");
        if (logFilterSwitch()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            AVLog.e(tag, X1D.LIZIZ(LIZ));
        }
    }
}
