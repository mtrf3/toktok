package com.bytedance.hmp;

import X.V0N;

/* loaded from: classes34.dex */
public enum ColorRange {
    CR_UNSPECIFIED(0),
    CR_MPEG(1),
    CR_JPEG(2),
    CR_NB(3);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static ColorRange valueOf(String str) {
        return (ColorRange) V0N.LJJJ(ColorRange.class, str);
    }

    ColorRange(int i) {
        this.value = i;
    }
}
