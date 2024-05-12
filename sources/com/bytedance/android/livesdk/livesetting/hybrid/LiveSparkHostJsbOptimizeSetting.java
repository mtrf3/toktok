package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "mt_live_spark_host_jsb_optimize")
/* loaded from: classes6.dex */
public final class LiveSparkHostJsbOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSparkHostJsbOptimizeSetting INSTANCE = new LiveSparkHostJsbOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSparkHostJsbOptimizeSetting.class);
    }
}
