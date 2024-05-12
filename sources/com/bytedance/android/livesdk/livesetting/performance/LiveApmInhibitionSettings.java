package com.bytedance.android.livesdk.livesetting.performance;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("webcast_live_sdk_apm_inhibition_settings")
/* loaded from: classes12.dex */
public final class LiveApmInhibitionSettings {
    public static final LiveApmInhibitionSettings INSTANCE = new LiveApmInhibitionSettings();

    @Group(isDefault = true, value = "default group")
    public static final InhibitionConfig DEFAULT = new InhibitionConfig();

    /* loaded from: classes12.dex */
    public static final class InhibitionConfig {

        @InterfaceC65349Pkn("webcast_live_sdk_apm_inhibition_settings_block_duration")
        public final long blockDuration;

        @InterfaceC65349Pkn("webcast_live_sdk_apm_inhibition_settings_enable")
        public final boolean enabled;

        @InterfaceC65349Pkn("webcast_live_sdk_apm_thread_downgrade_settings_enable")
        public final boolean enabledThreadPriority;

        @InterfaceC65349Pkn("webcast_live_sdk_apm_inhibition_settings_enable_duration")
        public final long nonBlockDuration;

        @InterfaceC65349Pkn("webcast_live_sdk_apm_thread_downgrade_settings_downgrade_priority")
        public final int priority = 10;

        @InterfaceC65349Pkn("webcast_live_sdk_apm_inhibition_settings_sleep_time")
        public final long sleepTime;
    }

    public final long getBlockDuration() {
        InhibitionConfig inhibitionConfig = (InhibitionConfig) SettingsManager.INSTANCE.getValueSafely(LiveApmInhibitionSettings.class);
        if (inhibitionConfig == null) {
            inhibitionConfig = DEFAULT;
        }
        return inhibitionConfig.blockDuration;
    }

    public final long getNonBlockDuration() {
        InhibitionConfig inhibitionConfig = (InhibitionConfig) SettingsManager.INSTANCE.getValueSafely(LiveApmInhibitionSettings.class);
        if (inhibitionConfig == null) {
            inhibitionConfig = DEFAULT;
        }
        return inhibitionConfig.nonBlockDuration;
    }

    public final int getPriority() {
        InhibitionConfig inhibitionConfig = (InhibitionConfig) SettingsManager.INSTANCE.getValueSafely(LiveApmInhibitionSettings.class);
        if (inhibitionConfig == null) {
            inhibitionConfig = DEFAULT;
        }
        return inhibitionConfig.priority;
    }

    public final long getSleepTime() {
        InhibitionConfig inhibitionConfig = (InhibitionConfig) SettingsManager.INSTANCE.getValueSafely(LiveApmInhibitionSettings.class);
        if (inhibitionConfig == null) {
            inhibitionConfig = DEFAULT;
        }
        return inhibitionConfig.sleepTime;
    }

    public final boolean isInhibitionEnabled() {
        InhibitionConfig inhibitionConfig = (InhibitionConfig) SettingsManager.INSTANCE.getValueSafely(LiveApmInhibitionSettings.class);
        if (inhibitionConfig == null) {
            inhibitionConfig = DEFAULT;
        }
        return inhibitionConfig.enabled;
    }

    public final boolean isThreadPriorityEnable() {
        InhibitionConfig inhibitionConfig = (InhibitionConfig) SettingsManager.INSTANCE.getValueSafely(LiveApmInhibitionSettings.class);
        if (inhibitionConfig == null) {
            inhibitionConfig = DEFAULT;
        }
        return inhibitionConfig.enabledThreadPriority;
    }
}
