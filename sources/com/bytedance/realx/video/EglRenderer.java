package com.bytedance.realx.video;

import X.C16880lQ;
import X.X1D;
import X.ZVB;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.bytedance.realx.base.RXLogging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.EglRenderer;
import com.bytedance.realx.video.GlClearWorkaround;
import com.bytedance.realx.video.RendererCommon;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes33.dex */
public class EglRenderer implements VideoSink {
    public static GlClearWorkaround.WORKAROUND_STATUS enableGLWorkaround = GlClearWorkaround.WORKAROUND_STATUS.kStatusUnknown;
    public RendererCommon.GlDrawer drawer;
    public EglBase eglBase;
    public int framesDropped;
    public int framesReceived;
    public int framesRendered;
    public float layoutAspectRatio;
    public long minRenderPeriodNs;
    public boolean mirrorHorizontally;
    public boolean mirrorVertically;
    public final String name;
    public long nextFrameTimeNs;
    public VideoFrame pendingFrame;
    public long renderSwapBufferTimeNs;
    public Handler renderThreadHandler;
    public long renderTimeNs;
    public long statisticsStartTimeNs;
    public boolean usePresentationTimeStamp;
    public final GlClearWorkaround glClearWorkaround = new GlClearWorkaround();
    public final Object handlerLock = new Object();
    public final ArrayList<FrameListenerAndParams> frameListeners = new ArrayList<>();
    public final ArrayList<FirstVideoFrameRenderListener> firstVideoFrameListeners = new ArrayList<>();
    public final Object fpsReductionLock = new Object();
    public final VideoFrameDrawer frameDrawer = new VideoFrameDrawer();
    public final Matrix drawMatrix = new Matrix();
    public final Object frameLock = new Object();
    public final Object firstRenderLock = new Object();
    public final Object layoutLock = new Object();
    public final Object statisticsLock = new Object();
    public final GlTextureFrameBuffer bitmapTextureFramebuffer = new GlTextureFrameBuffer(6408);
    public volatile RendererCommon.ScalingType renderModel = RendererCommon.ScalingType.SCALE_ASPECT_FILL;
    public final Runnable logStatisticsRunnable = new Runnable() { // from class: com.bytedance.realx.video.EglRenderer.1
        @Override // java.lang.Runnable
        public void run() {
            com_bytedance_realx_video_EglRenderer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_bytedance_realx_video_EglRenderer$1__run$___twin___() {
            EglRenderer.this.logStatistics();
            synchronized (EglRenderer.this.handlerLock) {
                EglRenderer eglRenderer = EglRenderer.this;
                Handler handler = eglRenderer.renderThreadHandler;
                if (handler != null) {
                    handler.removeCallbacks(eglRenderer.logStatisticsRunnable);
                    EglRenderer eglRenderer2 = EglRenderer.this;
                    eglRenderer2.renderThreadHandler.postDelayed(eglRenderer2.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4L));
                }
            }
        }

        public static void com_bytedance_realx_video_EglRenderer$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            boolean LIZ;
            try {
                anonymousClass1.com_bytedance_realx_video_EglRenderer$1__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    };
    public final EglSurfaceCreation eglSurfaceCreationRunnable = new EglSurfaceCreation();
    public boolean haveRenderFirstVideoFrame = false;

    /* loaded from: classes33.dex */
    public interface FirstVideoFrameRenderListener {
        void onFirstVideoFrameRender();
    }

    /* loaded from: classes33.dex */
    public interface FrameListener {
        void onFrame(Bitmap bitmap);
    }

    public void clearImage() {
        clearImage(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void pauseVideo() {
        setFpsReduction(0.0f);
    }

    /* renamed from: com.bytedance.realx.video.EglRenderer$3, reason: invalid class name */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType;

        static {
            int[] iArr = new int[RendererCommon.ScalingType.values().length];
            $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType = iArr;
            try {
                iArr[RendererCommon.ScalingType.SCALE_ASPECT_FIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[RendererCommon.ScalingType.SCALE_ASPECT_BALANCED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$bytedance$realx$video$RendererCommon$ScalingType[RendererCommon.ScalingType.SCALE_ASPECT_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void notifyFristRenderCallback() {
        synchronized (this.firstRenderLock) {
            Iterator<FirstVideoFrameRenderListener> it = this.firstVideoFrameListeners.iterator();
            while (it.hasNext()) {
                it.next().onFirstVideoFrameRender();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void renderFrameOnRenderThread() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.video.EglRenderer.renderFrameOnRenderThread():void");
    }

    public void disableFpsReduction() {
        setFpsReduction(Float.POSITIVE_INFINITY);
    }

    public void logStatistics() {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        long nanoTime = System.nanoTime();
        synchronized (this.statisticsLock) {
            long j = nanoTime - this.statisticsStartTimeNs;
            if (j <= 0) {
                return;
            }
            float nanos = ((float) (this.framesRendered * TimeUnit.SECONDS.toNanos(1L))) / ((float) j);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Duration: ");
            LIZ.append(TimeUnit.NANOSECONDS.toMillis(j));
            LIZ.append(" ms. Frames received: ");
            LIZ.append(this.framesReceived);
            LIZ.append(". Dropped: ");
            LIZ.append(this.framesDropped);
            LIZ.append(". Rendered: ");
            LIZ.append(this.framesRendered);
            LIZ.append(". Render fps: ");
            LIZ.append(decimalFormat.format(nanos));
            LIZ.append(". Average render time: ");
            LIZ.append(averageTimeAsString(this.renderTimeNs, this.framesRendered));
            LIZ.append(". Average swapBuffer time: ");
            LIZ.append(averageTimeAsString(this.renderSwapBufferTimeNs, this.framesRendered));
            LIZ.append(".");
            logD(X1D.LIZIZ(LIZ));
            resetStatistics(nanoTime);
        }
    }

    public void printStackTrace() {
        Thread thread;
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null && (thread = handler.getLooper().getThread()) != null) {
                StackTraceElement[] stackTrace = thread.getStackTrace();
                if (stackTrace.length > 0) {
                    logW("EglRenderer stack trace:");
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        logW(stackTraceElement.toString());
                    }
                }
            }
        }
    }

    public void release() {
        logD("Releasing.");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler == null) {
                logD("Already released");
                return;
            }
            handler.removeCallbacks(this.logStatisticsRunnable);
            this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: X.ZVD
                @Override // java.lang.Runnable
                public final void run() {
                    EglRenderer.this.lambda$release$1(countDownLatch);
                }
            });
            final Looper looper = this.renderThreadHandler.getLooper();
            this.renderThreadHandler.post(new Runnable() { // from class: X.ZVF
                @Override // java.lang.Runnable
                public final void run() {
                    EglRenderer.this.lambda$release$2(looper);
                }
            });
            this.renderThreadHandler = null;
            ThreadUtils.awaitUninterruptibly(countDownLatch);
            synchronized (this.frameLock) {
                VideoFrame videoFrame = this.pendingFrame;
                if (videoFrame != null) {
                    videoFrame.release();
                    this.pendingFrame = null;
                }
            }
            logD("Releasing done.");
        }
    }

    /* loaded from: classes33.dex */
    public class EglSurfaceCreation implements Runnable {
        public Object surface;

        public synchronized void com_bytedance_realx_video_EglRenderer$EglSurfaceCreation__run$___twin___() {
            EglBase eglBase;
            if (this.surface != null && (eglBase = EglRenderer.this.eglBase) != null && !eglBase.hasSurface()) {
                Object obj = this.surface;
                if (obj instanceof Surface) {
                    EglRenderer.this.eglBase.createSurface((Surface) obj);
                } else if (obj instanceof SurfaceTexture) {
                    EglRenderer.this.eglBase.createSurface((SurfaceTexture) obj);
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Invalid surface: ");
                    LIZ.append(this.surface);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
                EglRenderer.this.eglBase.makeCurrent();
                GLES20.glPixelStorei(3317, 1);
            }
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            com_bytedance_realx_video_EglRenderer$EglSurfaceCreation_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public EglSurfaceCreation() {
        }

        public static void com_bytedance_realx_video_EglRenderer$EglSurfaceCreation_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(EglSurfaceCreation eglSurfaceCreation) {
            boolean LIZ;
            try {
                eglSurfaceCreation.com_bytedance_realx_video_EglRenderer$EglSurfaceCreation__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public synchronized void setSurface(Object obj) {
            this.surface = obj;
        }
    }

    /* loaded from: classes33.dex */
    public static class HandlerWithExceptionCallback extends Handler {
        public final Runnable exceptionCallback;

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            try {
                super.dispatchMessage(message);
            } catch (Exception e) {
                RXLogging.e("EglRenderer", "Exception on EglRenderer thread", e);
                this.exceptionCallback.run();
                throw e;
            }
        }

        public HandlerWithExceptionCallback(Looper looper, Runnable runnable) {
            super(looper);
            this.exceptionCallback = runnable;
        }
    }

    public EglRenderer(String str) {
        this.name = str;
    }

    private void createEglSurfaceInternal(Object obj) {
        this.eglSurfaceCreationRunnable.setSurface(obj);
        postToRenderThread(this.eglSurfaceCreationRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$1(CountDownLatch countDownLatch) {
        this.glClearWorkaround.release();
        GLES20.glUseProgram(0);
        RendererCommon.GlDrawer glDrawer = this.drawer;
        if (glDrawer != null) {
            glDrawer.release();
            this.drawer = null;
        }
        this.frameDrawer.release();
        this.bitmapTextureFramebuffer.release();
        if (this.eglBase != null) {
            logD("eglBase detach and release.");
            this.eglBase.detachCurrent();
            this.eglBase.release();
            this.eglBase = null;
        }
        this.frameListeners.clear();
        synchronized (this.firstRenderLock) {
            this.firstVideoFrameListeners.clear();
        }
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$release$2(Looper looper) {
        logD("Quitting render thread.");
        looper.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$releaseEglSurface$5(Runnable runnable) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null) {
            eglBase.detachCurrent();
            this.eglBase.releaseSurface();
        }
        runnable.run();
    }

    private void logD(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.name);
        LIZ.append(str);
        RXLogging.i("EglRenderer", X1D.LIZIZ(LIZ));
    }

    private void logW(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.name);
        LIZ.append(str);
        RXLogging.w("EglRenderer", X1D.LIZIZ(LIZ));
    }

    private void postToRenderThread(Runnable runnable) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.post(runnable);
            }
        }
    }

    private void resetStatistics(long j) {
        synchronized (this.statisticsLock) {
            this.statisticsStartTimeNs = j;
            this.framesReceived = 0;
            this.framesDropped = 0;
            this.framesRendered = 0;
            this.renderTimeNs = 0L;
            this.renderSwapBufferTimeNs = 0L;
        }
    }

    public void addFristFrameListener(FirstVideoFrameRenderListener firstVideoFrameRenderListener) {
        synchronized (this.firstRenderLock) {
            this.firstVideoFrameListeners.add(firstVideoFrameRenderListener);
        }
    }

    public void createEglSurface(SurfaceTexture surfaceTexture) {
        createEglSurfaceInternal(surfaceTexture);
    }

    @Override // com.bytedance.realx.video.VideoSink
    public void onFrame(VideoFrame videoFrame) {
        boolean z;
        synchronized (this.statisticsLock) {
            this.framesReceived++;
        }
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Dropping frame - Not initialized or already released.");
                return;
            }
            synchronized (this.frameLock) {
                VideoFrame videoFrame2 = this.pendingFrame;
                if (videoFrame2 != null) {
                    z = true;
                    videoFrame2.release();
                } else {
                    z = false;
                }
                this.pendingFrame = videoFrame;
                videoFrame.retain();
                this.renderThreadHandler.post(new Runnable() { // from class: X.ZVN
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.renderFrameOnRenderThread();
                    }
                });
            }
            if (z) {
                synchronized (this.statisticsLock) {
                    this.framesDropped++;
                }
            }
        }
    }

