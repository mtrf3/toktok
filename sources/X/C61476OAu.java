package X;

/* renamed from: X.OAu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61476OAu {
    public static void LIZ(String str) {
        String LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        if (C61359O6h.LJIILLIIL) {
            StackTraceElement[] stackTrace = C16880lQ.LLLLIIIILLL().getStackTrace();
            for (int i = 1; i < stackTrace.length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                String className = stackTraceElement.getClassName();
                if (!className.equals(C16880lQ.LJLLILLLL(Thread.class)) && !className.equals(C16880lQ.LJLLILLLL(C61476OAu.class))) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("(");
                    LIZ2.append(stackTraceElement.getFileName());
                    LIZ2.append(":");
                    LIZ2.append(stackTraceElement.getLineNumber());
                    LIZ2.append(")#");
                    LIZ2.append(stackTraceElement.getMethodName());
                    LIZ2.append(". ");
                    LIZIZ = X1D.LIZIZ(LIZ2);
                    break;
                }
            }
        }
        LIZIZ = "";
        C0MT.LJ(LIZ, LIZIZ, str, LIZ);
    }
}
