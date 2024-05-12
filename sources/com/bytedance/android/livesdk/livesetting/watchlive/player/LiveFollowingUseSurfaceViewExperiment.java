package com.bytedance.android.livesdk.livesetting.watchlive.player;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_use_surface_view_following")
/* loaded from: classes6.dex */
public final class LiveFollowingUseSurfaceViewExperiment {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;

    @Group("v1")
    public static final boolean ENABLE = true;
    public static final LiveFollowingUseSurfaceViewExperiment INSTANCE = new LiveFollowingUseSurfaceViewExperiment();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFollowingUseSurfaceViewExperiment.class);
    }
}
