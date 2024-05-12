package X;

import java.util.ArrayList;

/* renamed from: X.1pi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45021pi extends AbstractC39241gO {
    public static final int[] LJIIJ = new int[2];

    @Override // X.AbstractC39241gO
    public final void LJFF() {
        this.LIZJ = null;
        this.LJII.LIZJ();
        this.LJIIIIZZ.LIZJ();
        this.LJ.LIZJ();
        this.LJI = false;
    }

    public final void LJIILIIL() {
        this.LJI = false;
        this.LJII.LIZJ();
        this.LJII.LJIIIZ = false;
        this.LJIIIIZZ.LIZJ();
        this.LJIIIIZZ.LJIIIZ = false;
        this.LJ.LJIIIZ = false;
    }

    @Override // X.AbstractC39241gO
    public final void LIZLLL() {
        C018205i c018205i;
        C018205i c018205i2;
        C018205i c018205i3;
        C018205i c018205i4 = this.LIZIZ;
        if (c018205i4.measured) {
            this.LJ.LIZLLL(c018205i4.getWidth());
        }
        if (!this.LJ.LJIIIZ) {
            EnumC018105h horizontalDimensionBehaviour = this.LIZIZ.getHorizontalDimensionBehaviour();
            this.LIZLLL = horizontalDimensionBehaviour;
            if (horizontalDimensionBehaviour != EnumC018105h.MATCH_CONSTRAINT) {
                EnumC018105h enumC018105h = EnumC018105h.MATCH_PARENT;
                if (horizontalDimensionBehaviour == enumC018105h && (((c018205i3 = this.LIZIZ.mParent) != null && c018205i3.getHorizontalDimensionBehaviour() == EnumC018105h.FIXED) || c018205i3.getHorizontalDimensionBehaviour() == enumC018105h)) {
                    int width = (c018205i3.getWidth() - this.LIZIZ.mLeft.LJ()) - this.LIZIZ.mRight.LJ();
                    AbstractC39241gO.LIZIZ(this.LJII, c018205i3.horizontalRun.LJII, this.LIZIZ.mLeft.LJ());
                    AbstractC39241gO.LIZIZ(this.LJIIIIZZ, c018205i3.horizontalRun.LJIIIIZZ, -this.LIZIZ.mRight.LJ());
                    this.LJ.LIZLLL(width);
                    return;
                }
                if (this.LIZLLL == EnumC018105h.FIXED) {
                    this.LJ.LIZLLL(this.LIZIZ.getWidth());
                }
            }
        } else {
            EnumC018105h enumC018105h2 = this.LIZLLL;
            EnumC018105h enumC018105h3 = EnumC018105h.MATCH_PARENT;
            if (enumC018105h2 == enumC018105h3 && (((c018205i = this.LIZIZ.mParent) != null && c018205i.getHorizontalDimensionBehaviour() == EnumC018105h.FIXED) || c018205i.getHorizontalDimensionBehaviour() == enumC018105h3)) {
                AbstractC39241gO.LIZIZ(this.LJII, c018205i.horizontalRun.LJII, this.LIZIZ.mLeft.LJ());
                AbstractC39241gO.LIZIZ(this.LJIIIIZZ, c018205i.horizontalRun.LJIIIIZZ, -this.LIZIZ.mRight.LJ());
                return;
            }
        }
        C44991pf c44991pf = this.LJ;
        if (c44991pf.LJIIIZ) {
            C018205i c018205i5 = this.LIZIZ;
            if (c018205i5.measured) {
                C017905f[] c017905fArr = c018205i5.mListAnchors;
                C017905f c017905f = c017905fArr[0];
                if (c017905f.LJFF != null) {
                    if (c017905fArr[1].LJFF != null) {
                        if (c018205i5.isInHorizontalChain()) {
                            this.LJII.LJFF = this.LIZIZ.mListAnchors[0].LJ();
                            this.LJIIIIZZ.LJFF = -this.LIZIZ.mListAnchors[1].LJ();
                            return;
                        }
                        C39231gN LJII = AbstractC39241gO.LJII(this.LIZIZ.mListAnchors[0]);
                        if (LJII != null) {
                            AbstractC39241gO.LIZIZ(this.LJII, LJII, this.LIZIZ.mListAnchors[0].LJ());
                        }
                        C39231gN LJII2 = AbstractC39241gO.LJII(this.LIZIZ.mListAnchors[1]);
                        if (LJII2 != null) {
                            AbstractC39241gO.LIZIZ(this.LJIIIIZZ, LJII2, -this.LIZIZ.mListAnchors[1].LJ());
                        }
                        this.LJII.LIZIZ = true;
                        this.LJIIIIZZ.LIZIZ = true;
                        return;
                    }
                    C39231gN LJII3 = AbstractC39241gO.LJII(c017905f);
                    if (LJII3 == null) {
                        return;
                    }
                    AbstractC39241gO.LIZIZ(this.LJII, LJII3, this.LIZIZ.mListAnchors[0].LJ());
                    AbstractC39241gO.LIZIZ(this.LJIIIIZZ, this.LJII, this.LJ.LJI);
                    return;
                }
                C017905f c017905f2 = c017905fArr[1];
                if (c017905f2.LJFF != null) {
                    C39231gN LJII4 = AbstractC39241gO.LJII(c017905f2);
                    if (LJII4 == null) {
                        return;
                    }
                    AbstractC39241gO.LIZIZ(this.LJIIIIZZ, LJII4, -this.LIZIZ.mListAnchors[1].LJ());
                    AbstractC39241gO.LIZIZ(this.LJII, this.LJIIIIZZ, -this.LJ.LJI);
                    return;
                }
                if ((c018205i5 instanceof InterfaceC018505l) || c018205i5.mParent == null || c018205i5.getAnchor(EnumC017805e.CENTER).LJFF != null) {
                    return;
                }
                C018205i c018205i6 = this.LIZIZ;
                AbstractC39241gO.LIZIZ(this.LJII, c018205i6.mParent.horizontalRun.LJII, c018205i6.getX());
                AbstractC39241gO.LIZIZ(this.LJIIIIZZ, this.LJII, this.LJ.LJI);
                return;
            }
        }
        if (this.LIZLLL == EnumC018105h.MATCH_CONSTRAINT) {
            C018205i c018205i7 = this.LIZIZ;
            int i = c018205i7.mMatchConstraintDefaultWidth;
            if (i != 2) {
                if (i == 3) {
                    if (c018205i7.mMatchConstraintDefaultHeight == 3) {
                        this.LJII.LIZ = this;
                        this.LJIIIIZZ.LIZ = this;
                        C45031pj c45031pj = c018205i7.verticalRun;
                        c45031pj.LJII.LIZ = this;
                        c45031pj.LJIIIIZZ.LIZ = this;
                        c44991pf.LIZ = this;
                        if (c018205i7.isInVerticalChain()) {
                            ((ArrayList) this.LJ.LJIIJJI).add(this.LIZIZ.verticalRun.LJ);
                            ((ArrayList) this.LIZIZ.verticalRun.LJ.LJIIJ).add(this.LJ);
                            C45031pj c45031pj2 = this.LIZIZ.verticalRun;
                            c45031pj2.LJ.LIZ = this;
                            ((ArrayList) this.LJ.LJIIJJI).add(c45031pj2.LJII);
                            ((ArrayList) this.LJ.LJIIJJI).add(this.LIZIZ.verticalRun.LJIIIIZZ);
                            ((ArrayList) this.LIZIZ.verticalRun.LJII.LJIIJ).add(this.LJ);
                            ((ArrayList) this.LIZIZ.verticalRun.LJIIIIZZ.LJIIJ).add(this.LJ);
                        } else if (this.LIZIZ.isInHorizontalChain()) {
                            ((ArrayList) this.LIZIZ.verticalRun.LJ.LJIIJJI).add(this.LJ);
                            ((ArrayList) this.LJ.LJIIJ).add(this.LIZIZ.verticalRun.LJ);
                        } else {
                            ((ArrayList) this.LIZIZ.verticalRun.LJ.LJIIJJI).add(this.LJ);
                        }
                    } else {
                        C44991pf c44991pf2 = c018205i7.verticalRun.LJ;
                        ((ArrayList) c44991pf.LJIIJJI).add(c44991pf2);
                        ((ArrayList) c44991pf2.LJIIJ).add(this.LJ);
                        ((ArrayList) this.LIZIZ.verticalRun.LJII.LJIIJ).add(this.LJ);
                        ((ArrayList) this.LIZIZ.verticalRun.LJIIIIZZ.LJIIJ).add(this.LJ);
                        C44991pf c44991pf3 = this.LJ;
                        c44991pf3.LIZIZ = true;
                        ((ArrayList) c44991pf3.LJIIJ).add(this.LJII);
                        ((ArrayList) this.LJ.LJIIJ).add(this.LJIIIIZZ);
                        ((ArrayList) this.LJII.LJIIJJI).add(this.LJ);
                        ((ArrayList) this.LJIIIIZZ.LJIIJJI).add(this.LJ);
                    }
                }
            } else {
                C018205i c018205i8 = c018205i7.mParent;
                if (c018205i8 != null) {
                    C44991pf c44991pf4 = c018205i8.verticalRun.LJ;
                    ((ArrayList) c44991pf.LJIIJJI).add(c44991pf4);
                    ((ArrayList) c44991pf4.LJIIJ).add(this.LJ);
                    C44991pf c44991pf5 = this.LJ;
                    c44991pf5.LIZIZ = true;
                    ((ArrayList) c44991pf5.LJIIJ).add(this.LJII);
                    ((ArrayList) this.LJ.LJIIJ).add(this.LJIIIIZZ);
                }
            }
        }
        C018205i c018205i9 = this.LIZIZ;
        C017905f[] c017905fArr2 = c018205i9.mListAnchors;
        C017905f c017905f3 = c017905fArr2[0];
        if (c017905f3.LJFF != null) {
            if (c017905fArr2[1].LJFF != null) {
                if (c018205i9.isInHorizontalChain()) {
                    this.LJII.LJFF = this.LIZIZ.mListAnchors[0].LJ();
                    this.LJIIIIZZ.LJFF = -this.LIZIZ.mListAnchors[1].LJ();
                    return;
                }
                C39231gN LJII5 = AbstractC39241gO.LJII(this.LIZIZ.mListAnchors[0]);
                C39231gN LJII6 = AbstractC39241gO.LJII(this.LIZIZ.mListAnchors[1]);
                LJII5.LIZIZ(this);
                LJII6.LIZIZ(this);
                this.LJIIIZ = C16K.CENTER;
                return;
            }
            C39231gN LJII7 = AbstractC39241gO.LJII(c017905f3);
            if (LJII7 == null) {
                return;
            }
            AbstractC39241gO.LIZIZ(this.LJII, LJII7, this.LIZIZ.mListAnchors[0].LJ());
            LIZJ(this.LJIIIIZZ, this.LJII, 1, this.LJ);
            return;
        }
        C017905f c017905f4 = c017905fArr2[1];
        if (c017905f4.LJFF != null) {
            C39231gN LJII8 = AbstractC39241gO.LJII(c017905f4);
            if (LJII8 == null) {
                return;
            }
            AbstractC39241gO.LIZIZ(this.LJIIIIZZ, LJII8, -this.LIZIZ.mListAnchors[1].LJ());
            LIZJ(this.LJII, this.LJIIIIZZ, -1, this.LJ);
            return;
        }
        if ((c018205i9 instanceof InterfaceC018505l) || (c018205i2 = c018205i9.mParent) == null) {
            return;
        }
        AbstractC39241gO.LIZIZ(this.LJII, c018205i2.horizontalRun.LJII, c018205i9.getX());
        LIZJ(this.LJIIIIZZ, this.LJII, 1, this.LJ);
    }

    @Override // X.AbstractC39241gO
    public final void LJ() {
        C39231gN c39231gN = this.LJII;
        if (c39231gN.LJIIIZ) {
            this.LIZIZ.mX = c39231gN.LJI;
        }
    }

    @Override // X.AbstractC39241gO
    public final boolean LJIIJ() {
        if (this.LIZLLL != EnumC018105h.MATCH_CONSTRAINT || this.LIZIZ.mMatchConstraintDefaultWidth == 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HorizontalRun ");
        LIZ.append(this.LIZIZ.mDebugName);
        return X1D.LIZIZ(LIZ);
    }

    public C45021pi(C018205i c018205i) {
        super(c018205i);
        this.LJII.LJ = C16D.LEFT;
        this.LJIIIIZZ.LJ = C16D.RIGHT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x035a, code lost:
    
        if (r8 != 1) goto L11;
     */
    @Override // X.AbstractC39241gO, X.C16B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C16B r21) {
        /*
            Method dump skipped, instructions count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45021pi.LIZ(X.16B):void");
    }

    public static void LJIIL(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else {
            if (i9 > i7) {
                return;
            }
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }
}
