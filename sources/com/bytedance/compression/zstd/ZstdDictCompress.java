package com.bytedance.compression.zstd;

import X.OHZ;
import X.YM6;

/* loaded from: classes16.dex */
public class ZstdDictCompress extends YM6 {
    public int level;
    public long nativePtr;

    private native void free();

    private native void init(byte[] bArr, int i, int i2, int i3);

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

    public int level() {
        return this.level;
    }

    public ZstdDictCompress(byte[] bArr, int i) {
        this(bArr, 0, bArr.length, i);
    }

    public ZstdDictCompress(byte[] bArr, int i, int i2, int i3) {
        ZstdCompress.defaultCompressionLevel();
        this.level = i3;
        if (bArr.length - i >= 0) {
            init(bArr, i, i2, i3);
            if (0 != this.nativePtr) {
                storeFence();
                return;
            }
            throw new IllegalStateException("ZSTD_createCDict failed");
        }
        throw new IllegalArgumentException("Dictionary buffer is to short");
    }
}
