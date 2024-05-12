package X;

/* loaded from: classes7.dex */
public final class F8K extends F8T {
    @Override // X.F8Y
    public final String LIZIZ() {
        return "ActivityTopPositionAlreadySetPlugin";
    }

    @Override // X.F8T
    public final boolean LJFF() {
        return true;
    }

    @Override // X.F8Z
    public final boolean LIZ(Thread thread, Throwable th) {
        if (!(th instanceof IllegalStateException)) {
            return false;
        }
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if ("android.app.ActivityThread".equals(stackTraceElement.getClassName()) && "handleTopResumedActivityChanged".equals(stackTraceElement.getMethodName())) {
                return true;
            }
        }
        return false;
    }
}
