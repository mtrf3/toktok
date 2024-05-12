package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_opt_room_loading")
/* loaded from: classes6.dex */
public final class MultiGuestV3RoomLoadingOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3RoomLoadingOptSetting INSTANCE = new MultiGuestV3RoomLoadingOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3RoomLoadingOptSetting.class);
    }
}
