package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_upgrade_config_storage_experiment")
/* loaded from: classes6.dex */
public final class FansUpgradeConfigStorageExperiment {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group(isDefault = false, value = "group 1")
    public static final int GROUP_1 = 1;
    public static final FansUpgradeConfigStorageExperiment INSTANCE = new FansUpgradeConfigStorageExperiment();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(FansUpgradeConfigStorageExperiment.class);
    }

    public final boolean isGroup1() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
