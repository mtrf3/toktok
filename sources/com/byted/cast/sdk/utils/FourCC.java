package com.byted.cast.sdk.utils;

/* loaded from: classes29.dex */
public final class FourCC {
    public static final int FOURCC_I420 = makeFourCC('I', '4', '2', '0');
    public static final int FOURCC_NV21 = makeFourCC('N', 'V', '2', '1');
    public static final int FOURCC_NV12 = makeFourCC('N', 'V', '1', '2');
    public static final int FOURCC_ABGR = makeFourCC('A', 'B', 'G', 'R');

    public static int makeFourCC(char c, char c2, char c3, char c4) {
        return c | (c2 << '\b') | (c3 << 16) | (c4 << 24);
    }
}
