package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_ntp_enable")
/* loaded from: classes6.dex */
public final class LiveSdkNtpEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSdkNtpEnableSetting INSTANCE = new LiveSdkNtpEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSdkNtpEnableSetting.class);
    }
}
