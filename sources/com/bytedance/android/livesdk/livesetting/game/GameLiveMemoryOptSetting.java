package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("game_live_memory_opt_setting")
/* loaded from: classes6.dex */
public final class GameLiveMemoryOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final GameLiveMemoryOptSetting INSTANCE = new GameLiveMemoryOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GameLiveMemoryOptSetting.class);
    }
}
