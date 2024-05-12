package X;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DIJ {
    public final Path LIZ = new Path();
    public final PointF LIZIZ = new PointF();
    public final PointF LIZJ = new PointF();
    public final PointF LIZLLL = new PointF();
    public final PointF LJ = new PointF();

    public final void LIZLLL() {
        PointF pointF = this.LIZIZ;
        PointF pointF2 = this.LIZLLL;
        pointF.x = pointF2.x;
        pointF.y = pointF2.y;
        PointF pointF3 = this.LIZJ;
        pointF3.x = pointF2.x;
        pointF3.y = pointF2.y;
        this.LIZ.close();
        Path path = this.LIZ;
        PointF pointF4 = this.LIZIZ;
        path.moveTo(pointF4.x, pointF4.y);
    }

    public final void LJI(float f) {
        this.LIZ.lineTo(f, this.LIZIZ.y);
        this.LIZIZ.x = f;
    }

    public final void LJIIJJI(float f) {
        this.LIZ.rLineTo(f, 0.0f);
        this.LIZIZ.x += f;
    }

    public final void LJIILL(float f) {
        this.LIZ.rLineTo(0.0f, f);
        this.LIZIZ.y += f;
    }

    public final void LJIIZILJ(Path.FillType ft) {
        o.LJIIIZ(ft, "ft");
        this.LIZ.setFillType(ft);
    }

    public final void LJIJ(float f) {
        this.LIZ.lineTo(this.LIZIZ.x, f);
        this.LIZIZ.y = f;
    }

    public final void LJII(float f, float f2) {
        this.LIZ.lineTo(f, f2);
        PointF pointF = this.LIZIZ;
        pointF.x = f;
        pointF.y = f2;
    }

    public final void LJIIIIZZ(float f, float f2) {
        PointF pointF = this.LIZIZ;
        pointF.x = f;
        pointF.y = f2;
        this.LIZ.moveTo(f, f2);
        PointF pointF2 = this.LIZLLL;
        PointF pointF3 = this.LIZIZ;
        pointF2.x = pointF3.x;
        pointF2.y = pointF3.y;
    }

    public final void LJIIL(float f, float f2) {
        this.LIZ.rLineTo(f, f2);
        PointF pointF = this.LIZIZ;
        pointF.x += f;
        pointF.y += f2;
    }

    public final void LJIILIIL(float f, float f2) {
        PointF pointF = this.LIZIZ;
        pointF.x += f;
        pointF.y += f2;
        this.LIZ.rMoveTo(f, f2);
        PointF pointF2 = this.LIZLLL;
        PointF pointF3 = this.LIZIZ;
        pointF2.x = pointF3.x;
        pointF2.y = pointF3.y;
    }

    public final void LIZ(float f, float f2, float f3, Path.Direction dir) {
        o.LJIIIZ(dir, "dir");
        this.LIZ.addCircle(f, f2, f3, dir);
    }

    public final void LIZIZ(RectF rectF, float f, float f2, Path.Direction dir) {
        o.LJIIIZ(dir, "dir");
        this.LIZ.addRoundRect(rectF, f, f2, dir);
    }

    public final void LJIILJJIL(float f, float f2, float f3, float f4, boolean z) {
        if (z) {
            PointF pointF = this.LJ;
            PointF pointF2 = this.LIZIZ;
            float f5 = pointF2.x;
            PointF pointF3 = this.LIZJ;
            pointF.x = f5 - pointF3.x;
            pointF.y = pointF2.y - pointF3.y;
        } else {
            PointF pointF4 = this.LJ;
            pointF4.x = 0.0f;
            pointF4.y = 0.0f;
        }
        Path path = this.LIZ;
        PointF pointF5 = this.LJ;
        path.rCubicTo(pointF5.x, pointF5.y, f, f2, f3, f4);
        PointF pointF6 = this.LIZJ;
        PointF pointF7 = this.LIZIZ;
        pointF6.x = pointF7.x + f;
        pointF6.y = pointF7.y + f2;
        pointF7.x += f3;
        pointF7.y += f4;
    }

    public final void LJIILLIIL(float f, float f2, float f3, float f4, boolean z) {
        if (z) {
            PointF pointF = this.LJ;
            float f5 = 2;
            PointF pointF2 = this.LIZIZ;
            float f6 = pointF2.x * f5;
            PointF pointF3 = this.LIZJ;
            pointF.x = f6 - pointF3.x;
            pointF.y = (f5 * pointF2.y) - pointF3.y;
        } else {
            PointF pointF4 = this.LJ;
            PointF pointF5 = this.LIZIZ;
            pointF4.x = pointF5.x;
            pointF4.y = pointF5.y;
        }
        Path path = this.LIZ;
        PointF pointF6 = this.LJ;
        path.cubicTo(pointF6.x, pointF6.y, f, f2, f3, f4);
        PointF pointF7 = this.LIZJ;
        pointF7.x = f;
        pointF7.y = f2;
        PointF pointF8 = this.LIZIZ;
        pointF8.x = f3;
        pointF8.y = f4;
    }

    public final void LIZJ(float f, float f2, boolean z, boolean z2, float f3, float f4) {
        Path path = this.LIZ;
        PointF pointF = this.LIZIZ;
        LJFF(path, pointF.x, pointF.y, f3, f4, f, f2, 0.0f, z, z2);
        PointF pointF2 = this.LIZIZ;
        pointF2.x = f3;
        pointF2.y = f4;
        PointF pointF3 = this.LIZJ;
        pointF3.x = f3;
        pointF3.y = f4;
    }

    public final void LJ(float f, float f2, float f3, float f4, float f5, float f6) {
        this.LIZ.cubicTo(f, f2, f3, f4, f5, f6);
        PointF pointF = this.LIZJ;
        pointF.x = f3;
        pointF.y = f4;
        PointF pointF2 = this.LIZIZ;
        pointF2.x = f5;
        pointF2.y = f6;
    }

    public final void LJIIIZ(float f, float f2, boolean z, boolean z2, float f3, float f4) {
        PointF pointF = this.LIZIZ;
        float f5 = pointF.x;
        float f6 = f3 + f5;
        float f7 = pointF.y;
        float f8 = f4 + f7;
        LJFF(this.LIZ, f5, f7, f6, f8, f, f2, 0.0f, z, z2);
        PointF pointF2 = this.LIZIZ;
        pointF2.x = f6;
        pointF2.y = f8;
        PointF pointF3 = this.LIZJ;
        pointF3.x = f6;
        pointF3.y = f8;
    }

    public final void LJIIJ(float f, float f2, float f3, float f4, float f5, float f6) {
        this.LIZ.rCubicTo(f, f2, f3, f4, f5, f6);
        PointF pointF = this.LIZJ;
        PointF pointF2 = this.LIZIZ;
        pointF.x = pointF2.x + f3;
        pointF.y = pointF2.y + f4;
        pointF2.x += f5;
        pointF2.y += f6;
    }

    public static void LJFF(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        boolean z3;
        double d10 = d;
        double d11 = d2;
        double d12 = (d7 / 180) * 3.141592653589793d;
        double cos = Math.cos(d12);
        double sin = Math.sin(d12);
        double LIZ = C7MY.LIZ(d11, sin, d10 * cos, d5);
        double LIZ2 = C7MY.LIZ(d11, cos, (-d10) * sin, d6);
        double LIZ3 = C7MY.LIZ(d4, sin, d3 * cos, d5);
        double LIZ4 = C7MY.LIZ(d4, cos, (-d3) * sin, d6);
        double d13 = LIZ - LIZ3;
        double d14 = LIZ2 - LIZ4;
        double d15 = 2;
        double d16 = (LIZ + LIZ3) / d15;
        double d17 = (LIZ2 + LIZ4) / d15;
        double d18 = (d14 * d14) + (d13 * d13);
        if (d18 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            return;
        }
        double d19 = (1.0d / d18) - 0.25d;
        if (d19 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            double sqrt = (float) (Math.sqrt(d18) / 1.99999d);
            LJFF(path, d10, d11, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d19);
        double d20 = d13 * sqrt2;
        double d21 = sqrt2 * d14;
        if (z == z2) {
            d8 = d16 - d21;
            d9 = d17 + d20;
        } else {
            d8 = d16 + d21;
            d9 = d17 - d20;
        }
        double atan2 = Math.atan2(LIZ2 - d9, LIZ - d8);
        double atan22 = Math.atan2(LIZ4 - d9, LIZ3 - d8) - atan2;
        if (atan22 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            if (atan22 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d22 = d8 * d5;
        double d23 = d9 * d6;
        double d24 = (d22 * cos) - (d23 * sin);
        double d25 = (d23 * cos) + (d22 * sin);
        double d26 = 4;
        int ceil = (int) Math.ceil(Math.abs((atan22 * d26) / 3.141592653589793d));
        double cos2 = Math.cos(d12);
        double sin2 = Math.sin(d12);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d27 = -d5;
        double d28 = d27 * cos2;
        double d29 = d6 * sin2;
        double d30 = (d28 * sin3) - (d29 * cos3);
        double d31 = d27 * sin2;
        double d32 = d6 * cos2;
        double d33 = (cos3 * d32) + (sin3 * d31);
        double d34 = atan22 / ceil;
        if (ceil > 0) {
            int i = 0;
            while (true) {
                i++;
                double d35 = atan2 + d34;
                double sin4 = Math.sin(d35);
                double cos4 = Math.cos(d35);
                double LIZ5 = C207798Dn.LIZ(d5, cos2, cos4, d24) - (d29 * sin4);
                double LIZ6 = (d32 * sin4) + C207798Dn.LIZ(d5, sin2, cos4, d25);
                double d36 = (d28 * sin4) - (d29 * cos4);
                double d37 = (cos4 * d32) + (sin4 * d31);
                double d38 = d35 - atan2;
                double tan = Math.tan(d38 / d15);
                double sqrt3 = ((Math.sqrt(((3.0d * tan) * tan) + d26) - 1) * Math.sin(d38)) / 3;
                path.cubicTo((float) ((d30 * sqrt3) + d10), (float) ((d33 * sqrt3) + d11), (float) (LIZ5 - (sqrt3 * d36)), (float) (LIZ6 - (sqrt3 * d37)), (float) LIZ5, (float) LIZ6);
                if (i >= ceil) {
                    return;
                }
                d10 = LIZ5;
                atan2 = d35;
                d33 = d37;
                d30 = d36;
                d11 = LIZ6;
            }
        }
    }
}
