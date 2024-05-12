package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "user_level_gift_pannel_avatar_show_switch")
/* loaded from: classes6.dex */
public final class UserLevelGiftPannelAvatarShowSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final UserLevelGiftPannelAvatarShowSwitchSetting INSTANCE = new UserLevelGiftPannelAvatarShowSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(UserLevelGiftPannelAvatarShowSwitchSetting.class);
    }
}
