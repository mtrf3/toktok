package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_guide_custom_poll_bubble")
/* loaded from: classes6.dex */
public final class CustomPollBubbleSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final CustomPollBubbleSetting INSTANCE = new CustomPollBubbleSetting();

    public final boolean hasBubble() {
        if (SettingsManager.INSTANCE.getIntValue(CustomPollBubbleSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
