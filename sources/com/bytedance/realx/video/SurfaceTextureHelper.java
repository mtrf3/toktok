package com.bytedance.realx.video;

import X.C16880lQ;
import X.X1D;
import X.ZV8;
import X.ZVA;
import X.ZVB;
import X.ZVC;
import X.ZVE;
import X.ZVG;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.SurfaceTextureHelper;
import com.bytedance.realx.video.VideoFrame;
import java.util.concurrent.Callable;

/* loaded from: classes33.dex */
public class SurfaceTextureHelper {
    public static float[] TEX_MATRIX = new float[16];
    public boolean capture2DTexture;
    public final EglBase eglBase;
    public final int frameBufferId;
    public int frameRotation;
    public final GlRectDrawer glRectDrawer;
    public final Handler handler;
    public boolean hasPendingTexture;
    public boolean isQuitting;
    public volatile boolean isTextureInUse;
    public long lastDeliverTime;
    public VideoSink listener;
    public int maxDeliverTimerInternal;
    public final int oesTextureId;
    public VideoSink pendingListener;
    public final Runnable setListenerRunnable;
    public final SurfaceTexture surfaceTexture;
    public int textureHeight;
    public int textureWidth;
    public final Runnable timedDeliverRunnable;
    public final TimestampAligner timestampAligner;
    public final int twoDTextureId;
    public final YuvConverter yuvConverter;

    /* renamed from: com.bytedance.realx.video.SurfaceTextureHelper$1 */
    /* loaded from: classes33.dex */
    public class AnonymousClass1 implements Callable<SurfaceTextureHelper> {
        public final /* synthetic */ boolean val$alignTimestamps;
        public final /* synthetic */ boolean val$capture2DTexture;
        public final /* synthetic */ Handler val$handler;
        public final /* synthetic */ String val$threadName;

        @Override // java.util.concurrent.Callable
        public SurfaceTextureHelper call() {
            try {
                return new SurfaceTextureHelper(EglBase.Context.this, r2, r3, r4);
            } catch (RuntimeException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(r5);
                LIZ.append(" create failure");
                RXLogging.e("SurfaceTextureHelper", X1D.LIZIZ(LIZ), e);
                return null;
            }
        }

        public AnonymousClass1(Handler handler, boolean z, boolean z2, String str) {
            r2 = handler;
            r3 = z;
            r4 = z2;
            r5 = str;
        }
    }

