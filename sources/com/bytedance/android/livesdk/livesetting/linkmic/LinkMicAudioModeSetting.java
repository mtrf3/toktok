package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_audio_mode_config")
/* loaded from: classes6.dex */
public final class LinkMicAudioModeSetting {
    public static final LinkMicAudioModeSetting INSTANCE = new LinkMicAudioModeSetting();

    @Group(isDefault = true, value = "default group")
    public static final LinkMicAudioModeSettingConf DEFAULT = new LinkMicAudioModeSettingConf(false, 0, 3, null);

    public final LinkMicAudioModeSettingConf getValue() {
        LinkMicAudioModeSettingConf linkMicAudioModeSettingConf = (LinkMicAudioModeSettingConf) SettingsManager.INSTANCE.getValueSafely(LinkMicAudioModeSetting.class);
        if (linkMicAudioModeSettingConf == null) {
            return DEFAULT;
        }
        return linkMicAudioModeSettingConf;
    }
}
