package com.byted.cast.engine;

import X.C16880lQ;
import X.X1D;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.SurfaceHolder;
import com.byted.cast.engine.VoipEngine;
import com.byted.cast.sdk.RTCMediaKind;
import com.byted.cast.sdk.RTCVideoRender;
import com.byted.cast.sdk.log.Logger;
import com.byted.cast.sdk.log.LoggerManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes29.dex */
public class VoipVideoRender implements GLSurfaceView.Renderer, VoipEngine.OnVoipStreamEventListener {
    public WeakReference<GLSurfaceView> mGLSurfaceView;
    public Handler mHandler;
    public boolean mIsPublished;
    public boolean mIsSubscribed;
    public boolean mIsWaitSubscribe;
    public Logger mLogger;
    public String mMirrorId;
    public RTCVideoRender.StatusListener mStatusListener;
    public long mRenderContext = -1;
    public String mUserId = "";
    public RTCMediaKind mMediaKind = RTCMediaKind.INVALID;
    public int mPreferedLayer = 1;
    public VoipEngine mVoipEngine = new VoipEngine(null);
    public AtomicInteger mInvalidateCounter = new AtomicInteger(0);

    private native void draw(long j);

    private native void init(long j);

    private native void resize(long j, int i, int i2);

    private native void unbind(long j);

    public native void bind(long j, String str, int i);

    public native long create(String str);

    public native void destroy(long j);

    @Override // com.byted.cast.engine.VoipEngine.OnVoipStreamEventListener
    public void onStreamSubscribed(String str, RTCMediaKind rTCMediaKind) {
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipStreamEventListener
    public void onStreamUnsubscribed(String str, RTCMediaKind rTCMediaKind) {
    }

    private void invalidate() {
        GLSurfaceView gLSurfaceView = this.mGLSurfaceView.get();
        if (gLSurfaceView != null) {
            this.mInvalidateCounter.incrementAndGet();
            gLSurfaceView.requestRender();
        }
    }

    public boolean clearSource() {
        long j = this.mRenderContext;
        if (j != -1) {
            unbind(j);
        }
        if (isSetSource()) {
            Logger logger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getContextTag());
            LIZ.append("clearSource");
            logger.i("VoipVideoRender", X1D.LIZIZ(LIZ));
            unsubscribe();
            this.mUserId = "";
            this.mMediaKind = RTCMediaKind.INVALID;
        }
        this.mIsPublished = false;
        this.mStatusListener = null;
        return true;
    }

    public String getContextTag() {
        return "[" + hashCode() + "][" + this.mRenderContext + "][" + this.mUserId + "][" + this.mMediaKind.toString() + "] ";
    }

    public boolean isSetSource() {
        String str = this.mUserId;
        if (str != null && !"".equals(str) && this.mMediaKind != RTCMediaKind.INVALID) {
            return true;
        }
        return false;
    }

    public boolean isSubscribed() {
        if (isSetSource() && this.mIsSubscribed) {
            return true;
        }
        return false;
    }

