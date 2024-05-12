package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("game_live_dual_device")
/* loaded from: classes6.dex */
public final class GameDualDeviceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("experiment_group")
    public static final int GROUP_EXPERIMENT = 1;
    public static final GameDualDeviceSetting INSTANCE = new GameDualDeviceSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(GameDualDeviceSetting.class);
    }

    public final boolean isExperimentGroup() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
