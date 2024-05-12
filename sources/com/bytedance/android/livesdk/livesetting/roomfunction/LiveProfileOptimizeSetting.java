package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_profile_optimize_config")
/* loaded from: classes6.dex */
public final class LiveProfileOptimizeSetting {

    @Group(isDefault = true, value = "default")
    public static final LiveProfileOptimizeConfig DEFAULT;
    public static final LiveProfileOptimizeSetting INSTANCE = new LiveProfileOptimizeSetting();
    public static final LiveProfileOptimizeConfig config;

    static {
        LiveProfileOptimizeConfig liveProfileOptimizeConfig = new LiveProfileOptimizeConfig(false, false, 0L, 7, null);
        DEFAULT = liveProfileOptimizeConfig;
        LiveProfileOptimizeConfig liveProfileOptimizeConfig2 = (LiveProfileOptimizeConfig) SettingsManager.INSTANCE.getValueSafely(LiveProfileOptimizeSetting.class);
        if (liveProfileOptimizeConfig2 != null) {
            liveProfileOptimizeConfig = liveProfileOptimizeConfig2;
        }
        config = liveProfileOptimizeConfig;
    }

    public final long cacheExpiredTime() {
        return config.cacheExpiredTime;
    }

    public final boolean enableCache() {
        return config.enableCache;
    }

    public final boolean enablePrePass() {
        return config.enablePrePass;
    }
}
