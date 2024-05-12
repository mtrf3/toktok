package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_voice_chat_feed_preview")
/* loaded from: classes6.dex */
public final class LivesdkVoiceChatFeedPreviewSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivesdkVoiceChatFeedPreviewSetting INSTANCE = new LivesdkVoiceChatFeedPreviewSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivesdkVoiceChatFeedPreviewSetting.class);
    }

    public final boolean isV1() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
