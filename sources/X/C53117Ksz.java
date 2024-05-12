package X;

/* renamed from: X.Ksz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53117Ksz {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53116Ksy.LJLIL);
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;
    public static final boolean LJFF;

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int LIZ2 = LIZ();
        boolean z5 = false;
        if (1 <= LIZ2 && LIZ2 < 5) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ = z;
        if (LIZ() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZJ = z2;
        int LIZ3 = LIZ();
        if (3 <= LIZ3 && LIZ3 < 5) {
            z3 = true;
        } else {
            z3 = false;
        }
        LIZLLL = z3;
        if (LIZ() == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        LJ = z4;
        if (z && !z4) {
            z5 = true;
        }
        LJFF = z5;
    }

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }
}