    public void releaseEglSurface(final Runnable runnable) {
        this.eglSurfaceCreationRunnable.setSurface(null);
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler != null) {
                handler.removeCallbacks(this.eglSurfaceCreationRunnable);
                this.renderThreadHandler.postAtFrontOfQueue(new Runnable() { // from class: X.ZVQ
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.lambda$releaseEglSurface$5(runnable);
                    }
                });
            } else {
                runnable.run();
            }
        }
    }

    public void removeFrameListener(final FrameListener frameListener) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                return;
            }
            if (C16880lQ.LLLLIIIILLL() != this.renderThreadHandler.getLooper().getThread()) {
                postToRenderThread(new Runnable() { // from class: X.ZVL
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.lambda$removeFrameListener$4(countDownLatch, frameListener);
                    }
                });
                ThreadUtils.awaitUninterruptibly(countDownLatch);
                return;
            }
            throw new RuntimeException("removeFrameListener must not be called on the render thread.");
        }
    }

    public void setFpsReduction(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setFpsReduction: ");
        LIZ.append(f);
        logD(X1D.LIZIZ(LIZ));
        synchronized (this.fpsReductionLock) {
            long j = this.minRenderPeriodNs;
            if (f <= 0.0f) {
                this.minRenderPeriodNs = Long.MAX_VALUE;
            } else {
                this.minRenderPeriodNs = ((float) TimeUnit.SECONDS.toNanos(1L)) / f;
            }
            if (this.minRenderPeriodNs != j) {
                this.nextFrameTimeNs = System.nanoTime();
            }
        }
    }

    public void setLayoutAspectRatio(float f) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLayoutAspectRatio: ");
        LIZ.append(f);
        logD(X1D.LIZIZ(LIZ));
        synchronized (this.layoutLock) {
            this.layoutAspectRatio = f;
        }
    }

    public void setMirror(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMirrorHorizontally: ");
        LIZ.append(z);
        logD(X1D.LIZIZ(LIZ));
        synchronized (this.layoutLock) {
            this.mirrorHorizontally = z;
        }
    }

    public void setMirrorVertically(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setMirrorVertically: ");
        LIZ.append(z);
        logD(X1D.LIZIZ(LIZ));
        synchronized (this.layoutLock) {
            this.mirrorVertically = z;
        }
    }

    public void setRenderModel(RendererCommon.ScalingType scalingType) {
        this.renderModel = scalingType;
    }

    public void createEglSurface(Surface surface) {
        createEglSurfaceInternal(surface);
    }

    private String averageTimeAsString(long j, int i) {
        if (i <= 0) {
            return "NA";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(TimeUnit.NANOSECONDS.toMicros(j / i));
        LIZ.append(" us");
        return X1D.LIZIZ(LIZ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(EglBase.Context context, int[] iArr) {
        if (context == null) {
            logD("EglBase10.create context");
            this.eglBase = ZVB.LJ(iArr);
        } else {
            logD("EglBase.create shared context");
            this.eglBase = ZVB.LIZJ(context, iArr);
        }
        this.glClearWorkaround.init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$removeFrameListener$4(CountDownLatch countDownLatch, FrameListener frameListener) {
        countDownLatch.countDown();
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            if (it.next().listener == frameListener) {
                it.remove();
            }
        }
    }

    private void notifyCallbacks(VideoFrame videoFrame, boolean z) {
        float f;
        float f2;
        if (this.frameListeners.isEmpty()) {
            return;
        }
        this.drawMatrix.reset();
        this.drawMatrix.preTranslate(0.5f, 0.5f);
        Matrix matrix = this.drawMatrix;
        if (this.mirrorHorizontally) {
            f = -1.0f;
        } else {
            f = 1.0f;
        }
        if (this.mirrorVertically) {
            f2 = -1.0f;
        } else {
            f2 = 1.0f;
        }
        matrix.preScale(f, f2);
        this.drawMatrix.preScale(1.0f, -1.0f);
        this.drawMatrix.preTranslate(-0.5f, -0.5f);
        Iterator<FrameListenerAndParams> it = this.frameListeners.iterator();
        while (it.hasNext()) {
            FrameListenerAndParams next = it.next();
            if (z || !next.applyFpsReduction) {
                it.remove();
                int rotatedWidth = (int) (next.scale * videoFrame.getRotatedWidth());
                int rotatedHeight = (int) (next.scale * videoFrame.getRotatedHeight());
                if (rotatedWidth == 0 || rotatedHeight == 0) {
                    next.listener.onFrame(null);
                } else {
                    this.bitmapTextureFramebuffer.setSize(rotatedWidth, rotatedHeight);
                    GLES20.glBindFramebuffer(36160, this.bitmapTextureFramebuffer.getFrameBufferId());
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.bitmapTextureFramebuffer.getTextureId(), 0);
                    glClear(rotatedWidth, rotatedHeight, 16384, 0.0f, 0.0f, 0.0f, 0.0f);
                    this.frameDrawer.drawFrame(videoFrame, next.drawer, this.drawMatrix, 0, 0, rotatedWidth, rotatedHeight);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(rotatedWidth * rotatedHeight * 4);
                    GLES20.glViewport(0, 0, rotatedWidth, rotatedHeight);
                    GLES20.glReadPixels(0, 0, rotatedWidth, rotatedHeight, 6408, 5121, allocateDirect);
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("EglRenderer.notifyCallbacks");
                    Bitmap createBitmap = Bitmap.createBitmap(rotatedWidth, rotatedHeight, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(allocateDirect);
                    next.listener.onFrame(createBitmap);
                }
            }
        }
    }

    public void addFrameListener(FrameListener frameListener, float f) {
        addFrameListener(frameListener, f, null, false);
    }

    public void addFrameListener(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        addFrameListener(frameListener, f, glDrawer, false);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        init(context, iArr, glDrawer, false);
    }

    /* loaded from: classes33.dex */
    public static class FrameListenerAndParams {
        public final boolean applyFpsReduction;
        public final RendererCommon.GlDrawer drawer;
        public final FrameListener listener;
        public final float scale;

        public FrameListenerAndParams(FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer, boolean z) {
            this.listener = frameListener;
            this.scale = f;
            this.drawer = glDrawer;
            this.applyFpsReduction = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: clearSurfaceOnRenderThread, reason: merged with bridge method [inline-methods] */
    public void lambda$clearImage$6(float f, float f2, float f3, float f4) {
        EglBase eglBase = this.eglBase;
        if (eglBase != null && eglBase.hasSurface()) {
            logD("clearSurface");
            glClear(this.eglBase.surfaceWidth(), this.eglBase.surfaceHeight(), 16384, f, f2, f3, f4);
            this.eglBase.swapBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addFrameListener$3(RendererCommon.GlDrawer glDrawer, FrameListener frameListener, float f, boolean z) {
        if (glDrawer == null) {
            glDrawer = this.drawer;
        }
        this.frameListeners.add(new FrameListenerAndParams(frameListener, f, glDrawer, z));
    }

    public void addFrameListener(final FrameListener frameListener, final float f, final RendererCommon.GlDrawer glDrawer, final boolean z) {
        postToRenderThread(new Runnable() { // from class: X.ZVJ
            @Override // java.lang.Runnable
            public final void run() {
                EglRenderer.this.lambda$addFrameListener$3(glDrawer, frameListener, f, z);
            }
        });
    }

    public void clearImage(final float f, final float f2, final float f3, final float f4) {
        synchronized (this.handlerLock) {
            Handler handler = this.renderThreadHandler;
            if (handler == null) {
                return;
            }
            handler.postAtFrontOfQueue(new Runnable() { // from class: X.ZVS
                @Override // java.lang.Runnable
                public final void run() {
                    EglRenderer.this.lambda$clearImage$6(f, f2, f3, f4);
                }
            });
        }
    }

    public void init(final EglBase.Context context, final int[] iArr, RendererCommon.GlDrawer glDrawer, boolean z) {
        synchronized (this.handlerLock) {
            if (this.renderThreadHandler == null) {
                logD("Initializing EglRenderer");
                this.drawer = glDrawer;
                this.usePresentationTimeStamp = z;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(this.name);
                LIZ.append("EglRenderer");
                HandlerThread handlerThread = new HandlerThread(X1D.LIZIZ(LIZ));
                handlerThread.start();
                HandlerWithExceptionCallback handlerWithExceptionCallback = new HandlerWithExceptionCallback(handlerThread.getLooper(), new Runnable() { // from class: com.bytedance.realx.video.EglRenderer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        com_bytedance_realx_video_EglRenderer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_bytedance_realx_video_EglRenderer$2__run$___twin___() {
                        synchronized (EglRenderer.this.handlerLock) {
                            EglRenderer.this.renderThreadHandler = null;
                        }
                    }

                    public static void com_bytedance_realx_video_EglRenderer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                        boolean LIZ2;
                        try {
                            anonymousClass2.com_bytedance_realx_video_EglRenderer$2__run$___twin___();
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                });
                this.renderThreadHandler = handlerWithExceptionCallback;
                ThreadUtils.invokeAtFrontUninterruptibly(handlerWithExceptionCallback, new Runnable() { // from class: X.ZVH
                    @Override // java.lang.Runnable
                    public final void run() {
                        EglRenderer.this.lambda$init$0(context, iArr);
                    }
                });
                this.renderThreadHandler.post(this.eglSurfaceCreationRunnable);
                resetStatistics(System.nanoTime());
                this.renderThreadHandler.postDelayed(this.logStatisticsRunnable, TimeUnit.SECONDS.toMillis(4L));
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this.name);
                LIZ2.append("Already initialized");
                throw new IllegalStateException(X1D.LIZIZ(LIZ2));
            }
        }
    }

    private void glClear(int i, int i2, int i3, float f, float f2, float f3, float f4) {
        if (enableGLWorkaround == GlClearWorkaround.WORKAROUND_STATUS.kStatusUnknown) {
            enableGLWorkaround = GlClearWorkaround.isNeedWorkaround();
        }
        if (enableGLWorkaround == GlClearWorkaround.WORKAROUND_STATUS.kStatusEnable) {
            this.glClearWorkaround.clear(i, i2, i3, f, f2, f3, f4, 1.0f, 8);
        } else {
            GLES20.glClearColor(f, f2, f3, f4);
            GLES20.glClear(16384);
        }
    }
}
