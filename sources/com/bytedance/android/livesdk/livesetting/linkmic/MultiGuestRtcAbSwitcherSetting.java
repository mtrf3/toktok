package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_rtc_ab_switcher")
/* loaded from: classes11.dex */
public final class MultiGuestRtcAbSwitcherSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestRtcAbSwitcherSetting INSTANCE = new MultiGuestRtcAbSwitcherSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestRtcAbSwitcherSetting.class);
    }
}
