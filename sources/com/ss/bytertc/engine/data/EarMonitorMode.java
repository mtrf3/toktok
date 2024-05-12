package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum EarMonitorMode {
    EAR_MONITOR_MODE_OFF(0),
    EAR_MONITOR_MODE_ON(1);

    public int value;

    @Override // java.lang.Enum
    public String toString() {
        if (this == EAR_MONITOR_MODE_ON) {
            return "kEarMonitorModeOn";
        }
        return "kEarMonitorModeOff";
    }

    public int value() {
        return this.value;
    }

    public static EarMonitorMode fromId(int i) {
        for (EarMonitorMode earMonitorMode : values()) {
            if (earMonitorMode.value() == i) {
                return earMonitorMode;
            }
        }
        return null;
    }

    public static EarMonitorMode valueOf(String str) {
        return (EarMonitorMode) V0N.LJJJ(EarMonitorMode.class, str);
    }

    EarMonitorMode(int i) {
        this.value = i;
    }
}
