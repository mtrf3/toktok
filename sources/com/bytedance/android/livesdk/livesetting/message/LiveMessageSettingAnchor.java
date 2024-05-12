package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_config_anchor")
/* loaded from: classes6.dex */
public final class LiveMessageSettingAnchor {

    @Group(isDefault = true, value = "default group")
    public static final LiveMessageConfig DEFAULT;
    public static final LiveMessageSettingAnchor INSTANCE = new LiveMessageSettingAnchor();
    public static LiveMessageConfig liveMessageConfig;

    static {
        LiveMessageConfig liveMessageConfig2 = new LiveMessageConfig(0, false, 3, null);
        DEFAULT = liveMessageConfig2;
        LiveMessageConfig liveMessageConfig3 = (LiveMessageConfig) SettingsManager.INSTANCE.getValueSafely(LiveMessageSettingAnchor.class);
        if (liveMessageConfig3 != null) {
            liveMessageConfig2 = liveMessageConfig3;
        }
        liveMessageConfig = liveMessageConfig2;
    }

    public final int duplicateSize() {
        return liveMessageConfig.getDuplicateSize();
    }

    public final boolean enhanceWebsocket() {
        return liveMessageConfig.getEnhanceWebsocket();
    }
}