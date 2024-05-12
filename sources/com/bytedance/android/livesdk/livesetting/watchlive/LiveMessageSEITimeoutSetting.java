package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_sei_timeout_setting")
/* loaded from: classes6.dex */
public final class LiveMessageSEITimeoutSetting {
    public static final LiveMessageSEITimeoutSetting INSTANCE = new LiveMessageSEITimeoutSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveMessageSEITimeoutConfig DEFAULT = new LiveMessageSEITimeoutConfig(0.0f, 0, 0, 7, null);

    public final LiveMessageSEITimeoutConfig getValue() {
        LiveMessageSEITimeoutConfig liveMessageSEITimeoutConfig = (LiveMessageSEITimeoutConfig) SettingsManager.INSTANCE.getValueSafely(LiveMessageSEITimeoutSetting.class);
        if (liveMessageSEITimeoutConfig == null) {
            return DEFAULT;
        }
        return liveMessageSEITimeoutConfig;
    }

    public final long calculateSEIDelayRegulateByConfig(long j) {
        if (j < 0) {
            j = 0;
        }
        LiveMessageSEITimeoutConfig value = getValue();
        long j2 = (((float) j) * value.multiple) + ((float) value.bias);
        long j3 = value.maxTimeout;
        if (j2 > j3) {
            return j3;
        }
        return j2;
    }
}
