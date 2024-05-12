package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.1pj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45031pj extends AbstractC39241gO {
    public final C39231gN LJIIJ;
    public AnonymousClass290 LJIIJJI;

    @Override // X.AbstractC39241gO
    public final void LJFF() {
        this.LIZJ = null;
        this.LJII.LIZJ();
        this.LJIIIIZZ.LIZJ();
        this.LJIIJ.LIZJ();
        this.LJ.LIZJ();
        this.LJI = false;
    }

    public final void LJIIL() {
        this.LJI = false;
        this.LJII.LIZJ();
        this.LJII.LJIIIZ = false;
        this.LJIIIIZZ.LIZJ();
        this.LJIIIIZZ.LJIIIZ = false;
        this.LJIIJ.LIZJ();
        this.LJIIJ.LJIIIZ = false;
        this.LJ.LJIIIZ = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028a  */
    /* JADX WARN: Type inference failed for: r0v216, types: [X.290] */
    @Override // X.AbstractC39241gO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instructions count: 1095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45031pj.LIZLLL():void");
    }

    @Override // X.AbstractC39241gO
    public final void LJ() {
        C39231gN c39231gN = this.LJII;
        if (c39231gN.LJIIIZ) {
            this.LIZIZ.mY = c39231gN.LJI;
        }
    }

    @Override // X.AbstractC39241gO
    public final boolean LJIIJ() {
        if (this.LIZLLL != EnumC018105h.MATCH_CONSTRAINT || this.LIZIZ.mMatchConstraintDefaultHeight == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VerticalRun ");
        LIZ.append(this.LIZIZ.mDebugName);
        return X1D.LIZIZ(LIZ);
    }

    public C45031pj(C018205i c018205i) {
        super(c018205i);
        C39231gN c39231gN = new C39231gN(this);
        this.LJIIJ = c39231gN;
        this.LJIIJJI = null;
        this.LJII.LJ = C16D.TOP;
        this.LJIIIIZZ.LJ = C16D.BOTTOM;
        c39231gN.LJ = C16D.BASELINE;
        this.LJFF = 1;
    }

    @Override // X.AbstractC39241gO, X.C16B
    public final void LIZ(C16B c16b) {
        float f;
        float f2;
        float f3;
        int i;
        if (this.LJIIIZ.ordinal() != 3) {
            C44991pf c44991pf = this.LJ;
            if (c44991pf.LIZJ && !c44991pf.LJIIIZ && this.LIZLLL == EnumC018105h.MATCH_CONSTRAINT) {
                C018205i c018205i = this.LIZIZ;
                int i2 = c018205i.mMatchConstraintDefaultHeight;
                if (i2 != 2) {
                    if (i2 == 3) {
                        C44991pf c44991pf2 = c018205i.horizontalRun.LJ;
                        if (c44991pf2.LJIIIZ) {
                            int i3 = c018205i.mDimensionRatioSide;
                            if (i3 != -1) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        i = 0;
                                        c44991pf.LIZLLL(i);
                                    } else {
                                        f = c44991pf2.LJI;
                                        f2 = c018205i.mDimensionRatio;
                                    }
                                } else {
                                    f3 = c44991pf2.LJI * c018205i.mDimensionRatio;
                                    i = (int) (f3 + 0.5f);
                                    c44991pf.LIZLLL(i);
                                }
                            } else {
                                f = c44991pf2.LJI;
                                f2 = c018205i.mDimensionRatio;
                            }
                            f3 = f / f2;
                            i = (int) (f3 + 0.5f);
                            c44991pf.LIZLLL(i);
                        }
                    }
                } else {
                    C018205i c018205i2 = c018205i.mParent;
                    if (c018205i2 != null) {
                        if (c018205i2.verticalRun.LJ.LJIIIZ) {
                            c44991pf.LIZLLL((int) ((r2.LJI * c018205i.mMatchConstraintPercentHeight) + 0.5f));
                        }
                    }
                }
            }
            C39231gN c39231gN = this.LJII;
            if (c39231gN.LIZJ) {
                C39231gN c39231gN2 = this.LJIIIIZZ;
                if (!c39231gN2.LIZJ) {
                    return;
                }
                if (c39231gN.LJIIIZ && c39231gN2.LJIIIZ && this.LJ.LJIIIZ) {
                    return;
                }
                if (!this.LJ.LJIIIZ && this.LIZLLL == EnumC018105h.MATCH_CONSTRAINT) {
                    C018205i c018205i3 = this.LIZIZ;
                    if (c018205i3.mMatchConstraintDefaultWidth == 0 && !c018205i3.isInVerticalChain()) {
                        C39231gN c39231gN3 = (C39231gN) ListProtector.get(this.LJII.LJIIJJI, 0);
                        C39231gN c39231gN4 = (C39231gN) ListProtector.get(this.LJIIIIZZ.LJIIJJI, 0);
                        int i4 = c39231gN3.LJI;
                        C39231gN c39231gN5 = this.LJII;
                        int i5 = i4 + c39231gN5.LJFF;
                        int i6 = c39231gN4.LJI + this.LJIIIIZZ.LJFF;
                        c39231gN5.LIZLLL(i5);
                        this.LJIIIIZZ.LIZLLL(i6);
                        this.LJ.LIZLLL(i6 - i5);
                        return;
                    }
                }
                if (!this.LJ.LJIIIZ && this.LIZLLL == EnumC018105h.MATCH_CONSTRAINT && this.LIZ == 1 && ((ArrayList) this.LJII.LJIIJJI).size() > 0 && ((ArrayList) this.LJIIIIZZ.LJIIJJI).size() > 0) {
                    C39231gN c39231gN6 = (C39231gN) ListProtector.get(this.LJII.LJIIJJI, 0);
                    int i7 = (((C39231gN) ListProtector.get(this.LJIIIIZZ.LJIIJJI, 0)).LJI + this.LJIIIIZZ.LJFF) - (c39231gN6.LJI + this.LJII.LJFF);
                    C44991pf c44991pf3 = this.LJ;
                    int i8 = c44991pf3.LJIIL;
                    if (i7 < i8) {
                        c44991pf3.LIZLLL(i7);
                    } else {
                        c44991pf3.LIZLLL(i8);
                    }
                }
                if (!this.LJ.LJIIIZ || ((ArrayList) this.LJII.LJIIJJI).size() <= 0 || ((ArrayList) this.LJIIIIZZ.LJIIJJI).size() <= 0) {
                    return;
                }
                C39231gN c39231gN7 = (C39231gN) ListProtector.get(this.LJII.LJIIJJI, 0);
                C39231gN c39231gN8 = (C39231gN) ListProtector.get(this.LJIIIIZZ.LJIIJJI, 0);
                int i9 = c39231gN7.LJI;
                C39231gN c39231gN9 = this.LJII;
                int i10 = c39231gN9.LJFF + i9;
                int i11 = c39231gN8.LJI;
                int i12 = this.LJIIIIZZ.LJFF + i11;
                float f4 = this.LIZIZ.mVerticalBiasPercent;
                if (c39231gN7 == c39231gN8) {
                    f4 = 0.5f;
                } else {
                    i9 = i10;
                    i11 = i12;
                }
                c39231gN9.LIZLLL((int) ((((i11 - i9) - this.LJ.LJI) * f4) + i9 + 0.5f));
                this.LJIIIIZZ.LIZLLL(this.LJII.LJI + this.LJ.LJI);
                return;
            }
            return;
        }
        C018205i c018205i4 = this.LIZIZ;
        LJIIJJI(c018205i4.mTop, c018205i4.mBottom, 1);
    }
}
