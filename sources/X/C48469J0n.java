package X;

/* renamed from: X.J0n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48469J0n {
    public static volatile C48469J0n LIZIZ;
    public C48470J0o LIZ;

    static {
        C16880lQ.LJLLJ(C48469J0n.class);
    }

    public static C48469J0n LIZ() {
        if (LIZIZ == null) {
            synchronized (C48469J0n.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C48469J0n();
                }
            }
        }
        return LIZIZ;
    }
}
