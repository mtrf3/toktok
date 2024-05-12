package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_mic_room_strengthen_setting")
/* loaded from: classes6.dex */
public final class LiveMicRoomStrengthenSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("v1")
    public static final boolean ENABLE = true;
    public static final LiveMicRoomStrengthenSetting INSTANCE = new LiveMicRoomStrengthenSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMicRoomStrengthenSetting.class);
    }
}
