package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_bg_music_default_volume")
/* loaded from: classes6.dex */
public final class LiveBgMusicDefaultVolumeSetting {

    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 0.3f;
    public static final LiveBgMusicDefaultVolumeSetting INSTANCE = new LiveBgMusicDefaultVolumeSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(LiveBgMusicDefaultVolumeSetting.class);
    }
}
