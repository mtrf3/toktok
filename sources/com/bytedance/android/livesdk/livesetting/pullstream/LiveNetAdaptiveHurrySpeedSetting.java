package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_net_adaptive_hurry_speed")
/* loaded from: classes6.dex */
public final class LiveNetAdaptiveHurrySpeedSetting {

    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 1.0f;
    public static final LiveNetAdaptiveHurrySpeedSetting INSTANCE = new LiveNetAdaptiveHurrySpeedSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(LiveNetAdaptiveHurrySpeedSetting.class);
    }
}
