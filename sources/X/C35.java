package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceDowngradeSetting;

/* loaded from: classes6.dex */
public final class C35 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35 LJLIL = new C35();

    public C35() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveBroadcastPoorDeviceDowngradeSetting.class));
    }
}
