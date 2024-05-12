package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sound_effect_use_voip_mode")
/* loaded from: classes6.dex */
public final class LiveVoiceEffectUseVoipModeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveVoiceEffectUseVoipModeSetting INSTANCE = new LiveVoiceEffectUseVoipModeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveVoiceEffectUseVoipModeSetting.class);
    }
}
