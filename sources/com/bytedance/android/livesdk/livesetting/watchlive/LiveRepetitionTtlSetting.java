package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.LiveRepetitionTtlConfig;

@SettingsKey("live_repetition_show_ttl")
/* loaded from: classes6.dex */
public final class LiveRepetitionTtlSetting {
    public static final LiveRepetitionTtlSetting INSTANCE = new LiveRepetitionTtlSetting();

    @Group(isDefault = true, value = "control_group")
    public static final LiveRepetitionTtlConfig DEFAULT = new LiveRepetitionTtlConfig();

    public final LiveRepetitionTtlConfig getValue() {
        LiveRepetitionTtlConfig liveRepetitionTtlConfig = (LiveRepetitionTtlConfig) SettingsManager.INSTANCE.getValueSafely(LiveRepetitionTtlSetting.class);
        if (liveRepetitionTtlConfig == null) {
            return DEFAULT;
        }
        return liveRepetitionTtlConfig;
    }
}
