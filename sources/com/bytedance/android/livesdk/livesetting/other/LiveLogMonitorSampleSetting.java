package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C28178B4c;
import X.C30831C8d;
import X.C5H3;
import android.text.TextUtils;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.model.LiveLogSampleData;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

@SettingsKey("live_tracker_dolphin_configuration")
/* loaded from: classes6.dex */
public final class LiveLogMonitorSampleSetting {
    public static final double SAMPLE_0 = 0.0d;
    public static final LiveLogMonitorSampleSetting INSTANCE = new LiveLogMonitorSampleSetting();
    public static double randomSampleVale = -1.0d;
    public static final double SAMPLE_1000 = 0.001d;
    public static final double SAMPLE_100 = 0.01d;
    public static final double SAMPLE_10 = 0.1d;
    public static final C5H3 isOffline$delegate = C221108m2.LIZIZ(C28178B4c.LJLIL);
    public static final C5H3 sampleData$delegate = C221108m2.LIZIZ(C30831C8d.LJLIL);

    @Group(isDefault = true, value = "default group")
    public static final LiveLogSampleData DEFAULT = new LiveLogSampleData();

    public static /* synthetic */ void getSAMPLE_0$annotations() {
    }

    public static /* synthetic */ void getSAMPLE_10$annotations() {
    }

    public static /* synthetic */ void getSAMPLE_100$annotations() {
    }

    public static /* synthetic */ void getSAMPLE_1000$annotations() {
    }

    private final LiveLogSampleData getSampleData() {
        return (LiveLogSampleData) sampleData$delegate.getValue();
    }

    private final boolean isOffline() {
        return ((Boolean) isOffline$delegate.getValue()).booleanValue();
    }

    private final boolean isExperiment() {
        LiveLogSampleData sampleData = getSampleData();
        if (sampleData != null) {
            return sampleData.isExperiment;
        }
        return false;
    }

    public static final double getSAMPLE_0() {
        return SAMPLE_0;
    }

    public static final double getSAMPLE_10() {
        return SAMPLE_10;
    }

    public static final double getSAMPLE_100() {
        return SAMPLE_100;
    }

    public static final double getSAMPLE_1000() {
        return SAMPLE_1000;
    }

    public final boolean isReport(String str, double d) {
        Map<String, Double> map;
        Double d2;
        if (TextUtils.isEmpty(str) || !isExperiment() || isOffline()) {
            return true;
        }
        if (randomSampleVale < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            randomSampleVale = ThreadLocalRandom.current().nextDouble();
        }
        LiveLogSampleData sampleData = getSampleData();
        if (sampleData != null && (map = sampleData.sampleList) != null && (d2 = map.get(str)) != null) {
            d = d2.doubleValue();
        }
        if (randomSampleVale < d) {
            return true;
        }
        return false;
    }
}
