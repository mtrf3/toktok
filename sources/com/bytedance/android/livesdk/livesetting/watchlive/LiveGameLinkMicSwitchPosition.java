package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_game_link_mic_switch_position")
/* loaded from: classes6.dex */
public final class LiveGameLinkMicSwitchPosition {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("experiment_group")
    public static final int GROUP_EXPERIMENT = 1;
    public static final LiveGameLinkMicSwitchPosition INSTANCE = new LiveGameLinkMicSwitchPosition();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGameLinkMicSwitchPosition.class);
    }

    public final boolean isDefaultGroup() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }
}
