package X;

/* loaded from: classes7.dex */
public final class F8L extends F8T {
    public static boolean LIZ;

    @Override // X.F8Y
    public final String LIZIZ() {
        return "ActivityTrimMemoryExceptionPlugin";
    }

    @Override // X.F8T
    public final boolean LJFF() {
        return true;
    }

    @Override // X.F8Z
    public final boolean LIZ(Thread thread, Throwable th) {
        if (th instanceof ArrayIndexOutOfBoundsException) {
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if ("android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "handleTrimMemory".equals(stackTraceElement.getMethodName())) {
                    LIZ = true;
                    return true;
                }
            }
        }
        return false;
    }
}
