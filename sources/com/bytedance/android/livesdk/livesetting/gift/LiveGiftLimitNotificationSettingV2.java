package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_limit_notification_type")
/* loaded from: classes6.dex */
public final class LiveGiftLimitNotificationSettingV2 {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftLimitNotificationSettingV2 INSTANCE = new LiveGiftLimitNotificationSettingV2();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftLimitNotificationSettingV2.class);
    }
}
