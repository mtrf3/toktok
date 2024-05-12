package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_feedback_web_url")
/* loaded from: classes6.dex */
public final class MultiGuestDisconnectFeedbackUrlSetting {

    @Group(isDefault = true, value = "disconnect without feedback")
    public static final String DEFAULT = "";
    public static final MultiGuestDisconnectFeedbackUrlSetting INSTANCE = new MultiGuestDisconnectFeedbackUrlSetting();

    public final String getUrl() {
        return SettingsManager.INSTANCE.getStringValue(MultiGuestDisconnectFeedbackUrlSetting.class);
    }
}
