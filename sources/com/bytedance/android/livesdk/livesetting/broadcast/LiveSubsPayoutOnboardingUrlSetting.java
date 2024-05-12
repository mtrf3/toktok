package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C5H3;
import X.CEB;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("payout_onboarding_url")
/* loaded from: classes6.dex */
public final class LiveSubsPayoutOnboardingUrlSetting {
    public static final LiveSubsPayoutOnboardingUrlSetting INSTANCE = new LiveSubsPayoutOnboardingUrlSetting();

    @Group(isDefault = true, value = "default group")
    public static final SubsPayoutOnboardingUrlConfig DEFAULT = new SubsPayoutOnboardingUrlConfig(null, 1, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(CEB.LJLIL);

    public static final String payoutOnboardingPopup() {
        return INSTANCE.getSettingValue().payoutOnboardingPopup;
    }

    public final SubsPayoutOnboardingUrlConfig getSettingValue() {
        return (SubsPayoutOnboardingUrlConfig) settingValue$delegate.getValue();
    }
}
