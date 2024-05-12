package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_task_welcome_video_url")
/* loaded from: classes6.dex */
public final class WelcomeVideoUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final WelcomeVideoUrlSetting INSTANCE = new WelcomeVideoUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(WelcomeVideoUrlSetting.class);
    }
}
