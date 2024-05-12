package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fluency_period_duration")
/* loaded from: classes6.dex */
public final class LiveFluencyPeriodDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 3000;
    public static final LiveFluencyPeriodDurationSetting INSTANCE = new LiveFluencyPeriodDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveFluencyPeriodDurationSetting.class);
    }
}
