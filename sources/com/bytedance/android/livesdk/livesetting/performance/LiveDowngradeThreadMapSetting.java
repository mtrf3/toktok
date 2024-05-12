package com.bytedance.android.livesdk.livesetting.performance;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

@SettingsKey(preciseExperiment = false, value = "live_downgrade_thread_map")
/* loaded from: classes12.dex */
public final class LiveDowngradeThreadMapSetting {

    @Group(isDefault = true, value = "default group")
    public static final Map<String, Double> DEFAULT;
    public static final LiveDowngradeThreadMapSetting INSTANCE = new LiveDowngradeThreadMapSetting();

    static {
        Double valueOf = Double.valueOf(19.0d);
        DEFAULT = C113554cx.LJJL(new OSZ("ActionReaper", valueOf), new OSZ("APM", valueOf), new OSZ("assem-serial-t", valueOf), new OSZ("AVUtilThread", valueOf), new OSZ("default_npth_thread", valueOf), new OSZ("DownloadThreadPool-", valueOf), new OSZ("DownloadWatchDog", valueOf), new OSZ("EventUpload", valueOf), new OSZ("ExecutorFactory", valueOf), new OSZ("homepage-main-preload-serial", valueOf), new OSZ("HybridMonitorExecutor", valueOf), new OSZ("looper_monitor", valueOf), new OSZ("MonitorExecutor", valueOf), new OSZ("NitaMainThread", valueOf), new OSZ("NPTH-AnrMonitor", valueOf), new OSZ("TeaThread", valueOf));
    }

    public final Map<String, Double> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely(LiveDowngradeThreadMapSetting.class);
    }
}
