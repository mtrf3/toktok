package X;

/* loaded from: classes15.dex */
public final class VGU {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;

    public VGU() {
    }

    public VGU(int[] iArr) {
        this(iArr[0], iArr[1], r1 + iArr[2], r3 + iArr[3]);
    }

    public final VGU LIZ(float f, float f2) {
        if (f != 0.0f && f2 != 0.0f) {
            LIZIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, f, f2);
        }
        return this;
    }

    public final void LIZJ(float f, float f2, int[] iArr) {
        if (f == 0.0f || f2 == 0.0f || iArr == null || iArr.length != 4) {
            return;
        }
        LIZIZ(iArr[0], iArr[1], r2 + iArr[2], r1 + iArr[3], f, f2);
    }

    public VGU(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }

    public final void LIZIZ(float f, float f2, float f3, float f4, float f5, float f6) {
        if (f5 == 0.0f || f6 == 0.0f) {
            return;
        }
        this.LIZ = f / f5;
        this.LIZIZ = f2 / f6;
        this.LIZJ = f3 / f5;
        this.LIZLLL = f4 / f6;
    }
}
