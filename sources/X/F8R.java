package X;

/* loaded from: classes7.dex */
public final class F8R extends F8T {
    @Override // X.F8Y
    public final String LIZIZ() {
        return "SecurityExceptionPlugin";
    }

    @Override // X.F8T
    public final boolean LJFF() {
        return true;
    }

    @Override // X.F8Z
    public final boolean LIZ(Thread thread, Throwable th) {
        if (th instanceof SecurityException) {
            for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                if ("com.google.android.gms.common.internal.BaseGmsClient".equals(stackTraceElement.getClassName()) && "a".equals(stackTraceElement.getMethodName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
