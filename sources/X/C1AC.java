package X;

import java.util.HashMap;

/* renamed from: X.1AC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AC extends C018205i {
    public float LIZ = -1.0f;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public C017905f LIZLLL = this.mTop;
    public int LJ;
    public boolean LJFF;

    @Override // X.C018205i
    public final boolean allowedInBarrier() {
        return true;
    }

    @Override // X.C018205i
    public final String getType() {
        return "Guideline";
    }

    public C1AC() {
        this.mAnchors.clear();
        this.mAnchors.add(this.LIZLLL);
        int length = this.mListAnchors.length;
        for (int i = 0; i < length; i++) {
            this.mListAnchors[i] = this.LIZLLL;
        }
    }

    @Override // X.C018205i
    public final boolean isResolvedHorizontally() {
        return this.LJFF;
    }

    @Override // X.C018205i
    public final boolean isResolvedVertically() {
        return this.LJFF;
    }

    public final void LIZLLL(int i) {
        this.LIZLLL.LJIIJJI(i);
        this.LJFF = true;
    }

    public final void LJ(int i) {
        if (this.LJ == i) {
            return;
        }
        this.LJ = i;
        this.mAnchors.clear();
        if (this.LJ == 1) {
            this.LIZLLL = this.mLeft;
        } else {
            this.LIZLLL = this.mTop;
        }
        this.mAnchors.add(this.LIZLLL);
        int length = this.mListAnchors.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.mListAnchors[i2] = this.LIZLLL;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.C018205i
    public final C017905f getAnchor(EnumC017805e enumC017805e) {
        switch (C018405k.LIZ[enumC017805e.ordinal()]) {
            case 1:
            case 2:
                if (this.LJ == 1) {
                    return this.LIZLLL;
                }
                throw new AssertionError(enumC017805e.name());
            case 3:
            case 4:
                if (this.LJ == 0) {
                    return this.LIZLLL;
                }
                throw new AssertionError(enumC017805e.name());
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            default:
                throw new AssertionError(enumC017805e.name());
        }
    }

    @Override // X.C018205i
    public final void addToSolver(C14Z c14z, boolean z) {
        boolean z2;
        C018205i c018205i = this.mParent;
        if (c018205i == null) {
            return;
        }
        Object anchor = c018205i.getAnchor(EnumC017805e.LEFT);
        Object anchor2 = c018205i.getAnchor(EnumC017805e.RIGHT);
        C018205i c018205i2 = this.mParent;
        boolean z3 = true;
        if (c018205i2 != null && c018205i2.mListDimensionBehaviors[0] == EnumC018105h.WRAP_CONTENT) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LJ == 0) {
            anchor = c018205i.getAnchor(EnumC017805e.TOP);
            anchor2 = c018205i.getAnchor(EnumC017805e.BOTTOM);
            C018205i c018205i3 = this.mParent;
            if (c018205i3 == null || c018205i3.mListDimensionBehaviors[1] != EnumC018105h.WRAP_CONTENT) {
                z3 = false;
            }
            z2 = z3;
        }
        if (this.LJFF) {
            C017905f c017905f = this.LIZLLL;
            if (c017905f.LIZJ) {
                C270014e LJIIJ = c14z.LJIIJ(c017905f);
                c14z.LIZLLL(LJIIJ, this.LIZLLL.LIZLLL());
                if (this.LIZIZ != -1) {
                    if (z2) {
                        c14z.LJFF(c14z.LJIIJ(anchor2), LJIIJ, 0, 5);
                    }
                } else if (this.LIZJ != -1 && z2) {
                    C270014e LJIIJ2 = c14z.LJIIJ(anchor2);
                    c14z.LJFF(LJIIJ, c14z.LJIIJ(anchor), 0, 5);
                    c14z.LJFF(LJIIJ2, LJIIJ, 0, 5);
                }
                this.LJFF = false;
                return;
            }
        }
        if (this.LIZIZ != -1) {
            C270014e LJIIJ3 = c14z.LJIIJ(this.LIZLLL);
            c14z.LJ(LJIIJ3, c14z.LJIIJ(anchor), this.LIZIZ, 8);
            if (z2) {
                c14z.LJFF(c14z.LJIIJ(anchor2), LJIIJ3, 0, 5);
                return;
            }
            return;
        }
        if (this.LIZJ != -1) {
            C270014e LJIIJ4 = c14z.LJIIJ(this.LIZLLL);
            C270014e LJIIJ5 = c14z.LJIIJ(anchor2);
            c14z.LJ(LJIIJ4, LJIIJ5, -this.LIZJ, 8);
            if (!z2) {
                return;
            }
            c14z.LJFF(LJIIJ4, c14z.LJIIJ(anchor), 0, 5);
            c14z.LJFF(LJIIJ5, LJIIJ4, 0, 5);
            return;
        }
        if (this.LIZ == -1.0f) {
            return;
        }
        C270014e LJIIJ6 = c14z.LJIIJ(this.LIZLLL);
        C270014e LJIIJ7 = c14z.LJIIJ(anchor2);
        float f = this.LIZ;
        C38731fZ LJIIJJI = c14z.LJIIJJI();
        LJIIJJI.LIZLLL.LJIIIIZZ(LJIIJ6, -1.0f);
        LJIIJJI.LIZLLL.LJIIIIZZ(LJIIJ7, f);
        c14z.LIZJ(LJIIJJI);
    }

    @Override // X.C018205i
    public final void copy(C018205i c018205i, HashMap<C018205i, C018205i> hashMap) {
        super.copy(c018205i, hashMap);
        C1AC c1ac = (C1AC) c018205i;
        this.LIZ = c1ac.LIZ;
        this.LIZIZ = c1ac.LIZIZ;
        this.LIZJ = c1ac.LIZJ;
        LJ(c1ac.LJ);
    }

    @Override // X.C018205i
    public final void updateFromSolver(C14Z c14z, boolean z) {
        if (this.mParent == null) {
            return;
        }
        C017905f c017905f = this.LIZLLL;
        c14z.getClass();
        int LJIILIIL = C14Z.LJIILIIL(c017905f);
        if (this.LJ == 1) {
            this.mX = LJIILIIL;
            this.mY = 0;
            setHeight(this.mParent.getHeight());
            setWidth(0);
            return;
        }
        this.mX = 0;
        this.mY = LJIILIIL;
        setWidth(this.mParent.getWidth());
        setHeight(0);
    }
}
