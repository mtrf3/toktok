package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "ttlive_game_landscape_full_screen_optimize")
/* loaded from: classes6.dex */
public final class TtliveGameLandscapeFullScreenOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final TtliveGameLandscapeFullScreenOptimizeSetting INSTANCE = new TtliveGameLandscapeFullScreenOptimizeSetting();

    public final boolean cancelFullScreenWhenLeaveRoom() {
        if (SettingsManager.INSTANCE.getIntValue(TtliveGameLandscapeFullScreenOptimizeSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
