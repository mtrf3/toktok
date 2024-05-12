package X;

import defpackage.i0;
import java.util.HashMap;

/* renamed from: X.1hh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40051hh extends C1AD {
    public int LIZJ;
    public boolean LIZLLL = true;
    public int LJ;
    public boolean LJFF;

    public final boolean LJ() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.LIZIZ;
            if (i4 >= i) {
                break;
            }
            C018205i c018205i = this.LIZ[i4];
            if ((this.LIZLLL || c018205i.allowedInBarrier()) && ((((i2 = this.LIZJ) == 0 || i2 == 1) && !c018205i.isResolvedHorizontally()) || (((i3 = this.LIZJ) == 2 || i3 == 3) && !c018205i.isResolvedVertically()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.LIZIZ; i6++) {
            C018205i c018205i2 = this.LIZ[i6];
            if (this.LIZLLL || c018205i2.allowedInBarrier()) {
                if (!z2) {
                    int i7 = this.LIZJ;
                    if (i7 == 0) {
                        i5 = c018205i2.getAnchor(EnumC017805e.LEFT).LIZLLL();
                    } else if (i7 == 1) {
                        i5 = c018205i2.getAnchor(EnumC017805e.RIGHT).LIZLLL();
                    } else if (i7 == 2) {
                        i5 = c018205i2.getAnchor(EnumC017805e.TOP).LIZLLL();
                    } else if (i7 == 3) {
                        i5 = c018205i2.getAnchor(EnumC017805e.BOTTOM).LIZLLL();
                    }
                    z2 = true;
                }
                int i8 = this.LIZJ;
                if (i8 == 0) {
                    i5 = Math.min(i5, c018205i2.getAnchor(EnumC017805e.LEFT).LIZLLL());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, c018205i2.getAnchor(EnumC017805e.RIGHT).LIZLLL());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, c018205i2.getAnchor(EnumC017805e.TOP).LIZLLL());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, c018205i2.getAnchor(EnumC017805e.BOTTOM).LIZLLL());
                }
            }
        }
        int i9 = i5 + this.LJ;
        int i10 = this.LIZJ;
        if (i10 == 0 || i10 == 1) {
            setFinalHorizontal(i9, i9);
        } else {
            setFinalVertical(i9, i9);
        }
        this.LJFF = true;
        return true;
    }

    @Override // X.C018205i
    public final boolean allowedInBarrier() {
        return true;
    }

    public final int LJFF() {
        int i = this.LIZJ;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            return -1;
        }
        return 0;
    }

    @Override // X.C018205i
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Barrier] ");
        String LJFF = JBR.LJFF(LIZ, this.mDebugName, " {", LIZ);
        for (int i = 0; i < this.LIZIZ; i++) {
            C018205i c018205i = this.LIZ[i];
            if (i > 0) {
                LJFF = i0.LJFF(LJFF, ", ");
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJFF);
            LIZ2.append(c018205i.mDebugName);
            LJFF = X1D.LIZIZ(LIZ2);
        }
        return i0.LJFF(LJFF, "}");
    }

    @Override // X.C018205i
    public final boolean isResolvedHorizontally() {
        return this.LJFF;
    }

    @Override // X.C018205i
    public final boolean isResolvedVertically() {
        return this.LJFF;
    }

    @Override // X.C018205i
    public final void addToSolver(C14Z c14z, boolean z) {
        C017905f[] c017905fArr;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C017905f[] c017905fArr2 = this.mListAnchors;
        c017905fArr2[0] = this.mLeft;
        c017905fArr2[2] = this.mTop;
        c017905fArr2[1] = this.mRight;
        c017905fArr2[3] = this.mBottom;
        int i6 = 0;
        while (true) {
            c017905fArr = this.mListAnchors;
            if (i6 >= c017905fArr.length) {
                break;
            }
            C017905f c017905f = c017905fArr[i6];
            c017905f.LJIIIIZZ = c14z.LJIIJ(c017905f);
            i6++;
        }
        int i7 = this.LIZJ;
        if (i7 >= 0 && i7 < 4) {
            C017905f c017905f2 = c017905fArr[i7];
            if (!this.LJFF) {
                LJ();
            }
            if (this.LJFF) {
                this.LJFF = false;
                int i8 = this.LIZJ;
                if (i8 == 0 || i8 == 1) {
                    c14z.LIZLLL(this.mLeft.LJIIIIZZ, this.mX);
                    c14z.LIZLLL(this.mRight.LJIIIIZZ, this.mX);
                    return;
                } else {
                    if (i8 != 2 && i8 != 3) {
                        return;
                    }
                    c14z.LIZLLL(this.mTop.LJIIIIZZ, this.mY);
                    c14z.LIZLLL(this.mBottom.LJIIIIZZ, this.mY);
                    return;
                }
            }
            for (int i9 = 0; i9 < this.LIZIZ; i9++) {
                C018205i c018205i = this.LIZ[i9];
                if ((this.LIZLLL || c018205i.allowedInBarrier()) && ((((i4 = this.LIZJ) == 0 || i4 == 1) && c018205i.getHorizontalDimensionBehaviour() == EnumC018105h.MATCH_CONSTRAINT && c018205i.mLeft.LJFF != null && c018205i.mRight.LJFF != null) || (((i5 = this.LIZJ) == 2 || i5 == 3) && c018205i.getVerticalDimensionBehaviour() == EnumC018105h.MATCH_CONSTRAINT && c018205i.mTop.LJFF != null && c018205i.mBottom.LJFF != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (this.mLeft.LJI() || this.mRight.LJI()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.mTop.LJI() || this.mBottom.LJI()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z2 || ((i3 = this.LIZJ) != 0 ? i3 != 2 ? i3 != 1 ? i3 != 3 || !z4 : !z3 : !z4 : !z3)) {
                i = 4;
            } else {
                i = 5;
            }
            for (int i10 = 0; i10 < this.LIZIZ; i10++) {
                C018205i c018205i2 = this.LIZ[i10];
                if (this.LIZLLL || c018205i2.allowedInBarrier()) {
                    C270014e LJIIJ = c14z.LJIIJ(c018205i2.mListAnchors[this.LIZJ]);
                    C017905f[] c017905fArr3 = c018205i2.mListAnchors;
                    int i11 = this.LIZJ;
                    C017905f c017905f3 = c017905fArr3[i11];
                    c017905f3.LJIIIIZZ = LJIIJ;
                    C017905f c017905f4 = c017905f3.LJFF;
                    if (c017905f4 != null && c017905f4.LIZLLL == this) {
                        i2 = c017905f3.LJI;
                    } else {
                        i2 = 0;
                    }
                    if (i11 == 0 || i11 == 2) {
                        C270014e c270014e = c017905f2.LJIIIIZZ;
                        int i12 = this.LJ - i2;
                        C38731fZ LJIIJJI = c14z.LJIIJJI();
                        C270014e LJIIL = c14z.LJIIL();
                        LJIIL.LJ = 0;
                        LJIIJJI.LIZLLL(c270014e, LJIIJ, LJIIL, i12);
                        c14z.LIZJ(LJIIJJI);
                    } else {
                        C270014e c270014e2 = c017905f2.LJIIIIZZ;
                        int i13 = this.LJ + i2;
                        C38731fZ LJIIJJI2 = c14z.LJIIJJI();
                        C270014e LJIIL2 = c14z.LJIIL();
                        LJIIL2.LJ = 0;
                        LJIIJJI2.LIZJ(c270014e2, LJIIJ, LJIIL2, i13);
                        c14z.LIZJ(LJIIJJI2);
                    }
                    c14z.LJ(c017905f2.LJIIIIZZ, LJIIJ, this.LJ + i2, i);
                }
            }
            int i14 = this.LIZJ;
            if (i14 == 0) {
                c14z.LJ(this.mRight.LJIIIIZZ, this.mLeft.LJIIIIZZ, 0, 8);
                c14z.LJ(this.mLeft.LJIIIIZZ, this.mParent.mRight.LJIIIIZZ, 0, 4);
                c14z.LJ(this.mLeft.LJIIIIZZ, this.mParent.mLeft.LJIIIIZZ, 0, 0);
                return;
            }
            if (i14 == 1) {
                c14z.LJ(this.mLeft.LJIIIIZZ, this.mRight.LJIIIIZZ, 0, 8);
                c14z.LJ(this.mLeft.LJIIIIZZ, this.mParent.mLeft.LJIIIIZZ, 0, 4);
                c14z.LJ(this.mLeft.LJIIIIZZ, this.mParent.mRight.LJIIIIZZ, 0, 0);
            } else if (i14 == 2) {
                c14z.LJ(this.mBottom.LJIIIIZZ, this.mTop.LJIIIIZZ, 0, 8);
                c14z.LJ(this.mTop.LJIIIIZZ, this.mParent.mBottom.LJIIIIZZ, 0, 4);
                c14z.LJ(this.mTop.LJIIIIZZ, this.mParent.mTop.LJIIIIZZ, 0, 0);
            } else {
                if (i14 != 3) {
                    return;
                }
                c14z.LJ(this.mTop.LJIIIIZZ, this.mBottom.LJIIIIZZ, 0, 8);
                c14z.LJ(this.mTop.LJIIIIZZ, this.mParent.mTop.LJIIIIZZ, 0, 4);
                c14z.LJ(this.mTop.LJIIIIZZ, this.mParent.mBottom.LJIIIIZZ, 0, 0);
            }
        }
    }

    @Override // X.C1AD, X.C018205i
    public final void copy(C018205i c018205i, HashMap<C018205i, C018205i> hashMap) {
        super.copy(c018205i, hashMap);
        C40051hh c40051hh = (C40051hh) c018205i;
        this.LIZJ = c40051hh.LIZJ;
        this.LIZLLL = c40051hh.LIZLLL;
        this.LJ = c40051hh.LJ;
    }
}
