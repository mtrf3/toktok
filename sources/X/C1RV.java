package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.1RV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1RV extends F9E {
    public final double LJLIL;
    public final double LJLILLLLZI;
    public final double LJLJI;
    public final double LJLJJI;
    public final double LJLJJL;
    public final double LJLJJLL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
    public final double LJLJL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Double.valueOf(this.LJLIL), Double.valueOf(this.LJLILLLLZI), Double.valueOf(this.LJLJI), Double.valueOf(this.LJLJJI), Double.valueOf(this.LJLJJL), Double.valueOf(this.LJLJJLL), Double.valueOf(this.LJLJL)};
    }

    public C1RV(double d, double d2, double d3, double d4, double d5) {
        this.LJLIL = d;
        this.LJLILLLLZI = d2;
        this.LJLJI = d3;
        this.LJLJJI = d4;
        this.LJLJJL = d5;
        if (!Double.isNaN(d2) && !Double.isNaN(d3) && !Double.isNaN(d4) && !Double.isNaN(d5) && !Double.isNaN(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) && !Double.isNaN(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) && !Double.isNaN(d)) {
            if (d5 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d5 <= 1.0d) {
                if (d5 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && (d2 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || d == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX)) {
                    throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
                }
                if (d5 >= 1.0d && d4 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
                }
                if ((d2 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || d == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) && d4 == LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
                }
                if (d4 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    if (d2 >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX && d >= LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        return;
                    } else {
                        throw new IllegalArgumentException("The transfer function must be positive or increasing");
                    }
                }
                throw new IllegalArgumentException("The transfer function must be increasing");
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Parameter d must be in the range [0..1], was ");
            LIZ.append(d5);
            throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
        throw new IllegalArgumentException("Parameters cannot be NaN");
    }
}
