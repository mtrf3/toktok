package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_effect_music_fade_duration")
/* loaded from: classes6.dex */
public final class LiveEffectMusicFadeDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 6000;
    public static final LiveEffectMusicFadeDurationSetting INSTANCE = new LiveEffectMusicFadeDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveEffectMusicFadeDurationSetting.class);
    }
}
