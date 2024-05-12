package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;

@SettingsKey(preciseExperiment = false, value = "live_level_system_resource")
/* loaded from: classes6.dex */
public final class LiveLevelSystemResourceSetting {
    public static final LiveLevelSystemResourceSetting INSTANCE = new LiveLevelSystemResourceSetting();

    @Group(isDefault = true, value = "default group")
    public static final LevelSystemResourceConfig DEFAULT = new LevelSystemResourceConfig(0, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null);

    public final LevelSystemResourceConfig getLevelSystemResConfig() {
        LevelSystemResourceConfig levelSystemResourceConfig = (LevelSystemResourceConfig) SettingsManager.INSTANCE.getValueSafely(LiveLevelSystemResourceSetting.class);
        if (levelSystemResourceConfig == null) {
            return DEFAULT;
        }
        return levelSystemResourceConfig;
    }
}
