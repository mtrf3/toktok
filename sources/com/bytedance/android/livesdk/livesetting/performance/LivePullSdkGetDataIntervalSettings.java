package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_pull_sdk_get_data_interval")
/* loaded from: classes6.dex */
public final class LivePullSdkGetDataIntervalSettings {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 5000;
    public static final LivePullSdkGetDataIntervalSettings INSTANCE = new LivePullSdkGetDataIntervalSettings();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LivePullSdkGetDataIntervalSettings.class);
    }
}
