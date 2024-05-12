package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_best_teammate_faq_schema")
/* loaded from: classes6.dex */
public final class LiveMatchBestTeammateFaqSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?show_mask=0&container_bg_color=2776f7&use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_team_match_campaign%2Fpages%2Fhome%2Ftemplate.js&gravity=bottom&height=60%25";
    public static final LiveMatchBestTeammateFaqSetting INSTANCE = new LiveMatchBestTeammateFaqSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveMatchBestTeammateFaqSetting.class);
    }
}
