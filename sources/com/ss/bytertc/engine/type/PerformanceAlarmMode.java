package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum PerformanceAlarmMode {
    NORMAL(0),
    SIMULCAST(1);

    public int value;

    public static PerformanceAlarmMode valueOf(String str) {
        return (PerformanceAlarmMode) V0N.LJJJ(PerformanceAlarmMode.class, str);
    }

    PerformanceAlarmMode(int i) {
        this.value = i;
    }
}
