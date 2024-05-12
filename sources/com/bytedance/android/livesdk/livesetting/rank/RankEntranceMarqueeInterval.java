package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_rank_entrance_marquee_interval")
/* loaded from: classes6.dex */
public final class RankEntranceMarqueeInterval {
    public static final RankEntranceMarqueeInterval INSTANCE = new RankEntranceMarqueeInterval();

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 20000;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(RankEntranceMarqueeInterval.class);
    }
}
