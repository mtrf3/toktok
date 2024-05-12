package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscription_pin_card_audience")
/* loaded from: classes6.dex */
public final class SubscriptionPinCardAudienceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final SubscriptionPinCardAudienceSetting INSTANCE = new SubscriptionPinCardAudienceSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(SubscriptionPinCardAudienceSetting.class) != 0) {
            return true;
        }
        return false;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
