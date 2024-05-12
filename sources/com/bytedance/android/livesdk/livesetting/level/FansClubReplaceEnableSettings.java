package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_level_replace_setting")
/* loaded from: classes6.dex */
public final class FansClubReplaceEnableSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final FansClubReplaceEnableSettings INSTANCE = new FansClubReplaceEnableSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FansClubReplaceEnableSettings.class);
    }
}
