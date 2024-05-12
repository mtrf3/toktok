package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.BadPhonesWatchLiveCommonUIConfig;
import com.bytedance.android.livesdk.livesetting.performance.degrade.BadPhonesWatchLiveCommonUIOptSetting;

/* loaded from: classes6.dex */
public final class CTL extends AbstractC65781Prl implements InterfaceC65784Pro<BadPhonesWatchLiveCommonUIConfig> {
    public static final CTL LJLIL = new CTL();

    public CTL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.performance.degrade.BadPhonesWatchLiveCommonUIConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final BadPhonesWatchLiveCommonUIConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(BadPhonesWatchLiveCommonUIOptSetting.class);
        if (valueSafely == 0) {
            return new BadPhonesWatchLiveCommonUIConfig();
        }
        return valueSafely;
    }
}
