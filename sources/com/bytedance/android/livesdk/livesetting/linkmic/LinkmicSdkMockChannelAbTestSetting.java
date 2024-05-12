package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_sdk_mock_channel_ab_test")
/* loaded from: classes6.dex */
public final class LinkmicSdkMockChannelAbTestSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkmicSdkMockChannelAbTestSetting INSTANCE = new LinkmicSdkMockChannelAbTestSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkmicSdkMockChannelAbTestSetting.class);
    }
}
