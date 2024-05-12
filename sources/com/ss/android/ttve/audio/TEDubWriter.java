package com.ss.android.ttve.audio;

/* loaded from: classes12.dex */
public class TEDubWriter {
    public final long LIZ = nativeCreate();
    public long LIZIZ;

    public native int nativeAddPCMData(long j, byte[] bArr, int i);

    public native int nativeCloseWavFile(long j);

    public native long nativeCreate();

    public native void nativeDestroy(long j);

    public native long nativeGetCurrentTime(long j);

    public native int nativeInitWavFile(long j, String str, int i, int i2, double d, int i3, int i4);
}
