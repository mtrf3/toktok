package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_anchor_click_optimize")
/* loaded from: classes6.dex */
public final class LinkmicAnchorClickOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkmicAnchorClickOptimizeSetting INSTANCE = new LinkmicAnchorClickOptimizeSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkmicAnchorClickOptimizeSetting.class);
    }
}
