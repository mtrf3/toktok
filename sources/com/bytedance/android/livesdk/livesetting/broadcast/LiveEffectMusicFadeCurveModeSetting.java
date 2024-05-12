package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_effect_music_fade_curve_mode")
/* loaded from: classes6.dex */
public final class LiveEffectMusicFadeCurveModeSetting {

    @Group(isDefault = true, value = "default, linear")
    public static final int DEFAULT = 1;
    public static final LiveEffectMusicFadeCurveModeSetting INSTANCE = new LiveEffectMusicFadeCurveModeSetting();

    @Group("log")
    public static final int V0 = 0;

    @Group("exp")
    public static final int V2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveEffectMusicFadeCurveModeSetting.class);
    }
}
