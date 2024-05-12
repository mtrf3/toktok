package com.bytedance.android.common.setting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("show_tip_low_end_device_max")
/* loaded from: classes.dex */
public final class ShowTipLowEndDeviceMax {
    public static final int $stable = 0;

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 6;
    public static final ShowTipLowEndDeviceMax INSTANCE = new ShowTipLowEndDeviceMax();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(ShowTipLowEndDeviceMax.class);
    }
}
