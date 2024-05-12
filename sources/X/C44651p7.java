package X;

import Y.IDComparatorS28S0000000;
import defpackage.b1;
import java.util.Arrays;

/* renamed from: X.1p7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44651p7 extends C38731fZ {
    public C270014e[] LJFF;
    public C270014e[] LJI;
    public int LJII;
    public final C269814c LJIIIIZZ;

    @Override // X.C38731fZ
    public final boolean LJ() {
        if (this.LJII == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C38731fZ
    public final String toString() {
        StringBuilder LIZJ = b1.LIZJ("", " goal -> (");
        LIZJ.append(this.LIZIZ);
        LIZJ.append(") : ");
        String LIZIZ = X1D.LIZIZ(LIZJ);
        for (int i = 0; i < this.LJII; i++) {
            this.LJIIIIZZ.LJLIL = this.LJFF[i];
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LIZIZ);
            LIZ.append(this.LJIIIIZZ);
            LIZ.append(" ");
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        return LIZIZ;
    }

    public C44651p7(C14X c14x) {
        super(c14x);
        this.LJFF = new C270014e[128];
        this.LJI = new C270014e[128];
        this.LJIIIIZZ = new C269814c(this);
    }

    @Override // X.C38731fZ, X.C14Y
    public final C270014e LIZ(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.LJII; i2++) {
            C270014e[] c270014eArr = this.LJFF;
            C270014e c270014e = c270014eArr[i2];
            if (!zArr[c270014e.LIZJ]) {
                C269814c c269814c = this.LJIIIIZZ;
                c269814c.LJLIL = c270014e;
                int i3 = 8;
                if (i != -1) {
                    C270014e c270014e2 = c270014eArr[i];
                    while (true) {
                        float f = c270014e2.LJIIIIZZ[i3];
                        float f2 = c269814c.LJLIL.LJIIIIZZ[i3];
                        if (f2 == f) {
                            i3--;
                            if (i3 >= 0) {
                            }
                        } else if (f2 >= f) {
                        }
                    }
                }
                do {
                    float f3 = c269814c.LJLIL.LJIIIIZZ[i3];
                    if (f3 <= 0.0f) {
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                } while (i3 >= 0);
            }
        }
        if (i == -1) {
            return null;
        }
        return this.LJFF[i];
    }

    public final void LJIIIZ(C270014e c270014e) {
        int i;
        int i2 = this.LJII + 1;
        C270014e[] c270014eArr = this.LJFF;
        if (i2 > c270014eArr.length) {
            C270014e[] c270014eArr2 = (C270014e[]) Arrays.copyOf(c270014eArr, c270014eArr.length * 2);
            this.LJFF = c270014eArr2;
            this.LJI = (C270014e[]) Arrays.copyOf(c270014eArr2, c270014eArr2.length * 2);
        }
        C270014e[] c270014eArr3 = this.LJFF;
        int i3 = this.LJII;
        c270014eArr3[i3] = c270014e;
        int i4 = i3 + 1;
        this.LJII = i4;
        if (i4 > 1 && c270014eArr3[i4 - 1].LIZJ > c270014e.LIZJ) {
            int i5 = 0;
            while (true) {
                i = this.LJII;
                if (i5 >= i) {
                    break;
                }
                this.LJI[i5] = this.LJFF[i5];
                i5++;
            }
            Arrays.sort(this.LJI, 0, i, new IDComparatorS28S0000000(19));
            for (int i6 = 0; i6 < this.LJII; i6++) {
                this.LJFF[i6] = this.LJI[i6];
            }
        }
        c270014e.LIZ = true;
        c270014e.LIZ(this);
    }

    public final void LJIIJ(C270014e c270014e) {
        int i = 0;
        while (i < this.LJII) {
            if (this.LJFF[i] == c270014e) {
                while (true) {
                    int i2 = this.LJII;
                    if (i < i2 - 1) {
                        C270014e[] c270014eArr = this.LJFF;
                        int i3 = i + 1;
                        c270014eArr[i] = c270014eArr[i3];
                        i = i3;
                    } else {
                        this.LJII = i2 - 1;
                        c270014e.LIZ = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // X.C38731fZ
    public final void LJIIIIZZ(C14Z c14z, C38731fZ c38731fZ, boolean z) {
        C270014e c270014e = c38731fZ.LIZ;
        if (c270014e == null) {
            return;
        }
        C14W c14w = c38731fZ.LIZLLL;
        int LJIIJ = c14w.LJIIJ();
        for (int i = 0; i < LJIIJ; i++) {
            C270014e LJFF = c14w.LJFF(i);
            float LJ = c14w.LJ(i);
            C269814c c269814c = this.LJIIIIZZ;
            c269814c.LJLIL = LJFF;
            boolean z2 = true;
            if (LJFF.LIZ) {
                int i2 = 0;
                do {
                    float[] fArr = c269814c.LJLIL.LJIIIIZZ;
                    float f = (c270014e.LJIIIIZZ[i2] * LJ) + fArr[i2];
                    fArr[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c269814c.LJLIL.LJIIIIZZ[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                    i2++;
                } while (i2 < 9);
                if (z2) {
                    c269814c.LJLILLLLZI.LJIIJ(c269814c.LJLIL);
                }
            } else {
                int i3 = 0;
                do {
                    float f2 = c270014e.LJIIIIZZ[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * LJ;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c269814c.LJLIL.LJIIIIZZ[i3] = f3;
                    } else {
                        c269814c.LJLIL.LJIIIIZZ[i3] = 0.0f;
                    }
                    i3++;
                } while (i3 < 9);
                LJIIIZ(LJFF);
            }
            this.LIZIZ = (c38731fZ.LIZIZ * LJ) + this.LIZIZ;
        }
        LJIIJ(c270014e);
    }
}
