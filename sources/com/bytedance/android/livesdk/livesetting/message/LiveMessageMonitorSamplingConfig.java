package com.bytedance.android.livesdk.livesetting.message;

import X.C221108m2;
import X.C5H3;
import X.CH5;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

@SettingsKey("live_message_monitor_sampling")
/* loaded from: classes6.dex */
public final class LiveMessageMonitorSamplingConfig {
    public static final LiveMessageMonitorSamplingConfig INSTANCE = new LiveMessageMonitorSamplingConfig();

    @Group(isDefault = true, value = "default group")
    public static final MessageMonitorSamplingConfig DEFAULT = new MessageMonitorSamplingConfig(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, 3, null);
    public static final C5H3 monitorSamplingConfig$delegate = C221108m2.LIZIZ(CH5.LJLIL);

    private final MessageMonitorSamplingConfig getMonitorSamplingConfig() {
        return (MessageMonitorSamplingConfig) monitorSamplingConfig$delegate.getValue();
    }

    public final double logSamplingRate() {
        return getMonitorSamplingConfig().getLogSamplingRate();
    }

    public final double zstdSamplingRate() {
        return getMonitorSamplingConfig().getZstdSamplingRate();
    }

    public final MessageMonitorSamplingConfig getDEFAULT() {
        return DEFAULT;
    }
}
