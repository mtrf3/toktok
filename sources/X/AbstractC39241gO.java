package X;

import java.util.ArrayList;

/* renamed from: X.1gO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39241gO implements C16B {
    public int LIZ;
    public C018205i LIZIZ;
    public C16G LIZJ;
    public EnumC018105h LIZLLL;
    public final C44991pf LJ = new C44991pf(this);
    public int LJFF = 0;
    public boolean LJI = false;
    public final C39231gN LJII = new C39231gN(this);
    public final C39231gN LJIIIIZZ = new C39231gN(this);
    public C16K LJIIIZ = C16K.NONE;

    @Override // X.C16B
    public void LIZ(C16B c16b) {
    }

    public abstract void LIZLLL();

    public abstract void LJ();

    public abstract void LJFF();

    public abstract boolean LJIIJ();

    public long LJIIIZ() {
        if (this.LJ.LJIIIZ) {
            return r1.LJI;
        }
        return 0L;
    }

    public AbstractC39241gO(C018205i c018205i) {
        this.LIZIZ = c018205i;
    }

    public static C39231gN LJII(C017905f c017905f) {
        C017905f c017905f2 = c017905f.LJFF;
        if (c017905f2 == null) {
            return null;
        }
        C018205i c018205i = c017905f2.LIZLLL;
        int i = C16J.LIZ[c017905f2.LJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return c018205i.verticalRun.LJIIIIZZ;
                    }
                    return c018205i.verticalRun.LJIIJ;
                }
                return c018205i.verticalRun.LJII;
            }
            return c018205i.horizontalRun.LJIIIIZZ;
        }
        return c018205i.horizontalRun.LJII;
    }

    public static C39231gN LJIIIIZZ(C017905f c017905f, int i) {
        AbstractC39241gO abstractC39241gO;
        C017905f c017905f2 = c017905f.LJFF;
        if (c017905f2 == null) {
            return null;
        }
        C018205i c018205i = c017905f2.LIZLLL;
        if (i == 0) {
            abstractC39241gO = c018205i.horizontalRun;
        } else {
            abstractC39241gO = c018205i.verticalRun;
        }
        int i2 = C16J.LIZ[c017905f2.LJ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC39241gO.LJIIIIZZ;
        }
        return abstractC39241gO.LJII;
    }

    public final int LJI(int i, int i2) {
        int max;
        if (i2 == 0) {
            C018205i c018205i = this.LIZIZ;
            int i3 = c018205i.mMatchConstraintMaxWidth;
            max = Math.max(c018205i.mMatchConstraintMinWidth, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            C018205i c018205i2 = this.LIZIZ;
            int i4 = c018205i2.mMatchConstraintMaxHeight;
            max = Math.max(c018205i2.mMatchConstraintMinHeight, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public static void LIZIZ(C39231gN c39231gN, C39231gN c39231gN2, int i) {
        ((ArrayList) c39231gN.LJIIJJI).add(c39231gN2);
        c39231gN.LJFF = i;
        ((ArrayList) c39231gN2.LJIIJ).add(c39231gN);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r1.LIZ == 3) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(X.C017905f r16, X.C017905f r17, int r18) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC39241gO.LJIIJJI(X.05f, X.05f, int):void");
    }

    public final void LIZJ(C39231gN c39231gN, C39231gN c39231gN2, int i, C44991pf c44991pf) {
        ((ArrayList) c39231gN.LJIIJJI).add(c39231gN2);
        ((ArrayList) c39231gN.LJIIJJI).add(this.LJ);
        c39231gN.LJII = i;
        c39231gN.LJIIIIZZ = c44991pf;
        ((ArrayList) c39231gN2.LJIIJ).add(c39231gN);
        ((ArrayList) c44991pf.LJIIJ).add(c39231gN);
    }
}
