package com.bytedance.android.livesdk.livesetting.performance.degrade;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_like_performance_optimize")
/* loaded from: classes6.dex */
public final class LiveLikePerformanceOptimizeSettings {
    public static final LiveLikePerformanceOptimizeSettings INSTANCE = new LiveLikePerformanceOptimizeSettings();

    @Group(isDefault = true, value = "default group")
    public static final LiveLikePerformanceOptimizeConfig DEFAULT = new LiveLikePerformanceOptimizeConfig();

    public final LiveLikePerformanceOptimizeConfig getValue() {
        LiveLikePerformanceOptimizeConfig liveLikePerformanceOptimizeConfig = (LiveLikePerformanceOptimizeConfig) SettingsManager.INSTANCE.getValueSafely(LiveLikePerformanceOptimizeSettings.class);
        if (liveLikePerformanceOptimizeConfig == null) {
            return DEFAULT;
        }
        return liveLikePerformanceOptimizeConfig;
    }

    public final boolean enableFunctionDowngrade() {
        return getValue().enableFunctionDowngrade;
    }

    public final boolean enableFunctionRemove() {
        return getValue().enableFunctionRemove;
    }

    public final boolean enablePerformanceOptimize() {
        return getValue().enablePerformanceOptimize;
    }

    public final LiveLikePerformanceOptimizeConfig getDEFAULT() {
        return DEFAULT;
    }
}
