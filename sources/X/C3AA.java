package X;

/* renamed from: X.3AA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3AA {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C3AC.LJLIL);
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (LIZ() > 0) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ = z;
        if (LIZ() >= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZJ = z2;
        if (LIZ() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        LIZLLL = z3;
        if (LIZ() > 2) {
            z4 = true;
        }
        LJ = z4;
    }

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }
}
