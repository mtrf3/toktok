package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "game_live_platform_har_debug")
/* loaded from: classes6.dex */
public final class GameLivePlatformHarDebugSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final GameLivePlatformHarDebugSetting INSTANCE = new GameLivePlatformHarDebugSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(GameLivePlatformHarDebugSetting.class);
    }
}
