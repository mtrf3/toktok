package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_mt_enable_cpu_rate")
/* loaded from: classes6.dex */
public final class LiveMtEnableCpuRateSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveMtEnableCpuRateSetting INSTANCE = new LiveMtEnableCpuRateSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtEnableCpuRateSetting.class);
    }
}
