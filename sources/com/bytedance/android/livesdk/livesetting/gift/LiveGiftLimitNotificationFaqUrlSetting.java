package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_limit_notification_faq_url")
/* loaded from: classes6.dex */
public final class LiveGiftLimitNotificationFaqUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveGiftLimitNotificationFaqUrlSetting INSTANCE = new LiveGiftLimitNotificationFaqUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveGiftLimitNotificationFaqUrlSetting.class);
    }
}
