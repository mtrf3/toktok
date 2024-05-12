package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_live_memory_leak_opt")
/* loaded from: classes6.dex */
public final class GameLiveMemoryLeakOptSetting {

    @Group(isDefault = true, value = "default_group")
    public static final boolean DEFAULT = false;
    public static final GameLiveMemoryLeakOptSetting INSTANCE = new GameLiveMemoryLeakOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GameLiveMemoryLeakOptSetting.class);
    }
}
