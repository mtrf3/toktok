package com.ss.ttlivestreamer.core.buffer;

import X.AnonymousClass028;
import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.TextureBufferImpl;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;

/* loaded from: classes12.dex */
public class WrapperNativeTextureBuffer extends TextureBufferImpl {
    public long mNativeObj;

    private native void nativeRelease(long j);

    private native void nativeRetain(long j);

    private native VideoFrame.I420Buffer nativeToI420(long j);

    @Override // com.ss.ttlivestreamer.core.buffer.TextureBufferImpl, com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer
    public int getRefCount() {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.TextureBufferImpl, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public synchronized void release() {
        nativeRelease(this.mNativeObj);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.TextureBufferImpl, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void retain() {
        nativeRetain(this.mNativeObj);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.TextureBufferImpl, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        return nativeToI420(this.mNativeObj);
    }

    public static long isWrapperNativeFrame(VideoFrame videoFrame) {
        if (videoFrame == null) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("call isWrapperNativeFrame while frame is null");
            if (AnonymousClass028.LJI(androidRuntimeException, "WrapperNativeTextureBuffer.isWrapperNativeFrame")) {
                throw androidRuntimeException;
            }
        }
        if (videoFrame == null || !(videoFrame.getBuffer() instanceof WrapperNativeTextureBuffer)) {
            return 0L;
        }
        long j = ((WrapperNativeTextureBuffer) videoFrame.getBuffer()).mNativeObj;
        if (j != 0) {
            return j;
        }
        throw new AndroidRuntimeException("Wrapper texture buffer is null!, What happen!");
    }

    private void setROIInfoNative(long j) {
        if (j != 0) {
            setROIInfo(new RoiInfo(j));
        }
    }

    public WrapperNativeTextureBuffer(int i, int i2, int i3, long j) {
        this(i, i2, i3, new Matrix(), j);
        this.mNativeObj = j;
    }

    public WrapperNativeTextureBuffer(int i, int i2, int i3, Matrix matrix, long j) {
        super(i, i2, VideoFrame.TextureBuffer.Type.RGB, i3, matrix, (TextureBufferImpl.ToI420Interface) null, (Runnable) null);
        this.mNativeObj = j;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.TextureBufferImpl, com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i2 == i && i == 0 && i3 == i5 && i4 == i6) {
            retain();
            return this;
        }
        throw new AndroidRuntimeException("Please support matrix transcat and see construct method");
    }
}
