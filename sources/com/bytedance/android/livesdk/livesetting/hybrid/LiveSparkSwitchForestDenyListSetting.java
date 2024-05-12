package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_spark_switch_forest_deny_list")
/* loaded from: classes6.dex */
public final class LiveSparkSwitchForestDenyListSetting {
    public static final LiveSparkSwitchForestDenyListSetting INSTANCE = new LiveSparkSwitchForestDenyListSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveSparkSwitchForestDenyListSetting.class);
    }

    public final String[] getDEFAULT() {
        return DEFAULT;
    }
}
