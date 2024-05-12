package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_feedback_web_view")
/* loaded from: classes6.dex */
public final class LiveCohostFeedbackWebViewSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "aweme://roma_redirect/?roma_group_key=roma_schema_group_cohost_feedback_page&roma_page_key=roma_schema_page_cohost_feedback&container_bg_color=transparent&gravity=bottom&height=976rpx&radius=8px";
    public static final LiveCohostFeedbackWebViewSetting INSTANCE = new LiveCohostFeedbackWebViewSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveCohostFeedbackWebViewSetting.class);
    }
}
