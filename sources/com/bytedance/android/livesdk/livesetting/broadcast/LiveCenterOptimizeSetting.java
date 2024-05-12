package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_center_optimize_enable")
/* loaded from: classes6.dex */
public final class LiveCenterOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCenterOptimizeSetting INSTANCE = new LiveCenterOptimizeSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveCenterOptimizeSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
