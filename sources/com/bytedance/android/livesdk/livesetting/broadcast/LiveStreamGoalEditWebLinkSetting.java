package com.bytedance.android.livesdk.livesetting.broadcast;

import X.JBR;
import X.X1D;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_goal_edit_web_link")
/* loaded from: classes6.dex */
public final class LiveStreamGoalEditWebLinkSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "sslocal://webcast_lynxview_popup?use_spark=1&use_forest=1&url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Fmusically%2Ffe%2Flive%2Ftiktok_live_revenue_wish_list%2Fpages%2Fedit_goal.js&container_bg_color=252525&height=890rpx&radius=8&keyboard_adjust=2";
    public static final LiveStreamGoalEditWebLinkSetting INSTANCE = new LiveStreamGoalEditWebLinkSetting();
    public static final String value = SettingsManager.INSTANCE.getStringValue(LiveStreamGoalEditWebLinkSetting.class);

    public final String getPreviewValue() {
        StringBuilder LIZ = X1D.LIZ();
        return JBR.LJFF(LIZ, value, "&is_open_live=1", LIZ);
    }

    public final String getValue() {
        return value;
    }
}
