package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_add_stop_fly_mic_ani")
/* loaded from: classes6.dex */
public final class MultiGuestAddStopFlyMicAniSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestAddStopFlyMicAniSetting INSTANCE = new MultiGuestAddStopFlyMicAniSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestAddStopFlyMicAniSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
