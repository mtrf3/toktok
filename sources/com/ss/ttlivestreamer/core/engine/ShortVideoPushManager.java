package com.ss.ttlivestreamer.core.engine;

import X.C06460Ne;
import X.X1D;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.util.DisplayMetrics;
import android.view.Surface;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoProcessUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes12.dex */
public class ShortVideoPushManager implements IShortVideoPushManager, Runnable {
    public Surface mCurrentActiveSurface;
    public int mDefaultBufferHeight;
    public int mDefaultBufferWidth;
    public final IFrameAvailableListener mFrameAvailableListener;
    public final long mFrameInterval;
    public final GLThread mGLThread;
    public final Handler mGLTreadHandler;
    public boolean mHorizontalMirror;
    public long mNextFrameTimeStamp;
    public final int mOutputHeight;
    public final int mOutputWidth;
    public final Map<Surface, SurfaceTextureHelper> mSurfaceMap;
    public boolean mVerticalMirror;
    public int mVideoHeight;
    public VideoProcessUnit mVideoProcessUnit;
    public int mVideoWidth;
    public int mOutputTextureId = -1;
    public final Object mReleaseFence = new Object();
    public boolean mReleased = false;

    /* loaded from: classes12.dex */
    public interface IFrameAvailableListener {
        void onFrameAvailable(int i, int i2, int i3, long j);
    }

    /* loaded from: classes12.dex */
    public static class ShortVideoSurfaceTextureHelper extends SurfaceTextureHelper {
        @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper
        public void handlerExit() {
            AVLog.ioi("ShortVideoPushManager", "call handlerExit.");
        }

