package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_audience_ranking_lynx_url")
/* loaded from: classes6.dex */
public final class LiveAudienceRankUrl {
    public static final LiveAudienceRankUrl INSTANCE = new LiveAudienceRankUrl();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "https://lf19-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/10/gecko/resource/revenue_client_audience_ranking_lynx/audience-rank/pages/audience_rank.js";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveAudienceRankUrl.class);
    }
}
