package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_safe_post_optimize")
/* loaded from: classes6.dex */
public final class LivesdkLinkmicSafePostOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivesdkLinkmicSafePostOptimizeSetting INSTANCE = new LivesdkLinkmicSafePostOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivesdkLinkmicSafePostOptimizeSetting.class);
    }
}
