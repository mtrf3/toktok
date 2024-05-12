package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_treasurebox_container_optimize_enable")
/* loaded from: classes6.dex */
public final class LiveTreasureBoxContainerOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveTreasureBoxContainerOptimizeSetting INSTANCE = new LiveTreasureBoxContainerOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveTreasureBoxContainerOptimizeSetting.class);
    }
}
