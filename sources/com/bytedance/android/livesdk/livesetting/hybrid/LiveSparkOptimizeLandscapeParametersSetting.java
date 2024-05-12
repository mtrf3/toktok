package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "mt_live_spark_optimize_landscape_parameters")
/* loaded from: classes6.dex */
public final class LiveSparkOptimizeLandscapeParametersSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveSparkOptimizeLandscapeParametersSetting INSTANCE = new LiveSparkOptimizeLandscapeParametersSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSparkOptimizeLandscapeParametersSetting.class);
    }
}
