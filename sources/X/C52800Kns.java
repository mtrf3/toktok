package X;

/* renamed from: X.Kns, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52800Kns {
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;

    static {
        boolean z;
        boolean z2;
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(C52799Knr.LJLIL);
        boolean z3 = false;
        if (((Number) LIZIZ2.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        LIZ = z;
        if (((Number) LIZIZ2.getValue()).intValue() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZIZ = z2;
        if (((Number) LIZIZ2.getValue()).intValue() != 0) {
            z3 = true;
        }
        LIZJ = z3;
    }
}
