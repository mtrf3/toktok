package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_effect_resolution_adapt")
/* loaded from: classes6.dex */
public final class LiveEffectResolutionAdaptionSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveEffectResolutionAdaptionSetting INSTANCE = new LiveEffectResolutionAdaptionSetting();

    public final boolean isEnabled() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEffectResolutionAdaptionSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
