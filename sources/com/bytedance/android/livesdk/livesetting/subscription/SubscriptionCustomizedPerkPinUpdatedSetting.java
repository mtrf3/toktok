package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("subscription_customized_perks_pin_updated")
/* loaded from: classes6.dex */
public final class SubscriptionCustomizedPerkPinUpdatedSetting {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 0;
    public static final SubscriptionCustomizedPerkPinUpdatedSetting INSTANCE = new SubscriptionCustomizedPerkPinUpdatedSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(SubscriptionCustomizedPerkPinUpdatedSetting.class) != 0) {
            return true;
        }
        return false;
    }
}
