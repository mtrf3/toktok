package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum RtcMode {
    RTC_MODE_GENERAL(0),
    RTC_MODE_LOCAL_AUDIO(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static RtcMode valueOf(String str) {
        return (RtcMode) V0N.LJJJ(RtcMode.class, str);
    }

    RtcMode(int i) {
        this.value = i;
    }
}
