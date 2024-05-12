package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_room_poll_duration")
/* loaded from: classes6.dex */
public final class LivePollDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 60000;
    public static final LivePollDurationSetting INSTANCE = new LivePollDurationSetting();

    public final long getMillisecond() {
        return SettingsManager.INSTANCE.getLongValue(LivePollDurationSetting.class);
    }

    public final long getSecond() {
        return getMillisecond() / 1000;
    }
}
