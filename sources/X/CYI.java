package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceDisplayStrategySetting;

/* loaded from: classes6.dex */
public final class CYI extends AbstractC65781Prl implements InterfaceC65784Pro<OnlineAudienceDisplayStrategySetting.Config> {
    public static final CYI LJLIL = new CYI();

    public CYI() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceDisplayStrategySetting$Config, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final OnlineAudienceDisplayStrategySetting.Config invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(OnlineAudienceDisplayStrategySetting.class);
        if (valueSafely == 0) {
            return OnlineAudienceDisplayStrategySetting.DEFAULT;
        }
        return valueSafely;
    }
}
