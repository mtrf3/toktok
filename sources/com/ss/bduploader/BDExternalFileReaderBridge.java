package com.ss.bduploader;

/* loaded from: classes17.dex */
public class BDExternalFileReaderBridge {
    public void cancel(Object obj) {
        if (obj == null) {
            return;
        }
        ((BDExternalFileReader) obj).cancel();
    }

    public void closeFileWithIndex(Object obj, int i) {
        if (obj == null) {
            return;
        }
        ((BDMultiExternalFileReader) obj).closeFileWithIndex(i);
    }

    public long getValue(Object obj, int i) {
        if (obj == null) {
            return -1L;
        }
        return ((BDExternalFileReader) obj).getValue(i);
    }

    public int openFileWithIndex(Object obj, int i) {
        if (obj == null) {
            return -1;
        }
        return ((BDMultiExternalFileReader) obj).openFileWithIndex(i);
    }

    public long getCrc32ByOffset(Object obj, long j, int i) {
        if (obj == null) {
            return 0L;
        }
        return ((BDExternalFileReader) obj).getCrc32ByOffset(j, i);
    }

    public long multiGetValue(Object obj, int i, int i2) {
        if (obj == null) {
            return -1L;
        }
        return ((BDMultiExternalFileReader) obj).multiGetValue(i, i2);
    }

    public int readSlice(Object obj, int i, byte[] bArr, int i2) {
        if (obj == null || bArr == null || i2 == 0) {
            return 0;
        }
        return ((BDExternalFileReader) obj).readSlice(i, bArr, i2);
    }

    public int readSliceByOffset(Object obj, long j, byte[] bArr, int i, int i2) {
        if (obj == null || bArr == null || i == 0) {
            return 0;
        }
        return ((BDExternalFileReader) obj).readSliceByOffset(j, bArr, i, i2);
    }

    public int multiReadSliceByOffset(Object obj, long j, byte[] bArr, int i, int i2, int i3) {
        if (obj == null || bArr == null || i2 == 0 || i < 0) {
            return 0;
        }
        return ((BDMultiExternalFileReader) obj).readSliceByOffset(j, bArr, i, i2, i3);
    }
}
