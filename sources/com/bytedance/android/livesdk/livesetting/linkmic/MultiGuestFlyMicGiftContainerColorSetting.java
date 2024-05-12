package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_fly_mic_gift_container_color")
/* loaded from: classes6.dex */
public final class MultiGuestFlyMicGiftContainerColorSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestFlyMicGiftContainerColorSetting INSTANCE = new MultiGuestFlyMicGiftContainerColorSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestFlyMicGiftContainerColorSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
