package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "ttlive_enable_preparation_page_speedtest_optimize")
/* loaded from: classes6.dex */
public final class TtliveEnablePreparationPageSpeedtestOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("experiment group")
    public static final int ENABLE = 1;
    public static final TtliveEnablePreparationPageSpeedtestOptimizeSetting INSTANCE = new TtliveEnablePreparationPageSpeedtestOptimizeSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(TtliveEnablePreparationPageSpeedtestOptimizeSetting.class);
    }

    public final boolean isExperimentGroup() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
