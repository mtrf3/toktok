package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import android.os.Build;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_use_surface_view")
/* loaded from: classes6.dex */
public final class LiveUseSurfaceViewExperiment {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LiveUseSurfaceViewExperiment INSTANCE = new LiveUseSurfaceViewExperiment();

    @Group("v1")
    public static final boolean enableValue = true;

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getBooleanValue(LiveUseSurfaceViewExperiment.class) && Build.VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }
}
