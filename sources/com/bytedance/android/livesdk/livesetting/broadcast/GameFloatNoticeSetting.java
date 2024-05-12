package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("game_anchor_interaction_notice")
/* loaded from: classes6.dex */
public final class GameFloatNoticeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("experiment_group")
    public static final int GROUP_EXPERIMENT = 1;
    public static final GameFloatNoticeSetting INSTANCE = new GameFloatNoticeSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(GameFloatNoticeSetting.class);
    }

    public final boolean isExperimentGroup() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
