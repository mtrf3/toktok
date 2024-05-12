package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_abnormal_connection_opt")
/* loaded from: classes14.dex */
public final class LinkmicSdkAbnormalConnectionOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LinkmicSdkAbnormalConnectionOptSetting INSTANCE = new LinkmicSdkAbnormalConnectionOptSetting();

    @Group("is opt")
    public static final int OPT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkmicSdkAbnormalConnectionOptSetting.class);
    }

    public final boolean isOpt() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
