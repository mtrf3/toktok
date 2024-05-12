package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("go_live_subscription_awareness_bubble_enable")
/* loaded from: classes6.dex */
public final class SubscriptionBubbleSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final SubscriptionBubbleSetting INSTANCE = new SubscriptionBubbleSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(SubscriptionBubbleSetting.class);
    }
}
