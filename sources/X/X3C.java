package X;

/* loaded from: classes16.dex */
public final class X3C {
    public static volatile X38 LIZ;
    public static volatile C84201X2v LIZIZ;

    public static X3L LIZ(boolean z) {
        if (z && C84212X3g.LJFF != null) {
            if (LIZIZ == null) {
                synchronized (X3C.class) {
                    if (LIZIZ == null) {
                        ((X3J) C84212X3g.LJFF).getClass();
                        LIZIZ = new C84201X2v();
                    }
                }
            }
            return LIZIZ;
        }
        if (LIZ == null) {
            synchronized (X3C.class) {
                if (LIZ == null) {
                    LIZ = new X38(false);
                }
            }
        }
        return LIZ;
    }
}
