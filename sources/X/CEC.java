package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;

/* loaded from: classes6.dex */
public final class CEC extends AbstractC65781Prl implements InterfaceC65784Pro<LiveSubscriptionAnchorUrlConfig> {
    public static final CEC LJLIL = new CEC();

    public CEC() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveSubscriptionAnchorUrlConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveSubscriptionAnchorUrlSetting.class);
        if (valueSafely == 0) {
            return LiveSubscriptionAnchorUrlSetting.DEFAULT;
        }
        return valueSafely;
    }
}
