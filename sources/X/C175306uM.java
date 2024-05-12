package X;

/* renamed from: X.6uM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C175306uM {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C175316uN.LJLIL);
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;

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
        if (LIZ() == 1 || LIZ() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZJ = z2;
        if (LIZ() == 1 || LIZ() == 3) {
            z3 = true;
        }
        LIZLLL = z3;
    }

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }
}
