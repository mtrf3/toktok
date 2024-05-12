package X;

/* renamed from: X.VdR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80181VdR {
    public static final C80181VdR LIZJ;
    public static final C80181VdR LIZLLL;
    public static final C80181VdR LJ;
    public static final C80181VdR LJFF;
    public static final C80181VdR LJI;
    public static final C80181VdR[] LJII;
    public final int LIZ;
    public final boolean LIZIZ;

    static {
        C80181VdR c80181VdR = new C80181VdR(0, false);
        LIZJ = c80181VdR;
        C80181VdR c80181VdR2 = new C80181VdR(1, true);
        C80181VdR c80181VdR3 = new C80181VdR(2, false);
        LIZLLL = c80181VdR3;
        C80181VdR c80181VdR4 = new C80181VdR(3, true);
        C80181VdR c80181VdR5 = new C80181VdR(4, false);
        LJ = c80181VdR5;
        C80181VdR c80181VdR6 = new C80181VdR(5, true);
        C80181VdR c80181VdR7 = new C80181VdR(6, false);
        LJFF = c80181VdR7;
        C80181VdR c80181VdR8 = new C80181VdR(7, true);
        C80181VdR c80181VdR9 = new C80181VdR(8, false);
        C80181VdR c80181VdR10 = new C80181VdR(9, true);
        LJI = c80181VdR10;
        LJII = new C80181VdR[]{c80181VdR, c80181VdR2, c80181VdR3, c80181VdR4, c80181VdR5, c80181VdR6, c80181VdR7, c80181VdR8, c80181VdR9, c80181VdR10, new C80181VdR(10, false), new C80181VdR(10, true)};
    }

    public final boolean LIZ(C80181VdR c80181VdR) {
        int i = this.LIZ;
        int i2 = c80181VdR.LIZ;
        if (i < i2 || ((!this.LIZIZ || LJI == this) && i == i2)) {
            return true;
        }
        return false;
    }

    public C80181VdR(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
