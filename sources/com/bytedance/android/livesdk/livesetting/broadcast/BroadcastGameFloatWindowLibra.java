package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_broadcast_game_float_window")
/* loaded from: classes6.dex */
public final class BroadcastGameFloatWindowLibra {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("experiment_group")
    public static final int GROUP_EXPERIMENT_1 = 1;

    @Group("experiment_group")
    public static final int GROUP_EXPERIMENT_2 = 2;
    public static final BroadcastGameFloatWindowLibra INSTANCE = new BroadcastGameFloatWindowLibra();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(BroadcastGameFloatWindowLibra.class);
    }

    public final boolean isExperimentGroup() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isExperimentGroup2() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
