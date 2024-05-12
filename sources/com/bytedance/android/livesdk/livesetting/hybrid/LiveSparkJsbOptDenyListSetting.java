package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "mt_live_spark_jsb_opt_deny_list")
/* loaded from: classes6.dex */
public final class LiveSparkJsbOptDenyListSetting {
    public static final LiveSparkJsbOptDenyListSetting INSTANCE = new LiveSparkJsbOptDenyListSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public static final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveSparkJsbOptDenyListSetting.class);
    }
}
