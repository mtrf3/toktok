package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("game_live_center_opt_setting")
/* loaded from: classes6.dex */
public final class GameLiveCenterOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final GameLiveCenterOptSetting INSTANCE = new GameLiveCenterOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GameLiveCenterOptSetting.class);
    }
}
