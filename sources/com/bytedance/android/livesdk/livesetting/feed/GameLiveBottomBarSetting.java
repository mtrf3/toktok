package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_bottom_bar_setting")
/* loaded from: classes6.dex */
public final class GameLiveBottomBarSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final GameLiveBottomBarSetting INSTANCE = new GameLiveBottomBarSetting();

    @Group("experiment_group")
    public static final boolean ENABLE = true;

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getBooleanValue(GameLiveBottomBarSetting.class) == ENABLE) {
            return true;
        }
        return false;
    }
}
