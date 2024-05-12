package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_level_show_top_two_badge_enable")
/* loaded from: classes6.dex */
public final class FansClubShowTwoBadgeEnableSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FansClubShowTwoBadgeEnableSettings INSTANCE = new FansClubShowTwoBadgeEnableSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FansClubShowTwoBadgeEnableSettings.class);
    }
}
