package com.bytedance.compression.zstd;

import X.OHZ;
import X.YM7;

/* loaded from: classes16.dex */
public class ZstdDecompress {
    public static native long decompressedSize0(byte[] bArr, int i, int i2);

    public static native int loadDictDecompress(long j, byte[] bArr, int i);

    public static native int loadFastDictDecompress(long j, ZstdDictDecompress zstdDictDecompress);

    static {
        OHZ.LJII();
    }

    public static byte[] decompress(byte[] bArr) {
        long decompressedSize = decompressedSize(bArr);
        if (decompressedSize <= 2147483647L) {
            return decompress(bArr, (int) decompressedSize);
        }
        throw new YM7(Zstd.errGeneric(), "original size is greater than MAX_INT");
    }

    public static long decompressedSize(byte[] bArr) {
        return decompressedSize(bArr, 0);
    }

    public static byte[] decompress(byte[] bArr, ZstdDictDecompress zstdDictDecompress) {
        long decompressedSize = decompressedSize(bArr);
        if (decompressedSize <= 2147483647L) {
            return decompress(bArr, zstdDictDecompress, (int) decompressedSize);
        }
        throw new YM7(Zstd.errGeneric(), "original size is greater than MAX_INT");
    }

    public static long decompressedSize(byte[] bArr, int i) {
        return decompressedSize(bArr, i, bArr.length - i);
    }

    public static byte[] decompress(byte[] bArr, byte[] bArr2) {
        long decompressedSize = decompressedSize(bArr);
        if (decompressedSize <= 2147483647L) {
            return decompress(bArr, bArr2, (int) decompressedSize);
        }
        throw new YM7(Zstd.errGeneric(), "original size is greater than MAX_INT");
    }

    public static byte[] decompress(byte[] bArr, int i) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(bArr, i);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static byte[] decompress(byte[] bArr, ZstdDictDecompress zstdDictDecompress, int i) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompress(bArr, i);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressedSize(byte[] bArr, int i, int i2) {
        if (i < bArr.length) {
            int i3 = i + i2;
            if (i3 <= bArr.length) {
                return decompressedSize0(bArr, i, i2);
            }
            throw new ArrayIndexOutOfBoundsException(i3);
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public static byte[] decompress(byte[] bArr, byte[] bArr2, int i) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr2);
            return zstdDecompressCtx.decompress(bArr, i);
        } finally {
            zstdDecompressCtx.close();
        }
    }
}
