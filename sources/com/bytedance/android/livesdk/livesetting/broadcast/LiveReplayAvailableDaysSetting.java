package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_replay_available_days")
/* loaded from: classes6.dex */
public final class LiveReplayAvailableDaysSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 90;
    public static final LiveReplayAvailableDaysSetting INSTANCE = new LiveReplayAvailableDaysSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveReplayAvailableDaysSetting.class);
    }
}
