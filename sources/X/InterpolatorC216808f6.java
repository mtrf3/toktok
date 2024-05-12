package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: X.8f6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class InterpolatorC216808f6 implements Interpolator {
    public final PointF LIZ;
    public final PointF LIZIZ;
    public final PointF LIZJ;
    public final PointF LIZLLL;
    public final PointF LJ;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f;
        for (int i = 1; i < 14; i++) {
            PointF pointF = this.LJ;
            PointF pointF2 = this.LIZ;
            float f3 = pointF2.x * 3.0f;
            pointF.x = f3;
            PointF pointF3 = this.LIZLLL;
            float f4 = ((this.LIZIZ.x - pointF2.x) * 3.0f) - f3;
            pointF3.x = f4;
            PointF pointF4 = this.LIZJ;
            float f5 = (1.0f - pointF.x) - f4;
            pointF4.x = f5;
            float f6 = (((((f5 * f2) + pointF3.x) * f2) + pointF.x) * f2) - f;
            if (Math.abs(f6) < 0.001d) {
                break;
            }
            f2 -= f6 / (((((this.LIZJ.x * 3.0f) * f2) + (this.LIZLLL.x * 2.0f)) * f2) + this.LJ.x);
        }
        PointF pointF5 = this.LJ;
        PointF pointF6 = this.LIZ;
        float f7 = pointF6.y * 3.0f;
        pointF5.y = f7;
        PointF pointF7 = this.LIZLLL;
        float f8 = ((this.LIZIZ.y - pointF6.y) * 3.0f) - f7;
        pointF7.y = f8;
        PointF pointF8 = this.LIZJ;
        float f9 = (1.0f - pointF5.y) - f8;
        pointF8.y = f9;
        return ((((f9 * f2) + pointF7.y) * f2) + pointF5.y) * f2;
    }

    public InterpolatorC216808f6(float f, float f2, float f3, float f4) {
        PointF pointF = new PointF(f, f2);
        PointF pointF2 = new PointF(f3, f4);
        this.LIZJ = new PointF();
        this.LIZLLL = new PointF();
        this.LJ = new PointF();
        float f5 = pointF.x;
        if (f5 >= 0.0f && f5 <= 1.0f) {
            float f6 = pointF2.x;
            if (f6 >= 0.0f && f6 <= 1.0f) {
                this.LIZ = pointF;
                this.LIZIZ = pointF2;
                return;
            }
            throw new IllegalArgumentException("endX value must be in the range [0, 1]");
        }
        throw new IllegalArgumentException("startX value must be in the range [0, 1]");
    }
}
