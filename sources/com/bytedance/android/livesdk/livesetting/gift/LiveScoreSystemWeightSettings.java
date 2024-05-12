package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_score_system_weights")
/* loaded from: classes6.dex */
public final class LiveScoreSystemWeightSettings {
    public static final LiveScoreSystemWeightSettings INSTANCE = new LiveScoreSystemWeightSettings();

    @Group(isDefault = true, value = "default group")
    public static final ScoreWeights DEFAULT = new ScoreWeights();

    public final ScoreWeights getValue() {
        ScoreWeights scoreWeights = (ScoreWeights) SettingsManager.INSTANCE.getValueSafely(LiveScoreSystemWeightSettings.class);
        if (scoreWeights == null) {
            return DEFAULT;
        }
        return scoreWeights;
    }

    public final ScoreWeights getDEFAULT() {
        return DEFAULT;
    }
}
