package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_top_badge_position")
/* loaded from: classes6.dex */
public final class UserLevelBadgePositionSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final UserLevelBadgePositionSetting INSTANCE = new UserLevelBadgePositionSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(UserLevelBadgePositionSetting.class);
    }
}
