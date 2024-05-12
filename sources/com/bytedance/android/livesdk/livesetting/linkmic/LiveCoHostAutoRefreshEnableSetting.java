package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_enable_auto_refresh")
/* loaded from: classes6.dex */
public final class LiveCoHostAutoRefreshEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveCoHostAutoRefreshEnableSetting INSTANCE = new LiveCoHostAutoRefreshEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveCoHostAutoRefreshEnableSetting.class);
    }
}
