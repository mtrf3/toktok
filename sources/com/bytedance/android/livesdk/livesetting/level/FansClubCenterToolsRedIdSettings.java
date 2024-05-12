package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_center_tools_red_hot_id")
/* loaded from: classes6.dex */
public final class FansClubCenterToolsRedIdSettings {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final FansClubCenterToolsRedIdSettings INSTANCE = new FansClubCenterToolsRedIdSettings();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(FansClubCenterToolsRedIdSettings.class);
    }
}
