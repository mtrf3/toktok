package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_use_effect_algorithm_ab")
/* loaded from: classes6.dex */
public final class LiveUseEffectAlgorithmAbSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveUseEffectAlgorithmAbSetting INSTANCE = new LiveUseEffectAlgorithmAbSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveUseEffectAlgorithmAbSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
