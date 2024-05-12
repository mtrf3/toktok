package com.ss.ttlivestreamer.core.buffer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.utils.TimeUtils;

/* loaded from: classes12.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    public long captureMs;
    public VideoFrame.IExtraData extData;
    public final int height;
    public final int id;
    public RoiInfo mROIInfo;
    public ToI420Interface mToI420Interface;
    public int refCount;
    public final Object refCountLock;
    public final Runnable releaseCallback;
    public final SurfaceTextureHelper surfaceTextureHelper;
    public final Matrix transformMatrix;
    public final VideoFrame.TextureBuffer.Type type;
    public final int width;

    /* loaded from: classes12.dex */
    public interface ToI420Interface {
        VideoFrame.I420Buffer toI420(VideoFrame.TextureBuffer textureBuffer);
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public boolean isTexture() {
        return true;
    }

    public void recycle() {
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void release() {
        synchronized (this.refCountLock) {
            int i = this.refCount - 1;
            this.refCount = i;
            if (i != 0) {
                if (i < 0) {
                    throw new AndroidRuntimeException("Texture reference BUG, abort it!");
                }
            } else {
                Runnable runnable = this.releaseCallback;
                if (runnable != null) {
                    runnable.run();
                } else {
                    recycle();
                }
                RoiInfo roiInfo = this.mROIInfo;
                if (roiInfo != null) {
                    roiInfo.release();
                    this.mROIInfo = null;
                }
            }
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void retain() {
        synchronized (this.refCountLock) {
            this.refCount++;
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        SurfaceTextureHelper surfaceTextureHelper = this.surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            return surfaceTextureHelper.textureToYuv(this);
        }
        ToI420Interface toI420Interface = this.mToI420Interface;
        if (toI420Interface != null) {
            return toI420Interface.toI420(this);
        }
        throw new AndroidRuntimeException("BUG, Fixed me");
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public long getCaptureMs() {
        return this.captureMs;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.IExtraData getExtData() {
        return this.extData;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public RoiInfo getROIInfo() {
        return this.mROIInfo;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer
    public int getRefCount() {
        return this.refCount;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.id;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void setROIInfo(RoiInfo roiInfo) {
        RoiInfo roiInfo2 = this.mROIInfo;
        if (roiInfo2 != roiInfo) {
            if (roiInfo2 != null) {
                roiInfo2.release();
            }
            this.mROIInfo = roiInfo;
        }
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public void updateCaptureMs(long j) {
        this.captureMs = j;
    }

    public void updateExtraData(VideoFrame.IExtraData iExtraData) {
        this.extData = iExtraData;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        retain();
        Matrix matrix = new Matrix(this.transformMatrix);
        matrix.preTranslate(i / this.width, i2 / this.height);
        matrix.preScale(i3 / this.width, i4 / this.height);
        TextureBufferImpl textureBufferImpl = new TextureBufferImpl(i5, i6, this.type, this.id, matrix, this.surfaceTextureHelper, new Runnable() { // from class: com.ss.ttlivestreamer.core.buffer.TextureBufferImpl.1
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_buffer_TextureBufferImpl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_buffer_TextureBufferImpl$1__run$___twin___() {
                TextureBufferImpl.this.release();
            }

            public static void com_ss_ttlivestreamer_core_buffer_TextureBufferImpl$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_core_buffer_TextureBufferImpl$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        textureBufferImpl.mToI420Interface = this.mToI420Interface;
        textureBufferImpl.setROIInfo(this.mROIInfo);
        this.mROIInfo = null;
        textureBufferImpl.captureMs = this.captureMs;
        return textureBufferImpl;
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper, Runnable runnable) {
        this(i, i2, type, i3, matrix, surfaceTextureHelper, runnable, (VideoFrame.IExtraData) null);
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, ToI420Interface toI420Interface, Runnable runnable) {
        this(i, i2, type, i3, matrix, toI420Interface, runnable, (VideoFrame.IExtraData) null);
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, ToI420Interface toI420Interface, Runnable runnable, VideoFrame.IExtraData iExtraData) {
        this.refCountLock = new Object();
        this.width = i;
        this.height = i2;
        this.type = type;
        this.id = i3;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = null;
        this.releaseCallback = runnable;
        this.mToI420Interface = toI420Interface;
        this.extData = iExtraData;
        this.captureMs = TimeUtils.currentTimeMs();
        this.refCount = 1;
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, SurfaceTextureHelper surfaceTextureHelper, Runnable runnable, VideoFrame.IExtraData iExtraData) {
        this.refCountLock = new Object();
        this.width = i;
        this.height = i2;
        this.type = type;
        this.id = i3;
        this.transformMatrix = matrix;
        this.surfaceTextureHelper = surfaceTextureHelper;
        this.releaseCallback = runnable;
        this.mToI420Interface = null;
        this.extData = iExtraData;
        this.refCount = 1;
    }
}
