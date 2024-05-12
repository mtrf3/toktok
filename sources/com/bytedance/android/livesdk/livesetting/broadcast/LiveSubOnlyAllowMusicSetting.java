package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sub_only_allow_music_region_setting")
/* loaded from: classes6.dex */
public final class LiveSubOnlyAllowMusicSetting {

    @Group(isDefault = true, value = "Default")
    public static final boolean DEFAULT = false;
    public static final LiveSubOnlyAllowMusicSetting INSTANCE = new LiveSubOnlyAllowMusicSetting();

    public static final boolean getEnableAllowMusic() {
        return INSTANCE.getValue();
    }

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSubOnlyAllowMusicSetting.class);
    }
}
