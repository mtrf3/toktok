package com.ss.avframework.livestreamv2.core.interact.media;

import X.AnonymousClass028;
import X.X1D;
import X.ZVB;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AndroidRuntimeException;
import com.bytedance.realx.video.EglBase;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.SurfaceWithExtData;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TTLSThreadConfigHelper;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import java.util.concurrent.Callable;

/* loaded from: classes12.dex */
public class SurfacePublisherMgr implements SurfaceTextureHelper.OnTextureFrameAvailableListener {
    public EglBase mEglBase;
    public HandlerThread mGLThread;
    public Handler mGLTreadHandler;
    public RTCVideoImpl mRtcEngine;
    public SurfaceWithExtData mSurface;
    public final Object mSurfaceFence = new Object();
    public SurfaceTextureHelper mSurfaceHelper;
    public ITexCallback mSurfaceTexCallback;
    public final int mSurfaceWidth;
    public final int mSurfaceheight;

    /* loaded from: classes12.dex */
    public interface ITexCallback {
        void onTexCallback(SurfaceTextureHelper surfaceTextureHelper, SurfaceWithExtData surfaceWithExtData, int i, float[] fArr, EglBase eglBase);
    }

    private void getSurfaceInternal() {
        HandlerThread handlerThread = new HandlerThread("GL-RTCVideo", TTLSThreadConfigHelper.getPriority("GL-RTCVideo", 0));
        this.mGLThread = handlerThread;
        handlerThread.start();
        this.mGLTreadHandler = new Handler(this.mGLThread.getLooper());
        this.mEglBase = ZVB.LIZIZ(this.mRtcEngine.getEGLContext().getEglBaseContext());
        ThreadUtils.invokeAtFrontUninterruptibly(this.mGLTreadHandler, new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.media.SurfacePublisherMgr.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_avframework_livestreamv2_core_interact_media_SurfacePublisherMgr$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_avframework_livestreamv2_core_interact_media_SurfacePublisherMgr$2__run$___twin___() {
                SurfacePublisherMgr.this.mEglBase.createDummyPbufferSurface();
                SurfacePublisherMgr.this.mEglBase.makeCurrent();
            }

            public static void com_ss_avframework_livestreamv2_core_interact_media_SurfacePublisherMgr$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_avframework_livestreamv2_core_interact_media_SurfacePublisherMgr$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        SurfaceTextureHelper surfaceTextureHelper = (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(this.mGLTreadHandler, new Callable<SurfaceTextureHelper>() { // from class: com.ss.avframework.livestreamv2.core.interact.media.SurfacePublisherMgr.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public SurfaceTextureHelper call() {
                try {
                    return new RTCVideoSurfaceTextureHelper(SurfacePublisherMgr.this.mGLTreadHandler);
                } catch (RuntimeException unused) {
                    AVLog.e("SurfacePublisherMgr", "call:  create failure");
                    return null;
                }
            }
        });
        this.mSurfaceHelper = surfaceTextureHelper;
        if (surfaceTextureHelper != null) {
            SurfaceTexture surfaceTexture = surfaceTextureHelper.getSurfaceTexture();
            surfaceTexture.setDefaultBufferSize(this.mSurfaceWidth, this.mSurfaceheight);
            this.mSurface = new SurfaceWithExtData(surfaceTexture);
            this.mSurfaceHelper.startListening(this);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getSurface(");
            LIZ.append(this.mSurface);
            LIZ.append(")");
            AVLog.w("SurfacePublisherMgr", X1D.LIZIZ(LIZ));
        }
    }

    public SurfaceWithExtData getSingleSurface() {
        synchronized (this.mSurfaceFence) {
            if (this.mSurface == null && this.mRtcEngine != null) {
                getSurfaceInternal();
            }
        }
        SurfaceWithExtData surfaceWithExtData = this.mSurface;
        if (surfaceWithExtData != null) {
            return surfaceWithExtData;
        }
        return null;
    }

    public void releaseSurface() {
        synchronized (this.mSurfaceFence) {
            if (this.mSurface != null) {
                this.mSurfaceHelper.stopListening();
                ThreadUtils.invokeAtFrontUninterruptibly(this.mGLTreadHandler, new Runnable() { // from class: com.ss.avframework.livestreamv2.core.interact.media.SurfacePublisherMgr.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_avframework_livestreamv2_core_interact_media_SurfacePublisherMgr$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_avframework_livestreamv2_core_interact_media_SurfacePublisherMgr$1__run$___twin___() {
                        SurfacePublisherMgr.this.mSurface.release();
                        SurfacePublisherMgr surfacePublisherMgr = SurfacePublisherMgr.this;
                        surfacePublisherMgr.mSurface = null;
                        surfacePublisherMgr.mEglBase.release();
                        SurfacePublisherMgr surfacePublisherMgr2 = SurfacePublisherMgr.this;
                        surfacePublisherMgr2.mEglBase = null;
                        surfacePublisherMgr2.mGLThread.getLooper().quit();
                        SurfacePublisherMgr surfacePublisherMgr3 = SurfacePublisherMgr.this;
                        surfacePublisherMgr3.mGLThread = null;
                        surfacePublisherMgr3.mGLTreadHandler = null;
                    }

                    public static void com_ss_avframework_livestreamv2_core_interact_media_SurfacePublisherMgr$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_avframework_livestreamv2_core_interact_media_SurfacePublisherMgr$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                this.mSurfaceHelper.dispose();
                this.mSurfaceHelper = null;
            }
        }
    }

    public void finalize() {
        super.finalize();
        releaseSurface();
    }

    /* loaded from: classes12.dex */
    public static class RTCVideoSurfaceTextureHelper extends SurfaceTextureHelper {
        @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper
        public void handlerExit() {
        }

        public RTCVideoSurfaceTextureHelper(Handler handler) {
            super(handler, true);
        }
    }

    public void setRtcEngine(RTCVideo rTCVideo) {
        if (rTCVideo instanceof RTCVideoImpl) {
            this.mRtcEngine = (RTCVideoImpl) rTCVideo;
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("TYPEERROR");
        if (!AnonymousClass028.LJI(androidRuntimeException, "SurfacePublisherMgr.setRtcEngine")) {
        } else {
            throw androidRuntimeException;
        }
    }

    public void setSurfaceTexCallback(ITexCallback iTexCallback) {
        this.mSurfaceTexCallback = iTexCallback;
    }

    public SurfacePublisherMgr(int i, int i2) {
        this.mSurfaceWidth = i;
        this.mSurfaceheight = i2;
    }

    @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener
    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        SurfaceTextureHelper surfaceTextureHelper;
        EglBase eglBase;
        ITexCallback iTexCallback = this.mSurfaceTexCallback;
        if (iTexCallback != null) {
            synchronized (this.mSurfaceFence) {
                SurfaceWithExtData surfaceWithExtData = this.mSurface;
                if (surfaceWithExtData != null && (surfaceTextureHelper = this.mSurfaceHelper) != null && (eglBase = this.mEglBase) != null) {
                    iTexCallback.onTexCallback(surfaceTextureHelper, surfaceWithExtData, i, fArr, eglBase);
                }
            }
        }
    }
}
