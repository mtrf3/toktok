package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_unify_first_recharge_icon_group")
/* loaded from: classes6.dex */
public final class LiveFirstRechargeOptPhase1 {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("group 1")
    public static final int EXPERIMENT_1 = 1;

    @Group("group 2")
    public static final int EXPERIMENT_2 = 2;

    @Group("group 3")
    public static final int EXPERIMENT_3 = 3;
    public static final LiveFirstRechargeOptPhase1 INSTANCE = new LiveFirstRechargeOptPhase1();

    public final int getValue() {
        try {
            return SettingsManager.INSTANCE.getIntValue(LiveFirstRechargeOptPhase1.class);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final boolean inExp() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }
}
