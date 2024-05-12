package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_task_initial_data_experiment")
/* loaded from: classes6.dex */
public final class FansTaskInitialDataExperiment {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group(isDefault = false, value = "group 1")
    public static final int GROUP_1 = 1;

    @Group(isDefault = false, value = "group 2")
    public static final int GROUP_2 = 2;
    public static final FansTaskInitialDataExperiment INSTANCE = new FansTaskInitialDataExperiment();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(FansTaskInitialDataExperiment.class);
    }

    public final boolean isDefaultGroup() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isGroup1() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean isGroup2() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
