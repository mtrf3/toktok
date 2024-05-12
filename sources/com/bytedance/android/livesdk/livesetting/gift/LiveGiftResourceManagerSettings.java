package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_resource_manager_settings")
/* loaded from: classes6.dex */
public final class LiveGiftResourceManagerSettings {
    public static final LiveGiftResourceManagerSettings INSTANCE = new LiveGiftResourceManagerSettings();

    @Group(isDefault = true, value = "default group")
    public static final LiveGiftResourceManagerConfig DEFAULT = new LiveGiftResourceManagerConfig(0, 0, false, 0, 0, false, false, false, 255, null);

    public final LiveGiftResourceManagerConfig getConfig() {
        LiveGiftResourceManagerConfig liveGiftResourceManagerConfig = (LiveGiftResourceManagerConfig) SettingsManager.INSTANCE.getValueSafely(LiveGiftResourceManagerSettings.class);
        if (liveGiftResourceManagerConfig == null) {
            return DEFAULT;
        }
        return liveGiftResourceManagerConfig;
    }

    public final boolean enableDeleteAll() {
        return getConfig().enableDeleteAllResource;
    }

    public final boolean enableDeleteUnused() {
        return getConfig().enableDeleteUnusedResource;
    }

    public final boolean enableDiskLimitation() {
        return getConfig().resourceDiskLimitationEnable;
    }

    public final int getExpireDuration() {
        return getConfig().resourceExpireDuration;
    }

    public final int getPreloadStrategy() {
        return getConfig().resourcePreloadStrategy;
    }

    public final long getRedLine() {
        return getConfig().diskRedLine;
    }

    public final boolean getThreadCrash() {
        return getConfig().threadCrashFix;
    }

    public final long getYellowLine() {
        return getConfig().diskYellowLine;
    }
}
