package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_performance_sdk_use_taco_url")
/* loaded from: classes6.dex */
public final class LivePerformanceSdkUseTacoUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LivePerformanceSdkUseTacoUrlSetting INSTANCE = new LivePerformanceSdkUseTacoUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePerformanceSdkUseTacoUrlSetting.class);
    }
}
