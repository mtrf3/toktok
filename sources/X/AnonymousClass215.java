package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.215, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass215 extends AbstractC65781Prl implements InterfaceC88472Yns<Double, Double> {
    public final /* synthetic */ double LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass215(double d) {
        super(1);
        this.LJLIL = d;
    }

    @Override // X.InterfaceC88472Yns
    public final Double invoke(Double d) {
        double doubleValue = d.doubleValue();
        if (doubleValue < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            doubleValue = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return Double.valueOf(Math.pow(doubleValue, this.LJLIL));
    }
}
