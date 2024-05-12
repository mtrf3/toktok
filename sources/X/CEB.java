package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubsPayoutOnboardingUrlSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.SubsPayoutOnboardingUrlConfig;

/* loaded from: classes6.dex */
public final class CEB extends AbstractC65781Prl implements InterfaceC65784Pro<SubsPayoutOnboardingUrlConfig> {
    public static final CEB LJLIL = new CEB();

    public CEB() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.broadcast.SubsPayoutOnboardingUrlConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SubsPayoutOnboardingUrlConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveSubsPayoutOnboardingUrlSetting.class);
        if (valueSafely == 0) {
            return LiveSubsPayoutOnboardingUrlSetting.DEFAULT;
        }
        return valueSafely;
    }
}
