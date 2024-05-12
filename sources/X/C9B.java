package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDowngradeSetting;

/* loaded from: classes6.dex */
public final class C9B extends AbstractC65781Prl implements InterfaceC65784Pro<InterpolatorC83740Wtk> {
    public static final C9B LJLIL = new C9B();

    public C9B() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterpolatorC83740Wtk invoke() {
        if (LiveBroadcastPoorDeviceDowngradeSetting.INSTANCE.enable()) {
            return new InterpolatorC83740Wtk();
        }
        return new C83741Wtl(0.32f, 0.94f, 0.6f, 1.0f);
    }
}
