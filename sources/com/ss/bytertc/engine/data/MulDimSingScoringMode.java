package com.ss.bytertc.engine.data;

import X.V0N;

/* loaded from: classes33.dex */
public enum MulDimSingScoringMode {
    MUL_DIM_SING_SCORING_MODE_NOTE(0);

    public int value;

    public int value() {
        return this.value;
    }

    public static MulDimSingScoringMode valueOf(String str) {
        return (MulDimSingScoringMode) V0N.LJJJ(MulDimSingScoringMode.class, str);
    }

    MulDimSingScoringMode(int i) {
        this.value = i;
    }
}
