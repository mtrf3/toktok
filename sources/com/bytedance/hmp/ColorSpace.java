package com.bytedance.hmp;

import X.V0N;

/* loaded from: classes34.dex */
public enum ColorSpace {
    CS_RGB(0),
    CS_BT709(1),
    CS_UNSPECIFIED(2),
    CS_RESERVED(3),
    CS_FCC(4),
    CS_BT470BG(5),
    CS_SMPTE170M(6),
    CS_SMPTE240M(7),
    CS_YCGCO(8),
    CS_YCOCG(8),
    CS_BT2020_NCL(9),
    CS_BT2020_CL(10),
    CS_SMPTE2085(11),
    CS_CHROMA_DERIVED_NCL(2),
    CS_CHROMA_DERIVED_CL(13),
    CS_ICTCP(14),
    CS_NB(15);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static ColorSpace valueOf(String str) {
        return (ColorSpace) V0N.LJJJ(ColorSpace.class, str);
    }

    ColorSpace(int i) {
        this.value = i;
    }
}
