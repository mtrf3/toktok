package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gifting_sound_feedback")
/* loaded from: classes6.dex */
public final class LiveGiftGiftingSoundFeedbackSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftGiftingSoundFeedbackSetting INSTANCE = new LiveGiftGiftingSoundFeedbackSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftGiftingSoundFeedbackSetting.class);
    }
}
