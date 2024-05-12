package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_entrance_effect_optimize")
/* loaded from: classes6.dex */
public final class LiveEntranceEffectOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveEntranceEffectOptimizeSetting INSTANCE = new LiveEntranceEffectOptimizeSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEntranceEffectOptimizeSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
