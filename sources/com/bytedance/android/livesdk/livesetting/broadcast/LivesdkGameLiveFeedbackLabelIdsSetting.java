package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.GameLiveFeedbackLabelIds;

@SettingsKey(preciseExperiment = false, value = "livesdk_game_live_feedback_label_ids")
/* loaded from: classes6.dex */
public final class LivesdkGameLiveFeedbackLabelIdsSetting {
    public static final LivesdkGameLiveFeedbackLabelIdsSetting INSTANCE = new LivesdkGameLiveFeedbackLabelIdsSetting();

    @Group(isDefault = true, value = "default group")
    public static final GameLiveFeedbackLabelIds DEFAULT = new GameLiveFeedbackLabelIds(null, null, null, 7, null);

    public final GameLiveFeedbackLabelIds getValue() {
        GameLiveFeedbackLabelIds gameLiveFeedbackLabelIds = (GameLiveFeedbackLabelIds) SettingsManager.INSTANCE.getValueSafely(LivesdkGameLiveFeedbackLabelIdsSetting.class);
        if (gameLiveFeedbackLabelIds == null) {
            return DEFAULT;
        }
        return gameLiveFeedbackLabelIds;
    }
}
