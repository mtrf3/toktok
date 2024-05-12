package X;

/* renamed from: X.VpC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80910VpC {
    public float LIZ = 2000.0f;
    public float LIZIZ = 0.55f;

    public final int LIZIZ(int i) {
        float f = i;
        float abs = Math.abs(f);
        float f2 = this.LIZ;
        if (abs >= f2) {
            if (f > 0.0f) {
                f = f2 - 1;
            } else {
                f = (-f2) + 1;
            }
        }
        if (f == 0.0f) {
            return 0;
        }
        if (f > 0.0f) {
            float f3 = this.LIZIZ;
            return (int) ((((f2 * f2) / ((f2 - f) * f3)) - (f2 / f3)) + 0.5f);
        }
        float f4 = this.LIZIZ;
        return -((int) ((((f2 * f2) / ((f + f2) * f4)) - (f2 / f4)) + 0.5f));
    }

    public final int LIZ(int i, int i2, int i3) {
        if (i > 0) {
            if (i3 >= 0) {
                float f = this.LIZIZ * i;
                float f2 = this.LIZ;
                i2 = (int) (((1.0f - (1.0f / ((f / f2) + 1.0f))) * f2) + 0.5f);
            }
        } else if (i3 <= 0) {
            float f3 = (-this.LIZIZ) * i;
            float f4 = this.LIZ;
            i2 = (int) ((-((1.0f - (1.0f / ((f3 / f4) + 1.0f))) * f4)) + 0.5f);
        }
        float f5 = i2;
        float f6 = this.LIZ;
        float f7 = 1;
        if (f5 > f6 - f7) {
            return (int) (f6 - f7);
        }
        if (f5 >= (-f6) + f7) {
            return i2;
        }
        return (int) ((-f6) + f7);
    }
}
