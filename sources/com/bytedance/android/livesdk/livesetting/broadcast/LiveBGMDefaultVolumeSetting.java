package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_bg_music_default_volume_v2")
/* loaded from: classes6.dex */
public final class LiveBGMDefaultVolumeSetting {

    @Group(isDefault = true, value = "default group")
    public static final float DEFAULT = 0.15f;
    public static final LiveBGMDefaultVolumeSetting INSTANCE = new LiveBGMDefaultVolumeSetting();

    public final float getValue() {
        return SettingsManager.INSTANCE.getFloatValue(LiveBGMDefaultVolumeSetting.class);
    }
}
