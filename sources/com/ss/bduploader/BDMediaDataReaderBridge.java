package com.ss.bduploader;

/* loaded from: classes17.dex */
public class BDMediaDataReaderBridge {
    public int close(Object obj, int i) {
        if (obj == null || i < 0) {
            return 0;
        }
        return ((BDMediaDataReader) obj).close(i);
    }

    public int open(Object obj, int i) {
        if (obj == null) {
            return 0;
        }
        return ((BDMediaDataReader) obj).open(i);
    }

    public long getValue(Object obj, int i, int i2) {
        if (obj == null) {
            return -1L;
        }
        return ((BDMediaDataReader) obj).getValue(i, i2);
    }

    public int read(Object obj, int i, long j, byte[] bArr, int i2) {
        if (obj == null || bArr == null || i2 == 0) {
            return 0;
        }
        return ((BDMediaDataReader) obj).read(i, j, bArr, i2);
    }
}
