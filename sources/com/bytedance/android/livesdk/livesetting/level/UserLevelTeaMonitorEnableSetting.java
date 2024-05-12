package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("user_level_tea_monitor_enable")
/* loaded from: classes6.dex */
public final class UserLevelTeaMonitorEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final UserLevelTeaMonitorEnableSetting INSTANCE = new UserLevelTeaMonitorEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(UserLevelTeaMonitorEnableSetting.class);
    }
}