        public ShortVideoSurfaceTextureHelper(Handler handler) {
            super(handler, true);
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.IShortVideoPushManager
    public boolean isVideoMirror(boolean z) {
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.engine.IShortVideoPushManager
    public synchronized void release() {
        synchronized (this.mReleaseFence) {
            doRelease();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com_ss_ttlivestreamer_core_engine_ShortVideoPushManager_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
    }

    @Override // com.ss.ttlivestreamer.core.engine.IShortVideoPushManager
    public void setFitMode(boolean z) {
    }

    private void doRelease() {
        if (this.mReleased) {
            return;
        }
        this.mReleased = true;
        this.mCurrentActiveSurface = null;
        Map<Surface, SurfaceTextureHelper> map = this.mSurfaceMap;
        if (map != null && map.size() >= 1) {
            for (Map.Entry<Surface, SurfaceTextureHelper> entry : this.mSurfaceMap.entrySet()) {
                Surface key = entry.getKey();
                if (key != null) {
                    key.release();
                }
                SurfaceTextureHelper value = entry.getValue();
                if (value != null) {
                    value.dispose();
                }
            }
            this.mSurfaceMap.clear();
        }
        VideoProcessUnit videoProcessUnit = this.mVideoProcessUnit;
        if (videoProcessUnit != null) {
            videoProcessUnit.release();
            this.mVideoProcessUnit = null;
        }
        SafeHandlerThreadPoolExecutor.unlockThread(this.mGLThread);
    }

    public void com_ss_ttlivestreamer_core_engine_ShortVideoPushManager__run$___twin___() {
        if (this.mReleased) {
            this.mGLTreadHandler.removeCallbacks(this);
            return;
        }
        this.mGLTreadHandler.removeCallbacks(this);
        AVLog2.logToIODevice2(5, "ShortVideoPushManager", "Short video frame comes.", null, 61, 10000);
        IFrameAvailableListener iFrameAvailableListener = this.mFrameAvailableListener;
        if (iFrameAvailableListener != null) {
            iFrameAvailableListener.onFrameAvailable(this.mOutputTextureId, this.mOutputWidth, this.mOutputHeight, TimeUtils.nativeNanoTime() / 1000);
        }
        this.mGLTreadHandler.postDelayed(this, 100L);
    }

    @Override // com.ss.ttlivestreamer.core.engine.IShortVideoPushManager
    public Surface getSurface() {
        final SurfaceTextureHelper surfaceTextureHelper = (SurfaceTextureHelper) ThreadUtils.invokeAtFrontUninterruptibly(this.mGLTreadHandler, new Callable<SurfaceTextureHelper>() { // from class: com.ss.ttlivestreamer.core.engine.ShortVideoPushManager.1
            @Override // java.util.concurrent.Callable
            /* renamed from: call, reason: merged with bridge method [inline-methods] */
            public SurfaceTextureHelper call2() {
                try {
                    return new ShortVideoSurfaceTextureHelper(ShortVideoPushManager.this.mGLTreadHandler);
                } catch (RuntimeException unused) {
                    AVLog.e("ShortVideoPushManager", "call:  create failure");
                    return null;
                }
            }
        });
        if (surfaceTextureHelper == null) {
            return null;
        }
        SurfaceTexture surfaceTexture = surfaceTextureHelper.getSurfaceTexture();
        surfaceTexture.setDefaultBufferSize(this.mDefaultBufferWidth, this.mDefaultBufferHeight);
        final Surface surface = new Surface(surfaceTexture);
        surfaceTextureHelper.startListening(new SurfaceTextureHelper.OnTextureFrameAvailableListener() { // from class: com.ss.ttlivestreamer.core.engine.ShortVideoPushManager.2
            @Override // com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper.OnTextureFrameAvailableListener
            public void onTextureFrameAvailable(int i, float[] fArr, long j) {
                float f;
                synchronized (ShortVideoPushManager.this.mSurfaceMap) {
                    ShortVideoPushManager shortVideoPushManager = ShortVideoPushManager.this;
                    if (shortVideoPushManager.mCurrentActiveSurface != surface) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Current surface (");
                        LIZ.append(surface);
                        LIZ.append(")is not active,active is:");
                        LIZ.append(ShortVideoPushManager.this.mCurrentActiveSurface);
                        AVLog2.logToIODevice2(5, "ShortVideoPushManager", X1D.LIZIZ(LIZ), null, 62, 10000);
                        surfaceTextureHelper.returnTextureFrame(true);
                        return;
                    }
                    if (!shortVideoPushManager.keepFrame(j / 1000000)) {
                        surfaceTextureHelper.returnTextureFrame(true);
                        return;
                    }
                    int videoWidth = ShortVideoPushManager.this.getVideoWidth();
                    int videoHeight = ShortVideoPushManager.this.getVideoHeight();
                    if (i >= 1 && videoWidth >= 1 && videoHeight >= 1) {
                        Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(fArr);
                        convertMatrixToAndroidGraphicsMatrix.preTranslate(0.5f, 0.5f);
                        ShortVideoPushManager shortVideoPushManager2 = ShortVideoPushManager.this;
                        float f2 = -1.0f;
                        if (shortVideoPushManager2.mHorizontalMirror) {
                            f = -1.0f;
                        } else {
                            f = 1.0f;
                        }
                        if (!shortVideoPushManager2.mVerticalMirror) {
                            f2 = 1.0f;
                        }
                        convertMatrixToAndroidGraphicsMatrix.preScale(f, f2);
                        convertMatrixToAndroidGraphicsMatrix.preTranslate(-0.5f, -0.5f);
                        ShortVideoPushManager shortVideoPushManager3 = ShortVideoPushManager.this;
                        shortVideoPushManager3.mOutputTextureId = shortVideoPushManager3.mVideoProcessUnit.process(i, videoWidth, videoHeight, true, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix));
                        ShortVideoPushManager.this.run();
                        surfaceTextureHelper.returnTextureFrame();
                        return;
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Bad Params,tex=");
                    LIZ2.append(i);
                    LIZ2.append(",width=");
                    LIZ2.append(videoWidth);
                    LIZ2.append(",height=");
                    LIZ2.append(videoHeight);
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(X1D.LIZIZ(LIZ2));
                    TTLSSladarBugReportUtils.getInstance().report(androidRuntimeException, "ShortVideoPushManager.getSurface");
                    if (!TTLSBuildConfig.canThrowException()) {
                        surfaceTextureHelper.returnTextureFrame(true);
                        return;
                    }
                    throw androidRuntimeException;
                }
            }
        });
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getSurface(");
        LIZ.append(surface);
        LIZ.append(")");
        AVLog.w("ShortVideoPushManager", X1D.LIZIZ(LIZ));
        this.mSurfaceMap.put(surface, surfaceTextureHelper);
        return surface;
    }

    public void finalize() {
        release();
    }

    public int getVideoHeight() {
        return this.mVideoHeight;
    }

    public int getVideoWidth() {
        return this.mVideoWidth;
    }

    public static void com_ss_ttlivestreamer_core_engine_ShortVideoPushManager_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(ShortVideoPushManager shortVideoPushManager) {
        boolean LIZ;
        try {
            shortVideoPushManager.com_ss_ttlivestreamer_core_engine_ShortVideoPushManager__run$___twin___();
        } finally {
            if (LIZ) {
            }
        }
    }

    private void doReleaseSurface(Surface surface) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("releaseSurface(");
        LIZ.append(surface);
        LIZ.append(")");
        AVLog.iow("ShortVideoPushManager", X1D.LIZIZ(LIZ));
        this.mGLTreadHandler.removeCallbacks(this);
        if (this.mCurrentActiveSurface == surface) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("can not release surface cause active(");
            LIZ2.append(surface);
            LIZ2.append(")");
            AVLog.w("ShortVideoPushManager", X1D.LIZIZ(LIZ2));
            return;
        }
        if (this.mSurfaceMap != null && surface != null) {
            surface.release();
            SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceMap.get(surface);
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.dispose();
            }
            this.mSurfaceMap.remove(surface);
        }
    }

    public boolean keepFrame(long j) {
        long j2 = this.mNextFrameTimeStamp;
        if (j2 > 0) {
            long j3 = j2 - j;
            long abs = Math.abs(j3);
            long j4 = this.mFrameInterval;
            if (abs < j4 * 2) {
                if (j3 > 0) {
                    return false;
                }
                this.mNextFrameTimeStamp += j4;
                return true;
            }
        }
        this.mNextFrameTimeStamp = (this.mFrameInterval / 2) + j;
        return true;
    }

    @Override // com.ss.ttlivestreamer.core.engine.IShortVideoPushManager
    public void releaseSurface(Surface surface) {
        synchronized (this.mReleaseFence) {
            doReleaseSurface(surface);
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.IShortVideoPushManager
    public void enableVideoMirror(boolean z, boolean z2) {
        this.mHorizontalMirror = z;
        this.mVerticalMirror = z2;
    }

    @Override // com.ss.ttlivestreamer.core.engine.IShortVideoPushManager
    public void activeSurface(Surface surface, int i, int i2) {
        StringBuilder LIZJ = C06460Ne.LIZJ("activeSurface(", i, ",", i2, "),surface");
        LIZJ.append(surface);
        AVLog.iow("ShortVideoPushManager", X1D.LIZIZ(LIZJ));
        synchronized (this.mSurfaceMap) {
            this.mCurrentActiveSurface = surface;
            this.mVideoWidth = i;
            this.mVideoHeight = i2;
        }
    }

    public ShortVideoPushManager(Context context, int i, int i2, int i3, IFrameAvailableListener iFrameAvailableListener) {
        this.mDefaultBufferWidth = 720;
        this.mDefaultBufferHeight = 1280;
        AVLog.w("ShortVideoPushManager", "ShortVideoPushManager ctor");
        AVLog.logKibana(4, "ShortVideoPushManager", "ShortVideoPushManager ctor", null);
        this.mFrameAvailableListener = iFrameAvailableListener;
        this.mFrameInterval = 1000 / i3;
        this.mOutputWidth = i;
        this.mOutputHeight = i2;
        this.mSurfaceMap = new HashMap();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            this.mDefaultBufferWidth = displayMetrics.widthPixels;
            this.mDefaultBufferHeight = displayMetrics.heightPixels;
        }
        GLThread lockGLThread = SafeHandlerThreadPoolExecutor.lockGLThread("GL-ShortVideo");
        this.mGLThread = lockGLThread;
        lockGLThread.start();
        Handler handler = lockGLThread.getHandler();
        this.mGLTreadHandler = handler;
        VideoProcessUnit videoProcessUnit = new VideoProcessUnit(handler, VideoProcessUnit.Mode.MODE_FIT);
        this.mVideoProcessUnit = videoProcessUnit;
        videoProcessUnit.updateCrop(i, i2);
    }

    public static IShortVideoPushManager createShortVideoPushManager(Context context, int i, int i2, int i3, IFrameAvailableListener iFrameAvailableListener) {
        return new ShortVideoPushManager(context, i, i2, i3, iFrameAvailableListener);
    }
}
