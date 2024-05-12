package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_mt_enable_use_proc_file_cpu_rate")
/* loaded from: classes6.dex */
public final class LiveMtEnableUseProcFileCpuRateSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMtEnableUseProcFileCpuRateSetting INSTANCE = new LiveMtEnableUseProcFileCpuRateSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtEnableUseProcFileCpuRateSetting.class);
    }
}
