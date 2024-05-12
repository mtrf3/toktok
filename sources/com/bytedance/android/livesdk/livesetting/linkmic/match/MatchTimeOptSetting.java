package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_time_opt_settings")
/* loaded from: classes6.dex */
public final class MatchTimeOptSetting {
    public static final MatchTimeOptSetting INSTANCE = new MatchTimeOptSetting();

    @Group(isDefault = true, value = "default group")
    public static final Config DEFAULT = new Config(false, false, 0, 7, null);

    private final Config getConfig() {
        Config config = (Config) SettingsManager.INSTANCE.getValueSafely(MatchTimeOptSetting.class);
        if (config == null) {
            return DEFAULT;
        }
        return config;
    }

    public final boolean getAnchorStartTimeOptEnabled() {
        return getConfig().live_match_start_time_anchor_opt;
    }

    public final boolean getAudienceStartTimeOptEnabled() {
        return getConfig().live_match_start_time_opt;
    }

    public final long getMatchHalfRttLimit() {
        return getConfig().live_match_half_rtt_limit;
    }
}
