package com.ss.ttlivestreamer.livestreamv2.core;

import X.AnonymousClass028;
import X.C06460Ne;
import X.C16880lQ;
import X.C48263Iwt;
import X.C59895Nf1;
import X.InterfaceC63833P3l;
import X.JBR;
import X.Q89;
import X.RunnableC45114HnC;
import X.X1D;
import Y.ARunnableS13S0101000_9;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttlivestreamer.core.buffer.SurfaceWithExtData;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.capture.audio.AudioRecordThread;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.engine.MediaSource;
import com.ss.ttlivestreamer.core.engine.MediaTrack;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.engine.VsyncModule;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.core.opengl.RendererCommon;
import com.ss.ttlivestreamer.core.player.IAVPlayer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.LiveStreamThreadPriorityUtils;
import com.ss.ttlivestreamer.core.utils.LogUtil;
import com.ss.ttlivestreamer.core.utils.MiscUtils;
import com.ss.ttlivestreamer.core.utils.Monitor;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSPreInitBusiness;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.core.utils.TokenCertConfigUtils;
import com.ss.ttlivestreamer.livestreamv2.IInputAudioStream;
import com.ss.ttlivestreamer.livestreamv2.IInputVideoStream;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamOption;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamReport;
import com.ss.ttlivestreamer.livestreamv2.RenderView;
import com.ss.ttlivestreamer.livestreamv2.VideoFrameRenderer;
import com.ss.ttlivestreamer.livestreamv2.capture.CameraRecord;
import com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl;
import com.ss.ttlivestreamer.livestreamv2.core.BackgroundLayerControl;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControlExt;
import com.ss.ttlivestreamer.livestreamv2.core.LayerControl;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl;
import com.ss.ttlivestreamer.livestreamv2.core.audiorecord.IAudioRecordManager;
import com.ss.ttlivestreamer.livestreamv2.filter.FilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.FindContourInfo;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie;
import com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService;
import com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager;
import com.ss.ttlivestreamer.livestreamv2.strategy.FpsLevelStrategy;
import com.ss.ttlivestreamer.livestreamv2.utils.PrivacyCertManager;
import com.ss.ttlivestreamer.livestreamv2.utils.TTLSConstantsLifecycleCallback;
import com.ss.ttlivestreamer.livestreamv2.utils.TimerTaskUtils;
import com.ss.ttlivestreamer.livestreamv2.utils.ZlibCompressUtils;
import defpackage.b0;
import java.lang.reflect.Constructor;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LiveCoreImpl extends LiveCore implements AudioDeviceModule.Observer, LiveCore.ILiveCoreVideoFrameAvailableListener, ILiveStream.IAudioFrameAvailableListener, BackgroundLayerControl.IPlanarRenderCheck {
    public static ConcurrentLinkedQueue<String> callStatcks = new ConcurrentLinkedQueue<>();
    public int bitmapHeight;
    public int bitmapWidth;
    public String currentCallStack;
    public IAudioDeviceControl mAudioDeviceControl;
    public AudioDeviceModule mAudioDeviceModule;
    public BackgroundLayerControl mBackgroundLayerControl;
    public ILayerControlExt.ILayerExt mCameraStreamLayer;
    public VideoSink mCameraVideoSink;
    public View mDisplayView;
    public int mE2EVideoDelaySampleInterval;
    public EffectPerfStrategy mEffectFaceStrategy;
    public EffectPerfStrategy mEffectMattingStrategy;
    public boolean mEnableAutoGlRecycler;
    public ILiveStream.ILiveStreamErrorListener mErrorListener;
    public ILiveStream.ILiveStreamInfoListener mInfoListener;
    public LiveCore.ILiveForInteractListener mInteractEngineListener;
    public ILayerControlExt mLayerControl;
    public ILiveStream mLiveStream;
    public LiveStreamLogService mLiveStreamLogService;
    public SafeHandlerThread mLogUploadThread;
    public Handler mLogUploadThreadHandler;
    public int mMirror;
    public RenderView mRenderView;
    public LiveCoreRoiSwitch mRoiSwitch;
    public LiveCore.RtcExtraDataListener mRtcExtraDataListener;
    public ScreenAudioPlaybackObserver mScreenAudioPlaybackObserver;
    public long mStartTimeMs;
    public SurfaceCallbackManager mSurfaceCallbackManager;
    public int mVideoCaptureDeviceType;
    public Handler mVideoCaptureHandler;
    public GLThread mVideoCaptureThread;
    public SafeHandlerThread mWorkThread;
    public Handler mWorkThreadHandler;
    public List<ILiveStream.ITextureFrameAvailableListener> mTextureFrameListeners = new ArrayList();
    public List<ILiveStream.IAudioFrameAvailableListener> mAudioFrameListeners = new ArrayList();
    public final Object mTextureFrameListenersFence = new Object();
    public final Object mAudioFrameListenersFence = new Object();
    public boolean mCameraFirstReport = true;
    public boolean mIsPause = false;
    public final LiveStreamReport mLiveStreamReport = new LiveStreamReport();
    public long mLastReportTime = 0;
    public boolean mDisplayPlanarRender = false;
    public int mQuality = 1;
    public boolean mSupportEarMonitor = false;
    public boolean mIsMicRunning = false;
    public boolean mIsCameraRunning = false;
    public boolean mIsScreenCaptureRunning = false;
    public boolean mIsPushingBlackFrame = false;
    public boolean mIsOnlySendSeiToRTC = false;
    public int mBackgroundTex = 0;

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$10 */
    /* loaded from: classes12.dex */
    public class AnonymousClass10 implements Runnable {
        public final /* synthetic */ Bitmap val$bitmap;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$10__run$___twin___() {
            LiveCoreImpl.this.genBackgroundTex(r2);
            LiveCoreImpl.this.bitmapWidth = r2.getWidth();
            LiveCoreImpl.this.bitmapHeight = r2.getHeight();
            if (!r2.isRecycled()) {
                GLES20.glBindTexture(3553, LiveCoreImpl.this.mBackgroundTex);
                GLUtils.texImage2D(3553, 0, r2, 0);
                GLES20.glBindTexture(3553, 0);
                r2.recycle();
            }
            LiveCoreImpl liveCoreImpl = LiveCoreImpl.this;
            if (liveCoreImpl.mLayerControl != null) {
                LiveCoreImpl.this.mBackgroundLayerControl.setBackgroundTexture(new VideoMixer.VideoMixerTexture(liveCoreImpl.bitmapWidth, liveCoreImpl.bitmapHeight, 0, VideoMixer.TEXTURE_TYPE_2D, new int[]{liveCoreImpl.mBackgroundTex, 0, 0}, RendererCommon.verticalFlipMatrix()));
                if (LiveCoreImpl.this.mLayerControl.getLayer("single_view_background") == null) {
                    LiveCoreImpl.this.mLayerControl.createLayer("single_view_background", VideoMixer.VideoMixerDescription.FILL(), r2.getWidth(), r2.getHeight());
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
            boolean LIZ;
            try {
                anonymousClass10.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$10__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass10(Bitmap bitmap) {
            r2 = bitmap;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$11 */
    /* loaded from: classes12.dex */
    public class AnonymousClass11 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$11__run$___twin___() {
            ILayerControlExt iLayerControlExt = LiveCoreImpl.this.mLayerControl;
            if (iLayerControlExt != null && iLayerControlExt.getLayer("single_view_background") != null) {
                LiveCoreImpl.this.mLayerControl.removeLayer("single_view_background");
            }
            LiveCoreImpl.this.deleteBackgroundTexture();
        }

        public AnonymousClass11() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
            boolean LIZ;
            try {
                anonymousClass11.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$11__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$12 */
    /* loaded from: classes12.dex */
    public class AnonymousClass12 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$12__run$___twin___() {
            AudioDeviceModule audioDeviceModule = LiveCoreImpl.this.mAudioDeviceModule;
            if (audioDeviceModule != null) {
                int startPlayer = audioDeviceModule.startPlayer();
                if (startPlayer != 0) {
                    LiveCoreImpl.this.reportLiveCoreError(8, startPlayer, new Exception("ADM startPlayer error"));
                } else {
                    LiveCoreImpl.this.reportLiveCoreInfo(18, 0, 0);
                }
            }
        }

        public AnonymousClass12() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
            boolean LIZ;
            try {
                anonymousClass12.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$12__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$13 */
    /* loaded from: classes12.dex */
    public class AnonymousClass13 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$13__run$___twin___() {
            AudioDeviceModule audioDeviceModule = LiveCoreImpl.this.mAudioDeviceModule;
            if (audioDeviceModule != null) {
                int stopPlayer = audioDeviceModule.stopPlayer();
                if (stopPlayer != 0) {
                    LiveCoreImpl.this.reportLiveCoreError(8, stopPlayer, new Exception("ADM stopPlayer error"));
                } else {
                    LiveCoreImpl.this.reportLiveCoreInfo(19, 0, 0);
                }
            }
        }

        public AnonymousClass13() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
            boolean LIZ;
            try {
                anonymousClass13.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$13__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$15 */
    /* loaded from: classes12.dex */
    public class AnonymousClass15 implements Runnable {
        public final /* synthetic */ int val$level;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$15__run$___twin___() {
            ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
            if (iLiveStream != null) {
                iLiveStream.setLowPowerLevel(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass15 anonymousClass15) {
            boolean LIZ;
            try {
                anonymousClass15.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$15__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass15(int i) {
            r2 = i;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$19 */
    /* loaded from: classes12.dex */
    public class AnonymousClass19 implements Runnable {
        public final /* synthetic */ boolean val$planarRender;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$19__run$___twin___() {
            ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
            if (iLiveStream != null) {
                iLiveStream.setPublishPlanarRender(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass19 anonymousClass19) {
            boolean LIZ;
            try {
                anonymousClass19.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$19__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass19(boolean z) {
            r2 = z;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$2 */
    /* loaded from: classes12.dex */
    public class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$2__run$___twin___() {
            LiveCoreImpl.this.mAudioDeviceModule.stopPlayer();
            LiveCoreImpl.this.mAudioDeviceModule.stopRecording();
            LiveCoreImpl.this.mAudioDeviceModule.release();
            LiveCoreImpl liveCoreImpl = LiveCoreImpl.this;
            liveCoreImpl.mAudioDeviceModule = null;
            SurfaceCallbackManager surfaceCallbackManager = liveCoreImpl.mSurfaceCallbackManager;
            liveCoreImpl.mSurfaceCallbackManager = null;
            if (surfaceCallbackManager != null) {
                surfaceCallbackManager.release();
            }
        }

        public AnonymousClass2() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
            boolean LIZ;
            try {
                anonymousClass2.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$2__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$20 */
    /* loaded from: classes12.dex */
    public class AnonymousClass20 implements Runnable {
        public final /* synthetic */ int val$bgColor;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$20__run$___twin___() {
            ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
            if (iLiveStream != null) {
                iLiveStream.setPublishMixBgColor(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass20 anonymousClass20) {
            boolean LIZ;
            try {
                anonymousClass20.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$20__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass20(int i) {
            r2 = i;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$22 */
    /* loaded from: classes12.dex */
    public class AnonymousClass22 implements EffectPerfStrategy.IStrategyCallback {
        @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.EffectPerfStrategy.IStrategyCallback
        public void onExecute() {
            LiveCoreImpl.this.executeEffectDowningStrategyInternal("face_extra_model_name", "tt_face_extra_multiguest");
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.EffectPerfStrategy.IStrategyCallback
        public void onReset() {
            LiveCoreImpl.this.executeEffectDowningStrategyInternal("face_extra_model_name", "");
        }

        public AnonymousClass22() {
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$23 */
    /* loaded from: classes12.dex */
    public class AnonymousClass23 implements EffectPerfStrategy.IStrategyCallback {
        @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.EffectPerfStrategy.IStrategyCallback
        public void onExecute() {
            LiveCoreImpl.this.executeEffectDowningStrategyInternal("matting_model_name", "tt_matting_multiguest");
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.EffectPerfStrategy.IStrategyCallback
        public void onReset() {
            LiveCoreImpl.this.executeEffectDowningStrategyInternal("matting_model_name", "");
        }

        public AnonymousClass23() {
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$3 */
    /* loaded from: classes12.dex */
    public class AnonymousClass3 implements Runnable {
        public final /* synthetic */ Object val$quitFence;
        public final /* synthetic */ boolean[] val$timeout;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$3__run$___twin___() {
            synchronized (r2) {
                r3[0] = false;
                r2.notifyAll();
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
            boolean LIZ;
            try {
                anonymousClass3.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$3__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass3(Object obj, boolean[] zArr) {
            r2 = obj;
            r3 = zArr;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$4 */
    /* loaded from: classes12.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ Cert val$cert;
        public final /* synthetic */ int val$flag;
        public final /* synthetic */ AudioRecordThread.IAudioRecordThreadObserver val$observer;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$4__run$___twin___() {
            LiveCoreImpl liveCoreImpl = LiveCoreImpl.this;
            ILiveStream iLiveStream = liveCoreImpl.mLiveStream;
            if (iLiveStream != null) {
                if (liveCoreImpl.mScreenAudioPlaybackObserver != null) {
                    iLiveStream.registerScreenAudioPlayBack(null, r2, null);
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! register again, why?");
                    if (!AnonymousClass028.LJI(androidRuntimeException, "LiveCoreImpl.registerScreenAudioPlayBack")) {
                        LiveCoreImpl.this.mScreenAudioPlaybackObserver.release();
                        LiveCoreImpl.this.mScreenAudioPlaybackObserver = null;
                    } else {
                        throw androidRuntimeException;
                    }
                }
                if (r2 == 1) {
                    LiveCoreImpl liveCoreImpl2 = LiveCoreImpl.this;
                    liveCoreImpl2.mScreenAudioPlaybackObserver = new ScreenAudioPlaybackObserver(liveCoreImpl2.createInputAudioStream(), r3, LiveCoreImpl.this.mAudioDeviceModule);
                    LiveStream liveStream = (LiveStream) LiveCoreImpl.this.mLiveStream;
                    if (liveStream != null && liveStream.getLiveStreamBuilder() != null) {
                        LiveCoreImpl.this.mScreenAudioPlaybackObserver.setVolume(liveStream.getLiveStreamBuilder().getGameInnerVolume());
                    }
                }
                LiveCoreImpl liveCoreImpl3 = LiveCoreImpl.this;
                liveCoreImpl3.mLiveStream.registerScreenAudioPlayBack(liveCoreImpl3.mScreenAudioPlaybackObserver, r2, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
            boolean LIZ;
            try {
                anonymousClass4.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$4__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass4(int i, AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, Cert cert) {
            r2 = i;
            r3 = iAudioRecordThreadObserver;
            r4 = cert;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$5 */
    /* loaded from: classes12.dex */
    public class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$5__run$___twin___() {
            ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
            if (iLiveStream != null) {
                iLiveStream.unregisterScreenAudioPlayBack();
            }
            ScreenAudioPlaybackObserver screenAudioPlaybackObserver = LiveCoreImpl.this.mScreenAudioPlaybackObserver;
            if (screenAudioPlaybackObserver != null) {
                screenAudioPlaybackObserver.release();
                LiveCoreImpl.this.mScreenAudioPlaybackObserver = null;
            }
        }

        public AnonymousClass5() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
            boolean LIZ;
            try {
                anonymousClass5.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$5__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$8 */
    /* loaded from: classes12.dex */
    public class AnonymousClass8 implements Runnable {
        public final /* synthetic */ int val$flag;
        public final /* synthetic */ String val$key;
        public final /* synthetic */ String val$value;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$8__run$___twin___() {
            ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
            if (iLiveStream != null) {
                iLiveStream.addUserMetaData(r2, r3, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
            boolean LIZ;
            try {
                anonymousClass8.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$8__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass8(String str, String str2, int i) {
            r2 = str;
            r3 = str2;
            r4 = i;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$9 */
    /* loaded from: classes12.dex */
    public class AnonymousClass9 implements Runnable {
        public final /* synthetic */ long val$diff;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$9__run$___twin___() {
            ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
            if (iLiveStream != null) {
                iLiveStream.setSeiCurrentShiftDiffTime(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
            boolean LIZ;
            try {
                anonymousClass9.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$9__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass9(long j) {
            r2 = j;
        }
    }

    public static /* synthetic */ SurfaceCallbackManager lambda$semisugar$$init$$0() {
        return new SurfaceCallbackManager();
    }

    public synchronized Object[] getLiveCoreCallStacks() {
        return callStatcks.toArray();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public synchronized void release() {
        Looper looper;
        Thread thread;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("begin release ");
        LIZ.append(this);
        AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ));
        postLiveCoreLog(false);
        unregisterScreenAudioPlayBack();
        this.mDisplayView = null;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            ((LiveStream) iLiveStream).setAudioFrameAvailableListener(null);
            ((LiveStream) this.mLiveStream).setTextureFrameAvailableListener(null);
            ((LiveStream) this.mLiveStream).setRenderSink(null);
            IFilterManager videoFilterMgr = this.mLiveStream.getVideoFilterMgr();
            if (videoFilterMgr != null) {
                videoFilterMgr.setFindContourListener(null);
            }
        }
        synchronized (this.mTextureFrameListenersFence) {
            this.mTextureFrameListeners.clear();
        }
        synchronized (this.mAudioFrameListenersFence) {
            this.mAudioFrameListeners.clear();
        }
        stopAudioCapture();
        stopVideoCapture();
        stopAudioPlayer();
        if (this.mRenderView != null) {
            ILiveStream iLiveStream2 = this.mLiveStream;
            if (iLiveStream2 instanceof LiveStream) {
                ((LiveStream) iLiveStream2).setRenderSink(null);
            }
        }
        stop();
        ILiveStream iLiveStream3 = this.mLiveStream;
        if (iLiveStream3 != null) {
            iLiveStream3.release();
        }
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.release();
            this.mRenderView = null;
        }
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.2
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$2__run$___twin___() {
                LiveCoreImpl.this.mAudioDeviceModule.stopPlayer();
                LiveCoreImpl.this.mAudioDeviceModule.stopRecording();
                LiveCoreImpl.this.mAudioDeviceModule.release();
                LiveCoreImpl liveCoreImpl = LiveCoreImpl.this;
                liveCoreImpl.mAudioDeviceModule = null;
                SurfaceCallbackManager surfaceCallbackManager = liveCoreImpl.mSurfaceCallbackManager;
                liveCoreImpl.mSurfaceCallbackManager = null;
                if (surfaceCallbackManager != null) {
                    surfaceCallbackManager.release();
                }
            }

            public AnonymousClass2() {
            }

            public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ2;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$2__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        Object obj = new Object();
        boolean[] zArr = {true};
        synchronized (obj) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.3
                public final /* synthetic */ Object val$quitFence;
                public final /* synthetic */ boolean[] val$timeout;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$3__run$___twin___() {
                    synchronized (r2) {
                        r3[0] = false;
                        r2.notifyAll();
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$3_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass3 anonymousClass3) {
                    boolean LIZ2;
                    try {
                        anonymousClass3.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$3__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }

                public AnonymousClass3(Object obj2, boolean[] zArr2) {
                    r2 = obj2;
                    r3 = zArr2;
                }
            });
            try {
                obj2.wait(500L);
                if (zArr2[0] && (looper = this.mWorkThreadHandler.getLooper()) != null && (thread = looper.getThread()) != null) {
                    LiveStream.dumpJavaThreadStackIfNeed(thread, "LiveCoreImpl");
                }
            } catch (InterruptedException unused) {
            }
        }
        SafeHandlerThread safeHandlerThread = this.mWorkThread;
        if (safeHandlerThread != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread);
            this.mWorkThread = null;
        }
        GLThread gLThread = this.mVideoCaptureThread;
        if (gLThread != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(gLThread);
            this.mVideoCaptureThread = null;
        }
        SafeHandlerThread safeHandlerThread2 = this.mLogUploadThread;
        if (safeHandlerThread2 != null) {
            SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread2);
            this.mLogUploadThread = null;
        }
        IAudioDeviceControl iAudioDeviceControl = this.mAudioDeviceControl;
        if (iAudioDeviceControl != null) {
            ((AudioDeviceControl) iAudioDeviceControl).release();
            this.mAudioDeviceControl = null;
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            ((LayerControl) iLayerControlExt).release();
            this.mLayerControl = null;
        }
        VideoSink videoSink = this.mCameraVideoSink;
        if (videoSink != null) {
            videoSink.release();
            this.mCameraVideoSink = null;
        }
        this.mWorkThread = null;
        this.mVideoCaptureThread = null;
        this.mLogUploadThread = null;
        this.mInfoListener = null;
        this.mErrorListener = null;
        this.mRtcExtraDataListener = null;
        this.mLiveStream = null;
        this.mWarningListener = null;
        this.mLiveStreamLogService.release();
        if (!this.mEnableAutoGlRecycler) {
            GLThreadManager.dispose();
        }
        synchronized (callStatcks) {
            String str = this.currentCallStack;
            if (str != null) {
                callStatcks.remove(str);
                this.currentCallStack = null;
            }
            Iterator<String> it = callStatcks.iterator();
            while (it.hasNext()) {
                String next = it.next();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("current remain livecores:");
                LIZ2.append(next);
                AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ2));
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("end release ");
        LIZ3.append(this);
        LIZ3.append(": ");
        LIZ3.append(callStatcks.size());
        AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ3));
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$14 */
    /* loaded from: classes12.dex */
    public class AnonymousClass14 implements Runnable {
        public final /* synthetic */ String val$sdkParamsNew;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$14__run$___twin___() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Calling updateSdkParams:");
            LIZ.append(r2);
            AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ));
            AudioDeviceModule audioDeviceModule = LiveCoreImpl.this.mAudioDeviceModule;
            if (audioDeviceModule != null && audioDeviceModule.getAdmType() == 1) {
                try {
                    LiveCoreImpl.this.updateByteAudioConfig(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(new JSONObject(r2), "PushBase"), "adm_server_cfg"));
                } catch (Throwable unused) {
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
            boolean LIZ;
            try {
                anonymousClass14.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$14__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass14(String str) {
            r2 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$17 */
    /* loaded from: classes12.dex */
    public class AnonymousClass17 implements Runnable {
        public final /* synthetic */ boolean val$planarRender;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$17__run$___twin___() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setDisplayPlanarRender:");
            LIZ.append(r2);
            AVLog.logKibana(4, "LiveCoreImpl", X1D.LIZIZ(LIZ), null);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setDisplayPlanarRender:");
            LIZ2.append(r2);
            AVLog.w("LiveCoreImpl", X1D.LIZIZ(LIZ2));
            VideoMixer videoMixer = LiveCoreImpl.this.mLayerControl.getVideoMixer();
            if (videoMixer != null) {
                TEBundle tEBundle = new TEBundle();
                videoMixer.getParameter(tEBundle);
                tEBundle.setBool("vmixer_planar_render", LiveCoreImpl.this.mDisplayPlanarRender);
                videoMixer.setParameter(tEBundle);
                if (r2) {
                    videoMixer.setEnable(true);
                }
                tEBundle.release();
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass17 anonymousClass17) {
            boolean LIZ;
            try {
                anonymousClass17.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$17__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass17(boolean z) {
            r2 = z;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$18 */
    /* loaded from: classes12.dex */
    public class AnonymousClass18 implements Runnable {
        public final /* synthetic */ int val$bgColor;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$18__run$___twin___() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setDisplayMixBgColor:");
            LIZ.append(r2);
            AVLog.logKibana(4, "LiveCoreImpl", X1D.LIZIZ(LIZ), null);
            VideoMixer videoMixer = LiveCoreImpl.this.mLayerControl.getVideoMixer();
            if (videoMixer != null) {
                TEBundle tEBundle = new TEBundle();
                videoMixer.getParameter(tEBundle);
                tEBundle.setInt("vmixer_bg_color", r2);
                videoMixer.setParameter(tEBundle);
                tEBundle.release();
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass18 anonymousClass18) {
            boolean LIZ;
            try {
                anonymousClass18.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$18__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass18(int i) {
            r2 = i;
        }
    }

    /* loaded from: classes12.dex */
    public static class EffectPerfStrategy {
        public IStrategyCallback callback;
        public boolean isEnable;
        public int resolutionThresholdHeight;
        public int resolutionThresholdWidth;
        public String type;

        /* loaded from: classes12.dex */
        public interface IStrategyCallback {
            void onExecute();

            void onReset();
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EffectPerfStrategy{type='");
            Q89.LIZIZ(LIZ, this.type, '\'', ", isEnable=");
            LIZ.append(this.isEnable);
            LIZ.append(", resolutionThresholdWidth=");
            LIZ.append(this.resolutionThresholdWidth);
            LIZ.append(", resolutionThresholdHeight=");
            return b0.LIZJ(LIZ, this.resolutionThresholdHeight, '}', LIZ);
        }
    }

    /* loaded from: classes12.dex */
    public static class LiveCoreRoiSwitch extends LiveStream.RoiSwitch {
        public volatile HashSet<Integer> roiMap;

        @Override // com.ss.ttlivestreamer.livestreamv2.LiveStream.RoiSwitch
        public boolean shouldOpenRoi() {
            if (super.shouldOpenRoi() || !this.roiMap.isEmpty()) {
                return true;
            }
            return false;
        }

        public LiveCoreRoiSwitch(LiveStream liveStream) {
            super(liveStream);
            this.roiMap = new HashSet<>();
        }

        public void changeRoiMap(int i, boolean z) {
            synchronized (this.roiMap) {
                if (!z) {
                    this.roiMap.remove(Integer.valueOf(i));
                } else {
                    this.roiMap.add(Integer.valueOf(i));
                }
            }
            checkRoiSwitch();
        }
    }

    private void configCameraLayer() {
        String uuid = MiscUtils.getUUID("cam");
        ILayerControlExt.ILayerExt createLayerExt = this.mLayerControl.createLayerExt(uuid, null, getBuilder().getVideoCaptureWidth(), getBuilder().getVideoCaptureHeight(), 2);
        this.mLayerControl.setLocalOrigin(uuid);
        VideoMixer.VideoMixerDescription FILL = VideoMixer.VideoMixerDescription.FILL();
        FILL.setMode(2);
        createLayerExt.updateDescription(FILL);
        createLayerExt.setEnable(true);
        this.mCameraStreamLayer = createLayerExt;
        AnonymousClass21 anonymousClass21 = new VideoSink() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.21
            @Override // com.ss.ttlivestreamer.core.engine.VideoSink
            public void OnDiscardedFrame() {
            }

            public AnonymousClass21() {
            }

            @Override // com.ss.ttlivestreamer.core.engine.VideoSink
            public void onFrame(VideoFrame videoFrame) {
                LiveCoreImpl liveCoreImpl = LiveCoreImpl.this;
                if (liveCoreImpl.mCameraFirstReport) {
                    liveCoreImpl.reportLiveCoreInfo(28, liveCoreImpl.getBuilder().getVideoCaptureDevice(), 0);
                    LiveCoreImpl.this.mCameraFirstReport = false;
                }
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null) {
                    ((LiveStream) iLiveStream).captureFirstFrameNotify();
                }
                ILayerControlExt.ILayerExt iLayerExt = LiveCoreImpl.this.mCameraStreamLayer;
                if (iLayerExt != null) {
                    iLayerExt.renderFrame(videoFrame);
                }
            }
        };
        this.mCameraVideoSink = anonymousClass21;
        ((LiveStream) this.mLiveStream).setRenderSink(anonymousClass21);
    }

    public /* synthetic */ void lambda$getLiveStreamInfo$2() {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            int micVolumedB = (int) audioDeviceModule.getMicVolumedB();
            synchronized (this.mLiveStreamReport) {
                this.mLiveStreamReport.setADMMicVolumedB(micVolumedB);
            }
        }
    }

    private void startReportNetworkQuality() {
        TimerTaskUtils.addTask(new IDRunnableS6S0101000(8, this, 36), LiveNetAdaptiveHurryTimeSetting.DEFAULT, "ReportNetworkQuality");
    }

    private void stopReportNetworkQuality() {
        TimerTaskUtils.removeTask("ReportNetworkQuality");
    }

    public void addSeiForVideoE2EDelay() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("capture_ntp_ts", TimeUtils.getServerTimeMSec());
            updateRtcSei("video_e2e_delay", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean audioMute() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null && iLiveStream.audioMute()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputAudioStream createInputAudioStream() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.createInputAudioStream();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputVideoStream createInputVideoStream() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.createInputVideoStream();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public IAVPlayer createPlayer() {
        try {
            Class<?> cls = Class.forName("com.ss.ttlivestreamer.livestreamv2.player.AVPlayer");
            Class<?> cls2 = Integer.TYPE;
            return (IAVPlayer) cls.getConstructor(IAudioDeviceControl.class, cls2, cls2).newInstance(this.mAudioDeviceControl, Integer.valueOf(getBuilder().getAudioSampleHZ()), Integer.valueOf(getBuilder().getAudioChannel()));
        } catch (Exception e) {
            AVLog.ioe("LiveCoreImpl", "Not found AVPlayer", e);
            return null;
        }
    }

    public void deleteBackgroundTexture() {
        int i = this.mBackgroundTex;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            GlUtil.checkNoGLES2Error("deleteBackgroundTex");
            this.mBackgroundTex = 0;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public JSONObject getAudioDiagnosisScore() {
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            return audioDeviceModule.getAudioDiagnosisScore();
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IAudioFilterManager getAudioFilterMgr() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getAudioFilterMgr();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IAudioRecordManager getAudioRecorderMgr() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getAudioRecorderMgr();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public JSONObject getDebugInfo() {
        String str;
        char c;
        String str2;
        String str3;
        String str4;
        String str5;
        JSONObject jSONObject = new JSONObject();
        LiveCore.Builder internalBuilder = getInternalBuilder();
        LiveStreamReport liveStreamReport = new LiveStreamReport();
        getLiveStreamInfo(liveStreamReport);
        try {
            if (internalBuilder.getAdmType() == 0) {
                str = "adm";
            } else {
                str = "byteaudio";
            }
            jSONObject.put("AudioType", str);
            String str6 = internalBuilder.getSdkSetting().suggestProtocol;
            switch (str6.hashCode()) {
                case 106008:
                    if (str6.equals("kcp")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 114657:
                    if (str6.equals("tcp")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 114939:
                    if (str6.equals("tls")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3482174:
                    if (str6.equals("quic")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            String str7 = "rtmp";
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c == 3) {
                            str7 = "rtmps";
                        }
                    } else {
                        str7 = "rtmpq";
                    }
                } else {
                    str7 = "rtmpk";
                }
            }
            jSONObject.put("PushStreamProtocol", str7);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("IsEnablePSNR()", internalBuilder.isEnablePSNR());
            jSONObject2.put("PSNRFromNoKeyFrame", liveStreamReport.getVideoEncodePSNRFromNoKeyFrame());
            jSONObject.put("PSNR", jSONObject2);
            if (internalBuilder.isVECamera2API()) {
                str2 = "Camera2API";
            } else {
                str2 = "Camera1API";
            }
            jSONObject.put("CameraAPIType", str2);
            int i = this.mQuality;
            if (i == 1) {
                str3 = "Good";
            } else if (i == 2) {
                str3 = "Poor";
            } else {
                str3 = "Bad";
            }
            jSONObject.put("NetworkQuality", str3);
            JSONObject jSONObject3 = new JSONObject();
            String str8 = "";
            if (internalBuilder.getAudioEncoder() == 2) {
                str4 = "MediaCodec";
            } else if (internalBuilder.getAudioEncoder() == 3) {
                str4 = "ffmpeg";
            } else if (internalBuilder.getAudioEncoder() != 1) {
                str4 = "";
            } else {
                str4 = "fdk-aac";
            }
            jSONObject3.put("AudioEncoder", str4);
            jSONObject3.put("AudioEncodeRateKbps", ((int) liveStreamReport.getAudioEncodeRealBps()) / 1000.0d);
            int audioProfile = internalBuilder.getAudioProfile();
            if (audioProfile != 1) {
                if (audioProfile != 2) {
                    if (audioProfile == 3) {
                        str8 = "HEv2";
                    }
                } else {
                    str8 = "HE";
                }
            } else {
                str8 = "LC";
            }
            if (internalBuilder.getAudioChannel() == 1) {
                str5 = "mono";
            } else {
                str5 = "stereo";
            }
            jSONObject3.put("AudioProfile", str8);
            jSONObject3.put("AudioChannel", str5);
            jSONObject3.put("AudioSampleHZ", internalBuilder.getAudioSampleHZ());
            jSONObject.put("AudioEncode", jSONObject3);
            jSONObject.put("IsEnableAEC", this.mAudioDeviceModule.isEnableBuiltInAEC());
            jSONObject.put("IsEnableNS", this.mAudioDeviceModule.isEnableBuiltInNS());
            jSONObject.put("IsEnableAGC", this.mAudioDeviceModule.isEnableBuiltInAGC());
            jSONObject.put("SupportEarMonitor", this.mSupportEarMonitor);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("Height", internalBuilder.getVideoCaptureHeight());
            jSONObject4.put("Width", internalBuilder.getVideoCaptureWidth());
            jSONObject.put("CaptureResolution", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("Height", ((LayerControl) this.mLayerControl).getRenderViewHeight());
            jSONObject5.put("Width", ((LayerControl) this.mLayerControl).getRenderViewWidth());
            jSONObject.put("PreviewResolution", jSONObject5);
            jSONObject.put("cameraAlgorithmState", this.mLiveStream.getVideoCapturerControl().getCameraAlgorithmState());
            jSONObject.put("LiveCoreAddition", (Object) null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        liveStreamReport.release();
        return jSONObject;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public LiveCore.Builder getInternalBuilder() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream == null) {
            AVLog.ioe("LiveCoreImpl", "getInternalBuilder() while LiveStream is null", new AndroidRuntimeException("getInternalBuilder() while LiveStream is null"));
            return new LiveCore.Builder();
        }
        return (LiveCore.Builder) liveStream.getLiveStreamBuilder();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public LiveStreamOption getOption() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getOption();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputAudioStream getOriginInputAudioStream() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getOriginInputAudioStream();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputVideoStream getOriginInputVideoStream() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getOriginInputVideoStream();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public boolean getPreviewFitMode() {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isFitMode();
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            return iLayerControlExt.isFitMode();
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IRecorderManager getRecorderMgr() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getRecorderMgr();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public int getScreenAudioLevel() {
        ScreenAudioPlaybackObserver screenAudioPlaybackObserver = this.mScreenAudioPlaybackObserver;
        if (screenAudioPlaybackObserver != null) {
            return screenAudioPlaybackObserver.getPowerDb();
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public List<String> getUrls() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            return liveStream.getUrls();
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public String getVersion() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return "";
        }
        return iLiveStream.getVersion();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IVideoCapturerControl getVideoCapturerControl() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getVideoCapturerControl();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IFilterManager getVideoFilterMgr() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.getVideoFilterMgr();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public VsyncModule getVsyncModule() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            return liveStream.getEncodeStreamVsyncModule();
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean isStreaming() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            return iLiveStream.isStreaming();
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void pause() {
        AVLog.ioi("LiveCoreImpl", "begin pause");
        this.mIsPause = true;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.pause();
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            iLayerControlExt.pause();
        }
        AVLog.ioi("LiveCoreImpl", "end pause");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void releaseBackgroundImage() {
        Handler handler = this.mVideoCaptureHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.11
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$11__run$___twin___() {
                    ILayerControlExt iLayerControlExt = LiveCoreImpl.this.mLayerControl;
                    if (iLayerControlExt != null && iLayerControlExt.getLayer("single_view_background") != null) {
                        LiveCoreImpl.this.mLayerControl.removeLayer("single_view_background");
                    }
                    LiveCoreImpl.this.deleteBackgroundTexture();
                }

                public AnonymousClass11() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                    boolean LIZ;
                    try {
                        anonymousClass11.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$11__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void requestKeyFrame() {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            liveStream.requestKeyFrame();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void resetSdkParams() {
        String str;
        if (getBuilder().getSdkParams() != null) {
            str = getBuilder().getSdkParams().toString();
        } else {
            str = "{}";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resetSdkParams:");
        LIZ.append(str);
        AVLog.logKibana(4, "LiveCoreImpl", X1D.LIZIZ(LIZ), null);
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "PushBase");
            jSONObject2.put("width", getBuilder().getVideoWidth());
            jSONObject2.put("height", getBuilder().getVideoHeight());
            jSONObject2.put("cap_adapted_width", getBuilder().getVideoWidth());
            jSONObject2.put("cap_adapted_height", getBuilder().getVideoHeight());
            jSONObject2.put("bitrateRatio", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            jSONObject.put("PushBase", jSONObject2);
            str = jSONObject.toString();
        } catch (Exception unused) {
        }
        updateSdkParams(str);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void resume() {
        AVLog.ioi("LiveCoreImpl", "begin resume");
        this.mIsPause = false;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.resume();
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            iLayerControlExt.resume();
        }
        AVLog.ioi("LiveCoreImpl", "end resume");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void startAudioCapture() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.startAudioCapture();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public int startAudioPlayer() {
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.12
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$12__run$___twin___() {
                AudioDeviceModule audioDeviceModule = LiveCoreImpl.this.mAudioDeviceModule;
                if (audioDeviceModule != null) {
                    int startPlayer = audioDeviceModule.startPlayer();
                    if (startPlayer != 0) {
                        LiveCoreImpl.this.reportLiveCoreError(8, startPlayer, new Exception("ADM startPlayer error"));
                    } else {
                        LiveCoreImpl.this.reportLiveCoreInfo(18, 0, 0);
                    }
                }
            }

            public AnonymousClass12() {
            }

            public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
                boolean LIZ;
                try {
                    anonymousClass12.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$12__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void startVideoCapture() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.startVideoCapture();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int status() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            return iLiveStream.status();
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void stopAudioCapture() {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.stopAudioCapture();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public int stopAudioPlayer() {
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.13
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$13__run$___twin___() {
                AudioDeviceModule audioDeviceModule = LiveCoreImpl.this.mAudioDeviceModule;
                if (audioDeviceModule != null) {
                    int stopPlayer = audioDeviceModule.stopPlayer();
                    if (stopPlayer != 0) {
                        LiveCoreImpl.this.reportLiveCoreError(8, stopPlayer, new Exception("ADM stopPlayer error"));
                    } else {
                        LiveCoreImpl.this.reportLiveCoreInfo(19, 0, 0);
                    }
                }
            }

            public AnonymousClass13() {
            }

            public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
                boolean LIZ;
                try {
                    anonymousClass13.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$13__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        });
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void stopVideoCapture() {
        this.mWorkThreadHandler.post(new ARunnableS13S0101000_9(6, this, 6));
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.stopVideoCapture();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore, com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int turnOffEffectDowngradingStrategy() {
        EffectPerfStrategy.IStrategyCallback iStrategyCallback;
        EffectPerfStrategy.IStrategyCallback iStrategyCallback2;
        EffectPerfStrategy effectPerfStrategy = this.mEffectFaceStrategy;
        if (effectPerfStrategy != null && (iStrategyCallback2 = effectPerfStrategy.callback) != null) {
            iStrategyCallback2.onReset();
        }
        EffectPerfStrategy effectPerfStrategy2 = this.mEffectMattingStrategy;
        if (effectPerfStrategy2 != null && (iStrategyCallback = effectPerfStrategy2.callback) != null) {
            iStrategyCallback.onReset();
            return 0;
        }
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void unregisterScreenAudioPlayBack() {
        AVLog.logKibana(4, "LiveCoreImpl", "unregisterScreenAudioPlayBack", null);
        if (this.mScreenAudioPlaybackObserver != null) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.5
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$5__run$___twin___() {
                    ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                    if (iLiveStream != null) {
                        iLiveStream.unregisterScreenAudioPlayBack();
                    }
                    ScreenAudioPlaybackObserver screenAudioPlaybackObserver = LiveCoreImpl.this.mScreenAudioPlaybackObserver;
                    if (screenAudioPlaybackObserver != null) {
                        screenAudioPlaybackObserver.release();
                        LiveCoreImpl.this.mScreenAudioPlaybackObserver = null;
                    }
                }

                public AnonymousClass5() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                    boolean LIZ;
                    try {
                        anonymousClass5.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$5__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r4 > (r7 / 3)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r3 == 2) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void lambda$startReportNetworkQuality$1() {
        /*
            r9 = this;
            com.ss.ttlivestreamer.livestreamv2.core.LiveCore$Builder r5 = r9.getBuilder()
            if (r5 != 0) goto L7
            return
        L7:
            com.ss.ttlivestreamer.livestreamv2.ILiveStream r8 = r9.mLiveStream
            boolean r0 = r8 instanceof com.ss.ttlivestreamer.livestreamv2.LiveStream
            if (r0 != 0) goto Le
            return
        Le:
            int r7 = r5.getVideoFps()
            java.lang.String r0 = "estream_transport_real_fps"
            double r0 = r8.getStaticsInfoWithKey(r0)
            int r4 = (int) r0
            java.lang.String r0 = "estream_transport_real_bps"
            double r2 = r8.getStaticsInfoWithKey(r0)
            int r1 = (int) r2
            r0 = 102(0x66, float:1.43E-43)
            r6 = 1
            r9.reportLiveCoreInfo(r0, r6, r4)
            r0 = 103(0x67, float:1.44E-43)
            r9.reportLiveCoreInfo(r0, r6, r1)
            boolean r0 = r5.isEnableNewNetWorkQuality()
            r5 = 2
            r1 = 3
            if (r0 != 0) goto L47
            int r0 = r7 * 2
            int r0 = r0 / r1
            if (r4 <= r0) goto L41
        L38:
            r5 = 1
        L39:
            r9.mQuality = r5
            r0 = 101(0x65, float:1.42E-43)
            r9.reportLiveCoreInfo(r0, r6, r5)
            return
        L41:
            if (r0 < r4) goto L63
            int r7 = r7 / r1
            if (r4 <= r7) goto L63
            goto L39
        L47:
            com.ss.ttlivestreamer.livestreamv2.LiveStream r8 = (com.ss.ttlivestreamer.livestreamv2.LiveStream) r8
            r0 = 3000(0xbb8, float:4.204E-42)
            long r3 = r8.getInt64Value(r0)
            r1 = 3
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L38
            r1 = 4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L5c
            goto L38
        L5c:
            r1 = 2
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L63
            goto L39
        L63:
            r5 = 3
            goto L39
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.lambda$startReportNetworkQuality$1():void");
    }

    private void postSAMIDiagnosisLog() {
        LiveCore.Builder builder = getBuilder();
        try {
            System.currentTimeMillis();
            JSONObject jSONObject = new JSONObject();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("{");
            LIZ.append(this.mAudioDeviceModule.getDiagnosisFinalResult());
            LIZ.append("}");
            JSONObject put = jSONObject.put("audio_metrics_end_info", X1D.LIZIZ(LIZ)).put("url", ((LiveStream) this.mLiveStream).getUrls()).put("mode", "push").put("event_key", "push_audiometrics_end_event").put("livecore_event_index", LiveCore.sUploadLogIndex.incrementAndGet()).put("livecore_app_alive_uuid", LiveCore.sUploadLogUUID);
            LiveCore.Builder.ILogMonitor logMonitor = builder.getLogMonitor();
            if (logMonitor != null) {
                logMonitor.onLogMonitor("live_client_monitor_log", put);
            }
        } catch (Exception e) {
            StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "Create postSAMIDiagnosis log error: ");
            LIZIZ.append(e.toString());
            AVLog.ioe("LiveCoreImpl", X1D.LIZIZ(LIZIZ));
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void stop() {
        stopReportNetworkQuality();
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.stop();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public AudioDeviceModule getADM() {
        return this.mAudioDeviceModule;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public IAudioDeviceControl getAudioDeviceControl() {
        return this.mAudioDeviceControl;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public View getCurrentDisplay() {
        return this.mDisplayView;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public ILayerControl getLayerControl() {
        return this.mLayerControl;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public int getMirrorState() {
        return this.mMirror;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int getVideoCaptureDevice() {
        return this.mVideoCaptureDeviceType;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public Handler getWorkThreadHandler() {
        return this.mWorkThreadHandler;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public boolean isCameraRunning() {
        return this.mIsCameraRunning;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public boolean isMicRunning() {
        return this.mIsMicRunning;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.BackgroundLayerControl.IPlanarRenderCheck
    public boolean isPlanarRender() {
        return this.mDisplayPlanarRender;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public boolean isPushingBlackFrame() {
        return this.mIsPushingBlackFrame;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public boolean isScreenCaptureRunning() {
        return this.mIsScreenCaptureRunning;
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$1 */
    /* loaded from: classes12.dex */
    public class AnonymousClass1 implements IFilterManager.FindContourListener {
        public AnonymousClass1() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager.FindContourListener
        public void onSendFindContourSei(ByteBuffer byteBuffer, long j, int i) {
            LiveCore.Builder builder = LiveCoreImpl.this.getBuilder();
            if (builder != null && builder.getInteract().enableSendContourInfoToRtc && byteBuffer != null) {
                if (i == 2) {
                    LiveCoreImpl.this.updateRtcSei("contour_info", byteBuffer);
                    return;
                }
                if (i != 1) {
                    return;
                }
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                byteBuffer.position(0);
                String bytesToHexString = ZlibCompressUtils.bytesToHexString(bArr);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("data", bytesToHexString);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
                LiveCoreImpl.this.updateRtcSei("contour_info", jSONObject.toString());
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$16 */
    /* loaded from: classes12.dex */
    public class AnonymousClass16 implements GLRenderVideoSink.GlRenderInfoListener {
        public AnonymousClass16() {
        }

        @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.GlRenderInfoListener
        public void onInfo(int i, int i2, int i3) {
            if (i == 1) {
                LiveCoreImpl.this.reportLiveCoreInfo(301, i2, i3);
                AVLog.ioi("LiveCoreImpl", "MSG_EGL_SURFACE_DESTROYED  from livecore");
            } else {
                if (i != 2) {
                    return;
                }
                LiveCoreImpl.this.reportLiveCoreInfo(302, i2, i3);
                AVLog.ioi("LiveCoreImpl", "MSG_EGL_SURFACE_WILL_BE_CREATED  from livecore");
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$21 */
    /* loaded from: classes12.dex */
    public class AnonymousClass21 extends VideoSink {
        @Override // com.ss.ttlivestreamer.core.engine.VideoSink
        public void OnDiscardedFrame() {
        }

        public AnonymousClass21() {
        }

        @Override // com.ss.ttlivestreamer.core.engine.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            LiveCoreImpl liveCoreImpl = LiveCoreImpl.this;
            if (liveCoreImpl.mCameraFirstReport) {
                liveCoreImpl.reportLiveCoreInfo(28, liveCoreImpl.getBuilder().getVideoCaptureDevice(), 0);
                LiveCoreImpl.this.mCameraFirstReport = false;
            }
            ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
            if (iLiveStream != null) {
                ((LiveStream) iLiveStream).captureFirstFrameNotify();
            }
            ILayerControlExt.ILayerExt iLayerExt = LiveCoreImpl.this.mCameraStreamLayer;
            if (iLayerExt != null) {
                iLayerExt.renderFrame(videoFrame);
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$7 */
    /* loaded from: classes12.dex */
    public class AnonymousClass7 implements ILiveStream.ILiveStreamErrorListener {
        public AnonymousClass7() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamErrorListener
        public void onError(int i, int i2, Exception exc) {
            LiveStreamLogService liveStreamLogService = LiveCoreImpl.this.mLiveStreamLogService;
            if (liveStreamLogService != null) {
                liveStreamLogService.extError(i, i2, exc);
            }
            LiveCoreImpl.this.reportLiveCoreError(i, i2, exc);
        }
    }

    public LiveCoreImpl(LiveCore.Builder builder) {
        String str;
        boolean z;
        this.mEnableAutoGlRecycler = false;
        boolean disableLiveCoreBinLog = builder.getSdkSetting().switchParams.getDisableLiveCoreBinLog();
        if (builder.getContext() != null) {
            initLogFile(builder.getContext(), disableLiveCoreBinLog);
        }
        this.mE2EVideoDelaySampleInterval = builder.getVideoE2EDelaySampleInterval();
        TTLSConstantsLifecycleCallback.onInit(builder);
        AVLog.disableLogFile(disableLiveCoreBinLog);
        AVLog.setLevel(builder.getSdkSetting().switchParams.getLogLevel());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create livecore ");
        LIZ.append(this);
        AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ));
        LogUtil.setLogFilterSwitch(builder.isFilterLogSwitch());
        this.mEnableAutoGlRecycler = builder.getAutoGlRecycler();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("GLThreadManager using auto recycler ");
        LIZ2.append(this.mEnableAutoGlRecycler);
        AVLog.iow("LiveCoreImpl", X1D.LIZIZ(LIZ2));
        if (!this.mEnableAutoGlRecycler) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("GLThreadManager using auto recycler ");
            LIZ3.append(this.mEnableAutoGlRecycler);
            AVLog.iow("LiveCoreImpl", X1D.LIZIZ(LIZ3));
            GLThreadManager.addRefWithEnableAutoGlRecycler(this.mEnableAutoGlRecycler);
        }
        synchronized (callStatcks) {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            this.currentCallStack = stackTraceString;
            callStatcks.add(stackTraceString);
        }
        this.mWorkThread = TTLSPreInitBusiness.getInstance().getThread("LiveCoreWorkThread");
        this.mLogUploadThread = TTLSPreInitBusiness.getInstance().getThread("LiveCoreLogUploadThread");
        this.mVideoCaptureThread = TTLSPreInitBusiness.getInstance().getGlThread("LiveCoreVideoCaptureThread");
        if (this.mWorkThread == null) {
            SafeHandlerThread workerThread = LiveStreamThreadPriorityUtils.getWorkerThread();
            this.mWorkThread = workerThread;
            workerThread.start();
        }
        this.mWorkThreadHandler = this.mWorkThread.getHandler();
        if (this.mLogUploadThread == null) {
            SafeHandlerThread lockThread = SafeHandlerThreadPoolExecutor.lockThread("LiveCoreLogUploadThread");
            this.mLogUploadThread = lockThread;
            lockThread.start();
        }
        this.mLogUploadThread.setPriority(1);
        this.mLogUploadThreadHandler = this.mLogUploadThread.getHandler();
        if (this.mVideoCaptureThread == null) {
            GLThread videoCaptureThread = LiveStreamThreadPriorityUtils.getVideoCaptureThread();
            this.mVideoCaptureThread = videoCaptureThread;
            videoCaptureThread.start();
        }
        this.mVideoCaptureHandler = this.mVideoCaptureThread.getHandler();
        boolean z2 = builder.getPushBase().enableAudioPipelineOpt;
        if (builder.getVideoCaptureDevice() == 3) {
            this.mAudioDeviceModule = new AudioDeviceModule(this, builder.getContext(), this.mWorkThreadHandler, builder.getAdmType(), 1, z2);
        } else {
            this.mAudioDeviceModule = new AudioDeviceModule(this, builder.getContext(), this.mWorkThreadHandler, builder.getAdmType(), 0, z2);
        }
        builder.setAdmType(this.mAudioDeviceModule.getAdmType(), builder.getAdmServerCfg());
        this.mAudioDeviceModule.enableAecOnHeadSetMode(builder.isEnableAecOnHeadsetMode());
        this.mAudioDeviceModule.enableAecAutoSwitch(builder.isEnableAecAutoSwitch());
        this.mAudioDeviceModule.setAudioQuantizeGapPeriod(builder.getAudioQuantizeGapPeriod());
        if (builder.isEnableAecAutoSwitch()) {
            this.mAudioDeviceModule.enableBuiltInAEC(false);
        } else {
            this.mAudioDeviceModule.enableBuiltInAEC(true);
        }
        this.mAudioDeviceModule.enableNew3ARmsStatistics(builder.enableNew3ARmsStatistics());
        this.mAudioDeviceModule.enableEchoMode(false);
        this.mAudioDeviceModule.getRenderMixer().setEnable(true);
        TEBundle tEBundle = new TEBundle();
        this.mAudioDeviceModule.getRenderMixer().getParameter(tEBundle);
        tEBundle.setBool("adm_render_mix_enable_read_mode", builder.isEnableADMRenderReadMode());
        this.mAudioDeviceModule.getRenderMixer().setParameter(tEBundle);
        tEBundle.release();
        this.mAudioDeviceModule.setupHeadsetListener();
        this.mAudioDeviceModule.setTimeSyncMode(builder.getPushBase().timestampSynMode);
        this.mAudioDeviceModule.enableEarMonitorRoute(builder.getPushBase().enableEarMonitorRoute);
        this.mAudioDeviceModule.setServerMixStopBaestream(builder.getPushBase().stopBaePushStreamWhenServerMix);
        this.mAudioDeviceModule.enableMicMuteStatusCheck(builder.getPushBase().enableMicMuteStatusCheck);
        TEBundle parameter = this.mAudioDeviceModule.getParameter();
        if (builder.getPushBase().samiDiagnosisInVpaas != null) {
            JSONObject jSONObject = builder.getPushBase().samiDiagnosisInVpaas;
            try {
                parameter.setString("SamiDiagnosisParameters", JSONObjectProtectorUtils.getJSONObject(jSONObject, "SamiDiagnosisParameters").toString());
                parameter.setString("SamiDiagnosisThresholds", JSONObjectProtectorUtils.getJSONObject(jSONObject, "SamiDiagnosisThresholds").toString());
                parameter.setString("SamiDiagnosisModelPath", JSONObjectProtectorUtils.getString(jSONObject, "SamiDiagnosisModelPath"));
                parameter.setBool("SamiEnableDiagnosis", JSONObjectProtectorUtils.getBoolean(jSONObject, "SamiEnableDiagnosis"));
                parameter.setInt("SamiDiagnosisSwitchSampleFreq", JSONObjectProtectorUtils.getInt(jSONObject, "SamiDiagnosisSwitchSampleFreq"));
                parameter.setString("SamiDiagnosisSwitch", JSONObjectProtectorUtils.getJSONObject(jSONObject, "SamiDiagnosisSwitch").toString());
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        parameter.setInt("audio_db_cal_switch", builder.getAudioCalDBSwitch());
        parameter.setInt("audio_sample", builder.getAudioCaptureSampleHZ());
        parameter.setInt("audio_channels", builder.getAudioCaptureChannel());
        parameter.setInt("adm_audio_cap_sample_voip_mode", builder.getAudioCaptureSampleHZOnVoIP());
        parameter.setInt("adm_audio_cap_channel_voip_mode", builder.getAudioCaptureChannelOnVoIP());
        if (builder.usingAecV2Algorithm()) {
            parameter.setInt("adm_enable_agc", builder.usingAudioAgcOnAecV2Mode() ? 1 : 0);
            parameter.setInt("adm_enable_ns", builder.usingAudioRNNoise());
            parameter.setBool("enable_aec_v2", true);
        } else {
            parameter.setDouble("adm_aec_volume_coeff", 2.0d);
        }
        parameter.setDouble("noise_suppress", builder.getNoiseSuppress());
        parameter.setBool("enable_auto_volume", builder.isEnableAutoVolume());
        parameter.setBool("enable_ns_work_thread", builder.getPushBase().enableNsInWorkThread);
        parameter.setBool("enableStereoProcess", builder.getPushBase().enableStereoProcess);
        parameter.setBool("enable_sami_snr", builder.getPushBase().enableSamiSnr);
        parameter.setString("sami_utility", builder.getPushBase().samiUtility);
        if (builder.getAudioCaptureDevice() == 5) {
            parameter.setBool("adm_enable_audio_high_quality", builder.isEnableAudioHighQuality());
            parameter.setBool("adm_using_direct_echo", true);
            if (builder.getAudioQuantizeGapPeriod() > 0) {
                parameter.setInt("adm_audio_record_power_gap_ms", builder.getAudioQuantizeGapPeriod());
            }
        }
        if (LogUtil.logFilterSwitch()) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("ADM: Using audio adm as captuer [");
            if (builder.getAudioCaptureDevice() == 5) {
                z = true;
            } else {
                z = false;
            }
            LIZ4.append(z);
            LIZ4.append("]");
            AVLog.iod("LiveCoreImpl", X1D.LIZIZ(LIZ4));
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("ADM: Using audio echo at adm [");
            LIZ5.append(parameter.getBool("adm_using_direct_echo"));
            LIZ5.append("]");
            AVLog.iod("LiveCoreImpl", X1D.LIZIZ(LIZ5));
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("ADM: Using audio high quality [");
            LIZ6.append(builder.isEnableAudioHighQuality());
            LIZ6.append("]");
            AVLog.iod("LiveCoreImpl", X1D.LIZIZ(LIZ6));
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("ADM: Using audio AecV2 [");
            LIZ7.append(builder.usingAecV2Algorithm());
            LIZ7.append(" ns ");
            LIZ7.append(builder.usingAudioRNNoise());
            LIZ7.append("]");
            AVLog.iod("LiveCoreImpl", X1D.LIZIZ(LIZ7));
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("ADM: audio capture config  ");
            LIZ8.append(builder.getAudioCaptureSampleHZOnVoIP());
            LIZ8.append("HZ@");
            LIZ8.append(builder.getAudioCaptureChannelOnVoIP());
            LIZ8.append("c on VoIP mode");
            AVLog.iod("LiveCoreImpl", X1D.LIZIZ(LIZ8));
        }
        parameter.setInt("adm_audio_player_channel", builder.getAudioChannel());
        parameter.setInt("adm_audio_player_sample", builder.getAudioSampleHZ());
        parameter.setInt("audio_bit_width", builder.getAudioBitwidth());
        parameter.setInt("audio_aec_auto_switch", builder.isEnableAecAutoSwitch() ? 1 : 0);
        parameter.setBool("adm_enable_filter_optimized", builder.isEnableByteAudioFilterOptimize());
        JSONObject admServerCfg = builder.getAdmServerCfg();
        if (builder.getAdmType() == 1 && admServerCfg != null) {
            if (builder.getPushBase().settinsByteAudioConfigLevel) {
                parameter.setInt("byteaudio_engine_opt_set_config_level", 1);
            }
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append("ByteAudio: server config:");
            LIZ9.append(admServerCfg.toString());
            AVLog.iod("LiveCoreImpl", X1D.LIZIZ(LIZ9));
        }
        if (admServerCfg != null) {
            str = admServerCfg.toString();
        } else {
            str = "";
        }
        parameter.setString("adm_server_cfg", str);
        parameter.setBool("adm_audio_player_force_media_mode", true);
        if (builder.getAdmApiType(true) != null) {
            parameter.setString("adm_recording_type", builder.getAdmApiType(true));
        }
        if (builder.getAdmApiType(false) != null) {
            parameter.setString("adm_player_type", builder.getAdmApiType(false));
        }
        setupHardwareEarMonitor(parameter, builder);
        parameter.setBool("fix_single_chorus_two_voices", builder.getPushBase().enableSingleChorusTwoVoicesFix);
        this.mAudioDeviceModule.setParameter(parameter);
        parameter.release();
        IVideoEffectProcessor videoEffectProcessor = builder.getVideoEffectProcessor();
        if (videoEffectProcessor != null) {
            AVLog.ioi("LiveCoreImpl", "Using extern video effect handler.");
        }
        ILiveStream createLiveStream = builder.createLiveStream(this.mWorkThreadHandler, this.mVideoCaptureHandler, this.mAudioDeviceModule, videoEffectProcessor);
        this.mLiveStream = createLiveStream;
        TTLSConstantsLifecycleCallback.onLiveStreamCreated(createLiveStream);
        createLogServer(builder);
        if (builder.getVideoCaptureDevice() != 3) {
            this.mLiveStream.getVideoFilterMgr().enable(!builder.isEffectDisabled());
        }
        LiveCoreRoiSwitch liveCoreRoiSwitch = new LiveCoreRoiSwitch((LiveStream) this.mLiveStream);
        this.mRoiSwitch = liveCoreRoiSwitch;
        ((LiveStream) this.mLiveStream).setRoiSwitch(liveCoreRoiSwitch);
        ((LiveStream) this.mLiveStream).setTextureFrameAvailableListener(this);
        ((LiveStream) this.mLiveStream).setAudioFrameAvailableListener(this);
        LayerControl layerControl = new LayerControl();
        this.mLayerControl = layerControl;
        BackgroundLayerControl backgroundLayerControl = new BackgroundLayerControl(layerControl, this);
        this.mBackgroundLayerControl = backgroundLayerControl;
        ((LayerControl) this.mLayerControl).setLayerChangeListener(backgroundLayerControl);
        this.mAudioDeviceControl = new AudioDeviceControl(this.mAudioDeviceModule);
        ((LiveStream) this.mLiveStream).setStreamUniqueIdentifier(builder.getStreamId());
        enableMixer(true, true);
        enableMixer(false, builder.isVideoMixerSwitch());
        postLiveCoreLog(true);
        this.mLiveStream.getVideoFilterMgr().setFindContourListener(new IFilterManager.FindContourListener() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.1
            public AnonymousClass1() {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager.FindContourListener
            public void onSendFindContourSei(ByteBuffer byteBuffer, long j, int i) {
                LiveCore.Builder builder2 = LiveCoreImpl.this.getBuilder();
                if (builder2 != null && builder2.getInteract().enableSendContourInfoToRtc && byteBuffer != null) {
                    if (i == 2) {
                        LiveCoreImpl.this.updateRtcSei("contour_info", byteBuffer);
                        return;
                    }
                    if (i != 1) {
                        return;
                    }
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    String bytesToHexString = ZlibCompressUtils.bytesToHexString(bArr);
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("data", bytesToHexString);
                    } catch (JSONException e2) {
                        C16880lQ.LLLLIIL(e2);
                    }
                    LiveCoreImpl.this.updateRtcSei("contour_info", jSONObject2.toString());
                }
            }
        });
        StringBuilder LIZ10 = X1D.LIZ();
        LIZ10.append("create livecore done ");
        LIZ10.append(this);
        AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ10));
    }

    private void changeRoiMap(boolean z) {
        LiveCoreRoiSwitch liveCoreRoiSwitch = this.mRoiSwitch;
        if (liveCoreRoiSwitch != null) {
            liveCoreRoiSwitch.changeRoiMap(hashCode(), z);
        }
    }

    private void checkDisableColorHistForInteract(boolean z) {
        IFilterManager iFilterManager;
        LiveCore.Builder builder = getBuilder();
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iFilterManager = iLiveStream.getVideoFilterMgr();
        } else {
            iFilterManager = null;
        }
        if ((iLiveStream instanceof LiveStream) && builder != null && (iFilterManager instanceof FilterManager)) {
            try {
                JSONObject jSONObject = builder.getPushBase().colorHistParams;
                boolean z2 = true;
                if (jSONObject != null && jSONObject.optBoolean("interactDisableColorHist")) {
                    FilterManager filterManager = (FilterManager) iFilterManager;
                    if (z) {
                        z2 = false;
                    }
                    filterManager.enableColorHist(z2);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void checkDisableSitiForInteract(boolean z) {
        LiveCore.Builder builder = getBuilder();
        if ((this.mLiveStream instanceof LiveStream) && builder != null) {
            try {
                JSONObject optJSONObject = builder.getSdkParams().optJSONObject("PushBase");
                boolean z2 = true;
                if (optJSONObject != null && JSONObjectProtectorUtils.getBoolean(optJSONObject, "enable_siti") && builder.getPushBase().sitiConfig.getInteractDisableSiti()) {
                    TEBundle tEBundle = new TEBundle();
                    if (z) {
                        z2 = false;
                    }
                    tEBundle.setBool("enable_siti", z2);
                    tEBundle.setString("from", "siti");
                    this.mLiveStream.updateSdkParams(tEBundle);
                    tEBundle.release();
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void checkDisableVideoDenoiseForInteract(boolean z) {
        IFilterManager iFilterManager;
        LiveCore.Builder builder = getBuilder();
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iFilterManager = iLiveStream.getVideoFilterMgr();
        } else {
            iFilterManager = null;
        }
        if ((iLiveStream instanceof LiveStream) && builder != null && (iFilterManager instanceof FilterManager)) {
            try {
                JSONObject jSONObject = builder.getPushBase().videoDenoiseParams;
                boolean z2 = false;
                if (jSONObject != null && jSONObject.optBoolean("interact_disable_video_denoise", true)) {
                    FilterManager filterManager = (FilterManager) iFilterManager;
                    if (!z) {
                        z2 = true;
                    }
                    filterManager.enableVideoDenoise(z2, 4);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void checkFpsFallbackForInteract(boolean z) {
        FpsLevelStrategy fpsLevelStrategy;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream instanceof LiveStream) {
            LiveStream liveStream = (LiveStream) iLiveStream;
            if (liveStream.getFpsLevelStrategy() != null && (fpsLevelStrategy = liveStream.getFpsLevelStrategy()) != null) {
                int switchFpsFallback = fpsLevelStrategy.switchFpsFallback(z);
                LiveCore.ILiveForInteractListener iLiveForInteractListener = this.mInteractEngineListener;
                if (switchFpsFallback > 0 && iLiveForInteractListener != null) {
                    iLiveForInteractListener.onInfo(34, switchFpsFallback, 0, new Object[0]);
                }
            }
        }
    }

    private String getContourInfoFromRTC(ByteBuffer byteBuffer) {
        String nativeParseStringFromByteBuffer;
        if (byteBuffer == null || (nativeParseStringFromByteBuffer = EffectWrapper.nativeParseStringFromByteBuffer(0, byteBuffer)) == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(nativeParseStringFromByteBuffer);
            if (jSONObject.has("contour_info")) {
                return JSONObjectProtectorUtils.getJSONObject(jSONObject, "contour_info").toString();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return null;
    }

    private void postLiveCoreLog(boolean z) {
        LiveCore.Builder builder = getBuilder();
        if (builder == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            JSONObject put = new JSONObject().put("report_version", 5).put("product_line", "live").put("timestamp", currentTimeMillis).put("mode", "push").put("project_key", builder.mProjectKey).put("livecore_event_index", LiveCore.sUploadLogIndex.incrementAndGet()).put("livecore_app_alive_uuid", LiveCore.sUploadLogUUID);
            if (z) {
                this.mStartTimeMs = currentTimeMillis;
                put.put("event_key", "live_core_start");
            } else {
                put.put("event_key", "live_core_end");
                long j = this.mStartTimeMs;
                if (j != 0) {
                    put.put("push_duration", currentTimeMillis - j);
                }
                LiveStream liveStream = (LiveStream) this.mLiveStream;
                if (liveStream != null) {
                    put.put("create_encode_count", liveStream.getCreateEncodeCount());
                    put.put("change_video_fps_count", liveStream.getChangeVideoFpsCount());
                }
                postSAMIDiagnosisLog();
            }
            LiveCore.Builder.ILogMonitor logMonitor = builder.getLogMonitor();
            if (logMonitor != null) {
                logMonitor.onLogMonitor("live_client_monitor_log", put);
            }
        } catch (Exception e) {
            StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "Create live core log error: ");
            LIZIZ.append(e.toString());
            AVLog.ioe("LiveCoreImpl", X1D.LIZIZ(LIZIZ));
        }
    }

    private void setStartServerMixWhilePushStream(boolean z) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream instanceof LiveStream) {
            ((LiveStream) iLiveStream).setStartServerMixWhilePushStream(z);
        }
        if (!z && getBuilder().getSdkSetting().mVPassInteractCfg.interactDelayStopStream == 1) {
            stop();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void addAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        synchronized (this.mAudioFrameListenersFence) {
            if (!this.mAudioFrameListeners.contains(iAudioFrameAvailableListener)) {
                this.mAudioFrameListeners.add(iAudioFrameAvailableListener);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void addSurfaceAvailableListener(SurfaceWithExtData surfaceWithExtData) {
        if (this.mSurfaceCallbackManager == null) {
            this.mSurfaceCallbackManager = (SurfaceCallbackManager) ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Callable() { // from class: X.P2w
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return LiveCoreImpl.lambda$semisugar$$init$$0();
                }
            });
        }
        SurfaceCallbackManager surfaceCallbackManager = this.mSurfaceCallbackManager;
        if (surfaceCallbackManager != null) {
            surfaceCallbackManager.addSurface(surfaceWithExtData);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void addTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        IFilterManager videoFilterMgr;
        synchronized (this.mTextureFrameListenersFence) {
            if (iTextureFrameAvailableListener != null) {
                if (!this.mTextureFrameListeners.contains(iTextureFrameAvailableListener)) {
                    if (this.mTextureFrameListeners.isEmpty() && (videoFilterMgr = getVideoFilterMgr()) != null) {
                        videoFilterMgr.forceOutput2DTex(true);
                    }
                    this.mTextureFrameListeners.add(iTextureFrameAvailableListener);
                }
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void changeVideoFps(int i) {
        if (this.mLiveStream != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("changeVideoFps to fps:");
            LIZ.append(i);
            AVLog.logKibana(5, "LiveCoreImpl", X1D.LIZIZ(LIZ), null);
            this.mLiveStream.changeVideoFps(i);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore, com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int configEffectDowngradingStrategy(JSONObject jSONObject) {
        DebugLogUtils.isEnableDebugLog();
        if (jSONObject == null) {
            return -1;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("faceStrategy");
        if (optJSONObject != null) {
            this.mEffectFaceStrategy = createStrategyFromConfig(optJSONObject, "faceStrategy");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("mattingStrategy");
        if (optJSONObject2 != null) {
            this.mEffectMattingStrategy = createStrategyFromConfig(optJSONObject2, "mattingStrategy");
        }
        DebugLogUtils.isEnableDebugLog();
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputAudioStream createInputAudioStream(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.createInputAudioStream(str);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputVideoStream createInputVideoStream(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return null;
        }
        return iLiveStream.createInputVideoStream(str);
    }

    public void createLogServer(LiveStreamBuilder liveStreamBuilder) {
        if (this.mLiveStreamLogService == null) {
            LiveStreamLogService liveStreamLogService = new LiveStreamLogService((LiveStream) this.mLiveStream, liveStreamBuilder.getLogUploader(), liveStreamBuilder.getUploadLogInterval(), this, this.mWorkThread, this.mLogUploadThread);
            ((LiveStream) this.mLiveStream).setupLogServer(liveStreamLogService);
            this.mLiveStreamLogService = liveStreamLogService;
        }
    }

    public void genBackgroundTex(Bitmap bitmap) {
        deleteBackgroundTexture();
        this.mBackgroundTex = GlUtil.generateTexture(3553);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.mBackgroundTex);
        GLES20.glTexImage2D(3553, 0, 6408, bitmap.getWidth(), bitmap.getHeight(), 0, 6408, 5121, null);
        GLES20.glBindTexture(3553, 0);
        GlUtil.checkNoGLES2Error("genBackgroundTex");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean getAdaptedVideoResolution(int[] iArr) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            return iLiveStream.getAdaptedVideoResolution(iArr);
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public long getAudioEncodeTimeStamp(long j) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            return iLiveStream.getAudioEncodeTimeStamp(j);
        }
        return 0L;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void getLiveCoreReportInfo(LiveStreamReport liveStreamReport) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream instanceof LiveStream) {
            ((LiveStream) iLiveStream).getVideoFrameElapseInfo(liveStreamReport);
            getLiveStreamInfo(liveStreamReport);
            liveStreamReport.setLong("nobuffercnt", r1.getFilterNoBufferCountAndClear());
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean getLiveStreamInfo(LiveStreamReport liveStreamReport) {
        boolean z;
        Handler handler;
        int i;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            synchronized (this.mLiveStreamReport) {
                long currentTimeMillis = System.currentTimeMillis();
                z = true;
                if (currentTimeMillis - this.mLastReportTime >= 1000) {
                    this.mLastReportTime = currentTimeMillis;
                    boolean liveStreamInfo = iLiveStream.getLiveStreamInfo(this.mLiveStreamReport);
                    if (this.mLayerControl != null) {
                        this.mLiveStreamReport.setMiniGameRenderFps(r0.getRealRenderFps());
                    }
                    IVideoCapturerControl videoCapturerControl = iLiveStream.getVideoCapturerControl();
                    if (videoCapturerControl != null) {
                        this.mLiveStreamReport.setCameraAverageExposureTime(videoCapturerControl.getAverageExposureTime());
                        this.mLiveStreamReport.setCameraAvgFps(videoCapturerControl.getAvgFps());
                        this.mLiveStreamReport.setISOInfo(videoCapturerControl.getISOInfo());
                        if (getBuilder().getSdkSetting().cameraSizeOpt) {
                            this.mLiveStreamReport.setInt("camera_capture_width", videoCapturerControl.getCameraCaptureWidth());
                            this.mLiveStreamReport.setInt("camera_capture_height", videoCapturerControl.getCameraCaptureHeight());
                        }
                        this.mLiveStreamReport.setDouble("camera_avg_result_fps", videoCapturerControl.getCameraAvgCaptureResultFps());
                        LiveStreamReport liveStreamReport2 = this.mLiveStreamReport;
                        if (videoCapturerControl.isCamera2Like()) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        liveStreamReport2.setInt("camera_type", i);
                        this.mLiveStreamReport.setInt("current_capture_device", videoCapturerControl.getCurrentCaptureDevice());
                        this.mLiveStreamReport.setString("camera_fps_range", videoCapturerControl.getRealCameraFpsRangeStr());
                        if (videoCapturerControl.getCurrentCaptureDevice() == 1 || videoCapturerControl.getCurrentCaptureDevice() == 2) {
                            double inCaptureRealFps = videoCapturerControl.getInCaptureRealFps();
                            if (inCaptureRealFps > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                                CameraRecord.addFpsRecord(inCaptureRealFps);
                            }
                        }
                        if (liveStreamReport.getCameraAverageExposureTime() > 0) {
                            CameraRecord.addExposureTimeRecord(liveStreamReport.getCameraAverageExposureTime());
                        }
                    }
                    if (getBuilder().getPushBase().getLiveStreamInfoSyncGetMicDB) {
                        if (this.mAudioDeviceModule != null && (handler = this.mWorkThreadHandler) != null) {
                            handler.post(new RunnableC45114HnC(3, this));
                        }
                    } else {
                        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
                        if (audioDeviceModule != null) {
                            this.mLiveStreamReport.setADMMicVolumedB((int) audioDeviceModule.getMicVolumedB());
                        }
                    }
                    z = liveStreamInfo;
                }
                if (liveStreamReport != null && liveStreamReport != this.mLiveStreamReport) {
                    liveStreamReport.clear();
                    liveStreamReport.updateFrom(this.mLiveStreamReport);
                }
            }
            return z;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public boolean getPreviewMirror(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            return renderView.isMirror(z);
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            return iLayerControlExt.isMirror(z);
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public double getStaticsInfoWithKey(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            return iLiveStream.getStaticsInfoWithKey(str);
        }
        return -1.0d;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public long getTimestampForKey(int i) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            return iLiveStream.getTimestampForKey(i);
        }
        return 0L;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean isEnableMixer(boolean z) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null && iLiveStream.isEnableMixer(z)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean isMirror(boolean z) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null && iLiveStream.isMirror(z)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void pause(Cert cert) {
        TokenCertConfigUtils.getInstance().saveCert(TokenCertConfigUtils.CertType.AUDIO_START, cert, "LiveCoreImpl.pause");
        PrivacyCertManager.getInstance().saveCert(1, cert, "LiveCoreImpl.pause");
        PrivacyCertManager.getInstance().saveCert(0, cert, "LiveCoreImpl.pause");
        pause();
        PrivacyCertManager.getInstance().popCert(0);
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void registerInteractListener(LiveCore.ILiveForInteractListener iLiveForInteractListener) {
        this.mInteractEngineListener = iLiveForInteractListener;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void release(Cert cert) {
        TokenCertConfigUtils.getInstance().saveCert(TokenCertConfigUtils.CertType.AUDIO_STOP, cert, "LiveCoreImpl.release");
        PrivacyCertManager.getInstance().saveCert(0, cert, "LiveCoreImpl.release");
        PrivacyCertManager.getInstance().saveCert(1, cert, "LiveCoreImpl.release");
        release();
        PrivacyCertManager.getInstance().popCert(0);
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void removeAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        synchronized (this.mAudioFrameListenersFence) {
            this.mAudioFrameListeners.remove(iAudioFrameAvailableListener);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void removeSurfaceAvailableListener(SurfaceWithExtData surfaceWithExtData) {
        this.mSurfaceCallbackManager.removeSurface(surfaceWithExtData);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void removeTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        IFilterManager videoFilterMgr;
        synchronized (this.mTextureFrameListenersFence) {
            if (iTextureFrameAvailableListener != null) {
                this.mTextureFrameListeners.remove(iTextureFrameAvailableListener);
                if (this.mTextureFrameListeners.isEmpty() && (videoFilterMgr = getVideoFilterMgr()) != null) {
                    videoFilterMgr.forceOutput2DTex(false);
                }
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void resume(Cert cert) {
        TokenCertConfigUtils.getInstance().saveCert(TokenCertConfigUtils.CertType.AUDIO_START, cert, "LiveCoreImpl.resume");
        PrivacyCertManager.getInstance().saveCert(1, cert, "LiveCoreImpl.resume");
        PrivacyCertManager.getInstance().saveCert(0, cert, "LiveCoreImpl.resume");
        resume();
        PrivacyCertManager.getInstance().popCert(0);
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void sendSdkControlMsg(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.sendSdkControlMsg(str);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setAudioFrameAvailableListener(iAudioFrameAvailableListener);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setAudioMute(boolean z) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setAudioMute(z);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setAudioScenario(int i) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setAudioScenario(i);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setBackGroundPhotoPath(Bitmap bitmap) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setBackGroundPhotoPath(bitmap);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setBackgroundImageBitmap(Bitmap bitmap) {
        Handler handler = this.mVideoCaptureHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.10
                public final /* synthetic */ Bitmap val$bitmap;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$10__run$___twin___() {
                    LiveCoreImpl.this.genBackgroundTex(r2);
                    LiveCoreImpl.this.bitmapWidth = r2.getWidth();
                    LiveCoreImpl.this.bitmapHeight = r2.getHeight();
                    if (!r2.isRecycled()) {
                        GLES20.glBindTexture(3553, LiveCoreImpl.this.mBackgroundTex);
                        GLUtils.texImage2D(3553, 0, r2, 0);
                        GLES20.glBindTexture(3553, 0);
                        r2.recycle();
                    }
                    LiveCoreImpl liveCoreImpl = LiveCoreImpl.this;
                    if (liveCoreImpl.mLayerControl != null) {
                        LiveCoreImpl.this.mBackgroundLayerControl.setBackgroundTexture(new VideoMixer.VideoMixerTexture(liveCoreImpl.bitmapWidth, liveCoreImpl.bitmapHeight, 0, VideoMixer.TEXTURE_TYPE_2D, new int[]{liveCoreImpl.mBackgroundTex, 0, 0}, RendererCommon.verticalFlipMatrix()));
                        if (LiveCoreImpl.this.mLayerControl.getLayer("single_view_background") == null) {
                            LiveCoreImpl.this.mLayerControl.createLayer("single_view_background", VideoMixer.VideoMixerDescription.FILL(), r2.getWidth(), r2.getHeight());
                        }
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$10_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass10 anonymousClass10) {
                    boolean LIZ;
                    try {
                        anonymousClass10.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$10__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass10(Bitmap bitmap2) {
                    r2 = bitmap2;
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setDataListener(ILiveStream.ILiveStreamDataListener iLiveStreamDataListener) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setDataListener(iLiveStreamDataListener);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setDisplay(View view) {
        setDisplay(view, 0L);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setDisplayMixBgColor(int i) {
        this.mWorkThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.18
            public final /* synthetic */ int val$bgColor;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$18__run$___twin___() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setDisplayMixBgColor:");
                LIZ.append(r2);
                AVLog.logKibana(4, "LiveCoreImpl", X1D.LIZIZ(LIZ), null);
                VideoMixer videoMixer = LiveCoreImpl.this.mLayerControl.getVideoMixer();
                if (videoMixer != null) {
                    TEBundle tEBundle = new TEBundle();
                    videoMixer.getParameter(tEBundle);
                    tEBundle.setInt("vmixer_bg_color", r2);
                    videoMixer.setParameter(tEBundle);
                    tEBundle.release();
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass18 anonymousClass18) {
                boolean LIZ;
                try {
                    anonymousClass18.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$18__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass18(int i2) {
                r2 = i2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setDisplayPlanarRender(boolean z) {
        this.mDisplayPlanarRender = z;
        this.mWorkThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.17
            public final /* synthetic */ boolean val$planarRender;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$17__run$___twin___() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setDisplayPlanarRender:");
                LIZ.append(r2);
                AVLog.logKibana(4, "LiveCoreImpl", X1D.LIZIZ(LIZ), null);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("setDisplayPlanarRender:");
                LIZ2.append(r2);
                AVLog.w("LiveCoreImpl", X1D.LIZIZ(LIZ2));
                VideoMixer videoMixer = LiveCoreImpl.this.mLayerControl.getVideoMixer();
                if (videoMixer != null) {
                    TEBundle tEBundle = new TEBundle();
                    videoMixer.getParameter(tEBundle);
                    tEBundle.setBool("vmixer_planar_render", LiveCoreImpl.this.mDisplayPlanarRender);
                    videoMixer.setParameter(tEBundle);
                    if (r2) {
                        videoMixer.setEnable(true);
                    }
                    tEBundle.release();
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass17 anonymousClass17) {
                boolean LIZ;
                try {
                    anonymousClass17.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$17__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass17(boolean z2) {
                r2 = z2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setDns(InterfaceC63833P3l interfaceC63833P3l) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setDns(interfaceC63833P3l);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setErrorListener(ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener) {
        this.mErrorListener = iLiveStreamErrorListener;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setErrorListener(new ILiveStream.ILiveStreamErrorListener() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.7
                public AnonymousClass7() {
                }

                @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamErrorListener
                public void onError(int i, int i2, Exception exc) {
                    LiveStreamLogService liveStreamLogService = LiveCoreImpl.this.mLiveStreamLogService;
                    if (liveStreamLogService != null) {
                        liveStreamLogService.extError(i, i2, exc);
                    }
                    LiveCoreImpl.this.reportLiveCoreError(i, i2, exc);
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setInfoListener(ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener) {
        AnonymousClass6 anonymousClass6 = new ILiveStream.ILiveStreamInfoListener() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.6
            public final /* synthetic */ ILiveStream.ILiveStreamInfoListener val$listener;

            public AnonymousClass6(ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener2) {
                r2 = iLiveStreamInfoListener2;
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamInfoListener
            public void onInfo(int i, int i2, int i3) {
                LiveCore.ILiveForInteractListener iLiveForInteractListener = LiveCoreImpl.this.mInteractEngineListener;
                boolean z = false;
                if (iLiveForInteractListener != null) {
                    iLiveForInteractListener.onInfo(i, i2, i3, new Object[0]);
                }
                ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener2 = r2;
                if (iLiveStreamInfoListener2 != null) {
                    iLiveStreamInfoListener2.onInfo(i, i2, i3);
                }
                if (i != 5) {
                    if (i != 6) {
                        if (i != 32) {
                            if (i != 44) {
                                return;
                            }
                            LiveCoreImpl.this.addSeiForVideoE2EDelay();
                            return;
                        }
                    } else {
                        LiveCoreImpl liveCoreImpl = LiveCoreImpl.this;
                        liveCoreImpl.mVideoCaptureDeviceType = i2;
                        if (i2 == 3) {
                            liveCoreImpl.mIsScreenCaptureRunning = false;
                        } else if (i2 == 1 || i2 == 2) {
                            liveCoreImpl.mIsCameraRunning = false;
                        } else if (i2 == 5) {
                            liveCoreImpl.mIsPushingBlackFrame = false;
                        }
                    }
                    LiveCoreImpl liveCoreImpl2 = LiveCoreImpl.this;
                    if (i2 == 1) {
                        z = true;
                    }
                    liveCoreImpl2.mIsMicRunning = z;
                    return;
                }
                LiveCoreImpl liveCoreImpl3 = LiveCoreImpl.this;
                liveCoreImpl3.mVideoCaptureDeviceType = i2;
                if (i2 == 3) {
                    liveCoreImpl3.mIsScreenCaptureRunning = true;
                    return;
                }
                if (i2 == 1 || i2 == 2) {
                    liveCoreImpl3.mIsCameraRunning = true;
                } else {
                    if (i2 != 5) {
                        return;
                    }
                    liveCoreImpl3.mIsPushingBlackFrame = true;
                }
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamInfoListener
            public void onInfo(int i, int i2, String str) {
                ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener2 = r2;
                if (iLiveStreamInfoListener2 != null) {
                    iLiveStreamInfoListener2.onInfo(i, i2, str);
                }
            }
        };
        this.mInfoListener = anonymousClass6;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setInfoListener(anonymousClass6);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setLowPowerLevel(int i) {
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.15
            public final /* synthetic */ int val$level;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$15__run$___twin___() {
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null) {
                    iLiveStream.setLowPowerLevel(r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$15_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass15 anonymousClass15) {
                boolean LIZ;
                try {
                    anonymousClass15.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$15__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass15(int i2) {
                r2 = i2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setOnlyAddSeiToRTC(boolean z) {
        this.mIsOnlySendSeiToRTC = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setOnlyAddSeiToRTC enable:");
        LIZ.append(z);
        AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ));
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setOption(LiveStreamOption liveStreamOption) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setOption(liveStreamOption);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setOriginAudioTrack(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setOriginAudioTrack(str);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setOriginVideoTrack(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setOriginVideoTrack(str);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setPreviewFitMode(boolean z) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setFitMode(z);
            return;
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt == null) {
            return;
        }
        iLayerControlExt.setFitMode(z);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setPublishMixBgColor(int i) {
        this.mWorkThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.20
            public final /* synthetic */ int val$bgColor;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$20__run$___twin___() {
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null) {
                    iLiveStream.setPublishMixBgColor(r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass20 anonymousClass20) {
                boolean LIZ;
                try {
                    anonymousClass20.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$20__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass20(int i2) {
                r2 = i2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setPublishPlanarRender(boolean z) {
        this.mWorkThread.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.19
            public final /* synthetic */ boolean val$planarRender;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$19__run$___twin___() {
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null) {
                    iLiveStream.setPublishPlanarRender(r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass19 anonymousClass19) {
                boolean LIZ;
                try {
                    anonymousClass19.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$19__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass19(boolean z2) {
                r2 = z2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setPushStreamAfterServerMix(boolean z) {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            liveStream.setPushStreamAfterServerMix(z);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setRadioModeBgBitmap(Bitmap bitmap) {
        setBackGroundPhotoPath(bitmap);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setRtcExtraDataListener(LiveCore.RtcExtraDataListener rtcExtraDataListener) {
        this.mRtcExtraDataListener = rtcExtraDataListener;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setScreenInteralAudioVolume(float f) {
        ScreenAudioPlaybackObserver screenAudioPlaybackObserver = this.mScreenAudioPlaybackObserver;
        if (screenAudioPlaybackObserver != null) {
            screenAudioPlaybackObserver.setVolume(f);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("interal auido volume:");
            LIZ.append(f);
            AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setScreenMicAudioVolume(float f) {
        IInputAudioStream originInputAudioStream = getOriginInputAudioStream();
        if (originInputAudioStream != null) {
            AudioMixer.AudioMixerDescription mixerDescription = originInputAudioStream.getMixerDescription();
            mixerDescription.volumeCoeff = f;
            originInputAudioStream.setMixerDescription(mixerDescription);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("interal auido volume:");
            LIZ.append(f);
            AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setSeiCurrentShiftDiffTime(long j) {
        if (this.mLiveStream != null) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.9
                public final /* synthetic */ long val$diff;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$9__run$___twin___() {
                    ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                    if (iLiveStream != null) {
                        iLiveStream.setSeiCurrentShiftDiffTime(r2);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$9_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass9 anonymousClass9) {
                    boolean LIZ;
                    try {
                        anonymousClass9.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$9__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass9(long j2) {
                    r2 = j2;
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setTextureFrameAvailableListener(iTextureFrameAvailableListener);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void start(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.start(str);
        }
        startReportNetworkQuality();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void startAudioCapture(Cert cert) {
        TokenCertConfigUtils.getInstance().saveCert(TokenCertConfigUtils.CertType.AUDIO_START, cert, "LiveCoreImpl.startAudioCapture");
        PrivacyCertManager.getInstance().saveCert(1, cert, "LiveCoreImpl.startAudioCapture");
        startAudioCapture();
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void startVideoCapture(Cert cert) {
        PrivacyCertManager.getInstance().saveCert(0, cert, "LiveCoreImpl.startVideoCapture");
        startVideoCapture();
        PrivacyCertManager.getInstance().popCert(0);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void stopAudioCapture(Cert cert) {
        TokenCertConfigUtils.getInstance().saveCert(TokenCertConfigUtils.CertType.AUDIO_STOP, cert, "LiveCoreImpl.stopAudioCapture");
        PrivacyCertManager.getInstance().saveCert(1, cert, "LiveCoreImpl.stopAudioCapture");
        stopAudioCapture();
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void stopVideoCapture(Cert cert) {
        PrivacyCertManager.getInstance().saveCert(0, cert, "LiveCoreImpl.stopVideoCapture");
        stopVideoCapture();
        PrivacyCertManager.getInstance().popCert(0);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void switchAudioCapture(int i) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.switchAudioCapture(i);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void switchAudioMode(int i) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.switchAudioMode(i);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void switchVideoCapture(int i) {
        if (this.mIsPause) {
            AVLog.iow("LiveCoreImpl", "can't switchVideoCapture when pause.");
            return;
        }
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.switchVideoCapture(i);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null && audioRecordingCallback != null) {
            iLiveStream.unRegisterAudioRecordingCallback(audioRecordingCallback);
        }
    }

    public void updateByteAudioConfig(JSONObject jSONObject) {
        String str;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null && getBuilder().getPushBase().needUpdateByteAudioConfig) {
            TEBundle parameter = audioDeviceModule.getParameter();
            if (jSONObject != null) {
                str = jSONObject.toString();
            } else {
                str = "";
            }
            parameter.setString("adm_server_cfg", str);
            audioDeviceModule.setParameter(parameter);
            parameter.release();
            StringBuilder LIZ = X1D.LIZ();
            AVLog.logKibana(4, "LiveCoreImpl", JBR.LJFF(LIZ, "updateByteAudioConfig:", str, LIZ), null);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("updateByteAudioConfig:");
            LIZ2.append(str);
            AVLog.w("LiveCoreImpl", X1D.LIZIZ(LIZ2));
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void updateSdkParams(String str) {
        if (str == null) {
            return;
        }
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.14
            public final /* synthetic */ String val$sdkParamsNew;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$14__run$___twin___() {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Calling updateSdkParams:");
                LIZ.append(r2);
                AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ));
                AudioDeviceModule audioDeviceModule = LiveCoreImpl.this.mAudioDeviceModule;
                if (audioDeviceModule != null && audioDeviceModule.getAdmType() == 1) {
                    try {
                        LiveCoreImpl.this.updateByteAudioConfig(JSONObjectProtectorUtils.getJSONObject(JSONObjectProtectorUtils.getJSONObject(new JSONObject(r2), "PushBase"), "adm_server_cfg"));
                    } catch (Throwable unused) {
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
                boolean LIZ;
                try {
                    anonymousClass14.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$14__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass14(String str2) {
                r2 = str2;
            }
        });
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.updateSdkParams(str2);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setBackGroundPhotoPath(String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setBackGroundPhotoPath(str);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void start(List<String> list) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.start(list);
        }
        startReportNetworkQuality();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void updateSdkParams(TEBundle tEBundle) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.updateSdkParams(tEBundle);
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl$6 */
    /* loaded from: classes12.dex */
    public class AnonymousClass6 implements ILiveStream.ILiveStreamInfoListener {
        public final /* synthetic */ ILiveStream.ILiveStreamInfoListener val$listener;

        public AnonymousClass6(ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener2) {
            r2 = iLiveStreamInfoListener2;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamInfoListener
        public void onInfo(int i, int i2, int i3) {
            LiveCore.ILiveForInteractListener iLiveForInteractListener = LiveCoreImpl.this.mInteractEngineListener;
            boolean z = false;
            if (iLiveForInteractListener != null) {
                iLiveForInteractListener.onInfo(i, i2, i3, new Object[0]);
            }
            ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener2 = r2;
            if (iLiveStreamInfoListener2 != null) {
                iLiveStreamInfoListener2.onInfo(i, i2, i3);
            }
            if (i != 5) {
                if (i != 6) {
                    if (i != 32) {
                        if (i != 44) {
                            return;
                        }
                        LiveCoreImpl.this.addSeiForVideoE2EDelay();
                        return;
                    }
                } else {
                    LiveCoreImpl liveCoreImpl = LiveCoreImpl.this;
                    liveCoreImpl.mVideoCaptureDeviceType = i2;
                    if (i2 == 3) {
                        liveCoreImpl.mIsScreenCaptureRunning = false;
                    } else if (i2 == 1 || i2 == 2) {
                        liveCoreImpl.mIsCameraRunning = false;
                    } else if (i2 == 5) {
                        liveCoreImpl.mIsPushingBlackFrame = false;
                    }
                }
                LiveCoreImpl liveCoreImpl2 = LiveCoreImpl.this;
                if (i2 == 1) {
                    z = true;
                }
                liveCoreImpl2.mIsMicRunning = z;
                return;
            }
            LiveCoreImpl liveCoreImpl3 = LiveCoreImpl.this;
            liveCoreImpl3.mVideoCaptureDeviceType = i2;
            if (i2 == 3) {
                liveCoreImpl3.mIsScreenCaptureRunning = true;
                return;
            }
            if (i2 == 1 || i2 == 2) {
                liveCoreImpl3.mIsCameraRunning = true;
            } else {
                if (i2 != 5) {
                    return;
                }
                liveCoreImpl3.mIsPushingBlackFrame = true;
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamInfoListener
        public void onInfo(int i, int i2, String str) {
            ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener2 = r2;
            if (iLiveStreamInfoListener2 != null) {
                iLiveStreamInfoListener2.onInfo(i, i2, str);
            }
        }
    }

    private EffectPerfStrategy createStrategyFromConfig(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        EffectPerfStrategy effectPerfStrategy = new EffectPerfStrategy();
        effectPerfStrategy.type = str;
        effectPerfStrategy.isEnable = jSONObject.optBoolean("isEnable", false);
        effectPerfStrategy.resolutionThresholdWidth = jSONObject.optInt("resolutionThreshold_w", 0);
        effectPerfStrategy.resolutionThresholdHeight = jSONObject.optInt("resolutionThreshold_h", 0);
        if ("faceStrategy".equals(str)) {
            effectPerfStrategy.callback = new EffectPerfStrategy.IStrategyCallback() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.22
                @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.EffectPerfStrategy.IStrategyCallback
                public void onExecute() {
                    LiveCoreImpl.this.executeEffectDowningStrategyInternal("face_extra_model_name", "tt_face_extra_multiguest");
                }

                @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.EffectPerfStrategy.IStrategyCallback
                public void onReset() {
                    LiveCoreImpl.this.executeEffectDowningStrategyInternal("face_extra_model_name", "");
                }

                public AnonymousClass22() {
                }
            };
        } else if ("mattingStrategy".equals(str)) {
            effectPerfStrategy.callback = new EffectPerfStrategy.IStrategyCallback() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.23
                @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.EffectPerfStrategy.IStrategyCallback
                public void onExecute() {
                    LiveCoreImpl.this.executeEffectDowningStrategyInternal("matting_model_name", "tt_matting_multiguest");
                }

                @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.EffectPerfStrategy.IStrategyCallback
                public void onReset() {
                    LiveCoreImpl.this.executeEffectDowningStrategyInternal("matting_model_name", "");
                }

                public AnonymousClass23() {
                }
            };
        }
        return effectPerfStrategy;
    }

    private void initLogFile(Context context, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 10485760;
        }
        Monitor.initLogFile(context, i);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SDK version: 15.0.1_1/release, native SDK version: ");
        LIZ.append(MediaEngineFactory.nativeGetVersion());
        AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Android OS: ");
        LIZ2.append(Build.VERSION.SDK_INT);
        LIZ2.append("(");
        LIZ2.append(Build.VERSION.RELEASE);
        LIZ2.append(")");
        AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("DevicesName: ");
        LIZ3.append(Build.MODEL);
        AVLog.ioi("LiveCoreImpl", X1D.LIZIZ(LIZ3));
    }

    private void setupHardwareEarMonitor(TEBundle tEBundle, LiveCore.Builder builder) {
        tEBundle.setInt("adm_support_hardware_ear_monitor", builder.getPushBase().supportHardWareEarMonitor);
        if (builder.getPushBase().admHardwareAudioEffectTable != null) {
            tEBundle.setString("adm_hardware_audio_effect_table", builder.getPushBase().admHardwareAudioEffectTable.toString());
        }
        try {
            JSONObject jSONObject = builder.getPushBase().admHardwareAudioEffectTable;
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    int i = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, next), "effect");
                    int i2 = JSONObjectProtectorUtils.getInt(JSONObjectProtectorUtils.getJSONObject(jSONObject, next), "eq");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("adm_hardware_audio_effect_table_");
                    LIZ.append(next);
                    LIZ.append("_effect");
                    tEBundle.setInt(X1D.LIZIZ(LIZ), i);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("adm_hardware_audio_effect_table_");
                    LIZ2.append(next);
                    LIZ2.append("_eq");
                    tEBundle.setInt(X1D.LIZIZ(LIZ2), i2);
                }
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void adaptedVideoResolution(int i, int i2) {
        adaptedVideoResolution(i, i2, 0);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void catchMediaData(Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.catchMediaData(bundle, catchMediaDataCallback);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void catchVideo(Bundle bundle, ILiveStream.CatchVideoCallback catchVideoCallback) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.catchVideo(bundle, catchVideoCallback);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void changeToKTVMode(boolean z, IKaraokeMovie iKaraokeMovie) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            ((LiveStream) iLiveStream).changeToKTVMode(z, iKaraokeMovie);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void changeVideoResolution(int i, int i2) {
        if (this.mLiveStream != null) {
            AVLog.logKibana(5, "LiveCoreImpl", C48263Iwt.LIZLLL("changeVideoResolution to width:", i, ",height:", i2), null);
            this.mLiveStream.changeVideoResolution(i, i2);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public IPushFrameAfterCapture createPushFrameAfterCapture(int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create controlPushFrameAfterCapture object, width: ");
        LIZ.append(i);
        LIZ.append(" height: ");
        LIZ.append(i2);
        AVLog.iod("LiveCoreImpl", X1D.LIZIZ(LIZ));
        try {
            Class<?> cls = Class.forName("com.ss.ttlivestreamer.livestreamv2.core.LiveCorePushFrameAfterCapture");
            Class<?> cls2 = Integer.TYPE;
            Constructor<?> constructor = cls.getConstructor(LiveCore.class, RenderView.class, cls2, cls2);
            constructor.setAccessible(true);
            return (IPushFrameAfterCapture) constructor.newInstance(this, this.mLayerControl.getRenderView(), this.mLayerControl, Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Exception unused) {
            AVLog.logKibana(6, "LiveCoreImpl", "createPushFrameAfterCapture fail.", null);
            return null;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public MediaTrack createTrack(MediaSource mediaSource, String str) {
        LiveStream liveStream = (LiveStream) this.mLiveStream;
        if (liveStream != null) {
            return liveStream.createTrack(mediaSource, str);
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public boolean enableMirror(long j, boolean z) {
        boolean z2;
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return false;
        }
        this.mMirror = (int) (this.mMirror & j);
        VideoMixer.VideoMixerDescription mixerDescription = iLiveStream.getOriginInputVideoStream().getMixerDescription();
        long j2 = j & 2;
        if (j2 != 0 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        mixerDescription.setMirror(true, z2);
        if (j2 == 0) {
            z = false;
        }
        mixerDescription.setMirror(false, z);
        this.mLiveStream.getOriginInputVideoStream().setMixerDescription(mixerDescription);
        return true;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void enableMixer(boolean z, boolean z2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.enableMixer(z, z2);
        }
    }

    public void executeEffectDowningStrategyInternal(String str, String str2) {
        IFilterManager iFilterManager;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, str2);
            ILiveStream iLiveStream = this.mLiveStream;
            if (iLiveStream != null) {
                iFilterManager = iLiveStream.getVideoFilterMgr();
            } else {
                iFilterManager = null;
            }
            DebugLogUtils.isEnableDebugLog();
            if (iFilterManager != null) {
                iFilterManager.setRenderCacheString("GradedOptConfig", jSONObject.toString());
            }
        } catch (Exception unused) {
            DebugLogUtils.isEnableDebugLog();
        }
    }

    public void processSEI(String str, ByteBuffer byteBuffer) {
        String nativeParseStringFromByteBuffer;
        LiveCore.RtcExtraDataListener rtcExtraDataListener = this.mRtcExtraDataListener;
        if (rtcExtraDataListener != null && byteBuffer != null && (nativeParseStringFromByteBuffer = EffectWrapper.nativeParseStringFromByteBuffer(0, byteBuffer)) != null) {
            rtcExtraDataListener.onRtcData(str, nativeParseStringFromByteBuffer);
            if (DebugLogUtils.isEnableDebugLog()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Receive SEI ");
                LIZ.append(nativeParseStringFromByteBuffer);
                LIZ.append(" on RTC");
                AVLog.w("LiveCoreImpl", X1D.LIZIZ(LIZ));
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null && audioRecordingCallback != null) {
            iLiveStream.registerAudioRecordingCallback(executor, audioRecordingCallback);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void registerScreenAudioPlayBack(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, int i) {
        registerScreenAudioPlayBack(iAudioRecordThreadObserver, i, null);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setAudioMute(boolean z, Cert cert) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveCoreImpl.setAudioMute(");
        LIZ.append(z);
        LIZ.append(")");
        String LIZIZ = X1D.LIZIZ(LIZ);
        TokenCertConfigUtils.getInstance().saveCert(TokenCertConfigUtils.CertType.AUDIO_START, cert, LIZIZ);
        PrivacyCertManager.getInstance().saveCert(1, cert, LIZIZ);
        setAudioMute(z);
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setDisplay(View view, long j) {
        long j2 = j;
        this.mDisplayView = view;
        LiveCore.Builder builder = getBuilder();
        if (builder != null) {
            if (builder.getSdkSetting().adaptLiveV2Device) {
                j2 |= 256;
            }
            if (builder.getPushBase().enable_render_fixed_size) {
                j2 |= 512;
            }
            if (builder.getPushBase().clearStencilWhenResize) {
                j2 |= 1024;
            }
            if (builder.getPushBase().enableClearRect) {
                j2 |= 2048;
            }
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt instanceof LayerControl) {
            ((LayerControl) iLayerControlExt).setDisplay(view, builder.getContext(), j2, builder.isVideoLayerMixerSwitch());
            this.mLayerControl.setPreViewFps(builder.getPushBase().previewFps);
            setDisplayPlanarRender(this.mDisplayPlanarRender);
            RenderView renderView = this.mLayerControl.getRenderView();
            if (renderView != null) {
                renderView.setGlRenderInfoListener(new GLRenderVideoSink.GlRenderInfoListener() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.16
                    public AnonymousClass16() {
                    }

                    @Override // com.ss.ttlivestreamer.core.opengl.GLRenderVideoSink.GlRenderInfoListener
                    public void onInfo(int i, int i2, int i3) {
                        if (i == 1) {
                            LiveCoreImpl.this.reportLiveCoreInfo(301, i2, i3);
                            AVLog.ioi("LiveCoreImpl", "MSG_EGL_SURFACE_DESTROYED  from livecore");
                        } else {
                            if (i != 2) {
                                return;
                            }
                            LiveCoreImpl.this.reportLiveCoreInfo(302, i2, i3);
                            AVLog.ioi("LiveCoreImpl", "MSG_EGL_SURFACE_WILL_BE_CREATED  from livecore");
                        }
                    }
                });
            }
        }
        if (this.mCameraStreamLayer == null) {
            configCameraLayer();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setPreviewMirror(boolean z, boolean z2) {
        RenderView renderView = this.mRenderView;
        if (renderView != null) {
            renderView.setMirror(z, z2);
            return;
        }
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt == null) {
            return;
        }
        iLayerControlExt.setMirror(z, z2);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void switchAudioCapture(int i, Cert cert) {
        TokenCertConfigUtils.getInstance().saveCert(TokenCertConfigUtils.CertType.AUDIO_START, cert, "LiveCoreImpl.switchAudioCapture");
        PrivacyCertManager.getInstance().saveCert(1, cert, "LiveCoreImpl.switchAudioCapture");
        switchAudioCapture(i);
        PrivacyCertManager.getInstance().popCert(1);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void switchVideoCapture(int i, Cert cert) {
        PrivacyCertManager.getInstance().saveCert(0, cert, "LiveCoreImpl.switchVideoCapture");
        switchVideoCapture(i);
        PrivacyCertManager.getInstance().popCert(0);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore, com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int tryToExecuteEffectDowningStrategy(int i, int i2) {
        EffectPerfStrategy effectPerfStrategy;
        int i3;
        EffectPerfStrategy effectPerfStrategy2 = this.mEffectFaceStrategy;
        if (effectPerfStrategy2 == null) {
            if (this.mEffectMattingStrategy == null) {
                return 2;
            }
        } else if (!effectPerfStrategy2.isEnable && (effectPerfStrategy = this.mEffectMattingStrategy) != null && !effectPerfStrategy.isEnable) {
            return 3;
        }
        if (i <= 0 || i2 <= 0) {
            return 4;
        }
        DebugLogUtils.isEnableDebugLog();
        EffectPerfStrategy effectPerfStrategy3 = this.mEffectMattingStrategy;
        if (effectPerfStrategy3 != null && effectPerfStrategy3.isEnable) {
            if (i * i2 <= effectPerfStrategy3.resolutionThresholdWidth * effectPerfStrategy3.resolutionThresholdHeight) {
                EffectPerfStrategy.IStrategyCallback iStrategyCallback = effectPerfStrategy3.callback;
                if (iStrategyCallback != null) {
                    iStrategyCallback.onExecute();
                }
                i3 = 0;
            } else {
                EffectPerfStrategy.IStrategyCallback iStrategyCallback2 = effectPerfStrategy3.callback;
                if (iStrategyCallback2 != null) {
                    iStrategyCallback2.onReset();
                }
                i3 = 1;
            }
        } else {
            i3 = -1;
        }
        EffectPerfStrategy effectPerfStrategy4 = this.mEffectFaceStrategy;
        if (effectPerfStrategy4 != null && effectPerfStrategy4.isEnable) {
            if (i * i2 <= effectPerfStrategy4.resolutionThresholdWidth * effectPerfStrategy4.resolutionThresholdHeight) {
                EffectPerfStrategy.IStrategyCallback iStrategyCallback3 = effectPerfStrategy4.callback;
                if (iStrategyCallback3 == null) {
                    return 0;
                }
                iStrategyCallback3.onExecute();
                return 0;
            }
            EffectPerfStrategy.IStrategyCallback iStrategyCallback4 = effectPerfStrategy4.callback;
            if (iStrategyCallback4 != null) {
                iStrategyCallback4.onReset();
            }
            return 1;
        }
        return i3;
    }

    public void updateRtcSei(String str, Object obj) {
        LiveCore.ILiveForInteractListener iLiveForInteractListener = this.mInteractEngineListener;
        if (iLiveForInteractListener != null) {
            iLiveForInteractListener.onInfo(4, 0, 0, str, obj);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void catchMediaData(Bundle bundle, ILiveStream.CatchPicCallback catchPicCallback) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.catchMediaData(bundle, catchPicCallback);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void enableMirror(boolean z, boolean z2) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.enableMirror(z, z2);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setAudioMute(boolean z, String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.setAudioMute(z);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setAudioMute(");
            LIZ.append(z);
            LIZ.append(") eventFrom:");
            LIZ.append(str);
            AVLog.logKibana(4, "LiveCoreImpl", X1D.LIZIZ(LIZ), new Throwable());
        }
    }

    public /* synthetic */ void lambda$pushRtcSeiData$0(ByteBuffer byteBuffer, int i, String str) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return;
        }
        LiveCore.Builder builder = getBuilder();
        IFilterManager videoFilterMgr = iLiveStream.getVideoFilterMgr();
        if (videoFilterMgr != null && videoFilterMgr.isEnableFindContour() && byteBuffer != null && ZlibCompressUtils.isContourInfo(byteBuffer)) {
            if (!builder.needMergeRtcExtraDataToLiveStream()) {
                iLiveStream.addSeiField(null, byteBuffer, 1, false, false);
            }
            FindContourInfo contourInfoFromByteBuffer = ZlibCompressUtils.getContourInfoFromByteBuffer(byteBuffer);
            IFilterManager.ContourDataCallBack contourDataCallBack = videoFilterMgr.getContourDataCallBack();
            if (contourDataCallBack != null) {
                contourDataCallBack.onReceivedRemoteData(contourInfoFromByteBuffer);
            }
        }
        if (builder != null && (builder.needMergeRtcExtraDataToLiveStream() || i == 9999)) {
            iLiveStream.addSeiField(null, byteBuffer, 1, false, false);
        }
        if (i != 9999) {
            processSEI(str, byteBuffer);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void adaptedVideoResolution(int i, int i2, int i3) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream != null) {
            iLiveStream.adaptedVideoResolution(i, i2, i3);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i) {
        return addSeiField(str, obj, i, true, true);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void addUserMetaData(String str, String str2, int i) {
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.8
            public final /* synthetic */ int val$flag;
            public final /* synthetic */ String val$key;
            public final /* synthetic */ String val$value;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$8__run$___twin___() {
                ILiveStream iLiveStream = LiveCoreImpl.this.mLiveStream;
                if (iLiveStream != null) {
                    iLiveStream.addUserMetaData(r2, r3, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass8(String str3, String str22, int i2) {
                r2 = str3;
                r3 = str22;
                r4 = i2;
            }
        });
        if (this.mInteractEngineListener != null && str3 != null && !str3.isEmpty() && str22 != null && !str22.isEmpty() && i2 == 1) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str3, new JSONObject(str22));
                this.mInteractEngineListener.onInfo(3, 2, 0, jSONObject);
            } catch (Exception e) {
                AVLog.ioe("LiveCoreImpl", "send interact encrypt metadata failed", e);
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void changeVideoBitrate(int i, int i2, int i3) {
        if (this.mLiveStream != null) {
            StringBuilder LIZJ = C06460Ne.LIZJ("changeVideoBitrate to:", i2, "/", i, "/");
            LIZJ.append(i3);
            AVLog.logKibana(5, "LiveCoreImpl", X1D.LIZIZ(LIZJ), null);
            this.mLiveStream.changeVideoBitrate(i, i2, i3);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public VideoFrameRenderer createFrameRender(String str, int i, int i2) {
        ILayerControlExt iLayerControlExt = this.mLayerControl;
        if (iLayerControlExt != null) {
            ILayerControlExt.ILayerExt createLayerExt = iLayerControlExt.createLayerExt(str, VideoMixer.VideoMixerDescription.INVISIABLE(), i, i2, 2);
            if (createLayerExt instanceof LayerControl.Layer) {
                return (LayerControl.Layer) createLayerExt;
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.Observer
    public void onADMInfo(int i, int i2, long j) {
        if (i == 5) {
            LiveStream liveStream = (LiveStream) this.mLiveStream;
            if (liveStream != null) {
                liveStream.onCalculatePcmPowerEvent(i2);
                return;
            }
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 6) {
                                if (i != 7) {
                                    if (i != 10) {
                                        if (i != 11) {
                                            return;
                                        }
                                        reportLiveCoreInfo(36, i2, (int) j);
                                        return;
                                    } else {
                                        this.mSupportEarMonitor = true;
                                        reportLiveCoreInfo(31, i2, (int) j);
                                        return;
                                    }
                                }
                                reportLiveCoreInfo(26, i2, 0);
                                return;
                            }
                            reportLiveCoreInfo(25, i2, 0);
                            return;
                        }
                        reportLiveCoreInfo(24, i2, 0);
                        return;
                    }
                    reportLiveCoreInfo(23, i2, 0);
                    return;
                }
                reportLiveCoreInfo(22, i2, 0);
                return;
            }
            reportLiveCoreInfo(32, i2, (int) j);
            return;
        }
        reportLiveCoreInfo(33, i2, (int) j);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void onInteractEvent(int i, int i2, Object... objArr) {
        boolean z = false;
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 6) {
                        return;
                    }
                    setStartServerMixWhilePushStream(false);
                    return;
                }
                setStartServerMixWhilePushStream(true);
                return;
            }
        } else {
            z = true;
        }
        changeRoiMap(z);
        checkFpsFallbackForInteract(z);
        checkDisableSitiForInteract(z);
        checkDisableColorHistForInteract(z);
        checkDisableVideoDenoiseForInteract(z);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void onOuterInfo(int i, int i2, int i3) {
        ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = this.mInfoListener;
        if (iLiveStreamInfoListener != null) {
            iLiveStreamInfoListener.onInfo(i, i2, i3);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback, Cert cert) {
        TokenCertConfigUtils.getInstance().saveCert(TokenCertConfigUtils.CertType.AUDIO_START, cert, "LiveCoreImpl.registerAudioRecordingCallback");
        registerAudioRecordingCallback(executor, audioRecordingCallback);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void registerScreenAudioPlayBack(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, int i, Cert cert) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("registerScreenAudioPlayBack, flag: ");
        LIZ.append(i);
        AVLog.logKibana(4, "LiveCoreImpl", X1D.LIZIZ(LIZ), null);
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.core.LiveCoreImpl.4
            public final /* synthetic */ Cert val$cert;
            public final /* synthetic */ int val$flag;
            public final /* synthetic */ AudioRecordThread.IAudioRecordThreadObserver val$observer;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$4__run$___twin___() {
                LiveCoreImpl liveCoreImpl = LiveCoreImpl.this;
                ILiveStream iLiveStream = liveCoreImpl.mLiveStream;
                if (iLiveStream != null) {
                    if (liveCoreImpl.mScreenAudioPlaybackObserver != null) {
                        iLiveStream.registerScreenAudioPlayBack(null, r2, null);
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! register again, why?");
                        if (!AnonymousClass028.LJI(androidRuntimeException, "LiveCoreImpl.registerScreenAudioPlayBack")) {
                            LiveCoreImpl.this.mScreenAudioPlaybackObserver.release();
                            LiveCoreImpl.this.mScreenAudioPlaybackObserver = null;
                        } else {
                            throw androidRuntimeException;
                        }
                    }
                    if (r2 == 1) {
                        LiveCoreImpl liveCoreImpl2 = LiveCoreImpl.this;
                        liveCoreImpl2.mScreenAudioPlaybackObserver = new ScreenAudioPlaybackObserver(liveCoreImpl2.createInputAudioStream(), r3, LiveCoreImpl.this.mAudioDeviceModule);
                        LiveStream liveStream = (LiveStream) LiveCoreImpl.this.mLiveStream;
                        if (liveStream != null && liveStream.getLiveStreamBuilder() != null) {
                            LiveCoreImpl.this.mScreenAudioPlaybackObserver.setVolume(liveStream.getLiveStreamBuilder().getGameInnerVolume());
                        }
                    }
                    LiveCoreImpl liveCoreImpl3 = LiveCoreImpl.this;
                    liveCoreImpl3.mLiveStream.registerScreenAudioPlayBack(liveCoreImpl3.mScreenAudioPlaybackObserver, r2, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$4_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass4 anonymousClass4) {
                boolean LIZ2;
                try {
                    anonymousClass4.com_ss_ttlivestreamer_livestreamv2_core_LiveCoreImpl$4__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }

            public AnonymousClass4(int i2, AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver2, Cert cert2) {
                r2 = i2;
                r3 = iAudioRecordThreadObserver2;
                r4 = cert2;
            }
        });
    }

    public void reportLiveCoreError(int i, int i2, Exception exc) {
        boolean canThrowException;
        AndroidRuntimeException androidRuntimeException;
        ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener = this.mErrorListener;
        if (iLiveStreamErrorListener != null) {
            try {
                iLiveStreamErrorListener.onError(i, i2, exc);
            } finally {
                if (!canThrowException) {
                }
            }
        }
    }

    public void reportLiveCoreInfo(int i, int i2, int i3) {
        boolean canThrowException;
        AndroidRuntimeException androidRuntimeException;
        ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = this.mInfoListener;
        if (iLiveStreamInfoListener != null) {
            try {
                iLiveStreamInfoListener.onInfo(i, i2, i3);
            } finally {
                if (!canThrowException) {
                }
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void setAudioMute(boolean z, Cert cert, String str) {
        setAudioMute(z, cert);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioMute(");
        LIZ.append(z);
        LIZ.append(") eventFrom:");
        LIZ.append(str);
        LIZ.append(" Object:");
        LIZ.append(cert.toString());
        AVLog.logKibana(4, "LiveCoreImpl", X1D.LIZIZ(LIZ), new Throwable());
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public VideoFrameRenderer createFrameRender(View view, Handler handler, boolean z) {
        if ((view instanceof SurfaceView) || (view instanceof TextureView)) {
            return new RenderView(view, handler, false, z);
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i, boolean z, boolean z2) {
        return addSeiField(str, obj, i, z, z2, 0);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(Buffer buffer, int i, int i2, int i3, long j) {
        ArrayList arrayList;
        synchronized (this.mAudioFrameListenersFence) {
            arrayList = new ArrayList(this.mAudioFrameListeners);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ILiveStream.IAudioFrameAvailableListener) it.next()).onAudioFrameAvailable(buffer, i, i2, i3, j);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore.ILiveCoreVideoFrameAvailableListener
    public void onI420FrameAvailable(ByteBuffer byteBuffer, int i, int i2, long j, Object... objArr) {
        ArrayList arrayList;
        synchronized (this.mTextureFrameListenersFence) {
            arrayList = new ArrayList(this.mTextureFrameListeners);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener = (ILiveStream.ITextureFrameAvailableListener) it.next();
            if (iTextureFrameAvailableListener instanceof LiveCore.ILiveCoreVideoFrameAvailableListener) {
                ((LiveCore.ILiveCoreVideoFrameAvailableListener) iTextureFrameAvailableListener).onI420FrameAvailable(byteBuffer, i, i2, j, objArr);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return 0;
        }
        return iLiveStream.pushVideoFrame(byteBuffer, i, i2, i3, j);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i, boolean z, boolean z2, int i2) {
        ILiveStream iLiveStream;
        if (obj != null && i2 == 0) {
            updateRtcSei(str, obj);
        }
        if (str != null && !str.isEmpty() && obj != null && i2 == 1 && this.mInteractEngineListener != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, obj);
                this.mInteractEngineListener.onInfo(3, 3, 0, jSONObject);
            } catch (Exception e) {
                AVLog.ioe("LiveCoreImpl", "send interact encrypt sei failed", e);
                C16880lQ.LLLLIIL(e);
            }
        }
        if ((this.mIsOnlySendSeiToRTC && str != null && str.equals("ktv_sei")) || (iLiveStream = this.mLiveStream) == null) {
            return 0;
        }
        return iLiveStream.addSeiField(str, obj, i, z, z2, i2);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return 0;
        }
        return iLiveStream.pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, long j) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return 0;
        }
        return iLiveStream.pushVideoFrame(byteBufferArr, iArr, i, i2, i3, j);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return 0;
        }
        return iLiveStream.pushVideoFrame(i, z, i2, i3, i4, fArr, j);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, long j) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return 0;
        }
        return iLiveStream.pushVideoFrame(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, j);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object... objArr) {
        ArrayList arrayList;
        synchronized (this.mTextureFrameListenersFence) {
            arrayList = new ArrayList(this.mTextureFrameListeners);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener = (ILiveStream.ITextureFrameAvailableListener) it.next();
            if (iTextureFrameAvailableListener != null) {
                iTextureFrameAvailableListener.onTextureFrameAvailable(eGLContext, i, z, i2, i3, j, fArr, objArr);
            }
        }
        LiveStreamLogService liveStreamLogService = this.mLiveStreamLogService;
        if (liveStreamLogService != null) {
            liveStreamLogService.addTextureFrameAvailable();
        }
        SurfaceCallbackManager surfaceCallbackManager = this.mSurfaceCallbackManager;
        if (surfaceCallbackManager != null) {
            surfaceCallbackManager.callbackFrame(i, z, fArr, i2, i3, j, objArr);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        ILiveStream iLiveStream = this.mLiveStream;
        if (iLiveStream == null) {
            return 0;
        }
        return iLiveStream.pushVideoFrame(i, z, i2, i3, i4, fArr, j, bundle);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.core.LiveCore
    public void pushRtcSeiData(final int i, final String str, int i2, int i3, int i4, float[] fArr, int i5, long j, final ByteBuffer byteBuffer) {
        Handler handler = this.mWorkThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: X.P2v
                @Override // java.lang.Runnable
                public final void run() {
                    LiveCoreImpl.this.lambda$pushRtcSeiData$0(byteBuffer, i, str);
                }
            });
        }
    }
}
