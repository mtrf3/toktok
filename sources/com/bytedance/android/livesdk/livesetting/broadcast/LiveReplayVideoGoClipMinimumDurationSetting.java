package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_replay_video_go_clip_minimum_duration")
/* loaded from: classes6.dex */
public final class LiveReplayVideoGoClipMinimumDurationSetting {

    @Group(isDefault = true, value = "Default")
    public static final int DEFAULT = 360;
    public static final LiveReplayVideoGoClipMinimumDurationSetting INSTANCE = new LiveReplayVideoGoClipMinimumDurationSetting();

    public static final int getMinimumDuration() {
        int value = INSTANCE.getValue();
        if (value == 0) {
            return 360;
        }
        return value;
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveReplayVideoGoClipMinimumDurationSetting.class);
    }
}
