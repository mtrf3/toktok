package com.bytedance.android.livesdk.livesetting.performance;

import X.C1O;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_perf_metric_disabled")
/* loaded from: classes6.dex */
public final class PerfMetricSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final PerfMetricSwitchSetting INSTANCE = new PerfMetricSwitchSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C1O.LJLIL);

    public static final boolean disable() {
        return INSTANCE.getValue();
    }

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
