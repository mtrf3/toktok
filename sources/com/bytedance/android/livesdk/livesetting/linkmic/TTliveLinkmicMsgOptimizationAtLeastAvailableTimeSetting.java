package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_linkmic_msg_optimization_at_least_available_time")
/* loaded from: classes6.dex */
public final class TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 5;
    public static final TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting INSTANCE = new TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(TTliveLinkmicMsgOptimizationAtLeastAvailableTimeSetting.class);
    }
}
