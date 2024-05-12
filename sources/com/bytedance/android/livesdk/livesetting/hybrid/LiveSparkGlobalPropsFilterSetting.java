package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_spark_global_props_filter_android")
/* loaded from: classes6.dex */
public final class LiveSparkGlobalPropsFilterSetting {
    public static final LiveSparkGlobalPropsFilterSetting INSTANCE = new LiveSparkGlobalPropsFilterSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveSparkGlobalPropsFilterSetting.class);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
