package org.libsdl.app;

/* loaded from: classes7.dex */
public interface AudioRecorderInterfaceExt extends AudioRecorderInterface {
    int initAudioConfig(int i, int i2, int i3, int i4, int i5);

    int onProcessData(byte[] bArr, int i, long j);

    void startMicError();
}
