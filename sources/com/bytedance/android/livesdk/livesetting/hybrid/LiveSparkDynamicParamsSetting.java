package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_spark_dynamic_params")
/* loaded from: classes6.dex */
public final class LiveSparkDynamicParamsSetting {
    public static final LiveSparkDynamicParamsSetting INSTANCE = new LiveSparkDynamicParamsSetting();

    @Group(isDefault = true, value = "default group")
    public static final SparkDynamicParam[] DEFAULT = new SparkDynamicParam[0];

    public final SparkDynamicParam[] getValue() {
        return (SparkDynamicParam[]) SettingsManager.INSTANCE.getValueSafely(LiveSparkDynamicParamsSetting.class);
    }
}
