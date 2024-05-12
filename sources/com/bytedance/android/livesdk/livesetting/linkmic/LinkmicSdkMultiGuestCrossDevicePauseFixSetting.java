package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_multi_guest_cross_device_pause_fix")
/* loaded from: classes6.dex */
public final class LinkmicSdkMultiGuestCrossDevicePauseFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("is fixed")
    public static final int FIX = 1;
    public static final LinkmicSdkMultiGuestCrossDevicePauseFixSetting INSTANCE = new LinkmicSdkMultiGuestCrossDevicePauseFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkmicSdkMultiGuestCrossDevicePauseFixSetting.class);
    }

    public final boolean isFix() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
