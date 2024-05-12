package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_sdk_join_channel_exception_opt")
/* loaded from: classes6.dex */
public final class LinkmicSdkJoinChannelExceptionOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LinkmicSdkJoinChannelExceptionOptSetting INSTANCE = new LinkmicSdkJoinChannelExceptionOptSetting();

    @Group("opt")
    public static final int OPT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkmicSdkJoinChannelExceptionOptSetting.class);
    }

    public final boolean isOpt() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
