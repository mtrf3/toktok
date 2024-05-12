package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_user_level_badge")
/* loaded from: classes6.dex */
public final class UserLevelBadgeShowEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final UserLevelBadgeShowEnableSetting INSTANCE = new UserLevelBadgeShowEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(UserLevelBadgeShowEnableSetting.class);
    }
}
