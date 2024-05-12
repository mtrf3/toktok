package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mute_host_audio_mute_state_opt")
/* loaded from: classes6.dex */
public final class MultiHostAudioMuteStateOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiHostAudioMuteStateOptSetting INSTANCE = new MultiHostAudioMuteStateOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiHostAudioMuteStateOptSetting.class);
    }
}
