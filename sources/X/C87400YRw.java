package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.util.Locale;

/* renamed from: X.YRw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87400YRw {
    public double LIZ;
    public double LIZIZ;
    public double LIZJ;
    public double LIZLLL;

    public final void LIZJ() {
        double d = this.LIZ;
        double d2 = this.LIZIZ;
        double d3 = (d2 * d2) + (d * d);
        double d4 = this.LIZJ;
        double d5 = (d4 * d4) + d3;
        double d6 = this.LIZLLL;
        double sqrt = Math.sqrt((d6 * d6) + d5);
        if (sqrt == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return;
        }
        this.LIZ /= sqrt;
        this.LIZIZ /= sqrt;
        this.LIZJ /= sqrt;
        this.LIZLLL /= sqrt;
    }

    public C87400YRw() {
        this.LIZJ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LIZIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        this.LIZLLL = 1.0d;
    }

    public final String toString() {
        return C16880lQ.LLLZI(Locale.getDefault(), "%.5f i + %.5f j + %.5f k + %.5f", new Object[]{Double.valueOf(this.LIZ), Double.valueOf(this.LIZIZ), Double.valueOf(this.LIZJ), Double.valueOf(this.LIZLLL)});
    }

    public C87400YRw(float[] fArr) {
        boolean z;
        boolean z2;
        double d;
        double d2;
        double d3;
        double d4;
        double d5 = fArr[0];
        double d6 = fArr[4];
        double d7 = fArr[8];
        double d8 = fArr[1];
        double d9 = fArr[5];
        double d10 = fArr[9];
        double d11 = fArr[2];
        double d12 = fArr[6];
        double d13 = fArr[10];
        double d14 = d5 + d9 + d13;
        if (d14 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            double sqrt = Math.sqrt(d14 + 1.0d) * 2.0d;
            d = 0.25d * sqrt;
            d3 = (d12 - d10) / sqrt;
            d4 = (d7 - d11) / sqrt;
            d2 = (d8 - d6) / sqrt;
        } else {
            if (d5 > d9) {
                z = true;
            } else {
                z = false;
            }
            if (d5 > d13) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z & z2) {
                double sqrt2 = Math.sqrt(((d5 + 1.0d) - d9) - d13) * 2.0d;
                double d15 = (d6 + d8) / sqrt2;
                d2 = (d7 + d11) / sqrt2;
                d4 = d15;
                d = (d12 - d10) / sqrt2;
                d3 = sqrt2 * 0.25d;
            } else if (d9 > d13) {
                double sqrt3 = Math.sqrt(((d9 + 1.0d) - d5) - d13) * 2.0d;
                double d16 = (d6 + d8) / sqrt3;
                d = (d7 - d11) / sqrt3;
                d4 = sqrt3 * 0.25d;
                d2 = (d10 + d12) / sqrt3;
                d3 = d16;
            } else {
                double sqrt4 = Math.sqrt(((d13 + 1.0d) - d5) - d9) * 2.0d;
                double d17 = (d10 + d12) / sqrt4;
                d = (d8 - d6) / sqrt4;
                d2 = sqrt4 * 0.25d;
                d3 = (d7 + d11) / sqrt4;
                d4 = d17;
            }
        }
        this.LIZ = d3;
        this.LIZIZ = d4;
        this.LIZJ = d2;
        this.LIZLLL = d;
        LIZJ();
    }

    public final C87400YRw LJ(C87400YRw c87400YRw) {
        double d = c87400YRw.LIZLLL;
        double d2 = this.LIZ;
        double d3 = c87400YRw.LIZ;
        double d4 = this.LIZLLL;
        double d5 = c87400YRw.LIZJ;
        double d6 = this.LIZIZ;
        double d7 = c87400YRw.LIZIZ;
        double d8 = this.LIZJ;
        double d9 = d3 * d8;
        return new C87400YRw(((d5 * d6) + ((d3 * d4) + (d * d2))) - (d7 * d8), (d9 + ((d7 * d4) + (d * d6))) - (d5 * d2), ((d7 * d2) + ((d5 * d4) + (d * d8))) - (d3 * d6), (((d * d4) - (d3 * d2)) - (d7 * d6)) - (d5 * d8));
    }

    public static C87401YRx LIZ(C87401YRx c87401YRx, C87400YRw c87400YRw) {
        C87401YRx c87401YRx2 = new C87401YRx(c87400YRw.LIZ, c87400YRw.LIZIZ, c87400YRw.LIZJ);
        C87401YRx LIZ = C87401YRx.LIZ(c87401YRx2, c87401YRx);
        LIZ.LJ(2.0d);
        double d = c87400YRw.LIZLLL;
        C87401YRx c87401YRx3 = new C87401YRx(LIZ.LIZ * d, LIZ.LIZIZ * d, LIZ.LIZJ * d);
        C87401YRx c87401YRx4 = new C87401YRx(c87401YRx.LIZ + c87401YRx3.LIZ, c87401YRx.LIZIZ + c87401YRx3.LIZIZ, c87401YRx.LIZJ + c87401YRx3.LIZJ);
        C87401YRx LIZ2 = C87401YRx.LIZ(c87401YRx2, LIZ);
        return new C87401YRx(c87401YRx4.LIZ + LIZ2.LIZ, c87401YRx4.LIZIZ + LIZ2.LIZIZ, LIZ2.LIZJ + c87401YRx4.LIZJ);
    }

    public static C87400YRw LIZIZ(C87401YRx c87401YRx, double d) {
        if (!c87401YRx.LIZLLL()) {
            return new C87400YRw();
        }
        double d2 = d / 2.0d;
        double sin = Math.sin(d2);
        return new C87400YRw(c87401YRx.LIZ * sin, c87401YRx.LIZIZ * sin, c87401YRx.LIZJ * sin, Math.cos(d2));
    }

    public static C87400YRw LIZLLL(C87401YRx c87401YRx, C87401YRx c87401YRx2) {
        C87401YRx LIZ;
        double sqrt = Math.sqrt(C87401YRx.LIZIZ(c87401YRx2, c87401YRx2) * C87401YRx.LIZIZ(c87401YRx, c87401YRx));
        double LIZIZ = C87401YRx.LIZIZ(c87401YRx, c87401YRx2) + sqrt;
        if (LIZIZ < sqrt * 9.9999998245167E-14d) {
            if (Math.abs(c87401YRx.LIZ) > Math.abs(c87401YRx.LIZJ)) {
                LIZ = new C87401YRx(-c87401YRx.LIZIZ, c87401YRx.LIZ, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            } else {
                LIZ = new C87401YRx(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, -c87401YRx.LIZJ, c87401YRx.LIZIZ);
            }
            LIZIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        } else {
            LIZ = C87401YRx.LIZ(c87401YRx, c87401YRx2);
        }
        return new C87400YRw(LIZ.LIZ, LIZ.LIZIZ, LIZ.LIZJ, LIZIZ);
    }

    public C87400YRw(double d, double d2, double d3, double d4) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
        this.LIZLLL = d4;
        LIZJ();
    }
}
