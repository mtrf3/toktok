package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;

/* loaded from: classes7.dex */
public final class DUB extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final DUB LJLIL = new DUB();

    public DUB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        long j = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        try {
            FFL.LJIIIZ().getClass();
            j = FFL.LJIILIIL(31744, LivePreviewNetworkSpeedThresholdSetting.DEFAULT, "feed_refresh_when_return_fyp_time_interval");
        } catch (Exception unused) {
        }
        return Long.valueOf(j);
    }
}
