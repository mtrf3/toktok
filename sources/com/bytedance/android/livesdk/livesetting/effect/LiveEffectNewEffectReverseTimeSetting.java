package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_effect_reverse_effect_deadline_timestamp")
/* loaded from: classes6.dex */
public final class LiveEffectNewEffectReverseTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 1666719760000L;
    public static final LiveEffectNewEffectReverseTimeSetting INSTANCE = new LiveEffectNewEffectReverseTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveEffectNewEffectReverseTimeSetting.class);
    }
}
