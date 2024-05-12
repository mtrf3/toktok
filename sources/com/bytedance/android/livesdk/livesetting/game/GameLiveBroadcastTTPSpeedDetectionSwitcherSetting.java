package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_ttp_game_broadcast_speed_test_switcher")
/* loaded from: classes6.dex */
public final class GameLiveBroadcastTTPSpeedDetectionSwitcherSetting {

    @Group(isDefault = true, value = "default_group")
    public static final int DEFAULT = 0;

    @Group("experiment_group")
    public static final int ENABLE = 1;
    public static final GameLiveBroadcastTTPSpeedDetectionSwitcherSetting INSTANCE = new GameLiveBroadcastTTPSpeedDetectionSwitcherSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(GameLiveBroadcastTTPSpeedDetectionSwitcherSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
