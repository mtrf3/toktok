package X;

import java.lang.Thread;

/* renamed from: X.FaR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39227FaR {
    public static boolean LIZ;
    public static Thread.UncaughtExceptionHandler LIZIZ;

    public static boolean LIZ(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().getName().contains("java.lang.ArrayIndexOutOfBoundsException") || th.getMessage() == null || !th.getMessage().contains("length=0; index=1") || (stackTrace = th.getStackTrace()) == null) {
            return false;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if ("android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "collectComponentCallbacks".equals(stackTraceElement.getMethodName())) {
                C40007Fn1.LIZIZ.ensureNotReachHere(th, "BootCrashFix");
                return true;
            }
        }
        return false;
    }
}
