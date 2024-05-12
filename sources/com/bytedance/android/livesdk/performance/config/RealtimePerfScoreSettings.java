package com.bytedance.android.livesdk.performance.config;

import X.C221108m2;
import X.C30922CBq;
import X.C5H3;
import X.CGJ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("realtime_perf_score_settings")
/* loaded from: classes6.dex */
public final class RealtimePerfScoreSettings {
    public static volatile boolean isDisableLog;
    public static final RealtimePerfScoreSettings INSTANCE = new RealtimePerfScoreSettings();

    @Group(isDefault = true, value = "default group")
    public static final RealtimePerfScoreConfig DEFAULT = new RealtimePerfScoreConfig(false, false, 0.0f, null, null, null, null, 127, null);
    public static final C5H3 lazyValue$delegate = C221108m2.LIZIZ(CGJ.LJLIL);

    private final RealtimePerfScoreConfig getConfig() {
        if (C30922CBq.LIZIZ) {
            RealtimePerfScoreConfig realtimePerfScoreConfig = (RealtimePerfScoreConfig) SettingsManager.INSTANCE.getValueSafely(RealtimePerfScoreSettings.class);
            if (realtimePerfScoreConfig == null) {
                return DEFAULT;
            }
            return realtimePerfScoreConfig;
        }
        return getLazyValue();
    }

    private final RealtimePerfScoreConfig getLazyValue() {
        return (RealtimePerfScoreConfig) lazyValue$delegate.getValue();
    }

    public static final boolean isEnabled() {
        return INSTANCE.getConfig().isEnabled();
    }

    public final PerfItemConfig cpuConfig() {
        return getConfig().getCpuSpeed();
    }

    public final PerfItemConfig fpsConfig() {
        return getConfig().getFps();
    }

    public final boolean isReportAll() {
        return getConfig().isReportAll();
    }

    public final PerfItemConfig jvmHeapUsageConfig() {
        return getConfig().getJvmHeapUsage();
    }

    public final float maxScore() {
        return getConfig().getMaxScore();
    }

    public final PerfItemConfig temperatureConfig() {
        return getConfig().getBatteryTemperature();
    }

    public final boolean isDisableLog$livebase_release() {
        return isDisableLog;
    }

    public final void setDisableLog$livebase_release(boolean z) {
        isDisableLog = z;
    }
}
