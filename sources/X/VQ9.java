package X;

/* loaded from: classes15.dex */
public final class VQ9 {
    public static final int[] LJ = {1, 2, 4, 8, 16, 32, 64, 128, 256};
    public final float[] LIZ;
    public int LIZIZ;
    public final float LIZJ;
    public boolean LIZLLL;

    public VQ9() {
        this(0.0f);
    }

    public VQ9(float f) {
        this.LIZ = new float[]{1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f, 1.0E21f};
        this.LIZIZ = 0;
        this.LIZJ = f;
    }

    public final float LIZ(int i) {
        float f;
        char c;
        if (i == 4 || i == 5) {
            f = 1.0E21f;
        } else {
            f = this.LIZJ;
        }
        int i2 = this.LIZIZ;
        if (i2 == 0) {
            return f;
        }
        int[] iArr = LJ;
        if ((iArr[i] & i2) != 0) {
            return this.LIZ[i];
        }
        if (this.LIZLLL) {
            if (i == 1 || i == 3) {
                c = 7;
            } else {
                c = 6;
            }
            if ((iArr[c] & i2) != 0) {
                return this.LIZ[c];
            }
            if ((i2 & iArr[8]) != 0) {
                return this.LIZ[8];
            }
        }
        return f;
    }

    public final void LIZIZ(float f, int i) {
        boolean z;
        if (!VJJ.LIZ(this.LIZ[i], f)) {
            this.LIZ[i] = f;
            boolean LIZ = VQC.LIZ(f);
            int[] iArr = LJ;
            if (LIZ) {
                this.LIZIZ &= ~iArr[i];
            } else {
                this.LIZIZ |= iArr[i];
            }
            int i2 = this.LIZIZ;
            if ((iArr[8] & i2) != 0 || (iArr[7] & i2) != 0 || (i2 & iArr[6]) != 0) {
                z = true;
            } else {
                z = false;
            }
            this.LIZLLL = z;
        }
    }
}
