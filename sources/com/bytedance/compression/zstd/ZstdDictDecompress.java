package com.bytedance.compression.zstd;

import X.OHZ;
import X.YM6;

/* loaded from: classes16.dex */
public class ZstdDictDecompress extends YM6 {
    public long nativePtr;

    private native void free();

    private native void init(byte[] bArr, int i, int i2);

    @Override // X.XN1
    public void doClose() {
        if (this.nativePtr != 0) {
            free();
            this.nativePtr = 0L;
        }
    }

    static {
        OHZ.LJII();
    }

    @Override // X.XN1, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public ZstdDictDecompress(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public ZstdDictDecompress(byte[] bArr, int i, int i2) {
        init(bArr, i, i2);
        if (this.nativePtr != 0) {
            storeFence();
            return;
        }
        throw new IllegalStateException("ZSTD_createDDict failed");
    }
}
