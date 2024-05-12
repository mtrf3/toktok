package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_user_level_first_request_grade_api")
/* loaded from: classes6.dex */
public final class UserLevelFirstRequestGradeInfoApiSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final UserLevelFirstRequestGradeInfoApiSetting INSTANCE = new UserLevelFirstRequestGradeInfoApiSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(UserLevelFirstRequestGradeInfoApiSetting.class);
    }
}
