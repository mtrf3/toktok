package com.ss.ttlivestreamer.livestreamv2.render;

import X.AnonymousClass028;
import X.X1D;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import com.ss.ttlivestreamer.livestreamv2.RenderView;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class CanvasRenderView extends RenderView {
    public SafeHandlerThread mCanvasThread;
    public Handler mCanvasThreadHandler;
    public int mFB;
    public boolean mFitMode;
    public int mFrameHeight;
    public int mFrameWidth;
    public Matrix mMatrix;
    public boolean mMirrorX;
    public boolean mMirrorY;
    public Paint mPaint;
    public boolean mSizedChanged;
    public SurfaceHolder mSurfaceHolder;

    @Override // com.ss.ttlivestreamer.livestreamv2.RenderView, com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("begin release[");
        LIZ.append(this);
        LIZ.append("]");
        AVLog.ioi("CanvasRenderView", X1D.LIZIZ(LIZ));
        Handler glThreadHandler = getGlThreadHandler();
        if (glThreadHandler != null) {
            if (!glThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.render.CanvasRenderView.3
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_render_CanvasRenderView$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_render_CanvasRenderView$3__run$___twin___() {
                    CanvasRenderView.this.onSurfaceDestroy();
                }

                public static void com_ss_ttlivestreamer_livestreamv2_render_CanvasRenderView$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ2;
                    try {
                        anonymousClass3.com_ss_ttlivestreamer_livestreamv2_render_CanvasRenderView$3__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            })) {
                AVLog.ioe("CanvasRenderView", Log.getStackTraceString(new Exception("Already release at")));
                return;
            } else {
                SafeHandlerThreadPoolExecutor.unlockThread(this.mCanvasThread);
                this.mCanvasThread = null;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("end release[");
        LIZ2.append(this);
        LIZ2.append("]");
        AVLog.ioi("CanvasRenderView", X1D.LIZIZ(LIZ2));
    }

    public void addViewCallback() {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addViewCallback() by ");
            LIZ.append(this);
            AVLog.ioi("CanvasRenderView", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.RenderView, com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink
    public void init() {
        SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("CanvasRenderThread");
        this.mCanvasThread = lockThread;
        lockThread.start();
        this.mCanvasThreadHandler = this.mCanvasThread.getHandler();
        setRenderer(this);
    }

    public void removeViewCallback() {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("removeViewCallback() by ");
            LIZ.append(this);
            AVLog.ioi("CanvasRenderView", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink
    public Handler getGlThreadHandler() {
        return this.mCanvasThreadHandler;
    }

    public CanvasRenderView(SurfaceView surfaceView) {
        super(surfaceView);
        this.mPaint = new Paint();
        this.mMatrix = new Matrix();
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink
    public void initSurfaceView(SurfaceView surfaceView) {
        super.initSurfaceView(surfaceView);
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink
    public void initTextureView(TextureView textureView) {
        throw new AndroidRuntimeException("BUG");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.RenderView
    public boolean isMirror(boolean z) {
        if (z) {
            return this.mMirrorX;
        }
        return this.mMirrorY;
    }

    public void onBuffer(final VideoFrame.Buffer buffer) {
        if (this.mFB == 0) {
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.mFB = iArr[0];
        }
        VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
        GLES20.glBindFramebuffer(36160, this.mFB);
        GLES20.glFramebufferTexture2D(36160, 36064, textureBuffer.getType().getGlTarget(), textureBuffer.getTextureId(), 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(buffer.getHeight() * buffer.getWidth() * 4);
        GLES20.glReadPixels(0, 0, buffer.getWidth(), buffer.getHeight(), 6408, 5121, allocateDirect);
        GlUtil.checkAnyGLES2Error("BUG");
        GLES20.glBindFramebuffer(36160, 0);
        final Bitmap createBitmap = Bitmap.createBitmap(buffer.getWidth(), buffer.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        getGlThreadHandler().post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.render.CanvasRenderView.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_render_CanvasRenderView$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_render_CanvasRenderView$2__run$___twin___() {
                CanvasRenderView.this.onCanvasDrawBuffer(createBitmap, buffer);
            }

            public static void com_ss_ttlivestreamer_livestreamv2_render_CanvasRenderView$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_livestreamv2_render_CanvasRenderView$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.RenderView, com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.GLRenderer
    public void onDrawFrame(VideoFrame videoFrame) {
        throw new AndroidRuntimeException("BUG");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.RenderView, com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink, com.ss.ttlivestreamer.core.engine.VideoSink
    public void onFrame(final VideoFrame videoFrame) {
        if (this.mCanvasThread != null) {
            videoFrame.retain();
            if (this.mFB == 0) {
                int[] iArr = new int[1];
                GLES20.glGenFramebuffers(1, iArr, 0);
                this.mFB = iArr[0];
            }
            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) videoFrame.getBuffer();
            GLES20.glBindFramebuffer(36160, this.mFB);
            GLES20.glFramebufferTexture2D(36160, 36064, textureBuffer.getType().getGlTarget(), textureBuffer.getTextureId(), 0);
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(textureBuffer.getHeight() * textureBuffer.getWidth() * 4);
            GLES20.glReadPixels(0, 0, textureBuffer.getWidth(), textureBuffer.getHeight(), 6408, 5121, allocateDirect);
            GlUtil.checkAnyGLES2Error("BUG");
            GLES20.glBindFramebuffer(36160, 0);
            final Bitmap createBitmap = Bitmap.createBitmap(textureBuffer.getWidth(), textureBuffer.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(allocateDirect);
            getGlThreadHandler().post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.render.CanvasRenderView.1
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_render_CanvasRenderView$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_render_CanvasRenderView$1__run$___twin___() {
                    CanvasRenderView.this.onCanvasDrawFrame(createBitmap, videoFrame);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_render_CanvasRenderView$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_render_CanvasRenderView$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.RenderView, com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer
    public void setFitMode(boolean z) {
        this.mFitMode = z;
        this.mSizedChanged = true;
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink, android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceCreated() [");
        LIZ.append(this);
        LIZ.append("]");
        AVLog.ioi("CanvasRenderView", X1D.LIZIZ(LIZ));
        this.mNeedReportFirstRender = true;
        if (this.mSurfaceHolder == null) {
            this.mSurfaceHolder = surfaceHolder;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mSurfaceHolder is set to ");
            LIZ2.append(this.mSurfaceHolder);
            AVLog.ioi("CanvasRenderView", X1D.LIZIZ(LIZ2));
            return;
        }
        AVLog.ioe("CanvasRenderView", Log.getStackTraceString(new Exception("Already received onSurfaceCreated at")));
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceDestroy() [");
        LIZ.append(this);
        LIZ.append("]");
        AVLog.ioi("CanvasRenderView", X1D.LIZIZ(LIZ));
        if (this.mSurfaceHolder == null) {
            return;
        }
        synchronized (this) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mSurfaceHolder: ");
            LIZ2.append(this.mSurfaceHolder);
            LIZ2.append(" is set to null");
            AVLog.ioi("CanvasRenderView", X1D.LIZIZ(LIZ2));
            this.mSurfaceHolder = null;
        }
    }

    public CanvasRenderView(SurfaceView surfaceView, boolean z) {
        super(surfaceView, null, z, false);
        this.mPaint = new Paint();
        this.mMatrix = new Matrix();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.RenderView
    public void calcViewRatio(int i, int i2) {
        float f;
        float f2;
        float f3;
        float f4;
        boolean z = this.mFitMode;
        float f5 = i;
        float f6 = i2;
        float f7 = f5 / f6;
        int i3 = this.mWindWidth;
        int i4 = this.mWindHeight;
        float f8 = i3 / i4;
        float f9 = 0.0f;
        if (z) {
            if (f7 > f8) {
                f = i3 / f5;
                f3 = (-(i4 - (f6 * f))) / 2.0f;
            } else {
                f = i3 / f5;
                f2 = -(i3 - (f5 * f));
                f9 = f2 / 2.0f;
                f3 = 0.0f;
            }
        } else if (f7 < f8) {
            f = i3 / f5;
            f3 = ((f6 * f) - i4) / 2.0f;
        } else {
            f = i4 / f6;
            f2 = (f5 * f) - i3;
            f9 = f2 / 2.0f;
            f3 = 0.0f;
        }
        this.mMatrix.reset();
        this.mMatrix.postScale(f, f);
        this.mMatrix.postTranslate(-f9, -f3);
        this.mMatrix.postTranslate((-this.mWindWidth) / 2.0f, (-this.mWindHeight) / 2.0f);
        Matrix matrix = this.mMatrix;
        float f10 = -1.0f;
        if (this.mMirrorX) {
            f4 = -1.0f;
        } else {
            f4 = 1.0f;
        }
        if (!this.mMirrorY) {
            f10 = 1.0f;
        }
        matrix.postScale(f4, f10);
        this.mMatrix.postTranslate(this.mWindWidth / 2.0f, this.mWindHeight / 2.0f);
        this.mFrameHeight = i2;
        this.mFrameWidth = i;
    }

    public void onCanvasDrawBuffer(Bitmap bitmap, VideoFrame.Buffer buffer) {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            Canvas lockCanvas = surfaceHolder.lockCanvas();
            if (lockCanvas == null) {
                return;
            }
            int width = buffer.getWidth();
            int height = buffer.getHeight();
            if (this.mSizedChanged || height != this.mFrameHeight || width != this.mFrameWidth) {
                calcViewRatio(width, height);
                this.mSizedChanged = false;
            }
            lockCanvas.drawBitmap(bitmap, this.mMatrix, null);
            this.mSurfaceHolder.unlockCanvasAndPost(lockCanvas);
            if (this.mNeedReportFirstRender) {
                this.mNeedReportFirstRender = false;
                GLRenderVideoSink.GlRenderInfoListener glRenderInfoListener = this.mGlRenderInfoListener;
                if (glRenderInfoListener != null) {
                    long currentTimeMs = TimeUtils.currentTimeMs() - buffer.getCaptureMs();
                    if (currentTimeMs < 0 || currentTimeMs > 10000) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Timestamp bug(");
                        LIZ.append(buffer.getCaptureMs());
                        LIZ.append(" VS ");
                        LIZ.append(TimeUtils.currentTimeMs());
                        LIZ.append(")");
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ));
                        if (AnonymousClass028.LJI(androidRuntimeException, "CanvasRenderView.onCanvasDrawBuffer")) {
                            throw androidRuntimeException;
                        }
                    }
                    glRenderInfoListener.onInfo(3, (int) currentTimeMs, 0);
                }
            }
        }
        buffer.release();
    }

    public void onCanvasDrawFrame(Bitmap bitmap, VideoFrame videoFrame) {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            Canvas lockCanvas = surfaceHolder.lockCanvas();
            if (lockCanvas == null) {
                return;
            }
            int rotatedWidth = videoFrame.getRotatedWidth();
            int rotatedHeight = videoFrame.getRotatedHeight();
            if (this.mSizedChanged || rotatedHeight != this.mFrameHeight || rotatedWidth != this.mFrameWidth) {
                calcViewRatio(rotatedWidth, rotatedHeight);
                this.mSizedChanged = false;
            }
            VideoFrameStatics videoFrameStatics = this.mRealRateStatistict;
            if (videoFrameStatics != null) {
                videoFrameStatics.add();
            }
            lockCanvas.drawBitmap(bitmap, this.mMatrix, null);
            this.mSurfaceHolder.unlockCanvasAndPost(lockCanvas);
            if (this.mNeedReportFirstRender) {
                this.mNeedReportFirstRender = false;
                GLRenderVideoSink.GlRenderInfoListener glRenderInfoListener = this.mGlRenderInfoListener;
                if (glRenderInfoListener != null && videoFrame.getBuffer() != null) {
                    VideoFrame.Buffer buffer = videoFrame.getBuffer();
                    long currentTimeMs = TimeUtils.currentTimeMs() - buffer.getCaptureMs();
                    if (currentTimeMs < 0 || currentTimeMs > 10000) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Timestamp bug(");
                        LIZ.append(buffer.getCaptureMs());
                        LIZ.append(" VS ");
                        LIZ.append(TimeUtils.currentTimeMs());
                        LIZ.append(")");
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ));
                        if (AnonymousClass028.LJI(androidRuntimeException, "CanvasRenderView.onCanvasDrawFrame")) {
                            throw androidRuntimeException;
                        }
                    }
                    glRenderInfoListener.onInfo(3, (int) currentTimeMs, 0);
                }
            }
        }
        videoFrame.release();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.RenderView
    public void setMirror(boolean z, boolean z2) {
        if (z2) {
            this.mMirrorX = z;
        } else {
            this.mMirrorY = z;
        }
        this.mSizedChanged = true;
    }

    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink, android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSurfaceChanged() [");
        LIZ.append(this);
        LIZ.append("] + width: ");
        LIZ.append(i2);
        LIZ.append("height:");
        LIZ.append(i3);
        AVLog.ioi("CanvasRenderView", X1D.LIZIZ(LIZ));
        this.mWindWidth = i2;
        this.mWindHeight = i3;
        this.mSizedChanged = true;
    }
}
