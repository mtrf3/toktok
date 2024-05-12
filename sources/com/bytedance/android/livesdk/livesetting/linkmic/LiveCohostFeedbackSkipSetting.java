package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_feedback_skip_setting")
/* loaded from: classes6.dex */
public final class LiveCohostFeedbackSkipSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 14;
    public static final LiveCohostFeedbackSkipSetting INSTANCE = new LiveCohostFeedbackSkipSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostFeedbackSkipSetting.class);
    }
}
