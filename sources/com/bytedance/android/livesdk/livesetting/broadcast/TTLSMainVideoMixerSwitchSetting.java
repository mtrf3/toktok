package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttls_main_video_mixer_switch")
/* loaded from: classes6.dex */
public final class TTLSMainVideoMixerSwitchSetting {
    public static final TTLSMainVideoMixerSwitchSetting INSTANCE = new TTLSMainVideoMixerSwitchSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;

    public final boolean enableMainVideoMixerSwitch() {
        if (SettingsManager.INSTANCE.getIntValue(TTLSMainVideoMixerSwitchSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
