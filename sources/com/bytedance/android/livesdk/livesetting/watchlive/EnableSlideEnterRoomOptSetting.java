package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.FirstScreenOptSwitcher;

@SettingsKey("enable_slide_enter_room_opt")
/* loaded from: classes6.dex */
public final class EnableSlideEnterRoomOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableSlideEnterRoomOptSetting INSTANCE = new EnableSlideEnterRoomOptSetting();

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getBooleanValue(EnableSlideEnterRoomOptSetting.class) && FirstScreenOptSwitcher.INSTANCE.getValue()) {
            return true;
        }
        return false;
    }
}
