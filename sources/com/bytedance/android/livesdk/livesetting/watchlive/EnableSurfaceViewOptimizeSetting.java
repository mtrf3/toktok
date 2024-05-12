package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "enable_surface_view_optimize")
/* loaded from: classes6.dex */
public final class EnableSurfaceViewOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("v2")
    public static final boolean ENABLE = true;
    public static final EnableSurfaceViewOptimizeSetting INSTANCE = new EnableSurfaceViewOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableSurfaceViewOptimizeSetting.class);
    }
}
