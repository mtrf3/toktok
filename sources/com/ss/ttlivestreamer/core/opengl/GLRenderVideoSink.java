package com.ss.ttlivestreamer.core.opengl;

import X.AnonymousClass028;
import X.X1D;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.LiveStreamThreadPriorityUtils;
import com.ss.ttlivestreamer.core.utils.LogUtil;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.ScopeMonitor;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusiness;
import com.ss.ttlivestreamer.core.utils.TimeUtils;

/* loaded from: classes12.dex */
public class GLRenderVideoSink extends VideoSink implements SurfaceHolder.Callback, View.OnLayoutChangeListener {
    public boolean mCanDrawer;
    public final boolean mEnableFixedSize;
    public int mFixedHeight;
    public int mFixedWidth;
    public int mFrameHeight;
    public int mFrameWidth;
    public GLRenderer mGLRenderer;
    public GLThread mGLThread;
    public GlRenderInfoListener mGlRenderInfoListener;
    public Handler mHandler;
    public boolean mNeedReportFirstRender;
    public boolean mNeedSwapSurface;
    public int mRenderHeight;
    public boolean mRenderSizeChanged;
    public int mRenderWidth;
    public final boolean mShareGlThread;
    public GLSurface mSurface;
    public SurfaceView mSurfaceView;
    public Surface mSurfaceWithTexture;

    /* loaded from: classes12.dex */
    public interface GLRenderer {
        void onDrawFrame(VideoFrame videoFrame);

        void onSurfaceChanged(int i, int i2);

        void onSurfaceCreated();

        void onSurfaceDestroy();
    }

    /* loaded from: classes12.dex */
    public interface GlRenderInfoListener {
        void onInfo(int i, int i2, int i3);
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public void OnDiscardedFrame() {
    }

    public void init() {
        this.mNeedSwapSurface = false;
        if (this.mHandler == null) {
            GLThread glThread = TTLSPreInitBusiness.getInstance().getGlThread("GLRenderVideoSink");
            this.mGLThread = glThread;
            if (glThread == null) {
                GLThread gRKHandlerThread = LiveStreamThreadPriorityUtils.getGRKHandlerThread();
                this.mGLThread = gRKHandlerThread;
                gRKHandlerThread.start();
            }
            this.mHandler = this.mGLThread.getHandler();
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        super.release();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("begin release[");
        LIZ.append(this);
        LIZ.append("]");
        AVLog.ioi("GLRenderVideoSink", X1D.LIZIZ(LIZ));
        SurfaceView surfaceView = this.mSurfaceView;
        if (surfaceView != null && surfaceView.getHolder() != null) {
            this.mSurfaceView.getHolder().removeCallback(this);
            this.mSurfaceView.removeOnLayoutChangeListener(this);
        }
        Handler handler = this.mHandler;
        if (handler != null && !handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.8
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$8__run$___twin___() {
                GLRenderVideoSink.this.onSurfaceDestroy();
                SafeHandlerThreadPoolExecutor.unlockThread(GLRenderVideoSink.this.mGLThread);
                GLRenderVideoSink.this.mHandler = null;
            }

            public static void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ2;
                try {
                    anonymousClass8.com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$8__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        })) {
            AVLog.ioe("GLRenderVideoSink", Log.getStackTraceString(new Exception("Already release at")));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("end release[");
        LIZ2.append(this);
        LIZ2.append("]");
        AVLog.ioi("GLRenderVideoSink", X1D.LIZIZ(LIZ2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSurfaceDestroy() {
        if (this.mSurface == null) {
            return;
        }
        GLES20.glFinish();
        Surface surface = this.mSurfaceWithTexture;
        if (surface != null) {
            surface.release();
            this.mSurfaceWithTexture = null;
        }
        this.mSurface.surfaceDestroy();
        this.mSurface.release();
        this.mSurface = null;
        this.mCanDrawer = false;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" mSurface is released");
        AVLog.ioi("GLRenderVideoSink", X1D.LIZIZ(LIZ));
        Handler glThreadHandler = getGlThreadHandler();
        if ((glThreadHandler != null && glThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.6
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$6__run$___twin___() {
                if (GLRenderVideoSink.this.mGLRenderer != null) {
                    if (!GlUtil.nativeIsOpenGlThread()) {
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG!!!");
                        if (AnonymousClass028.LJI(androidRuntimeException, "GLRenderVideoSink.onSurfaceDestroy@1")) {
                            throw androidRuntimeException;
                        }
                    }
                    GLRenderVideoSink.this.mGLRenderer.onSurfaceDestroy();
                }
                GlRenderInfoListener glRenderInfoListener = GLRenderVideoSink.this.mGlRenderInfoListener;
                if (glRenderInfoListener != null) {
                    glRenderInfoListener.onInfo(1, 0, 0);
                    AVLog.ioi("GLRenderVideoSink", "MSG_EGL_SURFACE_DESTROYED from GLRenderVideoSink");
                }
            }

            public static void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                boolean LIZ2;
                try {
                    anonymousClass6.com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$6__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        })) || this.mGLRenderer == null) {
            return;
        }
        if (!GlUtil.nativeIsOpenGlThread()) {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG!!!");
            if (AnonymousClass028.LJI(androidRuntimeException, "GLRenderVideoSink.onSurfaceDestroy@2")) {
                throw androidRuntimeException;
            }
        }
        this.mGLRenderer.onSurfaceDestroy();
        AVLog.w("GLRenderVideoSink", "surfaceDestroy at release");
        GlRenderInfoListener glRenderInfoListener = this.mGlRenderInfoListener;
        if (glRenderInfoListener == null) {
            return;
        }
        glRenderInfoListener.onInfo(1, 0, 0);
        AVLog.ioi("GLRenderVideoSink", "MSG_EGL_SURFACE_DESTROYED from GLRenderVideoSink");
    }

    public Handler getGlThreadHandler() {
        return this.mHandler;
    }

    public void initSurfaceView(SurfaceView surfaceView) {
        init();
        this.mSurfaceView = surfaceView;
        surfaceView.addOnLayoutChangeListener(this);
        surfaceView.getHolder().addCallback(this);
    }

    public void initTextureView(TextureView textureView) {
        init();
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                GLRenderVideoSink.this.surfaceDestroyed(null);
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                GLRenderVideoSink.this.mSurfaceWithTexture = new Surface(surfaceTexture);
                GLRenderVideoSink.this.surfaceCreated(null);
                GLRenderVideoSink.this.surfaceChanged(null, 3, i, i2);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                GLRenderVideoSink.this.surfaceChanged(null, 3, i, i2);
            }
        });
    }