    /* renamed from: com.bytedance.realx.video.SurfaceTextureHelper$3 */
    /* loaded from: classes33.dex */
    public class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_bytedance_realx_video_SurfaceTextureHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_bytedance_realx_video_SurfaceTextureHelper$3__run$___twin___() {
            SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
            if (surfaceTextureHelper.maxDeliverTimerInternal > 0 && surfaceTextureHelper.handler != null && surfaceTextureHelper.listener != null) {
                if (!surfaceTextureHelper.hasPendingTexture) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SurfaceTextureHelper surfaceTextureHelper2 = SurfaceTextureHelper.this;
                    if (currentTimeMillis - surfaceTextureHelper2.lastDeliverTime >= surfaceTextureHelper2.maxDeliverTimerInternal) {
                        surfaceTextureHelper2.hasPendingTexture = true;
                        surfaceTextureHelper2.tryDeliverTextureFrame();
                    }
                }
                long j = SurfaceTextureHelper.this.maxDeliverTimerInternal;
                long currentTimeMillis2 = System.currentTimeMillis();
                SurfaceTextureHelper surfaceTextureHelper3 = SurfaceTextureHelper.this;
                long j2 = j - (currentTimeMillis2 - surfaceTextureHelper3.lastDeliverTime);
                Handler handler = surfaceTextureHelper3.handler;
                if (j2 < 0) {
                    j2 = surfaceTextureHelper3.maxDeliverTimerInternal;
                }
                handler.postDelayed(this, j2);
            }
        }

        public AnonymousClass3() {
        }

        public static void com_bytedance_realx_video_SurfaceTextureHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
            boolean LIZ;
            try {
                anonymousClass3.com_bytedance_realx_video_SurfaceTextureHelper$3__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    public /* synthetic */ void lambda$dispose$5() {
        this.isQuitting = true;
        if (!this.isTextureInUse) {
            release();
        }
    }

    public /* synthetic */ void lambda$returnTextureFrame$4() {
        this.isTextureInUse = false;
        if (this.isQuitting) {
            release();
        } else {
            tryDeliverTextureFrame();
        }
    }

    public /* synthetic */ void lambda$stopListening$1() {
        this.listener = null;
        this.pendingListener = null;
    }

    /* renamed from: com.bytedance.realx.video.SurfaceTextureHelper$2 */
    /* loaded from: classes33.dex */
    public class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_bytedance_realx_video_SurfaceTextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_bytedance_realx_video_SurfaceTextureHelper$2__run$___twin___() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Setting listener to ");
            LIZ.append(SurfaceTextureHelper.this.pendingListener);
            RXLogging.i("SurfaceTextureHelper", X1D.LIZIZ(LIZ));
            SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
            surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
            surfaceTextureHelper.pendingListener = null;
            if (surfaceTextureHelper.hasPendingTexture) {
                surfaceTextureHelper.updateTexImage();
                SurfaceTextureHelper.this.hasPendingTexture = false;
            }
        }

        public AnonymousClass2() {
        }

        public static void com_bytedance_realx_video_SurfaceTextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
            boolean LIZ;
            try {
                anonymousClass2.com_bytedance_realx_video_SurfaceTextureHelper$2__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    private void release() {
        if (this.handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            if (!this.isTextureInUse && this.isQuitting) {
                this.yuvConverter.release();
                GLES20.glDeleteTextures(1, new int[]{this.oesTextureId}, 0);
                if (this.capture2DTexture) {
                    GLES20.glDeleteTextures(1, new int[]{this.twoDTextureId}, 0);
                    GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
                    this.glRectDrawer.release();
                }
                this.surfaceTexture.release();
                this.eglBase.release();
                this.handler.getLooper().quit();
                TimestampAligner timestampAligner = this.timestampAligner;
                if (timestampAligner != null) {
                    timestampAligner.dispose();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unexpected release.");
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public void returnTextureFrame() {
        this.handler.post(new ZVG(0, this));
    }

    public void dispose() {
        RXLogging.i("SurfaceTextureHelper", "dispose()");
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new ZVE(0, this));
    }

    public void stopListening() {
        RXLogging.i("SurfaceTextureHelper", "stopListening()");
        this.handler.removeCallbacks(this.setListenerRunnable);
        ThreadUtils.invokeAtFrontUninterruptibly(this.handler, new ZVC(0, this));
    }

    public void tryDeliverTextureFrame() {
        TextureBufferImpl textureBufferImpl;
        if (this.handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            if (this.isQuitting || !this.hasPendingTexture || this.isTextureInUse || this.listener == null) {
                return;
            }
            if (this.textureWidth == 0 || this.textureHeight == 0) {
                RXLogging.w("SurfaceTextureHelper", "Texture size has not been set.");
                return;
            }
            this.isTextureInUse = true;
            this.hasPendingTexture = false;
            updateTexImage();
            float[] fArr = new float[16];
            this.surfaceTexture.getTransformMatrix(fArr);
            long timestamp = this.surfaceTexture.getTimestamp();
            TimestampAligner timestampAligner = this.timestampAligner;
            if (timestampAligner != null) {
                timestamp = timestampAligner.translateTimestamp(timestamp);
            }
            this.lastDeliverTime = System.currentTimeMillis();
            if (this.capture2DTexture) {
                GLES20.glBindFramebuffer(36160, this.frameBufferId);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.twoDTextureId, 0);
                GlRectDrawer glRectDrawer = this.glRectDrawer;
                int i = this.oesTextureId;
                float[] fArr2 = TEX_MATRIX;
                int i2 = this.textureWidth;
                int i3 = this.textureHeight;
                glRectDrawer.drawOes(i, fArr2, i2, i3, 0, 0, i2, i3);
                GLES20.glBindFramebuffer(36160, 0);
                textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.RGB, this.twoDTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new ZV8(0, this));
            } else {
                textureBufferImpl = new TextureBufferImpl(this.textureWidth, this.textureHeight, VideoFrame.TextureBuffer.Type.OES, this.oesTextureId, RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr), this.handler, this.yuvConverter, new ZVA(0, this));
            }
            VideoFrame videoFrame = new VideoFrame(textureBufferImpl, this.frameRotation, timestamp);
            this.listener.onFrame(videoFrame);
            videoFrame.release();
            return;
        }
        throw new IllegalStateException("Wrong thread.");
    }

    public void updateTexImage() {
        synchronized (EglBase.lock) {
            this.surfaceTexture.updateTexImage();
        }
    }

    public Handler getHandler() {
        return this.handler;
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public boolean isTextureInUse() {
        return this.isTextureInUse;
    }

    public /* synthetic */ void lambda$new$0(SurfaceTexture surfaceTexture) {
        this.hasPendingTexture = true;
        tryDeliverTextureFrame();
    }

    public /* synthetic */ void lambda$setFrameRotation$3(int i) {
        this.frameRotation = i;
    }

    public void setFrameRotation(final int i) {
        this.handler.post(new Runnable() { // from class: X.ZV0
            @Override // java.lang.Runnable
            public final void run() {
                SurfaceTextureHelper.this.lambda$setFrameRotation$3(i);
            }
        });
    }

    public void setMinFps(int i) {
        if (i > 0) {
            this.maxDeliverTimerInternal = (int) (1000.0f / i);
        } else {
            this.maxDeliverTimerInternal = 0;
        }
    }

    public void startListening(VideoSink videoSink) {
        if (this.listener == null && this.pendingListener == null) {
            this.pendingListener = videoSink;
            this.handler.post(this.setListenerRunnable);
            this.handler.post(this.timedDeliverRunnable);
            return;
        }
        throw new IllegalStateException("SurfaceTextureHelper listener has already been set.");
    }

    public VideoFrame.I420Buffer textureToYuv(VideoFrame.TextureBuffer textureBuffer) {
        return textureBuffer.toI420();
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context) {
        return create(str, context, false);
    }

    public /* synthetic */ void lambda$setTextureSize$2(int i, int i2) {
        this.textureWidth = i;
        this.textureHeight = i2;
        if (this.capture2DTexture) {
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.twoDTextureId);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES20.glBindTexture(3553, 0);
        }
    }

    public void setTextureSize(final int i, final int i2) {
        if (i > 0) {
            if (i2 > 0) {
                this.surfaceTexture.setDefaultBufferSize(i, i2);
                this.handler.post(new Runnable() { // from class: X.ZV2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SurfaceTextureHelper.this.lambda$setTextureSize$2(i, i2);
                    }
                });
                return;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Texture height must be positive, but was ");
                LIZ.append(i2);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Texture width must be positive, but was ");
        LIZ2.append(i);
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ2));
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z) {
        return create(str, context, z, false);
    }

    public static void setOnFrameAvailableListener(SurfaceTexture surfaceTexture, SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener, Handler handler) {
        surfaceTexture.setOnFrameAvailableListener(onFrameAvailableListener, handler);
    }

    public SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, boolean z2) {
        TimestampAligner timestampAligner;
        this.yuvConverter = new YuvConverter();
        this.capture2DTexture = false;
        this.setListenerRunnable = new Runnable() { // from class: com.bytedance.realx.video.SurfaceTextureHelper.2
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_realx_video_SurfaceTextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_realx_video_SurfaceTextureHelper$2__run$___twin___() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Setting listener to ");
                LIZ.append(SurfaceTextureHelper.this.pendingListener);
                RXLogging.i("SurfaceTextureHelper", X1D.LIZIZ(LIZ));
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                surfaceTextureHelper.listener = surfaceTextureHelper.pendingListener;
                surfaceTextureHelper.pendingListener = null;
                if (surfaceTextureHelper.hasPendingTexture) {
                    surfaceTextureHelper.updateTexImage();
                    SurfaceTextureHelper.this.hasPendingTexture = false;
                }
            }

            public AnonymousClass2() {
            }

            public static void com_bytedance_realx_video_SurfaceTextureHelper$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_bytedance_realx_video_SurfaceTextureHelper$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        this.lastDeliverTime = 0L;
        this.maxDeliverTimerInternal = -1;
        this.timedDeliverRunnable = new Runnable() { // from class: com.bytedance.realx.video.SurfaceTextureHelper.3
            @Override // java.lang.Runnable
            public void run() {
                com_bytedance_realx_video_SurfaceTextureHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_bytedance_realx_video_SurfaceTextureHelper$3__run$___twin___() {
                SurfaceTextureHelper surfaceTextureHelper = SurfaceTextureHelper.this;
                if (surfaceTextureHelper.maxDeliverTimerInternal > 0 && surfaceTextureHelper.handler != null && surfaceTextureHelper.listener != null) {
                    if (!surfaceTextureHelper.hasPendingTexture) {
                        long currentTimeMillis = System.currentTimeMillis();
                        SurfaceTextureHelper surfaceTextureHelper2 = SurfaceTextureHelper.this;
                        if (currentTimeMillis - surfaceTextureHelper2.lastDeliverTime >= surfaceTextureHelper2.maxDeliverTimerInternal) {
                            surfaceTextureHelper2.hasPendingTexture = true;
                            surfaceTextureHelper2.tryDeliverTextureFrame();
                        }
                    }
                    long j = SurfaceTextureHelper.this.maxDeliverTimerInternal;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    SurfaceTextureHelper surfaceTextureHelper3 = SurfaceTextureHelper.this;
                    long j2 = j - (currentTimeMillis2 - surfaceTextureHelper3.lastDeliverTime);
                    Handler handler2 = surfaceTextureHelper3.handler;
                    if (j2 < 0) {
                        j2 = surfaceTextureHelper3.maxDeliverTimerInternal;
                    }
                    handler2.postDelayed(this, j2);
                }
            }

            public AnonymousClass3() {
            }

            public static void com_bytedance_realx_video_SurfaceTextureHelper$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_bytedance_realx_video_SurfaceTextureHelper$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        };
        if (handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
            this.handler = handler;
            if (z) {
                timestampAligner = new TimestampAligner();
            } else {
                timestampAligner = null;
            }
            this.timestampAligner = timestampAligner;
            this.capture2DTexture = z2;
            EglBase LIZJ = ZVB.LIZJ(context, EglBase.CONFIG_PIXEL_BUFFER);
            this.eglBase = LIZJ;
            try {
                LIZJ.createDummyPbufferSurface();
                LIZJ.makeCurrent();
                if (z2) {
                    this.glRectDrawer = new GlRectDrawer();
                    int[] iArr = new int[1];
                    GLES20.glGenFramebuffers(1, iArr, 0);
                    this.frameBufferId = iArr[0];
                    Matrix.setIdentityM(TEX_MATRIX, 0);
                    this.twoDTextureId = GlUtil.generateTexture(3553);
                } else {
                    this.glRectDrawer = null;
                    this.frameBufferId = 0;
                    this.twoDTextureId = 0;
                }
                int generateTexture = GlUtil.generateTexture(36197);
                this.oesTextureId = generateTexture;
                SurfaceTexture surfaceTexture = new SurfaceTexture(generateTexture);
                this.surfaceTexture = surfaceTexture;
                setOnFrameAvailableListener(surfaceTexture, new SurfaceTexture.OnFrameAvailableListener() { // from class: X.ZUy
                    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                    public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                        SurfaceTextureHelper.this.lambda$new$0(surfaceTexture2);
                    }
                }, handler);
                return;
            } catch (RuntimeException e) {
                this.eglBase.release();
                handler.getLooper().quit();
                throw e;
            }
        }
        throw new IllegalStateException("SurfaceTextureHelper must be created on the handler thread");
    }

    public static SurfaceTextureHelper create(String str, EglBase.Context context, boolean z, boolean z2) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        return (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(handler, new Callable<SurfaceTextureHelper>() { // from class: com.bytedance.realx.video.SurfaceTextureHelper.1
            public final /* synthetic */ boolean val$alignTimestamps;
            public final /* synthetic */ boolean val$capture2DTexture;
            public final /* synthetic */ Handler val$handler;
            public final /* synthetic */ String val$threadName;

            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    return new SurfaceTextureHelper(EglBase.Context.this, r2, r3, r4);
                } catch (RuntimeException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(r5);
                    LIZ.append(" create failure");
                    RXLogging.e("SurfaceTextureHelper", X1D.LIZIZ(LIZ), e);
                    return null;
                }
            }

            public AnonymousClass1(Handler handler2, boolean z3, boolean z22, String str2) {
                r2 = handler2;
                r3 = z3;
                r4 = z22;
                r5 = str2;
            }
        });
    }

    public /* synthetic */ SurfaceTextureHelper(EglBase.Context context, Handler handler, boolean z, boolean z2, AnonymousClass1 anonymousClass1) {
        this(context, handler, z, z2);
    }
}
