package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.0Of, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06730Of {
    public static final C06730Of LJIIJ;
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float[] LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;

    static {
        float f;
        float f2;
        float[] fArr = C55457Lpd.LJLJJI;
        float LIZLLL = (float) ((C55457Lpd.LIZLLL() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C55457Lpd.LJLILLLLZI;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr3[0] * f3;
        float f5 = fArr[1];
        float f6 = (fArr3[1] * f5) + f4;
        float f7 = fArr[2];
        float f8 = (fArr3[2] * f7) + f6;
        float[] fArr4 = fArr2[1];
        float f9 = (fArr4[2] * f7) + (fArr4[1] * f5) + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f10 = (f7 * fArr5[2]) + (f5 * fArr5[1]) + (f3 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f = 0.100000046f;
            f2 = 0.59f;
        } else {
            f = 0.12999998f;
            f2 = 0.525f;
        }
        float f11 = f + f2;
        float exp = (1.0f - (((float) Math.exp(((-LIZLLL) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp};
        float f12 = 1.0f / ((5.0f * LIZLLL) + 1.0f);
        float f13 = f12 * f12 * f12 * f12;
        float f14 = 1.0f - f13;
        float cbrt = (0.1f * f14 * f14 * ((float) Math.cbrt(LIZLLL * 5.0d))) + (f13 * LIZLLL);
        float LIZLLL2 = C55457Lpd.LIZLLL() / fArr[1];
        double d2 = LIZLLL2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f10) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f8) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f9) / 100.0d, 0.42d), pow2};
        float f15 = fArr7[0];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[1];
        LJIIJ = new C06730Of(LIZLLL2, C1I1.LIZ((400.0f * pow2) / (pow2 + 27.13f), 0.05f, (f16 * 2.0f) + ((f17 * 400.0f) / (f17 + 27.13f)), pow), pow, pow, f11, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public C06730Of(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.LJFF = f;
        this.LIZ = f2;
        this.LIZIZ = f3;
        this.LIZJ = f4;
        this.LIZLLL = f5;
        this.LJ = f6;
        this.LJI = fArr;
        this.LJII = f7;
        this.LJIIIIZZ = f8;
        this.LJIIIZ = f9;
    }
}
