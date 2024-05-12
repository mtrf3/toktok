package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* renamed from: X.313, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass313 extends AbstractC65781Prl implements InterfaceC65784Pro<Double> {
    public static final AnonymousClass313 LJLIL = new AnonymousClass313();

    public AnonymousClass313() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Double invoke() {
        return Double.valueOf(V0Q.Default.nextDouble(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 1.0d));
    }
}
