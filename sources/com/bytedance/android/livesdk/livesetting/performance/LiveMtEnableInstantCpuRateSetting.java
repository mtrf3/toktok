package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_mt_enable_instant_cpu_rate")
/* loaded from: classes6.dex */
public final class LiveMtEnableInstantCpuRateSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveMtEnableInstantCpuRateSetting INSTANCE = new LiveMtEnableInstantCpuRateSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMtEnableInstantCpuRateSetting.class);
    }
}
