package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_performance_sdk_enable")
/* loaded from: classes6.dex */
public final class LivePerformanceSdkEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePerformanceSdkEnableSetting INSTANCE = new LivePerformanceSdkEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePerformanceSdkEnableSetting.class);
    }
}
