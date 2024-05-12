package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_spark_fix_common_params")
/* loaded from: classes6.dex */
public final class LiveSparkFixCommonParamsSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveSparkFixCommonParamsSetting INSTANCE = new LiveSparkFixCommonParamsSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSparkFixCommonParamsSetting.class);
    }
}
