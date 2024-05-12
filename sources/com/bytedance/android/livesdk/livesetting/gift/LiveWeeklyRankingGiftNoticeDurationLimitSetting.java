package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_weekly_ranking_gift_notice_duration_limit")
/* loaded from: classes6.dex */
public final class LiveWeeklyRankingGiftNoticeDurationLimitSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 30;
    public static final LiveWeeklyRankingGiftNoticeDurationLimitSetting INSTANCE = new LiveWeeklyRankingGiftNoticeDurationLimitSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveWeeklyRankingGiftNoticeDurationLimitSetting.class);
    }
}
