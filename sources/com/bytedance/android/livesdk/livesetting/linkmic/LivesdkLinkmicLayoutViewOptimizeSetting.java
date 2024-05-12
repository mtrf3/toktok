package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_layout_view_optimize")
/* loaded from: classes11.dex */
public final class LivesdkLinkmicLayoutViewOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivesdkLinkmicLayoutViewOptimizeSetting INSTANCE = new LivesdkLinkmicLayoutViewOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivesdkLinkmicLayoutViewOptimizeSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
