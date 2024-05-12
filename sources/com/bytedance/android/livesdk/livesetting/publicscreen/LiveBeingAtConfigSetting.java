package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;

@SettingsKey("live_being_at_config")
/* loaded from: classes6.dex */
public final class LiveBeingAtConfigSetting {
    public static LiveBeingAtConfig cacheValue;
    public static final LiveBeingAtConfigSetting INSTANCE = new LiveBeingAtConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveBeingAtConfig DEFAULT = new LiveBeingAtConfig();

    /* loaded from: classes6.dex */
    public static final class LiveBeingAtConfig {

        @InterfaceC65349Pkn("messageConsumeInterval")
        public long messageConsumeInterval = 5000;

        @InterfaceC65349Pkn("messageLifeDuration")
        public long messageLifeDuration = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;

        @InterfaceC65349Pkn("flagReadThreshold")
        public long flagReadThreshold = 3000;

        @InterfaceC65349Pkn("check_user")
        public boolean checkUser = true;
    }

    public static final LiveBeingAtConfig getValue() {
        if (cacheValue == null) {
            cacheValue = (LiveBeingAtConfig) SettingsManager.INSTANCE.getValueSafely(LiveBeingAtConfigSetting.class);
        }
        LiveBeingAtConfig liveBeingAtConfig = cacheValue;
        if (liveBeingAtConfig == null) {
            return DEFAULT;
        }
        return liveBeingAtConfig;
    }

    public final LiveBeingAtConfig getCacheValue() {
        return cacheValue;
    }

    public final void setCacheValue(LiveBeingAtConfig liveBeingAtConfig) {
        cacheValue = liveBeingAtConfig;
    }
}
