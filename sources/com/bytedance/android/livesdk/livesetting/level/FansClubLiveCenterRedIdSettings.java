package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_center_red_hot_id")
/* loaded from: classes6.dex */
public final class FansClubLiveCenterRedIdSettings {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final FansClubLiveCenterRedIdSettings INSTANCE = new FansClubLiveCenterRedIdSettings();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(FansClubLiveCenterRedIdSettings.class);
    }
}
