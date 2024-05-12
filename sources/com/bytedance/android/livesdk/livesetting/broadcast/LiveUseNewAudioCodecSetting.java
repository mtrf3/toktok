package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_use_new_audio_codec")
/* loaded from: classes6.dex */
public final class LiveUseNewAudioCodecSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveUseNewAudioCodecSetting INSTANCE = new LiveUseNewAudioCodecSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveUseNewAudioCodecSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
