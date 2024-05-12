package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_guest_manage_popup_show_screen_setting")
/* loaded from: classes6.dex */
public final class MultiGuestV3GuestMgrPopUpShowScreenSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestV3GuestMgrPopUpShowScreenSetting INSTANCE = new MultiGuestV3GuestMgrPopUpShowScreenSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestV3GuestMgrPopUpShowScreenSetting.class);
    }
}
