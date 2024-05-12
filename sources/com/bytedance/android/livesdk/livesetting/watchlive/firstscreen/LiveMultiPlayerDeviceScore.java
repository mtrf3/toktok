package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;

@SettingsKey("multi_player_device_score")
/* loaded from: classes6.dex */
public final class LiveMultiPlayerDeviceScore {
    public static final LiveMultiPlayerDeviceScore INSTANCE = new LiveMultiPlayerDeviceScore();

    @Group(isDefault = true, value = "default group")
    public static final MultiPlayerScoreLimit DEFAULT = new MultiPlayerScoreLimit(0.0f, 0.0f, 3, null);

    public final boolean isEnable() {
        MultiPlayerScoreLimit multiPlayerScoreLimit = (MultiPlayerScoreLimit) SettingsManager.INSTANCE.getValueSafely(LiveMultiPlayerDeviceScore.class);
        if (multiPlayerScoreLimit == null) {
            multiPlayerScoreLimit = DEFAULT;
        }
        float value = TTliveAnchorDeviceScoreSetting.INSTANCE.getValue();
        if (value >= multiPlayerScoreLimit.scoreLow && value < multiPlayerScoreLimit.scoreHigh) {
            return true;
        }
        return false;
    }

    public final MultiPlayerScoreLimit getDEFAULT() {
        return DEFAULT;
    }
}
