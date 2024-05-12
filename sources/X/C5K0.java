package X;

/* renamed from: X.5K0 */
/* loaded from: classes3.dex */
public final class C5K0 {
    public static boolean LIZ;

    public static /* synthetic */ boolean LIZIZ() {
        return LIZ(2);
    }

    public static final synchronized boolean LIZ(int i) {
        synchronized (C5K0.class) {
            if (i < 0) {
                return false;
            }
            try {
                if (!LIZ) {
                    com.bytedance.ies.nleeditor.NLE.INSTANCE.loadNLELibrary(true);
                    LIZ = true;
                }
                try {
                    C5N8.LIZJ.LIZ();
                } catch (Throwable th) {
                    C5NP LIZLLL = C82891Wg3.LIZLLL();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("NLESoLoader load NLEMediaPublic failed, ");
                    LIZ2.append(android.util.Log.getStackTraceString(th));
                    LIZLLL.LIZ(X1D.LIZIZ(LIZ2));
                }
                return true;
            } catch (Throwable th2) {
                if (i != 0) {
                    C5NP LIZLLL2 = C82891Wg3.LIZLLL();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("NLESoLoader loadNLESo error: ");
                    LIZ3.append(th2.getMessage());
                    LIZ3.append(' ');
                    LIZ3.append(android.util.Log.getStackTraceString(th2));
                    LIZ3.append(" remaining retry count: ");
                    LIZ3.append(i);
                    LIZLLL2.LIZ(X1D.LIZIZ(LIZ3));
                    return LIZ(i - 1);
                }
                throw th2;
            }
        }
    }
}
