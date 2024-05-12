package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_surface_fix_combine")
/* loaded from: classes11.dex */
public final class LivesdkLinkmicSurfaceFixCombineSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivesdkLinkmicSurfaceFixCombineSetting INSTANCE = new LivesdkLinkmicSurfaceFixCombineSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivesdkLinkmicSurfaceFixCombineSetting.class);
    }
}
