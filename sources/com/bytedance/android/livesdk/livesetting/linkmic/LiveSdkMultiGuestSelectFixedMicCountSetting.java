package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_select_fixed_mic_count")
/* loaded from: classes11.dex */
public final class LiveSdkMultiGuestSelectFixedMicCountSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSdkMultiGuestSelectFixedMicCountSetting INSTANCE = new LiveSdkMultiGuestSelectFixedMicCountSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkMultiGuestSelectFixedMicCountSetting.class);
    }

    public final boolean enable() {
        if (getValue() && LiveSdkMultiguestExpandGuestCountVersionV2Setting.INSTANCE.getValue() >= 4) {
            return true;
        }
        return false;
    }
}
