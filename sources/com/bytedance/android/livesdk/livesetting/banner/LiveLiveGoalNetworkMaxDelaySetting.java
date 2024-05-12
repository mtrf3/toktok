package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_goal_message_delay_max_duration")
/* loaded from: classes6.dex */
public final class LiveLiveGoalNetworkMaxDelaySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 5;
    public static final LiveLiveGoalNetworkMaxDelaySetting INSTANCE = new LiveLiveGoalNetworkMaxDelaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveLiveGoalNetworkMaxDelaySetting.class);
    }
}
