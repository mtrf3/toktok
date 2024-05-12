package X;

/* renamed from: X.KiA, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52446KiA {
    public static final boolean LIZ;
    public static final int LIZIZ;
    public static final boolean LIZJ;

    static {
        boolean z;
        FFL.LJIIIZ().getClass();
        boolean z2 = false;
        int LJIIJ = FFL.LJIIJ(31744, 0, "detail_multi_inflater", true);
        if ((LJIIJ & 2) == 2 || (LJIIJ & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ = z;
        LIZIZ = (LJIIJ & 3) >> 1;
        if ((LJIIJ & 4) == 4) {
            z2 = true;
        }
        LIZJ = z2;
    }
}
