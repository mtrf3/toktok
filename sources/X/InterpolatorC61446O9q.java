package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: X.O9q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class InterpolatorC61446O9q implements Interpolator {
    public final PointF LIZ;
    public final PointF LIZIZ;

    public static float LIZ(float f, float f2, float f3) {
        if (f == 0.0f || f == 1.0f) {
            return f;
        }
        float LIZIZ = C06420Na.LIZIZ(f2, 0.0f, f, 0.0f);
        float LIZIZ2 = C06420Na.LIZIZ(f3, f2, f, f2);
        float LIZIZ3 = C06420Na.LIZIZ(1.0f, f3, f, f3);
        float LIZIZ4 = C06420Na.LIZIZ(LIZIZ2, LIZIZ, f, LIZIZ);
        return (((((LIZIZ3 - LIZIZ2) * f) + LIZIZ2) - LIZIZ4) * f) + LIZIZ4;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        float f3 = 0.0f;
        if (f > 0.0f) {
            if (f >= 1.0f) {
                f3 = 1.0f;
            } else {
                f3 = f;
                float f4 = 0.0f;
                float f5 = 0.0f;
                float f6 = 1.0f;
                for (int i = 0; i < 8; i++) {
                    f5 = LIZ(f3, this.LIZ.x, this.LIZIZ.x);
                    double LIZ = (LIZ(f3 + 1.0E-6f, this.LIZ.x, this.LIZIZ.x) - f5) / 1.0E-6f;
                    float f7 = f5 - f;
                    if (Math.abs(f7) < 1.0E-6f) {
                        break;
                    }
                    if (Math.abs(LIZ) < 9.999999974752427E-7d) {
                        break;
                    }
                    if (f5 < f) {
                        f4 = f3;
                    } else {
                        f6 = f3;
                    }
                    f3 = (float) (f3 - (f7 / LIZ));
                }
                for (int i2 = 0; Math.abs(f5 - f) > 1.0E-6f && i2 < 8; i2++) {
                    if (f5 < f) {
                        f2 = (f3 + f6) / 2.0f;
                        f4 = f3;
                    } else {
                        f2 = (f3 + f4) / 2.0f;
                        f6 = f3;
                    }
                    f3 = f2;
                    f5 = LIZ(f3, this.LIZ.x, this.LIZIZ.x);
                }
            }
        }
        return LIZ(f3, this.LIZ.y, this.LIZIZ.y);
    }

    public InterpolatorC61446O9q(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        if (f >= 0.0f && f <= 1.0f) {
            float f2 = pointF2.x;
            if (f2 >= 0.0f && f2 <= 1.0f) {
                this.LIZ = pointF;
                this.LIZIZ = pointF2;
                new PointF();
                new PointF();
                new PointF();
                return;
            }
            throw new RuntimeException("endX should be in [0, 1]");
        }
        throw new RuntimeException("startX should be in [0, 1]");
    }

    public InterpolatorC61446O9q(double d, double d2, double d3) {
        this(new PointF((float) d, (float) d2), new PointF((float) d3, (float) 1.0d));
    }

    public InterpolatorC61446O9q(float f, float f2, float f3, float f4) {
        this(new PointF(f, f2), new PointF(f3, f4));
    }
}
