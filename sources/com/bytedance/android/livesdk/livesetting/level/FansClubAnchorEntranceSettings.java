package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_level_anchor_entrance_switch")
/* loaded from: classes6.dex */
public final class FansClubAnchorEntranceSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FansClubAnchorEntranceSettings INSTANCE = new FansClubAnchorEntranceSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FansClubAnchorEntranceSettings.class);
    }
}
