package X;

import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public final class F8H extends F8T {
    @Override // X.F8Y
    public final String LIZIZ() {
        return "PerformanceFinalizeFix";
    }

    @Override // X.F8T
    public final boolean LJFF() {
        return true;
    }

    @Override // X.F8Z
    public final boolean LIZ(Thread thread, Throwable th) {
        if (!(th instanceof TimeoutException)) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (stackTraceElement.getClassName().startsWith("java.lang.Daemons") && "doFinalize".equals(stackTraceElement.getMethodName())) {
                F8X.LIZ();
                return true;
            }
        }
        return false;
    }
}
