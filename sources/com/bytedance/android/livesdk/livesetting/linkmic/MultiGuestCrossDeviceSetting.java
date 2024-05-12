package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_cross_device")
/* loaded from: classes6.dex */
public final class MultiGuestCrossDeviceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("enable cross device")
    public static final int ENABLE = 1;
    public static final MultiGuestCrossDeviceSetting INSTANCE = new MultiGuestCrossDeviceSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestCrossDeviceSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
