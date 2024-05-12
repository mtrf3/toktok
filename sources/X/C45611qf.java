package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.1qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45611qf extends C40071hj {
    public int LJJIFFI;
    public int LJJII;
    public int LJJIIJZLJL;
    public int LJJIIZI;
    public C018205i[] LJJIJL;
    public int LJIILIIL = -1;
    public int LJIILJJIL = -1;
    public int LJIILL = -1;
    public int LJIILLIIL = -1;
    public int LJIIZILJ = -1;
    public int LJIJ = -1;
    public float LJIJI = 0.5f;
    public float LJIJJ = 0.5f;
    public float LJIJJLI = 0.5f;
    public float LJIL = 0.5f;
    public float LJJ = 0.5f;
    public float LJJI = 0.5f;
    public int LJJIII = 2;
    public int LJJIIJ = 2;
    public int LJJIIZ = -1;
    public final ArrayList<C018305j> LJJIJ = new ArrayList<>();
    public C018205i[] LJJIJIIJI = null;
    public C018205i[] LJJIJIIJIL = null;
    public int[] LJJIJIL = null;
    public int LJJIJLIJ = 0;

    public final int LJI(C018205i c018205i, int i) {
        if (c018205i == null) {
            return 0;
        }
        if (c018205i.getVerticalDimensionBehaviour() == EnumC018105h.MATCH_CONSTRAINT) {
            int i2 = c018205i.mMatchConstraintDefaultHeight;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c018205i.mMatchConstraintPercentHeight * i);
                if (i3 != c018205i.getHeight()) {
                    c018205i.mMeasureRequested = true;
                    LJFF(c018205i, c018205i.getHorizontalDimensionBehaviour(), c018205i.getWidth(), EnumC018105h.FIXED, i3);
                }
                return i3;
            }
            if (i2 == 1) {
                return c018205i.getHeight();
            }
            if (i2 == 3) {
                return (int) ((c018205i.getWidth() * c018205i.mDimensionRatio) + 0.5f);
            }
        }
        return c018205i.getHeight();
    }

    public final int LJII(C018205i c018205i, int i) {
        if (c018205i == null) {
            return 0;
        }
        if (c018205i.getHorizontalDimensionBehaviour() == EnumC018105h.MATCH_CONSTRAINT) {
            int i2 = c018205i.mMatchConstraintDefaultWidth;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c018205i.mMatchConstraintPercentWidth * i);
                if (i3 != c018205i.getWidth()) {
                    c018205i.mMeasureRequested = true;
                    LJFF(c018205i, EnumC018105h.FIXED, i3, c018205i.getVerticalDimensionBehaviour(), c018205i.getHeight());
                }
                return i3;
            }
            if (i2 == 1) {
                return c018205i.getWidth();
            }
            if (i2 == 3) {
                return (int) ((c018205i.getHeight() * c018205i.mDimensionRatio) + 0.5f);
            }
        }
        return c018205i.getWidth();
    }

    @Override // X.C018205i
    public final void addToSolver(C14Z c14z, boolean z) {
        boolean z2;
        boolean z3;
        C018205i c018205i;
        int i;
        super.addToSolver(c14z, z);
        C018205i c018205i2 = this.mParent;
        if (c018205i2 != null) {
            z2 = ((C40061hi) c018205i2).LJ;
        } else {
            z2 = false;
        }
        int i2 = this.LJJIIJZLJL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2 && this.LJJIJIL != null && this.LJJIJIIJIL != null && this.LJJIJIIJI != null) {
                    for (int i3 = 0; i3 < this.LJJIJLIJ; i3++) {
                        this.LJJIJL[i3].resetAnchors();
                    }
                    int[] iArr = this.LJJIJIL;
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    C018205i c018205i3 = null;
                    for (int i6 = 0; i6 < i4; i6++) {
                        if (z2) {
                            i = (i4 - i6) - 1;
                        } else {
                            i = i6;
                        }
                        C018205i c018205i4 = this.LJJIJIIJIL[i];
                        if (c018205i4 != null && c018205i4.mVisibility != 8) {
                            if (i6 == 0) {
                                c018205i4.connect(c018205i4.mLeft, this.mLeft, this.LJI);
                                c018205i4.mHorizontalChainStyle = this.LJIILIIL;
                                c018205i4.mHorizontalBiasPercent = this.LJIJI;
                            }
                            if (i6 == i4 - 1) {
                                c018205i4.connect(c018205i4.mRight, this.mRight, this.LJII);
                            }
                            if (i6 > 0) {
                                c018205i4.connect(c018205i4.mLeft, c018205i3.mRight, this.LJJIFFI);
                                c018205i3.connect(c018205i3.mRight, c018205i4.mLeft, 0);
                            }
                            c018205i3 = c018205i4;
                        }
                    }
                    for (int i7 = 0; i7 < i5; i7++) {
                        C018205i c018205i5 = this.LJJIJIIJI[i7];
                        if (c018205i5 != null && c018205i5.mVisibility != 8) {
                            if (i7 == 0) {
                                c018205i5.connect(c018205i5.mTop, this.mTop, this.LIZJ);
                                c018205i5.mVerticalChainStyle = this.LJIILJJIL;
                                c018205i5.mVerticalBiasPercent = this.LJIJJ;
                            }
                            if (i7 == i5 - 1) {
                                c018205i5.connect(c018205i5.mBottom, this.mBottom, this.LIZLLL);
                            }
                            if (i7 > 0) {
                                c018205i5.connect(c018205i5.mTop, c018205i3.mBottom, this.LJJII);
                                c018205i3.connect(c018205i3.mBottom, c018205i5.mTop, 0);
                            }
                            c018205i3 = c018205i5;
                        }
                    }
                    for (int i8 = 0; i8 < i4; i8++) {
                        for (int i9 = 0; i9 < i5; i9++) {
                            int i10 = (i9 * i4) + i8;
                            if (this.LJJIIZI == 1) {
                                i10 = (i8 * i5) + i9;
                            }
                            C018205i[] c018205iArr = this.LJJIJL;
                            if (i10 < c018205iArr.length && (c018205i = c018205iArr[i10]) != null && c018205i.mVisibility != 8) {
                                C018205i c018205i6 = this.LJJIJIIJIL[i8];
                                C018205i c018205i7 = this.LJJIJIIJI[i9];
                                if (c018205i != c018205i6) {
                                    c018205i.connect(c018205i.mLeft, c018205i6.mLeft, 0);
                                    c018205i.connect(c018205i.mRight, c018205i6.mRight, 0);
                                }
                                if (c018205i != c018205i7) {
                                    c018205i.connect(c018205i.mTop, c018205i7.mTop, 0);
                                    c018205i.connect(c018205i.mBottom, c018205i7.mBottom, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size = this.LJJIJ.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C018305j c018305j = (C018305j) ListProtector.get(this.LJJIJ, i11);
                    if (i11 == size - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c018305j.LIZIZ(i11, z2, z3);
                }
            }
        } else if (this.LJJIJ.size() > 0) {
            ((C018305j) ListProtector.get(this.LJJIJ, 0)).LIZIZ(0, z2, true);
        }
        this.LJIIIIZZ = false;
    }

    @Override // X.C1AD, X.C018205i
    public final void copy(C018205i c018205i, HashMap<C018205i, C018205i> hashMap) {
        super.copy(c018205i, hashMap);
        C45611qf c45611qf = (C45611qf) c018205i;
        this.LJIILIIL = c45611qf.LJIILIIL;
        this.LJIILJJIL = c45611qf.LJIILJJIL;
        this.LJIILL = c45611qf.LJIILL;
        this.LJIILLIIL = c45611qf.LJIILLIIL;
        this.LJIIZILJ = c45611qf.LJIIZILJ;
        this.LJIJ = c45611qf.LJIJ;
        this.LJIJI = c45611qf.LJIJI;
        this.LJIJJ = c45611qf.LJIJJ;
        this.LJIJJLI = c45611qf.LJIJJLI;
        this.LJIL = c45611qf.LJIL;
        this.LJJ = c45611qf.LJJ;
        this.LJJI = c45611qf.LJJI;
        this.LJJIFFI = c45611qf.LJJIFFI;
        this.LJJII = c45611qf.LJJII;
        this.LJJIII = c45611qf.LJJIII;
        this.LJJIIJ = c45611qf.LJJIIJ;
        this.LJJIIJZLJL = c45611qf.LJJIIJZLJL;
        this.LJJIIZ = c45611qf.LJJIIZ;
        this.LJJIIZI = c45611qf.LJJIIZI;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0134  */
    @Override // X.C40071hj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 1263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45611qf.LJ(int, int, int, int):void");
    }
}
