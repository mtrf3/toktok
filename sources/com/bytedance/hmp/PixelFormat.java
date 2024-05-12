package com.bytedance.hmp;

import X.V0N;

/* loaded from: classes34.dex */
public enum PixelFormat {
    PF_NONE(-1),
    PF_YUV420P(0),
    PF_YUV422P(4),
    PF_YUV444P(5),
    PF_NV12(23),
    PF_NV21(24),
    PF_GRAY8(8),
    PF_RGB24(2),
    PF_RGBA32(26),
    PF_GRAY16(30),
    PF_YUVA420P(33),
    PF_RGB48(35),
    PF_RGBA64(107);

    public final int value;

    public int getValue() {
        return this.value;
    }

    public static PixelFormat valueOf(String str) {
        return (PixelFormat) V0N.LJJJ(PixelFormat.class, str);
    }

    PixelFormat(int i) {
        this.value = i;
    }
}
