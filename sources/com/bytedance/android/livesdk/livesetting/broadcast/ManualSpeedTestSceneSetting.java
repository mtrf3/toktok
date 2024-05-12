package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "manual_speed_test_scene")
/* loaded from: classes6.dex */
public final class ManualSpeedTestSceneSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "tiktok_game_live_manual";
    public static final ManualSpeedTestSceneSetting INSTANCE = new ManualSpeedTestSceneSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(ManualSpeedTestSceneSetting.class);
    }
}
