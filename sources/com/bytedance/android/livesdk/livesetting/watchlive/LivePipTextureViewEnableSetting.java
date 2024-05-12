package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = true, value = "live_pip_texture_view_enable")
/* loaded from: classes6.dex */
public final class LivePipTextureViewEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePipTextureViewEnableSetting INSTANCE = new LivePipTextureViewEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePipTextureViewEnableSetting.class);
    }
}
