package com.bytedance.android.livesdk.livesetting.other.subscribe;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_subscription")
/* loaded from: classes6.dex */
public final class LiveSubscriptionSetting {
    public static final LiveSubscriptionSetting INSTANCE = new LiveSubscriptionSetting();

    @Group(isDefault = true, value = "default group")
    public static final SubscriptionConfig DEFAULT = new SubscriptionConfig(0, 0, 0, 7, null);

    public final SubscriptionConfig getValue() {
        SubscriptionConfig subscriptionConfig = (SubscriptionConfig) SettingsManager.INSTANCE.getValueSafely(LiveSubscriptionSetting.class);
        if (subscriptionConfig == null) {
            return DEFAULT;
        }
        return subscriptionConfig;
    }
}
