package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "auto_speed_test_scene")
/* loaded from: classes6.dex */
public final class AutoSpeedTestSceneSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "tiktok_game_live_auto";
    public static final AutoSpeedTestSceneSetting INSTANCE = new AutoSpeedTestSceneSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(AutoSpeedTestSceneSetting.class);
    }
}
