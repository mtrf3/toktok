package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum PerformanceAlarmReason {
    BANDWIDTH_FALLBACKED(0),
    BANDWIDTH_RESUMED(1),
    PERFORMANCE_FALLBACKED(2),
    PERFORMANCE_RESUMED(3);

    public int value;

    public int value() {
        return this.value;
    }

    public static PerformanceAlarmReason valueOf(String str) {
        return (PerformanceAlarmReason) V0N.LJJJ(PerformanceAlarmReason.class, str);
    }

    PerformanceAlarmReason(int i) {
        this.value = i;
    }
}
