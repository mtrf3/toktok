package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_task_welcome_video_length")
/* loaded from: classes6.dex */
public final class WelcomeVideoLengthSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final WelcomeVideoLengthSetting INSTANCE = new WelcomeVideoLengthSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(WelcomeVideoLengthSetting.class);
    }
}
