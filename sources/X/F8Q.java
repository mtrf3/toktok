package X;

/* loaded from: classes7.dex */
public final class F8Q implements InterfaceC38474F8c {
    @Override // X.InterfaceC38474F8c
    public final void registerCondition() {
    }

    @Override // X.InterfaceC38474F8c
    public final boolean LIZ(Object obj, Throwable th) {
        StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
        if (th instanceof ClassNotFoundException) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                if (stackTraceElement.getMethodName().contains("installProvider")) {
                    return true;
                }
            }
        }
        return false;
    }
}
