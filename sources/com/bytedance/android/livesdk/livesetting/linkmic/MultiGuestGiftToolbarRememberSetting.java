package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_gift_toolbar_remember")
/* loaded from: classes6.dex */
public final class MultiGuestGiftToolbarRememberSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestGiftToolbarRememberSetting INSTANCE = new MultiGuestGiftToolbarRememberSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestGiftToolbarRememberSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
