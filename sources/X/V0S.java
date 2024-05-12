package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* loaded from: classes14.dex */
public final class V0S extends AbstractC65781Prl implements InterfaceC65784Pro<Double> {
    public static final V0S LJLIL = new V0S();

    public V0S() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Double invoke() {
        return Double.valueOf(V0Q.Default.nextDouble(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1.0d));
    }
}
