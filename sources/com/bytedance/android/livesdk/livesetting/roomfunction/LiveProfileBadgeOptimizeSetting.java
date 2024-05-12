package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_profile_level_opt")
/* loaded from: classes6.dex */
public final class LiveProfileBadgeOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveProfileBadgeOptimizeSetting INSTANCE = new LiveProfileBadgeOptimizeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveProfileBadgeOptimizeSetting.class);
    }
}
