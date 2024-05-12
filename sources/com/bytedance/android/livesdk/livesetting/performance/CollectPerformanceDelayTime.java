package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C31029CFt;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("collect_performance_after_delay_time")
/* loaded from: classes6.dex */
public final class CollectPerformanceDelayTime {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 3000;
    public static final CollectPerformanceDelayTime INSTANCE = new CollectPerformanceDelayTime();
    public static final C5H3 delayTime$delegate = C221108m2.LIZIZ(C31029CFt.LJLIL);

    public final long getDelayTime() {
        return ((Number) delayTime$delegate.getValue()).longValue();
    }
}
