package com.ss.bytertc.engine.type;

import X.V0N;

/* loaded from: classes33.dex */
public enum DivideModel {
    EFFECT(0),
    DEFAULT(1);

    public int value;

    public int value() {
        return this.value;
    }

    public static DivideModel valueOf(String str) {
        return (DivideModel) V0N.LJJJ(DivideModel.class, str);
    }

    DivideModel(int i) {
        this.value = i;
    }
}
