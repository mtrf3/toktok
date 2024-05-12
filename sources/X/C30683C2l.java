package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDelayDurationSetting;

/* renamed from: X.C2l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30683C2l extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C30683C2l LJLIL = new C30683C2l();

    public C30683C2l() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(SettingsManager.INSTANCE.getLongValue(LiveBroadcastPoorDeviceDelayDurationSetting.class));
    }
}
