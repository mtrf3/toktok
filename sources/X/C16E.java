package X;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.16E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C16E {
    public static final AnonymousClass168 LIZ = new AnonymousClass168();

    public static boolean LIZ(C018205i c018205i) {
        boolean z;
        boolean z2;
        EnumC018105h horizontalDimensionBehaviour = c018205i.getHorizontalDimensionBehaviour();
        EnumC018105h verticalDimensionBehaviour = c018205i.getVerticalDimensionBehaviour();
        C018205i c018205i2 = c018205i.mParent;
        if (c018205i2 != null) {
            c018205i2.getHorizontalDimensionBehaviour();
            c018205i2.getVerticalDimensionBehaviour();
        }
        EnumC018105h enumC018105h = EnumC018105h.FIXED;
        if (horizontalDimensionBehaviour == enumC018105h || horizontalDimensionBehaviour == EnumC018105h.WRAP_CONTENT || ((horizontalDimensionBehaviour == EnumC018105h.MATCH_CONSTRAINT && c018205i.mMatchConstraintDefaultWidth == 0 && c018205i.mDimensionRatio == 0.0f && c018205i.hasDanglingDimension(0)) || c018205i.isResolvedHorizontally())) {
            z = true;
        } else {
            z = false;
        }
        if (verticalDimensionBehaviour == enumC018105h || verticalDimensionBehaviour == EnumC018105h.WRAP_CONTENT || ((verticalDimensionBehaviour == EnumC018105h.MATCH_CONSTRAINT && c018205i.mMatchConstraintDefaultHeight == 0 && c018205i.mDimensionRatio == 0.0f && c018205i.hasDanglingDimension(1)) || c018205i.isResolvedVertically())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c018205i.mDimensionRatio > 0.0f) {
            if (!z && !z2) {
                return false;
            }
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static void LJ(C018205i c018205i, AnonymousClass169 anonymousClass169) {
        float f = c018205i.mVerticalBiasPercent;
        int LIZLLL = c018205i.mTop.LJFF.LIZLLL();
        int LIZLLL2 = c018205i.mBottom.LJFF.LIZLLL();
        int LJ = c018205i.mTop.LJ() + LIZLLL;
        int LJ2 = LIZLLL2 - c018205i.mBottom.LJ();
        if (LIZLLL == LIZLLL2) {
            f = 0.5f;
        } else {
            LIZLLL = LJ;
            LIZLLL2 = LJ2;
        }
        int height = c018205i.getHeight();
        int i = (LIZLLL2 - LIZLLL) - height;
        if (LIZLLL > LIZLLL2) {
            i = (LIZLLL - LIZLLL2) - height;
        }
        int i2 = (int) ((f * i) + 0.5f);
        int i3 = LIZLLL + i2;
        int i4 = i3 + height;
        if (LIZLLL > LIZLLL2) {
            i3 = LIZLLL - i2;
            i4 = i3 - height;
        }
        c018205i.setFinalVertical(i3, i4);
        LJI(c018205i, anonymousClass169);
    }

    public static void LJI(C018205i c018205i, AnonymousClass169 anonymousClass169) {
        boolean z;
        C017905f c017905f;
        C017905f c017905f2;
        C017905f c017905f3;
        C017905f c017905f4;
        C017905f c017905f5;
        C017905f c017905f6;
        if (!(c018205i instanceof C40061hi) && c018205i.isMeasureRequested() && LIZ(c018205i)) {
            C40061hi.LJIIJ(c018205i, anonymousClass169, new AnonymousClass168());
        }
        C017905f anchor = c018205i.getAnchor(EnumC017805e.TOP);
        C017905f anchor2 = c018205i.getAnchor(EnumC017805e.BOTTOM);
        int LIZLLL = anchor.LIZLLL();
        int LIZLLL2 = anchor2.LIZLLL();
        HashSet<C017905f> hashSet = anchor.LIZ;
        if (hashSet != null && anchor.LIZJ) {
            Iterator<C017905f> it = hashSet.iterator();
            while (it.hasNext()) {
                C017905f next = it.next();
                C018205i c018205i2 = next.LIZLLL;
                boolean LIZ2 = LIZ(c018205i2);
                if (c018205i2.isMeasureRequested() && LIZ2) {
                    C40061hi.LJIIJ(c018205i2, anonymousClass169, new AnonymousClass168());
                }
                EnumC018105h verticalDimensionBehaviour = c018205i2.getVerticalDimensionBehaviour();
                EnumC018105h enumC018105h = EnumC018105h.MATCH_CONSTRAINT;
                if (verticalDimensionBehaviour != enumC018105h || LIZ2) {
                    if (!c018205i2.isMeasureRequested()) {
                        C017905f c017905f7 = c018205i2.mTop;
                        if (next == c017905f7 && c018205i2.mBottom.LJFF == null) {
                            int LJ = c017905f7.LJ() + LIZLLL;
                            c018205i2.setFinalVertical(LJ, c018205i2.getHeight() + LJ);
                            LJI(c018205i2, anonymousClass169);
                        } else {
                            C017905f c017905f8 = c018205i2.mBottom;
                            if (next == c017905f8 && c017905f8.LJFF == null) {
                                int LJ2 = LIZLLL - c017905f8.LJ();
                                c018205i2.setFinalVertical(LJ2 - c018205i2.getHeight(), LJ2);
                                LJI(c018205i2, anonymousClass169);
                            } else if (next == c017905f7 && (c017905f3 = c017905f8.LJFF) != null && c017905f3.LIZJ) {
                                LJ(c018205i2, anonymousClass169);
                            }
                        }
                    }
                } else if (c018205i2.getVerticalDimensionBehaviour() == enumC018105h && c018205i2.mMatchConstraintMaxHeight >= 0 && c018205i2.mMatchConstraintMinHeight >= 0 && (c018205i2.mVisibility == 8 || (c018205i2.mMatchConstraintDefaultHeight == 0 && c018205i2.mDimensionRatio == 0.0f))) {
                    if (!c018205i2.isInVerticalChain() && !c018205i2.mInVirtuaLayout && ((next == (c017905f4 = c018205i2.mTop) && (c017905f6 = c018205i2.mBottom.LJFF) != null && c017905f6.LIZJ) || (next == c018205i2.mBottom && (c017905f5 = c017905f4.LJFF) != null && c017905f5.LIZJ))) {
                        if (!c018205i2.isInVerticalChain()) {
                            LJFF(c018205i, anonymousClass169, c018205i2);
                        }
                    }
                }
            }
        }
        if (c018205i instanceof C1AC) {
            return;
        }
        HashSet<C017905f> hashSet2 = anchor2.LIZ;
        if (hashSet2 != null && anchor2.LIZJ) {
            Iterator<C017905f> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                C017905f next2 = it2.next();
                C018205i c018205i3 = next2.LIZLLL;
                boolean LIZ3 = LIZ(c018205i3);
                if (c018205i3.isMeasureRequested() && LIZ3) {
                    C40061hi.LJIIJ(c018205i3, anonymousClass169, new AnonymousClass168());
                }
                C017905f c017905f9 = c018205i3.mTop;
                if ((next2 == c017905f9 && (c017905f2 = c018205i3.mBottom.LJFF) != null && c017905f2.LIZJ) || (next2 == c018205i3.mBottom && (c017905f = c017905f9.LJFF) != null && c017905f.LIZJ)) {
                    z = true;
                } else {
                    z = false;
                }
                EnumC018105h verticalDimensionBehaviour2 = c018205i3.getVerticalDimensionBehaviour();
                EnumC018105h enumC018105h2 = EnumC018105h.MATCH_CONSTRAINT;
                if (verticalDimensionBehaviour2 != enumC018105h2 || LIZ3) {
                    if (!c018205i3.isMeasureRequested()) {
                        C017905f c017905f10 = c018205i3.mTop;
                        if (next2 == c017905f10 && c018205i3.mBottom.LJFF == null) {
                            int LJ3 = c017905f10.LJ() + LIZLLL2;
                            c018205i3.setFinalVertical(LJ3, c018205i3.getHeight() + LJ3);
                            LJI(c018205i3, anonymousClass169);
                        } else {
                            C017905f c017905f11 = c018205i3.mBottom;
                            if (next2 == c017905f11 && c017905f10.LJFF == null) {
                                int LJ4 = LIZLLL2 - c017905f11.LJ();
                                c018205i3.setFinalVertical(LJ4 - c018205i3.getHeight(), LJ4);
                                LJI(c018205i3, anonymousClass169);
                            } else if (z && !c018205i3.isInVerticalChain()) {
                                LJ(c018205i3, anonymousClass169);
                            }
                        }
                    }
                } else if (c018205i3.getVerticalDimensionBehaviour() == enumC018105h2 && c018205i3.mMatchConstraintMaxHeight >= 0 && c018205i3.mMatchConstraintMinHeight >= 0 && (c018205i3.mVisibility == 8 || (c018205i3.mMatchConstraintDefaultHeight == 0 && c018205i3.mDimensionRatio == 0.0f))) {
                    if (!c018205i3.isInVerticalChain() && !c018205i3.mInVirtuaLayout && z && !c018205i3.isInVerticalChain()) {
                        LJFF(c018205i, anonymousClass169, c018205i3);
                    }
                }
            }
        }
        C017905f anchor3 = c018205i.getAnchor(EnumC017805e.BASELINE);
        if (anchor3.LIZ != null && anchor3.LIZJ) {
            int LIZLLL3 = anchor3.LIZLLL();
            Iterator<C017905f> it3 = anchor3.LIZ.iterator();
            while (it3.hasNext()) {
                C017905f next3 = it3.next();
                C018205i c018205i4 = next3.LIZLLL;
                boolean LIZ4 = LIZ(c018205i4);
                if (c018205i4.isMeasureRequested() && LIZ4) {
                    C40061hi.LJIIJ(c018205i4, anonymousClass169, new AnonymousClass168());
                }
                if (c018205i4.getVerticalDimensionBehaviour() != EnumC018105h.MATCH_CONSTRAINT || LIZ4) {
                    if (!c018205i4.isMeasureRequested() && next3 == c018205i4.mBaseline) {
                        c018205i4.setFinalBaseline(LIZLLL3);
                        LJI(c018205i4, anonymousClass169);
                    }
                }
            }
        }
    }

    public static void LIZIZ(C018205i c018205i, AnonymousClass169 anonymousClass169, boolean z) {
        HashSet<C017905f> hashSet;
        boolean z2;
        C017905f c017905f;
        C017905f c017905f2;
        C017905f c017905f3;
        C017905f c017905f4;
        C017905f c017905f5;
        C017905f c017905f6;
        if (!(c018205i instanceof C40061hi) && c018205i.isMeasureRequested() && LIZ(c018205i)) {
            C40061hi.LJIIJ(c018205i, anonymousClass169, new AnonymousClass168());
        }
        C017905f anchor = c018205i.getAnchor(EnumC017805e.LEFT);
        C017905f anchor2 = c018205i.getAnchor(EnumC017805e.RIGHT);
        int LIZLLL = anchor.LIZLLL();
        int LIZLLL2 = anchor2.LIZLLL();
        HashSet<C017905f> hashSet2 = anchor.LIZ;
        if (hashSet2 != null && anchor.LIZJ) {
            Iterator<C017905f> it = hashSet2.iterator();
            while (it.hasNext()) {
                C017905f next = it.next();
                C018205i c018205i2 = next.LIZLLL;
                boolean LIZ2 = LIZ(c018205i2);
                if (c018205i2.isMeasureRequested() && LIZ2) {
                    C40061hi.LJIIJ(c018205i2, anonymousClass169, new AnonymousClass168());
                }
                EnumC018105h horizontalDimensionBehaviour = c018205i2.getHorizontalDimensionBehaviour();
                EnumC018105h enumC018105h = EnumC018105h.MATCH_CONSTRAINT;
                if (horizontalDimensionBehaviour != enumC018105h || LIZ2) {
                    if (!c018205i2.isMeasureRequested()) {
                        C017905f c017905f7 = c018205i2.mLeft;
                        if (next == c017905f7 && c018205i2.mRight.LJFF == null) {
                            int LJ = c017905f7.LJ() + LIZLLL;
                            c018205i2.setFinalHorizontal(LJ, c018205i2.getWidth() + LJ);
                            LIZIZ(c018205i2, anonymousClass169, z);
                        } else {
                            C017905f c017905f8 = c018205i2.mRight;
                            if (next == c017905f8 && c017905f7.LJFF == null) {
                                int LJ2 = LIZLLL - c017905f8.LJ();
                                c018205i2.setFinalHorizontal(LJ2 - c018205i2.getWidth(), LJ2);
                                LIZIZ(c018205i2, anonymousClass169, z);
                            } else if (next == c017905f7 && (c017905f3 = c017905f8.LJFF) != null && c017905f3.LIZJ && !c018205i2.isInHorizontalChain()) {
                                LIZJ(c018205i2, anonymousClass169, z);
                            }
                        }
                    }
                } else if (c018205i2.getHorizontalDimensionBehaviour() == enumC018105h && c018205i2.mMatchConstraintMaxWidth >= 0 && c018205i2.mMatchConstraintMinWidth >= 0 && (c018205i2.mVisibility == 8 || (c018205i2.mMatchConstraintDefaultWidth == 0 && c018205i2.mDimensionRatio == 0.0f))) {
                    if (!c018205i2.isInHorizontalChain() && !c018205i2.mInVirtuaLayout && ((next == (c017905f4 = c018205i2.mLeft) && (c017905f6 = c018205i2.mRight.LJFF) != null && c017905f6.LIZJ) || (next == c018205i2.mRight && (c017905f5 = c017905f4.LJFF) != null && c017905f5.LIZJ))) {
                        if (!c018205i2.isInHorizontalChain()) {
                            LIZLLL(c018205i, anonymousClass169, c018205i2, z);
                        }
                    }
                }
            }
        }
        if (!(c018205i instanceof C1AC) && (hashSet = anchor2.LIZ) != null && anchor2.LIZJ) {
            Iterator<C017905f> it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C017905f next2 = it2.next();
                C018205i c018205i3 = next2.LIZLLL;
                boolean LIZ3 = LIZ(c018205i3);
                if (c018205i3.isMeasureRequested() && LIZ3) {
                    C40061hi.LJIIJ(c018205i3, anonymousClass169, new AnonymousClass168());
                }
                C017905f c017905f9 = c018205i3.mLeft;
                if ((next2 == c017905f9 && (c017905f2 = c018205i3.mRight.LJFF) != null && c017905f2.LIZJ) || (next2 == c018205i3.mRight && (c017905f = c017905f9.LJFF) != null && c017905f.LIZJ)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                EnumC018105h horizontalDimensionBehaviour2 = c018205i3.getHorizontalDimensionBehaviour();
                EnumC018105h enumC018105h2 = EnumC018105h.MATCH_CONSTRAINT;
                if (horizontalDimensionBehaviour2 != enumC018105h2 || LIZ3) {
                    if (!c018205i3.isMeasureRequested()) {
                        C017905f c017905f10 = c018205i3.mLeft;
                        if (next2 == c017905f10 && c018205i3.mRight.LJFF == null) {
                            int LJ3 = c017905f10.LJ() + LIZLLL2;
                            c018205i3.setFinalHorizontal(LJ3, c018205i3.getWidth() + LJ3);
                            LIZIZ(c018205i3, anonymousClass169, z);
                        } else {
                            C017905f c017905f11 = c018205i3.mRight;
                            if (next2 == c017905f11 && c017905f10.LJFF == null) {
                                int LJ4 = LIZLLL2 - c017905f11.LJ();
                                c018205i3.setFinalHorizontal(LJ4 - c018205i3.getWidth(), LJ4);
                                LIZIZ(c018205i3, anonymousClass169, z);
                            } else if (z2 && !c018205i3.isInHorizontalChain()) {
                                LIZJ(c018205i3, anonymousClass169, z);
                            }
                        }
                    }
                } else if (c018205i3.getHorizontalDimensionBehaviour() == enumC018105h2 && c018205i3.mMatchConstraintMaxWidth >= 0 && c018205i3.mMatchConstraintMinWidth >= 0 && (c018205i3.mVisibility == 8 || (c018205i3.mMatchConstraintDefaultWidth == 0 && c018205i3.mDimensionRatio == 0.0f))) {
                    if (!c018205i3.isInHorizontalChain() && !c018205i3.mInVirtuaLayout && z2 && !c018205i3.isInHorizontalChain()) {
                        LIZLLL(c018205i, anonymousClass169, c018205i3, z);
                    }
                }
            }
        }
    }

    public static void LIZJ(C018205i c018205i, AnonymousClass169 anonymousClass169, boolean z) {
        float f = c018205i.mHorizontalBiasPercent;
        int LIZLLL = c018205i.mLeft.LJFF.LIZLLL();
        int LIZLLL2 = c018205i.mRight.LJFF.LIZLLL();
        int LJ = c018205i.mLeft.LJ() + LIZLLL;
        int LJ2 = LIZLLL2 - c018205i.mRight.LJ();
        if (LIZLLL == LIZLLL2) {
            f = 0.5f;
        } else {
            LIZLLL = LJ;
            LIZLLL2 = LJ2;
        }
        int width = c018205i.getWidth();
        int i = (LIZLLL2 - LIZLLL) - width;
        if (LIZLLL > LIZLLL2) {
            i = (LIZLLL - LIZLLL2) - width;
        }
        int i2 = ((int) ((f * i) + 0.5f)) + LIZLLL;
        int i3 = i2 + width;
        if (LIZLLL > LIZLLL2) {
            i3 = i2 - width;
        }
        c018205i.setFinalHorizontal(i2, i3);
        LIZIZ(c018205i, anonymousClass169, z);
    }

    public static void LJFF(C018205i c018205i, AnonymousClass169 anonymousClass169, C018205i c018205i2) {
        int height;
        float f = c018205i2.mVerticalBiasPercent;
        int LJ = c018205i2.mTop.LJ() + c018205i2.mTop.LJFF.LIZLLL();
        int LIZLLL = c018205i2.mBottom.LJFF.LIZLLL() - c018205i2.mBottom.LJ();
        if (LIZLLL >= LJ) {
            int height2 = c018205i2.getHeight();
            if (c018205i2.mVisibility != 8) {
                int i = c018205i2.mMatchConstraintDefaultHeight;
                if (i == 2) {
                    if (c018205i instanceof C40061hi) {
                        height = c018205i.getHeight();
                    } else {
                        height = c018205i.mParent.getHeight();
                    }
                    height2 = (int) (f * 0.5f * height);
                } else if (i == 0) {
                    height2 = LIZLLL - LJ;
                }
                height2 = Math.max(c018205i2.mMatchConstraintMinHeight, height2);
                int i2 = c018205i2.mMatchConstraintMaxHeight;
                if (i2 > 0) {
                    height2 = Math.min(i2, height2);
                }
            }
            int i3 = LJ + ((int) ((f * ((LIZLLL - LJ) - height2)) + 0.5f));
            c018205i2.setFinalVertical(i3, height2 + i3);
            LJI(c018205i2, anonymousClass169);
        }
    }

    public static void LIZLLL(C018205i c018205i, AnonymousClass169 anonymousClass169, C018205i c018205i2, boolean z) {
        int width;
        float f = c018205i2.mHorizontalBiasPercent;
        int LJ = c018205i2.mLeft.LJ() + c018205i2.mLeft.LJFF.LIZLLL();
        int LIZLLL = c018205i2.mRight.LJFF.LIZLLL() - c018205i2.mRight.LJ();
        if (LIZLLL >= LJ) {
            int width2 = c018205i2.getWidth();
            if (c018205i2.mVisibility != 8) {
                int i = c018205i2.mMatchConstraintDefaultWidth;
                if (i == 2) {
                    if (c018205i instanceof C40061hi) {
                        width = c018205i.getWidth();
                    } else {
                        width = c018205i.mParent.getWidth();
                    }
                    width2 = (int) (c018205i2.mHorizontalBiasPercent * 0.5f * width);
                } else if (i == 0) {
                    width2 = LIZLLL - LJ;
                }
                width2 = Math.max(c018205i2.mMatchConstraintMinWidth, width2);
                int i2 = c018205i2.mMatchConstraintMaxWidth;
                if (i2 > 0) {
                    width2 = Math.min(i2, width2);
                }
            }
            int i3 = LJ + ((int) ((f * ((LIZLLL - LJ) - width2)) + 0.5f));
            c018205i2.setFinalHorizontal(i3, width2 + i3);
            LIZIZ(c018205i2, anonymousClass169, z);
        }
    }
}
