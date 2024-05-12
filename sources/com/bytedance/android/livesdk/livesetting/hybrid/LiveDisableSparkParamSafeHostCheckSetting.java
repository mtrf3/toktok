package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "mt_live_disable_spark_param_safehost_check")
/* loaded from: classes6.dex */
public final class LiveDisableSparkParamSafeHostCheckSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveDisableSparkParamSafeHostCheckSetting INSTANCE = new LiveDisableSparkParamSafeHostCheckSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveDisableSparkParamSafeHostCheckSetting.class);
    }
}
