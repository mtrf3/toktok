package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "enable_performance_tips")
/* loaded from: classes6.dex */
public final class EnablePerformanceTipsSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EnablePerformanceTipsSetting INSTANCE = new EnablePerformanceTipsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EnablePerformanceTipsSetting.class);
    }

    public final boolean isEnableHighTemperatureTips() {
        if (((getValue() >> 3) & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isEnableLowBattery() {
        if (((getValue() >> 1) & 1) == 1) {
            return true;
        }
        return false;
    }

    public final boolean isEnableLowDevices() {
        if (((getValue() >> 0) & 1) != 1) {
            return false;
        }
        return true;
    }

    public final boolean isEnableSaveMode() {
        if (((getValue() >> 2) & 1) == 1) {
            return true;
        }
        return false;
    }
}
