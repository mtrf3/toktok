package X;

/* renamed from: X.Ltb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55703Ltb {
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;

    static {
        boolean z;
        boolean z2;
        boolean z3;
        FFL.LJIIIZ().getClass();
        boolean z4 = true;
        int LJIIJ = FFL.LJIIJ(31744, 6, "zl_profile_opt_preload", true);
        if ((LJIIJ & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ = z;
        if ((LJIIJ & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZIZ = z2;
        if ((LJIIJ & 8) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        LIZJ = z3;
        if ((LJIIJ & 16) == 0) {
            z4 = false;
        }
        LIZLLL = z4;
    }
}
