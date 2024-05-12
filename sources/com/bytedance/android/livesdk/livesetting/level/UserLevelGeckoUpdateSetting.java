package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("user_level_gecko_update_time_interval")
/* loaded from: classes6.dex */
public final class UserLevelGeckoUpdateSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 140;
    public static final UserLevelGeckoUpdateSetting INSTANCE = new UserLevelGeckoUpdateSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(UserLevelGeckoUpdateSetting.class);
    }
}
