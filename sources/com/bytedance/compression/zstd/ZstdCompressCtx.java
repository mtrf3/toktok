package com.bytedance.compression.zstd;

import X.OHZ;
import X.XN1;
import X.YM7;
import java.util.Arrays;

/* loaded from: classes16.dex */
public class ZstdCompressCtx extends XN1 {
    public ZstdDictCompress compression_dict;
    public long nativePtr;

    private native long compressByteArray0(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4);

    private native void free();

    private native void init();

    private native long loadCDict0(byte[] bArr);

    private native long loadCDictFast0(ZstdDictCompress zstdDictCompress);

    private native long reset0();

    private native void setChecksum0(boolean z);

    private native void setContentSize0(boolean z);

    private native void setDictID0(boolean z);

    private native void setLevel0(int i);

    private native long setPledgedSrcSize0(long j);

    private void ensureOpen() {
        if (this.nativePtr != 0) {
        } else {
            throw new IllegalStateException("Compression context is closed");
        }
    }

    @Override // X.XN1
    public void doClose() {
        if (this.nativePtr != 0) {
            free();
            this.nativePtr = 0L;
        }
    }

    public ZstdCompressCtx() {
        init();
        if (0 != this.nativePtr) {
            storeFence();
            return;
        }
        throw new IllegalStateException("ZSTD_createCompressCtx failed");
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

    public byte[] compress(byte[] bArr) {
        long compressBound = ZstdCompress.compressBound(bArr.length);
        if (compressBound <= 2147483647L) {
            int i = (int) compressBound;
            byte[] bArr2 = new byte[i];
            return Arrays.copyOfRange(bArr2, 0, compressByteArray(bArr2, 0, i, bArr, 0, bArr.length));
        }
        throw new YM7(Zstd.errGeneric(), "Max output size is greater than MAX_INT");
    }

    public ZstdCompressCtx loadDict(ZstdDictCompress zstdDictCompress) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            zstdDictCompress.acquireSharedLock();
            try {
                long loadCDictFast0 = loadCDictFast0(zstdDictCompress);
                if (!Zstd.isError(loadCDictFast0)) {
                    this.compression_dict = zstdDictCompress;
                    return this;
                }
                throw new YM7(loadCDictFast0);
            } finally {
                zstdDictCompress.releaseSharedLock();
                releaseSharedLock();
            }
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public ZstdCompressCtx setChecksum(boolean z) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            setChecksum0(z);
            releaseSharedLock();
            return this;
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public ZstdCompressCtx setContentSize(boolean z) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            setContentSize0(z);
            releaseSharedLock();
            return this;
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public ZstdCompressCtx setDictID(boolean z) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            setDictID0(z);
            releaseSharedLock();
            return this;
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public ZstdCompressCtx setLevel(int i) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            setLevel0(i);
            releaseSharedLock();
            return this;
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public ZstdCompressCtx setLong(int i) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            ZstdCompress.setCompressionLong(this.nativePtr, i);
            releaseSharedLock();
            return this;
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public void setPledgedSrcSize(long j) {
        ensureOpen();
        long pledgedSrcSize0 = setPledgedSrcSize0(j);
        if (!Zstd.isError(pledgedSrcSize0)) {
        } else {
            throw new YM7(pledgedSrcSize0);
        }
    }

    public ZstdCompressCtx setWorkers(int i) {
        acquireSharedLock();
        ZstdCompress.setCompressionWorkers(this.nativePtr, i);
        releaseSharedLock();
        return this;
    }

    public ZstdCompressCtx loadDict(byte[] bArr) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            try {
                long loadCDict0 = loadCDict0(bArr);
                if (!Zstd.isError(loadCDict0)) {
                    this.compression_dict = null;
                    return this;
                }
                throw new YM7(loadCDict0);
            } finally {
                releaseSharedLock();
            }
        }
        throw new IllegalStateException("Compression context is closed");
    }

    public int compress(byte[] bArr, byte[] bArr2) {
        return compressByteArray(bArr, 0, bArr.length, bArr2, 0, bArr2.length);
    }

    public int compressByteArray(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        if (this.nativePtr != 0) {
            acquireSharedLock();
            try {
                long compressByteArray0 = compressByteArray0(bArr, i, i2, bArr2, i3, i4);
                if (!Zstd.isError(compressByteArray0)) {
                    if (compressByteArray0 <= 2147483647L) {
                        return (int) compressByteArray0;
                    }
                    throw new YM7(Zstd.errGeneric(), "Output size is greater than MAX_INT");
                }
                throw new YM7(compressByteArray0);
            } finally {
                releaseSharedLock();
            }
        }
        throw new IllegalStateException("Compression context is closed");
    }
}
