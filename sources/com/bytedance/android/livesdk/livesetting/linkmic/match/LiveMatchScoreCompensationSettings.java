package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_score_compensation_config")
/* loaded from: classes6.dex */
public final class LiveMatchScoreCompensationSettings {
    public static final LiveMatchScoreCompensationSettings INSTANCE = new LiveMatchScoreCompensationSettings();

    @Group(isDefault = true, value = "default group")
    public static final CompensationConfig DEFAULT = new CompensationConfig(false, 0, 3, null);

    private final CompensationConfig getConfig() {
        CompensationConfig compensationConfig = (CompensationConfig) SettingsManager.INSTANCE.getValueSafely(LiveMatchScoreCompensationSettings.class);
        if (compensationConfig == null) {
            return DEFAULT;
        }
        return compensationConfig;
    }

    public final long getCompensationTimeSec() {
        return getConfig().compensateTimeSec;
    }

    public final boolean isCompensationEnable() {
        return getConfig().compensateEnable;
    }
}
