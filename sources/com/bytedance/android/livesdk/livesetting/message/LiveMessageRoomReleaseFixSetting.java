package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_room_release_fix_setting")
/* loaded from: classes6.dex */
public final class LiveMessageRoomReleaseFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveMessageRoomReleaseFixSetting INSTANCE = new LiveMessageRoomReleaseFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMessageRoomReleaseFixSetting.class);
    }

    public final boolean enable() {
        return getValue();
    }
}
