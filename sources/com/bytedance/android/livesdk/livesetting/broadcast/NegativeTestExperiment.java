package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_negative_test")
/* loaded from: classes6.dex */
public final class NegativeTestExperiment {
    public static final NegativeTestExperiment INSTANCE = new NegativeTestExperiment();

    @Group(isDefault = true, value = "default group")
    public static final NegativeTestSettings DEFAULT = new NegativeTestSettings(0, 0, 3, null);
    public static final NegativeTestSettings setting = (NegativeTestSettings) SettingsManager.INSTANCE.getValueSafely(NegativeTestExperiment.class);

    public final long getCpuSleepTime() {
        NegativeTestSettings negativeTestSettings = setting;
        if (negativeTestSettings == null) {
            return 0L;
        }
        long j = 100;
        return ((j - negativeTestSettings.cpuLoadRate) * negativeTestSettings.cpuCycle) / j;
    }

    public final long getCyclePeriod() {
        NegativeTestSettings negativeTestSettings = setting;
        if (negativeTestSettings == null) {
            return 0L;
        }
        return negativeTestSettings.cpuCycle;
    }

    public final boolean isEnable() {
        NegativeTestSettings negativeTestSettings = setting;
        if (negativeTestSettings == null || negativeTestSettings.cpuLoadRate <= DEFAULT.cpuLoadRate) {
            return false;
        }
        return true;
    }

    public final NegativeTestSettings getDEFAULT() {
        return DEFAULT;
    }

    public final NegativeTestSettings getSetting() {
        return setting;
    }
}
