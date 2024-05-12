package X;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* loaded from: classes13.dex */
public final class SJW implements TimeInterpolator {
    public int LIZ;
    public final PointF LIZIZ = new PointF(0.75f, 0.0f);
    public final PointF LIZJ = new PointF(0.65f, 1.0f);

    public static double LIZ(double d, double d2, double d3) {
        double d4 = 1 - d;
        double d5 = d * d;
        double d6 = d4 * d4;
        double d7 = 3;
        return (d5 * d * 1.0d) + C67399Qcl.LIZ(d7, d4, d5, d3, C67399Qcl.LIZ(d6, d7, d, d2, d6 * d4 * LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX));
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        double d = f;
        if (d > 0.2d) {
            f2 = 1.0f;
        } else {
            f2 = (float) (d / 0.2d);
        }
        int i = this.LIZ;
        float f3 = f2;
        while (true) {
            if (i >= 4096) {
                break;
            }
            f3 = (i * 1.0f) / 4096;
            if (LIZ(f3, this.LIZIZ.x, this.LIZJ.x) >= f2) {
                this.LIZ = i;
                break;
            }
            i++;
        }
        double LIZ = LIZ(f3, this.LIZIZ.y, this.LIZJ.y);
        if (LIZ > 0.999d) {
            this.LIZ = 0;
            LIZ = 1.0d;
        }
        return (float) LIZ;
    }
}
