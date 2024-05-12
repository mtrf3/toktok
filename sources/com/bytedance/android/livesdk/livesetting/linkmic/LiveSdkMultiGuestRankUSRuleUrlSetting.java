package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_rank_us_rule_url")
/* loaded from: classes6.dex */
public final class LiveSdkMultiGuestRankUSRuleUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_webview?type=popup&url=https%3A%2F%2Flf16-web.tiktokcdn.com%2Fobj%2Fies-hotsoon-draft-sg%2Ftiktok-live-faq%2Fmulti_guest_top_viewers_faq_us.html&gravity=bottom";
    public static final LiveSdkMultiGuestRankUSRuleUrlSetting INSTANCE = new LiveSdkMultiGuestRankUSRuleUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveSdkMultiGuestRankUSRuleUrlSetting.class);
    }
}
