package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_enter_other_room_kick_out")
/* loaded from: classes6.dex */
public final class LiveBroadcastEnterOtherRoomKickOutSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveBroadcastEnterOtherRoomKickOutSetting INSTANCE = new LiveBroadcastEnterOtherRoomKickOutSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBroadcastEnterOtherRoomKickOutSetting.class);
    }
}
