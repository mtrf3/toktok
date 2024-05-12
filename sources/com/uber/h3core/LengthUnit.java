package com.uber.h3core;

import X.V0N;

/* loaded from: classes24.dex */
public enum LengthUnit {
    rads,
    km,
    m;

    public static LengthUnit valueOf(String str) {
        return (LengthUnit) V0N.LJJJ(LengthUnit.class, str);
    }
}
