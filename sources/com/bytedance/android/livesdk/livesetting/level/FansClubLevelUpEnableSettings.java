package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_level_update_switch")
/* loaded from: classes6.dex */
public final class FansClubLevelUpEnableSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final FansClubLevelUpEnableSettings INSTANCE = new FansClubLevelUpEnableSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FansClubLevelUpEnableSettings.class);
    }
}
