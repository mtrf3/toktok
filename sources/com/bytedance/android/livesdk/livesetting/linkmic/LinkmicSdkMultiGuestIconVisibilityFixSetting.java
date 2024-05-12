package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_multi_guest_icon_visibility_fix")
/* loaded from: classes6.dex */
public final class LinkmicSdkMultiGuestIconVisibilityFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("fix")
    public static final int FIX = 1;
    public static final LinkmicSdkMultiGuestIconVisibilityFixSetting INSTANCE = new LinkmicSdkMultiGuestIconVisibilityFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkmicSdkMultiGuestIconVisibilityFixSetting.class);
    }

    public final boolean isFix() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
