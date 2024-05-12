package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_leak_opt")
/* loaded from: classes14.dex */
public final class LiveSdkMultiGuestLeakOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestLeakOptSetting INSTANCE = new LiveSdkMultiGuestLeakOptSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkMultiGuestLeakOptSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
