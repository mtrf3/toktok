package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_unset_room_logger")
/* loaded from: classes6.dex */
public final class LiveUnsetRoomLoggerSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveUnsetRoomLoggerSetting INSTANCE = new LiveUnsetRoomLoggerSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveUnsetRoomLoggerSetting.class);
    }
}
