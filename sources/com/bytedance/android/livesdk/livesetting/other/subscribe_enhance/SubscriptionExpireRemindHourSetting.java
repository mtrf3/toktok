package com.bytedance.android.livesdk.livesetting.other.subscribe_enhance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscription_expire_remind_hour")
/* loaded from: classes6.dex */
public final class SubscriptionExpireRemindHourSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 72;
    public static final SubscriptionExpireRemindHourSetting INSTANCE = new SubscriptionExpireRemindHourSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(SubscriptionExpireRemindHourSetting.class);
    }
}
