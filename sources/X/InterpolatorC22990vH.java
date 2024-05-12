package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.0vH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class InterpolatorC22990vH implements Interpolator {
    public int LIZ;
    public final PointF LIZIZ;
    public final PointF LIZJ;

    public static double LIZ(double d, double d2, double d3) {
        double d4 = 1.0d - d;
        double d5 = d * d;
        double d6 = d4 * d4;
        return (d5 * d * 1.0d) + C67399Qcl.LIZ(d4, 3.0d, d5, d3, C67399Qcl.LIZ(d6, 3.0d, d, d2, d6 * d4 * LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
    }

    public InterpolatorC22990vH() {
        this.LIZIZ = new PointF();
        this.LIZJ = new PointF();
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = this.LIZ;
        float f2 = f;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f2 = (i * 1.0f) / 4096.0f;
            if (LIZ(f2, this.LIZIZ.x, this.LIZJ.x) >= f) {
                this.LIZ = i;
                break;
            }
            i++;
        }
        double LIZ = LIZ(f2, this.LIZIZ.y, this.LIZJ.y);
        if (LIZ > 0.999d) {
            this.LIZ = 0;
            LIZ = 1.0d;
        }
        return (float) LIZ;
    }

    public InterpolatorC22990vH(float f, float f2, float f3, float f4) {
        PointF pointF = new PointF();
        this.LIZIZ = pointF;
        PointF pointF2 = new PointF();
        this.LIZJ = pointF2;
        pointF.x = f;
        pointF.y = f2;
        pointF2.x = f3;
        pointF2.y = f4;
    }
}
