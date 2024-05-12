package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_v3_guest_switch")
/* loaded from: classes6.dex */
public final class LiveSdkGuestOneVnSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSdkGuestOneVnSetting INSTANCE = new LiveSdkGuestOneVnSetting();

    public final boolean isDisable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkGuestOneVnSetting.class);
    }
}
