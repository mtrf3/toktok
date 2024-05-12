package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C5H3;
import X.C5O;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_layout_preload_optimization_v1")
/* loaded from: classes6.dex */
public final class LiveLayoutPreloadOptimizationV1Setting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("level optimize")
    public static final int LEVEL_OPTIMIZE = 1;

    @Group("level + thread")
    public static final int LEVEL_THREAD = 3;

    @Group("level + thread priority")
    public static final int LEVEL_THREAD_PRIORITY = 5;

    @Group("thread optimize")
    public static final int THREAD_OPTIMIZE = 2;

    @Group("thread priority")
    public static final int THREAD_PRIORITY = 4;
    public static final LiveLayoutPreloadOptimizationV1Setting INSTANCE = new LiveLayoutPreloadOptimizationV1Setting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C5O.LJLIL);

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public static final boolean preloadOptimize() {
        if (INSTANCE.getValue() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean levelOptimize(boolean z) {
        if ((INSTANCE.getValue() & 1) == 1 && z) {
            return true;
        }
        return false;
    }

    public static final boolean threadOptimize(boolean z) {
        LiveLayoutPreloadOptimizationV1Setting liveLayoutPreloadOptimizationV1Setting = INSTANCE;
        if (((liveLayoutPreloadOptimizationV1Setting.getValue() & 2) == 2 || (liveLayoutPreloadOptimizationV1Setting.getValue() & 4) == 4) && z) {
            return true;
        }
        return false;
    }

    public final boolean threadPriorityOptimize(boolean z) {
        if ((getValue() & 5) == 5) {
            return true;
        }
        return false;
    }
}
