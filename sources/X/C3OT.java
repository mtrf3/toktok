package X;

/* renamed from: X.3OT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3OT {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C3OU.LJLIL);
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;

    static {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (LIZ() == 1 || LIZ() == 4) {
            z = true;
        } else {
            z = false;
        }
        LIZIZ = z;
        if (LIZ() == 2 || LIZ() == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZJ = z2;
        if (LIZ() >= 3) {
            z3 = true;
        }
        LIZLLL = z3;
    }

    public static int LIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }
}