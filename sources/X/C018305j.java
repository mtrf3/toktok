package X;

/* renamed from: X.05j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C018305j {
    public int LIZ;
    public C018205i LIZIZ;
    public int LIZJ;
    public C017905f LIZLLL;
    public C017905f LJ;
    public C017905f LJFF;
    public C017905f LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public final /* synthetic */ C45611qf LJIIZILJ;

    public final int LIZJ() {
        if (this.LIZ == 1) {
            return this.LJIIL - this.LJIIZILJ.LJJII;
        }
        return this.LJIIL;
    }

    public final int LIZLLL() {
        if (this.LIZ == 0) {
            return this.LJIIJJI - this.LJIIZILJ.LJJIFFI;
        }
        return this.LJIIJJI;
    }

    public final void LIZ(C018205i c018205i) {
        int i = 0;
        if (this.LIZ == 0) {
            int LJII = this.LJIIZILJ.LJII(c018205i, this.LJIILLIIL);
            if (c018205i.getHorizontalDimensionBehaviour() == EnumC018105h.MATCH_CONSTRAINT) {
                this.LJIILL++;
                LJII = 0;
            }
            C45611qf c45611qf = this.LJIIZILJ;
            int i2 = c45611qf.LJJIFFI;
            if (c018205i.mVisibility != 8) {
                i = i2;
            }
            this.LJIIJJI = LJII + i + this.LJIIJJI;
            int LJI = c45611qf.LJI(c018205i, this.LJIILLIIL);
            if (this.LIZIZ == null || this.LIZJ < LJI) {
                this.LIZIZ = c018205i;
                this.LIZJ = LJI;
                this.LJIIL = LJI;
            }
        } else {
            int LJII2 = this.LJIIZILJ.LJII(c018205i, this.LJIILLIIL);
            int LJI2 = this.LJIIZILJ.LJI(c018205i, this.LJIILLIIL);
            if (c018205i.getVerticalDimensionBehaviour() == EnumC018105h.MATCH_CONSTRAINT) {
                this.LJIILL++;
                LJI2 = 0;
            }
            int i3 = this.LJIIZILJ.LJJII;
            if (c018205i.mVisibility != 8) {
                i = i3;
            }
            this.LJIIL = LJI2 + i + this.LJIIL;
            if (this.LIZIZ == null || this.LIZJ < LJII2) {
                this.LIZIZ = c018205i;
                this.LIZJ = LJII2;
                this.LJIIJJI = LJII2;
            }
        }
        this.LJIILJJIL++;
    }

    public final void LJ(int i) {
        int i2 = this.LJIILL;
        if (i2 == 0) {
            return;
        }
        int i3 = this.LJIILJJIL;
        int i4 = i / i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.LJIILIIL;
            int i7 = i6 + i5;
            C45611qf c45611qf = this.LJIIZILJ;
            if (i7 >= c45611qf.LJJIJLIJ) {
                break;
            }
            C018205i c018205i = c45611qf.LJJIJL[i6 + i5];
            if (this.LIZ == 0) {
                if (c018205i != null && c018205i.getHorizontalDimensionBehaviour() == EnumC018105h.MATCH_CONSTRAINT && c018205i.mMatchConstraintDefaultWidth == 0) {
                    this.LJIIZILJ.LJFF(c018205i, EnumC018105h.FIXED, i4, c018205i.getVerticalDimensionBehaviour(), c018205i.getHeight());
                }
            } else if (c018205i != null && c018205i.getVerticalDimensionBehaviour() == EnumC018105h.MATCH_CONSTRAINT && c018205i.mMatchConstraintDefaultHeight == 0) {
                this.LJIIZILJ.LJFF(c018205i, c018205i.getHorizontalDimensionBehaviour(), c018205i.getWidth(), EnumC018105h.FIXED, i4);
            }
        }
        this.LJIIJJI = 0;
        this.LJIIL = 0;
        this.LIZIZ = null;
        this.LIZJ = 0;
        int i8 = this.LJIILJJIL;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.LJIILIIL + i9;
            C45611qf c45611qf2 = this.LJIIZILJ;
            if (i10 >= c45611qf2.LJJIJLIJ) {
                return;
            }
            C018205i c018205i2 = c45611qf2.LJJIJL[i10];
            if (this.LIZ == 0) {
                int width = c018205i2.getWidth();
                C45611qf c45611qf3 = this.LJIIZILJ;
                int i11 = c45611qf3.LJJIFFI;
                if (c018205i2.mVisibility == 8) {
                    i11 = 0;
                }
                this.LJIIJJI = width + i11 + this.LJIIJJI;
                int LJI = c45611qf3.LJI(c018205i2, this.LJIILLIIL);
                if (this.LIZIZ == null || this.LIZJ < LJI) {
                    this.LIZIZ = c018205i2;
                    this.LIZJ = LJI;
                    this.LJIIL = LJI;
                }
            } else {
                int LJII = c45611qf2.LJII(c018205i2, this.LJIILLIIL);
                int LJI2 = this.LJIIZILJ.LJI(c018205i2, this.LJIILLIIL);
                int i12 = this.LJIIZILJ.LJJII;
                if (c018205i2.mVisibility == 8) {
                    i12 = 0;
                }
                this.LJIIL = LJI2 + i12 + this.LJIIL;
                if (this.LIZIZ == null || this.LIZJ < LJII) {
                    this.LIZIZ = c018205i2;
                    this.LIZJ = LJII;
                    this.LJIIJJI = LJII;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018305j.LIZIZ(int, boolean, boolean):void");
    }

    public C018305j(C45611qf c45611qf, int i, C017905f c017905f, C017905f c017905f2, C017905f c017905f3, C017905f c017905f4, int i2) {
        this.LJIIZILJ = c45611qf;
        this.LIZ = i;
        this.LIZLLL = c017905f;
        this.LJ = c017905f2;
        this.LJFF = c017905f3;
        this.LJI = c017905f4;
        this.LJII = c45611qf.LJI;
        this.LJIIIIZZ = c45611qf.LIZJ;
        this.LJIIIZ = c45611qf.LJII;
        this.LJIIJ = c45611qf.LIZLLL;
        this.LJIILLIIL = i2;
    }

    public final void LJFF(int i, C017905f c017905f, C017905f c017905f2, C017905f c017905f3, C017905f c017905f4, int i2, int i3, int i4, int i5, int i6) {
        this.LIZ = i;
        this.LIZLLL = c017905f;
        this.LJ = c017905f2;
        this.LJFF = c017905f3;
        this.LJI = c017905f4;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = i4;
        this.LJIIJ = i5;
        this.LJIILLIIL = i6;
    }
}
