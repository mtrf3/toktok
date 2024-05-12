package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_fly_mic_gift_switcher")
/* loaded from: classes11.dex */
public final class MultiGuestFlyMicGiftSwitcherSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestFlyMicGiftSwitcherSetting INSTANCE = new MultiGuestFlyMicGiftSwitcherSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestFlyMicGiftSwitcherSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
