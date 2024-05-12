package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_net_adaptive_slow_speed")
/* loaded from: classes6.dex */
public final class LiveNetAdaptiveSlowSpeedSetting {

    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 1.0f;
    public static final LiveNetAdaptiveSlowSpeedSetting INSTANCE = new LiveNetAdaptiveSlowSpeedSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(LiveNetAdaptiveSlowSpeedSetting.class);
    }
}
