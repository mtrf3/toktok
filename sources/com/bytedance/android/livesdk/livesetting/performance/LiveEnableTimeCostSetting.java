package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_time_cost")
/* loaded from: classes6.dex */
public final class LiveEnableTimeCostSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableTimeCostSetting INSTANCE = new LiveEnableTimeCostSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableTimeCostSetting.class);
    }
}
