package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: X.O9p, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class InterpolatorC61445O9p implements Interpolator {
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
                    if (Math.abs(LIZ) < 1.0E-6f) {
                        break;
                    }
                    if (f5 < f) {
                        f4 = f3;
                    } else {
                        f6 = f3;
                    }
                    f3 -= (float) (f7 / LIZ);
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

    public InterpolatorC61445O9p(PointF pointF, PointF pointF2) {
        float f = pointF.x;
        float f2 = 0;
        if (f >= f2 && f <= 1) {
            float f3 = pointF2.x;
            if (f3 >= f2 && f3 <= 1) {
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

    public InterpolatorC61445O9p(float f, float f2) {
        this(new PointF(f, 0.0f), new PointF(f2, 1.0f));
    }
}
