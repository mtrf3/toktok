package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C28179B4d;
import X.C30830C8c;
import X.C30832C8e;
import X.C5H3;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.model.MonitorSampleData;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

@SettingsKey("live_slardar_monitor_sample_opt")
/* loaded from: classes6.dex */
public final class LiveMonitorSampleSetting {
    public static final LiveMonitorSampleSetting INSTANCE = new LiveMonitorSampleSetting();
    public static double randomSampleVale = -1.0d;
    public static final C5H3 isOffline$delegate = C221108m2.LIZIZ(C28179B4d.LJLIL);
    public static final C5H3 sampleData$delegate = C221108m2.LIZIZ(C30832C8e.LJLIL);
    public static final C5H3 hostService$delegate = C221108m2.LIZIZ(C30830C8c.LJLIL);

    @Group(isDefault = true, value = "default group")
    public static final MonitorSampleData DEFAULT = new MonitorSampleData();

    public final void release() {
    }

    private final IHostConfig getHostService() {
        return (IHostConfig) hostService$delegate.getValue();
    }

    private final MonitorSampleData getSampleData() {
        return (MonitorSampleData) sampleData$delegate.getValue();
    }

    private final boolean isOffline() {
        return ((Boolean) isOffline$delegate.getValue()).booleanValue();
    }

    private final boolean isSlardarExperiment() {
        MonitorSampleData sampleData = getSampleData();
        if (sampleData != null) {
            return sampleData.isSlardarBeforeExperiment;
        }
        return false;
    }

    public final boolean isDolphinExperiment() {
        MonitorSampleData sampleData = getSampleData();
        if (sampleData != null) {
            return sampleData.isDolphinExperiment;
        }
        return false;
    }

    private final boolean isSlardarReport(String str) {
        Set<String> IY;
        if (TextUtils.isEmpty(str) || !isSlardarExperiment()) {
            return true;
        }
        IHostConfig hostService = getHostService();
        if (hostService != null && (IY = hostService.IY()) != null) {
            return IY.contains(str);
        }
        return false;
    }

    public final boolean isReportSlardar(String str) {
        if (TextUtils.isEmpty(str) || isOffline()) {
            return true;
        }
        return isSlardarReport(str);
    }

    public final boolean isReportDolphin(String str, double d) {
        Map<String, Double> map;
        Double d2;
        if (TextUtils.isEmpty(str) || isOffline() || !isDolphinExperiment()) {
            return true;
        }
        if (randomSampleVale < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            randomSampleVale = ThreadLocalRandom.current().nextDouble();
        }
        MonitorSampleData sampleData = getSampleData();
        if (sampleData != null && (map = sampleData.sampleList) != null && (d2 = map.get(str)) != null) {
            d = d2.doubleValue();
        }
        if (randomSampleVale < d && isSlardarReport(str)) {
            return true;
        }
        return false;
    }
}
