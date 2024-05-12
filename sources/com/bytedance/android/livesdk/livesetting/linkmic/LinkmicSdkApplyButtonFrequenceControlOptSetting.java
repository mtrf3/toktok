package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_apply_button_frequence_control_opt")
/* loaded from: classes14.dex */
public final class LinkmicSdkApplyButtonFrequenceControlOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LinkmicSdkApplyButtonFrequenceControlOptSetting INSTANCE = new LinkmicSdkApplyButtonFrequenceControlOptSetting();

    @Group("is opt")
    public static final int OPT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkmicSdkApplyButtonFrequenceControlOptSetting.class);
    }

    public final boolean isOpt() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
