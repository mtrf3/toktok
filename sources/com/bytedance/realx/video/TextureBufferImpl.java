package com.bytedance.realx.video;

import X.C90012ZUi;
import X.C90021ZUr;
import X.RunnableC90005ZUb;
import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.os.Handler;
import com.bytedance.realx.base.RefCountDelegate;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.TextureBufferImpl;
import com.bytedance.realx.video.VideoFrame;
import java.util.concurrent.Callable;

/* loaded from: classes33.dex */
public class TextureBufferImpl implements VideoFrame.TextureBuffer {
    public final int height;
    public final int id;
    public final RefCountDelegate refCountDelegate;
    public FilterType scaleFilter;
    public final Handler toI420Handler;
    public final Matrix transformMatrix;
    public final VideoFrame.TextureBuffer.Type type;
    public final int unscaledHeight;
    public final int unscaledWidth;
    public final int width;
    public final YuvConverter yuvConverter;

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer, com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ int getBufferType() {
        return C90021ZUr.LIZ(this);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public final /* synthetic */ VideoFrame.NV12Buffer toNV12() {
        return C90012ZUi.LIZ(this);
    }

    public /* synthetic */ TextureBufferImpl lambda$copyData$4() {
        int i;
        final int dequeueTexture = this.yuvConverter.dequeueTexture(this.width, this.height);
        if (dequeueTexture == 0) {
            return null;
        }
        if (this.type == VideoFrame.TextureBuffer.Type.OES) {
            i = 11;
        } else {
            i = 10;
        }
        this.yuvConverter.drawTexture(i, this.id, dequeueTexture, this.width, this.height);
        return new TextureBufferImpl(this.width, this.height, VideoFrame.TextureBuffer.Type.RGB, dequeueTexture, this.transformMatrix, this.toI420Handler, this.yuvConverter, new Runnable() { // from class: X.ZVX
            @Override // java.lang.Runnable
            public final void run() {
                TextureBufferImpl.this.lambda$copyData$3(dequeueTexture);
            }
        });
    }

    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$1() {
        return this.yuvConverter.convert(this);
    }

    public /* synthetic */ VideoFrame.I420Buffer lambda$toI420$2() {
        return this.yuvConverter.convert(this, this.scaleFilter, this.unscaledWidth, this.unscaledHeight);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer copyData() {
        return (VideoFrame.Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: X.ZVV
            @Override // java.util.concurrent.Callable
            public final Object call() {
                TextureBufferImpl lambda$copyData$4;
                lambda$copyData$4 = TextureBufferImpl.this.lambda$copyData$4();
                return lambda$copyData$4;
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public EGLContext getEglContext() {
        Handler handler = this.toI420Handler;
        if (handler == null) {
            return null;
        }
        return (EGLContext) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable() { // from class: X.ZUZ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return EGL14.eglGetCurrentContext();
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTypeGlTarget() {
        return this.type.getGlTarget();
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public float[] nativeGetTransFormMatrix() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer, com.bytedance.realx.base.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        FilterType filterType = this.scaleFilter;
        if (filterType == null || filterType == FilterType.Origin) {
            return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: X.ZVR
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    VideoFrame.I420Buffer lambda$toI420$1;
                    lambda$toI420$1 = TextureBufferImpl.this.lambda$toI420$1();
                    return lambda$toI420$1;
                }
            });
        }
        return (VideoFrame.I420Buffer) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable() { // from class: X.ZVT
            @Override // java.util.concurrent.Callable
            public final Object call() {
                VideoFrame.I420Buffer lambda$toI420$2;
                lambda$toI420$2 = TextureBufferImpl.this.lambda$toI420$2();
                return lambda$toI420$2;
            }
        });
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public long getNativeEglContext() {
        EGLContext eglContext = getEglContext();
        if (eglContext == null) {
            return 0L;
        }
        return eglContext.getNativeHandle();
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public FilterType getScaleFilter() {
        return this.scaleFilter;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getTextureId() {
        return this.id;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
        return this.unscaledHeight;
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
        return this.unscaledWidth;
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    public /* synthetic */ void lambda$copyData$3(int i) {
        this.yuvConverter.queueTexture(i);
    }

    public TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2) {
        return applyTransformMatrix(matrix, i, i2, i, i2);
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        Matrix matrix = new Matrix();
        matrix.preScale(Math.min(i, (getWidth() * i2) / getHeight()) / getWidth(), Math.min(i2, (getHeight() * i) / getWidth()) / getHeight());
        matrix.preTranslate(i3 / i, (i2 - (i4 + r3)) / i2);
        return applyTransformMatrix(matrix, i, i2);
    }

    private TextureBufferImpl applyTransformMatrix(Matrix matrix, int i, int i2, int i3, int i4) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        retain();
        return new TextureBufferImpl(i, i2, i3, i4, this.type, this.id, this.scaleFilter, matrix2, this.toI420Handler, this.yuvConverter, new RunnableC90005ZUb(0, this));
    }

    @Override // com.bytedance.realx.video.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(i / this.width, (r3 - (i2 + i4)) / this.height);
        matrix.preScale(i3 / this.width, i4 / this.height);
        this.scaleFilter = FilterType.Origin;
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i3) / this.width), Math.round((this.unscaledHeight * i4) / this.height), i5, i6);
    }

    @Override // com.bytedance.realx.video.VideoFrame.TextureBuffer
    public VideoFrame.Buffer cropAndScaleWithFilter(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(i / this.width, (r3 - (i2 + i4)) / this.height);
        matrix.preScale(i3 / this.width, i4 / this.height);
        this.scaleFilter = FilterType.fromValue(i7);
        return applyTransformMatrix(matrix, Math.round((this.unscaledWidth * i3) / this.width), Math.round((this.unscaledHeight * i4) / this.height), i5, i6);
    }

    public TextureBufferImpl(int i, int i2, VideoFrame.TextureBuffer.Type type, int i3, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i;
        this.height = i2;
        this.type = type;
        this.id = i3;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public TextureBufferImpl(int i, int i2, int i3, int i4, VideoFrame.TextureBuffer.Type type, int i5, FilterType filterType, Matrix matrix, Handler handler, YuvConverter yuvConverter, Runnable runnable) {
        this.unscaledWidth = i;
        this.unscaledHeight = i2;
        this.width = i3;
        this.height = i4;
        this.type = type;
        this.id = i5;
        this.scaleFilter = filterType;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.yuvConverter = yuvConverter;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }
}
