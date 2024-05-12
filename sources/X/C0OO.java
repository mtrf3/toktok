package X;

import android.graphics.Color;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.0OO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0OO {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;

    public static C0OO LIZ(int i) {
        float f;
        C06730Of c06730Of = C06730Of.LJIIJ;
        float LIZJ = C55457Lpd.LIZJ(Color.red(i));
        float LIZJ2 = C55457Lpd.LIZJ(Color.green(i));
        float LIZJ3 = C55457Lpd.LIZJ(Color.blue(i));
        float[][] fArr = C55457Lpd.LJLJJL;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * LIZJ3) + (fArr2[1] * LIZJ2) + (fArr2[0] * LIZJ);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * LIZJ3) + (fArr3[1] * LIZJ2) + (fArr3[0] * LIZJ);
        float[] fArr4 = fArr[2];
        float f4 = (LIZJ3 * fArr4[2]) + (LIZJ2 * fArr4[1]) + (LIZJ * fArr4[0]);
        float[][] fArr5 = C55457Lpd.LJLILLLLZI;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f6 = (fArr7[2] * f4) + (fArr7[1] * f3) + (fArr7[0] * f2);
        float[] fArr8 = fArr5[2];
        float f7 = (f4 * fArr8[2]) + (f3 * fArr8[1]) + (f2 * fArr8[0]);
        float[] fArr9 = c06730Of.LJI;
        float f8 = fArr9[0] * f5;
        float f9 = fArr9[1] * f6;
        float f10 = fArr9[2] * f7;
        float pow = (float) Math.pow((Math.abs(f8) * c06730Of.LJII) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f9) * c06730Of.LJII) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f10) * c06730Of.LJII) / 100.0d, 0.42d);
        float signum = ((Math.signum(f8) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f9) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f10) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f11 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f12 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f13 = signum2 * 20.0f;
        float f14 = ((21.0f * signum3) + ((signum * 20.0f) + f13)) / 20.0f;
        float f15 = (((signum * 40.0f) + f13) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f12, f11)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f16 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f15 * c06730Of.LIZIZ) / c06730Of.LIZ, c06730Of.LIZLLL * c06730Of.LJIIIZ)) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        if (atan2 < 20.14d) {
            f = 360.0f + atan2;
        } else {
            f = atan2;
        }
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, c06730Of.LJFF), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * c06730Of.LJ) * c06730Of.LIZJ) * ((float) Math.sqrt((f12 * f12) + (f11 * f11)))) / (f14 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float f17 = c06730Of.LJIIIIZZ * pow5;
        Math.sqrt((r7 * c06730Of.LIZLLL) / (c06730Of.LIZ + 4.0f));
        float f18 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((f17 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f16;
        return new C0OO(atan2, pow5, pow4, f18, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public final int LIZJ(C06730Of c06730Of) {
        float f;
        float f2 = this.LIZIZ;
        if (f2 != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            double d = this.LIZJ;
            if (d != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                f = f2 / ((float) Math.sqrt(d / 100.0d));
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, c06730Of.LJFF), 0.73d), 1.1111111111111112d);
                double d2 = (this.LIZ * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f;
                float pow2 = c06730Of.LIZ * ((float) Math.pow(this.LIZJ / 100.0d, (1.0d / c06730Of.LIZLLL) / c06730Of.LJIIIZ));
                float f3 = cos * 3846.1538f * c06730Of.LJ * c06730Of.LIZJ;
                float f4 = pow2 / c06730Of.LIZIZ;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f5 = (((0.305f + f4) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (f3 * 23.0f)));
                float f6 = cos2 * f5;
                float f7 = f5 * sin;
                float f8 = f4 * 460.0f;
                float f9 = ((288.0f * f7) + ((451.0f * f6) + f8)) / 1403.0f;
                float f10 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
                float f11 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
                float signum = (100.0f / c06730Of.LJII) * Math.signum(f9) * ((float) Math.pow((float) Math.max(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, (Math.abs(f9) * 27.13d) / (400.0d - Math.abs(f9))), 2.380952380952381d));
                float signum2 = (100.0f / c06730Of.LJII) * Math.signum(f10) * ((float) Math.pow((float) Math.max(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10))), 2.380952380952381d));
                float signum3 = (100.0f / c06730Of.LJII) * Math.signum(f11) * ((float) Math.pow((float) Math.max(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
                float[] fArr = c06730Of.LJI;
                float f12 = signum / fArr[0];
                float f13 = signum2 / fArr[1];
                float f14 = signum3 / fArr[2];
                float[][] fArr2 = C55457Lpd.LJLJI;
                float[] fArr3 = fArr2[0];
                float f15 = (fArr3[2] * f14) + (fArr3[1] * f13) + (fArr3[0] * f12);
                float[] fArr4 = fArr2[1];
                float f16 = (fArr4[2] * f14) + (fArr4[1] * f13) + (fArr4[0] * f12);
                float[] fArr5 = fArr2[2];
                return C07290Qj.LIZIZ(f15, f16, (f14 * fArr5[2]) + (f13 * fArr5[1]) + (f12 * fArr5[0]));
            }
        }
        f = 0.0f;
        float pow3 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, c06730Of.LJFF), 0.73d), 1.1111111111111112d);
        double d22 = (this.LIZ * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d22) + 3.8d)) * 0.25f;
        float pow22 = c06730Of.LIZ * ((float) Math.pow(this.LIZJ / 100.0d, (1.0d / c06730Of.LIZLLL) / c06730Of.LJIIIZ));
        float f32 = cos3 * 3846.1538f * c06730Of.LJ * c06730Of.LIZJ;
        float f42 = pow22 / c06730Of.LIZIZ;
        float sin2 = (float) Math.sin(d22);
        float cos22 = (float) Math.cos(d22);
        float f52 = (((0.305f + f42) * 23.0f) * pow3) / (((pow3 * 108.0f) * sin2) + (((11.0f * pow3) * cos22) + (f32 * 23.0f)));
        float f62 = cos22 * f52;
        float f72 = f52 * sin2;
        float f82 = f42 * 460.0f;
        float f92 = ((288.0f * f72) + ((451.0f * f62) + f82)) / 1403.0f;
        float f102 = ((f82 - (891.0f * f62)) - (261.0f * f72)) / 1403.0f;
        float f112 = ((f82 - (f62 * 220.0f)) - (f72 * 6300.0f)) / 1403.0f;
        float signum4 = (100.0f / c06730Of.LJII) * Math.signum(f92) * ((float) Math.pow((float) Math.max(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, (Math.abs(f92) * 27.13d) / (400.0d - Math.abs(f92))), 2.380952380952381d));
        float signum22 = (100.0f / c06730Of.LJII) * Math.signum(f102) * ((float) Math.pow((float) Math.max(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, (Math.abs(f102) * 27.13d) / (400.0d - Math.abs(f102))), 2.380952380952381d));
        float signum32 = (100.0f / c06730Of.LJII) * Math.signum(f112) * ((float) Math.pow((float) Math.max(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, (Math.abs(f112) * 27.13d) / (400.0d - Math.abs(f112))), 2.380952380952381d));
        float[] fArr6 = c06730Of.LJI;
        float f122 = signum4 / fArr6[0];
        float f132 = signum22 / fArr6[1];
        float f142 = signum32 / fArr6[2];
        float[][] fArr22 = C55457Lpd.LJLJI;
        float[] fArr32 = fArr22[0];
        float f152 = (fArr32[2] * f142) + (fArr32[1] * f132) + (fArr32[0] * f122);
        float[] fArr42 = fArr22[1];
        float f162 = (fArr42[2] * f142) + (fArr42[1] * f132) + (fArr42[0] * f122);
        float[] fArr52 = fArr22[2];
        return C07290Qj.LIZIZ(f152, f162, (f142 * fArr52[2]) + (f132 * fArr52[1]) + (f122 * fArr52[0]));
    }

    public static C0OO LIZIZ(float f, float f2, float f3) {
        C06730Of c06730Of = C06730Of.LJIIJ;
        Math.sqrt(f / 100.0d);
        float f4 = c06730Of.LJIIIIZZ * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r3))) * c06730Of.LIZLLL) / (c06730Of.LIZ + 4.0f));
        float f5 = (3.1415927f * f3) / 180.0f;
        float log = ((float) Math.log((f4 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = f5;
        return new C0OO(f3, f2, f, (1.7f * f) / ((0.007f * f) + 1.0f), log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public C0OO(float f, float f2, float f3, float f4, float f5, float f6) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
        this.LJFF = f6;
    }
}
