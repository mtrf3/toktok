package com.ttnet.org.chromium.net.impl;

import X.PD5;

/* loaded from: classes12.dex */
public class TTCompressManager {
    public static native byte[] nativeCompressData(byte[] bArr, int i, int i2, int i3);

    public static native byte[] nativeDecompressData(byte[] bArr, int i, int i2);

    public static byte[] LIZIZ(byte[] bArr, int i, PD5 pd5) {
        return nativeDecompressData(bArr, i, pd5.getValue());
    }

    public static byte[] LIZ(byte[] bArr, int i, int i2, PD5 pd5) {
        return nativeCompressData(bArr, i, i2, pd5.getValue());
    }
}
