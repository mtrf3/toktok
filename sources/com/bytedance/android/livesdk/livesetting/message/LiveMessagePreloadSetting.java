package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_preload")
/* loaded from: classes6.dex */
public final class LiveMessagePreloadSetting {
    public static final LiveMessagePreloadSetting INSTANCE = new LiveMessagePreloadSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveMessagePreloadConfig DEFAULT = new LiveMessagePreloadConfig(false, false, false, 7, null);

    public final LiveMessagePreloadConfig getValue() {
        LiveMessagePreloadConfig liveMessagePreloadConfig = (LiveMessagePreloadConfig) SettingsManager.INSTANCE.getValueSafely(LiveMessagePreloadSetting.class);
        if (liveMessagePreloadConfig == null) {
            return DEFAULT;
        }
        return liveMessagePreloadConfig;
    }
}
