package com.ss.ttlivestreamer.core.engine;

import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class FFMpegAudioResampler extends NativeObject {
    public AudioFormat mInFormat;
    public AudioFormat mOutFormat;

    /* loaded from: classes12.dex */
    public static class AudioFormat {
        public int channel;
        public int format;
        public int sample;
    }

    public static int bytesPerSample(int i) {
        switch (i) {
            case 0:
            case 5:
                return 1;
            case 1:
            case 6:
                return 2;
            case 2:
            case 3:
            case 7:
            case 8:
                return 4;
            case 4:
            case 9:
                return 8;
            default:
                return 0;
        }
    }

    public static boolean isPlaneFormat(int i) {
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private native int nativeConvert(ByteBuffer[] byteBufferArr, int i, ByteBuffer[] byteBufferArr2);

    private native void nativeCreate(int i, int i2, int i3, int i4, int i5, int i6);

    private native void nativeRelease(long j);

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        nativeRelease(this.mNativeObj);
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public void finalize() {
        release();
    }

    public AudioFormat getInAudioFormat() {
        return this.mInFormat;
    }

    public AudioFormat getOutAudioFormat() {
        return this.mOutFormat;
    }

    public FFMpegAudioResampler(AudioFormat audioFormat, AudioFormat audioFormat2) {
        nativeCreate(audioFormat.format, audioFormat.sample, audioFormat.channel, audioFormat2.format, audioFormat2.sample, audioFormat2.channel);
    }

    public int convert(ByteBuffer[] byteBufferArr, int i, ByteBuffer[] byteBufferArr2) {
        return nativeConvert(byteBufferArr, i, byteBufferArr2);
    }
}
