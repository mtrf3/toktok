package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_heart_beat_report_opt")
/* loaded from: classes6.dex */
public final class LiveSdkHeartBeatReportOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveSdkHeartBeatReportOptSetting INSTANCE = new LiveSdkHeartBeatReportOptSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkHeartBeatReportOptSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
