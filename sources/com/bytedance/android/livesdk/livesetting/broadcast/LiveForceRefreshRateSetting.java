package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_force_refresh_rate_setting")
/* loaded from: classes6.dex */
public final class LiveForceRefreshRateSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveForceRefreshRateSetting INSTANCE = new LiveForceRefreshRateSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveForceRefreshRateSetting.class);
    }
}
