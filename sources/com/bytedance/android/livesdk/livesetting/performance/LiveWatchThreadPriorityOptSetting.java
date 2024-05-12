package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_watch_thread_priority_opt")
/* loaded from: classes6.dex */
public final class LiveWatchThreadPriorityOptSetting {

    @Group("v4-byte-gpu-quit")
    public static final int BYTE_GPU_QUIT = 4;

    @Group(isDefault = true, value = "v0-online")
    public static final int DEFAULT = 0;

    @Group("v1-downgrade-thread")
    public static final int DOWNGRADE_THREAD = 1;

    @Group("v5-enable-all")
    public static final int ENABLE_ALL = 5;
    public static final LiveWatchThreadPriorityOptSetting INSTANCE = new LiveWatchThreadPriorityOptSetting();

    @Group("v3-slide-boost")
    public static final int SLIDE_BOOST = 3;

    @Group("v2-upgrade-api")
    public static final int UPGRADE_API = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveWatchThreadPriorityOptSetting.class);
    }

    public final boolean enableDowngradeThread() {
        if (getValue() == 1 || getValue() == 5) {
            return true;
        }
        return false;
    }

    public final boolean enableQuitGpu() {
        if (getValue() == 4 || getValue() == 5) {
            return true;
        }
        return false;
    }

    public final boolean enableSlideBoost() {
        if (getValue() == 3 || getValue() == 5) {
            return true;
        }
        return false;
    }

    public final boolean enableUpgradeApi() {
        if (getValue() == 2 || getValue() == 5) {
            return true;
        }
        return false;
    }
}
