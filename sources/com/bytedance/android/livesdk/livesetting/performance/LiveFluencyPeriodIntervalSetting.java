package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fluency_period_interval")
/* loaded from: classes6.dex */
public final class LiveFluencyPeriodIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 5000;
    public static final LiveFluencyPeriodIntervalSetting INSTANCE = new LiveFluencyPeriodIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveFluencyPeriodIntervalSetting.class);
    }
}
