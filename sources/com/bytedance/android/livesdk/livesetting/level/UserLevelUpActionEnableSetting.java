package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_level_up_all")
/* loaded from: classes6.dex */
public final class UserLevelUpActionEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final UserLevelUpActionEnableSetting INSTANCE = new UserLevelUpActionEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(UserLevelUpActionEnableSetting.class);
    }
}
