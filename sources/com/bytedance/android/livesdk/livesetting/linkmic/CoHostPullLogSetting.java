package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("co_host_pull_log_setting")
/* loaded from: classes6.dex */
public final class CoHostPullLogSetting {
    public static final CoHostPullLogSetting INSTANCE = new CoHostPullLogSetting();

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(CoHostPullLogSetting.class);
    }
}
