package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "mt_live_opt_spark_global_props")
/* loaded from: classes6.dex */
public final class LiveOptSparkGlobalPropsSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveOptSparkGlobalPropsSetting INSTANCE = new LiveOptSparkGlobalPropsSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveOptSparkGlobalPropsSetting.class);
    }
}
