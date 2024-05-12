package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_loop_check_room_time")
/* loaded from: classes6.dex */
public final class LiveLoopCheckRoomTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 30;
    public static final LiveLoopCheckRoomTimeSetting INSTANCE = new LiveLoopCheckRoomTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveLoopCheckRoomTimeSetting.class);
    }
}
