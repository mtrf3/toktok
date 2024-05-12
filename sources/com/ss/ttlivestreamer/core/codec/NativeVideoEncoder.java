package com.ss.ttlivestreamer.core.codec;

import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoEncoder;
import com.ss.ttlivestreamer.core.utils.TEBundle;

/* loaded from: classes12.dex */
public class NativeVideoEncoder extends VideoEncoder {
    private native String nativeGetVersion(long j);

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public void RequestIDRFrame() {
        throw new AndroidRuntimeException("RequestIDRFrame");
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public String getEncoderInfo() {
        return nativeGetVersion(this.mNativeObj);
    }

    public NativeVideoEncoder(long j) {
        this.mNativeObj = j;
    }

    public static boolean isNativeVideoEncoderInstence(Object obj) {
        return obj instanceof NativeVideoEncoder;
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public int Encode(VideoFrame videoFrame) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public boolean InitEncoder(TEBundle tEBundle) {
        throw new AndroidRuntimeException("Native direct mode");
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoEncoder
    public void SetBitrate(int i) {
        throw new AndroidRuntimeException("SetBitrate");
    }
}
