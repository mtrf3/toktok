package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_adapt_mic_room_switch")
/* loaded from: classes6.dex */
public final class MultiGuestAdaptMicRoomSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestAdaptMicRoomSwitchSetting INSTANCE = new MultiGuestAdaptMicRoomSwitchSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestAdaptMicRoomSwitchSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
