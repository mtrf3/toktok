package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_level_audience_entrance_switch")
/* loaded from: classes6.dex */
public final class FansClubAudienceEntranceSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FansClubAudienceEntranceSettings INSTANCE = new FansClubAudienceEntranceSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FansClubAudienceEntranceSettings.class);
    }
}
