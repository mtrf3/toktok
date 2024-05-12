package com.bytedance.compression.zstd;

import X.OHZ;
import X.XN1;
import X.YM7;
import java.util.Arrays;

/* loaded from: classes16.dex */
public class ZstdDecompressCtx extends XN1 {
    public ZstdDictDecompress decompression_dict;
    public long nativePtr;

    private native long decompressByteArray0(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    private native void free();

    private native void init();

    private native long loadDDict0(byte[] bArr);

    private native long loadDDictFast0(ZstdDictDecompress zstdDictDecompress);

    private native long reset0();

    private void ensureOpen() {
        if (this.nativePtr != 0) {
        } else {
            throw new IllegalStateException("Decompression context is closed");
        }
    }

    @Override // X.XN1
    public void doClose() {
        if (this.nativePtr != 0) {
            free();
            this.nativePtr = 0L;
        }
    }

    public ZstdDecompressCtx() {
        init();
        if (0 != this.nativePtr) {
            storeFence();
            return;
        }
        throw new IllegalStateException("ZSTD_createDeCompressCtx failed");
    }

    public void reset() {
        ensureOpen();
        long reset0 = reset0();
        if (!Zstd.isError(reset0)) {
        } else {
            throw new YM7(reset0);
        }
    }

    static {
        OHZ.LJII();
    }

    @Override // X.XN1, java.io.Closeable, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    public ZstdDecompressCtx loadDict(ZstdDictDecompress zstdDictDecompress) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            zstdDictDecompress.acquireSharedLock();
            try {
                long loadDDictFast0 = loadDDictFast0(zstdDictDecompress);
                if (!Zstd.isError(loadDDictFast0)) {
                    this.decompression_dict = zstdDictDecompress;
                    return this;
                }
                throw new YM7(loadDDictFast0);
            } finally {
                zstdDictDecompress.releaseSharedLock();
                releaseSharedLock();
            }
        }
        throw new IllegalStateException("Decompression context is closed");
    }

    public ZstdDecompressCtx loadDict(byte[] bArr) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            try {
                long loadDDict0 = loadDDict0(bArr);
                if (!Zstd.isError(loadDDict0)) {
                    this.decompression_dict = null;
                    return this;
                }
                throw new YM7(loadDDict0);
            } finally {
                releaseSharedLock();
            }
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public byte[] decompress(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        int decompress = decompress(bArr2, bArr);
        if (decompress != i) {
            return Arrays.copyOfRange(bArr2, 0, decompress);
        }
        return bArr2;
    }

    public int decompress(byte[] bArr, byte[] bArr2) {
        return decompressByteArray(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public int decompressByteArray(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            try {
                long decompressByteArray0 = decompressByteArray0(bArr, i, i2, bArr2, i3, i4);
                if (!Zstd.isError(decompressByteArray0)) {
                    if (decompressByteArray0 <= 2147483647L) {
                        return (int) decompressByteArray0;
                    }
                    throw new YM7(Zstd.errGeneric(), "Output size is greater than MAX_INT");
                }
                throw new YM7(decompressByteArray0);
            } finally {
                releaseSharedLock();
            }
        }
        throw new IllegalStateException("Decompression context is closed");
    }
}
