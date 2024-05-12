package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_android_background_opt")
/* loaded from: classes6.dex */
public final class MultiGuestAndroidBackgroundOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestAndroidBackgroundOptSetting INSTANCE = new MultiGuestAndroidBackgroundOptSetting();

    @Group("set background dynamically")
    public static final int OPT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestAndroidBackgroundOptSetting.class);
    }

    public final boolean isOptSetBg() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
