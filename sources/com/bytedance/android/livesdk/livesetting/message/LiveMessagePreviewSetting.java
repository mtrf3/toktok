package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_preview_config")
/* loaded from: classes14.dex */
public final class LiveMessagePreviewSetting {
    public static final LiveMessagePreviewSetting INSTANCE = new LiveMessagePreviewSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveMessagePreviewConfig DEFAULT = new LiveMessagePreviewConfig(false, false, 0, 7, null);

    public final LiveMessagePreviewConfig getValue() {
        LiveMessagePreviewConfig liveMessagePreviewConfig = (LiveMessagePreviewConfig) SettingsManager.INSTANCE.getValueSafely(LiveMessagePreviewSetting.class);
        if (liveMessagePreviewConfig == null) {
            return DEFAULT;
        }
        return liveMessagePreviewConfig;
    }
}
