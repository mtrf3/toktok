package org.libsdl.app;

/* loaded from: classes7.dex */
public interface AudioRecorderInterface {
    int addPCMData(byte[] bArr, int i, long j);

    int closeWavFile(boolean z);

    int initWavFile(int i, int i2, double d);

    void lackPermission();

    void recordStatus(boolean z);
}
