package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_cross_device_broadcast_opt")
/* loaded from: classes6.dex */
public final class MultiGuestCrossDeviceBroadcastOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final MultiGuestCrossDeviceBroadcastOptSetting INSTANCE = new MultiGuestCrossDeviceBroadcastOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestCrossDeviceBroadcastOptSetting.class);
    }

    public final boolean isOpt() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
