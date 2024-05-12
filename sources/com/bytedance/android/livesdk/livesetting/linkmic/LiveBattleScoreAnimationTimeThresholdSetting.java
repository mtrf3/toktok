package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_battle_score_animation_time_threshold")
/* loaded from: classes11.dex */
public final class LiveBattleScoreAnimationTimeThresholdSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 10;
    public static final LiveBattleScoreAnimationTimeThresholdSetting INSTANCE = new LiveBattleScoreAnimationTimeThresholdSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveBattleScoreAnimationTimeThresholdSetting.class);
    }
}
