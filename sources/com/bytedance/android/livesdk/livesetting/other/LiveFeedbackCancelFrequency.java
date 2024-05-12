package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_wallet_feedback_page_cancel_frequency")
/* loaded from: classes6.dex */
public final class LiveFeedbackCancelFrequency {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3;
    public static final LiveFeedbackCancelFrequency INSTANCE = new LiveFeedbackCancelFrequency();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveFeedbackCancelFrequency.class);
    }
}
