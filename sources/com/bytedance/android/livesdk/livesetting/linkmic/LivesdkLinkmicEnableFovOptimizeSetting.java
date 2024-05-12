package com.bytedance.android.livesdk.livesetting.linkmic;

import X.U4C;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;

@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_enable_fov_optimize")
/* loaded from: classes14.dex */
public final class LivesdkLinkmicEnableFovOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivesdkLinkmicEnableFovOptimizeSetting INSTANCE = new LivesdkLinkmicEnableFovOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivesdkLinkmicEnableFovOptimizeSetting.class);
    }

    public final boolean isEnable(boolean z) {
        Boolean LIZ;
        if (!getValue()) {
            return false;
        }
        if (z) {
            LIZ = Boolean.valueOf(LiveAbLabelSetting.INSTANCE.getBooleanValue("livesdk_optimize_fov_for_small_window"));
        } else {
            LIZ = U4C.LIZ("livesdk_optimize_fov_for_small_window");
        }
        if (LIZ == null || !LIZ.booleanValue()) {
            return false;
        }
        return true;
    }
}
