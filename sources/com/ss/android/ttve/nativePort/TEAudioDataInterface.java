package com.ss.android.ttve.nativePort;

import X.C63874P5a;
import X.P4F;
import X.P5Z;
import com.ss.android.vesdk.VEAudioCaptureSettings;
import com.ss.android.vesdk.VEInfo;
import com.ss.android.vesdk.audio.VEAudioSample;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class TEAudioDataInterface implements P4F {
    public long handle = nativeCreate();
    public VEAudioCaptureSettings mAudioCaptureSettings;

    private native long nativeCreate();

    private native int nativeInit(long j, int i, int i2, int i3);

    private native void nativeRelease(long j);

    private native int nativeSendArrayData(long j, byte[] bArr, int i, long j2, long j3);

    private native int nativeSendBufferData(long j, ByteBuffer byteBuffer, int i, long j2, long j3);

    @Override // X.P4F
    public void onError(int i, int i2, String str) {
    }

    public synchronized void release() {
        long j = this.handle;
        if (j != 0) {
            nativeRelease(j);
            this.handle = 0L;
        }
    }

    static {
        TENativeLibsLoader.loadRecorder();
    }

    public long getHandle() {
        return this.handle;
    }

    @Override // X.P4F
    public synchronized void onReceive(VEAudioSample vEAudioSample) {
        VEAudioCaptureSettings vEAudioCaptureSettings;
        if (this.handle != 0 && (vEAudioCaptureSettings = this.mAudioCaptureSettings) != null) {
            if (vEAudioCaptureSettings.getDataStore() == 0) {
                nativeSendArrayData(this.handle, ((P5Z) vEAudioSample.getSampleBuffer()).LIZ, vEAudioSample.getByteSize(), vEAudioSample.getTimeStamp(), (System.nanoTime() / 1000) - vEAudioSample.getTimeStamp());
            } else {
                nativeSendBufferData(this.handle, ((C63874P5a) vEAudioSample.getSampleBuffer()).LIZ, vEAudioSample.getByteSize(), vEAudioSample.getTimeStamp(), (System.nanoTime() / 1000) - vEAudioSample.getTimeStamp());
            }
        }
    }

    @Override // X.P4F
    public void onInfo(int i, int i2, double d, Object obj) {
        if (i == VEInfo.TE_INFO_RECORD_AUDIO_CAPTURE_INIT) {
            VEAudioCaptureSettings vEAudioCaptureSettings = (VEAudioCaptureSettings) obj;
            this.mAudioCaptureSettings = vEAudioCaptureSettings;
            long j = this.handle;
            if (j != 0) {
                nativeInit(j, vEAudioCaptureSettings.getSampleRate(), this.mAudioCaptureSettings.getChannel(), this.mAudioCaptureSettings.getBitSamples());
            }
        }
    }
}
