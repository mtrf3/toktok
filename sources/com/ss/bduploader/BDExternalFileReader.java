package com.ss.bduploader;

/* loaded from: classes17.dex */
public interface BDExternalFileReader {
    void cancel();

    long getCrc32ByOffset(long j, int i);

    long getValue(int i);

    int readSlice(int i, byte[] bArr, int i2);

    int readSliceByOffset(long j, byte[] bArr, int i, int i2);
}
