package X;

import android.animation.TimeInterpolator;
import android.graphics.PointF;

/* renamed from: X.ZrQ, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91240ZrQ implements TimeInterpolator {
    public final PointF LIZ;
    public final PointF LIZIZ;
    public final PointF LIZJ;
    public final PointF LIZLLL;
    public final PointF LJ;

    public C91240ZrQ() {
        float f = C91239ZrP.LIZ()[0];
        float f2 = C91239ZrP.LIZ()[1];
        float f3 = C91239ZrP.LIZ()[2];
        float f4 = C91239ZrP.LIZ()[3];
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
            } else {
                "end x must be in the range [0, 1]".toString();
                throw new IllegalArgumentException("end x must be in the range [0, 1]");
            }
        }
        "start x must be in the range [0, 1]".toString();
        throw new IllegalArgumentException("start x must be in the range [0, 1]");
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f;
        for (int i = 1; i < 14; i++) {
            PointF pointF = this.LJ;
            float f3 = 3;
            PointF pointF2 = this.LIZ;
            float f4 = pointF2.x * f3;
            pointF.x = f4;
            PointF pointF3 = this.LIZLLL;
            float f5 = ((this.LIZIZ.x - pointF2.x) * f3) - f4;
            pointF3.x = f5;
            PointF pointF4 = this.LIZJ;
            float f6 = (1 - pointF.x) - f5;
            pointF4.x = f6;
            float f7 = ((pointF.x + ((pointF3.x + (f6 * f2)) * f2)) * f2) - f;
            if (Math.abs(f7) < 0.001d) {
                break;
            }
            f2 -= f7 / (((((f3 * this.LIZJ.x) * f2) + (2 * this.LIZLLL.x)) * f2) + this.LJ.x);
        }
        PointF pointF5 = this.LJ;
        float f8 = 3;
        PointF pointF6 = this.LIZ;
        float f9 = pointF6.y * f8;
        pointF5.y = f9;
        PointF pointF7 = this.LIZLLL;
        float f10 = (f8 * (this.LIZIZ.y - pointF6.y)) - f9;
        pointF7.y = f10;
        PointF pointF8 = this.LIZJ;
        float f11 = (1 - f10) - pointF5.y;
        pointF8.y = f11;
        return ((((f11 * f2) + pointF7.y) * f2) + pointF5.y) * f2;
    }
}
