package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* loaded from: classes15.dex */
public final class WBN {
    public final double LIZ;
    public final int LIZIZ;
    public double LIZJ = -1.0d;
    public int LIZLLL;

    public WBN(double d) {
        int ceil;
        this.LIZ = d;
        if (d == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            ceil = Integer.MAX_VALUE;
        } else {
            ceil = (int) Math.ceil(1.0d / d);
        }
        this.LIZIZ = ceil;
    }

    public final void LIZ(double d) {
        double d2 = 1.0d - this.LIZ;
        int i = this.LIZLLL;
        if (i > this.LIZIZ) {
            this.LIZJ = Math.exp((Math.log(d) * this.LIZ) + (Math.log(this.LIZJ) * d2));
        } else if (i > 0) {
            double d3 = (d2 * i) / (i + 1.0d);
            this.LIZJ = Math.exp((Math.log(d) * (1.0d - d3)) + (Math.log(this.LIZJ) * d3));
        } else {
            this.LIZJ = d;
        }
        this.LIZLLL++;
    }
}
