package X;

/* renamed from: X.5RT, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5RT {
    public int[] LIZ;
    public String[] LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public int LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public String LJIIJJI;
    public String LJIIL;
    public String LJIILIIL;
    public String LJIILJJIL;
    public int LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIIJ = "";
    public Boolean LJIJI = Boolean.FALSE;
    public boolean LJIJJ = true;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VEFilterEffectOp{mEffectIndexes=");
        C0JT.LIZLLL(this.LIZ, LIZ, ", mStartTimePoint=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mOp=");
        LIZ.append(this.LJI);
        LIZ.append(", mReverse=");
        LIZ.append(this.LJII);
        LIZ.append(", mColor=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", mResource='");
        Q89.LIZIZ(LIZ, this.LJIIJJI, '\'', ", mName='");
        Q89.LIZIZ(LIZ, this.LJIILJJIL, '\'', ", mKey='");
        return C77800Ug8.LIZJ(LIZ, this.LJIIL, '\'', '}', LIZ);
    }

    public static C5RT LIZJ(long j) {
        C5RT c5rt = new C5RT();
        c5rt.LJI = 1;
        c5rt.LIZJ = j;
        return c5rt;
    }

    public static C5RT LIZIZ(long j, String str) {
        C5RT c5rt = new C5RT();
        c5rt.LJI = 0;
        if (str == null) {
            str = "";
        }
        c5rt.LJIIJJI = str;
        c5rt.LIZJ = j;
        return c5rt;
    }

    public static C5RT LJ(int i, String str) {
        C5RT c5rt = new C5RT();
        c5rt.LJI = 7;
        c5rt.LIZ = new int[]{i};
        c5rt.LIZIZ = new String[]{str};
        return c5rt;
    }

    public static C5RT LIZLLL(int i, int i2, String str) {
        C5RT c5rt = new C5RT();
        c5rt.LJI = 2;
        c5rt.LIZ = new int[]{i};
        c5rt.LIZIZ = new String[]{str};
        c5rt.LJ = i2;
        return c5rt;
    }

    public static C5RT LIZ(int i, long j, long j2, String str, String str2) {
        C5RT c5rt = new C5RT();
        c5rt.LJI = 8;
        c5rt.LJIIJJI = str;
        c5rt.LIZJ = j;
        c5rt.LIZLLL = j2;
        c5rt.LIZ = new int[]{i};
        c5rt.LIZIZ = new String[]{str2};
        return c5rt;
    }
}
