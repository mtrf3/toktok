package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_goal_indicator_web_link")
/* loaded from: classes6.dex */
public final class LiveStreamGoalIndicatorWebLinkSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/tiktok/fe/live/tiktok_live_lynx_goal_indicator_container/pages/indicator-container/template.js";
    public static final LiveStreamGoalIndicatorWebLinkSetting INSTANCE = new LiveStreamGoalIndicatorWebLinkSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveStreamGoalIndicatorWebLinkSetting.class);
    }
}
