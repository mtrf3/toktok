package com.bytedance.android.livesdk.livesetting.other.subscribe_enhance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscription_audience_entrance_enhance")
/* loaded from: classes6.dex */
public final class SubscriptionAudienceEntranceEnhanceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final SubscriptionAudienceEntranceEnhanceSetting INSTANCE = new SubscriptionAudienceEntranceEnhanceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(SubscriptionAudienceEntranceEnhanceSetting.class);
    }
}
