package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_first_recharge_optimize")
/* loaded from: classes6.dex */
public final class LiveGiftFirstRechargeOptimizedSetting {

    @Group(isDefault = true, value = "Control")
    public static final int DEFAULT = 0;

    @Group("Experiment1")
    public static final int EXP_1 = 1;

    @Group("Experiment2")
    public static final int EXP_2 = 2;
    public static final LiveGiftFirstRechargeOptimizedSetting INSTANCE = new LiveGiftFirstRechargeOptimizedSetting();

    public final boolean inExp1() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGiftFirstRechargeOptimizedSetting.class) == 1) {
            return true;
        }
        return false;
    }

    public final boolean inExp2() {
        if (SettingsManager.INSTANCE.getIntValue(LiveGiftFirstRechargeOptimizedSetting.class) == 2) {
            return true;
        }
        return false;
    }
}
