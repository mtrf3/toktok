package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_wallet_feedback_page_submit_frequency")
/* loaded from: classes6.dex */
public final class LiveFeedbackShowFrequency {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveFeedbackShowFrequency INSTANCE = new LiveFeedbackShowFrequency();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveFeedbackShowFrequency.class);
    }
}
