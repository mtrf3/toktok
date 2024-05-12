package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_frequency_anchor")
/* loaded from: classes6.dex */
public final class LiveMessageFrequencyAnchorSetting {
    public static final LiveMessageFrequencyAnchorSetting INSTANCE = new LiveMessageFrequencyAnchorSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveMessageFrequencyConfig DEFAULT = new LiveMessageFrequencyConfig(false, null, null, 7, null);

    public final LiveMessageFrequencyConfig getValue() {
        LiveMessageFrequencyConfig liveMessageFrequencyConfig = (LiveMessageFrequencyConfig) SettingsManager.INSTANCE.getValueSafely(LiveMessageFrequencyAnchorSetting.class);
        if (liveMessageFrequencyConfig == null) {
            return DEFAULT;
        }
        return liveMessageFrequencyConfig;
    }

    public final LiveMessageFrequencyConfig getDEFAULT() {
        return DEFAULT;
    }
}
