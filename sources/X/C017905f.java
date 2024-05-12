package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.05f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C017905f {
    public HashSet<C017905f> LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final C018205i LIZLLL;
    public final EnumC017805e LJ;
    public C017905f LJFF;
    public int LJI;
    public int LJII = -1;
    public C270014e LJIIIIZZ;

    public final int LIZLLL() {
        if (!this.LIZJ) {
            return 0;
        }
        return this.LIZIZ;
    }

    public final int LJ() {
        C017905f c017905f;
        if (this.LIZLLL.mVisibility == 8) {
            return 0;
        }
        int i = this.LJII;
        if (i > -1 && (c017905f = this.LJFF) != null && c017905f.LIZLLL.mVisibility == 8) {
            return i;
        }
        return this.LJI;
    }

    public final C017905f LJFF() {
        switch (C017705d.LIZ[this.LJ.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.LIZLLL.mRight;
            case 3:
                return this.LIZLLL.mLeft;
            case 4:
                return this.LIZLLL.mBottom;
            case 5:
                return this.LIZLLL.mTop;
            default:
                throw new AssertionError(this.LJ.name());
        }
    }

    public final boolean LJI() {
        HashSet<C017905f> hashSet = this.LIZ;
        if (hashSet == null) {
            return false;
        }
        Iterator<C017905f> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().LJFF().LJII()) {
                return true;
            }
        }
        return false;
    }

    public final boolean LJII() {
        if (this.LJFF != null) {
            return true;
        }
        return false;
    }

    public final void LJIIIZ() {
        HashSet<C017905f> hashSet;
        C017905f c017905f = this.LJFF;
        if (c017905f != null && (hashSet = c017905f.LIZ) != null) {
            hashSet.remove(this);
            if (this.LJFF.LIZ.size() == 0) {
                this.LJFF.LIZ = null;
            }
        }
        this.LIZ = null;
        this.LJFF = null;
        this.LJI = 0;
        this.LJII = -1;
        this.LIZJ = false;
        this.LIZIZ = 0;
    }

    public final void LJIIJ() {
        C270014e c270014e = this.LJIIIIZZ;
        if (c270014e == null) {
            this.LJIIIIZZ = new C270014e(EnumC269914d.UNRESTRICTED);
        } else {
            c270014e.LIZJ();
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL.mDebugName);
        LIZ.append(":");
        LIZ.append(this.LJ.toString());
        return X1D.LIZIZ(LIZ);
    }

    public final boolean LJIIIIZZ(C017905f c017905f) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (c017905f == null) {
            return false;
        }
        EnumC017805e enumC017805e = c017905f.LJ;
        EnumC017805e enumC017805e2 = this.LJ;
        if (enumC017805e == enumC017805e2) {
            if (enumC017805e2 == EnumC017805e.BASELINE && (!c017905f.LIZLLL.hasBaseline || !this.LIZLLL.hasBaseline)) {
                return false;
            }
            return true;
        }
        switch (C017705d.LIZ[enumC017805e2.ordinal()]) {
            case 1:
                if (enumC017805e == EnumC017805e.BASELINE || enumC017805e == EnumC017805e.CENTER_X || enumC017805e == EnumC017805e.CENTER_Y) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (enumC017805e == EnumC017805e.LEFT || enumC017805e == EnumC017805e.RIGHT) {
                    z = true;
                } else {
                    z = false;
                }
                if (c017905f.LIZLLL instanceof C1AC) {
                    if (z || enumC017805e == EnumC017805e.CENTER_X) {
                        z3 = true;
                    }
                    return z3;
                }
                return z;
            case 4:
            case 5:
                if (enumC017805e == EnumC017805e.TOP || enumC017805e == EnumC017805e.BOTTOM) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (c017905f.LIZLLL instanceof C1AC) {
                    if (z2 || enumC017805e == EnumC017805e.CENTER_Y) {
                        z3 = true;
                    }
                    return z3;
                }
                return z2;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.LJ.name());
        }
    }

    public final void LJIIJJI(int i) {
        this.LIZIZ = i;
        this.LIZJ = true;
    }

    public C017905f(C018205i c018205i, EnumC017805e enumC017805e) {
        this.LIZLLL = c018205i;
        this.LJ = enumC017805e;
    }

    public final void LIZ(C017905f c017905f, int i) {
        LIZIZ(c017905f, i, -1, false);
    }

    public final void LIZJ(int i, C16I c16i, ArrayList arrayList) {
        HashSet<C017905f> hashSet = this.LIZ;
        if (hashSet != null) {
            Iterator<C017905f> it = hashSet.iterator();
            while (it.hasNext()) {
                C16F.LIZ(it.next().LIZLLL, i, arrayList, c16i);
            }
        }
    }

    public final boolean LIZIZ(C017905f c017905f, int i, int i2, boolean z) {
        if (c017905f == null) {
            LJIIIZ();
            return true;
        }
        if (!z && !LJIIIIZZ(c017905f)) {
            return false;
        }
        this.LJFF = c017905f;
        if (c017905f.LIZ == null) {
            c017905f.LIZ = new HashSet<>();
        }
        HashSet<C017905f> hashSet = this.LJFF.LIZ;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.LJI = i;
        } else {
            this.LJI = 0;
        }
        this.LJII = i2;
        return true;
    }
}
