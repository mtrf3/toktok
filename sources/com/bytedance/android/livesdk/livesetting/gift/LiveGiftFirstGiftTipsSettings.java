package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_first_gift_banner_tips")
/* loaded from: classes6.dex */
public final class LiveGiftFirstGiftTipsSettings {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftFirstGiftTipsSettings INSTANCE = new LiveGiftFirstGiftTipsSettings();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftFirstGiftTipsSettings.class);
    }
}
