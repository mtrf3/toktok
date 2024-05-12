package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_spark_dynamic_params_ab")
/* loaded from: classes6.dex */
public final class LiveSparkDynamicParamsABSetting {
    public static final LiveSparkDynamicParamsABSetting INSTANCE = new LiveSparkDynamicParamsABSetting();

    @Group(isDefault = true, value = "default group")
    public static final SparkDynamicParam[] DEFAULT = new SparkDynamicParam[0];

    public final SparkDynamicParam[] getValue() {
        return (SparkDynamicParam[]) SettingsManager.INSTANCE.getValueSafely(LiveSparkDynamicParamsABSetting.class);
    }
}
