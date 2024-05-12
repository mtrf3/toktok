package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "game_live_quick_speed_test")
/* loaded from: classes6.dex */
public final class GameLiveQuickSpeedTestSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("contrast group")
    public static final int GROUP_1 = 1;

    @Group("experiment group")
    public static final int GROUP_2 = 2;
    public static final GameLiveQuickSpeedTestSetting INSTANCE = new GameLiveQuickSpeedTestSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(GameLiveQuickSpeedTestSetting.class);
    }

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(GameLiveQuickSpeedTestSetting.class) == 2) {
            return true;
        }
        return false;
    }
}
