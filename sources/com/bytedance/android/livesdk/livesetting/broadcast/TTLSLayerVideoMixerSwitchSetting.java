package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttls_layer_video_mixer_switch")
/* loaded from: classes6.dex */
public final class TTLSLayerVideoMixerSwitchSetting {
    public static final TTLSLayerVideoMixerSwitchSetting INSTANCE = new TTLSLayerVideoMixerSwitchSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;

    public final boolean enableLayerVideoMixerSwitch() {
        if (SettingsManager.INSTANCE.getIntValue(TTLSLayerVideoMixerSwitchSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
