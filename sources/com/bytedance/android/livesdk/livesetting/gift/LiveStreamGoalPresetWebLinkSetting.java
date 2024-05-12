package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_goal_preset_web_link")
/* loaded from: classes6.dex */
public final class LiveStreamGoalPresetWebLinkSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?use_spark=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_wish_list%2Fpages%2Fedit_goal.js&container_bg_color=252525&height=890rpx&radius=16rpx";
    public static final LiveStreamGoalPresetWebLinkSetting INSTANCE = new LiveStreamGoalPresetWebLinkSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveStreamGoalPresetWebLinkSetting.class);
    }
}
