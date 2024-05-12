package com.ss.android.vesdk.audio;

import X.C63874P5a;
import X.C63876P5c;
import X.P5Z;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class VEAudioSample {
    public int byteSize;
    public C63876P5c sampleBuffer;
    public long timeStamp;

    public int getByteSize() {
        return this.byteSize;
    }

    public C63876P5c getSampleBuffer() {
        return this.sampleBuffer;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public VEAudioSample(C63876P5c c63876P5c, int i) {
        this.sampleBuffer = c63876P5c;
        this.byteSize = i;
    }

    public static VEAudioSample createByteArrayAudioSample(byte[] bArr, int i) {
        return new VEAudioSample(new P5Z(bArr), i);
    }

    public static VEAudioSample createByteBufferAudioSample(ByteBuffer byteBuffer, int i) {
        return new VEAudioSample(new C63874P5a(byteBuffer), i);
    }
}
