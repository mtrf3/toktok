package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_update_member_count_from_audience_rank")
/* loaded from: classes6.dex */
public final class LiveUpdateMemberCountFromAudienceRankSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveUpdateMemberCountFromAudienceRankSetting INSTANCE = new LiveUpdateMemberCountFromAudienceRankSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveUpdateMemberCountFromAudienceRankSetting.class);
    }
}
