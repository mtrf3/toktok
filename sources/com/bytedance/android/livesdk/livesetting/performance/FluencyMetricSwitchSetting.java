package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C5H3;
import X.CGI;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_perf_fluency_metric_disabled")
/* loaded from: classes6.dex */
public final class FluencyMetricSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FluencyMetricSwitchSetting INSTANCE = new FluencyMetricSwitchSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(CGI.LJLIL);

    public static final boolean disable() {
        return INSTANCE.getValue();
    }

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