    @Override // com.ss.ttlivestreamer.core.engine.VideoSink
    public void onFrame(final VideoFrame videoFrame) {
        Handler handler = this.mHandler;
        if (handler != null) {
            videoFrame.retain();
            if (!handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.7
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$7__run$___twin___() {
                    GLRenderVideoSink.this.onFrameAvailable(videoFrame);
                }

                public static void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                    boolean LIZ;
                    try {
                        anonymousClass7.com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$7__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            })) {
                videoFrame.release();
            }
        }
    }

    public void onFrameAvailable(VideoFrame videoFrame) {
        GLSurface gLSurface;
        ScopeMonitor.CalcElapse(9, videoFrame.getBuffer().getCaptureMs(), TimeUtils.currentTimeMs());
        if (this.mGLRenderer != null && this.mCanDrawer) {
            if (this.mShareGlThread) {
                this.mSurface.nativeMakeCurrent();
            }
            if (this.mEnableFixedSize) {
                checkFixedSize(this.mSurfaceView, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
            }
            this.mGLRenderer.onDrawFrame(videoFrame);
            if (this.mNeedSwapSurface && (gLSurface = this.mSurface) != null) {
                gLSurface.nativeSwapBuffers();
                if (this.mNeedReportFirstRender) {
                    this.mNeedReportFirstRender = false;
                    GlRenderInfoListener glRenderInfoListener = this.mGlRenderInfoListener;
                    if (glRenderInfoListener != null && videoFrame.getBuffer() != null) {
                        VideoFrame.Buffer buffer = videoFrame.getBuffer();
                        long currentTimeMs = TimeUtils.currentTimeMs() - buffer.getCaptureMs();
                        if (currentTimeMs < 0) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Timestamp bug(");
                            LIZ.append(buffer.getCaptureMs());
                            LIZ.append(" VS ");
                            LIZ.append(TimeUtils.currentTimeMs());
                            LIZ.append(")");
                            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ));
                            if (AnonymousClass028.LJI(androidRuntimeException, "GLRenderVideoSink.onFrameAvailable")) {
                                throw androidRuntimeException;
                            }
                        }
                        glRenderInfoListener.onInfo(3, (int) currentTimeMs, 0);
                    }
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(this);
                LIZ2.append(" mNeedSwapSurface ");
                LIZ2.append(this.mNeedSwapSurface);
                LIZ2.append(", mSurface ");
                LIZ2.append(this.mSurface);
                AVLog2.logToIODevice2(5, "GLRenderVideoSink", X1D.LIZIZ(LIZ2), null, 43, 10000);
            }
        } else {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(this);
            LIZ3.append(" mGLRenderer ");
            LIZ3.append(this.mGLRenderer);
            LIZ3.append(", mCanDrawer ");
            LIZ3.append(this.mCanDrawer);
            AVLog2.logToIODevice2(5, "GLRenderVideoSink", X1D.LIZIZ(LIZ3), null, 44, 10000);
        }
        ScopeMonitor.CalcElapse(10, videoFrame.getBuffer().getCaptureMs(), TimeUtils.currentTimeMs());
        videoFrame.release();
    }

    public void onSurfaceCreated(Surface surface) {
        this.mNeedReportFirstRender = true;
        this.mSurface = new GLSurface();
        GlRenderInfoListener glRenderInfoListener = this.mGlRenderInfoListener;
        if (glRenderInfoListener != null) {
            glRenderInfoListener.onInfo(2, 0, 0);
            AVLog.ioi("GLRenderVideoSink", "MSG_EGL_SURFACE_WILL_BE_CREATED  from GLRenderVideoSink");
        }
        this.mSurface.nativeSurfaceCreate(0, 0, surface);
        this.mSurface.nativeMakeCurrent();
        this.mCanDrawer = true;
        GLRenderer gLRenderer = this.mGLRenderer;
        if (gLRenderer != null) {
            gLRenderer.onSurfaceCreated();
        }
        GLSurface gLSurface = this.mSurface;
        if (gLSurface != null) {
            gLSurface.nativeSwapBuffers();
        }
        if (LogUtil.logFilterSwitch()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this);
            LIZ.append(" onSurfaceCreated: surface ");
            LIZ.append(surface);
            LIZ.append(", mGLRenderer ");
            LIZ.append(this.mGLRenderer);
            LIZ.append(", mSurface ");
            LIZ.append(this.mSurface);
            LIZ.append(", mCanDrawer ");
            LIZ.append(this.mCanDrawer);
            LIZ.append(", mNeedSwapSurface ");
            LIZ.append(this.mNeedSwapSurface);
            AVLog.ioi("GLRenderVideoSink", X1D.LIZIZ(LIZ));
        }
    }

    public void setGlRenderInfoListener(GlRenderInfoListener glRenderInfoListener) {
        this.mGlRenderInfoListener = glRenderInfoListener;
    }

    public void setRenderer(GLRenderer gLRenderer) {
        this.mGLRenderer = gLRenderer;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        final Surface surface;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" surfaceCreated");
        AVLog.ioi("GLRenderVideoSink", X1D.LIZIZ(LIZ));
        this.mNeedSwapSurface = true;
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
        } else {
            surface = this.mSurfaceWithTexture;
        }
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$2__run$___twin___() {
                    GLRenderVideoSink.this.onSurfaceCreated(surface);
                }

                public static void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ2;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$2__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" surfaceDestroyed");
        AVLog.ioi("GLRenderVideoSink", X1D.LIZIZ(LIZ));
        this.mNeedSwapSurface = false;
        this.mCanDrawer = false;
        final Object obj = new Object();
        synchronized (obj) {
            Handler handler = this.mHandler;
            if (handler != null && handler.postAtFrontOfQueue(new Runnable() { // from class: com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.4
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$4__run$___twin___() {
                    GLRenderVideoSink.this.onSurfaceDestroy();
                    synchronized (obj) {
                        obj.notify();
                    }
                }

                public static void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                    boolean LIZ2;
                    try {
                        anonymousClass4.com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$4__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            })) {
                try {
                    obj.wait(3000L);
                } catch (Throwable th) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Waited exception ");
                    LIZ2.append(th.getMessage());
                    AVLog.ioe("GLRenderVideoSink", X1D.LIZIZ(LIZ2), th);
                }
            } else {
                AVLog.w("GLRenderVideoSink", "already surfaceDestroy");
            }
        }
    }

    public GLRenderVideoSink(View view, Handler handler, boolean z) {
        boolean z2;
        if (LogUtil.logFilterSwitch()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Construct [");
            LIZ.append(this);
            LIZ.append("] with view ");
            LIZ.append(view);
            LIZ.append(",enableFixedSize:");
            LIZ.append(z);
            LIZ.append(". Stack: ");
            LIZ.append(Log.getStackTraceString(new Throwable()));
            AVLog.iod("GLRenderVideoSink", X1D.LIZIZ(LIZ));
        }
        this.mHandler = handler;
        this.mEnableFixedSize = z;
        if (handler != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mShareGlThread = z2;
        if (view instanceof TextureView) {
            initTextureView((TextureView) view);
        } else {
            if (view instanceof SurfaceView) {
                initSurfaceView((SurfaceView) view);
                return;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Unsupported view ");
            LIZ2.append(view);
            throw new AndroidRuntimeException(X1D.LIZIZ(LIZ2));
        }
    }

    private void checkFixedSize(SurfaceView surfaceView, int i, int i2) {
        int i3;
        if (surfaceView != null) {
            if (this.mFrameWidth != i || this.mFrameHeight != i2 || this.mRenderSizeChanged) {
                this.mRenderSizeChanged = false;
                this.mFrameWidth = i;
                this.mFrameHeight = i2;
                int i4 = this.mRenderWidth;
                if (i4 != 0 && (i3 = this.mRenderHeight) != 0) {
                    final float min = Math.min((i4 * 1.0f) / i, (i3 * 1.0f) / i2);
                    final SurfaceHolder holder = surfaceView.getHolder();
                    if (holder != null) {
                        surfaceView.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.5
                            @Override // java.lang.Runnable
                            public void run() {
                                com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$5__run$___twin___() {
                                float f = min;
                                if (f > 1.0d) {
                                    GLRenderVideoSink gLRenderVideoSink = GLRenderVideoSink.this;
                                    int i5 = (int) (gLRenderVideoSink.mRenderWidth / f);
                                    gLRenderVideoSink.mFixedWidth = i5;
                                    int i6 = (int) (gLRenderVideoSink.mRenderHeight / f);
                                    gLRenderVideoSink.mFixedHeight = i6;
                                    holder.setFixedSize(i5, i6);
                                    StringBuilder LIZ = X1D.LIZ();
                                    LIZ.append("setFixedSize:");
                                    LIZ.append(GLRenderVideoSink.this.mFixedWidth);
                                    LIZ.append("x");
                                    LIZ.append(GLRenderVideoSink.this.mFixedHeight);
                                    AVLog.iow("GLRenderVideoSink", X1D.LIZIZ(LIZ));
                                    return;
                                }
                                if (f >= 1.0d) {
                                    return;
                                }
                                holder.setSizeFromLayout();
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("setSizeFromLayout:");
                                LIZ2.append(GLRenderVideoSink.this.mRenderWidth);
                                LIZ2.append("x");
                                LIZ2.append(GLRenderVideoSink.this.mRenderHeight);
                                AVLog.iow("GLRenderVideoSink", X1D.LIZIZ(LIZ2));
                            }

                            public static void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                                boolean LIZ;
                                try {
                                    anonymousClass5.com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$5__run$___twin___();
                                } finally {
                                    if (LIZ) {
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
    }

    public void onSurfaceChanged(int i, int i2, Surface surface) {
        GLSurface gLSurface = this.mSurface;
        if (gLSurface != null) {
            gLSurface.nativeSurfaceChanged(i, i2, 0);
        }
        GLRenderer gLRenderer = this.mGLRenderer;
        if (gLRenderer != null) {
            gLRenderer.onSurfaceChanged(i, i2);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" onSurfaceChanged: width ");
        LIZ.append(i);
        LIZ.append(", height ");
        LIZ.append(i2);
        LIZ.append(", surface ");
        LIZ.append(surface);
        AVLog.ioi("GLRenderVideoSink", X1D.LIZIZ(LIZ));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, final int i2, final int i3) {
        final Surface surface;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this);
        LIZ.append(" surfaceChanged: format ");
        LIZ.append(i);
        LIZ.append(", width ");
        LIZ.append(i2);
        LIZ.append(", height ");
        LIZ.append(i3);
        AVLog.ioi("GLRenderVideoSink", X1D.LIZIZ(LIZ));
        if (surfaceHolder != null) {
            surface = surfaceHolder.getSurface();
        } else {
            surface = this.mSurfaceWithTexture;
        }
        Handler handler = this.mHandler;
        if (handler != null && handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.3
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$3__run$___twin___() {
                GLRenderVideoSink.this.onSurfaceChanged(i2, i3, surface);
            }

            public static void com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ2;
                try {
                    anonymousClass3.com_ss_ttlivestreamer_core_opengl_GLRenderVideoSink$3__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        })) {
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this);
        LIZ2.append(" surfaceChanged exception! thread already exit.");
        AVLog.iow("GLRenderVideoSink", X1D.LIZIZ(LIZ2));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (this.mRenderWidth != i9 || this.mRenderHeight != i10) {
            this.mRenderWidth = i9;
            this.mRenderHeight = i10;
            this.mRenderSizeChanged = true;
        }
    }
}
