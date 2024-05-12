package X;

/* renamed from: X.8r7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224258r7 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C224278r9.LJLIL);
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;
    public static final boolean LJFF;
    public static final boolean LJI;
    public static final boolean LJII;

    static {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (LIZ() != 0) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ = z;
        if (LIZ() == 7) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZJ = z2;
        LIZLLL = C47261Igj.LJJIJIIJI(1, 2, 3, 4, 5, 6).contains(Integer.valueOf(LIZ()));
        LJ = C47261Igj.LJJIJIIJI(2, 4, 5, 6).contains(Integer.valueOf(LIZ()));
        LJFF = C47261Igj.LJJIJIIJI(3, 4, 5, 6).contains(Integer.valueOf(LIZ()));
        LJI = C47261Igj.LJJIJIIJI(5, 6).contains(Integer.valueOf(LIZ()));
        if (LIZ() == 6) {
            z3 = true;
        }
        LJII = z3;
    }

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }
}
