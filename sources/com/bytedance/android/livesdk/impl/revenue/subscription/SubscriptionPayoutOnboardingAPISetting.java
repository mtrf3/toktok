package com.bytedance.android.livesdk.impl.revenue.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("subscription_payout_onboarding_new_api")
/* loaded from: classes6.dex */
public final class SubscriptionPayoutOnboardingAPISetting {
    public static final int $stable = 0;

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final SubscriptionPayoutOnboardingAPISetting INSTANCE = new SubscriptionPayoutOnboardingAPISetting();

    public final boolean useNewAPI() {
        return SettingsManager.INSTANCE.getBooleanValue(SubscriptionPayoutOnboardingAPISetting.class);
    }
}
