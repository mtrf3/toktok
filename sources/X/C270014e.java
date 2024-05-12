package X;

import java.util.Arrays;

/* renamed from: X.14e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C270014e {
    public boolean LIZ;
    public String LIZIZ;
    public int LJ;
    public float LJFF;
    public boolean LJI;
    public EnumC269914d LJIIIZ;
    public int LJIIJJI;
    public int LJIIL;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public final float[] LJII = new float[9];
    public final float[] LJIIIIZZ = new float[9];
    public C38731fZ[] LJIIJ = new C38731fZ[16];

    public final void LIZJ() {
        this.LIZIZ = null;
        this.LJIIIZ = EnumC269914d.UNKNOWN;
        this.LJ = 0;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJFF = 0.0f;
        this.LJI = false;
        int i = this.LJIIJJI;
        for (int i2 = 0; i2 < i; i2++) {
            this.LJIIJ[i2] = null;
        }
        this.LJIIJJI = 0;
        this.LJIIL = 0;
        this.LIZ = false;
        Arrays.fill(this.LJIIIIZZ, 0.0f);
    }

    public final String toString() {
        if (this.LIZIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(this.LIZIZ);
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(this.LIZJ);
        return X1D.LIZIZ(LIZ2);
    }

    public C270014e(EnumC269914d enumC269914d) {
        this.LJIIIZ = enumC269914d;
    }

    public final void LIZ(C38731fZ c38731fZ) {
        int i = 0;
        while (true) {
            int i2 = this.LJIIJJI;
            if (i < i2) {
                if (this.LJIIJ[i] == c38731fZ) {
                    return;
                } else {
                    i++;
                }
            } else {
                C38731fZ[] c38731fZArr = this.LJIIJ;
                if (i2 >= c38731fZArr.length) {
                    this.LJIIJ = (C38731fZ[]) Arrays.copyOf(c38731fZArr, c38731fZArr.length * 2);
                }
                C38731fZ[] c38731fZArr2 = this.LJIIJ;
                int i3 = this.LJIIJJI;
                c38731fZArr2[i3] = c38731fZ;
                this.LJIIJJI = i3 + 1;
                return;
            }
        }
    }

    public final void LIZIZ(C38731fZ c38731fZ) {
        int i = this.LJIIJJI;
        int i2 = 0;
        while (i2 < i) {
            if (this.LJIIJ[i2] == c38731fZ) {
                while (i2 < i - 1) {
                    C38731fZ[] c38731fZArr = this.LJIIJ;
                    int i3 = i2 + 1;
                    c38731fZArr[i2] = c38731fZArr[i3];
                    i2 = i3;
                }
                this.LJIIJJI--;
                return;
            }
            i2++;
        }
    }

    public final void LIZLLL(C14Z c14z, float f) {
        this.LJFF = f;
        this.LJI = true;
        int i = this.LJIIJJI;
        this.LIZLLL = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.LJIIJ[i2].LJII(c14z, this, false);
        }
        this.LJIIJJI = 0;
    }

    public final void LJ(C14Z c14z, C38731fZ c38731fZ) {
        int i = this.LJIIJJI;
        for (int i2 = 0; i2 < i; i2++) {
            this.LJIIJ[i2].LJIIIIZZ(c14z, c38731fZ, false);
        }
        this.LJIIJJI = 0;
    }
}
