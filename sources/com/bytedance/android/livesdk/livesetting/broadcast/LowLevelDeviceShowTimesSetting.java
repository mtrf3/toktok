package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "low_level_device_show_times")
/* loaded from: classes6.dex */
public final class LowLevelDeviceShowTimesSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LowLevelDeviceShowTimesSetting INSTANCE = new LowLevelDeviceShowTimesSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LowLevelDeviceShowTimesSetting.class);
    }
}
