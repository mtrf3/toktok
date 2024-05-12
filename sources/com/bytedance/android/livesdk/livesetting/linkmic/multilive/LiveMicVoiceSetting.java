package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C221108m2;
import X.C5H3;
import X.C75382TiE;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.live.model.SpeakingVoiceConfig;

@SettingsKey("live_mic_volume_config")
/* loaded from: classes14.dex */
public final class LiveMicVoiceSetting {
    public static final LiveMicVoiceSetting INSTANCE = new LiveMicVoiceSetting();

    @Group(isDefault = true, value = "default group")
    public static final SpeakingVoiceConfig DEFAULT = new SpeakingVoiceConfig(0, 0, 3, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C75382TiE.LJLIL);

    private final SpeakingVoiceConfig getSettingValue() {
        return (SpeakingVoiceConfig) settingValue$delegate.getValue();
    }

    public final SpeakingVoiceConfig getValue() {
        return getSettingValue();
    }
}