    public boolean subscribe() {
        if (!isSetSource()) {
            Logger logger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getContextTag());
            LIZ.append("subscribe failed, video source is not set");
            logger.e("VoipVideoRender", X1D.LIZIZ(LIZ));
            return false;
        }
        if (this.mIsSubscribed) {
            return true;
        }
        if (this.mIsPublished) {
            Logger logger2 = this.mLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(getContextTag());
            LIZ2.append("subscribe");
            logger2.i("VoipVideoRender", X1D.LIZIZ(LIZ2));
        } else {
            this.mIsWaitSubscribe = true;
        }
        return true;
    }

    public boolean unsubscribe() {
        if (!isSetSource()) {
            Logger logger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getContextTag());
            LIZ.append("unsubscribe failed, video source is not set");
            logger.e("VoipVideoRender", X1D.LIZIZ(LIZ));
            return false;
        }
        if (this.mIsSubscribed) {
            Logger logger2 = this.mLogger;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(getContextTag());
            LIZ2.append("unsubscribe");
            logger2.i("VoipVideoRender", X1D.LIZIZ(LIZ2));
        }
        this.mIsWaitSubscribe = false;
        this.mIsSubscribed = false;
        return true;
    }

    public RTCMediaKind getMediaKind() {
        return this.mMediaKind;
    }

    public long getRenderContext() {
        return this.mRenderContext;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public void notifyVideoSimulcasted(final int i) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.engine.VoipVideoRender.3
            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_engine_VoipVideoRender$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_engine_VoipVideoRender$3__run$___twin___() {
                RTCVideoRender.StatusListener statusListener = VoipVideoRender.this.mStatusListener;
                if (statusListener != null) {
                    statusListener.onVideoSimulcasted(i);
                }
            }

            public static void com_byted_cast_engine_VoipVideoRender$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                boolean LIZ;
                try {
                    anonymousClass3.com_byted_cast_engine_VoipVideoRender$3__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    public void notifyVideoStatusChanged(final boolean z) {
        this.mHandler.post(new Runnable() { // from class: com.byted.cast.engine.VoipVideoRender.2
            @Override // java.lang.Runnable
            public void run() {
                com_byted_cast_engine_VoipVideoRender$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_byted_cast_engine_VoipVideoRender$2__run$___twin___() {
                RTCVideoRender.StatusListener statusListener = VoipVideoRender.this.mStatusListener;
                if (statusListener != null) {
                    statusListener.onVideoStatusChanged(z);
                }
            }

            public static void com_byted_cast_engine_VoipVideoRender$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_byted_cast_engine_VoipVideoRender$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getContextTag());
        LIZ.append("onDrawFrame");
        logger.i("VoipVideoRender", X1D.LIZIZ(LIZ));
        if (this.mRenderContext != -1 && isSetSource() && this.mInvalidateCounter.get() > 0) {
            this.mInvalidateCounter.decrementAndGet();
            draw(this.mRenderContext);
        }
    }

    public VoipVideoRender(GLSurfaceView gLSurfaceView, final String str) {
        this.mMirrorId = str;
        Logger logger = LoggerManager.getLogger(str);
        this.mLogger = logger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VoipVideoRender construct  ");
        LIZ.append(gLSurfaceView.toString());
        logger.i("VoipVideoRender", X1D.LIZIZ(LIZ));
        this.mGLSurfaceView = new WeakReference<>(gLSurfaceView);
        gLSurfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: com.byted.cast.engine.VoipVideoRender.1
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                VoipVideoRender voipVideoRender = VoipVideoRender.this;
                voipVideoRender.mRenderContext = voipVideoRender.create(str);
                Logger logger2 = VoipVideoRender.this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(VoipVideoRender.this.getContextTag());
                LIZ2.append("surfaceCreated -> context created !");
                logger2.i("VoipVideoRender", X1D.LIZIZ(LIZ2));
                VoipVideoRender voipVideoRender2 = VoipVideoRender.this;
                voipVideoRender2.mVoipEngine.addVideoRender(voipVideoRender2);
                if (VoipVideoRender.this.isSetSource()) {
                    VoipVideoRender voipVideoRender3 = VoipVideoRender.this;
                    voipVideoRender3.bind(voipVideoRender3.mRenderContext, voipVideoRender3.mUserId, voipVideoRender3.mMediaKind.value());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                Logger logger2 = VoipVideoRender.this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(VoipVideoRender.this.getContextTag());
                LIZ2.append("surfaceDestroyed -> context destroyed !");
                logger2.i("VoipVideoRender", X1D.LIZIZ(LIZ2));
                VoipVideoRender voipVideoRender = VoipVideoRender.this;
                voipVideoRender.mVoipEngine.removeVideoRender(voipVideoRender);
                VoipVideoRender voipVideoRender2 = VoipVideoRender.this;
                long j = voipVideoRender2.mRenderContext;
                if (j != -1) {
                    voipVideoRender2.destroy(j);
                    VoipVideoRender.this.mRenderContext = -1L;
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                Logger logger2 = VoipVideoRender.this.mLogger;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(VoipVideoRender.this.getContextTag());
                LIZ2.append("surfaceChanged -> ");
                LIZ2.append(i2);
                LIZ2.append("x");
                LIZ2.append(i3);
                logger2.i("VoipVideoRender", X1D.LIZIZ(LIZ2));
            }
        });
        this.mVoipEngine.addOnVoipStreamEventListener(this);
        this.mHandler = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipStreamEventListener
    public void onStreamUnpublished(String str, RTCMediaKind rTCMediaKind) {
        this.mIsPublished = false;
        notifyVideoStatusChanged(false);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getContextTag());
        LIZ.append("onSurfaceCreated");
        logger.i("VoipVideoRender", X1D.LIZIZ(LIZ));
        long j = this.mRenderContext;
        if (j != -1) {
            init(j);
        }
    }

    @Override // com.byted.cast.engine.VoipEngine.OnVoipStreamEventListener
    public void onStreamPublished(String str, RTCMediaKind rTCMediaKind, int i) {
        this.mIsPublished = true;
        notifyVideoStatusChanged(true);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        Logger logger = this.mLogger;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(getContextTag());
        LIZ.append("onSurfaceChanged: ");
        LIZ.append(i);
        LIZ.append("x");
        LIZ.append(i2);
        logger.i("VoipVideoRender", X1D.LIZIZ(LIZ));
        long j = this.mRenderContext;
        if (j != -1) {
            resize(j, i, i2);
        }
    }

    public boolean setSource(String str, RTCMediaKind rTCMediaKind, RTCVideoRender.StatusListener statusListener) {
        if (str == null || "".equals(str) || rTCMediaKind == RTCMediaKind.INVALID) {
            Logger logger = this.mLogger;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getContextTag());
            LIZ.append("setSource failed, invalid params: ");
            LIZ.append(str);
            LIZ.append("-");
            LIZ.append(rTCMediaKind.toString());
            logger.i("VoipVideoRender", X1D.LIZIZ(LIZ));
            return false;
        }
        this.mUserId = str;
        this.mMediaKind = rTCMediaKind;
        this.mStatusListener = statusListener;
        Logger logger2 = this.mLogger;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(getContextTag());
        LIZ2.append("setSource");
        logger2.i("VoipVideoRender", X1D.LIZIZ(LIZ2));
        long j = this.mRenderContext;
        if (j != -1) {
            bind(j, this.mUserId, this.mMediaKind.value());
            return true;
        }
        return true;
    }
}
