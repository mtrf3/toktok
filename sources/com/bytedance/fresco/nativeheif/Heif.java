package com.bytedance.fresco.nativeheif;

import X.C81713W5d;

/* loaded from: classes15.dex */
public class Heif {
    public static native boolean isHeif(byte[] bArr, int i);

    public static native void nativeInit();

    public static native int[] parseSimpleMeta(byte[] bArr, int i);

    public static native int[] parseThumbMeta(byte[] bArr, int i);

    public static native HeifData toRgb565(byte[] bArr, int i, boolean z, int i2, int i3, int i4, int i5, int i6);

    public static native HeifData toRgba(byte[] bArr, int i, boolean z, int i2, int i3, int i4, int i5, int i6);

    public static native HeifData toRgbaExternBuffer(byte[] bArr, int i, byte[] bArr2, int i2, boolean z, int i3, int i4, int i5, int i6, int i7);

    public static native HeifData toThumbRgba(byte[] bArr, int i);

    static {
        C81713W5d.LIZ("ttheif_dec");
        C81713W5d.LIZ("heif");
        nativeInit();
    }
}
