package com.ss.ttlivestreamer.livestreamv2.capture;

import X.AnonymousClass028;
import X.C06460Ne;
import X.C15890jp;
import X.C16880lQ;
import X.C25620zW;
import X.C48263Iwt;
import X.C61845OOz;
import X.C63824P3c;
import X.C63915P6p;
import X.C84134X0g;
import X.EnumC63901P6b;
import X.InterfaceC63917P6r;
import X.InterfaceC63921P6v;
import X.InterfaceC87361YQj;
import X.P3H;
import X.P3Q;
import X.P3Y;
import X.P6E;
import X.P7P;
import X.X1D;
import X.YR1;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.os.Bundle;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import android.view.WindowManager;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.cameraalgorithm.TETaintSceneDetectParams;
import com.ss.ttlivestreamer.core.buffer.GlTextureFrameBuffer;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.ScopeMonitor;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;
import com.ss.ttlivestreamer.livestreamv2.capture.algorithm.CameraAlgorithmParamWrapper;
import com.ss.ttlivestreamer.livestreamv2.capture.algorithm.CameraLensCallbackWrapper;
import com.ss.ttlivestreamer.livestreamv2.capture.algorithm.TaintSceneDetectParamsWrapper;
import com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl;
import com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithmChain;
import com.ss.ttlivestreamer.livestreamv2.filter.ve.LiveAlgorithmParam;
import com.ss.ttlivestreamer.livestreamv2.utils.PrivacyCertManager;
import com.ss.ttlivestreamer.livestreamv2.utils.VideoDumpProxy;
import defpackage.b1;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class CameraVideoCapturer extends ExternalVideoCapturer implements CameraObserver, YR1, P7P, P3Q, IVideoCapturerControl {
    public static final Map<String, Bundle> CAMERA_FEATURES = new HashMap();
    public final int TAINT_SCENE_MAX_FRAME_COUNT;
    public AtomicBoolean isTaintSceneAlgoOnWork;
    public boolean lensDetectFlag;
    public int mAdaptedFps;
    public volatile int mAdaptedHeight;
    public volatile int mAdaptedWidth;
    public long mAverageExposureTime;
    public double mAvgCaptureResultFps;
    public long mAvgFps;
    public GlTextureFrameBuffer mBackupFrameBuffer;
    public String mCamFpsRangeStr;
    public int mCameraCaptureHeight;
    public int mCameraCaptureWidth;
    public int mCameraFacing;
    public final int mCameraFrameRateStrategy;
    public int mCameraMode;
    public final int mCameraOpenRetryCnt;
    public final int mCameraRetryStartPreviewCnt;
    public boolean mCameraSizeOptEnable;
    public int mCameraType;
    public AtomicBoolean mCameraUpdating;
    public final TECameraCapture mCapture;
    public int mCapturedFrameHeight;
    public int mCapturedFrameWidth;
    public boolean mChooseBestCaptureResolution;
    public Context mContext;
    public Runnable mCurrentPushFrameRequestRunnable;
    public final int mDestFps;
    public CameraAlgorithmParamWrapper mDetectParamsWrapper;
    public int mDisplayRotation;
    public GlRenderDrawer mDrawer;
    public boolean mEnableCallBackStop;
    public final boolean mEnableFallback;
    public boolean mEnableFrontContinueFocus;
    public volatile int mEnableMipmap;
    public boolean mEnableOesProcessDoubleBuffer;
    public final boolean mEnableOpenCamera1Opt;
    public boolean mEnablePreviewTemplate;
    public boolean mEnablePtsAdjust;
    public int mEnableStabilization;
    public int mEnableWideAngle;
    public final boolean mEnableWideFov;
    public boolean mExchangedResolution;
    public final int mFaceAEStrategy;
    public final boolean mFixFpsRangeCompareBug;
    public P6E mFrame;
    public GlTextureFrameBuffer mFrameBuffer;
    public int mFrameFormat;
    public boolean mGotFirstFrame;
    public final Handler mHandler;
    public final P3H mISOCallback;
    public boolean mISPExposureStatus;
    public boolean mISPFocuseStatus;
    public boolean mISPToggleStatus;
    public final boolean mIsCameraOpenCloseSync;
    public final boolean mIsForceCloseCamera;
    public long mIsoInfo;
    public long mLastCameraCaptrueTimeStampMs;
    public long mLastGetISOTime;
    public long mLastTimeStampUs;
    public CameraAlgorithmChain mLiveChainOfAlgorithm;
    public LiveAlgorithmParam.RhythmicMotion mLiveTransParam;
    public final Handler mMainHandler;
    public final boolean mNeedDeliverFrameWithTimestamp;
    public final boolean mNeedOesTo2D;
    public boolean mNewTexture;
    public long mNextDeliverFrameTime;
    public final Object mObject;
    public final VideoCapturer.VideoCapturerObserver mObserver;
    public GlRenderDrawer mOesProcessDrawer;
    public GlTextureFrameBuffer mOesProcessFrameBuffer1;
    public boolean mOesProcessFrameBuffer1Using;
    public GlTextureFrameBuffer mOesProcessFrameBuffer2;
    public boolean mOesProcessFrameBuffer2Using;
    public Handler mOesProcessHandler;
    public final int mOesTex;
    public GlTextureFrameBuffer mOesTo2DBuffer;
    public GlRenderDrawer mOesTo2DDrawer;
    public GlTextureFrameBuffer mOesTo2DFrameBuffer;
    public GlRenderDrawer mOesTo2DFrameDrawer;
    public GLThread mOesTo2DThread;
    public Handler mOesTo2DThreadHandler;
    public long mOpenCameraTimestamp;
    public final Bundle mParams;
    public PushFrameRequest mPendingRequest;
    public C63915P6p mProviderSettings;
    public VideoDumpProxy.RawVideoDumperProxy[] mRawVideoDumpers;
    public VideoFrameStatics mRealRateStatics;
    public JSONObject mReportStatus;
    public int mRequiredCameraLevel;
    public int mRotation;
    public C84134X0g mSettings;
    public boolean mSkipFirstFrame;
    public StashParam mStashParam;
    public List<TEFrameSizei> mSupportPreviewSizes;
    public SurfaceTexture mSurfaceTexture;
    public float[] mTexMatrix;
    public final String mTextureMinFilter;
    public ThreadUtils.ThreadChecker mThreadChecker;
    public long mTimeStampDiffUs;
    public final boolean mUsingNewTimeStamp;
    public final int mVideoCaptureMinFps;
    public final VideoFrameDumper mVideoFrameDumper;
    public CameraLensCallbackWrapper mWrapperCallback;
    public AtomicInteger taintSceneAlgoCount;
    public volatile boolean useBackupBuffer;
    public InterfaceC63921P6v veCameraLog;

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public boolean currentSupportISPControl() {
        return true;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int getCurrentCaptureDevice() {
        return 0;
    }

    @Override // X.P7P
    public void onNewSurfaceTexture(SurfaceTexture surfaceTexture) {
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer, com.ss.ttlivestreamer.core.engine.NativeObject
    public synchronized void release() {
        if (this.mHandler != null) {
            stop();
            Handler handler = this.mOesProcessHandler;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.19
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$19__run$___twin___() {
                        SurfaceTexture surfaceTexture = CameraVideoCapturer.this.mSurfaceTexture;
                        if (surfaceTexture != null) {
                            surfaceTexture.release();
                            CameraVideoCapturer.this.mSurfaceTexture = null;
                        }
                        GlTextureFrameBuffer glTextureFrameBuffer = CameraVideoCapturer.this.mOesProcessFrameBuffer1;
                        if (glTextureFrameBuffer != null) {
                            glTextureFrameBuffer.release();
                            CameraVideoCapturer.this.mOesProcessFrameBuffer1 = null;
                        }
                        GlTextureFrameBuffer glTextureFrameBuffer2 = CameraVideoCapturer.this.mOesProcessFrameBuffer2;
                        if (glTextureFrameBuffer2 != null) {
                            glTextureFrameBuffer2.release();
                            CameraVideoCapturer.this.mOesProcessFrameBuffer2 = null;
                        }
                        GlRenderDrawer glRenderDrawer = CameraVideoCapturer.this.mOesProcessDrawer;
                        if (glRenderDrawer != null) {
                            glRenderDrawer.release();
                            CameraVideoCapturer.this.mOesProcessDrawer = null;
                        }
                        CameraVideoCapturer.this.mPendingRequest = null;
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass19 anonymousClass19) {
                        boolean LIZ;
                        try {
                            anonymousClass19.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$19__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            }
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.20
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$20__run$___twin___() {
                    SurfaceTexture surfaceTexture;
                    if (!CameraVideoCapturer.this.isEnableOesProcess() && (surfaceTexture = CameraVideoCapturer.this.mSurfaceTexture) != null) {
                        surfaceTexture.release();
                        CameraVideoCapturer.this.mSurfaceTexture = null;
                    }
                    GlRenderDrawer glRenderDrawer = CameraVideoCapturer.this.mDrawer;
                    if (glRenderDrawer != null) {
                        glRenderDrawer.release();
                        CameraVideoCapturer.this.mDrawer = null;
                    }
                    GlTextureFrameBuffer glTextureFrameBuffer = CameraVideoCapturer.this.mFrameBuffer;
                    if (glTextureFrameBuffer != null) {
                        glTextureFrameBuffer.release();
                        CameraVideoCapturer.this.mFrameBuffer = null;
                    }
                    VideoFrameDumper videoFrameDumper = CameraVideoCapturer.this.mVideoFrameDumper;
                    if (videoFrameDumper != null) {
                        videoFrameDumper.release();
                    }
                    VideoFrameStatics videoFrameStatics = CameraVideoCapturer.this.mRealRateStatics;
                    if (videoFrameStatics != null) {
                        videoFrameStatics.release();
                        CameraVideoCapturer.this.mRealRateStatics = null;
                    }
                    CameraVideoCapturer.this.mOesTo2DThread = null;
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass20 anonymousClass20) {
                    boolean LIZ;
                    try {
                        anonymousClass20.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$20__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        this.mContext = null;
        this.mRealRateStatics = null;
        super.release();
    }

    public void reportFirstFrame(CameraVideoCapturer cameraVideoCapturer, long j, boolean z) {
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer
    public void returnTexture() {
        this.mThreadChecker.checkIsOnValidThread();
        this.mBufferAlreadyReturn = true;
        if (this.mStatus == 1 && this.mNewTexture) {
            tryDeliverFrame(this.mLastCameraCaptrueTimeStampMs, Math.max(TimeUtils.currentTimeMs(), this.mNextDeliverFrameTime), false);
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer, com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public synchronized void stop() {
        this.mThreadChecker.checkIsOnValidThread();
        resetCameraState();
        synchronized (this.mObject) {
            TECameraCapture tECameraCapture = this.mCapture;
            CameraAlgorithmChain cameraAlgorithmChain = this.mLiveChainOfAlgorithm;
            if (cameraAlgorithmChain != null) {
                cameraAlgorithmChain.stopCameraAlgorithm(3);
            }
            this.mLiveChainOfAlgorithm = null;
            if (tECameraCapture != null) {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    PrivacyCertManager.cameraDisconnectWithCert(tECameraCapture);
                    tECameraCapture.stop();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Close TECamera: ");
                    LIZ.append(tECameraCapture);
                    LIZ.append(" cost time ");
                    LIZ.append(System.currentTimeMillis() - currentTimeMillis);
                    LIZ.append(" ms");
                    AVLog.logKibana(6, "CameraVideoCapturer", X1D.LIZIZ(LIZ), null);
                } catch (Throwable th) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Close TECamera fail. cost time ");
                    LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
                    LIZ2.append(" ms");
                    AVLog.logKibana(6, "CameraVideoCapturer", X1D.LIZIZ(LIZ2), th);
                }
                C84134X0g c84134X0g = this.mSettings;
                if (c84134X0g != null) {
                    c84134X0g.LJLIL = null;
                    c84134X0g.LLIIII.clear();
                }
            }
        }
    }

    public void switchCamera() {
        int i;
        int i2;
        this.lensDetectFlag = false;
        try {
            this.mThreadChecker.checkIsOnValidThread();
            resetCameraState();
            AVLog.ioi("CameraVideoCapturer", "switchCamera");
            if (this.mCapture == null) {
                this.mObserver.onVideoCaptureError(-205, new Exception("Capture already release"));
                return;
            }
            int i3 = 1;
            if (status() != 1) {
                AVLog.ioe("CameraVideoCapturer", "Camera no ready.");
                return;
            }
            boolean isBackCam = isBackCam();
            if (this.mEnableWideAngle != 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mEnableWideAngle = i;
            if (this.mEnableStabilization != 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.mEnableStabilization = i2;
            if (isBackCam) {
                this.mEnableWideAngle = -101;
            }
            if (!isCamera2Like()) {
                this.mEnableWideAngle = -100;
                this.mEnableStabilization = -100;
            }
            if (!isBackCam) {
                if (this.mEnableWideAngle == 1) {
                    i3 = 2;
                } else {
                    i3 = 0;
                }
            }
            this.mCameraFacing = i3;
            checkCameraFeatures(false);
            PrivacyCertManager.switchCameraWithCert(this.mCapture, this.mCameraFacing);
        } catch (Throwable unused) {
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.9
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$9__run$___twin___() {
                    CameraVideoCapturer.this.switchCamera();
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                    boolean LIZ;
                    try {
                        anonymousClass9.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$9__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    private void checkEnableMipmap() {
        String str = this.mTextureMinFilter;
        int i = 1;
        if (str != null && (str.equals("linear_mipmap_linear") || this.mTextureMinFilter.equals("linear_mipmap_nearest") || this.mTextureMinFilter.equals("nearest_mipmap_nearest") || this.mTextureMinFilter.equals("nearest_mipmap_linear"))) {
            if (this.mOutWidth <= 0 || this.mOutHeight <= 0 || this.mAdaptedWidth <= 0 || this.mAdaptedHeight <= 0) {
                this.mEnableMipmap = -1;
                return;
            }
            if (this.mOutWidth <= (this.mAdaptedWidth << 1) || this.mOutHeight <= (this.mAdaptedHeight << 1)) {
                i = -2;
            }
            this.mEnableMipmap = i;
            return;
        }
        this.mEnableMipmap = 0;
    }

    private LiveAlgorithmParam.OneKeyProcess getLiveOneKeyProcessParam() {
        LiveAlgorithmParam.OneKeyProcess oneKeyProcess = new LiveAlgorithmParam.OneKeyProcess();
        Bundle bundle = this.mParams;
        if (bundle != null) {
            oneKeyProcess.setEnableHDR(bundle.getBoolean("enableHDR"));
            oneKeyProcess.setEnableDenoise(bundle.getBoolean("enableDenoise"));
            oneKeyProcess.setEnableAfs(bundle.getBoolean("enableAfs"));
            oneKeyProcess.setEnableHdrV2(bundle.getBoolean("enableHdrV2"));
            oneKeyProcess.setEnableAsyncProcess(bundle.getBoolean("enableAsyncProcess"));
            oneKeyProcess.setEnableDayScene(bundle.getBoolean("enableDayScene"));
            oneKeyProcess.setEnableNightScene(bundle.getBoolean("enableNightScene"));
            oneKeyProcess.setAlgParams(bundle.getString("algParams"));
            oneKeyProcess.setFirstFrame(bundle.getBoolean("isFirstFrame"));
            oneKeyProcess.setEnableAlgoConfig(bundle.getBoolean("enableAlgoConfig"));
        }
        return oneKeyProcess;
    }

    private void markTaintSceneDone() {
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.13
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$13__run$___twin___() {
                AVLog.ioi("CameraVideoCapturer", "markTaintSceneDone, finish detect");
                CameraVideoCapturer.this.isTaintSceneAlgoOnWork.set(false);
                CameraVideoCapturer.this.taintSceneAlgoCount.set(0);
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
                boolean LIZ;
                try {
                    anonymousClass13.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$13__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    private void updateDisplayRotation() {
        WindowManager windowManager;
        Context context = this.mContext;
        if (context != null && (windowManager = (WindowManager) C16880lQ.LLILL(context, "window")) != null) {
            this.mDisplayRotation = windowManager.getDefaultDisplay().getRotation();
        }
    }

    private void updateTexImage() {
        try {
            this.mSurfaceTexture.updateTexImage();
        } catch (Throwable th) {
            TTLSSladarBugReportUtils.getInstance().report(th, "CameraVideoCapturer.updateTexImage");
            String message = th.getMessage();
            if (TTLSBuildConfig.canThrowException()) {
                if (EGL14.eglGetCurrentDisplay() == EGL14.EGL_NO_DISPLAY) {
                    StringBuilder LIZJ = b1.LIZJ(message, ";;;Error egl dpy env, code:");
                    LIZJ.append(EGL14.eglGetError());
                    message = X1D.LIZIZ(LIZJ);
                }
                if (EGL14.eglGetCurrentContext() == EGL14.EGL_NO_CONTEXT) {
                    StringBuilder LIZIZ = C25620zW.LIZIZ(message, ";;;", "Error egl ctx env, code:");
                    LIZIZ.append(EGL14.eglGetError());
                    message = X1D.LIZIZ(LIZIZ);
                }
                throw new AndroidRuntimeException(message);
            }
            AVLog2.logToIODevice2(6, "CameraVideoCapturer", message, null, 18, 10000);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void cancelAudioFocus() {
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            try {
                tECameraCapture.cancelFocus();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void cancelAutoFocus() {
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            try {
                tECameraCapture.cancelFocus();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public long getCameraAlgorithmState() {
        if (this.mLiveChainOfAlgorithm != null) {
            return r0.getAlgorithmValue();
        }
        return 0L;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int getCameraState() {
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            return tECameraCapture.getCameraState();
        }
        return -1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public IVideoCapturerControl.Range getExposureCompensationRange() {
        C63824P3c cameraECInfo;
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null && (cameraECInfo = tECameraCapture.getCameraECInfo()) != null) {
            IVideoCapturerControl.Range range = new IVideoCapturerControl.Range();
            range.max = cameraECInfo.LIZ;
            range.min = cameraECInfo.LIZJ;
            return range;
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public float getInCapFps() {
        VideoFrameStatics videoFrameStatics = this.mRealRateStatics;
        if (videoFrameStatics != null) {
            return videoFrameStatics.getRealRatePerSecond();
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd A[Catch: Exception -> 0x0109, all -> 0x010d, TryCatch #0 {Exception -> 0x0109, blocks: (B:7:0x000e, B:9:0x001b, B:10:0x0022, B:12:0x0026, B:13:0x0037, B:18:0x0057, B:19:0x0066, B:26:0x00ec, B:28:0x00fd, B:29:0x0102, B:36:0x00a4, B:37:0x00ac, B:39:0x00b4, B:40:0x00b6, B:41:0x00f4, B:42:0x005f, B:43:0x003c, B:44:0x004c), top: B:6:0x000e }] */
    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject getRealCameraStatus() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.getRealCameraStatus():org.json.JSONObject");
    }

    public int getValidCaptureFps() {
        TEFrameRateRange tEFrameRateRange;
        int i;
        C84134X0g c84134X0g = this.mSettings;
        if (c84134X0g != null && (i = (tEFrameRateRange = c84134X0g.LJLJI).fpsUnitFactor) > 0) {
            return tEFrameRateRange.max / i;
        }
        return 0;
    }

    public boolean isBackCam() {
        if (this.mCameraFacing != 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public boolean isCamera2Like() {
        if (this.mCameraType != 1) {
            return true;
        }
        return false;
    }

    public boolean isEnableOesProcess() {
        if (this.mOesProcessHandler != null) {
            return true;
        }
        return false;
    }

    public void markProcessTaintScene() {
        if (!this.isTaintSceneAlgoOnWork.get()) {
            this.isTaintSceneAlgoOnWork.set(true);
            this.taintSceneAlgoCount.set(0);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void startLiveOneKeyProcess() {
        CameraAlgorithmChain cameraAlgorithmChain = this.mLiveChainOfAlgorithm;
        if (cameraAlgorithmChain != null) {
            cameraAlgorithmChain.startCameraAlgorithm(getLiveOneKeyProcessParam());
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void stopCameraRhythmAlgorithm() {
        CameraAlgorithmChain cameraAlgorithmChain = this.mLiveChainOfAlgorithm;
        if (cameraAlgorithmChain != null) {
            cameraAlgorithmChain.stopCameraAlgorithm(1);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void stopLiveOneKeyProcess() {
        CameraAlgorithmChain cameraAlgorithmChain = this.mLiveChainOfAlgorithm;
        if (cameraAlgorithmChain != null) {
            cameraAlgorithmChain.stopCameraAlgorithm(2);
        }
    }

    public void tryInitCameraAlgorithm() {
        final CameraLensCallbackWrapper cameraLensCallbackWrapper;
        final CameraAlgorithmParamWrapper cameraAlgorithmParamWrapper = this.mDetectParamsWrapper;
        if (cameraAlgorithmParamWrapper == null || (cameraLensCallbackWrapper = this.mWrapperCallback) == null) {
            return;
        }
        this.lensDetectFlag = true;
        final TECameraCapture tECameraCapture = this.mCapture;
        this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.28
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$28__run$___twin___() {
                CameraAlgorithmParamWrapper cameraAlgorithmParamWrapper2 = cameraAlgorithmParamWrapper;
                if (cameraAlgorithmParamWrapper2 == null || cameraAlgorithmParamWrapper2.type != 1024) {
                    return;
                }
                TETaintSceneDetectParams tETaintSceneDetectParams = new TETaintSceneDetectParams();
                tETaintSceneDetectParams.modelPath = ((TaintSceneDetectParamsWrapper) cameraAlgorithmParamWrapper2).modelPath;
                tETaintSceneDetectParams.kernelBinPath = "";
                if (tECameraCapture != null) {
                    AVLog.ioi("CameraVideoCapturer", "addCameraAlgorithm -->");
                    tECameraCapture.addCameraAlgorithm(tETaintSceneDetectParams);
                }
                if (tECameraCapture == null) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setLensCallback -->");
                LIZ.append(C16880lQ.LLLLIIIILLL().toString());
                AVLog.ioi("CameraVideoCapturer", X1D.LIZIZ(LIZ));
                tECameraCapture.setLensCallback(new InterfaceC63917P6r() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.28.1
                    @Override // X.InterfaceC63917P6r
                    public void onError(int i, int i2, String str) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("TECameraLensCallback onError -->");
                        LIZ2.append(str);
                        AVLog.ioi("CameraVideoCapturer", X1D.LIZIZ(LIZ2));
                        CameraLensCallbackWrapper cameraLensCallbackWrapper2 = cameraLensCallbackWrapper;
                        if (cameraLensCallbackWrapper2 != null) {
                            cameraLensCallbackWrapper2.onError(i, i2, str);
                        }
                    }

                    @Override // X.InterfaceC63917P6r
                    public void onSuccess(int i, float f, int i2) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("TECameraLensCallback onSuccess -->");
                        LIZ2.append(f);
                        AVLog.ioi("CameraVideoCapturer", X1D.LIZIZ(LIZ2));
                        CameraLensCallbackWrapper cameraLensCallbackWrapper2 = cameraLensCallbackWrapper;
                        if (cameraLensCallbackWrapper2 != null) {
                            cameraLensCallbackWrapper2.onSuccess(i, f, i2);
                        }
                    }

                    @Override // X.InterfaceC63917P6r
                    public void onInfo(int i, int i2, int i3, String str) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("TECameraLensCallback onInfo -->");
                        LIZ2.append(str);
                        AVLog.ioi("CameraVideoCapturer", X1D.LIZIZ(LIZ2));
                        CameraLensCallbackWrapper cameraLensCallbackWrapper2 = cameraLensCallbackWrapper;
                        if (cameraLensCallbackWrapper2 != null) {
                            cameraLensCallbackWrapper2.onInfo(i, i2, i3, str);
                        }
                    }
                });
                CameraVideoCapturer.this.markProcessTaintScene();
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass28 anonymousClass28) {
                boolean LIZ;
                try {
                    anonymousClass28.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$28__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        this.mDetectParamsWrapper = null;
        this.mWrapperCallback = null;
    }

    private void resetCameraState() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resetCameraState mCameraSizeOptEnable:");
        LIZ.append(this.mCameraSizeOptEnable);
        AVLog.logKibana(4, "CameraVideoCapturer", X1D.LIZIZ(LIZ), null);
        if (this.mCameraSizeOptEnable) {
            this.mStashParam = null;
            this.mCameraUpdating.set(false);
            this.mSupportPreviewSizes = null;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public float getInCaptureRealFps() {
        return getInCapFps();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public long getAverageExposureTime() {
        return this.mAverageExposureTime;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public long getAvgFps() {
        return this.mAvgFps;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public double getCameraAvgCaptureResultFps() {
        return this.mAvgCaptureResultFps;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int getCameraCaptureHeight() {
        return this.mCapturedFrameHeight;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int getCameraCaptureWidth() {
        return this.mCapturedFrameWidth;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public long getISOInfo() {
        return this.mIsoInfo;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public String getRealCameraFpsRangeStr() {
        return this.mCamFpsRangeStr;
    }

    /* loaded from: classes12.dex */
    public class PushFrameRequest {
        public Runnable runnable;
        public int texID;

        public PushFrameRequest() {
        }
    }

    private void checkCameraFeatures(boolean z) {
        StringBuilder LIZ;
        try {
            if (!z) {
                LIZ = X1D.LIZ();
                LIZ.append(this.mCameraType);
                LIZ.append("_");
                LIZ.append(this.mCameraFacing);
            } else {
                LIZ = X1D.LIZ();
                LIZ.append(this.mSettings.LJLILLLLZI);
                LIZ.append("_");
                LIZ.append(this.mSettings.LJLJJI);
            }
            String LIZIZ = X1D.LIZIZ(LIZ);
            Map<String, Bundle> map = CAMERA_FEATURES;
            if (map.get(LIZIZ) == null) {
                if (!z) {
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("camera_support_fps_range", "");
                this.mCapture.queryFeatures(bundle);
                map.put(LIZIZ, bundle);
            } else if (z) {
                return;
            }
            Bundle bundle2 = map.get(LIZIZ);
            if (bundle2 == null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CAMERA_FEATURES[\"");
                LIZ2.append(LIZIZ);
                LIZ2.append("\"] is null.");
                AVLog.ioe("CameraVideoCapturer", X1D.LIZIZ(LIZ2));
                return;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("Feature of ");
            LIZ3.append(LIZIZ);
            LIZ3.append("(type_facing): ");
            LIZ3.append(bundle2);
            AVLog.iow("CameraVideoCapturer", X1D.LIZIZ(LIZ3));
            checkResetFpsRange(z, bundle2);
        } catch (Exception e) {
            AVLog.logToIODevice(6, "CameraVideoCapturer", "queryFeatures fail. ", e);
        }
    }

    private long getTimeStamp(long j) {
        if (this.mUsingNewTimeStamp) {
            return j * 1000;
        }
        long timestamp = this.mSurfaceTexture.getTimestamp() / 1000;
        long j2 = this.mTimeStampDiffUs + timestamp;
        long j3 = this.mLastTimeStampUs;
        if (j2 < j3) {
            j2 = (j3 - timestamp) + (1000 / this.mFps) + timestamp;
            this.mTimeStampDiffUs = 0L;
        }
        this.mLastTimeStampUs = j2;
        return j2;
    }

    private void reportSettings(long j) {
        boolean z;
        TEFrameRateRange tEFrameRateRange = this.mSettings.LJLJI;
        int i = tEFrameRateRange.min;
        int i2 = tEFrameRateRange.fpsUnitFactor;
        int[] iArr = {i / i2, tEFrameRateRange.max / i2};
        JSONObject jSONObject = new JSONObject();
        long j2 = j - this.mOpenCameraTimestamp;
        try {
            jSONObject.put("CameraFirstFrameTime(ms)", j2);
            if (!isBackCam()) {
                z = true;
            } else {
                z = false;
            }
            jSONObject.put("IsFrontCamera", z);
            jSONObject.put("CameraType", this.mCameraType);
            jSONObject.put("DestFps", this.mDestFps);
            jSONObject.put("FpsRangeStart", iArr[0]);
            jSONObject.put("FpsRangeEnd", iArr[1]);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(iArr[0]);
            LIZ.append(",");
            LIZ.append(iArr[1]);
            jSONObject.put("FpsRange", X1D.LIZIZ(LIZ));
            jSONObject.put("params", this.mParams);
        } catch (Exception unused) {
        }
        AVLog.logKibana(4, "CameraVideoCapturer", jSONObject.toString(), null);
        reportFirstFrame(this, j2, true);
    }

    @Override // X.P3Q
    public TEFrameSizei getPreviewSize(List<TEFrameSizei> list) {
        int i;
        int i2;
        int i3;
        if (this.mSupportPreviewSizes == null) {
            ArrayList arrayList = new ArrayList();
            this.mSupportPreviewSizes = arrayList;
            arrayList.addAll(list);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Camera supportPreviewSizes:");
            LIZ.append(this.mSupportPreviewSizes.toString());
            AVLog.ioi("CameraVideoCapturer", X1D.LIZIZ(LIZ));
        }
        TEFrameSizei adaptedFrameSize = FrameSizeAdapter.getAdaptedFrameSize(list, this.mCameraCaptureWidth, this.mCameraCaptureHeight, this.mChooseBestCaptureResolution);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Calling getPreviewSize getAdaptedFrameSize:");
        LIZ2.append(this.mCameraCaptureWidth);
        LIZ2.append(" mCameraCaptureHeight:");
        LIZ2.append(this.mCameraCaptureHeight);
        LIZ2.append(" chosen size:");
        LIZ2.append(adaptedFrameSize);
        LIZ2.append(" mChooseBestCaptureResolution:");
        LIZ2.append(this.mChooseBestCaptureResolution);
        AVLog.logKibana(4, "CameraVideoCapturer", X1D.LIZIZ(LIZ2), null);
        if (adaptedFrameSize != null) {
            int i4 = this.mCameraCaptureWidth;
            int i5 = adaptedFrameSize.width;
            if (i4 != i5 || (i2 = this.mCameraCaptureHeight) != adaptedFrameSize.height) {
                this.mCameraCaptureWidth = i5;
                int i6 = adaptedFrameSize.height;
                this.mCameraCaptureHeight = i6;
                boolean z = this.mExchangedResolution;
                if (z) {
                    i = i6;
                } else {
                    i = i5;
                }
                this.mOutWidth = i;
                if (!z) {
                    i5 = i6;
                }
                this.mOutHeight = i5;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Calling getPreviewSize and get default resolution:");
                LIZ3.append(this.mOutWidth);
                LIZ3.append("x");
                LIZ3.append(this.mOutHeight);
                AVLog.iow("CameraVideoCapturer", X1D.LIZIZ(LIZ3));
                this.mObserver.onVideoCaptureInfo(2, this.mOutWidth, this.mOutHeight, "Capture Resolution Changed.");
            } else {
                boolean z2 = this.mExchangedResolution;
                if (z2) {
                    i3 = i2;
                } else {
                    i3 = i4;
                }
                this.mOutWidth = i3;
                if (!z2) {
                    i4 = i2;
                }
                this.mOutHeight = i4;
            }
            this.mObserver.onVideoCaptureInfo(3, adaptedFrameSize.width, adaptedFrameSize.height, "Camera Size Changed!");
        }
        return adaptedFrameSize;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.CameraObserver, X.YR1
    public void onCaptureStopped(final int i) {
        this.mCapturedFrameWidth = -1;
        this.mCapturedFrameHeight = -1;
        this.mCameraType = -1;
        this.mAvgCaptureResultFps = -1.0d;
        this.mCamFpsRangeStr = "";
        try {
            this.mThreadChecker.checkIsOnValidThread();
            if (this.mProviderSettings != null) {
                this.mProviderSettings = null;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onCaptureStopped ");
            LIZ.append(i);
            AVLog.ioi("CameraVideoCapturer", X1D.LIZIZ(LIZ));
            super.stop();
        } catch (Throwable unused) {
            if (!this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.18
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$18__run$___twin___() {
                    CameraVideoCapturer.this.onCaptureStopped(i);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass18 anonymousClass18) {
                    boolean LIZ2;
                    try {
                        anonymousClass18.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$18__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            }) && this.mEnableCallBackStop) {
                super.stop();
            }
        }
    }

    @Override // X.P7P
    public void onFrameCaptured(P6E p6e) {
        boolean z;
        TEFrameSizei tEFrameSizei = p6e.LJII.LIZ;
        this.mCapturedFrameWidth = tEFrameSizei.width;
        this.mCapturedFrameHeight = tEFrameSizei.height;
        long currentTimeMs = TimeUtils.currentTimeMs();
        ScopeMonitor.CalcElapse(1, currentTimeMs, currentTimeMs);
        VideoCapturer.VideoCapturerObserver videoCapturerObserver = this.mObserver;
        if (videoCapturerObserver != null) {
            videoCapturerObserver.onVideoCaptureInfo(4, 0, 0, String.valueOf(currentTimeMs));
        }
        this.mLastCameraCaptrueTimeStampMs = currentTimeMs;
        if (!this.mGotFirstFrame) {
            this.mGotFirstFrame = true;
            updateDisplayRotation();
            CameraAlgorithmChain cameraAlgorithmChain = this.mLiveChainOfAlgorithm;
            LiveAlgorithmParam.RhythmicMotion rhythmicMotion = this.mLiveTransParam;
            if (rhythmicMotion != null && rhythmicMotion.isOpenRhythm() && cameraAlgorithmChain != null) {
                cameraAlgorithmChain.startCameraAlgorithm(this.mLiveTransParam);
            }
            LiveAlgorithmParam.RhythmicMotion rhythmicMotion2 = this.mLiveTransParam;
            if (rhythmicMotion2 != null && rhythmicMotion2.isOpenOneKeyProcess() && cameraAlgorithmChain != null) {
                cameraAlgorithmChain.startCameraAlgorithm(getLiveOneKeyProcessParam());
            }
            reportSettings(currentTimeMs);
        }
        if (!this.lensDetectFlag) {
            tryInitCameraAlgorithm();
        }
        AVLog2.logToIODevice2(5, "CameraVideoCapturer", "TECameraProvider onFrameCaptured", null, 15, 10000);
        if (this.mVideoFrameDumper != null) {
            if (this.mStatus != 1 || !this.mBufferAlreadyReturn) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("mStatus ");
                LIZ.append(this.mStatus);
                LIZ.append(", !mBufferAlreadyReturn");
                LIZ.append(true ^ this.mBufferAlreadyReturn);
                AVLog2.logToIODevice2(5, "CameraVideoCapturer", i0.LJFF("CameraVideoCapturer.tryDeliverYuvFrame return: ", X1D.LIZIZ(LIZ)), null, 16, 10000);
                return;
            }
            int i = this.mDisplayRotation;
            if (i == 1 || i == 3) {
                z = true;
            } else {
                z = false;
            }
            this.mVideoFrameDumper.onYuvFrame(p6e, currentTimeMs, z, this.mHorizontalMirror, this.mVerticalMirror);
        } else {
            onTextureFrame(p6e, currentTimeMs);
        }
        VideoFrameStatics videoFrameStatics = this.mRealRateStatics;
        if (videoFrameStatics != null) {
            videoFrameStatics.add();
        }
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer
    public void returnTexture(int i) {
        DebugLogUtils.isEnableDebugLog();
        GlTextureFrameBuffer glTextureFrameBuffer = this.mOesProcessFrameBuffer1;
        if (glTextureFrameBuffer != null && i == glTextureFrameBuffer.getTextureId()) {
            if (!this.mOesProcessFrameBuffer1Using) {
                DebugLogUtils.isEnableDebugLog();
            }
            this.mOesProcessFrameBuffer1Using = false;
        } else {
            GlTextureFrameBuffer glTextureFrameBuffer2 = this.mOesProcessFrameBuffer2;
            if (glTextureFrameBuffer2 != null && i == glTextureFrameBuffer2.getTextureId()) {
                if (!this.mOesProcessFrameBuffer2Using) {
                    DebugLogUtils.isEnableDebugLog();
                }
                this.mOesProcessFrameBuffer2Using = false;
            } else {
                DebugLogUtils.isEnableDebugLog();
            }
        }
        PushFrameRequest pushFrameRequest = this.mPendingRequest;
        if (pushFrameRequest != null) {
            GlTextureFrameBuffer glTextureFrameBuffer3 = this.mOesProcessFrameBuffer1;
            if (glTextureFrameBuffer3 != null && pushFrameRequest.texID == glTextureFrameBuffer3.getTextureId()) {
                this.mOesProcessFrameBuffer1Using = true;
                this.mHandler.post(this.mPendingRequest.runnable);
            } else {
                GlTextureFrameBuffer glTextureFrameBuffer4 = this.mOesProcessFrameBuffer2;
                if (glTextureFrameBuffer4 != null && this.mPendingRequest.texID == glTextureFrameBuffer4.getTextureId()) {
                    this.mOesProcessFrameBuffer2Using = true;
                    this.mHandler.post(this.mPendingRequest.runnable);
                } else {
                    DebugLogUtils.isEnableDebugLog();
                }
            }
            DebugLogUtils.isEnableDebugLog();
            this.mPendingRequest = null;
            return;
        }
        DebugLogUtils.isEnableDebugLog();
        if (this.mStatus != 1 || !this.mNewTexture) {
            return;
        }
        tryDeliverFrame(this.mLastCameraCaptrueTimeStampMs, Math.max(TimeUtils.currentTimeMs(), this.mNextDeliverFrameTime), false);
    }

    public void setDumpFrameParams(JSONObject jSONObject) {
        VideoFrameDumper videoFrameDumper = this.mVideoFrameDumper;
        if (videoFrameDumper != null) {
            videoFrameDumper.setDumpFrameParams(jSONObject);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int setExposureCompensation(float f) {
        TECameraCapture tECameraCapture;
        final int[] iArr = {-1};
        IVideoCapturerControl.Range exposureCompensationRange = getExposureCompensationRange();
        if (exposureCompensationRange != null && ((f <= exposureCompensationRange.max || f >= exposureCompensationRange.min) && (tECameraCapture = this.mCapture) != null)) {
            try {
                this.mISPExposureStatus = true;
                tECameraCapture.setExposureCompensation((int) f);
                postAndWait(this.mHandler, 1000L, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.23
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$23__run$___twin___() {
                        int i;
                        int[] iArr2 = iArr;
                        if (CameraVideoCapturer.this.mISPExposureStatus) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        iArr2[0] = i;
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass23 anonymousClass23) {
                        boolean LIZ;
                        try {
                            anonymousClass23.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$23__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
                return -1;
            }
        }
        return iArr[0];
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void setLensCallback(CameraLensCallbackWrapper cameraLensCallbackWrapper) {
        this.mWrapperCallback = cameraLensCallbackWrapper;
    }

    public void setOpenAlgorithm(LiveAlgorithmParam.RhythmicMotion rhythmicMotion) {
        this.mLiveTransParam = rhythmicMotion;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void startCameraRhythmAlgorithm(LiveAlgorithmParam.RhythmicMotion rhythmicMotion) {
        CameraAlgorithmChain cameraAlgorithmChain = this.mLiveChainOfAlgorithm;
        if (cameraAlgorithmChain != null) {
            cameraAlgorithmChain.startCameraAlgorithm(rhythmicMotion);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int toggleFlashLight(boolean z) {
        final int[] iArr = {-1};
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            try {
                this.mISPToggleStatus = true;
                tECameraCapture.toggleTorch(z);
                postAndWait(this.mHandler, 1000L, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.22
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$22__run$___twin___() {
                        int i;
                        int[] iArr2 = iArr;
                        if (CameraVideoCapturer.this.mISPToggleStatus) {
                            i = 0;
                        } else {
                            i = -1;
                        }
                        iArr2[0] = i;
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass22 anonymousClass22) {
                        boolean LIZ;
                        try {
                            anonymousClass22.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$22__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
                return iArr[0];
            }
        }
        return iArr[0];
    }

    public boolean tryProcessTaintSceneAlgorithm(P6E p6e) {
        if (p6e.LJII.LIZIZ != EnumC63901P6b.PIXEL_FORMAT_OpenGL_OES) {
            DebugLogUtils.isEnableDebugLog();
            return false;
        }
        if (this.isTaintSceneAlgoOnWork.get()) {
            if (this.taintSceneAlgoCount.get() < 14) {
                this.taintSceneAlgoCount.getAndIncrement();
                System.currentTimeMillis();
                this.mFrame = this.mCapture.processAlgorithm(p6e);
                DebugLogUtils.isEnableDebugLog();
                return true;
            }
            markTaintSceneDone();
        }
        return false;
    }

    private void checkResetFpsRange(boolean z, Bundle bundle) {
        String str;
        String str2;
        try {
            int i = this.mDestFps;
            if (i <= 0) {
                return;
            }
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("camera_support_fps_range");
            if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                AVLog.ioe("CameraVideoCapturer", "TECameraCapture query CAMERA_SUPPORT_FPS_RANGE get null.");
                return;
            }
            TEFrameRateRange tEFrameRateRange = this.mSettings.LJLJI;
            String str3 = "";
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                TEFrameRateRange tEFrameRateRange2 = (TEFrameRateRange) it.next();
                int i2 = tEFrameRateRange2.max;
                int i3 = tEFrameRateRange2.fpsUnitFactor;
                int i4 = i2 / i3;
                int i5 = tEFrameRateRange2.min / i3;
                int i6 = tEFrameRateRange.max / i3;
                if (i4 >= i && (compareFpsRange(tEFrameRateRange2, tEFrameRateRange) < 0 || (this.mFixFpsRangeCompareBug && i6 < i))) {
                    tEFrameRateRange = new TEFrameRateRange(i5, i4);
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str3);
                if (str3.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = ", ";
                }
                LIZ.append(str2);
                LIZ.append("(");
                LIZ.append(i5);
                LIZ.append(", ");
                LIZ.append(i4);
                LIZ.append(")");
                str3 = X1D.LIZIZ(LIZ);
            }
            if (compareFpsRange(tEFrameRateRange, this.mSettings.LJLJI) != 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Dest fps: ");
                LIZ2.append(this.mDestFps);
                LIZ2.append(". Fps range list: [");
                LIZ2.append(str3);
                LIZ2.append("]. mCapture.setPreviewFpsRange(");
                LIZ2.append(tEFrameRateRange.min);
                LIZ2.append(", ");
                LIZ2.append(tEFrameRateRange.max);
                LIZ2.append(")");
                if (!z) {
                    str = " before ";
                } else {
                    str = " after ";
                }
                LIZ2.append(str);
                LIZ2.append("open camera.");
                AVLog.iow("CameraVideoCapturer", X1D.LIZIZ(LIZ2));
                synchronized (this.mObject) {
                    this.mSettings.LJLJI = tEFrameRateRange;
                    if (z) {
                        this.mCapture.setPreviewFpsRange(tEFrameRateRange);
                    }
                    this.mFps = tEFrameRateRange.max;
                }
            }
        } catch (Exception unused) {
        }
    }

    private int compareFpsRange(TEFrameRateRange tEFrameRateRange, TEFrameRateRange tEFrameRateRange2) {
        int i = tEFrameRateRange.max;
        int i2 = tEFrameRateRange.fpsUnitFactor;
        int i3 = i / i2;
        int i4 = tEFrameRateRange.min / i2;
        int i5 = tEFrameRateRange2.max;
        int i6 = tEFrameRateRange2.fpsUnitFactor;
        int i7 = i5 / i6;
        int i8 = tEFrameRateRange2.min / i6;
        if (i3 != i7) {
            return i3 - i7;
        }
        return i4 - i8;
    }

    private void onTextureFrame(final P6E p6e, final long j) {
        int i;
        if (!isCamera2Like()) {
            P3Y p3y = p6e.LJII;
            int i2 = p3y.LIZLLL;
            if (p3y.LJ != 0 && this.mDisplayRotation != 0) {
                i2 = (i2 + 180) % 360;
            }
            this.mRotation = i2;
        } else {
            int i3 = this.mDisplayRotation;
            if (i3 == 1 || i3 == 3) {
                i = (i3 - 2) * 90;
            } else if (i3 == 2) {
                i = 180;
            } else {
                i = 0;
            }
            this.mRotation = i;
        }
        if (this.mNeedOesTo2D) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mOesTo2DThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.14
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$14__run$___twin___() {
                    CameraVideoCapturer cameraVideoCapturer = CameraVideoCapturer.this;
                    if (cameraVideoCapturer.mOesTo2DFrameDrawer == null) {
                        cameraVideoCapturer.mOesTo2DFrameDrawer = new GlRenderDrawer();
                    }
                    CameraVideoCapturer cameraVideoCapturer2 = CameraVideoCapturer.this;
                    if (cameraVideoCapturer2.mOesTo2DFrameBuffer == null) {
                        cameraVideoCapturer2.mOesTo2DFrameBuffer = new GlTextureFrameBuffer(6408);
                        CameraVideoCapturer cameraVideoCapturer3 = CameraVideoCapturer.this;
                        cameraVideoCapturer3.mOesTo2DFrameBuffer.setSize(cameraVideoCapturer3.mOutWidth, cameraVideoCapturer3.mOutHeight);
                    }
                    CameraVideoCapturer cameraVideoCapturer4 = CameraVideoCapturer.this;
                    if (cameraVideoCapturer4.mBackupFrameBuffer == null) {
                        cameraVideoCapturer4.mBackupFrameBuffer = new GlTextureFrameBuffer(6408);
                        CameraVideoCapturer cameraVideoCapturer5 = CameraVideoCapturer.this;
                        cameraVideoCapturer5.mBackupFrameBuffer.setSize(cameraVideoCapturer5.mOutWidth, cameraVideoCapturer5.mOutHeight);
                    }
                    try {
                        SurfaceTexture surfaceTexture = CameraVideoCapturer.this.mSurfaceTexture;
                        if (surfaceTexture != null) {
                            surfaceTexture.updateTexImage();
                        }
                        CameraVideoCapturer.this.tryProcessTaintSceneAlgorithm(p6e);
                        ScopeMonitor.CalcElapse(4, j, TimeUtils.currentTimeMs());
                        CameraVideoCapturer cameraVideoCapturer6 = CameraVideoCapturer.this;
                        SurfaceTexture surfaceTexture2 = cameraVideoCapturer6.mSurfaceTexture;
                        if (surfaceTexture2 != null) {
                            surfaceTexture2.getTransformMatrix(cameraVideoCapturer6.mTexMatrix);
                        }
                        final long nativeNanoTime = TimeUtils.nativeNanoTime() / 1000;
                        try {
                            if ((CameraVideoCapturer.this.useBackupBuffer && !CameraVideoCapturer.this.mBufferAlreadyReturn) || (!CameraVideoCapturer.this.useBackupBuffer && CameraVideoCapturer.this.mBufferAlreadyReturn)) {
                                CameraVideoCapturer cameraVideoCapturer7 = CameraVideoCapturer.this;
                                cameraVideoCapturer7.mOesTo2DFrameBuffer.setSize(cameraVideoCapturer7.mOutWidth, cameraVideoCapturer7.mOutHeight);
                                GLES20.glBindFramebuffer(36160, CameraVideoCapturer.this.mOesTo2DFrameBuffer.getFrameBufferId());
                                CameraVideoCapturer.this.useBackupBuffer = false;
                            } else if ((CameraVideoCapturer.this.useBackupBuffer && CameraVideoCapturer.this.mBufferAlreadyReturn) || (!CameraVideoCapturer.this.useBackupBuffer && !CameraVideoCapturer.this.mBufferAlreadyReturn)) {
                                CameraVideoCapturer cameraVideoCapturer8 = CameraVideoCapturer.this;
                                cameraVideoCapturer8.mBackupFrameBuffer.setSize(cameraVideoCapturer8.mOutWidth, cameraVideoCapturer8.mOutHeight);
                                GLES20.glBindFramebuffer(36160, CameraVideoCapturer.this.mBackupFrameBuffer.getFrameBufferId());
                                CameraVideoCapturer.this.useBackupBuffer = true;
                            }
                            Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(CameraVideoCapturer.this.mTexMatrix);
                            convertMatrixToAndroidGraphicsMatrix.preTranslate(0.5f, 0.5f);
                            convertMatrixToAndroidGraphicsMatrix.preScale(1.0f, -1.0f);
                            convertMatrixToAndroidGraphicsMatrix.preTranslate(-0.5f, -0.5f);
                            float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix);
                            CameraVideoCapturer cameraVideoCapturer9 = CameraVideoCapturer.this;
                            cameraVideoCapturer9.mOesTo2DFrameDrawer.drawOes(cameraVideoCapturer9.mOesTex, null, convertMatrixFromAndroidGraphicsMatrix, 0, 0, cameraVideoCapturer9.mOutWidth, cameraVideoCapturer9.mOutHeight);
                            if (GLThreadManager.isNeedFinish()) {
                                GLES20.glFinish();
                            } else {
                                GLES20.glFlush();
                            }
                            GlUtil.checkNoGLES2Error("checkGlError drawOes");
                            GLES20.glBindFramebuffer(36160, 0);
                        } catch (Exception e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("GlError drawOes: ");
                            LIZ.append(e.toString());
                            AVLog.ioe("CameraVideoCapturer", X1D.LIZIZ(LIZ));
                        }
                        ScopeMonitor.CalcElapse(2, j, TimeUtils.currentTimeMs());
                        CameraVideoCapturer.this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.14.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$14$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                            }

                            public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$14$1__run$___twin___() {
                                CameraVideoCapturer cameraVideoCapturer10;
                                GlTextureFrameBuffer glTextureFrameBuffer;
                                CameraVideoCapturer cameraVideoCapturer11;
                                GlTextureFrameBuffer glTextureFrameBuffer2;
                                float f;
                                CameraVideoCapturer cameraVideoCapturer12;
                                GlTextureFrameBuffer glTextureFrameBuffer3;
                                CameraVideoCapturer cameraVideoCapturer13;
                                GlTextureFrameBuffer glTextureFrameBuffer4;
                                ScopeMonitor.CalcElapse(3, j, TimeUtils.currentTimeMs());
                                Matrix matrix = new Matrix();
                                if (CameraVideoCapturer.this.isCamera2Like()) {
                                    matrix.preTranslate(0.5f, 0.5f);
                                    matrix.preRotate(CameraVideoCapturer.this.mRotation);
                                    CameraVideoCapturer cameraVideoCapturer14 = CameraVideoCapturer.this;
                                    float f2 = -1.0f;
                                    if (cameraVideoCapturer14.mHorizontalMirror) {
                                        f = -1.0f;
                                    } else {
                                        f = 1.0f;
                                    }
                                    if (!cameraVideoCapturer14.mVerticalMirror) {
                                        f2 = 1.0f;
                                    }
                                    matrix.preScale(f, f2);
                                    matrix.preTranslate(-0.5f, -0.5f);
                                    matrix.postConcat(RendererCommon.convertMatrixToAndroidGraphicsMatrix(CameraVideoCapturer.this.mTexMatrix));
                                    if (CameraVideoCapturer.this.useBackupBuffer && (glTextureFrameBuffer4 = (cameraVideoCapturer13 = CameraVideoCapturer.this).mBackupFrameBuffer) != null) {
                                        int textureId = glTextureFrameBuffer4.getTextureId();
                                        AnonymousClass14 anonymousClass14 = AnonymousClass14.this;
                                        CameraVideoCapturer cameraVideoCapturer15 = CameraVideoCapturer.this;
                                        cameraVideoCapturer13.pushVideoFrame(textureId, false, cameraVideoCapturer15.mOutWidth, cameraVideoCapturer15.mOutHeight, matrix, nativeNanoTime, (Bundle) null, j);
                                        return;
                                    }
                                    if (CameraVideoCapturer.this.useBackupBuffer || (glTextureFrameBuffer3 = (cameraVideoCapturer12 = CameraVideoCapturer.this).mOesTo2DFrameBuffer) == null) {
                                        return;
                                    }
                                    int textureId2 = glTextureFrameBuffer3.getTextureId();
                                    AnonymousClass14 anonymousClass142 = AnonymousClass14.this;
                                    CameraVideoCapturer cameraVideoCapturer16 = CameraVideoCapturer.this;
                                    cameraVideoCapturer12.pushVideoFrame(textureId2, false, cameraVideoCapturer16.mOutWidth, cameraVideoCapturer16.mOutHeight, matrix, nativeNanoTime, (Bundle) null, j);
                                    return;
                                }
                                if (CameraVideoCapturer.this.useBackupBuffer && (glTextureFrameBuffer2 = (cameraVideoCapturer11 = CameraVideoCapturer.this).mBackupFrameBuffer) != null) {
                                    int textureId3 = glTextureFrameBuffer2.getTextureId();
                                    AnonymousClass14 anonymousClass143 = AnonymousClass14.this;
                                    CameraVideoCapturer cameraVideoCapturer17 = CameraVideoCapturer.this;
                                    cameraVideoCapturer11.pushVideoFrame(textureId3, false, cameraVideoCapturer17.mOutWidth, cameraVideoCapturer17.mOutHeight, cameraVideoCapturer17.mRotation, cameraVideoCapturer17.mTexMatrix, nativeNanoTime, null, j);
                                    return;
                                }
                                if (CameraVideoCapturer.this.useBackupBuffer || (glTextureFrameBuffer = (cameraVideoCapturer10 = CameraVideoCapturer.this).mOesTo2DFrameBuffer) == null) {
                                    return;
                                }
                                int textureId4 = glTextureFrameBuffer.getTextureId();
                                AnonymousClass14 anonymousClass144 = AnonymousClass14.this;
                                CameraVideoCapturer cameraVideoCapturer18 = CameraVideoCapturer.this;
                                cameraVideoCapturer10.pushVideoFrame(textureId4, false, cameraVideoCapturer18.mOutWidth, cameraVideoCapturer18.mOutHeight, cameraVideoCapturer18.mRotation, cameraVideoCapturer18.mTexMatrix, nativeNanoTime, null, j);
                            }

                            public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$14$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                                boolean LIZ2;
                                try {
                                    anonymousClass1.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$14$1__run$___twin___();
                                } finally {
                                    if (LIZ2) {
                                    }
                                }
                            }
                        });
                    } catch (Throwable th) {
                        TTLSSladarBugReportUtils.getInstance().report(th, "CameraVideoCapturer.onTextureFrame");
                        String message = th.getMessage();
                        if (TTLSBuildConfig.canThrowException()) {
                            if (EGL14.eglGetCurrentDisplay() == EGL14.EGL_NO_DISPLAY) {
                                StringBuilder LIZJ = b1.LIZJ(message, ";;;Error egl dpy env, code:");
                                LIZJ.append(EGL14.eglGetError());
                                message = X1D.LIZIZ(LIZJ);
                            }
                            if (EGL14.eglGetCurrentContext() == EGL14.EGL_NO_CONTEXT) {
                                StringBuilder LIZIZ = C25620zW.LIZIZ(message, ";;;", "Error egl ctx env, code:");
                                LIZIZ.append(EGL14.eglGetError());
                                message = X1D.LIZIZ(LIZIZ);
                            }
                            throw new AndroidRuntimeException(message);
                        }
                        AVLog2.logToIODevice2(6, "CameraVideoCapturer", message, null, 17, 10000);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
                    boolean LIZ;
                    try {
                        anonymousClass14.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$14__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
            return;
        }
        long currentTimeMs = TimeUtils.currentTimeMs();
        ScopeMonitor.CalcElapse(2, j, currentTimeMs);
        tryDeliverFrameWithTimeStamp(p6e, j, currentTimeMs);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public void addCameraAlgorithm(CameraAlgorithmParamWrapper cameraAlgorithmParamWrapper, boolean z) {
        this.mDetectParamsWrapper = cameraAlgorithmParamWrapper;
        if (z) {
            this.lensDetectFlag = false;
        }
    }

    public boolean copyCurrentFrame(final GlRenderDrawer glRenderDrawer, final GlTextureFrameBuffer glTextureFrameBuffer) {
        Handler handler;
        final boolean[] zArr = {false};
        if (this.mNeedOesTo2D) {
            handler = this.mOesTo2DThreadHandler;
        } else {
            handler = this.mHandler;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.8
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$8__run$___twin___() {
                GlTextureFrameBuffer glTextureFrameBuffer2;
                if (CameraVideoCapturer.this.mOesTex <= 0 || glRenderDrawer == null || (glTextureFrameBuffer2 = glTextureFrameBuffer) == null || glTextureFrameBuffer2.getFrameBufferId() <= 0) {
                    return;
                }
                if (glTextureFrameBuffer.getWidth() != CameraVideoCapturer.this.mOutWidth || glTextureFrameBuffer.getHeight() != CameraVideoCapturer.this.mOutHeight) {
                    try {
                        GlTextureFrameBuffer glTextureFrameBuffer3 = glTextureFrameBuffer;
                        CameraVideoCapturer cameraVideoCapturer = CameraVideoCapturer.this;
                        glTextureFrameBuffer3.setSize(cameraVideoCapturer.mOutWidth, cameraVideoCapturer.mOutHeight);
                    } catch (Exception e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("frameBuffer setSize failed (");
                        LIZ.append(e.getMessage());
                        LIZ.append(") w ");
                        LIZ.append(CameraVideoCapturer.this.mOutWidth);
                        LIZ.append(" h ");
                        LIZ.append(CameraVideoCapturer.this.mOutHeight);
                        AVLog.e("CameraVideoCapturer", X1D.LIZIZ(LIZ));
                        return;
                    }
                }
                Matrix convertMatrixToAndroidGraphicsMatrix = RendererCommon.convertMatrixToAndroidGraphicsMatrix(CameraVideoCapturer.this.mTexMatrix);
                if (CameraVideoCapturer.this.isCamera2Like()) {
                    CameraVideoCapturer cameraVideoCapturer2 = CameraVideoCapturer.this;
                    cameraVideoCapturer2.mRotation = 0;
                    int i = cameraVideoCapturer2.mDisplayRotation;
                    if (i == 1 || i == 3) {
                        int i2 = (i - 2) * 90;
                        cameraVideoCapturer2.mRotation = i2;
                        cameraVideoCapturer2.mRotation = (i2 + 180) % 360;
                    } else if (i == 2) {
                        cameraVideoCapturer2.mRotation = 180;
                    }
                }
                if (CameraVideoCapturer.this.mRotation != 0) {
                    Matrix matrix = new Matrix();
                    matrix.reset();
                    matrix.preTranslate(0.5f, 0.5f);
                    matrix.preRotate(-CameraVideoCapturer.this.mRotation);
                    matrix.preTranslate(-0.5f, -0.5f);
                    if (convertMatrixToAndroidGraphicsMatrix != null) {
                        if (CameraVideoCapturer.this.isCamera2Like()) {
                            matrix.postConcat(convertMatrixToAndroidGraphicsMatrix);
                        } else {
                            matrix.preConcat(convertMatrixToAndroidGraphicsMatrix);
                        }
                    }
                    convertMatrixToAndroidGraphicsMatrix = matrix;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("CopyFrame CameraType ");
                LIZ2.append(CameraVideoCapturer.this.mSettings.LJLILLLLZI);
                LIZ2.append(" mRotation ");
                LIZ2.append(CameraVideoCapturer.this.mRotation);
                LIZ2.append(" dpyRotation ");
                LIZ2.append(CameraVideoCapturer.this.mDisplayRotation);
                AVLog.iod("CameraVideoCapturer", X1D.LIZIZ(LIZ2));
                float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(convertMatrixToAndroidGraphicsMatrix);
                try {
                    GLES20.glBindFramebuffer(36160, glTextureFrameBuffer.getFrameBufferId());
                    GlRenderDrawer glRenderDrawer2 = glRenderDrawer;
                    CameraVideoCapturer cameraVideoCapturer3 = CameraVideoCapturer.this;
                    glRenderDrawer2.drawOes(cameraVideoCapturer3.mOesTex, null, convertMatrixFromAndroidGraphicsMatrix, 0, 0, cameraVideoCapturer3.mOutWidth, cameraVideoCapturer3.mOutHeight);
                    if (CameraVideoCapturer.this.mNeedOesTo2D) {
                        GLES20.glFinish();
                    } else {
                        GLES20.glFlush();
                    }
                    GLES20.glBindFramebuffer(36160, 0);
                    GlUtil.checkNoGLES2Error("CameraVideoCapturer.copyCurrentFrame");
                    zArr[0] = true;
                } catch (Exception e2) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("copyCurrentFrame error: ");
                    LIZ3.append(e2.toString());
                    AVLog.ioe("CameraVideoCapturer", X1D.LIZIZ(LIZ3));
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return zArr[0];
    }

    public C63915P6p getProviderSettings(final int i, final int i2) {
        this.mThreadChecker.checkIsOnValidThread();
        Handler handler = this.mOesProcessHandler;
        if (handler != null) {
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.17
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$17__run$___twin___() {
                    CameraVideoCapturer.this.recreateSurfaceTexture(i, i2);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass17 anonymousClass17) {
                    boolean LIZ;
                    try {
                        anonymousClass17.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$17__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        } else {
            recreateSurfaceTexture(i, i2);
        }
        TEFrameSizei tEFrameSizei = new TEFrameSizei(i, i2);
        if (this.mVideoFrameDumper != null) {
            return new C63915P6p(tEFrameSizei, this, this.mSurfaceTexture, EnumC63901P6b.PIXEL_FORMAT_YUV420);
        }
        return new C63915P6p(tEFrameSizei, (P7P) this, true, this.mSurfaceTexture, this.mOesTex);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.CameraObserver, X.YR1
    public void onCaptureStarted(final int i, int i2) {
        boolean z;
        if (this.mCapture == null) {
            AVLog.iow("CameraVideoCapturer", "onCaptureStarted after stop");
            return;
        }
        if (i2 != 0) {
            if (this.mCameraOpenRetryCnt > 0) {
                onError(i2, "What happen? Camera retry open failed!");
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("What happen? Maybe the size(");
            LIZ.append(this.mFps);
            LIZ.append("@");
            LIZ.append(this.mOutWidth);
            LIZ.append("x");
            LIZ.append(this.mOutHeight);
            LIZ.append(") is invalid.");
            onError(i2, X1D.LIZIZ(LIZ));
            return;
        }
        try {
            this.mThreadChecker.checkIsOnValidThread();
            if (this.mCameraType != i) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("TargetCamera", this.mCameraType);
                    jSONObject.put("RealCamera", i);
                } catch (Exception unused) {
                }
                AVLog.logKibana(5, "CameraVideoCapturer", jSONObject.toString(), null);
                this.mCameraType = i;
                if (i != this.mSettings.LJLILLLLZI) {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("TECameraSettings.mCameraType not equals to cameraType in onCaptureStarted callback!");
                    if (AnonymousClass028.LJI(androidRuntimeException, "CameraVideoCapturer.onCaptureStarted")) {
                        throw androidRuntimeException;
                    }
                }
            }
            AVLog.ioi("CameraVideoCapturer", "onCaptureStarted ok");
            if (this.mSurfaceTexture == null || this.mOesTex <= 0) {
                onError(-206, "Invalid texture");
                return;
            }
            String str = "Capture is null, not should be here";
            synchronized (this.mObject) {
                if (this.mCapture != null) {
                    this.mRealRateStatics = new VideoFrameStatics(5000, this.mParams.getInt("est_rate_statistics_type", 2));
                    C63915P6p providerSettings = getProviderSettings(this.mCameraCaptureWidth, this.mCameraCaptureHeight);
                    this.mProviderSettings = providerSettings;
                    this.mCapture.addCameraProvider(providerSettings);
                    try {
                        i2 = this.mCapture.start();
                    } catch (Exception e) {
                        str = e.getMessage();
                        i2 = -206;
                    }
                    if (i2 == 0) {
                        z = false;
                    }
                }
                z = true;
            }
            if (z) {
                onError(i2, str);
            } else {
                this.mSkipFirstFrame = true;
                super.start(this.mOutWidth, this.mOutHeight, this.mFps);
            }
        } catch (Throwable unused2) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.12
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$12__run$___twin___() {
                    CameraVideoCapturer.this.onCaptureStarted(i, 0);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
                    boolean LIZ2;
                    try {
                        anonymousClass12.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$12__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.CameraObserver, X.YR1
    public void onError(final int i, String str) {
        if (this.mCameraSizeOptEnable) {
            this.mCameraUpdating.set(false);
        }
        final Exception exc = new Exception(str);
        if (C16880lQ.LLLLIIIILLL() == this.mHandler.getLooper().getThread()) {
            onErrorOnHandler(i, exc);
        } else {
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.10
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$10__run$___twin___() {
                    CameraVideoCapturer.this.onErrorOnHandler(i, exc);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                    boolean LIZ;
                    try {
                        anonymousClass10.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$10__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public void onErrorOnHandler(int i, Exception exc) {
        switch (i) {
            case -417:
            case -416:
                this.mISPToggleStatus = false;
                return;
            case -415:
            case -414:
            case -413:
                this.mISPExposureStatus = false;
                return;
            case -412:
            case -411:
                this.mISPFocuseStatus = false;
                return;
            default:
                this.mStatus = 2;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("TECaptureError", i);
                    jSONObject.put("params", this.mParams);
                } catch (Exception unused) {
                }
                if (i != -404) {
                    AVLog.logKibana(6, "CameraVideoCapturer", jSONObject.toString(), exc);
                }
                if (!this.mISPFocuseStatus || !this.mISPExposureStatus || i == -404 || i == -409 || i == -403 || i == -420 || i == -421 || i == -105) {
                    this.mObserver.onVideoCaptureInfo(1, i, 0, "Camera error!");
                    return;
                } else {
                    this.mObserver.onVideoCaptureError(i, exc);
                    return;
                }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int queryZoomAbility(final boolean z, boolean z2) {
        final int[] iArr = {0, 0};
        final Object obj = new Object();
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            int queryZoomAbility = tECameraCapture.queryZoomAbility(new InterfaceC87361YQj() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.26
                @Override // X.InterfaceC87361YQj
                public boolean enableSmooth() {
                    return z;
                }

                @Override // X.InterfaceC87361YQj
                public void onChange(int i, float f, boolean z3) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("queryZoomAbility: cameraType ");
                    LIZ.append(i);
                    LIZ.append(", zoomValue ");
                    LIZ.append(f);
                    LIZ.append(", stopped ");
                    LIZ.append(z3);
                    AVLog2.logToIODevice2(4, "CameraVideoCapturer", X1D.LIZIZ(LIZ), null, 31, 10000);
                }

                @Override // X.InterfaceC87361YQj
                public void onZoomSupport(int i, boolean z3, boolean z4, float f, List<Integer> list) {
                    String str;
                    String str2;
                    String str3 = "";
                    Iterator<Integer> it = list.iterator();
                    while (it.hasNext()) {
                        int intValue = it.next().intValue();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str3);
                        if (str3.isEmpty()) {
                            str2 = "[";
                        } else {
                            str2 = ", ";
                        }
                        LIZ.append(str2);
                        LIZ.append(intValue);
                        str3 = X1D.LIZIZ(LIZ);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str3);
                    if (str3.isEmpty()) {
                        str = "";
                    } else {
                        str = "]";
                    }
                    LIZ2.append(str);
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    try {
                        synchronized (obj) {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("queryZoomAbility: cameraType ");
                            LIZ3.append(i);
                            LIZ3.append(", supportZoom ");
                            LIZ3.append(z3);
                            LIZ3.append(", supportSmooth ");
                            LIZ3.append(z4);
                            LIZ3.append(", maxZoom ");
                            LIZ3.append(f);
                            LIZ3.append(", ratios ");
                            LIZ3.append(LIZIZ);
                            AVLog2.logToIODevice2(4, "CameraVideoCapturer", X1D.LIZIZ(LIZ3), null, 20, 10000);
                            iArr[1] = (int) f;
                            obj.notifyAll();
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }, z2);
            iArr[0] = queryZoomAbility;
            if (queryZoomAbility != 0) {
                return -Math.abs(queryZoomAbility);
            }
            try {
                synchronized (obj) {
                    obj.wait(500L);
                    if (iArr[1] == 0) {
                        AVLog2.logToIODevice2(4, "CameraVideoCapturer", "queryZoomAbility: query timeout", null, 66, 10000);
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return iArr[1];
    }

    public void recreateSurfaceTexture(int i, int i2) {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        SurfaceTexture surfaceTexture2 = new SurfaceTexture(this.mOesTex);
        this.mSurfaceTexture = surfaceTexture2;
        surfaceTexture2.updateTexImage();
        this.mSurfaceTexture.setDefaultBufferSize(i, i2);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int setCameraPreviewFpsRangeWhenRunning(int i, int i2) {
        AVLog.logKibana(4, "CameraVideoCapturer", C48263Iwt.LIZLLL("setCameraPreviewFpsRangeWhenRunning min:", i, " max:", i2), null);
        int[] iArr = {-1};
        try {
            this.mCapture.setPreviewFpsRangeWhenRunning(new TEFrameRateRange(i, i2));
            return iArr[0];
        } catch (Throwable unused) {
            return -1;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int startZoom(boolean z, float f) {
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            return tECameraCapture.startZoom(f, new InterfaceC87361YQj() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.27
                @Override // X.InterfaceC87361YQj
                public boolean enableSmooth() {
                    return true;
                }

                @Override // X.InterfaceC87361YQj
                public void onChange(int i, float f2, boolean z2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cameraType ");
                    LIZ.append(i);
                    LIZ.append(", zoomValue ");
                    LIZ.append(f2);
                    LIZ.append(", stopped ");
                    LIZ.append(z2);
                    AVLog.iow("CameraVideoCapturer", X1D.LIZIZ(LIZ));
                }

                @Override // X.InterfaceC87361YQj
                public void onZoomSupport(int i, boolean z2, boolean z3, float f2, List<Integer> list) {
                    String str;
                    Iterator<Integer> it = list.iterator();
                    String str2 = "";
                    String str3 = "";
                    while (it.hasNext()) {
                        int intValue = it.next().intValue();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str3);
                        if (str3.isEmpty()) {
                            str = "[";
                        } else {
                            str = ", ";
                        }
                        LIZ.append(str);
                        LIZ.append(intValue);
                        str3 = X1D.LIZIZ(LIZ);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(str3);
                    if (!str3.isEmpty()) {
                        str2 = "]";
                    }
                    LIZ2.append(str2);
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("cameraType ");
                    LIZ3.append(i);
                    LIZ3.append(", supportZoom ");
                    LIZ3.append(z2);
                    LIZ3.append(", supportSmooth ");
                    LIZ3.append(z3);
                    LIZ3.append(", maxZoom ");
                    LIZ3.append(f2);
                    LIZ3.append(", ratios ");
                    LIZ3.append(LIZIZ);
                    AVLog.iow("CameraVideoCapturer", X1D.LIZIZ(LIZ3));
                }
            });
        }
        return -1;
    }

    private boolean checkGenerateMipmap(int i, int i2, int i3) {
        if (this.mEnableMipmap <= 0) {
            return false;
        }
        if (this.mFrameBuffer == null) {
            GlTextureFrameBuffer glTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            this.mFrameBuffer = glTextureFrameBuffer;
            GLES20.glBindTexture(3553, glTextureFrameBuffer.getTextureId());
            GLES20.glTexParameterf(3553, 10241, GlUtil.getFilterTypeFromName(this.mTextureMinFilter));
            GLES20.glTexParameteri(3553, 33084, 0);
            GLES20.glTexParameteri(3553, 33085, 4);
            GLES20.glBindTexture(3553, 0);
        }
        if (i2 != this.mFrameBuffer.getWidth() || i3 != this.mFrameBuffer.getHeight()) {
            this.mFrameBuffer.setSize(i2, i3);
            GLES20.glBindTexture(3553, this.mFrameBuffer.getTextureId());
            GLES20.glGenerateMipmap(3553);
            GLES20.glBindTexture(3553, 0);
        }
        if (this.mDrawer == null) {
            this.mDrawer = new GlRenderDrawer();
        }
        GLES20.glBindFramebuffer(36160, this.mFrameBuffer.getFrameBufferId());
        this.mDrawer.drawOes(i, null, null, 0, 0, i2, i3);
        GLES20.glFlush();
        GlUtil.checkNoGLES2Error("checkGenerateMipmap drawOes");
        GLES20.glBindTexture(3553, this.mFrameBuffer.getTextureId());
        GLES20.glGenerateMipmap(3553);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GlUtil.checkNoGLES2Error("checkGenerateMipmap glGenerateMipmap");
        return true;
    }

    private boolean postAndWait(Handler handler, long j, final Runnable runnable) {
        if (handler == null || runnable == null || j <= 0) {
            return false;
        }
        final Object obj = new Object();
        final boolean[] zArr = {false};
        synchronized (obj) {
            if (handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.25
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$25__run$___twin___() {
                    runnable.run();
                    zArr[0] = true;
                    synchronized (obj) {
                        obj.notify();
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass25 anonymousClass25) {
                    boolean LIZ;
                    try {
                        anonymousClass25.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$25__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            })) {
                try {
                    obj.wait(j);
                } catch (InterruptedException unused) {
                }
            }
        }
        return zArr[0];
    }

    private void tryDeliverFrameWithTimeStamp(final P6E p6e, final long j, final long j2) {
        if (this.mNeedDeliverFrameWithTimestamp && this.mNextDeliverFrameTime > j2) {
            Handler handler = this.mOesProcessHandler;
            if (handler == null) {
                handler = this.mHandler;
            }
            handler.postDelayed(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.15
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$15__run$___twin___() {
                    CameraVideoCapturer cameraVideoCapturer = CameraVideoCapturer.this;
                    cameraVideoCapturer.mNewTexture = true;
                    cameraVideoCapturer.mFrame = p6e;
                    cameraVideoCapturer.tryDeliverFrame(j, cameraVideoCapturer.mNextDeliverFrameTime, true);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass15 anonymousClass15) {
                    boolean LIZ;
                    try {
                        anonymousClass15.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$15__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            }, this.mNextDeliverFrameTime - j2);
            return;
        }
        Handler handler2 = this.mOesProcessHandler;
        if (handler2 == null) {
            handler2 = this.mHandler;
        }
        handler2.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.16
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$16__run$___twin___() {
                CameraVideoCapturer cameraVideoCapturer = CameraVideoCapturer.this;
                cameraVideoCapturer.mNewTexture = true;
                cameraVideoCapturer.mFrame = p6e;
                cameraVideoCapturer.tryDeliverFrame(j, j2, true);
            }

            public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass16 anonymousClass16) {
                boolean LIZ;
                try {
                    anonymousClass16.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$16__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.CameraObserver, X.YR1
    public void onInfo(int i, int i2, String str) {
        if (this.mCameraSizeOptEnable && i == 0) {
            StringBuilder LIZJ = C06460Ne.LIZJ("TECapture type ", i, " ext ", i2, " msg ");
            LIZJ.append(str);
            AVLog.iod("CameraVideoCapturer", X1D.LIZIZ(LIZJ));
            this.mCameraUpdating.set(false);
            final StashParam stashParam = this.mStashParam;
            if (stashParam != null) {
                this.mMainHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.11
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$11__run$___twin___() {
                        CameraVideoCapturer cameraVideoCapturer = CameraVideoCapturer.this;
                        StashParam stashParam2 = stashParam;
                        cameraVideoCapturer.updateCaptureResolution(stashParam2.width, stashParam2.height, stashParam2.minFps, stashParam2.fps);
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                        boolean LIZ;
                        try {
                            anonymousClass11.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$11__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
                this.mStashParam = null;
                return;
            }
            return;
        }
        if (i == 120) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("TECaptureInfo", i);
                jSONObject.put("Ext", i2);
                jSONObject.put("msg", str);
                jSONObject.put("CameraType", this.mCameraType);
                jSONObject.put("CameraOpenRetryCnt", this.mCameraOpenRetryCnt);
            } catch (Exception unused) {
            }
            AVLog.logKibana(4, "CameraVideoCapturer", jSONObject.toString(), null);
            return;
        }
        if (i == 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("TECaptureInfo", i);
                jSONObject2.put("Ext", i2);
                jSONObject2.put("msg", str);
                jSONObject2.put("CameraType", this.mCameraType);
                jSONObject2.put("CameraRetryStartPreviewCnt", this.mCameraRetryStartPreviewCnt);
            } catch (Exception unused2) {
            }
            AVLog.logKibana(4, "CameraVideoCapturer", jSONObject2.toString(), null);
            return;
        }
        if (i == 1) {
            checkCameraFeatures(true);
            return;
        }
        if (i == 121) {
            this.mCamFpsRangeStr = str;
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("TECaptureInfo", i);
                jSONObject3.put("VideoCaptureMinFps", this.mVideoCaptureMinFps);
                jSONObject3.put("VideoCaptureFps", this.mFps);
                jSONObject3.put("RealFpsRange", str);
                jSONObject3.put("CameraType", this.mCameraType);
            } catch (Exception unused3) {
            }
            AVLog.logKibana(4, "CameraVideoCapturer", jSONObject3.toString(), null);
            return;
        }
        StringBuilder LIZJ2 = C06460Ne.LIZJ("TECapture type ", i, " ext ", i2, " msg ");
        LIZJ2.append(str);
        AVLog.iod("CameraVideoCapturer", X1D.LIZIZ(LIZJ2));
    }

    public void setAdaptedFormat(int i, int i2, int i3) {
        this.mAdaptedWidth = i;
        this.mAdaptedHeight = i2;
        this.mAdaptedFps = i3;
        checkEnableMipmap();
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.ExternalVideoCapturer, com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public void start(int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        int i5;
        StringBuilder LIZJ = C06460Ne.LIZJ("start(", i, ", ", i2, ", ");
        LIZJ.append(i3);
        LIZJ.append(")");
        AVLog.ioi("CameraVideoCapturer", X1D.LIZIZ(LIZJ));
        this.mOutWidth = i;
        this.mOutHeight = i2;
        checkEnableMipmap();
        this.mCameraCaptureHeight = Math.min(i, i2);
        this.mCameraCaptureWidth = Math.max(i, i2);
        if (this.mOutWidth == this.mCameraCaptureHeight) {
            z = true;
        } else {
            z = false;
        }
        this.mExchangedResolution = z;
        this.mFps = i3;
        synchronized (this.mObject) {
            if (this.mCapture != null) {
                C84134X0g c84134X0g = new C84134X0g(this.mContext, this.mCameraType, this.mCameraCaptureWidth, this.mCameraCaptureHeight);
                this.mSettings = c84134X0g;
                int i6 = this.mVideoCaptureMinFps;
                if (i6 <= 0 || i6 > 30 || (i5 = this.mFps) <= 0 || i5 > 30 || i6 > i5) {
                    int i7 = this.mFps;
                    if (i7 < 30) {
                        i4 = i7;
                    } else {
                        i4 = this.mSettings.LJLJI.min;
                    }
                    c84134X0g.LJLJI = new TEFrameRateRange(i4, i7);
                } else {
                    c84134X0g.LJLJI = new TEFrameRateRange(this.mVideoCaptureMinFps, this.mFps);
                }
                if (this.mCameraFrameRateStrategy == 1) {
                    this.mSettings.LLIIL = 0;
                } else {
                    this.mSettings.LLIIL = 3;
                }
                C84134X0g c84134X0g2 = this.mSettings;
                c84134X0g2.LJLJJI = this.mCameraFacing;
                int i8 = this.mRequiredCameraLevel;
                if (i8 == -1) {
                    i8 = c84134X0g2.LLII;
                }
                c84134X0g2.LLII = i8;
                int i9 = this.mCameraMode;
                if (i9 == -1) {
                    i9 = c84134X0g2.LLIFFJFJJ;
                }
                c84134X0g2.LLIFFJFJJ = i9;
                c84134X0g2.LLIIIZ = this.mEnableFallback;
                int i10 = this.mCameraOpenRetryCnt;
                c84134X0g2.LLD = i10;
                c84134X0g2.LLFF = i10;
                c84134X0g2.LLF = this.mCameraRetryStartPreviewCnt;
                c84134X0g2.LLIL = this.mIsForceCloseCamera;
                c84134X0g2.LLIIZ = this.mIsCameraOpenCloseSync;
                if (this.mEnableStabilization == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c84134X0g2.LLILL = z2;
                c84134X0g2.LJLLILLLL = this.mEnableWideFov;
                c84134X0g2.LLIZLLLIL = this.mEnableOpenCamera1Opt;
                c84134X0g2.LLIIII.putBoolean("enableFrontFacingVideoContinueFocus", this.mEnableFrontContinueFocus);
                this.mSettings.LLIIII.putInt("useCameraFaceDetect", this.mFaceAEStrategy);
                this.mSettings.LLIIII.putBoolean("enablePreviewTemplate", this.mEnablePreviewTemplate);
                C84134X0g c84134X0g3 = this.mSettings;
                c84134X0g3.LJLLLLLL = true;
                c84134X0g3.LJLZ = 5000L;
                checkCameraFeatures(false);
                this.mOpenCameraTimestamp = TimeUtils.currentTimeMs();
                this.mGotFirstFrame = false;
                this.lensDetectFlag = false;
                int cameraConnectWithCert = PrivacyCertManager.cameraConnectWithCert(this.mCapture, this.mSettings);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("TECameraCapture: ");
                LIZ.append(this.mCapture);
                LIZ.append(" connect, CameraVideoCapturer: ");
                LIZ.append(this);
                AVLog.logKibana(4, "CameraVideoCapturer", X1D.LIZIZ(LIZ), null);
                if (cameraConnectWithCert != 0) {
                    VideoCapturer.VideoCapturerObserver videoCapturerObserver = this.mObserver;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Capture connect failed(");
                    LIZ2.append(cameraConnectWithCert);
                    LIZ2.append(")");
                    videoCapturerObserver.onVideoCaptureError(cameraConnectWithCert, new Exception(X1D.LIZIZ(LIZ2)));
                }
            } else {
                this.mObserver.onVideoCaptureError(-204, new Exception("Capture already release"));
            }
        }
    }

    public void tryDeliverFrame(final long j, long j2, boolean z) {
        boolean z2;
        int i;
        float f;
        int i2;
        int i3;
        int i4;
        int copyTexture;
        int textureId;
        int i5;
        int i6;
        GlTextureFrameBuffer glTextureFrameBuffer;
        ScopeMonitor.CalcElapse(3, j, TimeUtils.currentTimeMs());
        boolean z3 = true;
        if (this.mStatus != 1 || this.mSurfaceTexture == null || !this.mNewTexture || (!this.mBufferAlreadyReturn && !isEnableOesProcess())) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("mStatus ");
            LIZ.append(this.mStatus);
            LIZ.append(", !mNewTexture ");
            LIZ.append(!this.mNewTexture);
            LIZ.append(", !mBufferAlreadyReturn");
            LIZ.append(!this.mBufferAlreadyReturn);
            AVLog2.logToIODevice2(5, "CameraVideoCapturer", i0.LJFF("CameraVideoCapturer.tryDeliverFrame return: ", X1D.LIZIZ(LIZ)), null, 19, 10000);
            return;
        }
        if (isEnableOesProcess() && this.mPendingRequest != null) {
            DebugLogUtils.isEnableDebugLog();
            return;
        }
        int i7 = this.mAdaptedFps;
        if (i7 > 0) {
            int i8 = 1000 / i7;
            if (this.mEnablePtsAdjust) {
                long j3 = this.mNextDeliverFrameTime;
                if (j2 > j3) {
                    long j4 = i8;
                    this.mNextDeliverFrameTime = (j4 - ((j2 - j3) % j4)) + j2;
                }
            }
            this.mNextDeliverFrameTime = i8 + j2;
        }
        boolean z4 = false;
        this.mNewTexture = false;
        updateTexImage();
        ScopeMonitor.CalcElapse(4, j, TimeUtils.currentTimeMs());
        if (this.mCameraSizeOptEnable && this.mSkipFirstFrame) {
            this.mSkipFirstFrame = false;
            return;
        }
        if (this.mSkipFirstFrame && !isCamera2Like()) {
            this.mSkipFirstFrame = false;
            return;
        }
        this.mSurfaceTexture.getTransformMatrix(this.mTexMatrix);
        VideoFrameDumper videoFrameDumper = this.mVideoFrameDumper;
        if (videoFrameDumper != null) {
            videoFrameDumper.checkOesTo2D(this.mOesTex, this.mCameraCaptureWidth, this.mCameraCaptureHeight, this.mFps);
        }
        if (checkGenerateMipmap(this.mOesTex, this.mCameraCaptureWidth, this.mCameraCaptureHeight) && (glTextureFrameBuffer = this.mFrameBuffer) != null && glTextureFrameBuffer.getTextureId() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        tryProcessTaintSceneAlgorithm(this.mFrame);
        CameraAlgorithmChain cameraAlgorithmChain = this.mLiveChainOfAlgorithm;
        if (cameraAlgorithmChain != null) {
            if (cameraAlgorithmChain.getAlgorithmValue() != 0) {
                this.mFrame = cameraAlgorithmChain.process(this.mFrame);
                z2 = true;
            }
            if (cameraAlgorithmChain.getAlgorithmValue() > 0) {
                z4 = true;
            }
        }
        final long timeStamp = getTimeStamp(j2);
        if (isEnableOesProcess()) {
            DebugLogUtils.isEnableDebugLog();
            if (z2) {
                if (z4) {
                    textureId = this.mFrame.LIZLLL();
                } else {
                    textureId = this.mFrameBuffer.getTextureId();
                }
                if (isCamera2Like()) {
                    i5 = this.mOutHeight;
                } else {
                    i5 = this.mCameraCaptureHeight;
                }
                if (isCamera2Like()) {
                    i6 = this.mOutWidth;
                } else {
                    i6 = this.mCameraCaptureWidth;
                }
                copyTexture = copyTexture(textureId, false, null, i5, i6);
            } else {
                int i9 = this.mOesTex;
                if (isCamera2Like()) {
                    i3 = this.mOutHeight;
                } else {
                    i3 = this.mCameraCaptureHeight;
                }
                if (isCamera2Like()) {
                    i4 = this.mOutWidth;
                } else {
                    i4 = this.mCameraCaptureWidth;
                }
                z3 = true;
                copyTexture = copyTexture(i9, true, null, i3, i4);
            }
            final int i10 = copyTexture;
            this.mCurrentPushFrameRequestRunnable = new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.21
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$21__run$___twin___() {
                    float f2;
                    DebugLogUtils.isEnableDebugLog();
                    if (CameraVideoCapturer.this.isCamera2Like()) {
                        Matrix matrix = new Matrix();
                        matrix.preTranslate(0.5f, 0.5f);
                        matrix.preRotate(CameraVideoCapturer.this.mRotation);
                        CameraVideoCapturer cameraVideoCapturer = CameraVideoCapturer.this;
                        float f3 = -1.0f;
                        if (cameraVideoCapturer.mHorizontalMirror) {
                            f2 = -1.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        if (!cameraVideoCapturer.mVerticalMirror) {
                            f3 = 1.0f;
                        }
                        matrix.preScale(f2, f3);
                        matrix.preTranslate(-0.5f, -0.5f);
                        matrix.postConcat(RendererCommon.convertMatrixToAndroidGraphicsMatrix(CameraVideoCapturer.this.mTexMatrix));
                        CameraVideoCapturer cameraVideoCapturer2 = CameraVideoCapturer.this;
                        cameraVideoCapturer2.pushVideoFrame(i10, false, cameraVideoCapturer2.mOutWidth, cameraVideoCapturer2.mOutHeight, matrix, timeStamp, (Bundle) null, j);
                        return;
                    }
                    CameraVideoCapturer cameraVideoCapturer3 = CameraVideoCapturer.this;
                    cameraVideoCapturer3.pushVideoFrame(i10, false, cameraVideoCapturer3.mCameraCaptureWidth, cameraVideoCapturer3.mCameraCaptureHeight, cameraVideoCapturer3.mRotation, cameraVideoCapturer3.mTexMatrix, timeStamp, null, j);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass21 anonymousClass21) {
                    boolean LIZ2;
                    try {
                        anonymousClass21.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$21__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            };
            GlTextureFrameBuffer glTextureFrameBuffer2 = this.mOesProcessFrameBuffer1;
            if (glTextureFrameBuffer2 != null && glTextureFrameBuffer2.getTextureId() == copyTexture) {
                if (this.mOesProcessFrameBuffer2Using) {
                    PushFrameRequest pushFrameRequest = new PushFrameRequest();
                    this.mPendingRequest = pushFrameRequest;
                    pushFrameRequest.runnable = this.mCurrentPushFrameRequestRunnable;
                    pushFrameRequest.texID = copyTexture;
                    this.mCurrentPushFrameRequestRunnable = null;
                    DebugLogUtils.isEnableDebugLog();
                    return;
                }
                this.mOesProcessFrameBuffer1Using = z3;
                this.mPendingRequest = null;
                this.mHandler.post(this.mCurrentPushFrameRequestRunnable);
                DebugLogUtils.isEnableDebugLog();
                return;
            }
            GlTextureFrameBuffer glTextureFrameBuffer3 = this.mOesProcessFrameBuffer2;
            if (glTextureFrameBuffer3 != null && glTextureFrameBuffer3.getTextureId() == copyTexture) {
                if (this.mOesProcessFrameBuffer1Using) {
                    PushFrameRequest pushFrameRequest2 = new PushFrameRequest();
                    this.mPendingRequest = pushFrameRequest2;
                    pushFrameRequest2.runnable = this.mCurrentPushFrameRequestRunnable;
                    pushFrameRequest2.texID = copyTexture;
                    this.mCurrentPushFrameRequestRunnable = null;
                    DebugLogUtils.isEnableDebugLog();
                    return;
                }
                this.mOesProcessFrameBuffer2Using = z3;
                this.mPendingRequest = null;
                this.mHandler.post(this.mCurrentPushFrameRequestRunnable);
                DebugLogUtils.isEnableDebugLog();
                return;
            }
            DebugLogUtils.isEnableDebugLog();
            return;
        }
        if (isCamera2Like()) {
            Matrix matrix = new Matrix();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preRotate(this.mRotation);
            float f2 = -1.0f;
            if (this.mHorizontalMirror) {
                f = -1.0f;
            } else {
                f = 1.0f;
            }
            if (!this.mVerticalMirror) {
                f2 = 1.0f;
            }
            matrix.preScale(f, f2);
            matrix.preTranslate(-0.5f, -0.5f);
            matrix.postConcat(RendererCommon.convertMatrixToAndroidGraphicsMatrix(this.mTexMatrix));
            if (z2) {
                if (z4) {
                    i2 = this.mFrame.LIZLLL();
                } else {
                    i2 = this.mFrameBuffer.getTextureId();
                }
            } else {
                i2 = this.mOesTex;
            }
            pushVideoFrame(i2, !z2, this.mOutWidth, this.mOutHeight, matrix, timeStamp, (Bundle) null, j);
            return;
        }
        if (z2) {
            if (z4) {
                i = this.mFrame.LIZLLL();
            } else {
                i = this.mFrameBuffer.getTextureId();
            }
        } else {
            i = this.mOesTex;
        }
        pushVideoFrame(i, !z2, this.mCameraCaptureWidth, this.mCameraCaptureHeight, this.mRotation, this.mTexMatrix, timeStamp, null, j);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl
    public int setFocusAreas(int i, int i2, int i3, int i4) {
        final int[] iArr = {-1};
        TECameraCapture tECameraCapture = this.mCapture;
        if (tECameraCapture != null) {
            try {
                this.mISPFocuseStatus = true;
                tECameraCapture.focusAtPoint(i, i2, 0.15f, i3, i4);
                postAndWait(this.mHandler, 3000L, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.24
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$24__run$___twin___() {
                        int i5;
                        int[] iArr2 = iArr;
                        if (CameraVideoCapturer.this.mISPFocuseStatus) {
                            i5 = 0;
                        } else {
                            i5 = -1;
                        }
                        iArr2[0] = i5;
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass24 anonymousClass24) {
                        boolean LIZ;
                        try {
                            anonymousClass24.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$24__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }
                });
            } catch (Throwable unused) {
                return -1;
            }
        }
        return iArr[0];
    }

    public void updateCaptureResolution(int i, int i2, final int i3, final int i4) {
        boolean z;
        int i5;
        int i6;
        int i7;
        StringBuilder LIZJ = C06460Ne.LIZJ("updateCaptureResolution width:", i, " height:", i2, " minFps:");
        C15890jp.LIZIZ(LIZJ, i3, " fps:", i4, " cameraSizeOptEnable:");
        LIZJ.append(this.mCameraSizeOptEnable);
        LIZJ.append(" updating:");
        LIZJ.append(this.mCameraUpdating.get());
        AVLog.logKibana(4, "CameraVideoCapturer", X1D.LIZIZ(LIZJ), null);
        if (this.mCameraSizeOptEnable && this.mCameraUpdating.get()) {
            this.mStashParam = new StashParam(i, i2, i3, i4);
            return;
        }
        this.mCameraCaptureWidth = Math.max(i, i2);
        int min = Math.min(i, i2);
        this.mCameraCaptureHeight = min;
        if (this.mCameraSizeOptEnable) {
            this.mOutWidth = i;
            this.mOutHeight = i2;
            this.mFps = i4;
        }
        if (i2 != min) {
            z = true;
        } else {
            z = false;
        }
        this.mExchangedResolution = z;
        List<TEFrameSizei> list = this.mSupportPreviewSizes;
        if (list != null) {
            TEFrameSizei adaptedFrameSize = FrameSizeAdapter.getAdaptedFrameSize(list, this.mCameraCaptureWidth, min, this.mChooseBestCaptureResolution);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Calling updateCaptureResolution getAdaptedFrameSize:");
            LIZ.append(this.mCameraCaptureWidth);
            LIZ.append(" mCameraCaptureHeight:");
            LIZ.append(this.mCameraCaptureHeight);
            LIZ.append(" chosen size:");
            LIZ.append(adaptedFrameSize);
            LIZ.append(" mChooseBestCaptureResolution:");
            LIZ.append(this.mChooseBestCaptureResolution);
            AVLog.logKibana(4, "CameraVideoCapturer", X1D.LIZIZ(LIZ), null);
            if (adaptedFrameSize != null) {
                int i8 = this.mCameraCaptureWidth;
                int i9 = adaptedFrameSize.width;
                if (i8 != i9 || (i6 = this.mCameraCaptureHeight) != adaptedFrameSize.height) {
                    this.mCameraCaptureWidth = i9;
                    int i10 = adaptedFrameSize.height;
                    this.mCameraCaptureHeight = i10;
                    boolean z2 = this.mExchangedResolution;
                    if (z2) {
                        i5 = i10;
                    } else {
                        i5 = i9;
                    }
                    this.mOutWidth = i5;
                    if (!z2) {
                        i9 = i10;
                    }
                    this.mOutHeight = i9;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Calling getPreviewSize and get default resolution:");
                    LIZ2.append(this.mOutWidth);
                    LIZ2.append("x");
                    LIZ2.append(this.mOutHeight);
                    AVLog.iow("CameraVideoCapturer", X1D.LIZIZ(LIZ2));
                    this.mObserver.onVideoCaptureInfo(2, this.mOutWidth, this.mOutHeight, "Capture Resolution Changed.");
                } else {
                    boolean z3 = this.mExchangedResolution;
                    if (z3) {
                        i7 = i6;
                    } else {
                        i7 = i8;
                    }
                    this.mOutWidth = i7;
                    if (!z3) {
                        i8 = i6;
                    }
                    this.mOutHeight = i8;
                }
                this.mObserver.onVideoCaptureInfo(3, adaptedFrameSize.width, adaptedFrameSize.height, "Camera Size Changed!");
            }
        } else {
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! why");
            if (AnonymousClass028.LJI(androidRuntimeException, "CameraVideoCapturer.updateCaptureResolution")) {
                throw androidRuntimeException;
            }
        }
        if (this.mCameraSizeOptEnable) {
            final int i11 = this.mCameraCaptureWidth;
            final int i12 = this.mCameraCaptureHeight;
            this.mCameraUpdating.set(true);
            this.mHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.2
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$2__run$___twin___() {
                    synchronized (CameraVideoCapturer.this.mObject) {
                        long nativeNanoTime = TimeUtils.nativeNanoTime();
                        CameraVideoCapturer.this.mCapture.stop();
                        CameraVideoCapturer.this.mCapture.addCameraProvider(CameraVideoCapturer.this.getProviderSettings(i11, i12));
                        CameraVideoCapturer.this.mCapture.setPreviewFpsRange(new TEFrameRateRange(i3, i4));
                        CameraVideoCapturer cameraVideoCapturer = CameraVideoCapturer.this;
                        cameraVideoCapturer.mSkipFirstFrame = true;
                        int start = cameraVideoCapturer.mCapture.start();
                        long nativeNanoTime2 = TimeUtils.nativeNanoTime() - nativeNanoTime;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("restart Camera with cost Ns:");
                        LIZ3.append(nativeNanoTime2);
                        LIZ3.append(" ret:");
                        LIZ3.append(start);
                        AVLog.logKibana(5, "CameraVideoCapturer", X1D.LIZIZ(LIZ3), null);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ3;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_livestreamv2_capture_CameraVideoCapturer$2__run$___twin___();
                    } finally {
                        if (LIZ3) {
                        }
                    }
                }
            });
            return;
        }
        long nativeNanoTime = TimeUtils.nativeNanoTime();
        this.mCapture.stop();
        this.mCapture.addCameraProvider(getProviderSettings(this.mCameraCaptureWidth, this.mCameraCaptureHeight));
        this.mCapture.start();
        AVLog.logKibana(5, "CameraVideoCapturer", C61845OOz.LIZ("restart Camera with cost Ns:", TimeUtils.nativeNanoTime() - nativeNanoTime), null);
    }

    private int copyTexture(int i, boolean z, float[] fArr, int i2, int i3) {
        int i4;
        if (this.mOesProcessFrameBuffer1 == null) {
            GlTextureFrameBuffer glTextureFrameBuffer = new GlTextureFrameBuffer(6408);
            this.mOesProcessFrameBuffer1 = glTextureFrameBuffer;
            glTextureFrameBuffer.setSize(i2, i3);
        }
        if (this.mOesProcessFrameBuffer2 == null && this.mEnableOesProcessDoubleBuffer) {
            GlTextureFrameBuffer glTextureFrameBuffer2 = new GlTextureFrameBuffer(6408);
            this.mOesProcessFrameBuffer2 = glTextureFrameBuffer2;
            glTextureFrameBuffer2.setSize(i2, i3);
        }
        if (this.mOesProcessDrawer == null) {
            this.mOesProcessDrawer = new GlRenderDrawer();
        }
        GlTextureFrameBuffer glTextureFrameBuffer3 = this.mOesProcessFrameBuffer1;
        if (glTextureFrameBuffer3 != null && !this.mOesProcessFrameBuffer1Using) {
            DebugLogUtils.isEnableDebugLog();
        } else {
            glTextureFrameBuffer3 = this.mOesProcessFrameBuffer2;
            if (glTextureFrameBuffer3 != null && !this.mOesProcessFrameBuffer2Using) {
                DebugLogUtils.isEnableDebugLog();
            } else {
                DebugLogUtils.isEnableDebugLog();
                return i;
            }
        }
        if (glTextureFrameBuffer3 != null) {
            glTextureFrameBuffer3.setSize(i2, i3);
            GLES20.glBindFramebuffer(36160, glTextureFrameBuffer3.getFrameBufferId());
            if (z) {
                i4 = 0;
                this.mOesProcessDrawer.drawOes(i, null, fArr, 0, 0, i2, i3);
            } else {
                i4 = 0;
                this.mOesProcessDrawer.drawRgb(i, null, fArr, 0, 0, i2, i3);
            }
            GLES20.glBindFramebuffer(36160, i4);
            GLES20.glFinish();
            DebugLogUtils.isEnableDebugLog();
            return glTextureFrameBuffer3.getTextureId();
        }
        return i;
    }

    @Override // com.ss.ttlivestreamer.core.capture.video.VideoCapturer
    public int onFrame(VideoFrame.Buffer buffer, int i, int i2, int i3, long j) {
        return super.onFrame(buffer, i, i2, i3, j);
    }

    public CameraVideoCapturer(Handler handler, boolean z, VideoCapturer.VideoCapturerObserver videoCapturerObserver, Context context, int i, Bundle bundle) {
        this(null, handler, z, videoCapturerObserver, context, i, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CameraVideoCapturer(android.os.Handler r12, android.os.Handler r13, boolean r14, com.ss.ttlivestreamer.core.capture.video.VideoCapturer.VideoCapturerObserver r15, android.content.Context r16, int r17, android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.capture.CameraVideoCapturer.<init>(android.os.Handler, android.os.Handler, boolean, com.ss.ttlivestreamer.core.capture.video.VideoCapturer$VideoCapturerObserver, android.content.Context, int, android.os.Bundle):void");
    }
}
