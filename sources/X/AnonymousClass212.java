package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.212, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass212 extends AbstractC65781Prl implements InterfaceC88472Yns<Double, Double> {
    public static final AnonymousClass212 LJLIL = new AnonymousClass212();

    public AnonymousClass212() {
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
        if (d2 >= 0.0031308049535603718d) {
            d2 = Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d;
            d3 = 0.9478672985781991d;
        } else {
            d3 = 0.07739938080495357d;
        }
        return Double.valueOf(Math.copySign(d2 / d3, doubleValue));
    }
}
