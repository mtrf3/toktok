package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_limit_notification_enable")
/* loaded from: classes6.dex */
public final class LiveGiftLimitNotificationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftLimitNotificationSetting INSTANCE = new LiveGiftLimitNotificationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftLimitNotificationSetting.class);
    }
}
