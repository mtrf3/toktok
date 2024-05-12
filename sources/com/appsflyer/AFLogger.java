package com.appsflyer;

import X.C16880lQ;
import X.V0N;
import android.app.Application;
import android.content.SharedPreferences;
import com.appsflyer.internal.ai;
import com.appsflyer.internal.aj;
import com.appsflyer.internal.ay;

/* loaded from: classes.dex */
public final class AFLogger {
    public static final long AFKeystoreWrapper = System.currentTimeMillis();

    public static boolean valueOf() {
        return AppsFlyerProperties.getInstance().isLogsDisabledCompletely();
    }

    /* loaded from: classes.dex */
    public enum LogLevel {
        NONE(0),
        ERROR(1),
        WARNING(2),
        INFO(3),
        DEBUG(4),
        VERBOSE(5);

        public int values;

        public final int getLevel() {
            return this.values;
        }

        public static LogLevel valueOf(String str) {
            return (LogLevel) V0N.LJJJ(LogLevel.class, str);
        }

        LogLevel(int i) {
            this.values = i;
        }
    }

    public static void AFInAppEventParameterName(String str) {
        AFInAppEventParameterName(LogLevel.VERBOSE);
        aj.AFInAppEventParameterName().AFInAppEventType(null, "V", AFInAppEventParameterName(str, true));
    }

    public static void AFInAppEventType(String str) {
        AFInAppEventParameterName(LogLevel.DEBUG);
        aj.AFInAppEventParameterName().AFInAppEventType(null, "D", AFInAppEventParameterName(str, true));
    }

    public static void AFKeystoreWrapper(String str) {
        valueOf();
        aj.AFInAppEventParameterName().AFInAppEventType(null, "F", str);
    }

    public static void valueOf(Throwable th) {
        valueOf(null, th, false, false);
    }

    public static void values(String str) {
        AFInAppEventParameterName(LogLevel.WARNING);
        aj.AFInAppEventParameterName().AFInAppEventType(null, "W", AFInAppEventParameterName(str, true));
    }

    public static boolean AFInAppEventParameterName(LogLevel logLevel) {
        if (logLevel.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return true;
        }
        return false;
    }

    public static void valueOf(String str) {
        values(str, true);
    }

    public static String AFInAppEventParameterName(String str, boolean z) {
        if (str == null) {
            str = "null";
        }
        if (z || LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getInt("logLevel", LogLevel.NONE.getLevel())) {
            return "(" + (System.currentTimeMillis() - AFKeystoreWrapper) + ") [" + C16880lQ.LLLLIIIILLL().getName() + "] " + str;
        }
        return str;
    }

    public static void valueOf(String str, Throwable th) {
        valueOf(str, th, true, false);
    }

    public static void values(String str, boolean z) {
        AFInAppEventParameterName(LogLevel.INFO);
        if (z) {
            aj.AFInAppEventParameterName().AFInAppEventType(null, "I", AFInAppEventParameterName(str, true));
        }
    }

    public static void values(String str, Throwable th) {
        valueOf(str, th, true, true);
    }

    public static void valueOf(String str, Throwable th, boolean z, boolean z2) {
        String message;
        StackTraceElement[] stackTrace;
        long j;
        if (AFInAppEventParameterName(LogLevel.ERROR)) {
            if (str == null) {
                str = C16880lQ.LJLLJ(th.getClass()) + " at " + th.getStackTrace()[0].toString();
            }
            AFInAppEventParameterName(str, false);
        }
        aj AFInAppEventParameterName = aj.AFInAppEventParameterName();
        Throwable cause = th.getCause();
        String LJLLJ = C16880lQ.LJLLJ(th.getClass());
        if (cause == null) {
            message = th.getMessage();
            stackTrace = th.getStackTrace();
        } else {
            message = cause.getMessage();
            stackTrace = cause.getStackTrace();
        }
        AFInAppEventParameterName.AFInAppEventType("exception", LJLLJ, aj.AFInAppEventType(message, stackTrace));
        Application application = ay.AFKeystoreWrapper;
        if (application != null) {
            SharedPreferences.Editor edit = ai.values(application).edit();
            Application application2 = ay.AFKeystoreWrapper;
            if (application2 == null) {
                j = -1;
            } else {
                j = ai.values(application2).getLong("exception_number", 0L);
            }
            edit.putLong("exception_number", j + 1).apply();
        }
    }
}
