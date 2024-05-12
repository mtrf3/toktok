package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("replace_setting")
/* loaded from: classes6.dex */
public final class UserLevelReplaceEnableSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final UserLevelReplaceEnableSettings INSTANCE = new UserLevelReplaceEnableSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(UserLevelReplaceEnableSettings.class);
    }
}
