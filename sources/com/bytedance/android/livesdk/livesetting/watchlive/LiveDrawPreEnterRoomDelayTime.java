package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_draw_pre_enter_room_interaction_interval")
/* loaded from: classes6.dex */
public final class LiveDrawPreEnterRoomDelayTime {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 200;
    public static final LiveDrawPreEnterRoomDelayTime INSTANCE = new LiveDrawPreEnterRoomDelayTime();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveDrawPreEnterRoomDelayTime.class);
    }
}
