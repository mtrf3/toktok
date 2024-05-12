package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum RangeAudioMode {
    RANGE_AUDIO_MODE_UNDEFINED(0),
    RANGE_AUDIO_MODE_TEAM(1),
    RANGE_AUDIO_MODE_WORLD(2);

    public int value;

    public int value() {
        return this.value;
    }

    public static RangeAudioMode valueOf(String str) {
        return (RangeAudioMode) V0N.LJJJ(RangeAudioMode.class, str);
    }

    RangeAudioMode(int i) {
        this.value = i;
    }
}
