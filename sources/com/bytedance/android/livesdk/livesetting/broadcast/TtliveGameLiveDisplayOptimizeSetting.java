package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "ttlive_game_live_display_optimize")
/* loaded from: classes6.dex */
public final class TtliveGameLiveDisplayOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final TtliveGameLiveDisplayOptimizeSetting INSTANCE = new TtliveGameLiveDisplayOptimizeSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(TtliveGameLiveDisplayOptimizeSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
