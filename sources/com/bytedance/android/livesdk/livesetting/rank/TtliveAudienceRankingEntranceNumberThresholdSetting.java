package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "ttlive_audience_ranking_entrance_number_threshold")
/* loaded from: classes6.dex */
public final class TtliveAudienceRankingEntranceNumberThresholdSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1000;
    public static final TtliveAudienceRankingEntranceNumberThresholdSetting INSTANCE = new TtliveAudienceRankingEntranceNumberThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(TtliveAudienceRankingEntranceNumberThresholdSetting.class);
    }
}
