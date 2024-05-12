package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("user_level_grade_info_api_opt_setting")
/* loaded from: classes6.dex */
public final class UserLevelGradeInfoOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final UserLevelGradeInfoOptSetting INSTANCE = new UserLevelGradeInfoOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(UserLevelGradeInfoOptSetting.class);
    }
}
