package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_effect_reverse_no_new_effect")
/* loaded from: classes6.dex */
public final class LiveEffectNewEffectReverseSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveEffectNewEffectReverseSetting INSTANCE = new LiveEffectNewEffectReverseSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEffectNewEffectReverseSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
