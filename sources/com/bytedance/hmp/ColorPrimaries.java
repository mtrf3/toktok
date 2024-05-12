package com.bytedance.hmp;

import X.V0N;

/* loaded from: classes34.dex */
public enum ColorPrimaries {
    CP_RESERVED0(0),
    CP_BT709(1),
    CP_UNSPECIFIED(2),
    CP_RESERVED(3),
    CP_BT470M(4),
    CP_BT470BG(5),
    CP_SMPTE170M(6),
    CP_SMPTE240M(7),
    CP_FILM(8),
    CP_BT2020(9),
    CP_SMPTE428(10),
    CP_SMPTEST428_1(10),
    CP_SMPTE431(11),
    CP_SMPTE432(12),
    CP_EBU3213(22),
    CP_JEDEC_P22(22),
    CP_NB(23);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static ColorPrimaries valueOf(String str) {
        return (ColorPrimaries) V0N.LJJJ(ColorPrimaries.class, str);
    }

    ColorPrimaries(int i) {
        this.value = i;
    }
}
