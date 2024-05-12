package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_all_switch_to_spark")
/* loaded from: classes6.dex */
public final class LiveAllSwitchToSparkSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveAllSwitchToSparkSetting INSTANCE = new LiveAllSwitchToSparkSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAllSwitchToSparkSetting.class);
    }
}
