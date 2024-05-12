package com.bytedance.common.utility;

import X.AbstractC66877QMn;
import X.C66878QMo;

/* loaded from: classes12.dex */
public class Logger {
    public static int mLevel = 4;
    public static AbstractC66877QMn sLogWriter = C66878QMo.LIZ;

    public static void d(String str) {
    }

    public static void e(String str) {
    }

    public static void i(String str) {
    }

    public static void v(String str) {
    }

    public static void w(String str) {
    }

    public static boolean debug() {
        if (mLevel <= 3) {
            return true;
        }
        return false;
    }

    public static int getLogLevel() {
        return mLevel;
    }

    public static void alertErrorInfo(String str) {
        if (!debug()) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static String getSimpleClassName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static void k(String str) {
        k("Logger", str);
    }

    public static void registerLogHandler(AbstractC66877QMn abstractC66877QMn) {
        sLogWriter = abstractC66877QMn;
    }

    public static void setLogLevel(int i) {
        mLevel = i;
    }

    public static void throwException(Throwable th) {
        if (th == null || !debug()) {
        } else {
            throw new RuntimeException("Error! Now in debug, we alert to you to correct it !", th);
        }
    }

    public static void d(String str, String str2) {
        if (str2 == null) {
            return;
        }
        sLogWriter.getClass();
        if (AbstractC66877QMn.LIZ(3)) {
            sLogWriter.getClass();
        }
    }

    public static void e(String str, String str2) {
        if (str2 == null) {
            return;
        }
        sLogWriter.getClass();
        if (AbstractC66877QMn.LIZ(6)) {
            sLogWriter.getClass();
        }
    }

    public static void i(String str, String str2) {
        if (str2 == null) {
            return;
        }
        sLogWriter.getClass();
        if (AbstractC66877QMn.LIZ(4)) {
            sLogWriter.getClass();
        }
    }

    public static void k(String str, String str2) {
        sLogWriter.getClass();
        if (AbstractC66877QMn.LIZ(3)) {
            sLogWriter.getClass();
        }
    }

    public static void st(String str, int i) {
        try {
            throw new Exception();
        } catch (Exception e) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (int i2 = 1; i2 < Math.min(i, stackTrace.length); i2++) {
                getSimpleClassName(stackTrace[i2].getClassName());
                stackTrace[i2].getMethodName();
            }
        }
    }

    public static void v(String str, String str2) {
        if (str2 == null) {
            return;
        }
        sLogWriter.getClass();
        if (AbstractC66877QMn.LIZ(2)) {
            sLogWriter.getClass();
        }
    }

    public static void w(String str, String str2) {
        if (str2 == null) {
            return;
        }
        sLogWriter.getClass();
        if (AbstractC66877QMn.LIZ(5)) {
            sLogWriter.getClass();
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        sLogWriter.getClass();
        if (AbstractC66877QMn.LIZ(3)) {
            sLogWriter.getClass();
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        sLogWriter.getClass();
        if (AbstractC66877QMn.LIZ(6)) {
            sLogWriter.getClass();
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        sLogWriter.getClass();
        if (AbstractC66877QMn.LIZ(4)) {
            sLogWriter.getClass();
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        sLogWriter.getClass();
        if (AbstractC66877QMn.LIZ(2)) {
            sLogWriter.getClass();
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (str2 == null && th == null) {
            return;
        }
        sLogWriter.getClass();
        if (AbstractC66877QMn.LIZ(5)) {
            sLogWriter.getClass();
        }
    }
}
