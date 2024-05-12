package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_broadcast_speed_test_switcher")
/* loaded from: classes6.dex */
public final class GameLiveBroadcastSpeedDetectionSwitcherSetting {

    @Group(isDefault = true, value = "default_group")
    public static final int DEFAULT = 0;

    @Group("experiment_group")
    public static final int ENABLE = 1;
    public static final GameLiveBroadcastSpeedDetectionSwitcherSetting INSTANCE = new GameLiveBroadcastSpeedDetectionSwitcherSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(GameLiveBroadcastSpeedDetectionSwitcherSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
