package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_effect_music_fade_switch")
/* loaded from: classes6.dex */
public final class LiveEffectMusicFadeSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEffectMusicFadeSwitchSetting INSTANCE = new LiveEffectMusicFadeSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEffectMusicFadeSwitchSetting.class);
    }
}
