package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_mute_audio_sei")
/* loaded from: classes6.dex */
public final class MultiGuestMuteAudioSeiSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestMuteAudioSeiSetting INSTANCE = new MultiGuestMuteAudioSeiSetting();

    @Group("hard code mute_audio in sei false")
    public static final int MUTE_AUDIO_FALSE = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestMuteAudioSeiSetting.class);
    }

    public final boolean isMuteAudioFalse() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
