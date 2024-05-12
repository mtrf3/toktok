package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.213, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass213 extends AbstractC65781Prl implements InterfaceC88472Yns<Double, Double> {
    public static final AnonymousClass213 LJLIL = new AnonymousClass213();

    public AnonymousClass213() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Double invoke(Double d) {
        double d2;
        double d3;
        double doubleValue = d.doubleValue();
        if (doubleValue < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            d2 = -doubleValue;
        } else {
            d2 = doubleValue;
        }
        if (d2 >= 0.04045d) {
            d3 = Math.pow((0.9478672985781991d * d2) + 0.05213270142180095d, 2.4d);
        } else {
            d3 = d2 * 0.07739938080495357d;
        }
        return Double.valueOf(Math.copySign(d3, doubleValue));
    }
}
