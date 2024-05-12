package X;

/* renamed from: X.Dru, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35214Dru {
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;
    public static final boolean LJFF;
    public static final boolean LJI;

    static {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i = C34580Dhg.LIZIZ().getInt("zl_gunda_opt", 846);
        boolean z7 = false;
        if (C35810E3q.LJIIIIZZ()) {
            i = 0;
        }
        if (C36152EGu.LJ()) {
            z = ((Boolean) C33839DPv.LJ.getValue()).booleanValue();
        } else if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ = z;
        if (C36152EGu.LJ()) {
            z2 = ((Boolean) C33839DPv.LJ.getValue()).booleanValue();
        } else if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZIZ = z2;
        if ((i & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        LIZJ = z3;
        if ((i & 32) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        LIZLLL = z4;
        if ((i & 64) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        LJ = z5;
        if ((i & 256) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        LJFF = z6;
        if ((i & 512) != 0) {
            z7 = true;
        }
        LJI = z7;
    }
}
