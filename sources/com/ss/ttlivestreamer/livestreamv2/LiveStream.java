package com.ss.ttlivestreamer.livestreamv2;

import X.AnonymousClass028;
import X.C06460Ne;
import X.C0MT;
import X.C15890jp;
import X.C16880lQ;
import X.C25620zW;
import X.C56212In;
import X.C62120OZo;
import X.C63806P2k;
import X.C65232Piu;
import X.C65859Pt1;
import X.HZE;
import X.InterfaceC63814P2s;
import X.InterfaceC63833P3l;
import X.JBR;
import X.RunnableC63881P5h;
import X.V10;
import X.V1I;
import X.X1D;
import Y.ARunnableS10S0101000_6;
import Y.ARunnableS10S0201000_7;
import Y.ARunnableS12S0101000_8;
import Y.ARunnableS17S0101000_13;
import Y.ARunnableS9S0101000_5;
import Y.IDRunnableS0S0201000;
import Y.IDRunnableS6S0101000;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturer;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturerAudioRecord;
import com.ss.ttlivestreamer.core.capture.audio.AudioCapturerOpensles;
import com.ss.ttlivestreamer.core.capture.audio.AudioRecordThread;
import com.ss.ttlivestreamer.core.capture.video.VideoCapturer;
import com.ss.ttlivestreamer.core.codec.DefaultAudioEncoderFactory;
import com.ss.ttlivestreamer.core.codec.DefaultVideoEncoderFactory;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.engine.AudioEncoderFactory;
import com.ss.ttlivestreamer.core.engine.AudioSink;
import com.ss.ttlivestreamer.core.engine.AudioSource;
import com.ss.ttlivestreamer.core.engine.AudioTrack;
import com.ss.ttlivestreamer.core.engine.MediaEncodeStream;
import com.ss.ttlivestreamer.core.engine.MediaEngineFactory;
import com.ss.ttlivestreamer.core.engine.MediaSource;
import com.ss.ttlivestreamer.core.engine.MediaTrack;
import com.ss.ttlivestreamer.core.engine.NativeObject;
import com.ss.ttlivestreamer.core.engine.SITICalculator;
import com.ss.ttlivestreamer.core.engine.Transport;
import com.ss.ttlivestreamer.core.engine.VideoEncoderFactory;
import com.ss.ttlivestreamer.core.engine.VideoFrameStatistics;
import com.ss.ttlivestreamer.core.engine.VideoProcessor;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.engine.VideoSource;
import com.ss.ttlivestreamer.core.engine.VideoTrack;
import com.ss.ttlivestreamer.core.engine.VsyncModule;
import com.ss.ttlivestreamer.core.mixer.AudioMixer;
import com.ss.ttlivestreamer.core.mixer.VideoMixer;
import com.ss.ttlivestreamer.core.statics.StaticsReport;
import com.ss.ttlivestreamer.core.strategy.LiveStreamBaseStrategy;
import com.ss.ttlivestreamer.core.transport.LibRTMPTransport;
import com.ss.ttlivestreamer.core.transport.PushStreamStallRecorder;
import com.ss.ttlivestreamer.core.transport.RTMPReconnectHelper;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.AVLog2;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.LibraryLoader;
import com.ss.ttlivestreamer.core.utils.LogUtil;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThread;
import com.ss.ttlivestreamer.core.utils.SafeHandlerThreadPoolExecutor;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.ThreadUtils;
import com.ss.ttlivestreamer.core.utils.TokenCertConfigUtils;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.InputAudioStream;
import com.ss.ttlivestreamer.livestreamv2.InputVideoStream;
import com.ss.ttlivestreamer.livestreamv2.LiveStream;
import com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder;
import com.ss.ttlivestreamer.livestreamv2.audioeffect.AudioCatcher;
import com.ss.ttlivestreamer.livestreamv2.capture.AudioCapturerExternal;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCapture;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamAudioCaptureFromADM;
import com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture;
import com.ss.ttlivestreamer.livestreamv2.control.IVideoCapturerControl;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.core.audiorecord.IAudioRecordManager;
import com.ss.ttlivestreamer.livestreamv2.core.velivepusher.IVeLivePusher;
import com.ss.ttlivestreamer.livestreamv2.filter.FilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVQScoreFilter;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter;
import com.ss.ttlivestreamer.livestreamv2.ktv.IKaraokeMovie;
import com.ss.ttlivestreamer.livestreamv2.log.ILogUploader;
import com.ss.ttlivestreamer.livestreamv2.log.LiveStreamConnectResultEventResult;
import com.ss.ttlivestreamer.livestreamv2.log.LiveStreamConnectResultEventSource;
import com.ss.ttlivestreamer.livestreamv2.log.LiveStreamEventTracker;
import com.ss.ttlivestreamer.livestreamv2.log.LiveStreamLogService;
import com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager;
import com.ss.ttlivestreamer.livestreamv2.recorder.RecorderManager;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.BwEstBaseBWConfig;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.BwEstCfg;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.KcpParams;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LWReconnectCfg;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.NodeOptParams;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.QuicParams;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.RtmpCacheConfig;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.SandboxParams;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.SitiConfig;
import com.ss.ttlivestreamer.livestreamv2.strategy.EncodeFpsAdjustStrategy;
import com.ss.ttlivestreamer.livestreamv2.strategy.EncoderFpsAdjustStrategyAvg;
import com.ss.ttlivestreamer.livestreamv2.strategy.FpsLevelStrategy;
import com.ss.ttlivestreamer.livestreamv2.strategy.PerfAwareFpsStrategy;
import com.ss.ttlivestreamer.livestreamv2.strategy.VideoAlgorithmStrategy;
import com.ss.ttlivestreamer.livestreamv2.utils.AdaptResolutionUtils;
import com.ss.ttlivestreamer.livestreamv2.utils.NumberInit;
import com.ss.ttlivestreamer.livestreamv2.utils.PrivacyCertManager;
import com.ss.ttlivestreamer.livestreamv2.utils.TTLSConstantsLifecycleCallback;
import com.ss.ttlivestreamer.livestreamv2.utils.UrlUtils;
import com.ss.ttlivestreamer.livestreamv2.utils.VideoDumpProxy;
import com.ss.videoarch.strategy.LiveStrategyManager;
import defpackage.b1;
import defpackage.i0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LiveStream implements ILiveStream, LiveStreamVideoCapture.Observer, Transport.EventObserver, MediaEncodeStream.Observer, LiveStreamBaseStrategy.IStrategyNotify, EffectWrapper.IEffectEdgeRenderLog, AudioSource.PowerObserver, AudioCapturer.AudioCaptureObserver {
    public static volatile long mServerIPTime;
    public final int TRI_STATE_DEFAULT;
    public final int TRI_STATE_FALSE;
    public final int TRI_STATE_TRUE;
    public AdaptResolutionUtils adaptResolutionUtils;
    public SafeHandlerThread dataNotifyThread;
    public final IVideoEffectProcessor effectProcessor;
    public LiveStreamGpuTurboWrapper gpuTurboWrapper;
    public boolean isLWReconnectStatusError;
    public boolean isLWReconnectStatusProcess;
    public long lastEstBitrate;
    public LiveCore.Builder.ILogMonitor logMonitor;
    public boolean mAbkeyEnableProtocolDownGrade;
    public int mAddSeiCount;
    public volatile long mAdjustBitrate;
    public AudioCapturer mAudioCapture;
    public AudioDeviceModule mAudioDeviceModule;
    public String mAudioEncodeVsyncName;
    public AudioEncoderFactory mAudioEncoderFactory;
    public String mAudioEncoderInfo;
    public IAudioFilterManager mAudioFilterManager;
    public AudioFrameAvailableSink mAudioFrameAvailableSink;
    public boolean mAudioMixer;
    public IAudioRecordManager mAudioRecordManager;
    public int mAudioRecordMode;
    public AudioManager.AudioRecordingCallback mAudioRecordingCallback;
    public AudioTrack mAudioTrack;
    public String[] mAvailableAudioEncoders;
    public String[] mAvailableVideoEncoders;
    public final LiveStreamBpsFpsUpdater mBpsFpsUpdater;
    public long mCreateEncodeCount;
    public ILiveStream.ILiveStreamDataListener mDataListener;
    public final Handler mDataNotifyThreadHandler;
    public InterfaceC63833P3l mDns;
    public boolean mDnsOptHit;
    public boolean mDnsOptOpen;
    public boolean mEableDownGradeInSend;
    public int mEanbleReportStallLog;
    public boolean mEffectInited;
    public boolean mEnableAbortRequest;
    public boolean mEnableProtocolDownGrade;
    public boolean mEnableUrlFallBack;
    public boolean mEnalbeReconnect;
    public EncodeFpsAdjustStrategy mEncodeFpsAdjustStrategy;
    public VideoDumpProxy.RawVideoDumperProxy mEncodeFrameDumper;
    public VideoSink mEncodeFrameSink;
    public TEBundle mEncodeStreamOpt;
    public int mErrorCodeQuicDownGrade;
    public ILiveStream.ILiveStreamErrorListener mErrorListener;
    public String mEvaluatorSymbol;
    public JSONObject mEvaluatorSymbolMap;
    public ILiveStream.IAudioFrameAvailableListener mExternalAudioFrameListener;
    public IFilterManager mFilterManager;
    public boolean mFirstConnect;
    public boolean mFirstConnectAction;
    public boolean mFirstFrameRendered;
    public FpsLevelStrategy mFpsLevelStrategy;
    public int mHasFirstConnected;
    public ILiveStream.ILiveStreamInfoListener mInfoListener;
    public ArrayList<IInputAudioStream> mInputAudioStreams;
    public Object mInputStreamListFence;
    public ArrayList<IInputVideoStream> mInputVideoStreams;
    public final String mInvalidOptUrl;
    public boolean mIsKaraokeMovie;
    public boolean mIsRadioMode;
    public IKaraokeMovie mKaraokeMovie;
    public long mLastAddSeiStatTime;
    public String mLastSourceSeiValue;
    public int[] mLiveBitrateSave;
    public LiveStreamBuilder mLiveStreamBuilder;
    public LiveStreamEventTracker mLiveStreamEventTracker;
    public LiveStreamBaseStrategy mLiveStreamStrategy;
    public MediaEncodeStream mMediaEncodeStream;
    public MediaEngineFactory mMediaEngineFactory;
    public final Handler mMiscThreadHandler;
    public volatile boolean mMuted;
    public int mNodeIndex;
    public NodeListenerImpl mNodeListener;
    public InterfaceC63814P2s mNodeListenerInternal;
    public HashMap<String, String> mOptUrlMap;
    public int mOptUrlReachable;
    public IInputAudioStream mOrigInputAudioStream;
    public AudioMixer.AudioMixerDescription mOriginAudioStreamDescription;
    public IInputVideoStream mOriginInputVideoStream;
    public VideoMixer.VideoMixerDescription mOriginVideoStreamDescription;
    public volatile boolean mPaused;
    public PerfAwareFpsStrategy mPerfAwareFpsStrategy;
    public HashMap<String, List<String>> mPreparedIpList;
    public boolean mProtocolDownGradeFlag;
    public int mProtocolDownGradeType;
    public boolean mPublishPlanarRender;
    public boolean mPushStreamAfterServerMix;
    public PushStreamStallRecorder mPushStreamStallRecorder;
    public boolean mPushStreamStart;
    public int mQuicFlag;
    public Transport mRTMPTransport;
    public final Object mRTMPTransportFence;
    public RecorderManager mRecorderManager;
    public Object mReleaseFence;
    public VideoSink mRenderView;
    public ReentrantReadWriteLock mReportFence;
    public String mRequestId;
    public RoiSwitch mRoiSwitch;
    public int mRtmpReConnectCounts;
    public int mRtmpReConnectCountsThreshold;
    public RTMPReconnectHelper mRtmpReconnectHelper;
    public int mRtmpReconnectVersion;
    public boolean mRtmpqDownGrade;
    public SITICalculator mSITICalculator;
    public long mSeiCurrentShiftDiffTime;
    public volatile String mServerIP;
    public volatile boolean mStartServerMixWhilePushStream;
    public AtomicInteger mStatus;
    public boolean mStrategyDnsOptOpen;
    public JSONObject mStrategynodeOptimizerInfos;
    public LiveStreamLogService mStreamLogService;
    public String mStreamUuid;
    public TextureFrameAvailableSink mTextureFrameAvailableSink;
    public TEBundle mTransportOpt;
    public long mUploadLogInterval;
    public String mUri;
    public int mUriReachable;
    public List<String> mUris;
    public long mUrlPriority;
    public final HashMap<String, UserMetadata> mUserMetadata;
    public AudioSink mVeLiveAudioSink;
    public IVeLivePusher mVeLivePusher;
    public VideoSink mVeLiveVideoSink;
    public TEBundle mVideoAdaptParams;
    public VideoAlgorithmStrategy mVideoAlgorithmStrategy;
    public final Handler mVideoCaptureHandler;
    public LiveStreamVideoCapture mVideoCapturer;
    public String mVideoEncodeVsyncName;
    public VideoEncoderFactory mVideoEncoderFactory;
    public String mVideoEncoderInfo;
    public long mVideoFrameNum;
    public VideoFrameStatistics mVideoFrameStatics;
    public int mVideoMixBgColor;
    public boolean mVideoMixer;
    public VideoTrack mVideoTrack;
    public final Handler mWorkThreadHandler;
    public SafeHandlerThread miscThread;
    public TEBundle pushStallConfigBundle;
    public Runnable rtmpReconnectRunnable;
    public boolean tryOpenAudioCaptureOnLater;
    public SafeHandlerThread workThread;

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$1 */
    /* loaded from: classes12.dex */
    public class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$1__run$___twin___() {
            LiveStream liveStream = LiveStream.this;
            if (liveStream.mAudioFrameAvailableSink == null) {
                liveStream.mAudioFrameAvailableSink = new AudioFrameAvailableSink();
            }
            LiveStream liveStream2 = LiveStream.this;
            liveStream2.mAudioFrameAvailableSink.addListener((FilterManager) liveStream2.mFilterManager);
        }

        public AnonymousClass1() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
            boolean LIZ;
            try {
                anonymousClass1.com_ss_ttlivestreamer_livestreamv2_LiveStream$1__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$11 */
    /* loaded from: classes12.dex */
    public class AnonymousClass11 implements Runnable {
        public final /* synthetic */ String val$track;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$11__run$___twin___() {
            if (LiveStream.this.mMediaEncodeStream != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setOriginVideoTrack to:");
                LIZ.append(r2);
                LIZ.append(",Orig Track is:");
                LIZ.append(LiveStream.this.getOriginInputVideoStream().name());
                AVLog.iow("LiveStream-StreamTrace", X1D.LIZIZ(LIZ));
                LiveStream.this.mMediaEncodeStream.setOriginVideoTrack(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
            boolean LIZ;
            try {
                anonymousClass11.com_ss_ttlivestreamer_livestreamv2_LiveStream$11__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass11(String str) {
            r2 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$12 */
    /* loaded from: classes12.dex */
    public class AnonymousClass12 implements Runnable {
        public final /* synthetic */ String val$track;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$12__run$___twin___() {
            if (LiveStream.this.mMediaEncodeStream != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setOriginAudioTrack to:");
                LIZ.append(r2);
                LIZ.append(",Orig Track is:");
                LIZ.append(LiveStream.this.getOriginInputAudioStream().name());
                AVLog.iow("LiveStream-StreamTrace", X1D.LIZIZ(LIZ));
                LiveStream.this.mMediaEncodeStream.setOriginAudioTrack(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
            boolean LIZ;
            try {
                anonymousClass12.com_ss_ttlivestreamer_livestreamv2_LiveStream$12__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass12(String str) {
            r2 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$13 */
    /* loaded from: classes12.dex */
    public class AnonymousClass13 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$13__run$___twin___() {
            LiveStream liveStream = LiveStream.this;
            liveStream.mEnalbeReconnect = false;
            liveStream.reportPushStreamResult();
            PushStreamStallRecorder pushStreamStallRecorder = LiveStream.this.mPushStreamStallRecorder;
            if (pushStreamStallRecorder != null) {
                pushStreamStallRecorder.stop();
            }
            LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
            if (liveStreamLogService != null) {
                liveStreamLogService.stopPeriodReport();
            }
            LiveStream.this.doStop();
        }

        public AnonymousClass13() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
            boolean LIZ;
            try {
                anonymousClass13.com_ss_ttlivestreamer_livestreamv2_LiveStream$13__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$15 */
    /* loaded from: classes12.dex */
    public class AnonymousClass15 implements BmfVideoDenoiseFilter.Callback {
        @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter.Callback
        public int[] getPushStreamSize() {
            return new int[]{LiveStream.this.mLiveStreamBuilder.getVideoWidth(), LiveStream.this.mLiveStreamBuilder.getVideoHeight()};
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter.Callback
        public int getCameraFacing() {
            LiveStreamVideoCapture liveStreamVideoCapture = LiveStream.this.mVideoCapturer;
            if (liveStreamVideoCapture != null) {
                int currentCaptureDevice = liveStreamVideoCapture.getCurrentCaptureDevice();
                if (currentCaptureDevice == 1) {
                    return 0;
                }
                if (currentCaptureDevice == 2) {
                    return 1;
                }
                return -1;
            }
            return -1;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter.Callback
        public int getCameraISO() {
            IVideoCapturerControl videoCapturerControl = LiveStream.this.getVideoCapturerControl();
            if (videoCapturerControl != null) {
                return (int) videoCapturerControl.getISOInfo();
            }
            return -1;
        }

        public AnonymousClass15() {
        }

        public /* synthetic */ void lambda$onBitrateRatioChange$0(float f) {
            TEBundle tEBundle = new TEBundle();
            tEBundle.setString("from", "videoDenoise");
            tEBundle.setDouble("bitrateRatio", f);
            LiveStream.this.updateSdkParams(tEBundle);
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilter.Callback
        public void onBitrateRatioChange(final float f) {
            LiveStream.this.mWorkThreadHandler.post(new Runnable() { // from class: X.P2m
                @Override // java.lang.Runnable
                public final void run() {
                    LiveStream.AnonymousClass15.this.lambda$onBitrateRatioChange$0(f);
                }
            });
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$16 */
    /* loaded from: classes12.dex */
    public class AnonymousClass16 implements Runnable {
        public final /* synthetic */ boolean[] val$timeout;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$16__run$___twin___() {
            LiveStream.this.onReleaseSafe();
            synchronized (LiveStream.this.mReleaseFence) {
                r2[0] = false;
                LiveStream.this.mReleaseFence.notifyAll();
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass16 anonymousClass16) {
            boolean LIZ;
            try {
                anonymousClass16.com_ss_ttlivestreamer_livestreamv2_LiveStream$16__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass16(boolean[] zArr) {
            r2 = zArr;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$17 */
    /* loaded from: classes12.dex */
    public class AnonymousClass17 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$17__run$___twin___() {
            RecorderManager recorderManager = LiveStream.this.mRecorderManager;
            if (recorderManager != null) {
                recorderManager.stop();
                LiveStream.this.mRecorderManager.release();
                LiveStream.this.mRecorderManager = null;
            }
        }

        public AnonymousClass17() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass17 anonymousClass17) {
            boolean LIZ;
            try {
                anonymousClass17.com_ss_ttlivestreamer_livestreamv2_LiveStream$17__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$18 */
    /* loaded from: classes12.dex */
    public class AnonymousClass18 implements Runnable {
        public final /* synthetic */ int val$scenario;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$18__run$___twin___() {
            AudioDeviceModule audioDeviceModule = LiveStream.this.mAudioDeviceModule;
            if (audioDeviceModule != null) {
                audioDeviceModule.setAudioScenario(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass18 anonymousClass18) {
            boolean LIZ;
            try {
                anonymousClass18.com_ss_ttlivestreamer_livestreamv2_LiveStream$18__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass18(int i) {
            r2 = i;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$19 */
    /* loaded from: classes12.dex */
    public class AnonymousClass19 implements Runnable {
        public final /* synthetic */ int val$flag;
        public final /* synthetic */ String val$key;
        public final /* synthetic */ String val$value;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$19__run$___twin___() {
            Transport transport = LiveStream.this.mRTMPTransport;
            if (transport != null) {
                transport.addUserMetaData(r2, r3, r4);
            }
            IVeLivePusher iVeLivePusher = LiveStream.this.mVeLivePusher;
            if (iVeLivePusher != null) {
                iVeLivePusher.addUserMetaData(r2, r3, r4);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass19 anonymousClass19) {
            boolean LIZ;
            try {
                anonymousClass19.com_ss_ttlivestreamer_livestreamv2_LiveStream$19__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass19(String str, String str2, int i) {
            r2 = str;
            r3 = str2;
            r4 = i;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$2 */
    /* loaded from: classes12.dex */
    public class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$2__run$___twin___() {
            LiveStream.this.rtmpReconnect();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Rtmp reconnecting... with current status ");
            LIZ.append(LiveStream.this.mStatus);
            AVLog.iod("LiveStream", X1D.LIZIZ(LIZ));
        }

        public AnonymousClass2() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
            boolean LIZ;
            try {
                anonymousClass2.com_ss_ttlivestreamer_livestreamv2_LiveStream$2__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$20 */
    /* loaded from: classes12.dex */
    public class AnonymousClass20 implements Runnable {
        public final /* synthetic */ VideoSink val$sink;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$20__run$___twin___() {
            VideoSink videoSink;
            VideoSink videoSink2 = r2;
            LiveStream liveStream = LiveStream.this;
            VideoTrack videoTrack = liveStream.mVideoTrack;
            if (videoTrack != null && (videoSink = liveStream.mRenderView) != null) {
                videoTrack.removeVideoSink(videoSink);
                LiveStream.this.mRenderView.release();
                LiveStream.this.mRenderView = null;
            }
            VideoSink videoSink3 = LiveStream.this.mRenderView;
            if (videoSink3 != null) {
                videoSink3.release();
                LiveStream.this.mRenderView = null;
            }
            LiveStream liveStream2 = LiveStream.this;
            liveStream2.mRenderView = videoSink2;
            VideoTrack videoTrack2 = liveStream2.mVideoTrack;
            if (videoTrack2 != null && videoSink2 != null) {
                videoTrack2.addVideoSink(videoSink2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass20 anonymousClass20) {
            boolean LIZ;
            try {
                anonymousClass20.com_ss_ttlivestreamer_livestreamv2_LiveStream$20__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass20(VideoSink videoSink) {
            r2 = videoSink;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$21 */
    /* loaded from: classes12.dex */
    public class AnonymousClass21 implements Runnable {
        public final /* synthetic */ LiveStreamOption[] val$opt;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$21__run$___twin___() {
            MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
            if (mediaEncodeStream != null) {
                r2[0] = new LiveStreamOption(mediaEncodeStream.getParameter());
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass21 anonymousClass21) {
            boolean LIZ;
            try {
                anonymousClass21.com_ss_ttlivestreamer_livestreamv2_LiveStream$21__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass21(LiveStreamOption[] liveStreamOptionArr) {
            r2 = liveStreamOptionArr;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$22 */
    /* loaded from: classes12.dex */
    public class AnonymousClass22 implements Runnable {
        public final /* synthetic */ TEBundle val$opt;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$22__run$___twin___() {
            MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
            if (mediaEncodeStream != null) {
                mediaEncodeStream.setParameter(r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass22 anonymousClass22) {
            boolean LIZ;
            try {
                anonymousClass22.com_ss_ttlivestreamer_livestreamv2_LiveStream$22__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass22(TEBundle tEBundle) {
            r2 = tEBundle;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$24 */
    /* loaded from: classes12.dex */
    public class AnonymousClass24 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$24__run$___twin___() {
            if (LiveStream.this.onCanEncodeStream()) {
                LiveStream.this.addTrackToEncodeStream();
            }
        }

        public AnonymousClass24() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass24 anonymousClass24) {
            boolean LIZ;
            try {
                anonymousClass24.com_ss_ttlivestreamer_livestreamv2_LiveStream$24__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$25 */
    /* loaded from: classes12.dex */
    public class AnonymousClass25 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$25__run$___twin___() {
            int i;
            int videoCaptureDevice;
            LiveStreamVideoCapture liveStreamVideoCapture = LiveStream.this.mVideoCapturer;
            if (liveStreamVideoCapture != null) {
                i = liveStreamVideoCapture.getValidCaptureFps();
            } else {
                i = 0;
            }
            LiveStream liveStream = LiveStream.this;
            LiveStreamVideoCapture liveStreamVideoCapture2 = liveStream.mVideoCapturer;
            if (liveStreamVideoCapture2 != null) {
                videoCaptureDevice = liveStreamVideoCapture2.getCurrentCaptureDevice();
            } else {
                videoCaptureDevice = liveStream.mLiveStreamBuilder.getVideoCaptureDevice();
            }
            liveStream.reportLiveCoreInfo(5, videoCaptureDevice, i);
        }

        public AnonymousClass25() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass25 anonymousClass25) {
            boolean LIZ;
            try {
                anonymousClass25.com_ss_ttlivestreamer_livestreamv2_LiveStream$25__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$26 */
    /* loaded from: classes12.dex */
    public class AnonymousClass26 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$26_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$26__run$___twin___() {
            int videoCaptureDevice;
            LiveStream liveStream = LiveStream.this;
            LiveStreamVideoCapture liveStreamVideoCapture = liveStream.mVideoCapturer;
            if (liveStreamVideoCapture != null) {
                videoCaptureDevice = liveStreamVideoCapture.getStoppedSource();
            } else {
                videoCaptureDevice = liveStream.mLiveStreamBuilder.getVideoCaptureDevice();
            }
            liveStream.reportLiveCoreInfo(6, videoCaptureDevice, 0);
        }

        public AnonymousClass26() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$26_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass26 anonymousClass26) {
            boolean LIZ;
            try {
                anonymousClass26.com_ss_ttlivestreamer_livestreamv2_LiveStream$26__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$28 */
    /* loaded from: classes12.dex */
    public class AnonymousClass28 implements Runnable {
        public final /* synthetic */ int val$code1;
        public final /* synthetic */ int val$code2;
        public final /* synthetic */ int val$code3;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$28__run$___twin___() {
            LiveStreamBuilder liveStreamBuilder;
            ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener;
            int i = r2;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 || (iLiveStreamInfoListener = LiveStream.this.mInfoListener) == null) {
                        return;
                    }
                    try {
                        iLiveStreamInfoListener.onInfo(44, r3, r4);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                LiveStream.this.reportLiveCoreInfo(38, r3, r4);
                return;
            }
            if (LiveStream.this.getLiveStreamBuilder().getSdkSetting().cameraSizeOptUpdateWhOnThread || (liveStreamBuilder = LiveStream.this.mLiveStreamBuilder) == null) {
                return;
            }
            liveStreamBuilder.setVideoCaptureWidth(r3);
            liveStreamBuilder.setVideoCaptureHeight(r4);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("fallback using capture resolution:");
            LIZ.append(r3);
            LIZ.append(",");
            LIZ.append(r4);
            AVLog.logKibana(5, "LiveStream", X1D.LIZIZ(LIZ), null);
            LiveStream.this.reportLiveCoreInfo(37, r3, r4);
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass28 anonymousClass28) {
            boolean LIZ;
            try {
                anonymousClass28.com_ss_ttlivestreamer_livestreamv2_LiveStream$28__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass28(int i, int i2, int i3) {
            r2 = i;
            r3 = i2;
            r4 = i3;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$29 */
    /* loaded from: classes12.dex */
    public class AnonymousClass29 implements Runnable {
        public final /* synthetic */ int val$power;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$29_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$29__run$___twin___() {
            ILiveStream.ILiveStreamDataListener iLiveStreamDataListener = LiveStream.this.mDataListener;
            if (iLiveStreamDataListener != null) {
                iLiveStreamDataListener.onData(1, r2, 0);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$29_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass29 anonymousClass29) {
            boolean LIZ;
            try {
                anonymousClass29.com_ss_ttlivestreamer_livestreamv2_LiveStream$29__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass29(int i) {
            r2 = i;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$30 */
    /* loaded from: classes12.dex */
    public class AnonymousClass30 implements Runnable {
        public final /* synthetic */ int val$code1;
        public final /* synthetic */ int val$code2;
        public final /* synthetic */ long val$code3;
        public final /* synthetic */ String val$msg;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$30_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$30__run$___twin___() {
            long j;
            long j2;
            long j3;
            long j4;
            boolean z;
            VsyncModule vsyncModule;
            RTMPReconnectHelper rTMPReconnectHelper;
            if (LiveStream.this.mStatus.get() == 7 || LiveStream.this.mStatus.get() == 8) {
                return;
            }
            String str = "";
            long j5 = -1;
            LiveStream liveStream = LiveStream.this;
            if (liveStream.mRtmpReconnectVersion >= 2 && (rTMPReconnectHelper = liveStream.mRtmpReconnectHelper) != null) {
                rTMPReconnectHelper.OnEvent(r2, r3, r4, r6);
            }
            switch (r2) {
                case 0:
                    AVLog.ioi("LiveStream", "Rtmp start connecting");
                    LiveStream.this.reportLiveCoreInfo(10, 0, 0);
                    LiveStream.this.mStreamLogService.onRTMPConnecting();
                    return;
                case 1:
                    LiveStream liveStream2 = LiveStream.this;
                    if (liveStream2.mRtmpReconnectVersion == 1 || liveStream2.isLWReconnectNotCatchTransEvent()) {
                        LiveStream.this.sendConnectResultWhenConnected();
                    }
                    LiveStream.this.reportLiveCoreInfo(11, 0, 0);
                    Transport transport = LiveStream.this.mRTMPTransport;
                    if (transport != null) {
                        str = transport.getString(21);
                        j5 = LiveStream.this.mRTMPTransport.getInt64Value(2);
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Rtmp connected: reconnect counts ");
                    LIZ.append(LiveStream.this.mRtmpReConnectCounts);
                    LIZ.append(", first connect ");
                    LIZ.append(LiveStream.this.mFirstConnect);
                    LIZ.append(", remote ip ");
                    LIZ.append(str);
                    LIZ.append(", dns time ");
                    LIZ.append(j5);
                    AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ));
                    LiveStream liveStream3 = LiveStream.this;
                    liveStream3.mStreamLogService.onRTMPEnd(200, liveStream3.mRtmpReConnectCounts, liveStream3.mFirstConnect, str, j5);
                    LiveStream liveStream4 = LiveStream.this;
                    liveStream4.mRtmpqDownGrade = false;
                    liveStream4.mProtocolDownGradeType = 0;
                    liveStream4.onRtmpConncted();
                    LiveStream.this.reportRtmpPublishSuccess();
                    if (!LiveStream.this.isLWReconnectNotCatchTransEvent()) {
                        return;
                    }
                    LiveStream.this.resetLightWeightReconnectStatus();
                    return;
                case 2:
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Rtmp send too slow: send delay ");
                    LIZ2.append(r3);
                    AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ2));
                    LiveStream.this.reportLiveCoreInfo(13, r3, 0);
                    LiveStream.this.mStreamLogService.onSendPktSlow(r3);
                    LiveStream.this.onRtmpSendTooSlow();
                    return;
                case 3:
                    LiveStream liveStream5 = LiveStream.this;
                    liveStream5.mRtmpqDownGrade = true;
                    liveStream5.mProtocolDownGradeType = 1;
                    if (liveStream5.mRtmpReconnectVersion != 1 && !liveStream5.isLWReconnectNotCatchTransEvent()) {
                        return;
                    }
                    LiveStream.this.sendConnectResultWhenConnectFailed(r2, r3, r4, r6);
                    LiveStream liveStream6 = LiveStream.this;
                    if (liveStream6.mRtmpReConnectCounts >= liveStream6.mLiveStreamBuilder.getRtmpReconnectCounts()) {
                        Transport transport2 = LiveStream.this.mRTMPTransport;
                        if (transport2 != null) {
                            str = transport2.getString(21);
                            j5 = LiveStream.this.mRTMPTransport.getInt64Value(2);
                        }
                        LiveStream liveStream7 = LiveStream.this;
                        liveStream7.mStreamLogService.onRTMPEnd(r3, liveStream7.mRtmpReConnectCounts, liveStream7.mFirstConnect, str, j5);
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Rtmp connecting failed: code2 ");
                    LIZ3.append(r3);
                    LIZ3.append(", code3 ");
                    LIZ3.append(r4);
                    LIZ3.append(", reconnect counts ");
                    LIZ3.append(LiveStream.this.mRtmpReConnectCounts);
                    LIZ3.append(", first connect ");
                    LIZ3.append(LiveStream.this.mFirstConnect);
                    String LIZIZ = X1D.LIZIZ(LIZ3);
                    AVLog.ioe("LiveStream", LIZIZ);
                    LiveStream.this.onRtmpFailed(r2, r3, r4, r6);
                    LiveStream liveStream8 = LiveStream.this;
                    liveStream8.onUpLoadRtmpFailedLog(r3, liveStream8.mRtmpReConnectCounts, liveStream8.mFirstConnect, str, j5, LIZIZ);
                    return;
                case 4:
                    long j6 = r4;
                    String str2 = "avSync error: ";
                    long j7 = 0;
                    try {
                        j = CastIntegerProtector.parseInt(r6);
                    } catch (Exception unused) {
                        StringBuilder LIZJ = b1.LIZJ("avSync error: ", "realVideoPts: ");
                        str2 = JBR.LJFF(LIZJ, r6, " ", LIZJ);
                        j = 0;
                    }
                    long j8 = j6 + j;
                    MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
                    if (mediaEncodeStream != null && (vsyncModule = mediaEncodeStream.getVsyncModule()) != null) {
                        j2 = vsyncModule.getFirstFrameTimestampMs(LiveStream.this.getOriginInputVideoStream().name());
                        j3 = vsyncModule.getFirstFrameTimestampMs(LiveStream.this.getOriginInputAudioStream().name());
                        j7 = vsyncModule.lastTimeMills(LiveStream.this.getOriginInputVideoStream().name());
                        j4 = vsyncModule.getMaxIntevalMs(LiveStream.this.getOriginInputVideoStream().name());
                    } else {
                        j2 = 0;
                        j3 = 0;
                        j4 = 0;
                    }
                    LiveStreamVideoCapture liveStreamVideoCapture = LiveStream.this.mVideoCapturer;
                    if (liveStreamVideoCapture != null) {
                        z = liveStreamVideoCapture.backgroundMode();
                    } else {
                        z = false;
                    }
                    long nativeNowNanos = VsyncModule.nativeNowNanos() / 1000000;
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append(str2);
                    LIZ4.append("audio pts ");
                    LIZ4.append(j8);
                    LIZ4.append(", video pts ");
                    LIZ4.append(j);
                    C0MT.LIZLLL(LIZ4, " last vpts ", j7, " video maxFI ");
                    V1I.LIZJ(LIZ4, j4, " bgm ", z);
                    C0MT.LIZLLL(LIZ4, " CurrTimeMs ", nativeNowNanos, " vFirst ");
                    LIZ4.append(j2);
                    LIZ4.append(" aFirst ");
                    LIZ4.append(j3);
                    String LIZIZ2 = X1D.LIZIZ(LIZ4);
                    AVLog.ioe("LiveStream", LIZIZ2);
                    LiveStream.this.mStreamLogService.onPushStreamFail(r3, LIZIZ2);
                    LiveStream liveStream9 = LiveStream.this;
                    if (liveStream9.mRtmpReconnectVersion != 1 && !liveStream9.isLWReconnectNotCatchTransEvent()) {
                        return;
                    }
                    LiveStream.this.onRtmpFailed(r2, r3, r4, r6);
                    return;
                case 5:
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("interleave fail: error code ");
                    LIZ5.append(r3);
                    AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ5));
                    LiveStream.this.mStreamLogService.onPushStreamFail(r3, "interleave fail");
                    LiveStream liveStream10 = LiveStream.this;
                    if (liveStream10.mRtmpReconnectVersion != 1 && !liveStream10.isLWReconnectNotCatchTransEvent()) {
                        return;
                    }
                    LiveStream.this.onRtmpFailed(r2, r3, r4, r6);
                    return;
                case 6:
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("Rtmp send package failed: error code ");
                    LIZ6.append(r3);
                    AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ6));
                    LiveStream.this.mStreamLogService.onPushStreamFail(r3, "RtmpSendPacketFail");
                    long pushDuration = LiveStream.this.mStreamLogService.getPushDuration();
                    LiveStream liveStream11 = LiveStream.this;
                    if (liveStream11.mEableDownGradeInSend && pushDuration <= 10000) {
                        liveStream11.mRtmpqDownGrade = true;
                        liveStream11.mProtocolDownGradeType = 2;
                    }
                    if (liveStream11.mRtmpReconnectVersion != 1 && !liveStream11.isLWReconnectNotCatchTransEvent()) {
                        return;
                    }
                    LiveStream.this.onRtmpFailed(r2, r3, r4, r6);
                    return;
                case 7:
                    AVLog.ioi("LiveStream", "Rtmp pushing stopped");
                    LiveStream.this.reportLiveCoreInfo(14, 0, 0);
                    return;
                case 8:
                    LiveStream.this.mStreamLogService.onKCPMessage(r6);
                    return;
                case 9:
                    LiveStream.this.mStreamLogService.onQUICMessage(r6);
                    return;
                case 10:
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append("Rtmp connecting failed: error code ");
                    LIZ7.append(r3);
                    String LIZIZ3 = X1D.LIZIZ(LIZ7);
                    AVLog.ioe("LiveStream", LIZIZ3);
                    LiveStream liveStream12 = LiveStream.this;
                    liveStream12.mRtmpqDownGrade = true;
                    liveStream12.mProtocolDownGradeType = 1;
                    if (liveStream12.mRtmpReconnectVersion != 1 && !liveStream12.isLWReconnectNotCatchTransEvent()) {
                        return;
                    }
                    LiveStream.this.onRtmpFailed(r2, r3, r4, r6);
                    LiveStream liveStream13 = LiveStream.this;
                    liveStream13.onUpLoadRtmpFailedLog(r3, liveStream13.mRtmpReConnectCounts, liveStream13.mFirstConnect, "", -1L, LIZIZ3);
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                case 12:
                case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                case 15:
                default:
                    return;
                case 14:
                    LiveStream.this.mStreamLogService.onOtherMessage(r6);
                    return;
                case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                    LiveStream.this.mStreamLogService.setSandboxProceedCost(r4);
                    return;
                case 17:
                    LiveStream.this.mStreamLogService.onPushStreamStall(true, r3, r4);
                    return;
                case 18:
                    LiveStream.this.mStreamLogService.onPushStreamStall(false, r3, r4);
                    return;
                case 19:
                    LiveStream.this.mStreamLogService.onRTMPMessage(r6);
                    return;
                case 20:
                    LiveStream.this.mStreamLogService.onReportBwAdjustTime(r3, r4);
                    return;
                case 21:
                    LiveStream.this.mStreamLogService.onReportAvoCache(r3, r4);
                    return;
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$30_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass30 anonymousClass30) {
            boolean LIZ;
            try {
                anonymousClass30.com_ss_ttlivestreamer_livestreamv2_LiveStream$30__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass30(int i, int i2, long j, String str) {
            r2 = i;
            r3 = i2;
            r4 = j;
            r6 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$31 */
    /* loaded from: classes12.dex */
    public class AnonymousClass31 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$31_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$31__run$___twin___() {
            if (LiveStream.this.isStreaming()) {
                LiveStream.this.reportLiveCoreInfo(42, 0, 0);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("reportRtmpPublishSuccess, success = ");
                LIZ.append(LiveStream.this.isStreaming());
                AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ));
            }
        }

        public AnonymousClass31() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$31_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass31 anonymousClass31) {
            boolean LIZ;
            try {
                anonymousClass31.com_ss_ttlivestreamer_livestreamv2_LiveStream$31__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$32 */
    /* loaded from: classes12.dex */
    public class AnonymousClass32 implements Runnable {
        public final /* synthetic */ int val$code2;
        public final /* synthetic */ long val$dnsTime;
        public final /* synthetic */ boolean val$mFirstConnect;
        public final /* synthetic */ int val$mRtmpReConnectCounts;
        public final /* synthetic */ String val$message;
        public final /* synthetic */ String val$remoteIP;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$32_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$32__run$___twin___() {
            LiveStream.this.mStreamLogService.onRTMPFailed(r2, r3, r4, r5, r6, r8);
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$32_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass32 anonymousClass32) {
            boolean LIZ;
            try {
                anonymousClass32.com_ss_ttlivestreamer_livestreamv2_LiveStream$32__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass32(int i, int i2, boolean z, String str, long j, String str2) {
            r2 = i;
            r3 = i2;
            r4 = z;
            r5 = str;
            r6 = j;
            r8 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$33 */
    /* loaded from: classes12.dex */
    public class AnonymousClass33 implements Runnable {
        public final /* synthetic */ int val$code1;
        public final /* synthetic */ int val$code2;
        public final /* synthetic */ long val$code3;
        public final /* synthetic */ String val$msg;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$33_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$33__run$___twin___() {
            String LIZIZ;
            String str;
            int i = r2;
            if (i != 31) {
                if (i != 32) {
                    switch (i) {
                        case 1:
                            LiveStream.this.mVideoEncodeVsyncName = r3;
                            return;
                        case 2:
                        case 4:
                            LiveStream.this.onEncodeCreateEvent(i, r4, r5);
                            return;
                        case 3:
                            LiveStream.this.mAudioEncodeVsyncName = r3;
                            return;
                        case 5:
                        case 6:
                            LiveStream.this.onEncodeFormatChanged(i, r4, r5, r3);
                            return;
                        default:
                            switch (i) {
                                case 8:
                                    LiveStream.this.onAVFrameSyncError(i, r4, r5);
                                    return;
                                case 9:
                                case 10:
                                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                    LiveStream.this.onRecorderEvent(i, r4, r5, r3);
                                    return;
                                default:
                                    boolean z = true;
                                    switch (i) {
                                        case 14:
                                        case 15:
                                            if (i == 15) {
                                                LIZIZ = "Audio";
                                            } else {
                                                StringBuilder LIZ = X1D.LIZ();
                                                LIZ.append("Video Encoder Error: code");
                                                LIZ.append(r4);
                                                LIZIZ = X1D.LIZIZ(LIZ);
                                            }
                                            AVLog.logKibana(6, "LiveStream", LIZIZ, null);
                                            LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
                                            if (liveStreamLogService == null) {
                                                return;
                                            }
                                            if (r2 != 15) {
                                                z = false;
                                            }
                                            liveStreamLogService.setEncoderErrorCode(z, r4);
                                            return;
                                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                            StringBuilder LIZ2 = X1D.LIZ();
                                            if (LiveStream.this.mLiveStreamBuilder.isEnableVideoEncodeAccelera()) {
                                                str = "Hardware ";
                                            } else {
                                                str = "Software ";
                                            }
                                            LIZ2.append(str);
                                            LIZ2.append("roi is disabled, reason: ");
                                            LIZ2.append(r4);
                                            AVLog.iow("LiveStream", X1D.LIZIZ(LIZ2));
                                            if (LiveStream.this.mLiveStreamBuilder.getRoiOn() == 1) {
                                                LiveStream.this.mLiveStreamBuilder.setRoiOn(r4);
                                            }
                                            LiveStream.this.reportLiveCoreInfo(16, 16, r4);
                                            return;
                                        case 17:
                                            StringBuilder LIZ3 = X1D.LIZ();
                                            LIZ3.append("Encode frame invalid(");
                                            LIZ3.append(r4);
                                            LIZ3.append("x");
                                            LIZ3.append(r5);
                                            LIZ3.append(") VS Encoder(");
                                            LIZ3.append(LiveStream.this.mLiveStreamBuilder.getVideoWidth());
                                            LIZ3.append("x");
                                            LIZ3.append(LiveStream.this.mLiveStreamBuilder.getVideoHeight());
                                            LIZ3.append(")");
                                            AVLog2.logToIODevice2(5, "LiveStream", X1D.LIZIZ(LIZ3), null, 35, 1000);
                                            LiveStream.this.reportLiveCoreInfo(43, r2, r4);
                                            return;
                                        case 18:
                                            LiveStream.this.onVideoEncodeFpsAdjust(r4, (int) r5);
                                            return;
                                        case 19:
                                            TEBundle tEBundle = new TEBundle();
                                            if (!LiveStream.this.mLiveStreamBuilder.getRtmpCacheCfgParams().getDropEncodeFps()) {
                                                tEBundle.setInt("fps", (int) r5);
                                                tEBundle.setString("from", "netAdapt");
                                                LiveStream.this.updateSdkParams(tEBundle);
                                            } else {
                                                LiveStream.this.lambda$adaptVideoFpsForEncode$3((int) r5, "netAdapt");
                                            }
                                            tEBundle.release();
                                            LiveStream.this.reportFpsAdjust(r4, (int) r5, "net");
                                            return;
                                        case 20:
                                            LiveStream.this.onAudioEncodeProfileChanged(r4);
                                            return;
                                        default:
                                            return;
                                    }
                            }
                    }
                }
                LiveStream.this.mAudioEncoderInfo = r3;
                return;
            }
            LiveStream.this.mVideoEncoderInfo = r3;
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$33_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass33 anonymousClass33) {
            boolean LIZ;
            try {
                anonymousClass33.com_ss_ttlivestreamer_livestreamv2_LiveStream$33__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass33(int i, String str, int i2, long j) {
            r2 = i;
            r3 = str;
            r4 = i2;
            r5 = j;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$35 */
    /* loaded from: classes12.dex */
    public class AnonymousClass35 implements Runnable {
        public final /* synthetic */ InterfaceC63833P3l val$dns;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$35_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$35__run$___twin___() {
            boolean z;
            LiveStream liveStream = LiveStream.this;
            InterfaceC63833P3l interfaceC63833P3l = r2;
            liveStream.mDns = interfaceC63833P3l;
            if (interfaceC63833P3l != null) {
                z = true;
            } else {
                z = false;
            }
            liveStream.mDnsOptOpen = z;
            liveStream.mOptUrlMap = new HashMap<>();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("execute setDns, mDnsOptOpen ");
            LIZ.append(LiveStream.this.mDnsOptOpen);
            AVLog.logKibana(5, "LiveStream", X1D.LIZIZ(LIZ), null);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("execute setDns, mDnsOptOpen ");
            LIZ2.append(LiveStream.this.mDnsOptOpen);
            AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ2));
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$35_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass35 anonymousClass35) {
            boolean LIZ;
            try {
                anonymousClass35.com_ss_ttlivestreamer_livestreamv2_LiveStream$35__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass35(InterfaceC63833P3l interfaceC63833P3l) {
            r2 = interfaceC63833P3l;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$36 */
    /* loaded from: classes12.dex */
    public class AnonymousClass36 implements Runnable {
        public final /* synthetic */ ILiveStream.ITextureFrameAvailableListener val$listener;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$36_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$36__run$___twin___() {
            LiveStream liveStream;
            boolean z;
            if (LiveStream.this.mStatus.get() == 7) {
                return;
            }
            LiveStream liveStream2 = LiveStream.this;
            if (liveStream2.mTextureFrameAvailableSink == null) {
                liveStream2.mTextureFrameAvailableSink = new TextureFrameAvailableSink();
            }
            LiveStream.this.mTextureFrameAvailableSink.setListener(r2);
            LiveStream liveStream3 = LiveStream.this;
            if (liveStream3.mVideoTrack != null) {
                if (liveStream3.mLiveStreamBuilder.isEnableKTV() && (z = (liveStream = LiveStream.this).mIsKaraokeMovie)) {
                    liveStream.changeToKTVMode(z, liveStream.mKaraokeMovie);
                } else {
                    LiveStream liveStream4 = LiveStream.this;
                    liveStream4.mVideoTrack.addVideoSink(liveStream4.mTextureFrameAvailableSink);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$36_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass36 anonymousClass36) {
            boolean LIZ;
            try {
                anonymousClass36.com_ss_ttlivestreamer_livestreamv2_LiveStream$36__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass36(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
            r2 = iTextureFrameAvailableListener;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$37 */
    /* loaded from: classes12.dex */
    public class AnonymousClass37 implements Runnable {
        public final /* synthetic */ ILiveStream.IAudioFrameAvailableListener val$listener;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$37_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$37__run$___twin___() {
            if (LiveStream.this.mStatus.get() == 7) {
                return;
            }
            if (r2 == null) {
                LiveStream liveStream = LiveStream.this;
                ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener = liveStream.mExternalAudioFrameListener;
                if (iAudioFrameAvailableListener != null) {
                    AudioFrameAvailableSink audioFrameAvailableSink = liveStream.mAudioFrameAvailableSink;
                    if (audioFrameAvailableSink != null) {
                        audioFrameAvailableSink.removeListener(iAudioFrameAvailableListener);
                    }
                    LiveStream.this.mExternalAudioFrameListener = null;
                    return;
                }
                return;
            }
            LiveStream liveStream2 = LiveStream.this;
            if (liveStream2.mAudioFrameAvailableSink == null) {
                liveStream2.mAudioFrameAvailableSink = new AudioFrameAvailableSink();
            }
            LiveStream liveStream3 = LiveStream.this;
            ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener2 = r2;
            liveStream3.mExternalAudioFrameListener = iAudioFrameAvailableListener2;
            liveStream3.mAudioFrameAvailableSink.addListener(iAudioFrameAvailableListener2);
            LiveStream.this.addCapturedAudioFrameSinks();
            AudioCapturer audioCapturer = LiveStream.this.mAudioCapture;
            if (audioCapturer != null) {
                audioCapturer.resume();
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$37_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass37 anonymousClass37) {
            boolean LIZ;
            try {
                anonymousClass37.com_ss_ttlivestreamer_livestreamv2_LiveStream$37__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass37(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
            r2 = iAudioFrameAvailableListener;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$39 */
    /* loaded from: classes12.dex */
    public class AnonymousClass39 implements Runnable {
        public final /* synthetic */ InputAudioStream val$stream;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$39_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$39__run$___twin___() {
            MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
            if (mediaEncodeStream != null) {
                mediaEncodeStream.addTrack(r2.getAudioTrack());
                LiveStream.this.mMediaEncodeStream.setAudioMixerDescription(r2.name(), r2.getMixerDescription());
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$39_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass39 anonymousClass39) {
            boolean LIZ;
            try {
                anonymousClass39.com_ss_ttlivestreamer_livestreamv2_LiveStream$39__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass39(InputAudioStream inputAudioStream) {
            r2 = inputAudioStream;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$41 */
    /* loaded from: classes12.dex */
    public class AnonymousClass41 implements Runnable {
        public final /* synthetic */ InputVideoStream val$stream;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$41_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$41__run$___twin___() {
            MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
            if (mediaEncodeStream != null) {
                mediaEncodeStream.addTrack(r2.getVideoTrack());
                LiveStream.this.mMediaEncodeStream.setVideoMixerDescription(r2.name(), r2.getMixerDescription());
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$41_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass41 anonymousClass41) {
            boolean LIZ;
            try {
                anonymousClass41.com_ss_ttlivestreamer_livestreamv2_LiveStream$41__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass41(InputVideoStream inputVideoStream) {
            r2 = inputVideoStream;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$42 */
    /* loaded from: classes12.dex */
    public class AnonymousClass42 implements IInputAudioStream {
        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public void release() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public int start() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public int stop() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public AudioTrack getAudioTrack() {
            return LiveStream.this.mAudioTrack;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public int getChannel() {
            return LiveStream.this.mLiveStreamBuilder.getAudioChannel();
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public AudioMixer.AudioMixerDescription getMixerDescription() {
            return LiveStream.this.mOriginAudioStreamDescription;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public int getSample() {
            return LiveStream.this.mLiveStreamBuilder.getAudioSampleHZ();
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public String name() {
            AudioTrack audioTrack = LiveStream.this.mAudioTrack;
            if (audioTrack != null) {
                return audioTrack.id();
            }
            return "";
        }

        public AnonymousClass42() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public void setMixerDescription(AudioMixer.AudioMixerDescription audioMixerDescription) {
            LiveStream liveStream = LiveStream.this;
            liveStream.mOriginAudioStreamDescription = audioMixerDescription;
            MediaEncodeStream mediaEncodeStream = liveStream.mMediaEncodeStream;
            if (mediaEncodeStream != null) {
                mediaEncodeStream.setAudioMixerDescription(name(), LiveStream.this.mOriginAudioStreamDescription);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputAudioStream
        public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
            return LiveStream.this.pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$43 */
    /* loaded from: classes12.dex */
    public class AnonymousClass43 implements IInputVideoStream {
        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public int getRealFps() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public void release() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public int start() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public int stop() {
            return 0;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public int fps() {
            return LiveStream.this.mLiveStreamBuilder.getVideoFps();
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public int getHeight() {
            return LiveStream.this.mLiveStreamBuilder.getVideoHeight();
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public VideoMixer.VideoMixerDescription getMixerDescription() {
            return LiveStream.this.mOriginVideoStreamDescription;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public int getWidth() {
            return LiveStream.this.mLiveStreamBuilder.getVideoWidth();
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public String name() {
            VideoTrack videoTrack = LiveStream.this.mVideoTrack;
            if (videoTrack != null) {
                return videoTrack.id();
            }
            return "";
        }

        public AnonymousClass43() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public void setMixerDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
            LiveStream.this.mOriginVideoStreamDescription.copy(videoMixerDescription);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("update origin mix description:");
            LIZ.append(videoMixerDescription.toString());
            AVLog.iow("LiveStream", X1D.LIZIZ(LIZ));
            MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
            if (mediaEncodeStream != null) {
                mediaEncodeStream.setVideoMixerDescription(name(), LiveStream.this.mOriginVideoStreamDescription);
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
            return LiveStream.this.pushVideoFrame(byteBuffer, i, i2, i3, j);
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public int pushVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, long j) {
            return LiveStream.this.pushVideoFrame(byteBufferArr, iArr, i, i2, i3, j);
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.IInputVideoStream
        public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
            return LiveStream.this.pushVideoFrame(i, z, i2, i3, i4, fArr, j);
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$44 */
    /* loaded from: classes12.dex */
    public class AnonymousClass44 implements Runnable {
        public final /* synthetic */ String val$file;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$44_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$44__run$___twin___() {
            LiveStream liveStream = LiveStream.this;
            MediaEncodeStream mediaEncodeStream = liveStream.mMediaEncodeStream;
            if (mediaEncodeStream != null) {
                mediaEncodeStream.startRecord(r2);
                return;
            }
            IRecorderManager externRecordMgr = liveStream.mRecorderManager.getExternRecordMgr();
            if (!(externRecordMgr instanceof SharedEncoderRecorder)) {
                return;
            }
            ((SharedEncoderRecorder) externRecordMgr).onEvent(11, 0, 0L, "EncodeStream is null, maybe publish no start.");
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$44_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass44 anonymousClass44) {
            boolean LIZ;
            try {
                anonymousClass44.com_ss_ttlivestreamer_livestreamv2_LiveStream$44__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass44(String str) {
            r2 = str;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$45 */
    /* loaded from: classes12.dex */
    public class AnonymousClass45 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$45_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$45__run$___twin___() {
            MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
            if (mediaEncodeStream != null) {
                mediaEncodeStream.stopRecord();
            }
        }

        public AnonymousClass45() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$45_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass45 anonymousClass45) {
            boolean LIZ;
            try {
                anonymousClass45.com_ss_ttlivestreamer_livestreamv2_LiveStream$45__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$46 */
    /* loaded from: classes12.dex */
    public class AnonymousClass46 implements Runnable {
        public final /* synthetic */ VsyncModule[] val$module;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$46_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$46__run$___twin___() {
            MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
            if (mediaEncodeStream != null) {
                r2[0] = mediaEncodeStream.getVsyncModule();
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$46_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass46 anonymousClass46) {
            boolean LIZ;
            try {
                anonymousClass46.com_ss_ttlivestreamer_livestreamv2_LiveStream$46__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass46(VsyncModule[] vsyncModuleArr) {
            r2 = vsyncModuleArr;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$47 */
    /* loaded from: classes12.dex */
    public class AnonymousClass47 implements Runnable {
        public final /* synthetic */ String val$command;
        public final /* synthetic */ JSONObject val$sdkParamsJsonObj;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$47_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$47__run$___twin___() {
            try {
                LiveStream.this.sendSdkControlMsgInternal(r2, r3);
            } catch (JSONException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sendSdkControlMsgInternal error:");
                LIZ.append(e);
                AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$47_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass47 anonymousClass47) {
            boolean LIZ;
            try {
                anonymousClass47.com_ss_ttlivestreamer_livestreamv2_LiveStream$47__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass47(String str, JSONObject jSONObject) {
            r2 = str;
            r3 = jSONObject;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$48 */
    /* loaded from: classes12.dex */
    public class AnonymousClass48 implements Runnable {
        public final /* synthetic */ int val$audioBitrate;
        public final /* synthetic */ TEBundle val$optBundle;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$48_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$48__run$___twin___() {
            MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
            if (mediaEncodeStream != null) {
                mediaEncodeStream.setAudioBitrate(r2);
            }
            Transport transport = LiveStream.this.mRTMPTransport;
            if (transport != null) {
                transport.setParameter(r3);
            }
            LiveStream.this.mLiveStreamBuilder.setAudioBitrate(r2);
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$48_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass48 anonymousClass48) {
            boolean LIZ;
            try {
                anonymousClass48.com_ss_ttlivestreamer_livestreamv2_LiveStream$48__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass48(int i, TEBundle tEBundle) {
            r2 = i;
            r3 = tEBundle;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$49 */
    /* loaded from: classes12.dex */
    public class AnonymousClass49 implements Runnable {
        public final /* synthetic */ int val$fps;
        public final /* synthetic */ int val$height;
        public final /* synthetic */ int val$width;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$49_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$49__run$___twin___() {
            boolean z;
            LiveStream liveStream = LiveStream.this;
            LiveStreamVideoCapture liveStreamVideoCapture = liveStream.mVideoCapturer;
            int i = r2;
            LiveStreamBuilder liveStreamBuilder = liveStream.mLiveStreamBuilder;
            if (liveStreamBuilder != null) {
                int resolutionAdaptedQuirks = liveStreamBuilder.getResolutionAdaptedQuirks();
                if (i < 1) {
                    i = liveStreamBuilder.getVideoFps();
                }
                if (liveStreamBuilder.isDropFramesDisabled()) {
                    i = -1;
                }
                TEBundle tEBundle = LiveStream.this.mVideoAdaptParams;
                if (tEBundle != null) {
                    tEBundle.setBool("video_adapter_enable_smooth", false);
                    LiveStream.this.mVideoAdaptParams.setBool("video_adapter_enable_drop_adapt", false);
                    LiveStream.this.mVideoAdaptParams.setBool("video_adapter_disable_drop_frame", false);
                    LiveStream.this.mVideoAdaptParams.setInt("video_adapter_ext_fps", 0);
                }
                boolean z2 = liveStreamBuilder.getPushBase().videoAdapterEnableDropAdapter;
                boolean z3 = liveStreamBuilder.getPushBase().videoAdapterDisableDropFrame;
                boolean z4 = liveStreamBuilder.getPushBase().videoAdapterEnableSmooth;
                int i2 = liveStreamBuilder.getPushBase().videoAdapterExtFps;
                if (i2 > 0 && liveStreamBuilder.getVideoFps() >= liveStreamBuilder.getVideoCaptureFps()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z3 || z2 || z4 || z) {
                    LiveStream liveStream2 = LiveStream.this;
                    if (liveStream2.mVideoAdaptParams == null) {
                        liveStream2.mVideoAdaptParams = new TEBundle();
                    }
                    LiveStream.this.mVideoAdaptParams.setBool("video_adapter_enable_smooth", z4);
                    LiveStream.this.mVideoAdaptParams.setBool("video_adapter_enable_drop_adapt", z2);
                    LiveStream.this.mVideoAdaptParams.setBool("video_adapter_disable_drop_frame", z3);
                    TEBundle tEBundle2 = LiveStream.this.mVideoAdaptParams;
                    if (!z) {
                        i2 = 0;
                    }
                    tEBundle2.setInt("video_adapter_ext_fps", i2);
                    if (z2) {
                        long j = liveStreamBuilder.getPushBase().videoAdapterMaxFluFps;
                        long j2 = liveStreamBuilder.getPushBase().videoAdapterDropCheckIntervalNs;
                        LiveStream.this.mVideoAdaptParams.setLong("video_adapter_drop_adapt_max_flu_fps", j);
                        LiveStream.this.mVideoAdaptParams.setLong("video_adapter_drop_adapt_check_interval", j2);
                    }
                }
                if (liveStreamBuilder.isEnableFovSmallWindowOpt()) {
                    LiveStream liveStream3 = LiveStream.this;
                    if (liveStream3.mVideoAdaptParams == null) {
                        liveStream3.mVideoAdaptParams = new TEBundle();
                    }
                }
                TEBundle tEBundle3 = LiveStream.this.mVideoAdaptParams;
                if (tEBundle3 != null) {
                    tEBundle3.setBool("video_fov_small_window_opt", liveStreamBuilder.isEnableFovSmallWindowOpt());
                    LiveStream.this.mVideoAdaptParams.setInt("video_fov_crop_aspect_width", liveStreamBuilder.getFovOptCropAspectWidth());
                    LiveStream.this.mVideoAdaptParams.setInt("video_fov_crop_aspect_height", liveStreamBuilder.getFovOptCropAspectHeight());
                    LiveStream.this.mVideoAdaptParams.setInt("video_fov_opt_max_piexel_size", liveStreamBuilder.getFovOptMaxPiexelSize());
                }
                LiveStream liveStream4 = LiveStream.this;
                TEBundle tEBundle4 = liveStream4.mVideoAdaptParams;
                liveStream4.gpuTurboWrapper.initAdaptSize(r3, r4);
                LiveStream liveStream5 = LiveStream.this;
                liveStream5.gpuTurboWrapper.initCaptureSize(liveStream5.mLiveStreamBuilder.getVideoCaptureWidth(), LiveStream.this.mLiveStreamBuilder.getVideoCaptureHeight());
                LiveStream.this.adaptResolutionUtils.initAdaptFormatParams(resolutionAdaptedQuirks, liveStreamVideoCapture, i, tEBundle4);
                LiveStream liveStream6 = LiveStream.this;
                liveStream6.gpuTurboWrapper.refreshEffectSRStatus(liveStream6.mFilterManager, liveStream6.adaptResolutionUtils, true);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$49_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass49 anonymousClass49) {
            boolean LIZ;
            try {
                anonymousClass49.com_ss_ttlivestreamer_livestreamv2_LiveStream$49__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass49(int i, int i2, int i3) {
            r2 = i;
            r3 = i2;
            r4 = i3;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$5 */
    /* loaded from: classes12.dex */
    public class AnonymousClass5 implements Runnable {
        public final /* synthetic */ int val$event1;
        public final /* synthetic */ int val$event2;
        public final /* synthetic */ long val$event3;
        public final /* synthetic */ String val$msg;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0231  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$5__run$___twin___() {
            /*
                Method dump skipped, instructions count: 610
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.LiveStream.AnonymousClass5.com_ss_ttlivestreamer_livestreamv2_LiveStream$5__run$___twin___():void");
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
            boolean LIZ;
            try {
                anonymousClass5.com_ss_ttlivestreamer_livestreamv2_LiveStream$5__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass5(String str, int i, int i2, long j) {
            r2 = str;
            r3 = i;
            r4 = i2;
            r5 = j;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$50 */
    /* loaded from: classes12.dex */
    public class AnonymousClass50 implements Runnable {
        public final /* synthetic */ boolean val$forceSwitchNode;
        public final /* synthetic */ String val$sdkParams;
        public final /* synthetic */ String val$url;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$50_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$50__run$___twin___() {
            LiveStream.this.restartPublish(r2, r3, r4);
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$50_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass50 anonymousClass50) {
            boolean LIZ;
            try {
                anonymousClass50.com_ss_ttlivestreamer_livestreamv2_LiveStream$50__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass50(String str, boolean z, String str2) {
            r2 = str;
            r3 = z;
            r4 = str2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$51 */
    /* loaded from: classes12.dex */
    public class AnonymousClass51 implements Runnable {
        public final /* synthetic */ IKaraokeMovie val$movie;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$51_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$51__run$___twin___() {
            IKaraokeMovie iKaraokeMovie;
            VideoTrack videoTrack;
            if (LiveStream.this.mMediaEncodeStream != null && (iKaraokeMovie = r2) != null && (videoTrack = iKaraokeMovie.getVideoTrack()) != null) {
                LiveStream.this.mMediaEncodeStream.removeTrack(videoTrack);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$51_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass51 anonymousClass51) {
            boolean LIZ;
            try {
                anonymousClass51.com_ss_ttlivestreamer_livestreamv2_LiveStream$51__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass51(IKaraokeMovie iKaraokeMovie) {
            r2 = iKaraokeMovie;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$52 */
    /* loaded from: classes12.dex */
    public class AnonymousClass52 implements Runnable {
        public final /* synthetic */ boolean val$KTVMode;
        public final /* synthetic */ IKaraokeMovie val$movie;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$52_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$52__run$___twin___() {
            VideoTrack videoTrack;
            VideoTrack videoTrack2;
            VideoTrack videoTrack3;
            LiveStream liveStream = LiveStream.this;
            IKaraokeMovie iKaraokeMovie = r2;
            liveStream.mKaraokeMovie = iKaraokeMovie;
            boolean z = r3;
            liveStream.mIsKaraokeMovie = z;
            if (z) {
                if (iKaraokeMovie == null) {
                    AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
                    if (!AnonymousClass028.LJI(androidRuntimeException, "LiveStream.changeToKTVMode")) {
                        return;
                    } else {
                        throw androidRuntimeException;
                    }
                }
                VideoTrack videoTrack4 = liveStream.mVideoTrack;
                if (videoTrack4 != null && !videoTrack4.containVideoSink(iKaraokeMovie.getCameraVideoSink())) {
                    LiveStream.this.mVideoTrack.addVideoSink(r2.getCameraVideoSink());
                }
                LiveStream liveStream2 = LiveStream.this;
                MediaEncodeStream mediaEncodeStream = liveStream2.mMediaEncodeStream;
                if (mediaEncodeStream != null && (videoTrack3 = liveStream2.mVideoTrack) != null) {
                    mediaEncodeStream.removeTrack(videoTrack3);
                    if (!LiveStream.this.mMediaEncodeStream.containTrack(r2.getVideoTrack())) {
                        LiveStream.this.mMediaEncodeStream.addTrack(r2.getVideoTrack());
                        LiveStream.this.mMediaEncodeStream.setOriginVideoTrack(r2.getVideoTrack().id());
                    }
                }
                LiveStream liveStream3 = LiveStream.this;
                TextureFrameAvailableSink textureFrameAvailableSink = liveStream3.mTextureFrameAvailableSink;
                if (textureFrameAvailableSink != null && (videoTrack2 = liveStream3.mVideoTrack) != null) {
                    videoTrack2.removeVideoSink(textureFrameAvailableSink);
                    if (!r2.getVideoTrack().containVideoSink(LiveStream.this.mTextureFrameAvailableSink)) {
                        r2.getVideoTrack().addVideoSink(LiveStream.this.mTextureFrameAvailableSink);
                        return;
                    }
                    return;
                }
                return;
            }
            VideoTrack videoTrack5 = liveStream.mVideoTrack;
            if (videoTrack5 != null && iKaraokeMovie != null) {
                videoTrack5.removeVideoSink(iKaraokeMovie.getCameraVideoSink());
            }
            LiveStream liveStream4 = LiveStream.this;
            MediaEncodeStream mediaEncodeStream2 = liveStream4.mMediaEncodeStream;
            if (mediaEncodeStream2 != null && liveStream4.mVideoTrack != null) {
                IKaraokeMovie iKaraokeMovie2 = r2;
                if (iKaraokeMovie2 != null) {
                    mediaEncodeStream2.removeTrack(iKaraokeMovie2.getVideoTrack());
                }
                LiveStream liveStream5 = LiveStream.this;
                if (!liveStream5.mMediaEncodeStream.containTrack(liveStream5.mVideoTrack)) {
                    LiveStream liveStream6 = LiveStream.this;
                    liveStream6.mMediaEncodeStream.addTrack(liveStream6.mVideoTrack);
                    LiveStream liveStream7 = LiveStream.this;
                    liveStream7.mMediaEncodeStream.setOriginVideoTrack(liveStream7.mVideoTrack.id());
                }
            }
            LiveStream liveStream8 = LiveStream.this;
            if (liveStream8.mTextureFrameAvailableSink != null && liveStream8.mVideoTrack != null) {
                IKaraokeMovie iKaraokeMovie3 = r2;
                if (iKaraokeMovie3 != null && (videoTrack = iKaraokeMovie3.getVideoTrack()) != null) {
                    videoTrack.removeVideoSink(LiveStream.this.mTextureFrameAvailableSink);
                }
                LiveStream liveStream9 = LiveStream.this;
                if (!liveStream9.mVideoTrack.containVideoSink(liveStream9.mTextureFrameAvailableSink)) {
                    LiveStream liveStream10 = LiveStream.this;
                    liveStream10.mVideoTrack.addVideoSink(liveStream10.mTextureFrameAvailableSink);
                }
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$52_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass52 anonymousClass52) {
            boolean LIZ;
            try {
                anonymousClass52.com_ss_ttlivestreamer_livestreamv2_LiveStream$52__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass52(IKaraokeMovie iKaraokeMovie, boolean z) {
            r2 = iKaraokeMovie;
            r3 = z;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$54 */
    /* loaded from: classes12.dex */
    public class AnonymousClass54 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$54_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$54__run$___twin___() {
            try {
                synchronized (LiveStream.this.mRTMPTransportFence) {
                    Transport transport = LiveStream.this.mRTMPTransport;
                    if (transport != null) {
                        transport.abortRequest();
                    }
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("abort request failed, error: ");
                LIZ.append(e);
                AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
            }
        }

        public AnonymousClass54() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$54_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass54 anonymousClass54) {
            boolean LIZ;
            try {
                anonymousClass54.com_ss_ttlivestreamer_livestreamv2_LiveStream$54__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$6 */
    /* loaded from: classes12.dex */
    public class AnonymousClass6 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$6__run$___twin___() {
            LiveStream liveStream = LiveStream.this;
            liveStream.mEnalbeReconnect = true;
            liveStream.doStart();
            LiveStream.this.mStreamLogService.reset();
            LiveStream.this.mStreamLogService.startPeriodReport();
            LiveStream liveStream2 = LiveStream.this;
            liveStream2.mStreamLogService.setReportStallLog(liveStream2.mEanbleReportStallLog);
        }

        public AnonymousClass6() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
            boolean LIZ;
            try {
                anonymousClass6.com_ss_ttlivestreamer_livestreamv2_LiveStream$6__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$7 */
    /* loaded from: classes12.dex */
    public class AnonymousClass7 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$7__run$___twin___() {
            LiveStream liveStream = LiveStream.this;
            liveStream.mEnalbeReconnect = true;
            LiveStreamLogService liveStreamLogService = liveStream.mStreamLogService;
            if (liveStreamLogService != null) {
                liveStreamLogService.reset();
                liveStreamLogService.startPeriodReport();
                liveStreamLogService.setReportStallLog(LiveStream.this.mEanbleReportStallLog);
            }
            List<String> list = LiveStream.this.mUris;
            if (list != null && list.size() > 1) {
                LiveStream liveStream2 = LiveStream.this;
                if (liveStream2.isRtsUrl((String) ListProtector.get(liveStream2.mUris, 0)) && !LibRTMPTransport.TryLoadRtsLibrary()) {
                    ListProtector.remove(LiveStream.this.mUris, 0);
                }
            }
            LiveStream.this.doStart();
        }

        public AnonymousClass7() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
            boolean LIZ;
            try {
                anonymousClass7.com_ss_ttlivestreamer_livestreamv2_LiveStream$7__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$8 */
    /* loaded from: classes12.dex */
    public class AnonymousClass8 implements Runnable {
        public final /* synthetic */ boolean val$pushStreamAfterServerMix;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$8__run$___twin___() {
            LiveStream.this.mPushStreamAfterServerMix = r2;
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
            boolean LIZ;
            try {
                anonymousClass8.com_ss_ttlivestreamer_livestreamv2_LiveStream$8__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass8(boolean z) {
            r2 = z;
        }
    }

    /* loaded from: classes12.dex */
    public static class RoiSwitch {
        public WeakReference<LiveStream> liveStreamWeakReference;

        public void checkRoiSwitch() {
            IFilterManager videoFilterMgr;
            LiveStream liveStream = this.liveStreamWeakReference.get();
            if (liveStream != null && (videoFilterMgr = liveStream.getVideoFilterMgr()) != null && (videoFilterMgr instanceof FilterManager)) {
                ((FilterManager) videoFilterMgr).enableRoi(shouldOpenRoi());
            }
        }

        public boolean shouldOpenRoi() {
            LiveStreamBuilder liveStreamBuilder;
            LiveStream liveStream = this.liveStreamWeakReference.get();
            if (liveStream != null) {
                liveStreamBuilder = liveStream.getLiveStreamBuilder();
            } else {
                liveStreamBuilder = null;
            }
            if (liveStreamBuilder == null || liveStreamBuilder.getRoiOn() != 1) {
                return false;
            }
            return true;
        }

        public RoiSwitch(LiveStream liveStream) {
            this.liveStreamWeakReference = new WeakReference<>(liveStream);
        }
    }

    private void checkProtocolDownGrade() {
        int i;
        this.mProtocolDownGradeFlag = false;
        if (this.mEnableProtocolDownGrade && (i = this.mErrorCodeQuicDownGrade) != 0) {
            if (i != -31007 && i != -31002) {
                if (i != -10007) {
                    if (i < -30000) {
                        setProtocolDownGradeFlag();
                    }
                } else {
                    this.mProtocolDownGradeFlag = true;
                }
            } else {
                setProtocolDownGradeFlag();
            }
        }
        if (this.mProtocolDownGradeFlag) {
            this.mStreamLogService.onProtocolDownGrade(this.mRtmpReConnectCounts, this.mErrorCodeQuicDownGrade);
        }
    }

    private void createAudioTrack() {
        int audioCaptureDevice = this.mLiveStreamBuilder.getAudioCaptureDevice();
        if (audioCaptureDevice == 1) {
            this.mAudioCapture = new LiveStreamAudioCapture(this.mAudioRecordMode, audioCaptureDevice, this.mLiveStreamBuilder.getScreenAudioCaptureDelayMicPackage(), this.mLiveStreamBuilder.getAudioCaptureSampleHZ(), this.mLiveStreamBuilder.getAudioCaptureChannel(), this.mLiveStreamBuilder.getAudioCaptureBitwidth(), null, this, this.mMediaEngineFactory, this.mLiveStreamBuilder.getBgMode(), this.mInfoListener);
        } else if (audioCaptureDevice == 4) {
            this.mAudioCapture = new AudioCapturerExternal(this.mLiveStreamBuilder.getAudioCaptureSampleHZ(), this.mLiveStreamBuilder.getAudioCaptureChannel(), this.mLiveStreamBuilder.getAudioCaptureBitwidth(), null, this);
        } else {
            this.mAudioCapture = new LiveStreamAudioCaptureFromADM(this.mAudioRecordMode, audioCaptureDevice, this.mLiveStreamBuilder.getScreenAudioCaptureDelayMicPackage(), this.mLiveStreamBuilder.getAudioCaptureSampleHZ(), this.mLiveStreamBuilder.getAudioCaptureChannel(), this.mLiveStreamBuilder.getAudioCaptureBitwidth(), null, this, this.mMediaEngineFactory, this.mLiveStreamBuilder.getBgMode(), this.mAudioDeviceModule);
        }
        if (this.mAudioDeviceModule != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AudioRecordingCallback audioRecordingCallback = new AudioRecordingCallback(this.mStreamLogService);
                this.mAudioRecordingCallback = audioRecordingCallback;
                this.mAudioDeviceModule.registerAudioRecordingCallback(audioRecordingCallback, this.mWorkThreadHandler);
            }
            this.mAudioCapture.setAudioDeviceModule(this.mAudioDeviceModule);
        }
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null) {
            this.mAudioTrack = this.mMediaEngineFactory.createAudioTrack(audioCapturer);
            if (this.mAudioDeviceModule != null) {
                if (this.mLiveStreamBuilder.getAudioCaptureDevice() == 5) {
                    this.mAudioDeviceModule.setExternalRecording(false);
                } else {
                    this.mAudioDeviceModule.setExternalRecording(true, this.mAudioCapture);
                }
            }
            this.mAudioCapture.setCalculatePcmPowerEventObserver(this);
            this.mAudioCapture.setAudioQuantizeGapPeriod(this.mLiveStreamBuilder.getAudioQuantizeGapPeriod());
        }
        AudioCapturer audioCapturer2 = this.mAudioCapture;
        if (audioCapturer2 != null) {
            audioCapturer2.setOutputFormat(this.mLiveStreamBuilder.getAudioSampleHZ(), this.mLiveStreamBuilder.getAudioChannel(), this.mLiveStreamBuilder.getAudioBitwidth());
            AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
            if (audioDeviceModule != null) {
                TEBundle parameter = audioDeviceModule.getParameter();
                parameter.setInt("audio_sample", this.mLiveStreamBuilder.getAudioCaptureSampleHZ());
                parameter.setInt("audio_channels", this.mLiveStreamBuilder.getAudioCaptureChannel());
                parameter.setInt("audio_bit_width", this.mLiveStreamBuilder.getAudioBitwidth());
                this.mAudioDeviceModule.setParameter(parameter);
            }
        }
    }

    private void destroyVideoTrack() {
        VideoTrack videoTrack;
        changeToKTVMode(false, this.mKaraokeMovie);
        this.mReportFence.writeLock().lock();
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && (videoTrack = this.mVideoTrack) != null) {
            mediaEncodeStream.removeTrack(videoTrack);
            removeStreamsFromEncodeStream(true);
        }
        VideoTrack videoTrack2 = this.mVideoTrack;
        if (videoTrack2 != null) {
            VideoSink videoSink = this.mRenderView;
            if (videoSink != null) {
                videoTrack2.removeVideoSink(videoSink);
            }
            TextureFrameAvailableSink textureFrameAvailableSink = this.mTextureFrameAvailableSink;
            if (textureFrameAvailableSink != null) {
                this.mVideoTrack.removeVideoSink(textureFrameAvailableSink);
            }
            RecorderManager recorderManager = this.mRecorderManager;
            if (recorderManager != null) {
                this.mVideoTrack.removeVideoSink(recorderManager.getSharedSink());
            }
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.stop();
            this.mVideoCapturer.release();
            this.mVideoCapturer = null;
        }
        VideoTrack videoTrack3 = this.mVideoTrack;
        if (videoTrack3 != null) {
            videoTrack3.setVideoProcessor(null);
            this.mVideoTrack.release();
            this.mVideoTrack = null;
        }
        FpsLevelStrategy fpsLevelStrategy = this.mFpsLevelStrategy;
        if (fpsLevelStrategy != null) {
            PerfAwareFpsStrategy perfAwareFpsStrategy = this.mPerfAwareFpsStrategy;
            if (perfAwareFpsStrategy != null) {
                perfAwareFpsStrategy.removePerfObserver(fpsLevelStrategy);
            }
            this.mFpsLevelStrategy = null;
        }
        VideoAlgorithmStrategy videoAlgorithmStrategy = this.mVideoAlgorithmStrategy;
        if (videoAlgorithmStrategy != null) {
            PerfAwareFpsStrategy perfAwareFpsStrategy2 = this.mPerfAwareFpsStrategy;
            if (perfAwareFpsStrategy2 != null) {
                perfAwareFpsStrategy2.removePerfObserver(videoAlgorithmStrategy);
            }
            this.mVideoAlgorithmStrategy = null;
        }
        PerfAwareFpsStrategy perfAwareFpsStrategy3 = this.mPerfAwareFpsStrategy;
        if (perfAwareFpsStrategy3 != null) {
            perfAwareFpsStrategy3.release();
            this.mPerfAwareFpsStrategy = null;
        }
        this.mReportFence.writeLock().unlock();
    }

    public /* synthetic */ void lambda$release$13() {
        this.mPaused = false;
        this.mMuted = false;
        VideoEncoderFactory videoEncoderFactory = this.mVideoEncoderFactory;
        if (videoEncoderFactory != null) {
            videoEncoderFactory.release();
            this.mVideoEncoderFactory = null;
        }
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            audioDeviceModule.setAudioProcessor(null);
        }
        PushStreamStallRecorder pushStreamStallRecorder = this.mPushStreamStallRecorder;
        if (pushStreamStallRecorder != null) {
            pushStreamStallRecorder.release();
            this.mPushStreamStallRecorder = null;
        }
        TEBundle tEBundle = this.pushStallConfigBundle;
        if (tEBundle != null) {
            tEBundle.release();
            this.pushStallConfigBundle = null;
        }
    }

    public static /* synthetic */ void lambda$semisugar$doBackgroundPause$0(LiveStream liveStream) {
        liveStream.doBackgroundPause();
    }

    public static /* synthetic */ void lambda$semisugar$requestKeyFrame$0(LiveStream liveStream) {
        liveStream.requestKeyFrame();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public final /* synthetic */ int configEffectDowngradingStrategy(JSONObject jSONObject) {
        return C63806P2k.LIZ(this, jSONObject);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputAudioStream createInputAudioStream() {
        return createInputAudioStream(null);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputVideoStream createInputVideoStream() {
        return createInputVideoStream(null);
    }

    public VsyncModule getEncodeStreamVsyncModule() {
        VsyncModule[] vsyncModuleArr = new VsyncModule[1];
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.46
            public final /* synthetic */ VsyncModule[] val$module;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$46_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$46__run$___twin___() {
                MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
                if (mediaEncodeStream != null) {
                    r2[0] = mediaEncodeStream.getVsyncModule();
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$46_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass46 anonymousClass46) {
                boolean LIZ;
                try {
                    anonymousClass46.com_ss_ttlivestreamer_livestreamv2_LiveStream$46__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass46(VsyncModule[] vsyncModuleArr2) {
                r2 = vsyncModuleArr2;
            }
        });
        return vsyncModuleArr2[0];
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public LiveStreamOption getOption() {
        LiveStreamOption[] liveStreamOptionArr = new LiveStreamOption[1];
        if (this.mStatus.get() != 7) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.21
                public final /* synthetic */ LiveStreamOption[] val$opt;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$21__run$___twin___() {
                    MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
                    if (mediaEncodeStream != null) {
                        r2[0] = new LiveStreamOption(mediaEncodeStream.getParameter());
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$21_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass21 anonymousClass21) {
                    boolean LIZ;
                    try {
                        anonymousClass21.com_ss_ttlivestreamer_livestreamv2_LiveStream$21__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass21(LiveStreamOption[] liveStreamOptionArr2) {
                    r2 = liveStreamOptionArr2;
                }
            });
        }
        return liveStreamOptionArr2[0];
    }

    public int getResolutionLevel(int i, int i2) {
        long j = i * i2;
        if (j < 307200) {
            return 1;
        }
        if (j < 451200) {
            return 2;
        }
        return j < 720000 ? 3 : 4;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public String getVersion() {
        return "15.0.1_1";
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int getVideoCaptureDevice() {
        return 0;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public synchronized void release() {
        Looper looper;
        Thread thread;
        Looper looper2;
        Thread thread2;
        DebugLogUtils.isEnableDebugLog();
        stopVideoCapture();
        stopAudioCapture();
        stopRecord();
        stop();
        IVeLivePusher iVeLivePusher = this.mVeLivePusher;
        if (iVeLivePusher != null) {
            iVeLivePusher.onDestroy();
        }
        if (this.mAudioRecordingCallback != null) {
            this.mAudioRecordingCallback = null;
        }
        if (this.mLiveStreamBuilder.isEnableKTV()) {
            IKaraokeMovie iKaraokeMovie = this.mKaraokeMovie;
            if (iKaraokeMovie != null) {
                iKaraokeMovie.stop();
                this.mKaraokeMovie = null;
            }
            this.mIsKaraokeMovie = false;
        }
        AudioCatcher.Stop(this.mWorkThreadHandler);
        SITICalculator sITICalculator = this.mSITICalculator;
        if (sITICalculator != null) {
            sITICalculator.release();
        }
        RTMPReconnectHelper rTMPReconnectHelper = this.mRtmpReconnectHelper;
        if (rTMPReconnectHelper != null) {
            rTMPReconnectHelper.release();
        }
        this.mWorkThreadHandler.post(new ARunnableS10S0101000_6(5, this, 8));
        boolean[] zArr = {true};
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.16
                public final /* synthetic */ boolean[] val$timeout;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$16__run$___twin___() {
                    LiveStream.this.onReleaseSafe();
                    synchronized (LiveStream.this.mReleaseFence) {
                        r2[0] = false;
                        LiveStream.this.mReleaseFence.notifyAll();
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$16_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass16 anonymousClass16) {
                    boolean LIZ;
                    try {
                        anonymousClass16.com_ss_ttlivestreamer_livestreamv2_LiveStream$16__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass16(boolean[] zArr2) {
                    r2 = zArr2;
                }
            });
            synchronized (this.mReleaseFence) {
                try {
                    this.mReleaseFence.wait(3000L);
                    if (zArr2[0]) {
                        AVLog.iow("LiveStream", "Waiting work thread timeout with dump thread stack:");
                        Handler handler = this.mWorkThreadHandler;
                        if (handler != null && (looper2 = handler.getLooper()) != null && (thread2 = looper2.getThread()) != null) {
                            dumpJavaThreadStackIfNeed(thread2, "LiveStream");
                        }
                        Handler handler2 = this.mVideoCaptureHandler;
                        if (handler2 != null && (looper = handler2.getLooper()) != null && (thread = looper.getThread()) != null) {
                            dumpJavaThreadStackIfNeed(thread, "LiveStream");
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        this.mStatus.set(7);
        if (zArr2[0]) {
            AudioCapturer audioCapturer = this.mAudioCapture;
            if (audioCapturer != null) {
                if ((audioCapturer instanceof LiveStreamAudioCaptureFromADM) && getLiveStreamBuilder().getSdkSetting().enableReleaseMicphoneAnyway) {
                    AVLog.iow("LiveStream", "dangerous, try to stop audio record not on worker thread");
                    ((LiveStreamAudioCaptureFromADM) this.mAudioCapture).stopOnCurrentThread();
                } else {
                    this.mAudioCapture.stop();
                }
            }
            LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
            if (liveStreamVideoCapture != null) {
                liveStreamVideoCapture.stop();
            }
            AVLog.iow("LiveStream", "Release on work thread timeout.");
        }
        LiveStreamLogService liveStreamLogService = this.mStreamLogService;
        if (liveStreamLogService != null) {
            liveStreamLogService.stopPeriodReport();
        }
        SafeHandlerThread safeHandlerThread = this.workThread;
        if (safeHandlerThread != null) {
            this.workThread = null;
            SafeHandlerThreadPoolExecutor.unlockThread(safeHandlerThread);
        }
        SafeHandlerThreadPoolExecutor.unlockThread(this.dataNotifyThread);
        this.dataNotifyThread = null;
        SafeHandlerThreadPoolExecutor.unlockThread(this.miscThread);
        this.miscThread = null;
        this.mInfoListener = null;
        this.mErrorListener = null;
        this.mLiveStreamBuilder.releaseHandles();
        this.mUserMetadata.clear();
        TTLSConstantsLifecycleCallback.onRelease(this);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void releaseBackgroundImage() {
    }

    public void sendConnectResultWhenConnected() {
        if (this.mStreamLogService != null) {
            if (this.mFirstConnectAction) {
                this.mFirstConnectAction = false;
                sendSourceToLiveStreamEventTracker(1, 0, 0, 0L, null);
            }
            if (this.mHasFirstConnected == 0) {
                this.mHasFirstConnected = 1;
                sendResultToLiveStreamEventTracker(1, getCurrentRetryCount(), getStreamRetryCount());
                this.mStreamLogService.onRTMPConnectResult(0);
            } else {
                sendResultToLiveStreamEventTracker(1, getCurrentRetryCount(), getStreamRetryCount());
                this.mStreamLogService.onRTMPConnectResult(this.mHasFirstConnected);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setBackgroundImageBitmap(Bitmap bitmap) {
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public final /* synthetic */ int tryToExecuteEffectDowningStrategy(int i, int i2) {
        return C63806P2k.LIZIZ(this, i, i2);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public final /* synthetic */ int turnOffEffectDowngradingStrategy() {
        return C63806P2k.LIZJ(this);
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$14 */
    /* loaded from: classes12.dex */
    public class AnonymousClass14 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$14__run$___twin___() {
            TokenCertConfigUtils.getInstance().saveAudioScene(TokenCertConfigUtils.SceneType.ERROR);
            LiveStream.this.doStopAudioSource();
            TokenCertConfigUtils.getInstance().saveAudioScene(TokenCertConfigUtils.SceneType.NONE);
            LiveStream.this.doStartAudioSource();
        }

        public AnonymousClass14() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
            boolean LIZ;
            try {
                anonymousClass14.com_ss_ttlivestreamer_livestreamv2_LiveStream$14__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$23 */
    /* loaded from: classes12.dex */
    public class AnonymousClass23 implements Runnable {
        public final /* synthetic */ boolean val$isHorizontal;
        public final /* synthetic */ boolean val$mirror;
        public final /* synthetic */ Throwable val$stack;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$23__run$___twin___() {
            Object obj;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Call enableMirror(");
            LIZ.append(r2);
            LIZ.append(", ");
            LIZ.append(r3);
            LIZ.append("), last mirror status: ");
            LiveStreamVideoCapture liveStreamVideoCapture = LiveStream.this.mVideoCapturer;
            if (liveStreamVideoCapture != null) {
                obj = Boolean.valueOf(liveStreamVideoCapture.isMirror(r3));
            } else {
                obj = "null";
            }
            LIZ.append(obj);
            LIZ.append(". ");
            AVLog.logKibana(4, "LiveStream", X1D.LIZIZ(LIZ), r4);
            LiveStreamVideoCapture liveStreamVideoCapture2 = LiveStream.this.mVideoCapturer;
            if (liveStreamVideoCapture2 != null) {
                liveStreamVideoCapture2.enableMirror(r2, r3);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass23 anonymousClass23) {
            boolean LIZ;
            try {
                anonymousClass23.com_ss_ttlivestreamer_livestreamv2_LiveStream$23__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass23(boolean z, boolean z2, Throwable th) {
            r2 = z;
            r3 = z2;
            r4 = th;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$27 */
    /* loaded from: classes12.dex */
    public class AnonymousClass27 implements Runnable {
        public final /* synthetic */ int val$code;
        public final /* synthetic */ Exception val$e;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$27_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$27__run$___twin___() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onVideoCaptureError: code ");
            LIZ.append(r2);
            LIZ.append(", message ");
            LIZ.append(r3.toString());
            AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
            LiveStream liveStream = LiveStream.this;
            LiveStreamBuilder liveStreamBuilder = liveStream.mLiveStreamBuilder;
            LiveStreamVideoCapture liveStreamVideoCapture = liveStream.mVideoCapturer;
            int i = liveStream.mStatus.get();
            LiveStream.this.mStatus.set(8);
            if (liveStreamVideoCapture != null) {
                if (LiveStream.this.isExists(Constants.VIDEO_CAPTURE_ERROR_ALLOW_RETRY, r2) && liveStreamVideoCapture.getCurrentCaptureDevice() == 3) {
                    LiveStream.this.mStatus.set(i);
                }
            } else if (liveStreamBuilder != null && LiveStream.this.isExists(Constants.VIDEO_CAPTURE_ERROR_ALLOW_RETRY, r2) && liveStreamBuilder.getVideoCaptureDevice() == 3) {
                LiveStream.this.mStatus.set(i);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onVideoCaptureError: code ");
            LIZ2.append(r2);
            LIZ2.append(" mStatus:");
            LIZ2.append(LiveStream.this.mStatus.get());
            AVLog.logKibana(6, "LiveStream", X1D.LIZIZ(LIZ2), r3);
            LiveStream.this.reportLiveCoreError(2, r2, r3);
            LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
            if (liveStreamLogService != null) {
                liveStreamLogService.setDeviceOpenErrorCode(false, r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$27_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass27 anonymousClass27) {
            boolean LIZ;
            try {
                anonymousClass27.com_ss_ttlivestreamer_livestreamv2_LiveStream$27__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass27(int i, Exception exc) {
            r2 = i;
            r3 = exc;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$34 */
    /* loaded from: classes12.dex */
    public class AnonymousClass34 implements Runnable {
        public final /* synthetic */ int val$code;
        public final /* synthetic */ Exception val$e;

        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$34_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$34__run$___twin___() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onAudioCaptureError: code ");
            LIZ.append(r2);
            LIZ.append(", message ");
            LIZ.append(r3.toString());
            AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
            LiveStream.this.mStatus.set(8);
            LiveStream.this.reportLiveCoreError(3, r2, r3);
            LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
            if (liveStreamLogService != null) {
                liveStreamLogService.setDeviceOpenErrorCode(true, r2);
            }
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$34_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass34 anonymousClass34) {
            boolean LIZ;
            try {
                anonymousClass34.com_ss_ttlivestreamer_livestreamv2_LiveStream$34__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }

        public AnonymousClass34(int i, Exception exc) {
            r2 = i;
            r3 = exc;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$53 */
    /* loaded from: classes12.dex */
    public class AnonymousClass53 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            com_ss_ttlivestreamer_livestreamv2_LiveStream$53_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
        }

        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$53__run$___twin___() {
            try {
                InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                if (byName != null) {
                    LiveStream.this.mServerIP = byName.getHostAddress();
                    LiveStream.mServerIPTime = SystemClock.elapsedRealtime();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("update dns server ip:");
                    LIZ.append(LiveStream.this.mServerIP);
                    AVLog.iod("LiveStream", X1D.LIZIZ(LIZ));
                }
            } catch (UnknownHostException unused) {
            }
        }

        public AnonymousClass53() {
        }

        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$53_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass53 anonymousClass53) {
            boolean LIZ;
            try {
                anonymousClass53.com_ss_ttlivestreamer_livestreamv2_LiveStream$53__run$___twin___();
            } finally {
                if (LIZ) {
                }
            }
        }
    }

    private void abortRequest() {
        Handler handler = this.mMiscThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.54
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$54_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$54__run$___twin___() {
                    try {
                        synchronized (LiveStream.this.mRTMPTransportFence) {
                            Transport transport = LiveStream.this.mRTMPTransport;
                            if (transport != null) {
                                transport.abortRequest();
                            }
                        }
                    } catch (Exception e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("abort request failed, error: ");
                        LIZ.append(e);
                        AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
                    }
                }

                public AnonymousClass54() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$54_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass54 anonymousClass54) {
                    boolean LIZ;
                    try {
                        anonymousClass54.com_ss_ttlivestreamer_livestreamv2_LiveStream$54__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    private void cancelSITIBitrateFrameRate() {
        this.mBpsFpsUpdater.calculateBitrateRange(0, 0, 0, "siti");
        if (!this.mLiveStreamBuilder.getPushBase().sitiConfig.getDropEncodeFps()) {
            this.mBpsFpsUpdater.calculateFrameRate(0, "siti");
        } else {
            lambda$adaptVideoFpsForEncode$3(0, "siti");
        }
    }

    private String chooseAudioEncode() {
        boolean z;
        if (this.mAvailableAudioEncoders == null) {
            String GetSupportedFormats = this.mAudioEncoderFactory.GetSupportedFormats();
            if (GetSupportedFormats != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Supports audio encoder list: ");
                LIZ.append(GetSupportedFormats);
                AVLog.d("LiveStream", X1D.LIZIZ(LIZ));
                this.mAvailableAudioEncoders = GetSupportedFormats.split(":");
            } else {
                throw new AndroidRuntimeException("Not found any valid audio encoder");
            }
        }
        String[] strArr = this.mAvailableAudioEncoders;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (!TextUtils.isEmpty(strArr[i])) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return null;
        }
        while (true) {
            if (this.mLiveStreamBuilder.getAudioEncoder() == 3) {
                for (String str : this.mAvailableAudioEncoders) {
                    if (str.contains("audio_type=audio/aac")) {
                        return "audio/aac";
                    }
                }
                AVLog.iow("LiveStream", "ffmpeg audio encoder not found, try fdk-aac.");
                this.mLiveStreamBuilder.setAudioEncoder(1);
            } else if (this.mLiveStreamBuilder.getAudioEncoder() == 2) {
                for (String str2 : this.mAvailableAudioEncoders) {
                    if (str2.contains("audio_type=audio/mp4a-latm")) {
                        return "audio/mp4a-latm";
                    }
                }
                AVLog.iow("LiveStream", "MediaCodec aac encoder not found, try fdk-aac.");
                this.mLiveStreamBuilder.setAudioEncoder(1);
            } else if (this.mLiveStreamBuilder.getAudioEncoder() == 1) {
                for (String str3 : this.mAvailableAudioEncoders) {
                    if (str3.contains("audio_type=audio/faac")) {
                        return "audio/faac";
                    }
                }
                AVLog.iow("LiveStream", "fdk-aac audio encoder not found, break.");
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("HAVE_FDKAAC while fdk-aac encoder not found? rediculous!");
                if (!AnonymousClass028.LJI(androidRuntimeException, "LiveStream.chooseAudioEncode@2")) {
                    return null;
                }
                throw androidRuntimeException;
            }
        }
    }

    private int chooseAudioProfileLevel() {
        int audioProfile = this.mLiveStreamBuilder.getAudioProfile();
        if (audioProfile == 1) {
            return 1;
        }
        if (audioProfile == 2 || audioProfile != 3) {
            return 3;
        }
        return 4;
    }

    private int chooseProfileLevel() {
        int videoProfile = this.mLiveStreamBuilder.getVideoProfile();
        if (this.mLiveStreamBuilder.getVideoEncoder() == 1) {
            if (videoProfile != 1) {
                if (videoProfile == 2) {
                    return 2;
                }
                if (videoProfile == 3) {
                    return 3;
                }
                this.mLiveStreamBuilder.setVideoProfile(1);
            }
            return 1;
        }
        if (this.mLiveStreamBuilder.getVideoEncoder() == 2) {
            if (videoProfile == 4) {
                return 4;
            }
            this.mLiveStreamBuilder.setVideoProfile(4);
            return 4;
        }
        return -1;
    }

    private String chooseVideoEncode() {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        if (this.mAvailableVideoEncoders == null) {
            String GetSupportedFormats = this.mVideoEncoderFactory.GetSupportedFormats();
            if (GetSupportedFormats != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Supports video encoder list:");
                LIZ.append(GetSupportedFormats);
                AVLog.d("LiveStream", X1D.LIZIZ(LIZ));
                this.mAvailableVideoEncoders = GetSupportedFormats.split(":");
            } else {
                throw new AndroidRuntimeException("Not found any valid video encoder");
            }
        }
        boolean isEnableVideoEncodeAccelera = this.mLiveStreamBuilder.isEnableVideoEncodeAccelera();
        boolean isHWEncodeOesDirectly = this.mLiveStreamBuilder.isHWEncodeOesDirectly();
        String str4 = "hardware";
        if (this.mLiveStreamBuilder.getVideoEncoder() == 1) {
            String[] strArr = this.mAvailableVideoEncoders;
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    String str5 = strArr[i3];
                    if (isEnableVideoEncodeAccelera) {
                        str = "video/avc";
                    } else {
                        str = "video/bytevc0";
                    }
                    if (isEnableVideoEncodeAccelera == str5.contains("video_enable_accelera=true")) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("video_type=");
                        LIZ2.append(str);
                        if (str5.contains(X1D.LIZIZ(LIZ2))) {
                            if (!isHWEncodeOesDirectly || str5.contains("oes_texture_frame=true")) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    i3++;
                } else {
                    str = getSoftVideoCodec();
                    if (str != null) {
                        boolean equals = str.equals("video/bytevc1");
                        this.mLiveStreamBuilder.setEnableVideoEncodeAccelera(false);
                        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
                        if (equals) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        liveStreamBuilder.setVideoEncoder(i);
                        LiveStreamBuilder liveStreamBuilder2 = this.mLiveStreamBuilder;
                        if (equals) {
                            i2 = 4;
                        } else {
                            i2 = 3;
                        }
                        liveStreamBuilder2.setVideoProfile(i2);
                        AVLog.iow("LiveStream", C16880lQ.LLLZ("Hardware video encoder not found, use %s instead.", new Object[]{str}));
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("h264 ");
                        if (!isEnableVideoEncodeAccelera) {
                            str4 = "software";
                        }
                        LIZ3.append(str4);
                        String LIZIZ = X1D.LIZIZ(LIZ3);
                        StringBuilder LIZ4 = X1D.LIZ();
                        if (equals) {
                            str3 = "ByteVC1";
                        } else {
                            str3 = "h264";
                        }
                        uploadVideoEncoderChangeLog(LIZIZ, JBR.LJFF(LIZ4, str3, " software", LIZ4));
                    }
                }
            }
        } else {
            if (this.mLiveStreamBuilder.getVideoEncoder() == 2) {
                for (String str6 : this.mAvailableVideoEncoders) {
                    if (str6.contains("video_type=video/bytevc1") && isEnableVideoEncodeAccelera == str6.contains("video_enable_accelera=true") && (!isHWEncodeOesDirectly || !isEnableVideoEncodeAccelera || str6.contains("oes_texture_frame=true"))) {
                        str = "video/bytevc1";
                    }
                }
                if (this.mLiveStreamBuilder.getEncoderDowngradeOptimize()) {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("ByteVC1 ");
                    if (isEnableVideoEncodeAccelera) {
                        str2 = "hardware";
                    } else {
                        str2 = "software";
                    }
                    LIZ5.append(str2);
                    LIZ5.append(" encoder not found, use H.264 hardware encoder instead.");
                    AVLog.iow("LiveStream", X1D.LIZIZ(LIZ5));
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("ByteVC1 ");
                    if (!isEnableVideoEncodeAccelera) {
                        str4 = "software";
                    }
                    LIZ6.append(str4);
                    uploadVideoEncoderChangeLog(X1D.LIZIZ(LIZ6), "h264 hardware");
                    this.mLiveStreamBuilder.setVideoEncoder(1);
                    this.mLiveStreamBuilder.setEnableVideoEncodeAccelera(true);
                    this.mLiveStreamBuilder.setVideoProfile(3);
                    return chooseVideoEncode();
                }
                if (!isEnableVideoEncodeAccelera) {
                    AVLog.iow("LiveStream", "ByteVC1 hardware encoder not found, use ByteVC1 software encoder instead.");
                    uploadVideoEncoderChangeLog("ByteVC1 hardware", "ByteVC1 software");
                    this.mLiveStreamBuilder.setEnableVideoEncodeAccelera(false);
                } else {
                    AVLog.iow("LiveStream", "ByteVC1 software encoder not found, use H.264 software encoder instead.");
                    uploadVideoEncoderChangeLog("ByteVC1 software", "h264 software");
                    this.mLiveStreamBuilder.setVideoEncoder(1);
                    this.mLiveStreamBuilder.setVideoProfile(3);
                }
                return chooseVideoEncode();
            }
            str = null;
        }
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("Use video encoder: ");
        LIZ7.append(str);
        AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ7));
        return str;
    }

    private void creatVideoTrack() {
        AssetManager assetManager;
        boolean z;
        int videoCaptureDevice = this.mLiveStreamBuilder.getVideoCaptureDevice();
        if (videoCaptureDevice != 0) {
            if (videoCaptureDevice == 5) {
                z = true;
            } else {
                z = false;
            }
            this.mIsRadioMode = z;
            LiveStreamVideoCapture liveStreamVideoCapture = new LiveStreamVideoCapture(videoCaptureDevice, this.mVideoCaptureHandler, this, this.mLiveStreamBuilder);
            this.mVideoCapturer = liveStreamVideoCapture;
            liveStreamVideoCapture.setBeforeOnFrameCallback(new C65859Pt1(this));
            initVideoCapturerPauseSetting();
            this.mVideoCapturer.setDumpFrameParams(this.mLiveStreamBuilder.getDumpFrameParams());
        }
        LiveStreamVideoCapture liveStreamVideoCapture2 = this.mVideoCapturer;
        if (liveStreamVideoCapture2 != null) {
            this.mVideoTrack = this.mMediaEngineFactory.createVideoTrack(liveStreamVideoCapture2);
            IFilterManager iFilterManager = this.mFilterManager;
            if ((iFilterManager instanceof FilterManager) && !this.mEffectInited) {
                FilterManager filterManager = (FilterManager) iFilterManager;
                filterManager.setEffectAlgorithmAB(this.mLiveStreamBuilder.getEffectAlgorithmAB());
                this.mRoiSwitch.checkRoiSwitch();
                if (this.mLiveStreamBuilder.getAssetManager() instanceof AssetManager) {
                    assetManager = (AssetManager) this.mLiveStreamBuilder.getAssetManager();
                } else {
                    assetManager = null;
                }
                filterManager.configEffect(this.mLiveStreamBuilder.getVideoWidth(), this.mLiveStreamBuilder.getVideoHeight(), this.mLiveStreamBuilder.getEffectModePath(), Build.MODEL, this.mLiveStreamBuilder.isUseTTFaceDetect(), this.mLiveStreamBuilder.isUseNewEffectEngine(), this.mLiveStreamBuilder.getEffectPlatformConfig(), assetManager, this.mLiveStreamBuilder.getEffectResourceFinder());
                this.mEffectInited = true;
                filterManager.setDumpFrameParams(this.mLiveStreamBuilder.getDumpFrameParams());
            }
            Object obj = this.mFilterManager;
            if (obj instanceof FilterManager) {
                this.mVideoTrack.setVideoProcessor((VideoProcessor) obj);
            }
            TextureFrameAvailableSink textureFrameAvailableSink = this.mTextureFrameAvailableSink;
            if (textureFrameAvailableSink != null) {
                this.mVideoTrack.addVideoSink(textureFrameAvailableSink);
            }
        }
        if (this.mPerfAwareFpsStrategy == null) {
            this.mPerfAwareFpsStrategy = new PerfAwareFpsStrategy(this, this.mWorkThreadHandler);
        }
        if (this.mFpsLevelStrategy == null) {
            FpsLevelStrategy fpsLevelStrategy = new FpsLevelStrategy(this);
            this.mFpsLevelStrategy = fpsLevelStrategy;
            PerfAwareFpsStrategy perfAwareFpsStrategy = this.mPerfAwareFpsStrategy;
            if (perfAwareFpsStrategy != null) {
                perfAwareFpsStrategy.addPerfObserver(fpsLevelStrategy);
            }
        }
        if (this.mVideoAlgorithmStrategy == null) {
            VideoAlgorithmStrategy videoAlgorithmStrategy = new VideoAlgorithmStrategy(this);
            this.mVideoAlgorithmStrategy = videoAlgorithmStrategy;
            PerfAwareFpsStrategy perfAwareFpsStrategy2 = this.mPerfAwareFpsStrategy;
            if (perfAwareFpsStrategy2 != null) {
                perfAwareFpsStrategy2.addPerfObserver(videoAlgorithmStrategy);
            }
        }
        changeToKTVMode(this.mIsKaraokeMovie, this.mKaraokeMovie);
    }

    private void destroyAudioTrack() {
        AudioTrack audioTrack;
        this.mReportFence.writeLock().lock();
        IAudioRecordManager iAudioRecordManager = this.mAudioRecordManager;
        if (iAudioRecordManager != null) {
            iAudioRecordManager.release();
            this.mAudioRecordManager = null;
        }
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && (audioTrack = this.mAudioTrack) != null) {
            mediaEncodeStream.removeTrack(audioTrack);
            removeStreamsFromEncodeStream(false);
        }
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null) {
            audioCapturer.setCalculatePcmPowerEventObserver(null);
            this.mAudioCapture.pause();
            this.mAudioCapture.stop();
            AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
            if (audioDeviceModule != null && audioDeviceModule.isExternalRecording()) {
                this.mAudioDeviceModule.stopRecording();
            }
            this.mAudioCapture.release();
            this.mAudioCapture = null;
            AVLog.ioi("LiveStream", "Stop audio capture success");
        }
        if (this.mAudioTrack != null) {
            removeCapturedAudioFrameSinks();
            this.mAudioTrack.setAudioProcessor(null);
            this.mAudioTrack.release();
            this.mAudioTrack = null;
        }
        this.mReportFence.writeLock().unlock();
    }

    private void destroyMixerSink() {
        AudioSink audioSink;
        VideoSink videoSink;
        if (this.mVeLivePusher != null) {
            AudioMixer audioMixer = this.mMediaEncodeStream.getAudioMixer();
            VideoMixer videoMixer = this.mMediaEncodeStream.getVideoMixer();
            if (videoMixer != null && (videoSink = this.mVeLiveVideoSink) != null) {
                videoMixer.removeVideoSink(videoSink);
                this.mVeLiveVideoSink.release();
            }
            if (audioMixer != null && (audioSink = this.mVeLiveAudioSink) != null) {
                audioMixer.removeAudioSink(audioSink);
                this.mVeLiveAudioSink.release();
            }
        }
    }

    private int getConnectResultSource() {
        if (this.mPushStreamAfterServerMix) {
            this.mPushStreamAfterServerMix = false;
            return 5;
        }
        return 2;
    }

    private int getCurrentCaptureStatus() {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            return liveStreamVideoCapture.status();
        }
        return -1;
    }

    private String getSoftVideoCodec() {
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder == null) {
            return null;
        }
        boolean z = false;
        boolean z2 = false;
        for (String str : this.mAvailableVideoEncoders) {
            if (!str.contains("video_enable_accelera=true")) {
                if (str.contains("video_type=video/bytevc1")) {
                    z = true;
                } else if (str.contains("video_type=video/bytevc0")) {
                    z2 = true;
                }
            }
        }
        if (liveStreamBuilder.getPushBase().videoEncodePerfPrior && z) {
            return "video/bytevc1";
        }
        if (!z2) {
            return null;
        }
        return "video/bytevc0";
    }

    private void initSITICalculator() {
        if (this.mLiveStreamBuilder.getPushBase().enableSiti) {
            SITICalculator sITICalculator = new SITICalculator(this.mWorkThreadHandler, this.mLiveStreamBuilder.getPushBase().siti_strategy_ver, -1);
            this.mSITICalculator = sITICalculator;
            if (sITICalculator.isValid()) {
                setupSITIParameter();
                this.mSITICalculator.setSITIEventObserver(new SITICalculator.ISITIEventObserver() { // from class: X.P2r
                    @Override // com.ss.ttlivestreamer.core.engine.SITICalculator.ISITIEventObserver
                    public final void onBitrateChanged(int i, String str) {
                        LiveStream.this.lambda$initSITICalculator$2(i, str);
                    }
                });
                AVLog.ioi("LiveStream", "STIICalculator Created");
                return;
            }
            AVLog.ioe("LiveStream", "STIICalculator is not valid");
        }
    }

    private void initVideoCapturerPauseSetting() {
        this.mVideoCapturer.setBackgroundFps(this.mLiveStreamBuilder.getPauseFps());
        this.mVideoCapturer.setPauseDisableEffectSwitch(this.mLiveStreamBuilder.isPauseDisableEffectSwitch());
        this.mVideoCapturer.setFilterManager(this.mFilterManager);
        this.mVideoCapturer.setBackgroundPolicy(this.mLiveStreamBuilder.getBgMode());
    }

    public /* synthetic */ void lambda$creatVideoTrack$6() {
        this.gpuTurboWrapper.refreshEffectSRStatus(this.mFilterManager, this.adaptResolutionUtils, false);
    }

    public /* synthetic */ void lambda$startAudioCapture$5() {
        if (this.mStatus.get() == 7 || !checkAudioCaptureCert(true)) {
            return;
        }
        doStartAudioSource();
    }

    public /* synthetic */ void lambda$startVideoCapture$4() {
        if (this.mStatus.get() != 7) {
            doStartVideoSource();
        }
    }

    public /* synthetic */ void lambda$stopAudioCapture$12() {
        if (this.mStatus.get() != 7) {
            checkAudioCaptureCert(false);
            doStopAudioSource();
        }
    }

    public /* synthetic */ void lambda$stopVideoCapture$7() {
        if (this.mStatus.get() != 7) {
            doStopVideoSource();
        }
    }

    private boolean mayAddSeiForVideoE2EDelay() {
        int videoE2EDelaySampleInterval;
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        boolean z = false;
        if (liveStreamBuilder != null && (videoE2EDelaySampleInterval = liveStreamBuilder.getVideoE2EDelaySampleInterval()) > 0) {
            try {
                if (0 == this.mVideoFrameNum % videoE2EDelaySampleInterval) {
                    this.mVideoFrameNum = 0L;
                    z = true;
                }
            } catch (Exception unused) {
            }
        }
        this.mVideoFrameNum++;
        return z;
    }

    private void removeCapturedAudioFrameSinks() {
        AudioFrameAvailableSink audioFrameAvailableSink;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null && audioDeviceModule.isSeperateRecordingCallback()) {
            AudioFrameAvailableSink audioFrameAvailableSink2 = this.mAudioFrameAvailableSink;
            if (audioFrameAvailableSink2 != null) {
                this.mAudioDeviceModule.removeAudioSink(3, audioFrameAvailableSink2);
                return;
            }
            return;
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack == null || (audioFrameAvailableSink = this.mAudioFrameAvailableSink) == null) {
            return;
        }
        audioTrack.removeAudioSink(audioFrameAvailableSink);
    }

    private void setProtocolDownGradeFlag() {
        if (this.mRtmpReConnectCounts >= this.mRtmpReConnectCountsThreshold) {
            this.mProtocolDownGradeFlag = true;
        }
    }

    private void setTransportBaseParams() {
        TEBundle tEBundle;
        Transport transport = this.mRTMPTransport;
        if (transport != null && (tEBundle = this.mTransportOpt) != null) {
            tEBundle.setLong("rtmp_init_video_bitrate", this.mLiveStreamBuilder.getVideoBitrate());
            this.mTransportOpt.setLong("rtmp_max_video_bitrate", this.mLiveStreamBuilder.getVideoMaxBitrate());
            this.mTransportOpt.setLong("rtmp_min_video_bitrate", this.mLiveStreamBuilder.getVideoMinBitrate());
            this.mTransportOpt.setInt("video_width", this.mLiveStreamBuilder.getVideoWidth());
            this.mTransportOpt.setInt("video_height", this.mLiveStreamBuilder.getVideoHeight());
            this.mTransportOpt.setInt("video_fps", this.mLiveStreamBuilder.getVideoFps());
            this.mTransportOpt.setBool("transport_enable_new_update_send_cache_config", this.mLiveStreamBuilder.getPushBase().newSendCacheConfig);
            this.mTransportOpt.setBool("video_enable_accelera", this.mLiveStreamBuilder.isEnableVideoEncodeAccelera());
            if (this.mLiveStreamBuilder.isNetFpsAdaptiveEnable()) {
                updateRtmpCacheCfg(this.mLiveStreamBuilder.getRtmpCacheCfgParams().getInitVideoFps());
            }
            transport.setParameter(this.mTransportOpt);
        }
    }

    private void setupEncodeBaseParam() {
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && this.mEncodeStreamOpt != null) {
            updateLiveParamChangeForInteract();
            this.mEncodeStreamOpt.setString("video_type", chooseVideoEncode());
            this.mEncodeStreamOpt.setBool("video_enable_accelera", this.mLiveStreamBuilder.isEnableVideoEncodeAccelera());
            this.mEncodeStreamOpt.setInt("video_width", this.mLiveStreamBuilder.getVideoWidth());
            this.mEncodeStreamOpt.setInt("video_height", this.mLiveStreamBuilder.getVideoHeight());
            this.mEncodeStreamOpt.setLong("video_min_bitrate", this.mLiveStreamBuilder.getVideoMinBitrate());
            this.mEncodeStreamOpt.setLong("video_max_bitrate", this.mLiveStreamBuilder.getVideoMaxBitrate());
            this.mEncodeStreamOpt.setInt("video_fps", this.mLiveStreamBuilder.getVideoFps());
            mediaEncodeStream.setParameter(this.mEncodeStreamOpt);
        }
    }

    private void setupEncodeFrameSink() {
        VideoMixer videoMixer;
        JSONObject dumpFrameParams = this.mLiveStreamBuilder.getDumpFrameParams();
        JSONObject jSONObject = this.mLiveStreamBuilder.getPushBase().vqScoreParams;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && (videoMixer = mediaEncodeStream.getVideoMixer()) != null && jSONObject != null) {
            VideoSink videoSink = this.mEncodeFrameSink;
            if (videoSink != null) {
                videoMixer.removeVideoSink(videoSink);
                this.mEncodeFrameSink.release();
            }
            AnonymousClass10 anonymousClass10 = new VideoSink() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.10
                public final /* synthetic */ boolean val$dumpEncodeFrames;
                public final /* synthetic */ JSONObject val$dumpParams;
                public final /* synthetic */ JSONObject val$vqscoreParams;

                @Override // com.ss.ttlivestreamer.core.engine.VideoSink
                public void OnDiscardedFrame() {
                }

                @Override // com.ss.ttlivestreamer.core.engine.VideoSink
                public void onFrame(VideoFrame videoFrame) {
                    VideoFrame.I420Buffer i420;
                    boolean z;
                    if (LiveStream.this.mStatus.get() == 7 || LiveStream.this.mStatus.get() == 8) {
                        return;
                    }
                    VideoFrame.Buffer buffer = videoFrame.getBuffer();
                    int width = buffer.getWidth();
                    int height = buffer.getHeight();
                    if (r2) {
                        LiveStream liveStream = LiveStream.this;
                        if (liveStream.mEncodeFrameDumper == null) {
                            liveStream.mEncodeFrameDumper = new VideoDumpProxy.RawVideoDumperProxy(r3, "dumpEncodeFrames");
                        }
                    }
                    VideoDumpProxy.RawVideoDumperProxy rawVideoDumperProxy = LiveStream.this.mEncodeFrameDumper;
                    if (rawVideoDumperProxy != null && rawVideoDumperProxy.checkFrameCount()) {
                        int videoFps = LiveStream.this.mLiveStreamBuilder.getVideoFps();
                        if (buffer.isTexture()) {
                            VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
                            int textureId = textureBuffer.getTextureId();
                            if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                                z = true;
                            } else {
                                z = false;
                            }
                            LiveStream.this.mEncodeFrameDumper.onTextureFrame(textureId, z, width, height, videoFps, null, "EncodeFrames");
                        } else {
                            if (buffer instanceof VideoFrame.I420Buffer) {
                                i420 = (VideoFrame.I420Buffer) buffer;
                            } else {
                                i420 = buffer.toI420();
                            }
                            LiveStream.this.mEncodeFrameDumper.onYuvFrame(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), width, height, videoFps, "EncodeFrames");
                        }
                    }
                    if (r4 == null || !buffer.isTexture()) {
                        return;
                    }
                    IFilterManager iFilterManager = LiveStream.this.mFilterManager;
                    if (!(iFilterManager instanceof FilterManager)) {
                        return;
                    }
                    BmfVQScoreFilter vQScoreFilter = ((FilterManager) iFilterManager).getVQScoreFilter();
                    VideoFrame.TextureBuffer textureBuffer2 = (VideoFrame.TextureBuffer) buffer;
                    if (vQScoreFilter == null) {
                        return;
                    }
                    vQScoreFilter.process(textureBuffer2.getTextureId(), width, height);
                }

                public AnonymousClass10(boolean z, JSONObject dumpFrameParams2, JSONObject jSONObject2) {
                    r2 = z;
                    r3 = dumpFrameParams2;
                    r4 = jSONObject2;
                }
            };
            this.mEncodeFrameSink = anonymousClass10;
            videoMixer.addVideoSink(anonymousClass10);
        }
    }

    private void setupMixerParameter() {
        AudioMixer audioMixer = this.mMediaEncodeStream.getAudioMixer();
        VideoMixer videoMixer = this.mMediaEncodeStream.getVideoMixer();
        audioMixer.setEnable(this.mAudioMixer);
        videoMixer.setEnable(this.mVideoMixer);
        DebugLogUtils.isEnableDebugLog();
        if (this.mLiveStreamBuilder.getPushBase().isScreenRecordDisableMixer && this.mLiveStreamBuilder.getVideoCaptureDevice() == 3) {
            videoMixer.setEnable(false);
        }
        TEBundle tEBundle = new TEBundle();
        videoMixer.getParameter(tEBundle);
        tEBundle.setInt("vmixer_bg_color", this.mVideoMixBgColor);
        tEBundle.setBool("vmixer_planar_render", this.mPublishPlanarRender);
        tEBundle.setBool("draw_with_diff_size", true);
        tEBundle.setBool("vmixer_clear_stencil", this.mLiveStreamBuilder.getPushBase().clearStencilWhenResize);
        videoMixer.setParameter(tEBundle);
        if (DebugLogUtils.isEnableDebugLog()) {
            int i = tEBundle.getInt("vmixer_width");
            int i2 = tEBundle.getInt("vmixer_height");
            if (i2 != this.mLiveStreamBuilder.getVideoHeight() || i != this.mLiveStreamBuilder.getVideoWidth()) {
                StringBuilder LIZJ = C06460Ne.LIZJ("Bad mixer size(", i, "x", i2, ") VS ");
                LIZJ.append(this.mLiveStreamBuilder.getVideoWidth());
                LIZJ.append("x");
                LIZJ.append(this.mLiveStreamBuilder.getVideoHeight());
                throw new AndroidRuntimeException(X1D.LIZIZ(LIZJ));
            }
        }
        tEBundle.release();
    }

    private void setupSITIParameter() {
        int i;
        int i2;
        TEBundle tEBundle = new TEBundle();
        try {
            LiveSdkSetting sdkSetting = this.mLiveStreamBuilder.getSdkSetting();
            PushBase pushBase = this.mLiveStreamBuilder.getPushBase();
            if (pushBase.enableSiti) {
                int videoFps = this.mLiveStreamBuilder.getVideoFps();
                if (sdkSetting.rtmpCacheConfig != null && this.mLiveStreamBuilder.isNetFpsAdaptiveEnable()) {
                    if (NumberInit.isDefined(Integer.valueOf(sdkSetting.rtmpCacheConfig.getMinVideoFps())) && sdkSetting.rtmpCacheConfig.getMinVideoFps() < videoFps) {
                        i2 = sdkSetting.rtmpCacheConfig.getMinVideoFps();
                    } else {
                        i2 = videoFps;
                    }
                    if (NumberInit.isDefined(Integer.valueOf(sdkSetting.rtmpCacheConfig.getMaxVideoFps())) && sdkSetting.rtmpCacheConfig.getMaxVideoFps() > videoFps) {
                        i = sdkSetting.rtmpCacheConfig.getMaxVideoFps();
                    } else {
                        i = videoFps;
                    }
                } else {
                    i = videoFps;
                    i2 = videoFps;
                }
                TEBundle tEBundle2 = new TEBundle();
                tEBundle2.setInt("resize_width", this.mLiveStreamBuilder.getVideoWidth());
                tEBundle2.setInt("resize_height", this.mLiveStreamBuilder.getVideoHeight());
                tEBundle2.setInt("publish_width", this.mLiveStreamBuilder.getVideoWidth());
                tEBundle2.setInt("publish_height", this.mLiveStreamBuilder.getVideoHeight());
                TEBundle tEBundle3 = new TEBundle();
                tEBundle3.setInt("cur_cplx_category", -1);
                tEBundle3.setInt("publish_width", this.mLiveStreamBuilder.getVideoWidth());
                tEBundle3.setInt("publish_height", this.mLiveStreamBuilder.getVideoHeight());
                tEBundle3.setInt("publish_def_bitrate", this.mLiveStreamBuilder.getVideoBitrate());
                tEBundle3.setInt("publish_min_bitrate", this.mLiveStreamBuilder.getVideoMinBitrate());
                tEBundle3.setInt("publish_max_bitrate", this.mLiveStreamBuilder.getVideoMaxBitrate());
                tEBundle3.setInt("init_video_fps", videoFps);
                tEBundle3.setInt("min_video_fps", i2);
                tEBundle3.setInt("max_video_fps", i);
                tEBundle3.setInt("qulity_mode", pushBase.encStrategyConfig.getQualityMode());
                tEBundle3.setInt("strategy_adjust_mode", pushBase.encStrategyConfig.getStrategyAdjustMode());
                if (!pushBase.encStrategyConfig.getCategoryParams().isEmpty()) {
                    tEBundle3.setString("category_params", pushBase.encStrategyConfig.getCategoryParams());
                }
                if (!pushBase.encStrategyConfig.getBitrateRatios().isEmpty()) {
                    tEBundle3.setString("bitrate_ratios", pushBase.encStrategyConfig.getBitrateRatios());
                }
                if (!pushBase.encStrategyConfig.getFpsRatios().isEmpty()) {
                    tEBundle3.setString("fps_ratios", pushBase.encStrategyConfig.getFpsRatios());
                }
                SitiConfig sitiConfig = pushBase.sitiConfig;
                tEBundle2.setBool("using_gpu", sitiConfig.getUsingGpu());
                tEBundle2.setBool("using_arm", sitiConfig.getUsingArm());
                tEBundle2.setInt("thread_count", sitiConfig.getThreadCount());
                tEBundle2.setInt("period_ms", sitiConfig.getPeriodMs());
                int videoFps2 = this.mLiveStreamBuilder.getVideoFps() / (sitiConfig.getFramesCountsCalcSiti() / sitiConfig.getExtractDuration());
                tEBundle2.setInt("extract_frame_gap", videoFps2);
                tEBundle2.setInt("frames_counts_calc_siti", sitiConfig.getFramesCountsCalcSiti());
                tEBundle.setBundle("siti_config", tEBundle2);
                tEBundle.setBundle("enc_strategy_config", tEBundle3);
                this.mSITICalculator.setParameters(tEBundle);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SITIStrategy siti config extract_frame_gap:");
                LIZ.append(videoFps2);
                AVLog.iod("LiveStream", X1D.LIZIZ(LIZ));
            }
        } catch (Exception unused) {
        }
        tEBundle.release();
    }

    private void setupVsyncParameter() {
        VsyncModule vsyncModule = this.mMediaEncodeStream.getVsyncModule();
        if (vsyncModule == null) {
            return;
        }
        vsyncModule.setEnable(true);
        TEBundle option = vsyncModule.getOption();
        option.setInt("vsync_max_intveval_than_frame_ms", this.mLiveStreamBuilder.getVsyncModuleMaxIntevalOnFrameMs());
        option.setInt("vsync_max_intveval_than_now_ms", this.mLiveStreamBuilder.getVsyncModuleMaxIntevalOnNowMs());
        vsyncModule.setOption(option);
        vsyncModule.registerObserver(new VsyncModule.Observer() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.9
            public AnonymousClass9() {
            }

            @Override // com.ss.ttlivestreamer.core.engine.VsyncModule.Observer
            public void onEvent(int i, int i2, long j, String str) {
                VsyncModule vsyncModule2;
                MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
                if (mediaEncodeStream != null && (vsyncModule2 = mediaEncodeStream.getVsyncModule()) != null) {
                    LiveStream.this.vsyncEvent(vsyncModule2, i, i2, j, str);
                }
            }
        });
    }

    private boolean startAudioSourceOnBackgroundOrMute() {
        if (this.mAudioCapture instanceof LiveStreamAudioCaptureFromADM) {
            if (this.mPaused || this.mMuted) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startAudioSourceOnBackgroundOrMute: paused ");
                LIZ.append(this.mPaused);
                LIZ.append(", muted ");
                LIZ.append(this.mMuted);
                AVLog.logKibana(4, "LiveStream", X1D.LIZIZ(LIZ), null);
                ((LiveStreamAudioCaptureFromADM) this.mAudioCapture).startOnBackgroundOrMute(this.mPaused, this.mMuted);
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean startVideoSourceOnBackground() {
        if (this.mPaused) {
            if (this.mVideoCapturer.getBackgroundPolicy() != this.mLiveStreamBuilder.getBgMode()) {
                initVideoCapturerPauseSetting();
            }
            if (this.mLiveStreamBuilder.getBgMode() != 1) {
                AVLog.logKibana(4, "LiveStream", "startVideoSourceOnBackground", null);
                this.mVideoCapturer.startOnBackground(this.mLiveStreamBuilder.getVideoCaptureWidth(), this.mLiveStreamBuilder.getVideoCaptureHeight(), this.mLiveStreamBuilder.getVideoCaptureFps());
                return true;
            }
            return false;
        }
        return false;
    }

    private void stopRecord() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.17
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$17__run$___twin___() {
                    RecorderManager recorderManager = LiveStream.this.mRecorderManager;
                    if (recorderManager != null) {
                        recorderManager.stop();
                        LiveStream.this.mRecorderManager.release();
                        LiveStream.this.mRecorderManager = null;
                    }
                }

                public AnonymousClass17() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$17_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass17 anonymousClass17) {
                    boolean LIZ;
                    try {
                        anonymousClass17.com_ss_ttlivestreamer_livestreamv2_LiveStream$17__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    private void updateKcpParams() {
        if (this.mLiveStreamBuilder.getKcpParams() != null) {
            KcpParams kcpParams = this.mLiveStreamBuilder.getKcpParams();
            TEBundle tEBundle = new TEBundle();
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.wndRecv))) {
                tEBundle.setInt("wnd_recv", kcpParams.wndRecv);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.wndSend))) {
                tEBundle.setInt("wnd_send", kcpParams.wndSend);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.mtuSize))) {
                tEBundle.setInt("mtu_size", kcpParams.mtuSize);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.fastAck))) {
                tEBundle.setInt("fast_ack", kcpParams.fastAck);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.bwinit))) {
                tEBundle.setInt("bwinit", kcpParams.bwinit);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.bwmin))) {
                tEBundle.setInt("bwmin", kcpParams.bwmin);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.window))) {
                tEBundle.setInt("window", kcpParams.window);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.probebw))) {
                tEBundle.setInt("probebw", kcpParams.probebw);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.preempt))) {
                tEBundle.setInt("preempt", kcpParams.preempt);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.jitter))) {
                tEBundle.setInt("jitter", kcpParams.jitter);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.timeout))) {
                tEBundle.setInt("timeout", kcpParams.timeout);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.retrans))) {
                tEBundle.setInt("retrans", kcpParams.retrans);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.report))) {
                tEBundle.setInt("report", kcpParams.report);
            }
            if (NumberInit.isDefined(Double.valueOf(kcpParams.lost))) {
                tEBundle.setDouble("lost", kcpParams.lost);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.fec))) {
                tEBundle.setInt("fec", kcpParams.fec);
            }
            if (NumberInit.isDefined(Integer.valueOf(kcpParams.logMask))) {
                tEBundle.setInt("logmask", kcpParams.logMask);
            }
            this.mTransportOpt.setBundle("kcp_params", tEBundle);
            tEBundle.release();
        }
    }

    private void updateLiveParamChangeForInteract() {
        if (this.mEncodeStreamOpt.getInt("video_fps") != this.mLiveStreamBuilder.getVideoFps()) {
            reportLiveCoreInfo(34, this.mLiveStreamBuilder.getVideoFps(), 0);
        }
    }

    public void addCapturedAudioFrameSinks() {
        AudioFrameAvailableSink audioFrameAvailableSink;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null && audioDeviceModule.isSeperateRecordingCallback()) {
            AudioFrameAvailableSink audioFrameAvailableSink2 = this.mAudioFrameAvailableSink;
            if (audioFrameAvailableSink2 != null) {
                this.mAudioDeviceModule.addAudioSink(3, audioFrameAvailableSink2);
                return;
            }
            return;
        }
        AudioTrack audioTrack = this.mAudioTrack;
        if (audioTrack == null || (audioFrameAvailableSink = this.mAudioFrameAvailableSink) == null) {
            return;
        }
        audioTrack.addAudioSink(audioFrameAvailableSink);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean audioMute() {
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null) {
            return audioCapturer.isMute();
        }
        return false;
    }

    public void captureFirstFrameNotify() {
        if (!this.mFirstFrameRendered) {
            reportLiveCoreInfo(30, getLiveStreamBuilder().getVideoCaptureDevice(), 0);
            this.mFirstFrameRendered = true;
        }
    }

    public void clearNetInfo() {
        Transport transport = this.mRTMPTransport;
        if (transport != null) {
            transport.clearNetInfoInt64Value();
        }
    }

    public void createEncoderStream() {
        MediaEngineFactory mediaEngineFactory;
        if (this.mVideoEncoderFactory == null) {
            this.mVideoEncoderFactory = new DefaultVideoEncoderFactory();
        }
        if (this.mAudioEncoderFactory == null) {
            this.mAudioEncoderFactory = new DefaultAudioEncoderFactory();
        }
        if (this.mRTMPTransport == null) {
            Transport createTransport = createTransport();
            this.mRTMPTransport = createTransport;
            PushStreamStallRecorder pushStreamStallRecorder = this.mPushStreamStallRecorder;
            if (pushStreamStallRecorder != null && this.pushStallConfigBundle != null) {
                createTransport.setPushStreamStallRecorder(pushStreamStallRecorder);
            }
            Iterator<Map.Entry<String, UserMetadata>> it = this.mUserMetadata.entrySet().iterator();
            while (it.hasNext()) {
                UserMetadata value = it.next().getValue();
                this.mRTMPTransport.addUserMetaData(value.key, value.value, value.flag);
                IVeLivePusher iVeLivePusher = this.mVeLivePusher;
                if (iVeLivePusher != null) {
                    iVeLivePusher.addUserMetaData(value.key, value.value, value.flag);
                }
            }
            this.mTransportOpt = this.mRTMPTransport.getParameter();
        }
        if (this.mMediaEncodeStream == null && (mediaEngineFactory = this.mMediaEngineFactory) != null) {
            MediaEncodeStream createMediaEncodeStream = mediaEngineFactory.createMediaEncodeStream(this.mVideoEncoderFactory, this.mAudioEncoderFactory, this.mRTMPTransport);
            this.mMediaEncodeStream = createMediaEncodeStream;
            this.mEncodeStreamOpt = createMediaEncodeStream.getParameter();
            this.mMediaEncodeStream.setIsAddCropInfo(this.mLiveStreamBuilder.isAddCropSeiInfo());
            this.mMediaEncodeStream.registerObserver(this);
            this.mMediaEncodeStream.setEstimateTimeInterval((int) this.mUploadLogInterval);
            if (!this.mLiveStreamBuilder.isEnableVelivePusher()) {
                this.mMediaEncodeStream.start();
            }
        }
        if (this.mLiveStreamStrategy == null) {
            LiveStreamStrategy liveStreamStrategy = new LiveStreamStrategy(this.mEncodeStreamOpt, this.mTransportOpt, this);
            liveStreamStrategy.setLiveStreamBuilder(this.mLiveStreamBuilder);
            this.mLiveStreamStrategy = liveStreamStrategy;
        }
        setupParameter();
    }

    public Transport createTransport() {
        boolean z;
        boolean z2 = this.mLiveStreamBuilder.getPushBase().rtmpLockOpt;
        boolean z3 = false;
        if (this.mLiveStreamBuilder.getVideoCaptureDevice() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.mLiveStreamBuilder.getAudioCaptureDevice() != 0) {
            z3 = true;
        }
        return new LibRTMPTransport(z2, z, z3, isRtmPush(), this.mLiveStreamBuilder.rtsEngineVersion());
    }

    public void destroyEncodeStream() {
        AudioTrack audioTrack;
        VideoTrack videoTrack;
        LiveStreamBaseStrategy liveStreamBaseStrategy = this.mLiveStreamStrategy;
        if (liveStreamBaseStrategy != null) {
            liveStreamBaseStrategy.release();
            this.mLiveStreamStrategy = null;
        }
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.stop();
        }
        MediaEncodeStream mediaEncodeStream2 = this.mMediaEncodeStream;
        if (mediaEncodeStream2 != null && (videoTrack = this.mVideoTrack) != null) {
            mediaEncodeStream2.removeTrack(videoTrack);
            removeStreamsFromEncodeStream(true);
        }
        MediaEncodeStream mediaEncodeStream3 = this.mMediaEncodeStream;
        if (mediaEncodeStream3 != null && (audioTrack = this.mAudioTrack) != null) {
            mediaEncodeStream3.removeTrack(audioTrack);
            removeStreamsFromEncodeStream(false);
        }
        this.mReportFence.writeLock().lock();
        TEBundle tEBundle = this.mEncodeStreamOpt;
        if (tEBundle != null) {
            tEBundle.release();
            this.mEncodeStreamOpt = null;
        }
        if (this.mEncodeFrameSink != null) {
            VideoMixer videoMixer = this.mMediaEncodeStream.getVideoMixer();
            if (videoMixer != null) {
                videoMixer.removeVideoSink(this.mEncodeFrameSink);
            }
            destroyMixerSink();
            this.mEncodeFrameSink.release();
            this.mEncodeFrameSink = null;
        }
        VideoDumpProxy.RawVideoDumperProxy rawVideoDumperProxy = this.mEncodeFrameDumper;
        if (rawVideoDumperProxy != null) {
            rawVideoDumperProxy.release();
            this.mEncodeFrameDumper = null;
        }
        MediaEncodeStream mediaEncodeStream4 = this.mMediaEncodeStream;
        if (mediaEncodeStream4 != null) {
            mediaEncodeStream4.registerObserver(null);
            this.mMediaEncodeStream.release();
            this.mMediaEncodeStream = null;
        }
        AudioEncoderFactory audioEncoderFactory = this.mAudioEncoderFactory;
        if (audioEncoderFactory != null) {
            audioEncoderFactory.release();
            this.mAudioEncoderFactory = null;
        }
        TEBundle tEBundle2 = this.mTransportOpt;
        if (tEBundle2 != null) {
            tEBundle2.release();
            this.mTransportOpt = null;
        }
        synchronized (this.mRTMPTransportFence) {
            Transport transport = this.mRTMPTransport;
            if (transport != null) {
                if (this.mPushStreamStallRecorder != null) {
                    transport.setPushStreamStallRecorder(null);
                }
                this.mRTMPTransport.release();
                this.mRTMPTransport = null;
            }
        }
        this.mReportFence.writeLock().unlock();
        IAudioFilterManager iAudioFilterManager = this.mAudioFilterManager;
        if (iAudioFilterManager != null) {
            iAudioFilterManager.stop();
        }
        LiveStreamLogService liveStreamLogService = this.mStreamLogService;
        if (liveStreamLogService != null) {
            liveStreamLogService.onConnectEnd(this.mStatus.get());
        }
    }

    public void doStartAudioSource() {
        int startRecording;
        if (this.mStatus.get() == 8) {
            AVLog.ioe("LiveStream", "Try to start audio capture while mStatus is STATUS_ERROR");
            reportLiveCoreError(1, -100, new Exception("Error status call on start"));
            return;
        }
        if (this.mStatus.get() == 7) {
            return;
        }
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null && audioCapturer.status() == 1) {
            AVLog.iow("LiveStream", "Already start audio capture");
            return;
        }
        createAudioTrack();
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null && audioDeviceModule.isExternalRecording() && (startRecording = this.mAudioDeviceModule.startRecording()) != 0) {
            this.mStatus.set(8);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AudioDeviceModule.startRecording() failed: ");
            LIZ.append(startRecording);
            AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
            reportLiveCoreError(7, startRecording, new Exception("ADM startRecording error."));
            return;
        }
        if (this.mAudioTrack != null) {
            reportLiveCoreInfo(7, 0, 0);
            try {
                if (!startAudioSourceOnBackgroundOrMute()) {
                    this.mAudioCapture.start();
                }
                int updateChannel = this.mAudioCapture.updateChannel();
                if (updateChannel != this.mLiveStreamBuilder.getAudioCaptureChannel()) {
                    reportLiveCoreInfo(17, updateChannel, 0);
                }
                this.mLiveStreamBuilder.setAudioCaptureChannel(updateChannel);
                this.tryOpenAudioCaptureOnLater = true;
            } catch (Exception e) {
                if (this.tryOpenAudioCaptureOnLater) {
                    this.tryOpenAudioCaptureOnLater = false;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Open capture failed(");
                    LIZ2.append(e.getCause());
                    LIZ2.append("(");
                    LIZ2.append(Log.getStackTraceString(e));
                    LIZ2.append(")) with try open audio capture at after ");
                    LIZ2.append(400L);
                    LIZ2.append(" ms later");
                    AVLog.iow("LiveStream", X1D.LIZIZ(LIZ2));
                    this.mWorkThreadHandler.postDelayed(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.14
                        @Override // java.lang.Runnable
                        public void run() {
                            com_ss_ttlivestreamer_livestreamv2_LiveStream$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                        }

                        public void com_ss_ttlivestreamer_livestreamv2_LiveStream$14__run$___twin___() {
                            TokenCertConfigUtils.getInstance().saveAudioScene(TokenCertConfigUtils.SceneType.ERROR);
                            LiveStream.this.doStopAudioSource();
                            TokenCertConfigUtils.getInstance().saveAudioScene(TokenCertConfigUtils.SceneType.NONE);
                            LiveStream.this.doStartAudioSource();
                        }

                        public AnonymousClass14() {
                        }

                        public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$14_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass14 anonymousClass14) {
                            boolean LIZ3;
                            try {
                                anonymousClass14.com_ss_ttlivestreamer_livestreamv2_LiveStream$14__run$___twin___();
                            } finally {
                                if (LIZ3) {
                                }
                            }
                        }
                    }, 400L);
                    return;
                }
                this.mStatus.set(8);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Start audio capture failed: ");
                LIZ3.append(e.toString());
                AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ3));
                reportLiveCoreError(3, -300, e);
            }
            if (this.mAudioCapture.status() == 1) {
                RecorderManager recorderManager = this.mRecorderManager;
                if (recorderManager != null) {
                    recorderManager.setupAudioSource(this.mAudioCapture);
                }
                addCapturedAudioFrameSinks();
                if (this.mAudioFrameAvailableSink != null) {
                    this.mAudioCapture.resume();
                }
                AVLog.ioi("LiveStream", "Start audio capture success");
                reportLiveCoreInfo(8, 0, 0);
            } else {
                this.mStatus.set(8);
                AVLog.ioe("LiveStream", "Start audio capture failed: mAudioCapture's status is " + this.mAudioCapture.status());
                reportLiveCoreError(3, -301, new Exception("Audio capture start fail"));
            }
        }
        if (onCanEncodeStream()) {
            addTrackToEncodeStream();
        }
    }

    public void doStartVideoSource() {
        VideoSink videoSink;
        if (this.mStatus.get() == 8) {
            AVLog.ioe("LiveStream", "Try to start video capture while mStatus is STATUS_ERROR");
            reportLiveCoreError(1, -101, new Exception("Error status call on start"));
            return;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null && liveStreamVideoCapture.status() == 1) {
            AVLog.iow("LiveStream", "Already start video capture");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Call startVideoCapture. VideoCaptureDevice");
        LIZ.append(this.mLiveStreamBuilder.getVideoCaptureDevice());
        AVLog.logKibana(4, "LiveStream", X1D.LIZIZ(LIZ), null);
        creatVideoTrack();
        VideoTrack videoTrack = this.mVideoTrack;
        if (videoTrack != null && (videoSink = this.mRenderView) != null) {
            videoTrack.addVideoSink(videoSink);
        }
        if (this.mVideoCapturer != null) {
            reportLiveCoreInfo(4, 0, 0);
            this.mVideoCapturer.updateScreenIntent(this.mLiveStreamBuilder.getScreenCaptureIntent());
            adaptedVideoResolution(this.mLiveStreamBuilder.getCaptureAdaptedWidth(), this.mLiveStreamBuilder.getCaptureAdaptedHeight(), this.mLiveStreamBuilder.getVideoFps());
            if (!startVideoSourceOnBackground()) {
                this.mVideoCapturer.start(this.mLiveStreamBuilder.getVideoCaptureWidth(), this.mLiveStreamBuilder.getVideoCaptureHeight(), this.mLiveStreamBuilder.getVideoCaptureFps());
            }
        }
    }

    public void doStop() {
        if (this.mStatus.get() == 4) {
            return;
        }
        this.mNodeListenerInternal = null;
        this.mNodeListener = null;
        this.mPreparedIpList = null;
        this.mNodeIndex = 0;
        destroyEncodeStream();
        this.mWorkThreadHandler.removeCallbacks(this.rtmpReconnectRunnable);
        if (this.mStatus.get() != 8) {
            this.mStatus.set(4);
            reportLiveCoreInfo(3, 0, 0);
        } else {
            AVLog.iow("LiveStream", "Try to stop live stream while mStatus is STATUS_ERROR");
        }
    }

    public void doStopAudioSource() {
        AudioManager.AudioRecordingCallback audioRecordingCallback;
        if (this.mAudioCapture != null) {
            AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
            if (audioDeviceModule != null && (audioRecordingCallback = this.mAudioRecordingCallback) != null) {
                audioDeviceModule.unRegisterAudioRecordingCallback(audioRecordingCallback);
            }
            destroyAudioTrack();
            RecorderManager recorderManager = this.mRecorderManager;
            if (recorderManager != null) {
                recorderManager.setupAudioSource(null);
            }
            reportLiveCoreInfo(9, 0, 0);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IAudioRecordManager getAudioRecorderMgr() {
        if (this.mAudioRecordManager == null) {
            try {
                Constructor<?> constructor = Class.forName("com.ss.ttlivestreamer.livestreamv2.core.audiorecord.AudioRecordManager").getConstructor(MediaEngineFactory.class, AudioCapturer.class, IVideoEffectProcessor.class);
                constructor.setAccessible(true);
                Object[] objArr = new Object[3];
                objArr[0] = this.mMediaEngineFactory;
                objArr[1] = this.mAudioCapture;
                IVideoEffectProcessor iVideoEffectProcessor = this.effectProcessor;
                if (iVideoEffectProcessor == null) {
                    iVideoEffectProcessor = this.mFilterManager.getVideoEffectProcessor();
                }
                objArr[2] = iVideoEffectProcessor;
                this.mAudioRecordManager = (IAudioRecordManager) constructor.newInstance(objArr);
            } catch (Throwable unused) {
                AVLog.iow("LiveStream", "AudioRecordManager not found !! ");
            }
        }
        return this.mAudioRecordManager;
    }

    public int getChangeVideoFpsCount() {
        EncodeFpsAdjustStrategy encodeFpsAdjustStrategy = this.mEncodeFpsAdjustStrategy;
        if (encodeFpsAdjustStrategy != null) {
            return encodeFpsAdjustStrategy.getChangeVideoFpsCount();
        }
        return 0;
    }

    public int getCurCplxCategory() {
        SITICalculator sITICalculator = this.mSITICalculator;
        if (sITICalculator != null) {
            return sITICalculator.getCurPlxCategory();
        }
        return -1;
    }

    public int getCurrentRetryCount() {
        RTMPReconnectHelper rTMPReconnectHelper;
        if (this.mRtmpReconnectVersion == 2 && (rTMPReconnectHelper = this.mRtmpReconnectHelper) != null) {
            return rTMPReconnectHelper.getCurrentRetryCount();
        }
        return this.mRtmpReConnectCounts;
    }

    public int getFilterNoBufferCountAndClear() {
        IFilterManager iFilterManager = this.mFilterManager;
        if (iFilterManager instanceof FilterManager) {
            return ((FilterManager) iFilterManager).getNoBufferCountAndClear();
        }
        return 0;
    }

    public String getOriginUrl() {
        String str;
        String str2 = this.mUri;
        if (str2 != null) {
            return str2;
        }
        List<String> list = this.mUris;
        if (list != null && !list.isEmpty() && (str = (String) ListProtector.get(this.mUris, 0)) != null) {
            return str;
        }
        return "";
    }

    public int getStreamRetryCount() {
        RTMPReconnectHelper rTMPReconnectHelper;
        if (this.mRtmpReconnectVersion == 2 && (rTMPReconnectHelper = this.mRtmpReconnectHelper) != null) {
            return rTMPReconnectHelper.getStreamRetryCount();
        }
        LiveStreamLogService liveStreamLogService = this.mStreamLogService;
        if (liveStreamLogService != null) {
            return liveStreamLogService.getReconnectTime();
        }
        return 0;
    }

    public String getStreamUniqueId() {
        if (!TextUtils.isEmpty(this.mStreamUuid)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.mStreamUuid);
            LIZ.append(".");
            LIZ.append(this.mUrlPriority);
            return X1D.LIZIZ(LIZ);
        }
        return "";
    }

    public List<String> getUrls() {
        ArrayList arrayList = new ArrayList();
        String str = this.mUri;
        if (str != null) {
            arrayList.add(str);
            return arrayList;
        }
        List<String> list = this.mUris;
        if (list == null || list.isEmpty()) {
            return arrayList;
        }
        return this.mUris;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IVideoCapturerControl getVideoCapturerControl() {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.getISPControl();
            return liveStreamVideoCapture;
        }
        return null;
    }

    public int getVideoGop() {
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder == null) {
            return 0;
        }
        float videoGopSec = liveStreamBuilder.getVideoGopSec();
        int videoGop = this.mLiveStreamBuilder.getVideoGop();
        int videoFps = this.mLiveStreamBuilder.getVideoFps();
        if (videoGopSec > 0.0f) {
            return Math.round(videoGopSec * videoFps);
        }
        if (videoGop > 0) {
            return videoGop;
        }
        this.mLiveStreamBuilder.setVideoGopSec(2.0f);
        int i = videoFps * 2;
        this.mLiveStreamBuilder.setVideoGop(i);
        return i;
    }

    public long getWaitStrategyCallbackMs() {
        NodeListenerImpl nodeListenerImpl = this.mNodeListener;
        if (nodeListenerImpl != null) {
            return nodeListenerImpl.getWaitStrategyCallbackMs();
        }
        return -1L;
    }

    public void invalidateOptimizedUrl() {
        HashMap<String, String> hashMap;
        if ((this.mDns == null && !this.mStrategyDnsOptOpen) || (hashMap = this.mOptUrlMap) == null || hashMap.isEmpty()) {
            return;
        }
        String originUrl = getOriginUrl();
        if (TextUtils.isEmpty(originUrl) || !this.mOptUrlMap.containsKey(originUrl) || this.mOptUrlMap.get(originUrl).equals("INVALID_URL")) {
            return;
        }
        String str = this.mOptUrlMap.get(originUrl);
        this.mOptUrlMap.put(originUrl, "INVALID_URL");
        this.mOptUrlReachable = 0;
        this.mDnsOptOpen = false;
        this.mDnsOptHit = false;
        this.mEvaluatorSymbol = "";
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("optimized url ");
        LIZ.append(str);
        LIZ.append(" is invalidated.");
        AVLog.iow("LiveStream", X1D.LIZIZ(LIZ));
    }

    public boolean isAudioLive() {
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer == null || audioCapturer.status() != 1) {
            return false;
        }
        return true;
    }

    public boolean isLWReconnectNotCatchTransEvent() {
        if (this.isLWReconnectStatusError || this.isLWReconnectStatusProcess) {
            return true;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean isStreaming() {
        int i = this.mStatus.get();
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean isVideoLive() {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture == null || liveStreamVideoCapture.status() != 1) {
            return false;
        }
        return true;
    }

    public boolean onCanEncodeStream() {
        boolean z;
        boolean z2 = false;
        if (this.mStatus.get() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (DebugLogUtils.isEnableDebugLog() && !z) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("publish no ready.");
            LIZ.append(getStackTrack("LiveStream-StreamTrace"));
            AVLog.w("LiveStream-StreamTrace", X1D.LIZIZ(LIZ));
        }
        Object obj = "null";
        if (z) {
            if (this.mLiveStreamBuilder.getVideoCaptureDevice() != 0) {
                LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
                if (liveStreamVideoCapture != null && liveStreamVideoCapture.status() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (DebugLogUtils.isEnableDebugLog()) {
                    if (!z) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("");
                        LiveStreamVideoCapture liveStreamVideoCapture2 = this.mVideoCapturer;
                        if (liveStreamVideoCapture2 != null) {
                            obj = Integer.valueOf(liveStreamVideoCapture2.status());
                        }
                        LIZ2.append(obj);
                        StringBuilder LIZIZ = C25620zW.LIZIZ("VideoCapture[", X1D.LIZIZ(LIZ2), "] no ready ");
                        LIZIZ.append(getStackTrack("LiveStream-StreamTrace"));
                        AVLog.w("LiveStream-StreamTrace", X1D.LIZIZ(LIZIZ));
                        return z;
                    }
                } else if (!z) {
                    return z;
                }
            }
            if (this.mLiveStreamBuilder.getAudioCaptureDevice() == 0) {
                return z;
            }
            AudioCapturer audioCapturer = this.mAudioCapture;
            if (audioCapturer != null && audioCapturer.status() == 1) {
                z2 = true;
            }
            if (DebugLogUtils.isEnableDebugLog() && !z2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("");
                AudioCapturer audioCapturer2 = this.mAudioCapture;
                if (audioCapturer2 != null) {
                    obj = Integer.valueOf(audioCapturer2.status());
                }
                LIZ3.append(obj);
                StringBuilder LIZIZ2 = C25620zW.LIZIZ("AudioCapture[", X1D.LIZIZ(LIZ3), "] no ready ");
                LIZIZ2.append(getStackTrack("LiveStream-StreamTrace"));
                AVLog.w("LiveStream-StreamTrace", X1D.LIZIZ(LIZIZ2));
            }
            return z2;
        }
        return z;
    }

    public void onRtmpConncted() {
        this.mStatus.set(2);
        if (onCanEncodeStream()) {
            addTrackToEncodeStream();
        }
        this.mRtmpReConnectCounts = 0;
        this.mFirstConnect = false;
        if (isUsingOptimizedUrl()) {
            this.mOptUrlReachable = 1;
        } else {
            this.mUriReachable = 1;
        }
        reportLiveCoreInfo(2, 0, 0);
    }

    public void onRtmpSendTooSlow() {
        AVLog.d("LiveStream", "Net is too weak.");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.Observer
    public void onVideoCaptureStarted() {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture == null || liveStreamVideoCapture.status() != 1) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VideoCapture[");
            LIZ.append(this.mVideoCapturer);
            LIZ.append("] exception, status[");
            LIZ.append(this.mVideoCapturer.status());
            LIZ.append("]");
            AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
            if (this.mVideoCapturer == null) {
                AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG, video capture status exception.");
                if (AnonymousClass028.LJI(androidRuntimeException, "LiveStream.onVideoCaptureStarted")) {
                    throw androidRuntimeException;
                }
            }
        }
        RecorderManager recorderManager = this.mRecorderManager;
        if (recorderManager != null) {
            VideoSink sharedSink = recorderManager.getSharedSink();
            VideoTrack videoTrack = this.mVideoTrack;
            if (videoTrack != null && sharedSink != null) {
                videoTrack.addVideoSink(sharedSink);
            }
        }
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.24
            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$24__run$___twin___() {
                if (LiveStream.this.onCanEncodeStream()) {
                    LiveStream.this.addTrackToEncodeStream();
                }
            }

            public AnonymousClass24() {
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$24_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass24 anonymousClass24) {
                boolean LIZ2;
                try {
                    anonymousClass24.com_ss_ttlivestreamer_livestreamv2_LiveStream$24__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.25
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$25__run$___twin___() {
                    int i;
                    int videoCaptureDevice;
                    LiveStreamVideoCapture liveStreamVideoCapture2 = LiveStream.this.mVideoCapturer;
                    if (liveStreamVideoCapture2 != null) {
                        i = liveStreamVideoCapture2.getValidCaptureFps();
                    } else {
                        i = 0;
                    }
                    LiveStream liveStream = LiveStream.this;
                    LiveStreamVideoCapture liveStreamVideoCapture22 = liveStream.mVideoCapturer;
                    if (liveStreamVideoCapture22 != null) {
                        videoCaptureDevice = liveStreamVideoCapture22.getCurrentCaptureDevice();
                    } else {
                        videoCaptureDevice = liveStream.mLiveStreamBuilder.getVideoCaptureDevice();
                    }
                    liveStream.reportLiveCoreInfo(5, videoCaptureDevice, i);
                }

                public AnonymousClass25() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$25_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass25 anonymousClass25) {
                    boolean LIZ2;
                    try {
                        anonymousClass25.com_ss_ttlivestreamer_livestreamv2_LiveStream$25__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.Observer
    public void onVideoCaptureStopped() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.26
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$26_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$26__run$___twin___() {
                    int videoCaptureDevice;
                    LiveStream liveStream = LiveStream.this;
                    LiveStreamVideoCapture liveStreamVideoCapture = liveStream.mVideoCapturer;
                    if (liveStreamVideoCapture != null) {
                        videoCaptureDevice = liveStreamVideoCapture.getStoppedSource();
                    } else {
                        videoCaptureDevice = liveStream.mLiveStreamBuilder.getVideoCaptureDevice();
                    }
                    liveStream.reportLiveCoreInfo(6, videoCaptureDevice, 0);
                }

                public AnonymousClass26() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$26_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass26 anonymousClass26) {
                    boolean LIZ;
                    try {
                        anonymousClass26.com_ss_ttlivestreamer_livestreamv2_LiveStream$26__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
        this.mFirstFrameRendered = false;
        RecorderManager recorderManager = this.mRecorderManager;
        if (recorderManager != null) {
            recorderManager.setupVideoSource(null);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void pause() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new IDRunnableS6S0101000(9, this, 8), new int[]{0, 1}));
        }
    }

    public void reportInputVideoStreamLayersInfo() {
        VideoMixer videoMixer;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && (videoMixer = mediaEncodeStream.getVideoMixer()) != null) {
            videoMixer.reportLayersInfo();
        }
    }

    public void reportPushStreamResult() {
        LiveStreamLogService liveStreamLogService = this.mStreamLogService;
        if (!this.mPushStreamStart && liveStreamLogService != null) {
            liveStreamLogService.setStopPushStreamManually(1);
            liveStreamLogService.removePushStreamResultTimer();
            liveStreamLogService.reportPushStreamResult();
            liveStreamLogService.resetPushStreamResultVariable();
            this.mPushStreamStart = true;
        }
    }

    public void reportRtmpPublishSuccess() {
        long j;
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder != null) {
            j = liveStreamBuilder.getStreamPublishSuccessInterval() * 1000;
        } else {
            j = 3000;
        }
        Handler handler = this.mWorkThreadHandler;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.31
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$31_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$31__run$___twin___() {
                    if (LiveStream.this.isStreaming()) {
                        LiveStream.this.reportLiveCoreInfo(42, 0, 0);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("reportRtmpPublishSuccess, success = ");
                        LIZ.append(LiveStream.this.isStreaming());
                        AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ));
                    }
                }

                public AnonymousClass31() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$31_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass31 anonymousClass31) {
                    boolean LIZ;
                    try {
                        anonymousClass31.com_ss_ttlivestreamer_livestreamv2_LiveStream$31__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            }, j);
        }
    }

    public void resetLightWeightReconnectStatus() {
        AVLog.ioi("LWReconnect", "resetLightWeightReconnectStatus");
        this.isLWReconnectStatusError = false;
        this.isLWReconnectStatusProcess = false;
        RTMPReconnectHelper rTMPReconnectHelper = this.mRtmpReconnectHelper;
        if (rTMPReconnectHelper != null) {
            rTMPReconnectHelper.resetLightWeightReconnectParams();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void resume() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new ARunnableS17S0101000_13(6, this, 12), new int[]{1, 0}));
        }
    }

    public void rtmpReconnect() {
        if (this.mStatus.get() == 8 || this.mStatus.get() == 7) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Try to reconnect rtmp while mStatus is ");
            LIZ.append(this.mStatus.get());
            AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
            reportLiveCoreError(1, -103, new Exception("Error status call on rtmpReconnect"));
            return;
        }
        this.mStatus.set(3);
        this.mStreamLogService.onReconnect();
        int i = this.mRtmpReConnectCounts + 1;
        this.mRtmpReConnectCounts = i;
        if (!this.mAbkeyEnableProtocolDownGrade) {
            this.mProtocolDownGradeFlag = false;
        }
        reportLiveCoreInfo(15, i, 0);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Reconnect with ");
        LIZ2.append(getLiveStreamUrl());
        LIZ2.append(", current reconnect count ");
        LIZ2.append(this.mRtmpReConnectCounts);
        AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ2));
        if (this.mStatus.get() == 2 || this.mStatus.get() == 3) {
            destroyEncodeStream();
            if (!this.mLiveStreamBuilder.getInteract().enablePushStreamSwitchAfterServerMixStream) {
                updateUrlPriority();
            }
            getOptimizedUrl();
            if (this.mRtmpqDownGrade && !this.mProtocolDownGradeFlag) {
                checkProtocolDownGrade();
            }
            createEncoderStream();
            setupTransport();
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("mStatus status is ");
        LIZ3.append(this.mStatus.get());
        LIZ3.append(" on rtmpReconnect");
        AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ3));
        doStop();
    }

    public void setupTransport() {
        Transport transport;
        if (!this.mLiveStreamBuilder.isEnableVelivePusher() && (transport = this.mRTMPTransport) != null) {
            transport.setEventObserver(this);
            String liveStreamUrl = getLiveStreamUrl();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Rtmp(");
            LIZ.append(this.mRTMPTransport);
            LIZ.append(") setUrl ");
            LIZ.append(liveStreamUrl);
            AVLog.iod("LiveStream", X1D.LIZIZ(LIZ));
            this.mRTMPTransport.setupUrl(liveStreamUrl);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void startAudioCapture() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new ARunnableS10S0101000_6(2, this, 11), new int[]{1}));
        } else {
            AVLog.ioe("LiveStream", "Try to start audio capture while mStatus is STATUS_END");
        }
        IVeLivePusher iVeLivePusher = this.mVeLivePusher;
        if (iVeLivePusher != null) {
            iVeLivePusher.startAudioCapture();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void startVideoCapture() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new HZE(5, this), new int[]{0}));
        } else {
            AVLog.ioe("LiveStream", "Try to start video capture while mStatus is STATUS_END");
        }
        IVeLivePusher iVeLivePusher = this.mVeLivePusher;
        if (iVeLivePusher != null) {
            iVeLivePusher.startVideoCapture();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int status() {
        return this.mStatus.get();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void stopAudioCapture() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new ARunnableS12S0101000_8(2, this, 27), new int[]{1}));
        }
        IVeLivePusher iVeLivePusher = this.mVeLivePusher;
        if (iVeLivePusher != null) {
            iVeLivePusher.stopAudioCapture();
        }
    }

    public void stopRecorder() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.45
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$45_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$45__run$___twin___() {
                    MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
                    if (mediaEncodeStream != null) {
                        mediaEncodeStream.stopRecord();
                    }
                }

                public AnonymousClass45() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$45_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass45 anonymousClass45) {
                    boolean LIZ;
                    try {
                        anonymousClass45.com_ss_ttlivestreamer_livestreamv2_LiveStream$45__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void stopVideoCapture() {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new ARunnableS10S0101000_6(3, this, 0), new int[]{0}));
        }
        IVeLivePusher iVeLivePusher = this.mVeLivePusher;
        if (iVeLivePusher != null) {
            iVeLivePusher.stopVideoCapture();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void unregisterScreenAudioPlayBack() {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.registerScreenAudioPlayBack(null, 0, null);
        }
    }

    private void checkPushCdnJoinMicOptValid() {
        boolean z;
        DebugLogUtils.isEnableDebugLog();
        if (this.mLiveStreamBuilder.getSdkSetting().mVPassInteractCfg.interactDelayStopStream == 1) {
            JSONArray jSONArray = this.mLiveStreamBuilder.getSdkSetting().mVPassInteractCfg.interactJoinMicOptCdn;
            DebugLogUtils.isEnableDebugLog();
            if (jSONArray != null && jSONArray.length() > 0) {
                DebugLogUtils.isEnableDebugLog();
                String originUrl = getOriginUrl();
                if (!TextUtils.isEmpty(originUrl)) {
                    z = false;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            if (originUrl.contains(JSONArrayProtectorUtils.getString(jSONArray, i))) {
                                z = true;
                            }
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                } else {
                    z = false;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("checkPushCdnJoinMicOptValid matched:");
                LIZ.append(z);
                LIZ.append(" pushUrl:");
                LIZ.append(originUrl);
                AVLog.logKibana(4, "LiveStream", X1D.LIZIZ(LIZ), null);
                if (z) {
                    return;
                }
            }
            AVLog.logKibana(4, "LiveStream", "cdn not matched", null);
            getLiveStreamBuilder().getSdkSetting().mVPassInteractCfg.interactDelayStopStream = 0;
        }
    }

    public void doBackgroundPause() {
        int bgMode;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Switch to background: VideoCaptureDevice ");
        LIZ.append(getCurrentCaptureDevice(true));
        LIZ.append(", AudioCaptureDevice ");
        LIZ.append(getCurrentCaptureDevice(false));
        LIZ.append(", BgMode ");
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder == null) {
            bgMode = -1;
        } else {
            bgMode = liveStreamBuilder.getBgMode();
        }
        LIZ.append(bgMode);
        LIZ.append(", status ");
        LIZ.append(this.mStatus.get());
        LIZ.append(", VideoCaptureStatus ");
        LIZ.append(getCurrentCaptureStatus());
        String LIZIZ = X1D.LIZIZ(LIZ);
        AVLog.ioi("LiveStream", LIZIZ);
        AVLog.logKibana(5, "LiveStream", LIZIZ, null);
        this.mPaused = true;
        LiveStreamBuilder liveStreamBuilder2 = this.mLiveStreamBuilder;
        if (this.mStatus.get() == 7 || liveStreamBuilder2 == null) {
            return;
        }
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null && liveStreamVideoCapture.getBackgroundPolicy() != liveStreamBuilder2.getBgMode()) {
            initVideoCapturerPauseSetting();
        }
        if (this.mVideoCapturer != null && liveStreamBuilder2.getBgMode() != 1) {
            this.mVideoCapturer.pause();
        }
        IFilterManager iFilterManager = this.mFilterManager;
        if (iFilterManager != null) {
            iFilterManager.pauseEffect();
        }
        if (!this.mLiveStreamBuilder.isAllowMicCaptureOnBackground()) {
            AudioCapturer audioCapturer = this.mAudioCapture;
            if (audioCapturer == null || !(audioCapturer instanceof LiveStreamAudioCapture) || this.mLiveStreamBuilder.getBgMode() == 1) {
                return;
            }
            checkAudioCaptureCert(false);
            ((LiveStreamAudioCapture) this.mAudioCapture).toBackground();
            return;
        }
        AVLog.iod("LiveStream", "Allow audio capture with ignore pause");
    }

    public void doBackgroundResume() {
        int bgMode;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Switch to frontground: VideoCaptureDevice ");
        LIZ.append(getCurrentCaptureDevice(true));
        LIZ.append(", AudioCaptureDevice ");
        LIZ.append(getCurrentCaptureDevice(false));
        LIZ.append(", BgMode ");
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder == null) {
            bgMode = -1;
        } else {
            bgMode = liveStreamBuilder.getBgMode();
        }
        LIZ.append(bgMode);
        LIZ.append(", status ");
        LIZ.append(this.mStatus.get());
        LIZ.append(", VideoCaptureStatus ");
        LIZ.append(getCurrentCaptureStatus());
        String LIZIZ = X1D.LIZIZ(LIZ);
        AVLog.ioi("LiveStream", LIZIZ);
        AVLog.logKibana(5, "LiveStream", LIZIZ, null);
        this.mPaused = false;
        LiveStreamBuilder liveStreamBuilder2 = this.mLiveStreamBuilder;
        if (this.mStatus.get() == 7 || liveStreamBuilder2 == null) {
            return;
        }
        if (this.mVideoCapturer != null && liveStreamBuilder2.getBgMode() != 1) {
            this.mVideoCapturer.resume();
        }
        IFilterManager iFilterManager = this.mFilterManager;
        if (iFilterManager != null) {
            iFilterManager.resumeEffect();
        }
        if (!this.mLiveStreamBuilder.isAllowMicCaptureOnBackground()) {
            AudioCapturer audioCapturer = this.mAudioCapture;
            if (audioCapturer == null || !(audioCapturer instanceof LiveStreamAudioCapture) || this.mLiveStreamBuilder.getBgMode() == 1 || !checkAudioCaptureCert(true)) {
                return;
            }
            ((LiveStreamAudioCapture) this.mAudioCapture).toFront();
            return;
        }
        AVLog.iod("LiveStream", "Allow audio capture with ignore resume");
    }

    public void doTriggerEncoderParams() {
        setTransportBaseParams();
        setupEncodeBaseParam();
        if (this.mLiveStreamBuilder.getPushBase().needChangeModeWhenTriggetEncoder) {
            changeToKTVMode(this.mIsKaraokeMovie, this.mKaraokeMovie);
        }
    }

    private boolean isOnMicOptAndRtcPushing() {
        if (getLiveStreamBuilder().getInteract().interactDelayStopStream == 1 && this.mStartServerMixWhilePushStream) {
            return true;
        }
        return false;
    }

    private void setupParameter() {
        boolean z;
        int i;
        TEBundle tEBundle;
        String str;
        DebugLogUtils.isEnableDebugLog();
        String chooseVideoEncode = chooseVideoEncode();
        boolean isEnableVideoEncodeAccelera = this.mLiveStreamBuilder.isEnableVideoEncodeAccelera();
        int chooseProfileLevel = chooseProfileLevel();
        String chooseAudioEncode = chooseAudioEncode();
        boolean isEnableAudioEncodeAccelera = this.mLiveStreamBuilder.isEnableAudioEncodeAccelera();
        int chooseAudioProfileLevel = chooseAudioProfileLevel();
        LiveStreamLogService liveStreamLogService = this.mStreamLogService;
        if (this.mRTMPTransport != null) {
            AVLog.d("LiveStream", "Dump default rtmp config:");
            this.mTransportOpt.dump();
            this.mTransportOpt.setLong("sei_ntp_time_shift", this.mSeiCurrentShiftDiffTime);
            this.mTransportOpt.setLong("rtmp_init_audio_bitrate", this.mLiveStreamBuilder.getAudioBitrate());
            this.mTransportOpt.setLong("rtmp_init_video_bitrate", this.mLiveStreamBuilder.getVideoBitrate());
            this.mTransportOpt.setLong("rtmp_max_video_bitrate", this.mLiveStreamBuilder.getVideoMaxBitrate());
            this.mTransportOpt.setLong("rtmp_min_video_bitrate", this.mLiveStreamBuilder.getVideoMinBitrate());
            if (this.mProtocolDownGradeFlag && this.mLiveStreamBuilder.getBitrateAdaptStrategy() == 3) {
                this.mTransportOpt.setInt("rtmp_bw_est_strategy", 0);
            } else {
                this.mTransportOpt.setInt("rtmp_bw_est_strategy", this.mLiveStreamBuilder.getBitrateAdaptStrategy());
            }
            this.mTransportOpt.setString("qos_id", this.mLiveStreamBuilder.getQosId());
            this.mTransportOpt.setBool("transport_enable_new_update_send_cache_config", this.mLiveStreamBuilder.getPushBase().newSendCacheConfig);
            if (this.mLiveStreamBuilder.getLiveAuthString() != null) {
                this.mTransportOpt.setString("live_auth_string", this.mLiveStreamBuilder.getLiveAuthString());
            }
            if (this.mLiveStreamBuilder.isEnableVideoNtp()) {
                List<String> ntpServers = this.mLiveStreamBuilder.getNtpServers();
                String str2 = "";
                for (int i2 = 0; ntpServers != null && i2 < ntpServers.size(); i2++) {
                    if (!TextUtils.isEmpty((CharSequence) ListProtector.get(ntpServers, i2))) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(str2);
                        if (str2.isEmpty()) {
                            str = "";
                        } else {
                            str = "\n";
                        }
                        LIZ.append(str);
                        LIZ.append((String) ListProtector.get(ntpServers, i2));
                        str2 = X1D.LIZIZ(LIZ);
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    this.mTransportOpt.setBool("video_enable_ntp", true);
                    this.mTransportOpt.setString("ntp_servers", str2);
                }
            } else {
                this.mTransportOpt.setBool("video_enable_ntp", false);
            }
            this.mTransportOpt.setString("video_type", chooseVideoEncode);
            this.mTransportOpt.setBool("video_enable_accelera", isEnableVideoEncodeAccelera);
            this.mTransportOpt.setInt("video_width", this.mLiveStreamBuilder.getVideoWidth());
            this.mTransportOpt.setInt("video_height", this.mLiveStreamBuilder.getVideoHeight());
            this.mTransportOpt.setInt("video_profileLevel", chooseProfileLevel);
            this.mTransportOpt.setInt("video_fps", this.mLiveStreamBuilder.getVideoFps());
            this.mTransportOpt.setInt("video_cap_fps", this.mLiveStreamBuilder.getVideoCaptureFps());
            this.mTransportOpt.setInt("video_gop", getVideoGop());
            this.mTransportOpt.setString("audio_type", chooseAudioEncode);
            this.mTransportOpt.setBool("audio_enable_accelera", isEnableAudioEncodeAccelera);
            this.mTransportOpt.setInt("audio_channels", this.mLiveStreamBuilder.getAudioChannel());
            this.mTransportOpt.setInt("audio_sample", this.mLiveStreamBuilder.getAudioSampleHZ());
            this.mTransportOpt.setInt("audio_bit_width", this.mLiveStreamBuilder.getAudioBitwidth());
            this.mTransportOpt.setLong("audio_bit_rate", this.mLiveStreamBuilder.getAudioBitrate());
            this.mTransportOpt.setInt("audio_profileLevel", chooseAudioProfileLevel);
            LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
            if (liveStreamVideoCapture != null && liveStreamVideoCapture.getValidCaptureFps() != 0) {
                this.mTransportOpt.setInt("video_cap_fps", this.mVideoCapturer.getValidCaptureFps());
            }
            this.mTransportOpt.setBool("hit_node_optimize", this.mDnsOptHit);
            String rtmpTcUrl = getRtmpTcUrl();
            if (!TextUtils.isEmpty(rtmpTcUrl)) {
                this.mTransportOpt.setString("rtmp_tc_url", rtmpTcUrl);
            }
            this.mTransportOpt.setString("session_id", getStreamUniqueId());
            this.mTransportOpt.setBool("rts_enable_dtls", this.mLiveStreamBuilder.rtsEnableDtls());
            this.mTransportOpt.setInt("rtm_send_packet_protect", this.mLiveStreamBuilder.rtmSendPacketProtect());
            this.mTransportOpt.setInt("rts_http_port", this.mLiveStreamBuilder.rtsHttpPort());
            this.mTransportOpt.setString("rts_config", this.mLiveStreamBuilder.rtsConfig());
            this.mTransportOpt.setString("liveio_settings", this.mLiveStreamBuilder.liveioSettings());
            this.mTransportOpt.setBool("rtm_network_report_enable", this.mLiveStreamBuilder.rtmNetReport());
            this.mTransportOpt.setDouble("rtm_network_poor_los", this.mLiveStreamBuilder.rtmNetPoorLos());
            this.mTransportOpt.setDouble("rtm_network_bad_los", this.mLiveStreamBuilder.rtmNetBadLos());
            this.mTransportOpt.setInt("rtm_network_poor_rtt", this.mLiveStreamBuilder.rtmNetPoorRtt());
            this.mTransportOpt.setInt("rtm_network_bad_rtt", this.mLiveStreamBuilder.rtmNetBadRtt());
            this.mTransportOpt.setInt("rtm_network_poor_interval", this.mLiveStreamBuilder.rtmNetPoorInterval());
            this.mTransportOpt.setInt("rtm_network_bad_interval", this.mLiveStreamBuilder.rtmNetBadInterval());
            this.mTransportOpt.setBool("rtmp_guard_setup_uri", this.mLiveStreamBuilder.getPushBase().guardTransportSetupUri);
            try {
                updateKcpParams();
            } catch (Exception e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("update kcp params failed, error: ");
                LIZ2.append(e);
                AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ2));
            }
            try {
                updateQuicParams(liveStreamLogService);
            } catch (Exception e2) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("update quic params failed, error: ");
                LIZ3.append(e2);
                AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ3));
            }
            if (this.mLiveStreamBuilder.getBwEstBaseBWConfig() != null) {
                BwEstBaseBWConfig bwEstBaseBWConfig = this.mLiveStreamBuilder.getBwEstBaseBWConfig();
                TEBundle tEBundle2 = new TEBundle();
                tEBundle2.setInt("codetable_set_fps", this.mLiveStreamBuilder.getVideoFps());
                if (NumberInit.isDefined(Integer.valueOf(bwEstBaseBWConfig.getTransportBwEst1()))) {
                    tEBundle2.setInt("transport_bw_est_1s", bwEstBaseBWConfig.getTransportBwEst1());
                }
                if (NumberInit.isDefined(Integer.valueOf(bwEstBaseBWConfig.getTransportBwEst2()))) {
                    tEBundle2.setInt("transport_bw_est_2s", bwEstBaseBWConfig.getTransportBwEst2());
                }
                if (NumberInit.isDefined(Integer.valueOf(bwEstBaseBWConfig.getMinFrameRate()))) {
                    tEBundle2.setInt("min_frame_rate", bwEstBaseBWConfig.getMinFrameRate());
                }
                if (NumberInit.isDefined(Integer.valueOf(bwEstBaseBWConfig.getBweSampleDurLength()))) {
                    tEBundle2.setInt("bwe_sample_dur_length", bwEstBaseBWConfig.getBweSampleDurLength());
                }
                if (NumberInit.isDefined(Integer.valueOf(bwEstBaseBWConfig.getUseEwmaBandwidthEstimate()))) {
                    tEBundle2.setInt("use_ewma_bandwidth_estimate", bwEstBaseBWConfig.getUseEwmaBandwidthEstimate());
                }
                if (NumberInit.isDefined(Integer.valueOf(bwEstBaseBWConfig.getUseAdaptiveFps()))) {
                    tEBundle2.setInt("use_adaptive_fps", bwEstBaseBWConfig.getUseAdaptiveFps());
                }
                if (NumberInit.isDefined(Double.valueOf(bwEstBaseBWConfig.getTransportBwest1sFactor()))) {
                    tEBundle2.setDouble("transport_bw_est_1s_factor", bwEstBaseBWConfig.getTransportBwest1sFactor());
                }
                if (NumberInit.isDefined(Double.valueOf(bwEstBaseBWConfig.getTransportBwest3sFactor()))) {
                    tEBundle2.setDouble("transport_bw_est_3s_factor", bwEstBaseBWConfig.getTransportBwest3sFactor());
                }
                if (NumberInit.isDefined(Double.valueOf(bwEstBaseBWConfig.getDurlistRate1sFactor()))) {
                    tEBundle2.setDouble("durlist_rate_1s_factor", bwEstBaseBWConfig.getDurlistRate1sFactor());
                }
                if (NumberInit.isDefined(Double.valueOf(bwEstBaseBWConfig.getDurlistRate2sFactor()))) {
                    tEBundle2.setDouble("durlist_rate_2s_factor", bwEstBaseBWConfig.getDurlistRate2sFactor());
                }
                if (NumberInit.isDefined(Double.valueOf(bwEstBaseBWConfig.getBweFactor()))) {
                    tEBundle2.setDouble("bwe_factor", bwEstBaseBWConfig.getBweFactor());
                }
                if (NumberInit.isDefined(Integer.valueOf(bwEstBaseBWConfig.getMinAdjustStep()))) {
                    tEBundle2.setInt("min_adjust_step", bwEstBaseBWConfig.getMinAdjustStep());
                }
                if (NumberInit.isDefined(Integer.valueOf(bwEstBaseBWConfig.getBitraAdjustInterval()))) {
                    tEBundle2.setInt("bitrate_adjust_interval", bwEstBaseBWConfig.getBitraAdjustInterval());
                }
                this.mTransportOpt.setBundle("bwestBaseBwStrategy_params", tEBundle2);
                tEBundle2.release();
            }
            if (this.mLiveStreamBuilder.getRtmpCacheCfgParams() != null) {
                updateRtmpCacheCfg(this.mLiveStreamBuilder.getVideoFps());
            }
            this.mTransportOpt.setBool("rtmp_tcp_cork", this.mLiveStreamBuilder.getPushBase().enableTcpCork);
            if (this.mLiveStreamBuilder.getSandboxParams() != null) {
                SandboxParams sandboxParams = this.mLiveStreamBuilder.getSandboxParams();
                if (NumberInit.isDefined(Integer.valueOf(sandboxParams.getEnable()))) {
                    this.mTransportOpt.setInt("transport_enable_sandbox_proceed", sandboxParams.getEnable());
                }
            }
            this.mRTMPTransport.setParameter(this.mTransportOpt);
            AVLog.d("LiveStream", "Dump update rtmp config:");
            this.mTransportOpt.dump();
        }
        TEBundle tEBundle3 = this.mEncodeStreamOpt;
        if (tEBundle3 != null) {
            tEBundle3.setString("video_type", chooseVideoEncode);
            TEBundle tEBundle4 = this.mEncodeStreamOpt;
            if (isEnableVideoEncodeAccelera && this.mLiveStreamBuilder.isHWEncodeOesDirectly()) {
                z = true;
            } else {
                z = false;
            }
            tEBundle4.setBool("oes_texture_frame", z);
            this.mEncodeStreamOpt.setBool("video_enable_accelera", isEnableVideoEncodeAccelera);
            this.mEncodeStreamOpt.setInt("video_width", this.mLiveStreamBuilder.getVideoWidth());
            this.mEncodeStreamOpt.setInt("video_height", this.mLiveStreamBuilder.getVideoHeight());
            this.mEncodeStreamOpt.setInt("video_profileLevel", chooseProfileLevel);
            this.mEncodeStreamOpt.setInt("video_fps", this.mLiveStreamBuilder.getVideoFps());
            this.mEncodeStreamOpt.setLong("video_bitrate", this.mLiveStreamBuilder.getVideoBitrate());
            this.mEncodeStreamOpt.setInt("video_gop", getVideoGop());
            this.mEncodeStreamOpt.setBool("enableBFrame", this.mLiveStreamBuilder.isEnableVideoBFrame());
            this.mEncodeStreamOpt.setInt("video_enable_hard_enc_bframe", this.mLiveStreamBuilder.getPushBase().enableHardEncBFrame);
            this.mEncodeStreamOpt.setBundle("roi_settings", this.mLiveStreamBuilder.getRoiSettings());
            TEBundle tEBundle5 = this.mEncodeStreamOpt;
            if (this.mLiveStreamBuilder.getVideoBitrateMode() == 2) {
                i = 1;
            } else {
                i = 0;
            }
            tEBundle5.setInt("video_is_cbr", i);
            this.mEncodeStreamOpt.setInt("configuration_type", 1);
            this.mEncodeStreamOpt.setBool("video_no_drop_frame", this.mLiveStreamBuilder.isDropFramesDisabled());
            this.mEncodeStreamOpt.setBool("video_fix_hardware_enc_dts", this.mLiveStreamBuilder.isEnableFixHardwareEncodeDts());
            this.mEncodeStreamOpt.setInt("check_encode_fps_interval", this.mLiveStreamBuilder.getCheckEncodeFpsInterval());
            this.mEncodeStreamOpt.setInt("change_encode_fps_threshold", this.mLiveStreamBuilder.getChangeEncodeFpsThreshold());
            this.mEncodeStreamOpt.setInt("bytevc1_mosaic_issue_optimize_level", this.mLiveStreamBuilder.getByteVC1MosaicIssueOptimize());
            this.mEncodeStreamOpt.setInt("frame_rate_mode", this.mLiveStreamBuilder.getFrameRateMode());
            this.mEncodeStreamOpt.setInt("software_encoder_min_max_bitrate_adjust", this.mLiveStreamBuilder.getSoftwareEncoderMinMaxBitrateAdjust());
            this.mEncodeStreamOpt.setDouble("software_encoder_bitrate_ratio_max_to_default", this.mLiveStreamBuilder.getSoftwareEncoderBitRateRatioMaxtoDefault());
            this.mEncodeStreamOpt.setDouble("software_encoder_bitrate_ratio_min_to_default", this.mLiveStreamBuilder.getSoftwareEncoderBitRateRatioMintoDefault());
            this.mEncodeStreamOpt.setInt("video_min_bitrate", this.mLiveStreamBuilder.getVideoMinBitrate());
            this.mEncodeStreamOpt.setInt("video_max_bitrate", this.mLiveStreamBuilder.getVideoMaxBitrate());
            this.mEncodeStreamOpt.setInt("bytevc1_preset", this.mLiveStreamBuilder.getByteVC1Preset());
            this.mEncodeStreamOpt.setBool("video_encode_perf_prior", this.mLiveStreamBuilder.getPushBase().videoEncodePerfPrior);
            this.mEncodeStreamOpt.setBool("video_hw_encode_lock_optimize", this.mLiveStreamBuilder.isEncodeLockOptimize());
            if (this.mLiveStreamBuilder.getPushBase().videoEncoderStrategy != null) {
                this.mEncodeStreamOpt.setString("videoEncoderStrategy", this.mLiveStreamBuilder.getPushBase().videoEncoderStrategy.toString());
            }
            this.mEncodeStreamOpt.setString("audio_type", chooseAudioEncode);
            this.mEncodeStreamOpt.setBool("audio_enable_accelera", isEnableAudioEncodeAccelera);
            this.mEncodeStreamOpt.setInt("audio_channels", this.mLiveStreamBuilder.getAudioChannel());
            this.mEncodeStreamOpt.setInt("audio_sample", this.mLiveStreamBuilder.getAudioSampleHZ());
            this.mEncodeStreamOpt.setInt("audio_bit_width", this.mLiveStreamBuilder.getAudioBitwidth());
            this.mEncodeStreamOpt.setInt("audio_profileLevel", chooseAudioProfileLevel);
            this.mEncodeStreamOpt.setLong("audio_bit_rate", this.mLiveStreamBuilder.getAudioBitrate());
            this.mEncodeStreamOpt.setBool("estream_psnr_enable", this.mLiveStreamBuilder.isEnablePSNR());
            this.mEncodeStreamOpt.setInt("audio_db_cal_switch", this.mLiveStreamBuilder.getAudioCalDBSwitch());
            this.mEncodeStreamOpt.setBool("estream_transport_delay_enable", this.mLiveStreamBuilder.getPushBase().enableRenderStallStats);
            if (this.mLiveStreamBuilder.isEnablePSNR()) {
                setupPSNRParameter(this.mEncodeStreamOpt);
            }
            if (this.mLiveStreamBuilder.isEnableConstantTimePeriodGop()) {
                this.mEncodeStreamOpt.setBool("video_const_time_period_gop", true);
            } else if (this.mLiveStreamBuilder.getEnableMaxTimePeriodGopSec() > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                this.mEncodeStreamOpt.setDouble("video_gop_sec_max", this.mLiveStreamBuilder.getEnableMaxTimePeriodGopSec());
            }
            SITICalculator sITICalculator = this.mSITICalculator;
            if (sITICalculator != null) {
                this.mMediaEncodeStream.setSITICaculator(sITICalculator);
            }
            JSONObject jSONObject = this.mLiveStreamBuilder.getPushBase().hardwareEncodeQPCfg;
            if (this.mLiveStreamBuilder.getPushBase().enableHardwareQPSetting && jSONObject != null && (tEBundle = this.mEncodeStreamOpt) != null) {
                tEBundle.setString("video_qp_settings", jSONObject.toString());
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Dump all encodeStream config:");
            LIZ4.append(this.mEncodeStreamOpt.toString());
            AVLog.iod("LiveStream", X1D.LIZIZ(LIZ4));
            this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
            setupMixerParameter();
            setupVsyncParameter();
            setupEncodeFrameSink();
        }
    }

    public void addTrackToEncodeStream() {
        AudioTrack audioTrack;
        VideoTrack videoTrack;
        if (DebugLogUtils.isEnableDebugLog()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Start publish, See Stack:");
            LIZ.append(getStackTrack("LiveStream-StreamTrace"));
            AVLog.w("LiveStream-StreamTrace", X1D.LIZIZ(LIZ));
        }
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && (videoTrack = this.mVideoTrack) != null) {
            mediaEncodeStream.removeTrack(videoTrack);
            removeStreamsFromEncodeStream(true);
            this.mMediaEncodeStream.addTrack(this.mVideoTrack);
            this.mMediaEncodeStream.setOriginVideoTrack(this.mVideoTrack.id());
            reportLiveCoreInfo(40, 0, 0);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setOriginVideoTrack to:");
            LIZ2.append(this.mVideoTrack.id());
            LIZ2.append(",Orig Track is:");
            LIZ2.append(getOriginInputVideoStream().name());
            AVLog.iow("LiveStream-StreamTrace", X1D.LIZIZ(LIZ2));
            addStreamsToEncodeStream(true);
            this.mMediaEncodeStream.setVideoMixerDescription(this.mVideoTrack.id(), this.mOriginVideoStreamDescription);
            lambda$adaptVideoFpsForEncode$3(0, null);
        }
        MediaEncodeStream mediaEncodeStream2 = this.mMediaEncodeStream;
        if (mediaEncodeStream2 != null && (audioTrack = this.mAudioTrack) != null) {
            mediaEncodeStream2.removeTrack(audioTrack);
            removeStreamsFromEncodeStream(false);
            this.mMediaEncodeStream.addTrack(this.mAudioTrack);
            this.mMediaEncodeStream.setOriginAudioTrack(this.mAudioTrack.id());
            reportLiveCoreInfo(41, 0, 0);
            addStreamsToEncodeStream(false);
            this.mMediaEncodeStream.setAudioMixerDescription(this.mAudioTrack.id(), this.mOriginAudioStreamDescription);
            AudioCapturer audioCapturer = this.mAudioCapture;
            if (audioCapturer != null) {
                audioCapturer.resume();
            }
        }
        IAudioFilterManager iAudioFilterManager = this.mAudioFilterManager;
        if (iAudioFilterManager != null) {
            iAudioFilterManager.start();
        }
        changeToKTVMode(this.mIsKaraokeMovie, this.mKaraokeMovie);
    }

    public void doStart() {
        checkPushCdnJoinMicOptValid();
        boolean z = true;
        if (this.mStatus.get() == 8) {
            AVLog.ioe("LiveStream", "Try to start live stream while mStatus is STATUS_ERROR");
            reportLiveCoreError(1, -102, new Exception("Error status call on start"));
            return;
        }
        if (this.mStatus.get() == 3 || this.mStatus.get() == 2) {
            return;
        }
        this.mStatus.set(3);
        if (this.mPushStreamStart) {
            this.mPushStreamStart = false;
            this.mStreamLogService.reportPushStreamResultLater();
            PushStreamStallRecorder pushStreamStallRecorder = this.mPushStreamStallRecorder;
            if (pushStreamStallRecorder != null) {
                pushStreamStallRecorder.start();
            }
        }
        this.mRtmpReConnectCounts = 0;
        this.mFirstConnect = true;
        this.mUriReachable = -1;
        this.mOptUrlReachable = -1;
        NodeOptParams nodeOptParams = this.mLiveStreamBuilder.getNodeOptParams();
        if (nodeOptParams != null) {
            boolean strategyNodeOpt = nodeOptParams.getStrategyNodeOpt();
            this.mStrategyDnsOptOpen = strategyNodeOpt;
            if (strategyNodeOpt && this.mOptUrlMap == null) {
                this.mOptUrlMap = new HashMap<>();
                AVLog.ioe("LiveStream", "dostart mOptUrlMap is not null");
            }
        }
        if (this.mDns == null && !this.mStrategyDnsOptOpen) {
            z = false;
        }
        this.mDnsOptOpen = z;
        this.mDnsOptHit = false;
        this.mEvaluatorSymbol = "";
        updateUrlPriority();
        getOptimizedUrl();
        createEncoderStream();
        setupTransport();
    }

    public void doStopVideoSource() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Call stopVideoCapture. VideoCaptureDevice: ");
        LIZ.append(this.mLiveStreamBuilder.getVideoCaptureDevice());
        AVLog.logKibana(4, "LiveStream", X1D.LIZIZ(LIZ), null);
        destroyVideoTrack();
    }

    public String getDNSServerIP() {
        updateDNSServerIP();
        return this.mServerIP;
    }

    public String getLiveStreamUrl() {
        HashMap<String, String> hashMap;
        String originUrl = getOriginUrl();
        if (!TextUtils.isEmpty(originUrl) && this.mDnsOptOpen && this.mDnsOptHit && (hashMap = this.mOptUrlMap) != null && hashMap.containsKey(originUrl)) {
            String str = this.mOptUrlMap.get(originUrl);
            if (!TextUtils.isEmpty(str) && !str.equals("INVALID_URL")) {
                originUrl = str;
            }
        }
        String disPatchedUrl = getDisPatchedUrl(originUrl);
        if (!TextUtils.isEmpty(disPatchedUrl)) {
            long j = this.mUrlPriority;
            if (j != 0) {
                disPatchedUrl = UrlUtils.AddParam(disPatchedUrl, "pri", String.valueOf(j));
            }
        }
        if (!TextUtils.isEmpty(disPatchedUrl) && !TextUtils.isEmpty(getStreamUniqueId())) {
            return UrlUtils.AddParam(disPatchedUrl, "_session_id", getStreamUniqueId());
        }
        return disPatchedUrl;
    }

    public void getOptimizedUrl() {
        HashMap<String, String> hashMap;
        String originUrl = getOriginUrl();
        if (TextUtils.isEmpty(originUrl)) {
            return;
        }
        if ((this.mDns == null && !this.mStrategyDnsOptOpen) || isNodeOptDisabled(originUrl)) {
            if (this.mDns != null) {
                AVLog.iow("LiveStream", "Dns optimize disabled via vpass.");
            }
            this.mDnsOptOpen = false;
        }
        if (this.mDnsOptOpen && (hashMap = this.mOptUrlMap) != null && hashMap.containsKey(originUrl) && this.mOptUrlMap.get(originUrl).equals("INVALID_URL")) {
            this.mDnsOptOpen = false;
        }
        this.mDnsOptHit = false;
        this.mEvaluatorSymbol = "";
        if (!this.mDnsOptOpen || this.mOptUrlMap == null) {
            return;
        }
        try {
            String[] optUrlAndEvaluateSymbol = getOptUrlAndEvaluateSymbol(this.mDns, originUrl);
            if (optUrlAndEvaluateSymbol != null && optUrlAndEvaluateSymbol.length == 2 && !TextUtils.isEmpty(optUrlAndEvaluateSymbol[0])) {
                this.mOptUrlMap.put(originUrl, optUrlAndEvaluateSymbol[0]);
                this.mDnsOptHit = true;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Dns optimize hit: optimized url ");
                LIZ.append(optUrlAndEvaluateSymbol[0]);
                LIZ.append(", evaluate symbol ");
                LIZ.append(optUrlAndEvaluateSymbol[1]);
                LIZ.append("mDnsOptOpen: ");
                LIZ.append(this.mDnsOptOpen);
                LIZ.append("mDnsOptHit:");
                LIZ.append(this.mDnsOptHit);
                AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ));
                String str = optUrlAndEvaluateSymbol[1];
                this.mEvaluatorSymbol = str;
                if (!TextUtils.isEmpty(str)) {
                    return;
                }
                this.mEvaluatorSymbol = "sdk_previous_dns";
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public String getRtmpTcUrl() {
        if (isUsingOptimizedUrl()) {
            String originUrl = getOriginUrl();
            try {
                return originUrl.substring(0, originUrl.lastIndexOf(47) + 1);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public boolean isRtmPush() {
        return isRtsUrl(getOriginUrl());
    }

    public boolean isUsingOptimizedUrl() {
        HashMap<String, String> hashMap;
        String originUrl = getOriginUrl();
        StringBuilder LIZIZ = C25620zW.LIZIZ("isUsingOptimizedUrl fallback true originUrl:", originUrl, " mDnsOptOpen:");
        LIZIZ.append(this.mDnsOptOpen);
        LIZIZ.append(" mDnsOptHit:");
        LIZIZ.append(this.mDnsOptHit);
        AVLog.iow("LiveStream", X1D.LIZIZ(LIZIZ));
        if (!TextUtils.isEmpty(originUrl) && this.mDnsOptOpen && this.mDnsOptHit && (hashMap = this.mOptUrlMap) != null && hashMap.containsKey(originUrl)) {
            String str = this.mOptUrlMap.get(originUrl);
            if (!TextUtils.isEmpty(str) && !str.equals("INVALID_URL")) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("optUrl:");
                LIZ.append(str);
                LIZ.append(" isUsingOptimizeUrl return true");
                AVLog.iow("LiveStream", X1D.LIZIZ(LIZ));
                return true;
            }
            return false;
        }
        return false;
    }

    public void onReleaseSafe() {
        DebugLogUtils.isEnableDebugLog();
        AudioFrameAvailableSink audioFrameAvailableSink = this.mAudioFrameAvailableSink;
        if (audioFrameAvailableSink != null) {
            audioFrameAvailableSink.release();
            this.mAudioFrameAvailableSink = null;
        }
        TextureFrameAvailableSink textureFrameAvailableSink = this.mTextureFrameAvailableSink;
        if (textureFrameAvailableSink != null) {
            textureFrameAvailableSink.release();
            this.mTextureFrameAvailableSink = null;
        }
        IFilterManager iFilterManager = this.mFilterManager;
        if (iFilterManager != null) {
            if (iFilterManager instanceof FilterManager) {
                AudioFrameAvailableSink audioFrameAvailableSink2 = this.mAudioFrameAvailableSink;
                if (audioFrameAvailableSink2 != null) {
                    audioFrameAvailableSink2.removeListener((FilterManager) iFilterManager);
                }
                ((NativeObject) this.mFilterManager).release();
                this.mEffectInited = false;
            }
            this.mFilterManager = null;
        }
        MediaEngineFactory mediaEngineFactory = this.mMediaEngineFactory;
        if (mediaEngineFactory != null) {
            mediaEngineFactory.release();
            this.mMediaEngineFactory = null;
        }
        IAudioFilterManager iAudioFilterManager = this.mAudioFilterManager;
        if (iAudioFilterManager != null) {
            iAudioFilterManager.release();
            this.mAudioFilterManager = null;
        }
        this.mStatus.set(7);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void requestKeyFrame() {
        if (C16880lQ.LLLLIIIILLL() != this.mWorkThreadHandler.getLooper().getThread()) {
            this.mWorkThreadHandler.post(new IDRunnableS6S0101000(12, this, 14));
            return;
        }
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            mediaEncodeStream.requestIDRFrame();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void stop() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop,status:");
        LIZ.append(this.mStatus.get());
        AVLog.logKibana(4, "LiveStream", X1D.LIZIZ(LIZ), null);
        if (this.mStatus.get() != 7) {
            if (this.mEnableAbortRequest) {
                abortRequest();
            }
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.13
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$13__run$___twin___() {
                    LiveStream liveStream = LiveStream.this;
                    liveStream.mEnalbeReconnect = false;
                    liveStream.reportPushStreamResult();
                    PushStreamStallRecorder pushStreamStallRecorder = LiveStream.this.mPushStreamStallRecorder;
                    if (pushStreamStallRecorder != null) {
                        pushStreamStallRecorder.stop();
                    }
                    LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
                    if (liveStreamLogService != null) {
                        liveStreamLogService.stopPeriodReport();
                    }
                    LiveStream.this.doStop();
                }

                public AnonymousClass13() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$13_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass13 anonymousClass13) {
                    boolean LIZ2;
                    try {
                        anonymousClass13.com_ss_ttlivestreamer_livestreamv2_LiveStream$13__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
        IVeLivePusher iVeLivePusher = this.mVeLivePusher;
        if (iVeLivePusher != null) {
            iVeLivePusher.stopEncodeAndPublish();
        }
    }

    public void updateDNSServerIP() {
        Handler handler;
        if (SystemClock.elapsedRealtime() - mServerIPTime >= LivePreviewNetworkSpeedThresholdSetting.DEFAULT && (handler = this.mMiscThreadHandler) != null) {
            handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.53
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$53_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$53__run$___twin___() {
                    try {
                        InetAddress byName = InetAddress.getByName("whoami.akamai.net");
                        if (byName != null) {
                            LiveStream.this.mServerIP = byName.getHostAddress();
                            LiveStream.mServerIPTime = SystemClock.elapsedRealtime();
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("update dns server ip:");
                            LIZ.append(LiveStream.this.mServerIP);
                            AVLog.iod("LiveStream", X1D.LIZIZ(LIZ));
                        }
                    } catch (UnknownHostException unused) {
                    }
                }

                public AnonymousClass53() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$53_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass53 anonymousClass53) {
                    boolean LIZ;
                    try {
                        anonymousClass53.com_ss_ttlivestreamer_livestreamv2_LiveStream$53__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public void updateUrlPriority() {
        this.mUrlPriority = System.currentTimeMillis();
    }

    /* loaded from: classes12.dex */
    public static class NodeListenerImpl implements InterfaceC63814P2s {
        public long mBeginWaitStrategyTime;
        public CountDownLatch mCountDownLatch;
        public long mEndWaitStrategyTime;
        public WeakReference<InterfaceC63814P2s> mNodeListener;
        public boolean mStrategyTimeout;
        public long mWaitStrategyCallbackMs;

        public void beforeNodeOptimize() {
            this.mStrategyTimeout = false;
            this.mCountDownLatch = new CountDownLatch(1);
            long currentTimeMillis = System.currentTimeMillis();
            this.mBeginWaitStrategyTime = currentTimeMillis;
            this.mEndWaitStrategyTime = currentTimeMillis - 1;
        }

        public long getWaitStrategyCallbackMs() {
            return this.mWaitStrategyCallbackMs;
        }

        public NodeListenerImpl(final LiveStream liveStream) {
            this.mCountDownLatch = new CountDownLatch(1);
            this.mBeginWaitStrategyTime = 0L;
            this.mEndWaitStrategyTime = 0L;
            this.mWaitStrategyCallbackMs = 0L;
            this.mStrategyTimeout = false;
            liveStream.mNodeListenerInternal = new InterfaceC63814P2s() { // from class: X.P2j
                @Override // X.InterfaceC63814P2s
                public final void onMessage(JSONObject jSONObject) {
                    LiveStream.NodeListenerImpl.this.lambda$new$0(liveStream, jSONObject);
                }
            };
            this.mNodeListener = new WeakReference<>(liveStream.mNodeListenerInternal);
        }

        @Override // X.InterfaceC63814P2s
        public void onMessage(JSONObject jSONObject) {
            InterfaceC63814P2s interfaceC63814P2s = this.mNodeListener.get();
            if (interfaceC63814P2s != null) {
                interfaceC63814P2s.onMessage(jSONObject);
            }
        }

        public void waitForNodeOptimizeResult(int i) {
            try {
                this.mCountDownLatch.await(i + 100, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                C16880lQ.LLLLIIL(e);
            }
            synchronized (this) {
                this.mStrategyTimeout = true;
                this.mWaitStrategyCallbackMs = this.mEndWaitStrategyTime - this.mBeginWaitStrategyTime;
            }
        }

        public /* synthetic */ NodeListenerImpl(LiveStream liveStream, AnonymousClass1 anonymousClass1) {
            this(liveStream);
        }

        public /* synthetic */ void lambda$new$0(LiveStream liveStream, JSONObject jSONObject) {
            synchronized (this) {
                if (!this.mStrategyTimeout) {
                    this.mEndWaitStrategyTime = System.currentTimeMillis();
                    liveStream.mStrategynodeOptimizerInfos = jSONObject;
                    CountDownLatch countDownLatch = this.mCountDownLatch;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            }
        }
    }

    /* loaded from: classes12.dex */
    public class SharedEncoderRecorder implements IRecorderManager {
        public IRecorderManager.Config mConfig;
        public String mFile;
        public IRecorderManager.IRecorderListener mIRecorderListener;
        public WeakReference<LiveStream> mLiveStreamWeak;

        @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
        public void addAudioTrack(AudioTrack audioTrack) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
        public Canvas lock(Rect rect) {
            return null;
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
        public void release() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
        public void removeAudioTrack(AudioTrack audioTrack) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
        public void setupAudioSource(AudioCapturer audioCapturer) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
        public void setupVideoSource(VideoCapturer videoCapturer) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
        public void stop() {
            if (this.mLiveStreamWeak.get() != null) {
                this.mLiveStreamWeak.get().stopRecorder();
            } else {
                onEvent(11, 0, 0L, "stream publish no start.");
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
        public void unlockAndPost(Canvas canvas) {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
        public IRecorderManager.Config getConfig() {
            return this.mConfig;
        }

        public SharedEncoderRecorder(WeakReference<LiveStream> weakReference) {
            this.mLiveStreamWeak = weakReference;
        }

        public void onEvent(int i, int i2, long j, String str) {
            IRecorderManager.IRecorderListener iRecorderListener = this.mIRecorderListener;
            if (iRecorderListener == null) {
                return;
            }
            switch (i) {
                case 9:
                    iRecorderListener.onRecorderStarted();
                    return;
                case 10:
                    if (!new File(this.mFile).canRead()) {
                        IRecorderManager.IRecorderListener iRecorderListener2 = this.mIRecorderListener;
                        StringBuilder LIZJ = C06460Ne.LIZJ("Unknown record error event(", i, ",", i2, ",");
                        C65232Piu.LIZLLL(LIZJ, j, ",", str);
                        LIZJ.append(")");
                        iRecorderListener2.onRecorderError(i2, new Exception(X1D.LIZIZ(LIZJ)));
                        return;
                    }
                    this.mIRecorderListener.onRecorderStoped(this.mFile);
                    return;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    iRecorderListener.onRecorderError(i2, new Exception(str));
                    return;
                default:
                    return;
            }
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.recorder.IRecorderManager
        public void start(String str, IRecorderManager.IRecorderListener iRecorderListener, IRecorderManager.Config config, int i) {
            this.mFile = str;
            this.mIRecorderListener = iRecorderListener;
            this.mConfig = config;
            if (this.mLiveStreamWeak.get() != null) {
                this.mLiveStreamWeak.get().startRecorder(this.mFile);
            }
        }
    }

    public String getAudioEncoderInfo() {
        return this.mAudioEncoderInfo;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IAudioFilterManager getAudioFilterMgr() {
        return this.mAudioFilterManager;
    }

    public long getCreateEncodeCount() {
        return this.mCreateEncodeCount;
    }

    public String getEvaluatorSymbol() {
        return this.mEvaluatorSymbol;
    }

    public FpsLevelStrategy getFpsLevelStrategy() {
        return this.mFpsLevelStrategy;
    }

    public int[] getLiveStreamBitrateSave() {
        return this.mLiveBitrateSave;
    }

    public LiveStreamBuilder getLiveStreamBuilder() {
        return this.mLiveStreamBuilder;
    }

    public LiveStreamEventTracker getLiveStreamEventTracker() {
        return this.mLiveStreamEventTracker;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputAudioStream getOriginInputAudioStream() {
        return this.mOrigInputAudioStream;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputVideoStream getOriginInputVideoStream() {
        return this.mOriginInputVideoStream;
    }

    public HashMap<String, List<String>> getPreparedList() {
        return this.mPreparedIpList;
    }

    public boolean getPushStreamStart() {
        return this.mPushStreamStart;
    }

    public boolean getQuicDownGradeFlag() {
        return this.mProtocolDownGradeFlag;
    }

    public int getQuicDownGradeType() {
        return this.mProtocolDownGradeType;
    }

    public int getQuicFlag() {
        return this.mQuicFlag;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IRecorderManager getRecorderMgr() {
        return this.mRecorderManager;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public boolean getStartServerMixWhilePushStream() {
        return this.mStartServerMixWhilePushStream;
    }

    public JSONObject getStrategynodeOptimizerInfos() {
        return this.mStrategynodeOptimizerInfos;
    }

    public String getVideoEncoderInfo() {
        return this.mVideoEncoderInfo;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IFilterManager getVideoFilterMgr() {
        return this.mFilterManager;
    }

    public long getVideoMetaBitRate() {
        return this.mAdjustBitrate;
    }

    public boolean isDnsOptHit() {
        return this.mDnsOptHit;
    }

    public boolean isDnsOptOpen() {
        return this.mDnsOptOpen;
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$10 */
    /* loaded from: classes12.dex */
    public class AnonymousClass10 extends VideoSink {
        public final /* synthetic */ boolean val$dumpEncodeFrames;
        public final /* synthetic */ JSONObject val$dumpParams;
        public final /* synthetic */ JSONObject val$vqscoreParams;

        @Override // com.ss.ttlivestreamer.core.engine.VideoSink
        public void OnDiscardedFrame() {
        }

        @Override // com.ss.ttlivestreamer.core.engine.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            VideoFrame.I420Buffer i420;
            boolean z;
            if (LiveStream.this.mStatus.get() == 7 || LiveStream.this.mStatus.get() == 8) {
                return;
            }
            VideoFrame.Buffer buffer = videoFrame.getBuffer();
            int width = buffer.getWidth();
            int height = buffer.getHeight();
            if (r2) {
                LiveStream liveStream = LiveStream.this;
                if (liveStream.mEncodeFrameDumper == null) {
                    liveStream.mEncodeFrameDumper = new VideoDumpProxy.RawVideoDumperProxy(r3, "dumpEncodeFrames");
                }
            }
            VideoDumpProxy.RawVideoDumperProxy rawVideoDumperProxy = LiveStream.this.mEncodeFrameDumper;
            if (rawVideoDumperProxy != null && rawVideoDumperProxy.checkFrameCount()) {
                int videoFps = LiveStream.this.mLiveStreamBuilder.getVideoFps();
                if (buffer.isTexture()) {
                    VideoFrame.TextureBuffer textureBuffer = (VideoFrame.TextureBuffer) buffer;
                    int textureId = textureBuffer.getTextureId();
                    if (textureBuffer.getType() == VideoFrame.TextureBuffer.Type.OES) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LiveStream.this.mEncodeFrameDumper.onTextureFrame(textureId, z, width, height, videoFps, null, "EncodeFrames");
                } else {
                    if (buffer instanceof VideoFrame.I420Buffer) {
                        i420 = (VideoFrame.I420Buffer) buffer;
                    } else {
                        i420 = buffer.toI420();
                    }
                    LiveStream.this.mEncodeFrameDumper.onYuvFrame(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), width, height, videoFps, "EncodeFrames");
                }
            }
            if (r4 == null || !buffer.isTexture()) {
                return;
            }
            IFilterManager iFilterManager = LiveStream.this.mFilterManager;
            if (!(iFilterManager instanceof FilterManager)) {
                return;
            }
            BmfVQScoreFilter vQScoreFilter = ((FilterManager) iFilterManager).getVQScoreFilter();
            VideoFrame.TextureBuffer textureBuffer2 = (VideoFrame.TextureBuffer) buffer;
            if (vQScoreFilter == null) {
                return;
            }
            vQScoreFilter.process(textureBuffer2.getTextureId(), width, height);
        }

        public AnonymousClass10(boolean z, JSONObject dumpFrameParams2, JSONObject jSONObject2) {
            r2 = z;
            r3 = dumpFrameParams2;
            r4 = jSONObject2;
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$3 */
    /* loaded from: classes12.dex */
    public class AnonymousClass3 implements RTMPReconnectHelper.Listener {
        public AnonymousClass3() {
        }

        @Override // com.ss.ttlivestreamer.core.transport.RTMPReconnectHelper.Listener
        public void onMessage(int i, int i2, long j, String str) {
            LiveStream.this.onRtmpReconnectNotify(i, i2, j, str);
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$38 */
    /* loaded from: classes12.dex */
    public class AnonymousClass38 implements InputAudioStream.Observer {

        /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$38$1 */
        /* loaded from: classes12.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ InputAudioStream val$stream;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1__run$___twin___() {
                MediaEncodeStream mediaEncodeStream;
                AudioTrack audioTrack = r2.getAudioTrack();
                if (audioTrack != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                    mediaEncodeStream.removeTrack(audioTrack);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass1(InputAudioStream inputAudioStream) {
                r2 = inputAudioStream;
            }
        }

        /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$38$2 */
        /* loaded from: classes12.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ InputAudioStream val$stream;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2__run$___twin___() {
                MediaEncodeStream mediaEncodeStream;
                InputAudioStream inputAudioStream = r2;
                if (inputAudioStream != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                    mediaEncodeStream.setAudioMixerDescription(inputAudioStream.name(), r2.getMixerDescription());
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass2(InputAudioStream inputAudioStream) {
                r2 = inputAudioStream;
            }
        }

        public AnonymousClass38() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.InputAudioStream.Observer
        public void releaseInputStream(InputAudioStream inputAudioStream) {
            synchronized (LiveStream.this.mInputStreamListFence) {
                LiveStream.this.mInputAudioStreams.remove(inputAudioStream);
            }
            ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.38.1
                public final /* synthetic */ InputAudioStream val$stream;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1__run$___twin___() {
                    MediaEncodeStream mediaEncodeStream;
                    AudioTrack audioTrack = r2.getAudioTrack();
                    if (audioTrack != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                        mediaEncodeStream.removeTrack(audioTrack);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass1(InputAudioStream inputAudioStream2) {
                    r2 = inputAudioStream2;
                }
            });
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.InputAudioStream.Observer
        public void updateVolume(InputAudioStream inputAudioStream) {
            LiveStream.this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.38.2
                public final /* synthetic */ InputAudioStream val$stream;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2__run$___twin___() {
                    MediaEncodeStream mediaEncodeStream;
                    InputAudioStream inputAudioStream2 = r2;
                    if (inputAudioStream2 != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                        mediaEncodeStream.setAudioMixerDescription(inputAudioStream2.name(), r2.getMixerDescription());
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass2(InputAudioStream inputAudioStream2) {
                    r2 = inputAudioStream2;
                }
            });
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$4 */
    /* loaded from: classes12.dex */
    public class AnonymousClass4 implements PushStreamStallRecorder.Listener {
        public AnonymousClass4() {
        }

        @Override // com.ss.ttlivestreamer.core.transport.PushStreamStallRecorder.Listener
        public void onMessage(int i, int i2, long j, String str) {
            LiveStream.this.onTransportEvent(i, i2, j, str);
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$40 */
    /* loaded from: classes12.dex */
    public class AnonymousClass40 implements InputVideoStream.Observer {

        /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$40$1 */
        /* loaded from: classes12.dex */
        public class AnonymousClass1 implements Runnable {
            public final /* synthetic */ VideoMixer.VideoMixerDescription val$description;
            public final /* synthetic */ InputVideoStream val$stream;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1__run$___twin___() {
                MediaEncodeStream mediaEncodeStream;
                if (r2.getVideoTrack() != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                    mediaEncodeStream.setVideoMixerDescription(r2.name(), r3);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ;
                try {
                    anonymousClass1.com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass1(InputVideoStream inputVideoStream, VideoMixer.VideoMixerDescription videoMixerDescription) {
                r2 = inputVideoStream;
                r3 = videoMixerDescription;
            }
        }

        /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$40$2 */
        /* loaded from: classes12.dex */
        public class AnonymousClass2 implements Runnable {
            public final /* synthetic */ InputVideoStream val$stream;
            public final /* synthetic */ boolean val$unReleaseInInputStream;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2__run$___twin___() {
                MediaEncodeStream mediaEncodeStream;
                VideoTrack videoTrack = r2.getVideoTrack();
                if (videoTrack != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                    mediaEncodeStream.removeTrack(videoTrack);
                    if (r3) {
                        videoTrack.release();
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                boolean LIZ;
                try {
                    anonymousClass2.com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass2(InputVideoStream inputVideoStream, boolean z) {
                r2 = inputVideoStream;
                r3 = z;
            }
        }

        public AnonymousClass40() {
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.InputVideoStream.Observer
        public void releaseInputStream(InputVideoStream inputVideoStream) {
            synchronized (LiveStream.this.mInputStreamListFence) {
                LiveStream.this.mInputVideoStreams.remove(inputVideoStream);
            }
            ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.40.2
                public final /* synthetic */ InputVideoStream val$stream;
                public final /* synthetic */ boolean val$unReleaseInInputStream;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2__run$___twin___() {
                    MediaEncodeStream mediaEncodeStream;
                    VideoTrack videoTrack = r2.getVideoTrack();
                    if (videoTrack != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                        mediaEncodeStream.removeTrack(videoTrack);
                        if (r3) {
                            videoTrack.release();
                        }
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass2(InputVideoStream inputVideoStream2, boolean z) {
                    r2 = inputVideoStream2;
                    r3 = z;
                }
            });
        }

        @Override // com.ss.ttlivestreamer.livestreamv2.InputVideoStream.Observer
        public void onMixerDescriptionChange(InputVideoStream inputVideoStream, VideoMixer.VideoMixerDescription videoMixerDescription) {
            ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.40.1
                public final /* synthetic */ VideoMixer.VideoMixerDescription val$description;
                public final /* synthetic */ InputVideoStream val$stream;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1__run$___twin___() {
                    MediaEncodeStream mediaEncodeStream;
                    if (r2.getVideoTrack() != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                        mediaEncodeStream.setVideoMixerDescription(r2.name(), r3);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass1(InputVideoStream inputVideoStream2, VideoMixer.VideoMixerDescription videoMixerDescription2) {
                    r2 = inputVideoStream2;
                    r3 = videoMixerDescription2;
                }
            });
        }
    }

    /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$9 */
    /* loaded from: classes12.dex */
    public class AnonymousClass9 implements VsyncModule.Observer {
        public AnonymousClass9() {
        }

        @Override // com.ss.ttlivestreamer.core.engine.VsyncModule.Observer
        public void onEvent(int i, int i2, long j, String str) {
            VsyncModule vsyncModule2;
            MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
            if (mediaEncodeStream != null && (vsyncModule2 = mediaEncodeStream.getVsyncModule()) != null) {
                LiveStream.this.vsyncEvent(vsyncModule2, i, i2, j, str);
            }
        }
    }

    /* loaded from: classes12.dex */
    public static class AudioRecordingCallback extends AudioManager.AudioRecordingCallback {
        public final WeakReference<LiveStreamLogService> mStreamLogService;

        public AudioRecordingCallback(LiveStreamLogService liveStreamLogService) {
            this.mStreamLogService = new WeakReference<>(liveStreamLogService);
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            LiveStreamLogService liveStreamLogService;
            super.onRecordingConfigChanged(list);
            if (list.size() > 0) {
                AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) ListProtector.get(list, 0);
                if (Build.VERSION.SDK_INT >= 29 && (liveStreamLogService = this.mStreamLogService.get()) != null && audioRecordingConfiguration != null) {
                    liveStreamLogService.onSessionInterrupt(audioRecordingConfiguration.isClientSilenced());
                }
            }
        }
    }

    /* loaded from: classes12.dex */
    public class ResolutionLevel {
        public ResolutionLevel() {
        }
    }

    public LiveStream(LiveStreamBuilder liveStreamBuilder) {
        this(liveStreamBuilder, null, null);
    }

    private void addStreamsToEncodeStream(boolean z) {
        AudioTrack audioTrack;
        VideoTrack videoTrack;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream == null) {
            return;
        }
        if (z) {
            synchronized (this.mInputStreamListFence) {
                Iterator<IInputVideoStream> it = this.mInputVideoStreams.iterator();
                while (it.hasNext()) {
                    IInputVideoStream next = it.next();
                    if ((next instanceof InputVideoStream) && (videoTrack = ((InputVideoStream) next).getVideoTrack()) != null) {
                        mediaEncodeStream.addTrack(videoTrack);
                        mediaEncodeStream.setVideoMixerDescription(next.name(), next.getMixerDescription());
                    }
                }
            }
            return;
        }
        synchronized (this.mInputStreamListFence) {
            Iterator<IInputAudioStream> it2 = this.mInputAudioStreams.iterator();
            while (it2.hasNext()) {
                IInputAudioStream next2 = it2.next();
                if ((next2 instanceof InputAudioStream) && (audioTrack = ((InputAudioStream) next2).getAudioTrack()) != null) {
                    mediaEncodeStream.addTrack(audioTrack);
                    mediaEncodeStream.setAudioMixerDescription(next2.name(), next2.getMixerDescription());
                }
            }
        }
    }

    private void adjustParameters(LiveStreamBuilder liveStreamBuilder) {
        int videoMaxBitrate = liveStreamBuilder.getVideoMaxBitrate();
        int videoMinBitrate = liveStreamBuilder.getVideoMinBitrate();
        int videoBitrate = liveStreamBuilder.getVideoBitrate();
        if (videoMaxBitrate < videoBitrate) {
            videoMaxBitrate = (videoBitrate * 5) / 3;
        }
        if (videoMinBitrate < 1 || videoMinBitrate > videoBitrate) {
            videoMinBitrate = (videoBitrate * 2) / 5;
        }
        int bitrateAdjustSwitch = liveStreamBuilder.getBitrateAdjustSwitch();
        if (liveStreamBuilder.getSetInitBitrateToMax() > 0) {
            videoBitrate = videoMaxBitrate;
        }
        if (bitrateAdjustSwitch > 0) {
            videoMinBitrate = videoMaxBitrate;
            videoBitrate = videoMaxBitrate;
        }
        this.mLiveStreamBuilder.setVideoMaxBitrate(videoMaxBitrate);
        this.mLiveStreamBuilder.setVideoMinBitrate(videoMinBitrate);
        this.mLiveStreamBuilder.setVideoBitrate(videoBitrate);
        int[] iArr = this.mLiveBitrateSave;
        iArr[0] = videoBitrate;
        iArr[1] = videoMinBitrate;
        iArr[2] = videoMaxBitrate;
        getVideoGop();
        int videoWidth = liveStreamBuilder.getVideoWidth();
        int videoHeight = liveStreamBuilder.getVideoHeight();
        int align = align(videoWidth);
        int align2 = align(videoHeight);
        this.mLiveStreamBuilder.setVideoWidth(align);
        this.mLiveStreamBuilder.setVideoHeight(align2);
        this.mAdjustBitrate = this.mLiveStreamBuilder.getVideoBitrate();
        int vsyncModuleMaxIntevalOnNowMs = this.mLiveStreamBuilder.getVsyncModuleMaxIntevalOnNowMs();
        if (this.mLiveStreamBuilder.getVsyncModuleMaxIntevalOnFrameMs() < 300) {
            this.mLiveStreamBuilder.setVsyncModuleMaxIntevalOnFrameMs(300);
        }
        if (vsyncModuleMaxIntevalOnNowMs < 300) {
            this.mLiveStreamBuilder.setVsyncModuleMaxIntevalOnNowMs(300);
        }
        int captureAdaptedWidth = this.mLiveStreamBuilder.getCaptureAdaptedWidth();
        if (this.mLiveStreamBuilder.getCaptureAdaptedHeight() < 1 || captureAdaptedWidth < 1) {
            int videoHeight2 = this.mLiveStreamBuilder.getVideoHeight();
            this.mLiveStreamBuilder.setCaptureAdaptedWidth(this.mLiveStreamBuilder.getVideoWidth());
            this.mLiveStreamBuilder.setCaptureAdaptedHeight(videoHeight2);
        }
    }

    private int align(int i) {
        int i2;
        if (this.mLiveStreamBuilder.isAlignTo16()) {
            i2 = 16;
        } else {
            i2 = 2;
        }
        return (((i + i2) - 1) / i2) * i2;
    }

    private boolean checkAudioCaptureCert(boolean z) {
        return checkAudioCaptureCert(this.mLiveStreamBuilder.getAudioCaptureDevice(), z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void checkBitrateFrameRateForUpdate(com.ss.ttlivestreamer.core.utils.TEBundle r13) {
        /*
            r12 = this;
            java.lang.String r1 = "from"
            boolean r0 = r13.contains(r1)
            if (r0 == 0) goto Ld8
            java.lang.String r8 = r13.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto Ld8
        L12:
            java.lang.String r2 = "width"
            boolean r0 = r13.contains(r2)
            r11 = 0
            r10 = 1
            if (r0 == 0) goto Ld5
            java.lang.String r1 = "height"
            boolean r0 = r13.contains(r1)
            if (r0 == 0) goto Ld5
            int r2 = r13.getInt(r2)
            int r1 = r13.getInt(r1)
            com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder r0 = r12.mLiveStreamBuilder
            int r0 = r0.getVideoWidth()
            if (r2 != r0) goto L3d
            com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder r0 = r12.mLiveStreamBuilder
            int r0 = r0.getVideoHeight()
            if (r1 == r0) goto Ld5
        L3d:
            r3 = 1
        L3e:
            java.lang.String r6 = "defaultBitrate"
            boolean r0 = r13.contains(r6)
            java.lang.String r4 = "maxBitrate"
            java.lang.String r5 = "minBitrate"
            if (r0 == 0) goto Ld3
            boolean r0 = r13.contains(r5)
            if (r0 == 0) goto Ld3
            boolean r0 = r13.contains(r4)
            if (r0 == 0) goto Ld3
            com.ss.ttlivestreamer.livestreamv2.LiveStreamBpsFpsUpdater r7 = r12.mBpsFpsUpdater
            int r2 = r13.getInt(r6)
            int r1 = r13.getInt(r5)
            int r0 = r13.getInt(r4)
            r7.calculateBitrateRange(r2, r1, r0, r8)
            r1 = 1
        L68:
            java.lang.String r9 = "bitrateRatio"
            boolean r0 = r13.contains(r9)
            if (r0 == 0) goto L7e
            com.ss.ttlivestreamer.livestreamv2.LiveStreamBpsFpsUpdater r7 = r12.mBpsFpsUpdater
            double r0 = r13.getDouble(r9)
            float r2 = (float) r0
            r7.calculateBitrateRatio(r2, r8)
            r13.remove(r9)
            r1 = 1
        L7e:
            java.lang.String r2 = "fps"
            boolean r0 = r13.contains(r2)
            if (r0 == 0) goto L90
            com.ss.ttlivestreamer.livestreamv2.LiveStreamBpsFpsUpdater r1 = r12.mBpsFpsUpdater
            int r0 = r13.getInt(r2)
            r1.calculateFrameRate(r0, r8)
            r1 = 1
        L90:
            boolean r0 = r12.updateSITIConfig(r13, r3)
            if (r0 != 0) goto L98
            if (r1 == 0) goto Lc9
        L98:
            com.ss.ttlivestreamer.livestreamv2.LiveStreamBpsFpsUpdater r0 = r12.mBpsFpsUpdater
            int[] r1 = r0.getBitrateRangeForUpdate()
            if (r1 == 0) goto Lc9
            r0 = r1[r11]
            r13.setInt(r6, r0)
            r0 = r1[r10]
            r13.setInt(r5, r0)
            r0 = 2
            r0 = r1[r0]
            r13.setInt(r4, r0)
        Lb0:
            com.ss.ttlivestreamer.livestreamv2.LiveStreamBpsFpsUpdater r0 = r12.mBpsFpsUpdater
            int r1 = r0.getFpsForUpdate()
            if (r1 <= 0) goto Lc5
            r13.setInt(r2, r1)
        Lbb:
            if (r3 == 0) goto Lc4
            com.ss.ttlivestreamer.livestreamv2.strategy.FpsLevelStrategy r0 = r12.mFpsLevelStrategy
            if (r0 == 0) goto Lc4
            r0.updateFpsUpperLimit(r1)
        Lc4:
            return
        Lc5:
            r13.remove(r2)
            goto Lbb
        Lc9:
            r13.remove(r6)
            r13.remove(r5)
            r13.remove(r4)
            goto Lb0
        Ld3:
            r1 = 0
            goto L68
        Ld5:
            r3 = 0
            goto L3e
        Ld8:
            java.lang.String r8 = "user"
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.LiveStream.checkBitrateFrameRateForUpdate(com.ss.ttlivestreamer.core.utils.TEBundle):void");
    }

    private boolean enableUrlFallBack(int i) {
        if (this.mEnableUrlFallBack || i == 10) {
            return true;
        }
        return false;
    }

    private int getCurrentCaptureDevice(boolean z) {
        if (z) {
            LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
            if (liveStreamVideoCapture == null) {
                return 0;
            }
            return liveStreamVideoCapture.getCurrentCaptureDevice();
        }
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer == null) {
            return 0;
        }
        if (audioCapturer instanceof LiveStreamAudioCapture) {
            return ((LiveStreamAudioCapture) audioCapturer).getCurrentCaptureDevice();
        }
        if (audioCapturer instanceof AudioCapturerOpensles) {
            return 2;
        }
        if (!(audioCapturer instanceof AudioCapturerAudioRecord)) {
            return 0;
        }
        return 1;
    }

    private String getDisPatchedUrl(String str) {
        LiveStreamBuilder liveStreamBuilder = getLiveStreamBuilder();
        if (liveStreamBuilder == null || isRtsUrl(str)) {
            return str;
        }
        String pushUrlPrefix = liveStreamBuilder.getPushUrlPrefix();
        int rtmpPort = liveStreamBuilder.getRtmpPort();
        if (pushUrlPrefix.length() <= 0 || rtmpPort <= 0) {
            return str;
        }
        String urlPrefixAndPort = setUrlPrefixAndPort(pushUrlPrefix, rtmpPort, str);
        if (this.mProtocolDownGradeFlag || !tryLoadQuicLibrary(urlPrefixAndPort)) {
            return str;
        }
        return urlPrefixAndPort;
    }

    private String getStackTrack(String str) {
        String str2 = "\n";
        for (StackTraceElement stackTraceElement : C16880lQ.LLLLIIIILLL().getStackTrace()) {
            StringBuilder LIZIZ = C25620zW.LIZIZ(str2, str, "    at ");
            LIZIZ.append(stackTraceElement.getClassName());
            LIZIZ.append(".");
            LIZIZ.append(stackTraceElement.getMethodName());
            LIZIZ.append("(");
            LIZIZ.append(stackTraceElement.getFileName());
            LIZIZ.append(" :");
            LIZIZ.append(stackTraceElement.getLineNumber());
            LIZIZ.append(")\n");
            str2 = X1D.LIZIZ(LIZIZ);
        }
        return str2;
    }

    private void initBmfVideoFilters(FilterManager filterManager) {
        boolean z;
        boolean z2;
        boolean z3;
        JSONObject jSONObject = this.mLiveStreamBuilder.getSdkSetting().mPushBase.autoBrightParams;
        boolean z4 = true;
        if ((this.mLiveStreamBuilder.getSdkSetting().mPushBase.videoAlgorithm & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (jSONObject != null && z) {
            filterManager.lambda$initAutoBrightenFilter$4(this.mLiveStreamBuilder.getContext(), jSONObject, new C56212In(this));
        }
        JSONObject jSONObject2 = this.mLiveStreamBuilder.getSdkSetting().mPushBase.noiseEvaluateParams;
        LiveStreamBuilder.AppInfo appInfo = this.mLiveStreamBuilder.getAppInfo();
        if ((this.mLiveStreamBuilder.getSdkSetting().mPushBase.videoAlgorithm & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (jSONObject2 != null && appInfo != null && z2) {
            try {
                JSONObject jSONObject3 = new JSONObject(jSONObject2.toString());
                JSONObject optJSONObject = jSONObject3.optJSONObject("modelDownloadParams");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                optJSONObject.put("appID", appInfo.getAppID());
                optJSONObject.put("appVersion", appInfo.getAppVersion());
                optJSONObject.put("deviceId", appInfo.getDeviceId());
                if (optJSONObject.isNull("status")) {
                    optJSONObject.put("status", "1");
                }
                jSONObject3.put("modelDownloadParams", optJSONObject);
                filterManager.lambda$initNoiseEvaluateFilter$5(this.mLiveStreamBuilder.getContext(), jSONObject3, this.mMiscThreadHandler);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        JSONObject jSONObject4 = this.mLiveStreamBuilder.getSdkSetting().mPushBase.vqScoreParams;
        if ((this.mLiveStreamBuilder.getSdkSetting().mPushBase.videoAlgorithm & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (jSONObject4 != null && appInfo != null && z3) {
            try {
                JSONObject jSONObject5 = new JSONObject(jSONObject4.toString());
                JSONObject optJSONObject2 = jSONObject5.optJSONObject("modelDownloadParams");
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                }
                optJSONObject2.put("appID", appInfo.getAppID());
                optJSONObject2.put("appVersion", appInfo.getAppVersion());
                optJSONObject2.put("deviceId", appInfo.getDeviceId());
                if (optJSONObject2.isNull("status")) {
                    optJSONObject2.put("status", "1");
                }
                jSONObject5.put("modelDownloadParams", optJSONObject2);
                filterManager.lambda$initVQScoreFilter$6(this.mLiveStreamBuilder.getContext(), jSONObject5, this.mMiscThreadHandler);
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
        }
        JSONObject jSONObject6 = this.mLiveStreamBuilder.getSdkSetting().mPushBase.colorHistParams;
        if (jSONObject6 != null) {
            try {
                JSONObject jSONObject7 = new JSONObject(jSONObject6.toString());
                jSONObject7.put("gopMs", this.mLiveStreamBuilder.getVideoGopSec() * 1000.0f);
                filterManager.lambda$initColorHistFilter$7(jSONObject7, new C62120OZo(this));
            } catch (Exception e3) {
                C16880lQ.LLLLIIL(e3);
            }
        }
        JSONObject jSONObject8 = this.mLiveStreamBuilder.getSdkSetting().mPushBase.videoDenoiseParams;
        if ((this.mLiveStreamBuilder.getSdkSetting().mPushBase.videoAlgorithm & 8) == 0) {
            z4 = false;
        }
        if (jSONObject8 != null && z4) {
            try {
                filterManager.lambda$initVideoDenoiseFilter$8(this.mLiveStreamBuilder.getContext(), jSONObject8, new AnonymousClass15());
            } catch (Exception e4) {
                C16880lQ.LLLLIIL(e4);
            }
        }
    }

    private boolean isNodeOptDisabled(String str) {
        NodeOptParams nodeOptParams;
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder != null) {
            nodeOptParams = liveStreamBuilder.getNodeOptParams();
        } else {
            nodeOptParams = null;
        }
        if (liveStreamBuilder == null || nodeOptParams == null) {
            return false;
        }
        String pushUrlPrefix = liveStreamBuilder.getPushUrlPrefix();
        if (pushUrlPrefix.length() > 0 && liveStreamBuilder.getRtmpPort() > 0) {
            str = pushUrlPrefix;
        }
        if ((!str.startsWith("rtmp://") || !NumberInit.isDefined(Integer.valueOf(nodeOptParams.getRtmp())) || nodeOptParams.getRtmp() != 0) && ((!str.startsWith("rtmps://") || !NumberInit.isDefined(Integer.valueOf(nodeOptParams.getRtmps())) || nodeOptParams.getRtmps() != 0) && (!str.startsWith("rtmpq://") || !NumberInit.isDefined(Integer.valueOf(nodeOptParams.getRtmpq())) || nodeOptParams.getRtmpq() != 0))) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void lambda$null$10(JSONObject jSONObject) {
        addSeiField("video_color_hist", jSONObject, 1, false, true);
    }

    public /* synthetic */ void lambda$setAudioMute$15(boolean z) {
        if (this.mAudioCapture != null) {
            if (!checkAudioCaptureCert(!z) && !z) {
                return;
            } else {
                this.mAudioCapture.mute(z);
            }
        }
        this.mMuted = z;
    }

    public /* synthetic */ void lambda$switchVideoCapture$14(int i) {
        boolean z;
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (this.mStatus.get() == 7 || liveStreamBuilder == null) {
            return;
        }
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        this.mIsRadioMode = z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Call switchVideoCapture. from ");
        LIZ.append(this.mLiveStreamBuilder.getVideoCaptureDevice());
        LIZ.append(", to ");
        LIZ.append(i);
        AVLog.logKibana(4, "LiveStream", X1D.LIZIZ(LIZ), null);
        liveStreamBuilder.setVideoCaptureDevice(i);
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            if (liveStreamVideoCapture.status() != 2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Switch video capture to ");
                LIZ2.append(i);
                AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ2));
                this.mVideoCapturer.switchVideoCaptureDevice(i, liveStreamBuilder.getScreenCaptureIntent());
                return;
            }
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("mVideoCapturer status error.");
            if (!AnonymousClass028.LJI(androidRuntimeException, "LiveStream.switchVideoCapture")) {
                AVLog.logKibana(6, "LiveStream-VideoCapture", "mVideoCapturer status error.", null);
                return;
            }
            throw androidRuntimeException;
        }
        AVLog.logKibana(6, "LiveStream-VideoCapture", "Maybe video capture already to stopped.", null);
    }

    public /* synthetic */ void lambda$updateSITIConfig$0(TEBundle tEBundle) {
        SITICalculator sITICalculator = this.mSITICalculator;
        if (sITICalculator == null) {
            return;
        }
        boolean isEnabled = sITICalculator.isEnabled();
        this.mSITICalculator.enable(false);
        this.mSITICalculator.setParameters(tEBundle);
        if (isEnabled) {
            this.mSITICalculator.enable(true);
        }
    }

    public /* synthetic */ void lambda$updateSITIConfig$1(boolean z) {
        SITICalculator sITICalculator = this.mSITICalculator;
        if (sITICalculator != null) {
            sITICalculator.enable(z);
        }
    }

    private void removeStreamsFromEncodeStream(boolean z) {
        AudioTrack audioTrack;
        VideoTrack videoTrack;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream == null) {
            return;
        }
        removeKaraokeTrack(this.mIsKaraokeMovie, this.mKaraokeMovie);
        if (z) {
            synchronized (this.mInputStreamListFence) {
                Iterator<IInputVideoStream> it = this.mInputVideoStreams.iterator();
                while (it.hasNext()) {
                    IInputVideoStream next = it.next();
                    if ((next instanceof InputVideoStream) && (videoTrack = ((InputVideoStream) next).getVideoTrack()) != null) {
                        mediaEncodeStream.removeTrack(videoTrack);
                    }
                }
            }
            return;
        }
        synchronized (this.mInputStreamListFence) {
            Iterator<IInputAudioStream> it2 = this.mInputAudioStreams.iterator();
            while (it2.hasNext()) {
                IInputAudioStream next2 = it2.next();
                if ((next2 instanceof InputAudioStream) && (audioTrack = ((InputAudioStream) next2).getAudioTrack()) != null) {
                    mediaEncodeStream.removeTrack(audioTrack);
                }
            }
        }
    }

    private void setupPSNRParameter(TEBundle tEBundle) {
        int pSNRPeriodSeconds = this.mLiveStreamBuilder.getPSNRPeriodSeconds();
        tEBundle.setInt("psnr_statistic_frames", this.mLiveStreamBuilder.getPSNRStatisticsFrames());
        tEBundle.setInt("psnr_statistic_period_seconds", pSNRPeriodSeconds);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean tryLoadQuicLibrary(String str) {
        int i;
        if (!str.startsWith("rtmpq")) {
            return false;
        }
        try {
            if (LibraryLoader.loadLibrary("vcbasekit") && LibraryLoader.loadLibrary("ttquic")) {
                i = 1;
                AVLog.ioi("LiveStream", "ttquic lib is load success");
            } else {
                i = 0;
                AVLog.ioi("LiveStream", "ttquic lib is load fail");
            }
            this.mQuicFlag = i;
            return i;
        } catch (Throwable unused) {
            this.mQuicFlag = 0;
            AVLog.ioi("LiveStream", "ttquic lib is load failed，change to nomal tcp");
            return false;
        }
    }

    private void updateQuicParams(LiveStreamLogService liveStreamLogService) {
        boolean z;
        boolean z2;
        if (this.mLiveStreamBuilder.getQuicParams() != null) {
            QuicParams quicParams = this.mLiveStreamBuilder.getQuicParams();
            boolean z3 = false;
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getProtocolDowngrade()))) {
                if (quicParams.getProtocolDowngrade() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.mEnableProtocolDownGrade = z2;
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getProtocolRetryTimes()))) {
                this.mRtmpReConnectCountsThreshold = quicParams.getProtocolRetryTimes();
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getEnableDowngradeInSend()))) {
                if (quicParams.getEnableDowngradeInSend() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.mEableDownGradeInSend = z;
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getProtocolDowngrade()))) {
                if (quicParams.getAbkeyProtocolDowngrade() == 1) {
                    z3 = true;
                }
                this.mAbkeyEnableProtocolDownGrade = z3;
            }
            TEBundle tEBundle = new TEBundle();
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getEnableSaveScfg()))) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C16880lQ.LLIIJLIL(C16880lQ.LLLLL(this.mLiveStreamBuilder.getContext())).getAbsolutePath());
                LIZ.append(File.separator);
                LIZ.append("pushstream.scfg");
                tEBundle.setString("scfg_address", X1D.LIZIZ(LIZ));
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getCongestionType()))) {
                tEBundle.setInt("congestion_type", quicParams.getCongestionType());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getLossDetectionType()))) {
                tEBundle.setInt("loss_detection_type", quicParams.getLossDetectionType());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getQuicVersion()))) {
                tEBundle.setInt("quic_version", quicParams.getQuicVersion());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getLogLevel()))) {
                tEBundle.setInt("log_level", quicParams.getLogLevel());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getAdatEstBwToQuicBw()))) {
                tEBundle.setInt("adapt_est_bw_to_quic_bw", quicParams.getAdatEstBwToQuicBw());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getEnableCertVerify()))) {
                int enableCertVerify = quicParams.getEnableCertVerify();
                tEBundle.setInt("enable_cert_verify", enableCertVerify);
                if (liveStreamLogService != null) {
                    liveStreamLogService.setEnableCertVerify(enableCertVerify);
                }
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getInitMtu()))) {
                tEBundle.setInt("init_mtu", quicParams.getInitMtu());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getEnableMtuDiscovery()))) {
                tEBundle.setInt("enable_mtu_discovery", quicParams.getEnableMtuDiscovery());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getInitCwnd()))) {
                tEBundle.setInt("init_cwnd", quicParams.getInitCwnd());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getDefaultRetransmitTime()))) {
                tEBundle.setInt("default_retransmit_time", quicParams.getDefaultRetransmitTime());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getFixStreamFinAndRst()))) {
                tEBundle.setInt("fix_stream_fin_and_rst", quicParams.getFixStreamFinAndRst());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getSendBufferSize()))) {
                tEBundle.setInt("send_buffer_size", quicParams.getSendBufferSize());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getRecvBufferSize()))) {
                tEBundle.setInt("recv_buffer_size", quicParams.getRecvBufferSize());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getFixPacketWriter()))) {
                tEBundle.setInt("fix_packet_writer", quicParams.getFixPacketWriter());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getIgnoreSocketWriterError()))) {
                tEBundle.setInt("ignore_socket_write_error", quicParams.getIgnoreSocketWriterError());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getBwWindowSize()))) {
                tEBundle.setInt("bw_window_size", quicParams.getBwWindowSize());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getRttWindowSize()))) {
                tEBundle.setInt("rtt_window_size", quicParams.getBwWindowSize());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getProbeBwRandomCycleLength()))) {
                tEBundle.setInt("probe_bw_random_cycle_length", quicParams.getProbeBwRandomCycleLength());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getProbeRttGain()))) {
                tEBundle.setInt("probe_rtt_gain", quicParams.getProbeRttGain());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getInitQuicType()))) {
                tEBundle.setInt("init_quic_type", quicParams.getInitQuicType());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getEnableIpSwitch()))) {
                tEBundle.setInt("enable_ip_switch_opt", quicParams.getEnableIpSwitch());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getDisableIpv6()))) {
                tEBundle.setInt("disable_ipv6", quicParams.getDisableIpv6());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getRetryCount()))) {
                tEBundle.setInt("retry_count", quicParams.getRetryCount());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getEnbaleBbrInfoReport()))) {
                tEBundle.setInt("enable_bbrinfo_report", quicParams.getEnbaleBbrInfoReport());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getEnbaleBbrOptimize()))) {
                tEBundle.setInt("enable_bbr_optimize", quicParams.getEnbaleBbrOptimize());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getOpenTimeOut()))) {
                tEBundle.setInt("open_timeout", quicParams.getOpenTimeOut());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getRwTimeOut()))) {
                tEBundle.setInt("read_write_timeout", quicParams.getRwTimeOut());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getEnableOptimizeMemoryCopy()))) {
                tEBundle.setInt("enable_optimize_memory_copy", quicParams.getEnableOptimizeMemoryCopy());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getUseQuicTimeV2()))) {
                tEBundle.setInt("use_quic_time_v2", quicParams.getUseQuicTimeV2());
            }
            if (NumberInit.isDefined(Integer.valueOf(quicParams.getLsquicOpenBlock()))) {
                tEBundle.setInt("lsquic_open_block", quicParams.getLsquicOpenBlock());
            }
            JSONObject quicEngineParam = quicParams.getQuicEngineParam();
            if (quicEngineParam != null) {
                tEBundle.setString("quic_engine_param", quicEngineParam.toString());
            }
            JSONObject quicConfigJson = quicParams.getQuicConfigJson();
            if (quicConfigJson != null) {
                tEBundle.setString("quic_config_json", quicConfigJson.toString());
            }
            this.mTransportOpt.setBundle("quic_params", tEBundle);
            tEBundle.release();
        }
    }

    private void updateRtmpCacheCfg(int i) {
        int i2;
        RtmpCacheConfig rtmpCacheCfgParams = this.mLiveStreamBuilder.getRtmpCacheCfgParams();
        BwEstCfg rtmpBwEstCfgParams = this.mLiveStreamBuilder.getRtmpBwEstCfgParams();
        LWReconnectCfg rtmpLWReconnectCfgParams = this.mLiveStreamBuilder.getRtmpLWReconnectCfgParams();
        TEBundle tEBundle = new TEBundle();
        TEBundle tEBundle2 = new TEBundle();
        TEBundle tEBundle3 = new TEBundle();
        LiveStreamLogService liveStreamLogService = this.mStreamLogService;
        tEBundle.setInt("real_video_fps", this.mLiveStreamBuilder.getVideoFps());
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getMinVideoFps()))) {
            tEBundle.setInt("min_video_fps", rtmpCacheCfgParams.getMinVideoFps());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getMaxVideoFps()))) {
            tEBundle.setInt("max_video_fps", rtmpCacheCfgParams.getMaxVideoFps());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getMinVideoFps())) || NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getMaxVideoFps()))) {
            tEBundle.setInt("init_video_fps", i);
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getMaxInterLeaveDelta()))) {
            tEBundle.setInt("max_interleave_delta", rtmpCacheCfgParams.getMaxInterLeaveDelta());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getDropVideoFrameThresholdI()))) {
            tEBundle.setInt("drop_video_frame_threshold_I", rtmpCacheCfgParams.getDropVideoFrameThresholdI());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getDropVideoFrameThresholdP()))) {
            tEBundle.setInt("drop_video_frame_threshold_P", rtmpCacheCfgParams.getDropVideoFrameThresholdP());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getDropVideoFrameThresholdB()))) {
            tEBundle.setInt("drop_video_frame_threshold_B", rtmpCacheCfgParams.getDropVideoFrameThresholdB());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getAudioSendStallThreshold()))) {
            tEBundle.setInt("audio_send_stall_threshold", rtmpCacheCfgParams.getAudioSendStallThreshold());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getVideoSendStallThreshold()))) {
            tEBundle.setInt("video_send_stall_threshold", rtmpCacheCfgParams.getVideoSendStallThreshold());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getLogIntervalMS()))) {
            tEBundle.setInt("log_interval_ms", rtmpCacheCfgParams.getLogIntervalMS());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getAndroidNetInfoOpt()))) {
            tEBundle.setInt("android_net_info_opt", rtmpCacheCfgParams.getAndroidNetInfoOpt());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getEnableReportStallLog()))) {
            int enableReportStallLog = rtmpCacheCfgParams.getEnableReportStallLog();
            this.mEanbleReportStallLog = enableReportStallLog;
            tEBundle.setInt("enable_report_stall_log", enableReportStallLog);
            if (liveStreamLogService != null && (i2 = this.mEanbleReportStallLog) > 0) {
                liveStreamLogService.setReportStallLog(i2);
            }
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getUsePktInTime()))) {
            tEBundle.setInt("use_pkt_inTime", rtmpCacheCfgParams.getUsePktInTime());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getEnablereportNetInfo()))) {
            tEBundle.setInt("enable_report_net_info", rtmpCacheCfgParams.getEnablereportNetInfo());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getEnableRefactorReportNetInfo()))) {
            tEBundle.setInt("enable_refactor_report_net_info", rtmpCacheCfgParams.getEnableRefactorReportNetInfo());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getEnableFpsAdjust()))) {
            tEBundle.setInt("enable_fps_adjust", rtmpCacheCfgParams.getEnableFpsAdjust());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getOpenTimeOut()))) {
            tEBundle.setInt("open_timeout", rtmpCacheCfgParams.getOpenTimeOut());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getRwTimeOut()))) {
            tEBundle.setInt("read_write_timeout", rtmpCacheCfgParams.getRwTimeOut());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getRtmpTimeRotation()))) {
            tEBundle.setInt("rtmp_time_rotation", rtmpCacheCfgParams.getRtmpTimeRotation());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getEnableRtmpStopPoll()))) {
            tEBundle.setInt("enable_rtmp_stopPoll", rtmpCacheCfgParams.getEnableRtmpStopPoll());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getEnableReportBwTime()))) {
            tEBundle.setInt("enable_report_bw_time", rtmpCacheCfgParams.getEnableReportBwTime());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getBwTimeReportThreshold()))) {
            tEBundle.setInt("bw_time_report_threshold", rtmpCacheCfgParams.getBwTimeReportThreshold());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getBwTimeReportKeepWin()))) {
            tEBundle.setInt("bw_time_report_keep_win", rtmpCacheCfgParams.getBwTimeReportKeepWin());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getDisableDnsParseWithIp()))) {
            tEBundle.setInt("disable_dns_parse_with_ip", rtmpCacheCfgParams.getDisableDnsParseWithIp());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getChunkSendOpt()))) {
            tEBundle.setInt("chunk_send_opt", rtmpCacheCfgParams.getChunkSendOpt());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getRtmpsNoblockIo()))) {
            tEBundle.setInt("rtmps_noblock_io", rtmpCacheCfgParams.getRtmpsNoblockIo());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getDisableDropFrame()))) {
            tEBundle.setInt("disable_drop_frame", rtmpCacheCfgParams.getDisableDropFrame());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getChangeDropFrameOrder()))) {
            tEBundle.setInt("change_drop_frame_order", rtmpCacheCfgParams.getChangeDropFrameOrder());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getBwKeepWinForFps()))) {
            tEBundle.setInt("bw_keep_win_for_fps", rtmpCacheCfgParams.getBwKeepWinForFps());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getSetFpsOpt()))) {
            tEBundle.setInt("set_fps_opt", rtmpCacheCfgParams.getSetFpsOpt());
        }
        if (NumberInit.isDefined(Double.valueOf(rtmpCacheCfgParams.getMaxFpsFactor()))) {
            tEBundle.setDouble("max_fps_factor", rtmpCacheCfgParams.getMaxFpsFactor());
        }
        if (NumberInit.isDefined(Double.valueOf(rtmpCacheCfgParams.getMinFpsFactor()))) {
            tEBundle.setDouble("min_fps_factor", rtmpCacheCfgParams.getMinFpsFactor());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getDnsTimeout()))) {
            tEBundle.setInt("dns_timeout", rtmpCacheCfgParams.getDnsTimeout());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpCacheCfgParams.getGetaddrinfoOpt()))) {
            tEBundle.setInt("getaddrinfo_opt", rtmpCacheCfgParams.getGetaddrinfoOpt());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpBwEstCfgParams.getBwGoDownWindowSize()))) {
            tEBundle2.setInt("bw_go_down_window_size", rtmpBwEstCfgParams.getBwGoDownWindowSize());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpBwEstCfgParams.getBwGoUpWindownSize()))) {
            tEBundle2.setInt("bw_go_up_window_size", rtmpBwEstCfgParams.getBwGoUpWindownSize());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpBwEstCfgParams.getBwGoUpPacketThresh()))) {
            tEBundle2.setInt("bw_go_up_packet_thresh", rtmpBwEstCfgParams.getBwGoUpPacketThresh());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpBwEstCfgParams.getBwGoDownScore()))) {
            tEBundle2.setInt("bw_go_down_score", rtmpBwEstCfgParams.getBwGoDownScore());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpBwEstCfgParams.getBitrateAdjustInterval()))) {
            tEBundle2.setInt("bitrate_adjust_interval", rtmpBwEstCfgParams.getBitrateAdjustInterval());
        }
        if (NumberInit.isDefined(Double.valueOf(rtmpBwEstCfgParams.getBwGoDownRatio()))) {
            tEBundle2.setDouble("bw_go_down_ratio", rtmpBwEstCfgParams.getBwGoDownRatio());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpBwEstCfgParams.getBwLongPeriodOpt()))) {
            tEBundle2.setInt("bw_long_period_opt", rtmpBwEstCfgParams.getBwLongPeriodOpt());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpBwEstCfgParams.getBwLongPeriodQueueSize()))) {
            tEBundle2.setInt("bw_long_period_queue_size", rtmpBwEstCfgParams.getBwLongPeriodQueueSize());
        }
        if (NumberInit.isDefined(Double.valueOf(rtmpBwEstCfgParams.getBwLongPeriodScore()))) {
            tEBundle2.setDouble("bw_long_period_score", rtmpBwEstCfgParams.getBwLongPeriodScore());
        }
        if (NumberInit.isDefined(Double.valueOf(rtmpBwEstCfgParams.getBwLongPeriodAlpha()))) {
            tEBundle2.setDouble("bw_long_period_alpha", rtmpBwEstCfgParams.getBwLongPeriodAlpha());
        }
        if (NumberInit.isDefined(Double.valueOf(rtmpBwEstCfgParams.getBwGoUpRatio()))) {
            tEBundle2.setDouble("bw_go_up_ratio", rtmpBwEstCfgParams.getBwGoUpRatio());
        }
        if (NumberInit.isDefined(Double.valueOf(rtmpBwEstCfgParams.getBwDropFrameRatio()))) {
            tEBundle2.setDouble("bw_drop_frame_ratio", rtmpBwEstCfgParams.getBwDropFrameRatio());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpBwEstCfgParams.getBwGoUpBwThresh()))) {
            tEBundle2.setInt("bw_go_up_bw_thresh", rtmpBwEstCfgParams.getBwGoUpBwThresh());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpBwEstCfgParams.getBwGoDownBwThresh()))) {
            tEBundle2.setInt("bw_go_down_bw_thresh", rtmpBwEstCfgParams.getBwGoDownBwThresh());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpBwEstCfgParams.getBwStartUpOpt()))) {
            tEBundle2.setInt("bw_start_up_opt", rtmpBwEstCfgParams.getBwStartUpOpt());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpBwEstCfgParams.getBwAdjustStepOpt()))) {
            tEBundle2.setInt("bw_adjust_step_opt", rtmpBwEstCfgParams.getBwAdjustStepOpt());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpLWReconnectCfgParams.getLwReconnectDropFrameThresh()))) {
            tEBundle3.setInt("lw_reconnect_drop_frame_thresh", rtmpLWReconnectCfgParams.getLwReconnectDropFrameThresh());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpLWReconnectCfgParams.getLwReconnectEnableDropFrame()))) {
            tEBundle3.setInt("lw_reconnect_enable_drop_frame", rtmpLWReconnectCfgParams.getLwReconnectEnableDropFrame());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpLWReconnectCfgParams.getLwReconnectOpenTimeout()))) {
            tEBundle3.setInt("lw_reconnect_open_timeout", rtmpLWReconnectCfgParams.getLwReconnectOpenTimeout());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpLWReconnectCfgParams.getLwReconnectEnableRequestIFrame()))) {
            tEBundle3.setInt("lw_reconnect_enable_request_Iframe", rtmpLWReconnectCfgParams.getLwReconnectEnableRequestIFrame());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpLWReconnectCfgParams.getLwReconnectRequestIFrameThresh()))) {
            tEBundle3.setInt("lw_reconnect_request_Iframe_thresh", rtmpLWReconnectCfgParams.getLwReconnectRequestIFrameThresh());
        }
        if (NumberInit.isDefined(Integer.valueOf(rtmpLWReconnectCfgParams.getLwReconnectCloseAbrDropFrame()))) {
            tEBundle3.setInt("lw_reconnect_close_abr_drop_frame", rtmpLWReconnectCfgParams.getLwReconnectCloseAbrDropFrame());
        }
        tEBundle3.setInt("enable_lw_reconnect", rtmpLWReconnectCfgParams.getEnableLWReconnect() ? 1 : 0);
        tEBundle.setBundle("lw_reconnect_cfg", tEBundle3);
        tEBundle.setBundle("bw_est_cfg", tEBundle2);
        this.mTransportOpt.setBundle("rtmp_cache_cfg", tEBundle);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void changeVideoFps(int i) {
        TEBundle tEBundle = new TEBundle();
        tEBundle.setInt("fps", i);
        tEBundle.setString("from", "user");
        updateSdkParams(tEBundle);
        tEBundle.release();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputAudioStream createInputAudioStream(String str) {
        InputAudioStream inputAudioStream = new InputAudioStream(this.mMediaEngineFactory, new InputAudioStream.Observer() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.38

            /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$38$1 */
            /* loaded from: classes12.dex */
            public class AnonymousClass1 implements Runnable {
                public final /* synthetic */ InputAudioStream val$stream;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1__run$___twin___() {
                    MediaEncodeStream mediaEncodeStream;
                    AudioTrack audioTrack = r2.getAudioTrack();
                    if (audioTrack != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                        mediaEncodeStream.removeTrack(audioTrack);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass1(InputAudioStream inputAudioStream2) {
                    r2 = inputAudioStream2;
                }
            }

            /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$38$2 */
            /* loaded from: classes12.dex */
            public class AnonymousClass2 implements Runnable {
                public final /* synthetic */ InputAudioStream val$stream;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2__run$___twin___() {
                    MediaEncodeStream mediaEncodeStream;
                    InputAudioStream inputAudioStream2 = r2;
                    if (inputAudioStream2 != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                        mediaEncodeStream.setAudioMixerDescription(inputAudioStream2.name(), r2.getMixerDescription());
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass2(InputAudioStream inputAudioStream2) {
                    r2 = inputAudioStream2;
                }
            }

            public AnonymousClass38() {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.InputAudioStream.Observer
            public void releaseInputStream(InputAudioStream inputAudioStream2) {
                synchronized (LiveStream.this.mInputStreamListFence) {
                    LiveStream.this.mInputAudioStreams.remove(inputAudioStream2);
                }
                ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.38.1
                    public final /* synthetic */ InputAudioStream val$stream;

                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1__run$___twin___() {
                        MediaEncodeStream mediaEncodeStream;
                        AudioTrack audioTrack = r2.getAudioTrack();
                        if (audioTrack != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                            mediaEncodeStream.removeTrack(audioTrack);
                        }
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_ttlivestreamer_livestreamv2_LiveStream$38$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }

                    public AnonymousClass1(InputAudioStream inputAudioStream22) {
                        r2 = inputAudioStream22;
                    }
                });
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.InputAudioStream.Observer
            public void updateVolume(InputAudioStream inputAudioStream2) {
                LiveStream.this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.38.2
                    public final /* synthetic */ InputAudioStream val$stream;

                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2__run$___twin___() {
                        MediaEncodeStream mediaEncodeStream;
                        InputAudioStream inputAudioStream22 = r2;
                        if (inputAudioStream22 != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                            mediaEncodeStream.setAudioMixerDescription(inputAudioStream22.name(), r2.getMixerDescription());
                        }
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                        boolean LIZ;
                        try {
                            anonymousClass2.com_ss_ttlivestreamer_livestreamv2_LiveStream$38$2__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }

                    public AnonymousClass2(InputAudioStream inputAudioStream22) {
                        r2 = inputAudioStream22;
                    }
                });
            }
        }, this.mLiveStreamBuilder.getAudioSampleHZ(), this.mLiveStreamBuilder.getAudioChannel(), null, str);
        synchronized (this.mInputStreamListFence) {
            this.mInputAudioStreams.add(inputAudioStream);
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.39
            public final /* synthetic */ InputAudioStream val$stream;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$39_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$39__run$___twin___() {
                MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
                if (mediaEncodeStream != null) {
                    mediaEncodeStream.addTrack(r2.getAudioTrack());
                    LiveStream.this.mMediaEncodeStream.setAudioMixerDescription(r2.name(), r2.getMixerDescription());
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$39_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass39 anonymousClass39) {
                boolean LIZ;
                try {
                    anonymousClass39.com_ss_ttlivestreamer_livestreamv2_LiveStream$39__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass39(InputAudioStream inputAudioStream2) {
                r2 = inputAudioStream2;
            }
        });
        return inputAudioStream2;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public IInputVideoStream createInputVideoStream(String str) {
        MediaEngineFactory mediaEngineFactory = this.mMediaEngineFactory;
        if (mediaEngineFactory == null) {
            AVLog.logKibana(6, "LiveStream", "createInputVideoStream error: mMediaEngineFactory is null", null);
            return null;
        }
        Handler handler = this.mVideoCaptureHandler;
        if (handler == null) {
            AVLog.logKibana(6, "LiveStream", "createInputVideoStream error: mVideoCaptureHandler is null", null);
            return null;
        }
        InputVideoStream inputVideoStream = new InputVideoStream(mediaEngineFactory, handler, new InputVideoStream.Observer() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.40

            /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$40$1 */
            /* loaded from: classes12.dex */
            public class AnonymousClass1 implements Runnable {
                public final /* synthetic */ VideoMixer.VideoMixerDescription val$description;
                public final /* synthetic */ InputVideoStream val$stream;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1__run$___twin___() {
                    MediaEncodeStream mediaEncodeStream;
                    if (r2.getVideoTrack() != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                        mediaEncodeStream.setVideoMixerDescription(r2.name(), r3);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                    boolean LIZ;
                    try {
                        anonymousClass1.com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass1(InputVideoStream inputVideoStream2, VideoMixer.VideoMixerDescription videoMixerDescription2) {
                    r2 = inputVideoStream2;
                    r3 = videoMixerDescription2;
                }
            }

            /* renamed from: com.ss.ttlivestreamer.livestreamv2.LiveStream$40$2 */
            /* loaded from: classes12.dex */
            public class AnonymousClass2 implements Runnable {
                public final /* synthetic */ InputVideoStream val$stream;
                public final /* synthetic */ boolean val$unReleaseInInputStream;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2__run$___twin___() {
                    MediaEncodeStream mediaEncodeStream;
                    VideoTrack videoTrack = r2.getVideoTrack();
                    if (videoTrack != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                        mediaEncodeStream.removeTrack(videoTrack);
                        if (r3) {
                            videoTrack.release();
                        }
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                    boolean LIZ;
                    try {
                        anonymousClass2.com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass2(InputVideoStream inputVideoStream2, boolean z) {
                    r2 = inputVideoStream2;
                    r3 = z;
                }
            }

            public AnonymousClass40() {
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.InputVideoStream.Observer
            public void releaseInputStream(InputVideoStream inputVideoStream2) {
                synchronized (LiveStream.this.mInputStreamListFence) {
                    LiveStream.this.mInputVideoStreams.remove(inputVideoStream2);
                }
                ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.40.2
                    public final /* synthetic */ InputVideoStream val$stream;
                    public final /* synthetic */ boolean val$unReleaseInInputStream;

                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2__run$___twin___() {
                        MediaEncodeStream mediaEncodeStream;
                        VideoTrack videoTrack = r2.getVideoTrack();
                        if (videoTrack != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                            mediaEncodeStream.removeTrack(videoTrack);
                            if (r3) {
                                videoTrack.release();
                            }
                        }
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass2 anonymousClass2) {
                        boolean LIZ;
                        try {
                            anonymousClass2.com_ss_ttlivestreamer_livestreamv2_LiveStream$40$2__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }

                    public AnonymousClass2(InputVideoStream inputVideoStream22, boolean z) {
                        r2 = inputVideoStream22;
                        r3 = z;
                    }
                });
            }

            @Override // com.ss.ttlivestreamer.livestreamv2.InputVideoStream.Observer
            public void onMixerDescriptionChange(InputVideoStream inputVideoStream2, VideoMixer.VideoMixerDescription videoMixerDescription2) {
                ThreadUtils.invokeAtFrontUninterruptibly(LiveStream.this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.40.1
                    public final /* synthetic */ VideoMixer.VideoMixerDescription val$description;
                    public final /* synthetic */ InputVideoStream val$stream;

                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1__run$___twin___() {
                        MediaEncodeStream mediaEncodeStream;
                        if (r2.getVideoTrack() != null && (mediaEncodeStream = LiveStream.this.mMediaEncodeStream) != null) {
                            mediaEncodeStream.setVideoMixerDescription(r2.name(), r3);
                        }
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                        boolean LIZ;
                        try {
                            anonymousClass1.com_ss_ttlivestreamer_livestreamv2_LiveStream$40$1__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }

                    public AnonymousClass1(InputVideoStream inputVideoStream22, VideoMixer.VideoMixerDescription videoMixerDescription22) {
                        r2 = inputVideoStream22;
                        r3 = videoMixerDescription22;
                    }
                });
            }
        }, this.mLiveStreamBuilder.getVideoWidth(), this.mLiveStreamBuilder.getVideoHeight(), this.mLiveStreamBuilder.getVideoFps(), str, this.mLiveStreamBuilder.getPushBase().UnReleaseInInputStream);
        synchronized (this.mInputStreamListFence) {
            this.mInputVideoStreams.add(inputVideoStream);
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.41
            public final /* synthetic */ InputVideoStream val$stream;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$41_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$41__run$___twin___() {
                MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
                if (mediaEncodeStream != null) {
                    mediaEncodeStream.addTrack(r2.getVideoTrack());
                    LiveStream.this.mMediaEncodeStream.setVideoMixerDescription(r2.name(), r2.getMixerDescription());
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$41_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass41 anonymousClass41) {
                boolean LIZ;
                try {
                    anonymousClass41.com_ss_ttlivestreamer_livestreamv2_LiveStream$41__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass41(InputVideoStream inputVideoStream2) {
                r2 = inputVideoStream2;
            }
        });
        return inputVideoStream2;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean getAdaptedVideoResolution(int[] iArr) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture == null || iArr == null || iArr.length <= 1) {
            return false;
        }
        iArr[0] = liveStreamVideoCapture.getAdaptedWidth();
        iArr[1] = liveStreamVideoCapture.getAdaptedHeight();
        return true;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public long getAudioEncodeTimeStamp(long j) {
        VsyncModule vsyncModule;
        String str = this.mAudioEncodeVsyncName;
        Transport transport = this.mRTMPTransport;
        if (transport != null) {
            vsyncModule = transport.getVsyncModule();
        } else {
            vsyncModule = null;
        }
        if (str != null && vsyncModule != null) {
            return vsyncModule.convertToNowMills(str, j);
        }
        return 0L;
    }

    public long getInt64Value(int i) {
        if (i != 1 && i != 1001 && i != 3 && i != 4 && i != 5 && i != 6 && i != 7 && i != 2999 && i != 3000) {
            switch (i) {
                case LiveNetAdaptiveHurryTimeSetting.DEFAULT /* 2000 */:
                case 2001:
                case 2002:
                    break;
                default:
                    return 0L;
            }
        }
        synchronized (this.mRTMPTransportFence) {
            Transport transport = this.mRTMPTransport;
            if (transport == null) {
                return 0L;
            }
            return transport.getInt64Value(i);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean getLiveStreamInfo(LiveStreamReport liveStreamReport) {
        try {
        } catch (InterruptedException e) {
            TTLSSladarBugReportUtils.getInstance().report(e, "LiveStream.getLiveStreamInfo");
            if (TTLSBuildConfig.canThrowException()) {
                throw new RuntimeException("mReportFence.readLock()", e);
            }
        }
        if (this.mReportFence.readLock().tryLock(100L, TimeUnit.MILLISECONDS)) {
            liveStreamReport.clear();
            liveStreamReport.setTransportAdjustBps(this.mAdjustBitrate);
            MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
            if (mediaEncodeStream != null) {
                mediaEncodeStream.getStaticsReport(liveStreamReport);
                liveStreamReport.setAudioMixerCostTimePerFrameMs(this.mMediaEncodeStream.getAudioMixer().getAvgCostTimePerFrameMs());
                liveStreamReport.setVideoMixerCostTimePerFrameMs(this.mMediaEncodeStream.getVideoMixer().getAvgCostTimePerFrameMs());
            }
            VideoTrack videoTrack = this.mVideoTrack;
            if (videoTrack != null) {
                videoTrack.getStaticsReport(liveStreamReport);
            }
            AudioTrack audioTrack = this.mAudioTrack;
            if (audioTrack != null) {
                audioTrack.getStaticsReport(liveStreamReport);
            }
            LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
            if (liveStreamVideoCapture != null) {
                liveStreamVideoCapture.getStaticsReport(liveStreamReport);
            }
            synchronized (this.mRTMPTransportFence) {
                Transport transport = this.mRTMPTransport;
                if (transport != null) {
                    transport.getStaticsReport(liveStreamReport);
                }
            }
            VideoFrameStatistics videoFrameStatistics = this.mVideoFrameStatics;
            LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
            if (videoFrameStatistics != null && liveStreamBuilder != null && liveStreamBuilder.getPushBase().videoFrameEllipse) {
                videoFrameStatistics.getStaticsReport(liveStreamReport);
            }
            this.mReportFence.readLock().unlock();
            return true;
        }
        AVLog.w("LiveStream", "Maybe be stream will be release.");
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public double getStaticsInfoWithKey(String str) {
        VideoTrack videoTrack;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if ((!str.equals("estream_transport_real_fps") && !str.equals("estream_transport_real_bps") && !str.equals("estream_venc_real_fps")) || this.mVeLivePusher != null || mediaEncodeStream == null) {
            if ((str.equals("vsourc_deliver_fps") || str.equals("vsourc_drop_fps")) && (videoTrack = this.mVideoTrack) != null) {
                return videoTrack.getStaticsInfoWithKey(str);
            }
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }
        return mediaEncodeStream.getStaticsInfoWithKey(str);
    }

    public String getStringValue(int i) {
        SITICalculator sITICalculator;
        if (i != 3400 || (sITICalculator = this.mSITICalculator) == null) {
            return null;
        }
        return sITICalculator.GetPerformance();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public long getTimestampForKey(int i) {
        Transport transport;
        if (i != 6) {
            if (i == 7 && (transport = this.mRTMPTransport) != null) {
                return transport.getInt64Value(7);
            }
        } else {
            Transport transport2 = this.mRTMPTransport;
            if (transport2 != null) {
                return transport2.getInt64Value(6);
            }
        }
        return 0L;
    }

    public void getVideoFrameElapseInfo(StaticsReport staticsReport) {
        VideoFrameStatistics videoFrameStatistics;
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder != null && liveStreamBuilder.getPushBase().videoFrameEllipse && (videoFrameStatistics = this.mVideoFrameStatics) != null && staticsReport != null) {
            videoFrameStatistics.getStaticsReport(staticsReport);
        }
    }

    public boolean getVideoPreviewFps(LiveStreamReport liveStreamReport) {
        VideoTrack videoTrack = this.mVideoTrack;
        if (videoTrack != null) {
            videoTrack.getStaticsReport(liveStreamReport);
            return true;
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean isEnableMixer(boolean z) {
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null) {
            if (z) {
                return mediaEncodeStream.getAudioMixer().enable();
            }
            return mediaEncodeStream.getVideoMixer().enable();
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public boolean isMirror(boolean z) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            return liveStreamVideoCapture.isMirror(z);
        }
        return false;
    }

    public boolean isRtsUrl(String str) {
        String[] split = str.split("\\?");
        if (split == null || split.length < 1) {
            return false;
        }
        return split[0].contains(".sdp");
    }

    public void onAudioEncodeProfileChanged(int i) {
        TEBundle tEBundle;
        TEBundle tEBundle2;
        DebugLogUtils.isEnableDebugLog();
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    return;
                } else {
                    this.mLiveStreamBuilder.getPushBase().audioProfile = 3;
                }
            } else {
                this.mLiveStreamBuilder.getPushBase().audioProfile = 2;
            }
        } else {
            this.mLiveStreamBuilder.getPushBase().audioProfile = 1;
        }
        if (this.mMediaEncodeStream != null && (tEBundle2 = this.mEncodeStreamOpt) != null) {
            tEBundle2.setInt("audio_profileLevel", i);
            this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
        }
        if (this.mRTMPTransport != null && (tEBundle = this.mTransportOpt) != null) {
            tEBundle.setInt("audio_profileLevel", i);
            this.mRTMPTransport.setParameter(this.mTransportOpt);
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.AudioSource.PowerObserver
    public void onCalculatePcmPowerEvent(int i) {
        Handler handler;
        if ((LogUtil.logFilterSwitch() || this.mDataListener != null) && (handler = this.mDataNotifyThreadHandler) != null) {
            handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.29
                public final /* synthetic */ int val$power;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$29_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$29__run$___twin___() {
                    ILiveStream.ILiveStreamDataListener iLiveStreamDataListener = LiveStream.this.mDataListener;
                    if (iLiveStreamDataListener != null) {
                        iLiveStreamDataListener.onData(1, r2, 0);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$29_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass29 anonymousClass29) {
                    boolean LIZ;
                    try {
                        anonymousClass29.com_ss_ttlivestreamer_livestreamv2_LiveStream$29__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass29(int i2) {
                    r2 = i2;
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.core.effect.EffectWrapper.IEffectEdgeRenderLog
    public void onEdgeRenderLog(JSONObject jSONObject) {
        ILogUploader logUploader;
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder != null && (logUploader = liveStreamBuilder.getLogUploader()) != null && jSONObject != null) {
            logUploader.uploadLog(jSONObject);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void sendSdkControlMsg(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("type") && "push".equals(JSONObjectProtectorUtils.getString(jSONObject, "type"))) {
                this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.47
                    public final /* synthetic */ String val$command;
                    public final /* synthetic */ JSONObject val$sdkParamsJsonObj;

                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_LiveStream$47_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_LiveStream$47__run$___twin___() {
                        try {
                            LiveStream.this.sendSdkControlMsgInternal(r2, r3);
                        } catch (JSONException e) {
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("sendSdkControlMsgInternal error:");
                            LIZ.append(e);
                            AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
                        }
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$47_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass47 anonymousClass47) {
                        boolean LIZ;
                        try {
                            anonymousClass47.com_ss_ttlivestreamer_livestreamv2_LiveStream$47__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }

                    public AnonymousClass47(String str2, JSONObject jSONObject2) {
                        r2 = str2;
                        r3 = jSONObject2;
                    }
                });
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sendSdkControlMsg error:");
            LIZ.append(e);
            AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setAudioFrameAvailableListener(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener) {
        Handler handler = this.mWorkThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.37
                public final /* synthetic */ ILiveStream.IAudioFrameAvailableListener val$listener;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$37_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$37__run$___twin___() {
                    if (LiveStream.this.mStatus.get() == 7) {
                        return;
                    }
                    if (r2 == null) {
                        LiveStream liveStream = LiveStream.this;
                        ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener2 = liveStream.mExternalAudioFrameListener;
                        if (iAudioFrameAvailableListener2 != null) {
                            AudioFrameAvailableSink audioFrameAvailableSink = liveStream.mAudioFrameAvailableSink;
                            if (audioFrameAvailableSink != null) {
                                audioFrameAvailableSink.removeListener(iAudioFrameAvailableListener2);
                            }
                            LiveStream.this.mExternalAudioFrameListener = null;
                            return;
                        }
                        return;
                    }
                    LiveStream liveStream2 = LiveStream.this;
                    if (liveStream2.mAudioFrameAvailableSink == null) {
                        liveStream2.mAudioFrameAvailableSink = new AudioFrameAvailableSink();
                    }
                    LiveStream liveStream3 = LiveStream.this;
                    ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener22 = r2;
                    liveStream3.mExternalAudioFrameListener = iAudioFrameAvailableListener22;
                    liveStream3.mAudioFrameAvailableSink.addListener(iAudioFrameAvailableListener22);
                    LiveStream.this.addCapturedAudioFrameSinks();
                    AudioCapturer audioCapturer = LiveStream.this.mAudioCapture;
                    if (audioCapturer != null) {
                        audioCapturer.resume();
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$37_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass37 anonymousClass37) {
                    boolean LIZ;
                    try {
                        anonymousClass37.com_ss_ttlivestreamer_livestreamv2_LiveStream$37__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass37(ILiveStream.IAudioFrameAvailableListener iAudioFrameAvailableListener2) {
                    r2 = iAudioFrameAvailableListener2;
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setAudioMute(final boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioMute(");
        LIZ.append(z);
        LIZ.append(")");
        AVLog.logKibana(4, "LiveStream", X1D.LIZIZ(LIZ), new Throwable());
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new Runnable() { // from class: X.P2p
                @Override // java.lang.Runnable
                public final void run() {
                    LiveStream.this.lambda$setAudioMute$15(z);
                }
            }, new int[]{1}));
        }
    }

    public void setAudioRecordMode(int i) {
        this.mAudioRecordMode = i;
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null && (audioCapturer instanceof LiveStreamAudioCapture)) {
            audioCapturer.setMode(i);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setAudioScenario(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioScenario(");
        LIZ.append(i);
        LIZ.append(")");
        AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ));
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.18
                public final /* synthetic */ int val$scenario;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$18__run$___twin___() {
                    AudioDeviceModule audioDeviceModule = LiveStream.this.mAudioDeviceModule;
                    if (audioDeviceModule != null) {
                        audioDeviceModule.setAudioScenario(r2);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$18_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass18 anonymousClass18) {
                    boolean LIZ2;
                    try {
                        anonymousClass18.com_ss_ttlivestreamer_livestreamv2_LiveStream$18__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }

                public AnonymousClass18(int i2) {
                    r2 = i2;
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setBackGroundPhotoPath(Bitmap bitmap) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.setBackGroundPhotoPath(bitmap);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setDataListener(ILiveStream.ILiveStreamDataListener iLiveStreamDataListener) {
        boolean z;
        this.mDataListener = iLiveStreamDataListener;
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null) {
            if (iLiveStreamDataListener != null) {
                z = true;
            } else {
                z = false;
            }
            audioDeviceModule.enableAdmObserver(z);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setDns(InterfaceC63833P3l interfaceC63833P3l) {
        Handler handler = this.mWorkThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.35
                public final /* synthetic */ InterfaceC63833P3l val$dns;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$35_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$35__run$___twin___() {
                    boolean z;
                    LiveStream liveStream = LiveStream.this;
                    InterfaceC63833P3l interfaceC63833P3l2 = r2;
                    liveStream.mDns = interfaceC63833P3l2;
                    if (interfaceC63833P3l2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    liveStream.mDnsOptOpen = z;
                    liveStream.mOptUrlMap = new HashMap<>();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("execute setDns, mDnsOptOpen ");
                    LIZ.append(LiveStream.this.mDnsOptOpen);
                    AVLog.logKibana(5, "LiveStream", X1D.LIZIZ(LIZ), null);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("execute setDns, mDnsOptOpen ");
                    LIZ2.append(LiveStream.this.mDnsOptOpen);
                    AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ2));
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$35_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass35 anonymousClass35) {
                    boolean LIZ;
                    try {
                        anonymousClass35.com_ss_ttlivestreamer_livestreamv2_LiveStream$35__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass35(InterfaceC63833P3l interfaceC63833P3l2) {
                    r2 = interfaceC63833P3l2;
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setErrorListener(ILiveStream.ILiveStreamErrorListener iLiveStreamErrorListener) {
        this.mErrorListener = iLiveStreamErrorListener;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setInfoListener(ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener) {
        this.mInfoListener = iLiveStreamInfoListener;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setLowPowerLevel(int i) {
        LiveStreamBaseStrategy liveStreamBaseStrategy = this.mLiveStreamStrategy;
        if (liveStreamBaseStrategy != null) {
            if (i != 1 && i != 2 && i != 3) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setLowPowerLevel wrong level:");
                LIZ.append(i);
                AVLog.logKibana(6, "LiveStream", X1D.LIZIZ(LIZ), null);
                return;
            }
            liveStreamBaseStrategy.onInfo(1, 1, i);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setLowPowerLevel with level: ");
            LIZ2.append(i);
            AVLog.logKibana(6, "LiveStream", X1D.LIZIZ(LIZ2), null);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setOption(LiveStreamOption liveStreamOption) {
        TEBundle opt = liveStreamOption.getOpt();
        if (this.mStatus.get() != 7) {
            ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.22
                public final /* synthetic */ TEBundle val$opt;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$22__run$___twin___() {
                    MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
                    if (mediaEncodeStream != null) {
                        mediaEncodeStream.setParameter(r2);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$22_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass22 anonymousClass22) {
                    boolean LIZ;
                    try {
                        anonymousClass22.com_ss_ttlivestreamer_livestreamv2_LiveStream$22__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass22(TEBundle opt2) {
                    r2 = opt2;
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setOriginAudioTrack(String str) {
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.12
            public final /* synthetic */ String val$track;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$12__run$___twin___() {
                if (LiveStream.this.mMediaEncodeStream != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("setOriginAudioTrack to:");
                    LIZ.append(r2);
                    LIZ.append(",Orig Track is:");
                    LIZ.append(LiveStream.this.getOriginInputAudioStream().name());
                    AVLog.iow("LiveStream-StreamTrace", X1D.LIZIZ(LIZ));
                    LiveStream.this.mMediaEncodeStream.setOriginAudioTrack(r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$12_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass12 anonymousClass12) {
                boolean LIZ;
                try {
                    anonymousClass12.com_ss_ttlivestreamer_livestreamv2_LiveStream$12__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass12(String str2) {
                r2 = str2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setOriginVideoTrack(String str) {
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.11
            public final /* synthetic */ String val$track;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$11__run$___twin___() {
                if (LiveStream.this.mMediaEncodeStream != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("setOriginVideoTrack to:");
                    LIZ.append(r2);
                    LIZ.append(",Orig Track is:");
                    LIZ.append(LiveStream.this.getOriginInputVideoStream().name());
                    AVLog.iow("LiveStream-StreamTrace", X1D.LIZIZ(LIZ));
                    LiveStream.this.mMediaEncodeStream.setOriginVideoTrack(r2);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$11_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass11 anonymousClass11) {
                boolean LIZ;
                try {
                    anonymousClass11.com_ss_ttlivestreamer_livestreamv2_LiveStream$11__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass11(String str2) {
                r2 = str2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setPublishMixBgColor(int i) {
        VideoMixer videoMixer;
        this.mVideoMixBgColor = i;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && (videoMixer = mediaEncodeStream.getVideoMixer()) != null) {
            TEBundle tEBundle = new TEBundle();
            videoMixer.getParameter(tEBundle);
            tEBundle.setInt("vmixer_bg_color", i);
            videoMixer.setParameter(tEBundle);
            tEBundle.release();
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setPublishPlanarRender(boolean z) {
        VideoMixer videoMixer;
        boolean z2;
        LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
        if (liveStreamBuilder != null) {
            if (z && liveStreamBuilder.getPushBase().publishPlanarRender) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.mPublishPlanarRender = z2;
        } else {
            this.mPublishPlanarRender = z;
        }
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && (videoMixer = mediaEncodeStream.getVideoMixer()) != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setPublishPlanarRender:");
            LIZ.append(z);
            AVLog.logKibana(4, "LiveStream", X1D.LIZIZ(LIZ), null);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setPublishPlanarRender:");
            LIZ2.append(z);
            AVLog.w("LiveStream", X1D.LIZIZ(LIZ2));
            TEBundle tEBundle = new TEBundle();
            videoMixer.getParameter(tEBundle);
            tEBundle.setBool("vmixer_planar_render", this.mPublishPlanarRender);
            videoMixer.setParameter(tEBundle);
            tEBundle.release();
        }
    }

    public void setPushStreamAfterServerMix(boolean z) {
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.8
            public final /* synthetic */ boolean val$pushStreamAfterServerMix;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$8__run$___twin___() {
                LiveStream.this.mPushStreamAfterServerMix = r2;
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$8_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass8 anonymousClass8) {
                boolean LIZ;
                try {
                    anonymousClass8.com_ss_ttlivestreamer_livestreamv2_LiveStream$8__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass8(boolean z2) {
                r2 = z2;
            }
        });
    }

    public void setPushStreamStart(boolean z) {
        this.mPushStreamStart = z;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setRadioModeBgBitmap(Bitmap bitmap) {
        setBackGroundPhotoPath(bitmap);
    }

    public void setRenderSink(VideoSink videoSink) {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.20
                public final /* synthetic */ VideoSink val$sink;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$20__run$___twin___() {
                    VideoSink videoSink2;
                    VideoSink videoSink22 = r2;
                    LiveStream liveStream = LiveStream.this;
                    VideoTrack videoTrack = liveStream.mVideoTrack;
                    if (videoTrack != null && (videoSink2 = liveStream.mRenderView) != null) {
                        videoTrack.removeVideoSink(videoSink2);
                        LiveStream.this.mRenderView.release();
                        LiveStream.this.mRenderView = null;
                    }
                    VideoSink videoSink3 = LiveStream.this.mRenderView;
                    if (videoSink3 != null) {
                        videoSink3.release();
                        LiveStream.this.mRenderView = null;
                    }
                    LiveStream liveStream2 = LiveStream.this;
                    liveStream2.mRenderView = videoSink22;
                    VideoTrack videoTrack2 = liveStream2.mVideoTrack;
                    if (videoTrack2 != null && videoSink22 != null) {
                        videoTrack2.addVideoSink(videoSink22);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$20_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass20 anonymousClass20) {
                    boolean LIZ;
                    try {
                        anonymousClass20.com_ss_ttlivestreamer_livestreamv2_LiveStream$20__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass20(VideoSink videoSink2) {
                    r2 = videoSink2;
                }
            });
        }
    }

    public void setRoiSwitch(RoiSwitch roiSwitch) {
        if (roiSwitch != null) {
            this.mRoiSwitch = roiSwitch;
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setSeiCurrentShiftDiffTime(long j) {
        TEBundle tEBundle;
        if (this.mLiveStreamBuilder.isEnableSeiShift()) {
            this.mSeiCurrentShiftDiffTime = j;
            if (this.mRTMPTransport != null && (tEBundle = this.mTransportOpt) != null) {
                tEBundle.setLong("sei_ntp_time_shift", j);
                this.mRTMPTransport.setParameter(this.mTransportOpt);
            }
            IVeLivePusher iVeLivePusher = this.mVeLivePusher;
            if (iVeLivePusher != null) {
                iVeLivePusher.setPusherSeiDiffTime(this.mSeiCurrentShiftDiffTime);
            }
        }
    }

    public void setStartServerMixWhilePushStream(boolean z) {
        if (!z && isOnMicOptAndRtcPushing()) {
            stop();
        }
        this.mStartServerMixWhilePushStream = z;
    }

    public void setStreamUniqueIdentifier(String str) {
        this.mStreamUuid = str;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setTextureFrameAvailableListener(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        Handler handler = this.mWorkThreadHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.36
                public final /* synthetic */ ILiveStream.ITextureFrameAvailableListener val$listener;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$36_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$36__run$___twin___() {
                    LiveStream liveStream;
                    boolean z;
                    if (LiveStream.this.mStatus.get() == 7) {
                        return;
                    }
                    LiveStream liveStream2 = LiveStream.this;
                    if (liveStream2.mTextureFrameAvailableSink == null) {
                        liveStream2.mTextureFrameAvailableSink = new TextureFrameAvailableSink();
                    }
                    LiveStream.this.mTextureFrameAvailableSink.setListener(r2);
                    LiveStream liveStream3 = LiveStream.this;
                    if (liveStream3.mVideoTrack != null) {
                        if (liveStream3.mLiveStreamBuilder.isEnableKTV() && (z = (liveStream = LiveStream.this).mIsKaraokeMovie)) {
                            liveStream.changeToKTVMode(z, liveStream.mKaraokeMovie);
                        } else {
                            LiveStream liveStream4 = LiveStream.this;
                            liveStream4.mVideoTrack.addVideoSink(liveStream4.mTextureFrameAvailableSink);
                        }
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$36_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass36 anonymousClass36) {
                    boolean LIZ;
                    try {
                        anonymousClass36.com_ss_ttlivestreamer_livestreamv2_LiveStream$36__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass36(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener2) {
                    r2 = iTextureFrameAvailableListener2;
                }
            });
        }
    }

    public void setVideoMixBgColor(int i) {
        VideoMixer videoMixer;
        this.mVideoMixBgColor = i;
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && (videoMixer = mediaEncodeStream.getVideoMixer()) != null) {
            TEBundle tEBundle = new TEBundle();
            videoMixer.getParameter(tEBundle);
            tEBundle.setInt("vmixer_bg_color", i);
            videoMixer.setParameter(tEBundle);
            tEBundle.release();
        }
    }

    public void setupLogServer(LiveStreamLogService liveStreamLogService) {
        this.mStreamLogService = liveStreamLogService;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void start(List<String> list) {
        DebugLogUtils.isEnableDebugLog();
        if (this.mStatus.get() != 7) {
            this.mUris = list;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Try to start live stream with ");
            LIZ.append(list);
            AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ));
            int i = 0;
            while (i < this.mUris.size()) {
                if (((String) ListProtector.get(this.mUris, i)).isEmpty()) {
                    ListProtector.remove(this.mUris, i);
                } else {
                    i++;
                }
            }
            if (this.mUris.isEmpty()) {
                return;
            } else {
                this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.7
                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_LiveStream$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_LiveStream$7__run$___twin___() {
                        LiveStream liveStream = LiveStream.this;
                        liveStream.mEnalbeReconnect = true;
                        LiveStreamLogService liveStreamLogService = liveStream.mStreamLogService;
                        if (liveStreamLogService != null) {
                            liveStreamLogService.reset();
                            liveStreamLogService.startPeriodReport();
                            liveStreamLogService.setReportStallLog(LiveStream.this.mEanbleReportStallLog);
                        }
                        List<String> list2 = LiveStream.this.mUris;
                        if (list2 != null && list2.size() > 1) {
                            LiveStream liveStream2 = LiveStream.this;
                            if (liveStream2.isRtsUrl((String) ListProtector.get(liveStream2.mUris, 0)) && !LibRTMPTransport.TryLoadRtsLibrary()) {
                                ListProtector.remove(LiveStream.this.mUris, 0);
                            }
                        }
                        LiveStream.this.doStart();
                    }

                    public AnonymousClass7() {
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$7_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass7 anonymousClass7) {
                        boolean LIZ2;
                        try {
                            anonymousClass7.com_ss_ttlivestreamer_livestreamv2_LiveStream$7__run$___twin___();
                        } finally {
                            if (LIZ2) {
                            }
                        }
                    }
                });
            }
        }
        if (this.mVeLivePusher != null) {
            String[] strArr = new String[list.size()];
            DebugLogUtils.isEnableDebugLog();
            this.mVeLivePusher.startEncodeAndPublish((String[]) list.toArray(strArr));
        }
    }

    public void startRecorder(String str) {
        boolean z;
        if (this.mStatus.get() != 7) {
            z = this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.44
                public final /* synthetic */ String val$file;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$44_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$44__run$___twin___() {
                    LiveStream liveStream = LiveStream.this;
                    MediaEncodeStream mediaEncodeStream = liveStream.mMediaEncodeStream;
                    if (mediaEncodeStream != null) {
                        mediaEncodeStream.startRecord(r2);
                        return;
                    }
                    IRecorderManager externRecordMgr = liveStream.mRecorderManager.getExternRecordMgr();
                    if (!(externRecordMgr instanceof SharedEncoderRecorder)) {
                        return;
                    }
                    ((SharedEncoderRecorder) externRecordMgr).onEvent(11, 0, 0L, "EncodeStream is null, maybe publish no start.");
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$44_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass44 anonymousClass44) {
                    boolean LIZ;
                    try {
                        anonymousClass44.com_ss_ttlivestreamer_livestreamv2_LiveStream$44__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass44(String str2) {
                    r2 = str2;
                }
            });
        } else {
            z = false;
        }
        RecorderManager recorderManager = this.mRecorderManager;
        if (!z && recorderManager != null) {
            IRecorderManager externRecordMgr = recorderManager.getExternRecordMgr();
            if (externRecordMgr instanceof SharedEncoderRecorder) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Publiser status exception(");
                LIZ.append(this.mStatus);
                LIZ.append(")");
                ((SharedEncoderRecorder) externRecordMgr).onEvent(11, 0, 0L, X1D.LIZIZ(LIZ));
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void switchAudioCapture(int i) {
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer == null || !(audioCapturer instanceof LiveStreamAudioCapture) || !checkAudioCaptureCert(i, true)) {
            return;
        }
        ((LiveStreamAudioCapture) this.mAudioCapture).switchSource(i);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void switchAudioMode(int i) {
        Object obj;
        if (i != 6 && this.mLiveStreamBuilder.getVideoCaptureDevice() == 3) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Screen mode ignore switch, current mode ");
            LIZ.append(this.mAudioRecordMode);
            LIZ.append(", mode=");
            AudioCapturer audioCapturer = this.mAudioCapture;
            if (audioCapturer != null) {
                obj = Integer.valueOf(audioCapturer.getMode());
            } else {
                obj = "-1";
            }
            LIZ.append(obj);
            AVLog.iod("LiveStream", X1D.LIZIZ(LIZ));
            return;
        }
        setAudioRecordMode(i);
        AudioCapturer audioCapturer2 = this.mAudioCapture;
        if (audioCapturer2 != null && (audioCapturer2 instanceof LiveStreamAudioCapture)) {
            ((LiveStreamAudioCapture) audioCapturer2).switchAudioMode(i);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void switchVideoCapture(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Call switchVideoCapture.from");
        LIZ.append(this.mLiveStreamBuilder.getVideoCaptureDevice());
        LIZ.append(" ,to ");
        LIZ.append(i);
        AVLog.ioi("CameraVideoCapturer", X1D.LIZIZ(LIZ));
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new PrivacyCertManager.RunnableWithCert(new RunnableC63881P5h(i, 2, this), new int[]{0}));
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void unRegisterAudioRecordingCallback(AudioManager.AudioRecordingCallback audioRecordingCallback) {
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null && (audioCapturer instanceof LiveStreamAudioCapture)) {
            ((LiveStreamAudioCapture) audioCapturer).unRegisterAudioRecordingCallback(audioRecordingCallback);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ac A[Catch: JSONException -> 0x01ce, TryCatch #1 {JSONException -> 0x01ce, blocks: (B:5:0x002b, B:8:0x004b, B:10:0x0051, B:11:0x0070, B:13:0x0076, B:15:0x007c, B:17:0x00a6, B:19:0x00ac, B:20:0x00b4, B:22:0x00ba, B:23:0x00c2, B:25:0x00c8, B:26:0x00d2, B:28:0x00d8, B:30:0x00de, B:32:0x00e4, B:33:0x00fa, B:35:0x0100, B:36:0x0108, B:38:0x0110, B:39:0x011c, B:41:0x0124, B:42:0x0130, B:44:0x013a, B:80:0x008b, B:82:0x0091, B:84:0x0097), top: B:4:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba A[Catch: JSONException -> 0x01ce, TryCatch #1 {JSONException -> 0x01ce, blocks: (B:5:0x002b, B:8:0x004b, B:10:0x0051, B:11:0x0070, B:13:0x0076, B:15:0x007c, B:17:0x00a6, B:19:0x00ac, B:20:0x00b4, B:22:0x00ba, B:23:0x00c2, B:25:0x00c8, B:26:0x00d2, B:28:0x00d8, B:30:0x00de, B:32:0x00e4, B:33:0x00fa, B:35:0x0100, B:36:0x0108, B:38:0x0110, B:39:0x011c, B:41:0x0124, B:42:0x0130, B:44:0x013a, B:80:0x008b, B:82:0x0091, B:84:0x0097), top: B:4:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8 A[Catch: JSONException -> 0x01ce, TryCatch #1 {JSONException -> 0x01ce, blocks: (B:5:0x002b, B:8:0x004b, B:10:0x0051, B:11:0x0070, B:13:0x0076, B:15:0x007c, B:17:0x00a6, B:19:0x00ac, B:20:0x00b4, B:22:0x00ba, B:23:0x00c2, B:25:0x00c8, B:26:0x00d2, B:28:0x00d8, B:30:0x00de, B:32:0x00e4, B:33:0x00fa, B:35:0x0100, B:36:0x0108, B:38:0x0110, B:39:0x011c, B:41:0x0124, B:42:0x0130, B:44:0x013a, B:80:0x008b, B:82:0x0091, B:84:0x0097), top: B:4:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100 A[Catch: JSONException -> 0x01ce, TryCatch #1 {JSONException -> 0x01ce, blocks: (B:5:0x002b, B:8:0x004b, B:10:0x0051, B:11:0x0070, B:13:0x0076, B:15:0x007c, B:17:0x00a6, B:19:0x00ac, B:20:0x00b4, B:22:0x00ba, B:23:0x00c2, B:25:0x00c8, B:26:0x00d2, B:28:0x00d8, B:30:0x00de, B:32:0x00e4, B:33:0x00fa, B:35:0x0100, B:36:0x0108, B:38:0x0110, B:39:0x011c, B:41:0x0124, B:42:0x0130, B:44:0x013a, B:80:0x008b, B:82:0x0091, B:84:0x0097), top: B:4:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110 A[Catch: JSONException -> 0x01ce, TryCatch #1 {JSONException -> 0x01ce, blocks: (B:5:0x002b, B:8:0x004b, B:10:0x0051, B:11:0x0070, B:13:0x0076, B:15:0x007c, B:17:0x00a6, B:19:0x00ac, B:20:0x00b4, B:22:0x00ba, B:23:0x00c2, B:25:0x00c8, B:26:0x00d2, B:28:0x00d8, B:30:0x00de, B:32:0x00e4, B:33:0x00fa, B:35:0x0100, B:36:0x0108, B:38:0x0110, B:39:0x011c, B:41:0x0124, B:42:0x0130, B:44:0x013a, B:80:0x008b, B:82:0x0091, B:84:0x0097), top: B:4:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124 A[Catch: JSONException -> 0x01ce, TryCatch #1 {JSONException -> 0x01ce, blocks: (B:5:0x002b, B:8:0x004b, B:10:0x0051, B:11:0x0070, B:13:0x0076, B:15:0x007c, B:17:0x00a6, B:19:0x00ac, B:20:0x00b4, B:22:0x00ba, B:23:0x00c2, B:25:0x00c8, B:26:0x00d2, B:28:0x00d8, B:30:0x00de, B:32:0x00e4, B:33:0x00fa, B:35:0x0100, B:36:0x0108, B:38:0x0110, B:39:0x011c, B:41:0x0124, B:42:0x0130, B:44:0x013a, B:80:0x008b, B:82:0x0091, B:84:0x0097), top: B:4:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013a A[Catch: JSONException -> 0x01ce, TryCatch #1 {JSONException -> 0x01ce, blocks: (B:5:0x002b, B:8:0x004b, B:10:0x0051, B:11:0x0070, B:13:0x0076, B:15:0x007c, B:17:0x00a6, B:19:0x00ac, B:20:0x00b4, B:22:0x00ba, B:23:0x00c2, B:25:0x00c8, B:26:0x00d2, B:28:0x00d8, B:30:0x00de, B:32:0x00e4, B:33:0x00fa, B:35:0x0100, B:36:0x0108, B:38:0x0110, B:39:0x011c, B:41:0x0124, B:42:0x0130, B:44:0x013a, B:80:0x008b, B:82:0x0091, B:84:0x0097), top: B:4:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0179 A[Catch: JSONException -> 0x01d2, TryCatch #0 {JSONException -> 0x01d2, blocks: (B:47:0x0142, B:49:0x0148, B:55:0x014d, B:58:0x0158, B:60:0x0171, B:62:0x0179, B:63:0x0185, B:65:0x018d, B:66:0x0199, B:68:0x01a1, B:69:0x01ac, B:72:0x01bc, B:74:0x01c7, B:75:0x01ca, B:79:0x015e), top: B:46:0x0142 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018d A[Catch: JSONException -> 0x01d2, TryCatch #0 {JSONException -> 0x01d2, blocks: (B:47:0x0142, B:49:0x0148, B:55:0x014d, B:58:0x0158, B:60:0x0171, B:62:0x0179, B:63:0x0185, B:65:0x018d, B:66:0x0199, B:68:0x01a1, B:69:0x01ac, B:72:0x01bc, B:74:0x01c7, B:75:0x01ca, B:79:0x015e), top: B:46:0x0142 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a1 A[Catch: JSONException -> 0x01d2, TryCatch #0 {JSONException -> 0x01d2, blocks: (B:47:0x0142, B:49:0x0148, B:55:0x014d, B:58:0x0158, B:60:0x0171, B:62:0x0179, B:63:0x0185, B:65:0x018d, B:66:0x0199, B:68:0x01a1, B:69:0x01ac, B:72:0x01bc, B:74:0x01c7, B:75:0x01ca, B:79:0x015e), top: B:46:0x0142 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c7 A[Catch: JSONException -> 0x01d2, TryCatch #0 {JSONException -> 0x01d2, blocks: (B:47:0x0142, B:49:0x0148, B:55:0x014d, B:58:0x0158, B:60:0x0171, B:62:0x0179, B:63:0x0185, B:65:0x018d, B:66:0x0199, B:68:0x01a1, B:69:0x01ac, B:72:0x01bc, B:74:0x01c7, B:75:0x01ca, B:79:0x015e), top: B:46:0x0142 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c2  */
    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void updateSdkParams(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.LiveStream.updateSdkParams(java.lang.String):void");
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void setBackGroundPhotoPath(String str) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.setBackGroundPhotoPath(str);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void start(String str) {
        DebugLogUtils.isEnableDebugLog();
        if (this.mStatus.get() != 7) {
            this.mUri = str;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Try to start live stream with ");
            LIZ.append(str);
            AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ));
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.6
                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$6__run$___twin___() {
                    LiveStream liveStream = LiveStream.this;
                    liveStream.mEnalbeReconnect = true;
                    liveStream.doStart();
                    LiveStream.this.mStreamLogService.reset();
                    LiveStream.this.mStreamLogService.startPeriodReport();
                    LiveStream liveStream2 = LiveStream.this;
                    liveStream2.mStreamLogService.setReportStallLog(liveStream2.mEanbleReportStallLog);
                }

                public AnonymousClass6() {
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$6_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass6 anonymousClass6) {
                    boolean LIZ2;
                    try {
                        anonymousClass6.com_ss_ttlivestreamer_livestreamv2_LiveStream$6__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        } else {
            AVLog.ioe("LiveStream", "Try to start live stream while mStatus is STATUS_END");
        }
        if (this.mVeLivePusher != null) {
            DebugLogUtils.isEnableDebugLog();
            this.mVeLivePusher.startEncodeAndPublish(str);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void updateSdkParams(TEBundle tEBundle) {
        ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener;
        if (tEBundle == null) {
            AVLog.ioe("LiveStream", "updateSdkParams with a null TEBundle");
            return;
        }
        int videoFps = this.mLiveStreamBuilder.getVideoFps();
        checkBitrateFrameRateForUpdate(tEBundle);
        boolean checkParamsForUpdate = this.mLiveStreamBuilder.checkParamsForUpdate(tEBundle);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateSdkParams-Bundle");
        LIZ.append(tEBundle);
        AVLog.logKibana(5, "LiveStream", X1D.LIZIZ(LIZ), null);
        int videoFps2 = this.mLiveStreamBuilder.getVideoFps();
        if (videoFps != videoFps2 && (iLiveStreamInfoListener = this.mInfoListener) != null) {
            iLiveStreamInfoListener.onInfo(34, videoFps2, 0);
        }
        if (this.mAudioDeviceModule != null && tEBundle.contains("adm_ns_type")) {
            this.mAudioDeviceModule.setParameter(tEBundle);
        }
        adaptedVideoResolution(this.mLiveStreamBuilder.getCaptureAdaptedWidth(), this.mLiveStreamBuilder.getCaptureAdaptedHeight(), this.mLiveStreamBuilder.getVideoFps());
        updateCaptureVideoResolution(this.mLiveStreamBuilder.getVideoCaptureWidth(), this.mLiveStreamBuilder.getVideoCaptureHeight(), this.mLiveStreamBuilder.getVideoCaptureMinFps(), this.mLiveStreamBuilder.getVideoCaptureFps(), this.mLiveStreamBuilder.getVideoCaptureParams().radioModeFps);
        IVeLivePusher iVeLivePusher = this.mVeLivePusher;
        if (iVeLivePusher != null) {
            iVeLivePusher.setPusherAVProperty(tEBundle);
        }
        if (tEBundle.contains("audioBitrate")) {
            int i = tEBundle.getInt("audioBitrate");
            tEBundle.setInt("rtmp_init_audio_bitrate", i);
            tEBundle.setInt("audio_bit_rate", i);
            tEBundle.remove("audioBitrate");
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.48
                public final /* synthetic */ int val$audioBitrate;
                public final /* synthetic */ TEBundle val$optBundle;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$48_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$48__run$___twin___() {
                    MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
                    if (mediaEncodeStream != null) {
                        mediaEncodeStream.setAudioBitrate(r2);
                    }
                    Transport transport = LiveStream.this.mRTMPTransport;
                    if (transport != null) {
                        transport.setParameter(r3);
                    }
                    LiveStream.this.mLiveStreamBuilder.setAudioBitrate(r2);
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$48_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass48 anonymousClass48) {
                    boolean LIZ2;
                    try {
                        anonymousClass48.com_ss_ttlivestreamer_livestreamv2_LiveStream$48__run$___twin___();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }

                public AnonymousClass48(int i2, TEBundle tEBundle2) {
                    r2 = i2;
                    r3 = tEBundle2;
                }
            });
        }
        if (checkParamsForUpdate && this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new ARunnableS9S0101000_5(5, this, 6));
        }
    }

    private void catchAudioInternal(Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        Handler handler;
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer == null || audioCapturer.status() != 1) {
            if (catchMediaDataCallback != null) {
                catchMediaDataCallback.onError(-202, "Maybe AudioCapture not started.");
                return;
            }
            return;
        }
        AudioDeviceModule audioDeviceModule = this.mAudioDeviceModule;
        if (audioDeviceModule != null && (handler = this.mWorkThreadHandler) != null) {
            AudioCatcher.CatchAudio(audioDeviceModule, handler, bundle, catchMediaDataCallback);
        } else {
            if (catchMediaDataCallback == null) {
                return;
            }
            catchMediaDataCallback.onError(-202, "AudioDeviceModule is not ready.");
        }
    }

    private void catchVideoInternal(Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        IFilterManager iFilterManager;
        int i;
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture == null || liveStreamVideoCapture.status() != 1) {
            if (catchMediaDataCallback != null) {
                catchMediaDataCallback.onError(-2, "Maybe VideoCapture not started.");
                return;
            }
            return;
        }
        if (this.mMediaEngineFactory != null && (iFilterManager = this.mFilterManager) != null && (iFilterManager instanceof FilterManager)) {
            int[] iArr = new int[2];
            if (!getAdaptedVideoResolution(iArr) || (i = iArr[0]) <= 0 || iArr[1] <= 0) {
                if (catchMediaDataCallback != null) {
                    catchMediaDataCallback.onError(-2, "getAdaptedVideoResolution fail.");
                    return;
                }
                return;
            } else {
                bundle.putInt("width", i);
                bundle.putInt("height", iArr[1]);
                bundle.putInt("fps", this.mLiveStreamBuilder.getVideoFps());
                ((FilterManager) this.mFilterManager).catchVideo(this.mMediaEngineFactory, bundle, catchMediaDataCallback);
                return;
            }
        }
        if (catchMediaDataCallback == null) {
            return;
        }
        catchMediaDataCallback.onError(-2, "FilterManager is not ready.");
    }

    private boolean checkAudioCaptureCert(int i, boolean z) {
        PrivacyCertManager.CertUnit popCert;
        if ((i != 1 && i != 2 && i != 5) || (popCert = PrivacyCertManager.getInstance().popCert(1)) == null || i == 1) {
            return true;
        }
        try {
            popCert.check();
            return true;
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Method \"");
            AVLog.logToIODevice(6, "LiveStream", JBR.LJFF(LIZ, popCert.methodName, "\" check audio cert failed.", LIZ), e);
            if (z) {
                this.mStatus.set(8);
                reportLiveCoreError(3, 1128616533, e);
                return false;
            }
            return false;
        }
    }

    private void checkIfChangeSource(String str, Object obj) {
        String str2;
        String str3 = "null";
        if (obj == null) {
            obj = "null";
        }
        if ("source".equals(str) && (str2 = this.mLastSourceSeiValue) != null && !str2.equals(obj)) {
            if (obj instanceof String) {
                str3 = (String) obj;
            }
            this.mLastSourceSeiValue = str3;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sei source change. value:");
            LIZ.append(this.mLastSourceSeiValue);
            AVLog.logKibana(4, "LiveStream", X1D.LIZIZ(LIZ), null);
        }
    }

    private void disableAudioEncoder(String str, boolean z) {
        if (this.mAvailableAudioEncoders != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.mAvailableAudioEncoders;
                if (i < strArr.length) {
                    String str2 = strArr[i];
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("audio_type=");
                    LIZ.append(str);
                    if (str2.contains(X1D.LIZIZ(LIZ)) && z == this.mAvailableAudioEncoders[i].contains("audio_enable_accelera=true")) {
                        this.mAvailableAudioEncoders[i] = "";
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private void disableVideoEncoder(String str, boolean z) {
        if (this.mAvailableVideoEncoders != null) {
            int i = 0;
            while (true) {
                String[] strArr = this.mAvailableVideoEncoders;
                if (i < strArr.length) {
                    String str2 = strArr[i];
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("video_type=");
                    LIZ.append(str);
                    if (str2.contains(X1D.LIZIZ(LIZ)) && z == this.mAvailableVideoEncoders[i].contains("video_enable_accelera=true")) {
                        this.mAvailableVideoEncoders[i] = "";
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public static void dumpJavaThreadStackIfNeed(Thread thread, String str) {
        if (LogUtil.logFilterSwitch() && thread != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("{status:");
            LIZ.append(thread.getState());
            LIZ.append(",id:");
            LIZ.append(thread.getId());
            LIZ.append(",name:");
            LIZ.append(thread.getName());
            LIZ.append("}");
            String LIZIZ = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append(".ANR");
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            AVLog.iow(LIZIZ2, LIZIZ);
            AVLog.w(LIZIZ2, LIZIZ);
            StringBuffer stringBuffer = new StringBuffer();
            try {
                for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                    stringBuffer.append(stackTraceElement.getFileName());
                    stringBuffer.append(stackTraceElement.getMethodName());
                    stringBuffer.append("\n");
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("    at ");
                    LIZ3.append(stackTraceElement.getClassName());
                    LIZ3.append(".");
                    LIZ3.append(stackTraceElement.getMethodName());
                    LIZ3.append("(");
                    LIZ3.append(stackTraceElement.getFileName());
                    LIZ3.append(" :");
                    LIZ3.append(stackTraceElement.getLineNumber());
                    LIZ3.append(")\n");
                    String LIZIZ3 = X1D.LIZIZ(LIZ3);
                    AVLog.iow(LIZIZ2, LIZIZ3);
                    AVLog.w(LIZIZ2, LIZIZ3);
                }
                AVLog.logKibana(6, i0.LJFF("ANR@", str), stringBuffer.toString(), null);
            } catch (Throwable unused) {
            }
        }
    }

    private String getNodeOptResultFromStrategySDK(String str, String str2) {
        boolean z;
        JSONArray optJSONArray;
        int i;
        String str3 = null;
        this.mStrategynodeOptimizerInfos = null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("host", str);
            jSONObject.put("stream_session_vv_id", getLiveStreamUrl());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        NodeOptParams nodeOptParams = this.mLiveStreamBuilder.getNodeOptParams();
        if (nodeOptParams != null) {
            z = nodeOptParams.getEnableWaitStrategyCallback();
        } else {
            z = false;
        }
        if (z) {
            if (nodeOptParams != null) {
                i = nodeOptParams.getWaitStrategyCallbackMs();
            } else {
                i = 1000;
            }
            try {
                JSONObject put = jSONObject.put("host", str);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(i);
                LIZ.append("");
                put.put("timeout", X1D.LIZIZ(LIZ));
            } catch (JSONException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            if (this.mNodeListener == null) {
                this.mNodeListener = new NodeListenerImpl(this);
            }
            this.mNodeListener.beforeNodeOptimize();
            LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(1, 13, this.mNodeListener, jSONObject);
            this.mNodeListener.waitForNodeOptimizeResult(i);
        } else {
            this.mStrategynodeOptimizerInfos = (JSONObject) LiveStrategyManager.inst().getConfigAndStrategyByKeyInt(1, 13, null, jSONObject);
        }
        JSONObject jSONObject2 = this.mStrategynodeOptimizerInfos;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("get strategy node optimizer infos: ");
        LIZ2.append(jSONObject2);
        AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ2));
        if (jSONObject2 != null) {
            if (jSONObject2.has("Ip")) {
                str3 = jSONObject2.optString("Ip");
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("get ip from strategy sdk, ip: ");
                LIZ3.append(str3);
                AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ3));
            }
            if (jSONObject2.has("RemoteResult") && this.mPreparedIpList != null && (optJSONArray = jSONObject2.optJSONArray("RemoteResult")) != null) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    arrayList.add(optJSONArray.optString(i2));
                }
                this.mPreparedIpList.put(str2, arrayList);
            }
            if (jSONObject2.has("RequestId")) {
                this.mRequestId = jSONObject2.optString("RequestId");
            }
            if (jSONObject2.has("EvaluatorSymbol")) {
                JSONObject optJSONObject = jSONObject2.optJSONObject("EvaluatorSymbol");
                this.mEvaluatorSymbolMap = optJSONObject;
                if (optJSONObject != null && optJSONObject.has(str3)) {
                    this.mEvaluatorSymbol = this.mEvaluatorSymbolMap.optString(str3);
                }
            }
        }
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0160 A[LOOP:0: B:5:0x001a->B:17:0x0160, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[EDGE_INSN: B:18:0x0036->B:19:0x0036 BREAK  A[LOOP:0: B:5:0x001a->B:17:0x0160], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String[] getOptUrlAndEvaluateSymbol(X.InterfaceC63833P3l r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.LiveStream.getOptUrlAndEvaluateSymbol(X.P3l, java.lang.String):java.lang.String[]");
    }

    public /* synthetic */ void lambda$initBmfVideoFilters$11(JSONObject jSONObject, long j) {
        this.mWorkThreadHandler.post(new IDRunnableS0S0201000(5, this, jSONObject, 11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0137, code lost:
    
        if (r16 != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void lambda$initSITICalculator$2(int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.LiveStream.lambda$initSITICalculator$2(int, java.lang.String):void");
    }

    public /* synthetic */ void lambda$null$8(int i, String str) {
        reportLiveCoreInfo(35, i, str);
    }

    private void removeKaraokeTrack(boolean z, IKaraokeMovie iKaraokeMovie) {
        if (!this.mLiveStreamBuilder.isEnableKTV()) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.51
            public final /* synthetic */ IKaraokeMovie val$movie;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$51_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$51__run$___twin___() {
                IKaraokeMovie iKaraokeMovie2;
                VideoTrack videoTrack;
                if (LiveStream.this.mMediaEncodeStream != null && (iKaraokeMovie2 = r2) != null && (videoTrack = iKaraokeMovie2.getVideoTrack()) != null) {
                    LiveStream.this.mMediaEncodeStream.removeTrack(videoTrack);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$51_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass51 anonymousClass51) {
                boolean LIZ;
                try {
                    anonymousClass51.com_ss_ttlivestreamer_livestreamv2_LiveStream$51__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass51(IKaraokeMovie iKaraokeMovie2) {
                r2 = iKaraokeMovie2;
            }
        });
    }

    private boolean updateSITIConfig(TEBundle tEBundle, boolean z) {
        boolean z2;
        int i;
        int i2;
        if (z) {
            TEBundle tEBundle2 = new TEBundle();
            TEBundle tEBundle3 = new TEBundle();
            TEBundle tEBundle4 = new TEBundle();
            if (tEBundle.contains("width") && tEBundle.contains("height")) {
                int i3 = tEBundle.getInt("width");
                int i4 = tEBundle.getInt("height");
                tEBundle3.setInt("resize_width", i3);
                tEBundle3.setInt("resize_height", i4);
                tEBundle3.setInt("publish_width", i3);
                tEBundle3.setInt("publish_height", i4);
                tEBundle4.setInt("publish_width", i3);
                tEBundle4.setInt("publish_height", i4);
            }
            if (tEBundle.contains("defaultBitrate") && tEBundle.contains("minBitrate") && tEBundle.contains("maxBitrate")) {
                int i5 = tEBundle.getInt("defaultBitrate");
                int i6 = tEBundle.getInt("minBitrate");
                int i7 = tEBundle.getInt("maxBitrate");
                tEBundle4.setInt("publish_def_bitrate", i5);
                tEBundle4.setInt("publish_min_bitrate", i6);
                tEBundle4.setInt("publish_max_bitrate", i7);
            }
            if (tEBundle.contains("fps")) {
                int i8 = tEBundle.getInt("fps");
                RtmpCacheConfig rtmpCacheConfig = this.mLiveStreamBuilder.getSdkSetting().rtmpCacheConfig;
                if (rtmpCacheConfig != null && this.mLiveStreamBuilder.isNetFpsAdaptiveEnable()) {
                    if (NumberInit.isDefined(Integer.valueOf(rtmpCacheConfig.getMinVideoFps())) && rtmpCacheConfig.getMinVideoFps() < i8) {
                        i2 = rtmpCacheConfig.getMinVideoFps();
                    } else {
                        i2 = i8;
                    }
                    if (NumberInit.isDefined(Integer.valueOf(rtmpCacheConfig.getMaxVideoFps())) && rtmpCacheConfig.getMaxVideoFps() > i8) {
                        i = rtmpCacheConfig.getMaxVideoFps();
                    } else {
                        i = i8;
                    }
                } else {
                    i = i8;
                    i2 = i8;
                }
                tEBundle4.setInt("init_video_fps", i8);
                tEBundle4.setInt("max_video_fps", i);
                tEBundle4.setInt("min_video_fps", i2);
            }
            tEBundle2.setBundle("siti_config", tEBundle3);
            tEBundle2.setBundle("enc_strategy_config", tEBundle4);
            this.mWorkThreadHandler.post(new ARunnableS10S0201000_7(1, this, tEBundle2, 1));
            cancelSITIBitrateFrameRate();
            z2 = true;
        } else {
            z2 = false;
        }
        if (tEBundle.contains("enable_siti")) {
            final boolean bool = tEBundle.getBool("enable_siti");
            SITICalculator sITICalculator = this.mSITICalculator;
            if (sITICalculator != null && sITICalculator.isEnabled() != bool) {
                this.mWorkThreadHandler.post(new Runnable() { // from class: X.P2n
                    @Override // java.lang.Runnable
                    public final void run() {
                        LiveStream.this.lambda$updateSITIConfig$1(bool);
                    }
                });
                if (!bool) {
                    cancelSITIBitrateFrameRate();
                    return true;
                }
            }
        }
        return z2;
    }

    private void uploadVideoEncoderChangeLog(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", "Change videoEncoder");
            jSONObject.put("lastEncoder", str);
            jSONObject.put("newEncoder", str2);
        } catch (Exception unused) {
        }
        AVLog.logKibana(4, "Change videoEncoder", jSONObject.toString(), null);
    }

    /* renamed from: adaptVideoFpsForEncode */
    public void lambda$adaptVideoFpsForEncode$3(final int i, final String str) {
        VideoTrack videoTrack;
        DebugLogUtils.isEnableDebugLog();
        if (this.mWorkThreadHandler == null) {
            return;
        }
        if (C16880lQ.LLLLIIIILLL() != this.mWorkThreadHandler.getLooper().getThread()) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: X.P2o
                @Override // java.lang.Runnable
                public final void run() {
                    LiveStream.this.lambda$adaptVideoFpsForEncode$3(i, str);
                }
            });
            return;
        }
        this.mBpsFpsUpdater.calculateFpsForEncode(i, str);
        MediaEncodeStream mediaEncodeStream = this.mMediaEncodeStream;
        if (mediaEncodeStream != null && (videoTrack = this.mVideoTrack) != null && mediaEncodeStream.containTrack(videoTrack)) {
            TEBundle tEBundle = new TEBundle();
            TEBundle tEBundle2 = new TEBundle();
            int fpsForEncode = this.mBpsFpsUpdater.getFpsForEncode();
            boolean z = this.mLiveStreamBuilder.getPushBase().videoAdapterEnableSmooth;
            tEBundle2.setString("trackId", this.mVideoTrack.id());
            tEBundle2.setInt("video_fps", fpsForEncode);
            tEBundle2.setBool("video_adapter_enable_smooth", z);
            tEBundle.setBundle("video_fps_param_for_encode", tEBundle2);
            this.mMediaEncodeStream.setParameter(tEBundle);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void adaptedVideoResolution(int i, int i2) {
        adaptedVideoResolution(i, i2, 0);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void catchMediaData(Bundle bundle, ILiveStream.CatchPicCallback catchPicCallback) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture == null || liveStreamVideoCapture.status() != 1) {
            if (catchPicCallback != null) {
                catchPicCallback.onError(-2, "Maybe VideoCapture not started.");
            }
        } else if (this.mFilterManager instanceof FilterManager) {
            bundle.putInt("width", this.mLiveStreamBuilder.getVideoWidth());
            bundle.putInt("height", this.mLiveStreamBuilder.getVideoHeight());
            ((FilterManager) this.mFilterManager).catchPic(bundle, catchPicCallback);
        } else {
            if (catchPicCallback == null) {
                return;
            }
            catchPicCallback.onError(-2, "FilterManager is not ready.");
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void catchVideo(Bundle bundle, ILiveStream.CatchVideoCallback catchVideoCallback) {
        catchMediaData(bundle, catchVideoCallback);
    }

    public void changeToKTVMode(boolean z, IKaraokeMovie iKaraokeMovie) {
        if (!this.mLiveStreamBuilder.isEnableKTV()) {
            return;
        }
        ThreadUtils.invokeAtFrontUninterruptibly(this.mWorkThreadHandler, new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.52
            public final /* synthetic */ boolean val$KTVMode;
            public final /* synthetic */ IKaraokeMovie val$movie;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$52_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$52__run$___twin___() {
                VideoTrack videoTrack;
                VideoTrack videoTrack2;
                VideoTrack videoTrack3;
                LiveStream liveStream = LiveStream.this;
                IKaraokeMovie iKaraokeMovie2 = r2;
                liveStream.mKaraokeMovie = iKaraokeMovie2;
                boolean z2 = r3;
                liveStream.mIsKaraokeMovie = z2;
                if (z2) {
                    if (iKaraokeMovie2 == null) {
                        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG");
                        if (!AnonymousClass028.LJI(androidRuntimeException, "LiveStream.changeToKTVMode")) {
                            return;
                        } else {
                            throw androidRuntimeException;
                        }
                    }
                    VideoTrack videoTrack4 = liveStream.mVideoTrack;
                    if (videoTrack4 != null && !videoTrack4.containVideoSink(iKaraokeMovie2.getCameraVideoSink())) {
                        LiveStream.this.mVideoTrack.addVideoSink(r2.getCameraVideoSink());
                    }
                    LiveStream liveStream2 = LiveStream.this;
                    MediaEncodeStream mediaEncodeStream = liveStream2.mMediaEncodeStream;
                    if (mediaEncodeStream != null && (videoTrack3 = liveStream2.mVideoTrack) != null) {
                        mediaEncodeStream.removeTrack(videoTrack3);
                        if (!LiveStream.this.mMediaEncodeStream.containTrack(r2.getVideoTrack())) {
                            LiveStream.this.mMediaEncodeStream.addTrack(r2.getVideoTrack());
                            LiveStream.this.mMediaEncodeStream.setOriginVideoTrack(r2.getVideoTrack().id());
                        }
                    }
                    LiveStream liveStream3 = LiveStream.this;
                    TextureFrameAvailableSink textureFrameAvailableSink = liveStream3.mTextureFrameAvailableSink;
                    if (textureFrameAvailableSink != null && (videoTrack2 = liveStream3.mVideoTrack) != null) {
                        videoTrack2.removeVideoSink(textureFrameAvailableSink);
                        if (!r2.getVideoTrack().containVideoSink(LiveStream.this.mTextureFrameAvailableSink)) {
                            r2.getVideoTrack().addVideoSink(LiveStream.this.mTextureFrameAvailableSink);
                            return;
                        }
                        return;
                    }
                    return;
                }
                VideoTrack videoTrack5 = liveStream.mVideoTrack;
                if (videoTrack5 != null && iKaraokeMovie2 != null) {
                    videoTrack5.removeVideoSink(iKaraokeMovie2.getCameraVideoSink());
                }
                LiveStream liveStream4 = LiveStream.this;
                MediaEncodeStream mediaEncodeStream2 = liveStream4.mMediaEncodeStream;
                if (mediaEncodeStream2 != null && liveStream4.mVideoTrack != null) {
                    IKaraokeMovie iKaraokeMovie22 = r2;
                    if (iKaraokeMovie22 != null) {
                        mediaEncodeStream2.removeTrack(iKaraokeMovie22.getVideoTrack());
                    }
                    LiveStream liveStream5 = LiveStream.this;
                    if (!liveStream5.mMediaEncodeStream.containTrack(liveStream5.mVideoTrack)) {
                        LiveStream liveStream6 = LiveStream.this;
                        liveStream6.mMediaEncodeStream.addTrack(liveStream6.mVideoTrack);
                        LiveStream liveStream7 = LiveStream.this;
                        liveStream7.mMediaEncodeStream.setOriginVideoTrack(liveStream7.mVideoTrack.id());
                    }
                }
                LiveStream liveStream8 = LiveStream.this;
                if (liveStream8.mTextureFrameAvailableSink != null && liveStream8.mVideoTrack != null) {
                    IKaraokeMovie iKaraokeMovie3 = r2;
                    if (iKaraokeMovie3 != null && (videoTrack = iKaraokeMovie3.getVideoTrack()) != null) {
                        videoTrack.removeVideoSink(LiveStream.this.mTextureFrameAvailableSink);
                    }
                    LiveStream liveStream9 = LiveStream.this;
                    if (!liveStream9.mVideoTrack.containVideoSink(liveStream9.mTextureFrameAvailableSink)) {
                        LiveStream liveStream10 = LiveStream.this;
                        liveStream10.mVideoTrack.addVideoSink(liveStream10.mTextureFrameAvailableSink);
                    }
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$52_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass52 anonymousClass52) {
                boolean LIZ;
                try {
                    anonymousClass52.com_ss_ttlivestreamer_livestreamv2_LiveStream$52__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass52(IKaraokeMovie iKaraokeMovie2, boolean z2) {
                r2 = iKaraokeMovie2;
                r3 = z2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void changeVideoResolution(int i, int i2) {
        TEBundle tEBundle = new TEBundle();
        tEBundle.setInt("width", align(i));
        tEBundle.setInt("height", align(i2));
        tEBundle.setInt("cap_adapted_width", align(i));
        tEBundle.setInt("cap_adapted_height", align(i2));
        tEBundle.setString("from", "user");
        updateSdkParams(tEBundle);
        tEBundle.release();
    }

    public MediaTrack createTrack(MediaSource mediaSource, String str) {
        MediaEngineFactory mediaEngineFactory = this.mMediaEngineFactory;
        if (mediaEngineFactory != null && mediaSource != null) {
            if (mediaSource instanceof VideoSource) {
                return mediaEngineFactory.createVideoTrack((VideoSource) mediaSource, str);
            }
            if (mediaSource instanceof AudioSource) {
                return mediaEngineFactory.createAudioTrack((AudioSource) mediaSource, str);
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void enableMirror(boolean z, boolean z2) {
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.23
            public final /* synthetic */ boolean val$isHorizontal;
            public final /* synthetic */ boolean val$mirror;
            public final /* synthetic */ Throwable val$stack;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$23__run$___twin___() {
                Object obj;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Call enableMirror(");
                LIZ.append(r2);
                LIZ.append(", ");
                LIZ.append(r3);
                LIZ.append("), last mirror status: ");
                LiveStreamVideoCapture liveStreamVideoCapture = LiveStream.this.mVideoCapturer;
                if (liveStreamVideoCapture != null) {
                    obj = Boolean.valueOf(liveStreamVideoCapture.isMirror(r3));
                } else {
                    obj = "null";
                }
                LIZ.append(obj);
                LIZ.append(". ");
                AVLog.logKibana(4, "LiveStream", X1D.LIZIZ(LIZ), r4);
                LiveStreamVideoCapture liveStreamVideoCapture2 = LiveStream.this.mVideoCapturer;
                if (liveStreamVideoCapture2 != null) {
                    liveStreamVideoCapture2.enableMirror(r2, r3);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$23_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass23 anonymousClass23) {
                boolean LIZ;
                try {
                    anonymousClass23.com_ss_ttlivestreamer_livestreamv2_LiveStream$23__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass23(boolean z3, boolean z22, Throwable th) {
                r2 = z3;
                r3 = z22;
                r4 = th;
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        if (r3 != false) goto L27;
     */
    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void enableMixer(boolean r3, boolean r4) {
        /*
            r2 = this;
            if (r3 != 0) goto Le
            boolean r0 = r2.mIsRadioMode
            if (r0 == 0) goto Le
            java.lang.String r1 = "LiveStream"
            java.lang.String r0 = "Can not set VideoMixerMode In BlackFrameMode,Set it to false."
            com.ss.ttlivestreamer.core.utils.AVLog.iow(r1, r0)
            r4 = 0
        Le:
            com.ss.ttlivestreamer.core.engine.MediaEncodeStream r0 = r2.mMediaEncodeStream
            if (r0 == 0) goto L1e
            if (r3 == 0) goto L21
            com.ss.ttlivestreamer.core.mixer.AudioMixer r0 = r0.getAudioMixer()
            r0.setEnable(r4)
        L1b:
            r2.mAudioMixer = r4
        L1d:
            return
        L1e:
            if (r3 == 0) goto L28
            goto L1b
        L21:
            com.ss.ttlivestreamer.core.mixer.VideoMixer r0 = r0.getVideoMixer()
            r0.setEnable(r4)
        L28:
            r2.mVideoMixer = r4
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.LiveStream.enableMixer(boolean, boolean):void");
    }

    public boolean isExists(int[] iArr, int i) {
        if (iArr != null && iArr.length != 0) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.ttlivestreamer.core.capture.audio.AudioCapturer.AudioCaptureObserver
    public void onAudioCaptureError(int i, Exception exc) {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.34
                public final /* synthetic */ int val$code;
                public final /* synthetic */ Exception val$e;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$34_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$34__run$___twin___() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onAudioCaptureError: code ");
                    LIZ.append(r2);
                    LIZ.append(", message ");
                    LIZ.append(r3.toString());
                    AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
                    LiveStream.this.mStatus.set(8);
                    LiveStream.this.reportLiveCoreError(3, r2, r3);
                    LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
                    if (liveStreamLogService != null) {
                        liveStreamLogService.setDeviceOpenErrorCode(true, r2);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$34_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass34 anonymousClass34) {
                    boolean LIZ;
                    try {
                        anonymousClass34.com_ss_ttlivestreamer_livestreamv2_LiveStream$34__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass34(int i2, Exception exc2) {
                    r2 = i2;
                    r3 = exc2;
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.Observer
    public void onVideoCaptureError(int i, Exception exc) {
        if (this.mStatus.get() != 7) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.27
                public final /* synthetic */ int val$code;
                public final /* synthetic */ Exception val$e;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$27_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$27__run$___twin___() {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onVideoCaptureError: code ");
                    LIZ.append(r2);
                    LIZ.append(", message ");
                    LIZ.append(r3.toString());
                    AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
                    LiveStream liveStream = LiveStream.this;
                    LiveStreamBuilder liveStreamBuilder = liveStream.mLiveStreamBuilder;
                    LiveStreamVideoCapture liveStreamVideoCapture = liveStream.mVideoCapturer;
                    int i2 = liveStream.mStatus.get();
                    LiveStream.this.mStatus.set(8);
                    if (liveStreamVideoCapture != null) {
                        if (LiveStream.this.isExists(Constants.VIDEO_CAPTURE_ERROR_ALLOW_RETRY, r2) && liveStreamVideoCapture.getCurrentCaptureDevice() == 3) {
                            LiveStream.this.mStatus.set(i2);
                        }
                    } else if (liveStreamBuilder != null && LiveStream.this.isExists(Constants.VIDEO_CAPTURE_ERROR_ALLOW_RETRY, r2) && liveStreamBuilder.getVideoCaptureDevice() == 3) {
                        LiveStream.this.mStatus.set(i2);
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("onVideoCaptureError: code ");
                    LIZ2.append(r2);
                    LIZ2.append(" mStatus:");
                    LIZ2.append(LiveStream.this.mStatus.get());
                    AVLog.logKibana(6, "LiveStream", X1D.LIZIZ(LIZ2), r3);
                    LiveStream.this.reportLiveCoreError(2, r2, r3);
                    LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
                    if (liveStreamLogService != null) {
                        liveStreamLogService.setDeviceOpenErrorCode(false, r2);
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$27_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass27 anonymousClass27) {
                    boolean LIZ;
                    try {
                        anonymousClass27.com_ss_ttlivestreamer_livestreamv2_LiveStream$27__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass27(int i2, Exception exc2) {
                    r2 = i2;
                    r3 = exc2;
                }
            });
        }
    }

    public void onVideoEncodeFpsAdjust(int i, int i2) {
        EncodeFpsAdjustStrategy encodeFpsAdjustStrategy = this.mEncodeFpsAdjustStrategy;
        if (encodeFpsAdjustStrategy == null) {
            LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
            if (liveStreamBuilder != null) {
                this.mEncodeFpsAdjustStrategy = new EncoderFpsAdjustStrategyAvg(liveStreamBuilder.getChangeEncodeFpsThreshold(), this.mLiveStreamBuilder.getMaxChangeEncodeFpsTimes());
                return;
            }
            return;
        }
        int adjustFps = encodeFpsAdjustStrategy.getAdjustFps(i, i2);
        if (adjustFps == 0) {
            return;
        }
        changeVideoFps(adjustFps);
        LiveStreamLogService liveStreamLogService = this.mStreamLogService;
        if (liveStreamLogService == null) {
            return;
        }
        liveStreamLogService.uploadVideoEncodeFpsAdjustLog(i, adjustFps);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void registerAudioRecordingCallback(Executor executor, AudioManager.AudioRecordingCallback audioRecordingCallback) {
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null && (audioCapturer instanceof LiveStreamAudioCapture)) {
            ((LiveStreamAudioCapture) audioCapturer).registerAudioRecordingCallback(executor, audioRecordingCallback);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void registerScreenAudioPlayBack(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, int i) {
        registerScreenAudioPlayBack(iAudioRecordThreadObserver, i, null);
    }

    public void sendSdkControlMsgInternal(String str, JSONObject jSONObject) {
        String str2;
        boolean z;
        if ("push_restart".equals(str)) {
            String str3 = null;
            if (!jSONObject.isNull("sdk_params")) {
                str2 = JSONObjectProtectorUtils.getString(jSONObject, "sdk_params");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sdkParams:");
                LIZ.append(str2);
                AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ));
            } else {
                str2 = null;
            }
            if (!jSONObject.isNull("force_switch_node")) {
                z = JSONObjectProtectorUtils.getBoolean(jSONObject, "force_switch_node");
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("forceSwitchNode:");
                LIZ2.append(z);
                AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ2));
            } else {
                z = false;
            }
            if (!jSONObject.isNull("url")) {
                str3 = JSONObjectProtectorUtils.getString(jSONObject, "url");
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("url:");
                LIZ3.append(z);
                AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ3));
            }
            if (!TextUtils.isEmpty(str3)) {
                this.mUri = str3;
            }
            updateUrlPriority();
            getOptimizedUrl();
            if (!TextUtils.isEmpty(str2)) {
                LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
                liveStreamBuilder.setupSdkParams(str2);
                this.mLiveStreamBuilder = liveStreamBuilder;
                adjustParameters(liveStreamBuilder);
                AVLog.ioi("LiveStream", C16880lQ.LLLZI(Locale.getDefault(), "publish params change to [fps:%d,width:%d,height:%d,mix_width:%d,mix_height:%d,min_bitrate:%d,max_bitrate:%d]", new Object[]{Integer.valueOf(this.mLiveStreamBuilder.getVideoFps()), Integer.valueOf(this.mLiveStreamBuilder.getVideoWidth()), Integer.valueOf(this.mLiveStreamBuilder.getVideoHeight()), 0, 0, Integer.valueOf(this.mLiveStreamBuilder.getVideoMinBitrate()), Integer.valueOf(this.mLiveStreamBuilder.getVideoMaxBitrate())}));
            }
            if (this.mStatus.get() != 2 && this.mStatus.get() != 3) {
                reportLiveCoreInfo(39, 0, 0);
            } else {
                restartPublish(str2, z, str3);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void catchMediaData(Bundle bundle, ILiveStream.CatchMediaDataCallback catchMediaDataCallback) {
        int i;
        if (bundle != null) {
            i = bundle.getInt("mode", -1);
            if (i >= 0) {
                if (i == 10) {
                    catchAudioInternal(bundle, catchMediaDataCallback);
                    return;
                } else {
                    catchVideoInternal(bundle, catchMediaDataCallback);
                    return;
                }
            }
        } else {
            i = -2;
        }
        if (catchMediaDataCallback != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(i);
            LIZ.append("param error: mode ");
            LIZ.append(i);
            LIZ.append(", param ");
            LIZ.append(bundle);
            catchMediaDataCallback.onError(-1, X1D.LIZIZ(LIZ));
        }
    }

    public LiveStream(LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2) {
        this(liveStreamBuilder, handler, handler2, null, null);
    }

    private String setUrlPrefixAndPort(String str, int i, String str2) {
        String str3;
        int indexOf = str2.indexOf("://");
        if (indexOf > 0) {
            str2 = str2.substring(indexOf + 3);
        }
        int indexOf2 = str2.indexOf("/", 0);
        int indexOf3 = str2.indexOf(":", 0);
        if (indexOf2 > 0) {
            if (indexOf3 <= 0) {
                indexOf3 = indexOf2;
            }
            String substring = str2.substring(0, indexOf3);
            str3 = str2.substring(indexOf2);
            str2 = substring;
        } else {
            str3 = "";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        LIZ.append(":");
        LIZ.append(i);
        LIZ.append(str3);
        return X1D.LIZIZ(LIZ);
    }

    private boolean shouldReconnectWitchCurrentUrl(int i, int i2, long j) {
        if (isUsingOptimizedUrl()) {
            if (this.mOptUrlReachable != 1) {
                this.mOptUrlReachable = 0;
            }
        } else if (this.mUriReachable != 1) {
            this.mUriReachable = 0;
        }
        if (isUsingOptimizedUrl()) {
            if (this.mRtmpReConnectCounts >= (this.mLiveStreamBuilder.getRtmpReconnectCounts() + 1) / 2) {
                invalidateOptimizedUrl();
            }
            return true;
        }
        if (this.mUri != null) {
            if (this.mRtmpReConnectCounts >= this.mLiveStreamBuilder.getRtmpReconnectCounts()) {
                return false;
            }
            return true;
        }
        if (this.mUris == null) {
            return false;
        }
        if ((enableUrlFallBack(i) && this.mUris.size() > 1 && this.mUriReachable == 0) || this.mRtmpReConnectCounts >= this.mLiveStreamBuilder.getRtmpReconnectCounts()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void adaptedVideoResolution(int i, int i2, int i3) {
        StringBuilder LIZJ = C06460Ne.LIZJ("Encode Params changed(changeAdaptedResolution): Change to:(", i, ",", i2, ",");
        LIZJ.append(i3);
        LIZJ.append(")");
        AVLog.iod("LiveStream", X1D.LIZIZ(LIZJ));
        Handler handler = this.mWorkThreadHandler;
        AnonymousClass49 anonymousClass49 = new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.49
            public final /* synthetic */ int val$fps;
            public final /* synthetic */ int val$height;
            public final /* synthetic */ int val$width;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$49_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$49__run$___twin___() {
                boolean z;
                LiveStream liveStream = LiveStream.this;
                LiveStreamVideoCapture liveStreamVideoCapture = liveStream.mVideoCapturer;
                int i4 = r2;
                LiveStreamBuilder liveStreamBuilder = liveStream.mLiveStreamBuilder;
                if (liveStreamBuilder != null) {
                    int resolutionAdaptedQuirks = liveStreamBuilder.getResolutionAdaptedQuirks();
                    if (i4 < 1) {
                        i4 = liveStreamBuilder.getVideoFps();
                    }
                    if (liveStreamBuilder.isDropFramesDisabled()) {
                        i4 = -1;
                    }
                    TEBundle tEBundle = LiveStream.this.mVideoAdaptParams;
                    if (tEBundle != null) {
                        tEBundle.setBool("video_adapter_enable_smooth", false);
                        LiveStream.this.mVideoAdaptParams.setBool("video_adapter_enable_drop_adapt", false);
                        LiveStream.this.mVideoAdaptParams.setBool("video_adapter_disable_drop_frame", false);
                        LiveStream.this.mVideoAdaptParams.setInt("video_adapter_ext_fps", 0);
                    }
                    boolean z2 = liveStreamBuilder.getPushBase().videoAdapterEnableDropAdapter;
                    boolean z3 = liveStreamBuilder.getPushBase().videoAdapterDisableDropFrame;
                    boolean z4 = liveStreamBuilder.getPushBase().videoAdapterEnableSmooth;
                    int i22 = liveStreamBuilder.getPushBase().videoAdapterExtFps;
                    if (i22 > 0 && liveStreamBuilder.getVideoFps() >= liveStreamBuilder.getVideoCaptureFps()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z3 || z2 || z4 || z) {
                        LiveStream liveStream2 = LiveStream.this;
                        if (liveStream2.mVideoAdaptParams == null) {
                            liveStream2.mVideoAdaptParams = new TEBundle();
                        }
                        LiveStream.this.mVideoAdaptParams.setBool("video_adapter_enable_smooth", z4);
                        LiveStream.this.mVideoAdaptParams.setBool("video_adapter_enable_drop_adapt", z2);
                        LiveStream.this.mVideoAdaptParams.setBool("video_adapter_disable_drop_frame", z3);
                        TEBundle tEBundle2 = LiveStream.this.mVideoAdaptParams;
                        if (!z) {
                            i22 = 0;
                        }
                        tEBundle2.setInt("video_adapter_ext_fps", i22);
                        if (z2) {
                            long j = liveStreamBuilder.getPushBase().videoAdapterMaxFluFps;
                            long j2 = liveStreamBuilder.getPushBase().videoAdapterDropCheckIntervalNs;
                            LiveStream.this.mVideoAdaptParams.setLong("video_adapter_drop_adapt_max_flu_fps", j);
                            LiveStream.this.mVideoAdaptParams.setLong("video_adapter_drop_adapt_check_interval", j2);
                        }
                    }
                    if (liveStreamBuilder.isEnableFovSmallWindowOpt()) {
                        LiveStream liveStream3 = LiveStream.this;
                        if (liveStream3.mVideoAdaptParams == null) {
                            liveStream3.mVideoAdaptParams = new TEBundle();
                        }
                    }
                    TEBundle tEBundle3 = LiveStream.this.mVideoAdaptParams;
                    if (tEBundle3 != null) {
                        tEBundle3.setBool("video_fov_small_window_opt", liveStreamBuilder.isEnableFovSmallWindowOpt());
                        LiveStream.this.mVideoAdaptParams.setInt("video_fov_crop_aspect_width", liveStreamBuilder.getFovOptCropAspectWidth());
                        LiveStream.this.mVideoAdaptParams.setInt("video_fov_crop_aspect_height", liveStreamBuilder.getFovOptCropAspectHeight());
                        LiveStream.this.mVideoAdaptParams.setInt("video_fov_opt_max_piexel_size", liveStreamBuilder.getFovOptMaxPiexelSize());
                    }
                    LiveStream liveStream4 = LiveStream.this;
                    TEBundle tEBundle4 = liveStream4.mVideoAdaptParams;
                    liveStream4.gpuTurboWrapper.initAdaptSize(r3, r4);
                    LiveStream liveStream5 = LiveStream.this;
                    liveStream5.gpuTurboWrapper.initCaptureSize(liveStream5.mLiveStreamBuilder.getVideoCaptureWidth(), LiveStream.this.mLiveStreamBuilder.getVideoCaptureHeight());
                    LiveStream.this.adaptResolutionUtils.initAdaptFormatParams(resolutionAdaptedQuirks, liveStreamVideoCapture, i4, tEBundle4);
                    LiveStream liveStream6 = LiveStream.this;
                    liveStream6.gpuTurboWrapper.refreshEffectSRStatus(liveStream6.mFilterManager, liveStream6.adaptResolutionUtils, true);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$49_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass49 anonymousClass492) {
                boolean LIZ;
                try {
                    anonymousClass492.com_ss_ttlivestreamer_livestreamv2_LiveStream$49__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass49(int i32, int i4, int i22) {
                r2 = i32;
                r3 = i4;
                r4 = i22;
            }
        };
        if (handler != null) {
            if (handler.getLooper().getThread() == C16880lQ.LLLLIIIILLL()) {
                anonymousClass49.run();
            } else {
                handler.post(anonymousClass49);
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i) {
        return addSeiField(str, obj, i, true, true);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void addUserMetaData(String str, String str2, int i) {
        this.mUserMetadata.put(str, new UserMetadata(str, str2, i));
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.19
            public final /* synthetic */ int val$flag;
            public final /* synthetic */ String val$key;
            public final /* synthetic */ String val$value;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$19__run$___twin___() {
                Transport transport = LiveStream.this.mRTMPTransport;
                if (transport != null) {
                    transport.addUserMetaData(r2, r3, r4);
                }
                IVeLivePusher iVeLivePusher = LiveStream.this.mVeLivePusher;
                if (iVeLivePusher != null) {
                    iVeLivePusher.addUserMetaData(r2, r3, r4);
                }
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$19_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass19 anonymousClass19) {
                boolean LIZ;
                try {
                    anonymousClass19.com_ss_ttlivestreamer_livestreamv2_LiveStream$19__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass19(String str3, String str22, int i2) {
                r2 = str3;
                r3 = str22;
                r4 = i2;
            }
        });
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void changeVideoBitrate(int i, int i2, int i3) {
        TEBundle tEBundle = new TEBundle();
        tEBundle.setInt("defaultBitrate", i);
        tEBundle.setInt("minBitrate", i2);
        tEBundle.setInt("maxBitrate", i3);
        tEBundle.setString("from", "user");
        updateSdkParams(tEBundle);
        tEBundle.release();
    }

    public void onAVFrameSyncError(int i, int i2, long j) {
        if (i == 8) {
            StringBuilder LIZJ = V10.LIZJ("avSync error before encoding: audio timestamp ", i2 + j, ", video timestamp ");
            LIZJ.append(j);
            AVLog.ioe("LiveStream", X1D.LIZIZ(LIZJ));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r0 == 4) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onEncodeCreateEvent(int r20, int r21, long r22) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.LiveStream.onEncodeCreateEvent(int, int, long):void");
    }

    @Override // com.ss.ttlivestreamer.core.strategy.LiveStreamBaseStrategy.IStrategyNotify
    public void onLiveOptionChanged(TEBundle tEBundle, TEBundle tEBundle2, TEBundle tEBundle3) {
        DebugLogUtils.isEnableDebugLog();
        if (tEBundle != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLiveOptionChanged:Encode:");
            LIZ.append(tEBundle.toString());
            AVLog.logKibana(5, "LiveStream", X1D.LIZIZ(LIZ), null);
            this.mMediaEncodeStream.setParameter(tEBundle);
        }
        if (tEBundle2 != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLiveOptionChanged:Transport:");
            LIZ2.append(tEBundle2.toString());
            AVLog.logKibana(5, "LiveStream", X1D.LIZIZ(LIZ2), null);
            this.mRTMPTransport.setParameter(tEBundle2);
        }
        if (tEBundle3 != null) {
            if (tEBundle3.contains("settings_log_interval")) {
                long j = tEBundle3.getLong("settings_log_interval");
                LiveStreamLogService liveStreamLogService = this.mStreamLogService;
                if (liveStreamLogService != null) {
                    liveStreamLogService.setLogInterval(j);
                }
            }
            if (tEBundle3.contains("settings_auto_brighten")) {
                boolean bool = tEBundle3.getBool("settings_auto_brighten");
                IFilterManager iFilterManager = this.mFilterManager;
                if (iFilterManager != null) {
                    iFilterManager.enableAutoBrightenFilter(bool);
                }
            }
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public void registerScreenAudioPlayBack(AudioRecordThread.IAudioRecordThreadObserver iAudioRecordThreadObserver, int i, Cert cert) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.registerScreenAudioPlayBack(iAudioRecordThreadObserver, i, cert);
        }
    }

    public void reportBitrateAdjust(int i, long j, String str) {
        int i2;
        String str2 = str;
        LiveStreamLogService liveStreamLogService = this.mStreamLogService;
        if (liveStreamLogService != null) {
            int videoMinBitrate = this.mLiveStreamBuilder.getVideoMinBitrate();
            int videoMaxBitrate = this.mLiveStreamBuilder.getVideoMaxBitrate();
            if (i == 1) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
            liveStreamLogService.onBitrateAdjust(j, i2, videoMinBitrate, videoMaxBitrate, str2);
        }
    }

    public void reportFpsAdjust(int i, int i2, String str) {
        int i3;
        int i4;
        String str2;
        LiveStreamLogService liveStreamLogService = this.mStreamLogService;
        if (liveStreamLogService != null) {
            RtmpCacheConfig rtmpCacheCfgParams = this.mLiveStreamBuilder.getRtmpCacheCfgParams();
            if (rtmpCacheCfgParams != null && this.mLiveStreamBuilder.isNetFpsAdaptiveEnable()) {
                i3 = rtmpCacheCfgParams.getMinVideoFps();
                i4 = rtmpCacheCfgParams.getMaxVideoFps();
            } else {
                i3 = 0;
                i4 = 0;
            }
            StringBuilder LIZ = X1D.LIZ();
            if (i2 > i) {
                str2 = "up-";
            } else {
                str2 = "down-";
            }
            liveStreamLogService.onFpsAdjust(i, i2, i3, i4, JBR.LJFF(LIZ, str2, str, LIZ));
        }
    }

    public void reportLiveCoreError(int i, int i2, Exception exc) {
        boolean canThrowException;
        AndroidRuntimeException androidRuntimeException;
        DebugLogUtils.isEnableDebugLog();
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
        DebugLogUtils.isEnableDebugLog();
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

    public void restartPublish(String str, boolean z, String str2) {
        if (this.mStatus.get() == 2 || this.mStatus.get() == 3) {
            if (C16880lQ.LLLLIIIILLL() != this.mWorkThreadHandler.getLooper().getThread()) {
                this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.50
                    public final /* synthetic */ boolean val$forceSwitchNode;
                    public final /* synthetic */ String val$sdkParams;
                    public final /* synthetic */ String val$url;

                    @Override // java.lang.Runnable
                    public void run() {
                        com_ss_ttlivestreamer_livestreamv2_LiveStream$50_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                    }

                    public void com_ss_ttlivestreamer_livestreamv2_LiveStream$50__run$___twin___() {
                        LiveStream.this.restartPublish(r2, r3, r4);
                    }

                    public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$50_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass50 anonymousClass50) {
                        boolean LIZ;
                        try {
                            anonymousClass50.com_ss_ttlivestreamer_livestreamv2_LiveStream$50__run$___twin___();
                        } finally {
                            if (LIZ) {
                            }
                        }
                    }

                    public AnonymousClass50(String str3, boolean z2, String str22) {
                        r2 = str3;
                        r3 = z2;
                        r4 = str22;
                    }
                });
                return;
            }
            destroyEncodeStream();
            createEncoderStream();
            setupTransport();
            AVLog.ioi("LiveStream", "restart publish");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("mStatus status is ");
        LIZ.append(this.mStatus.get());
        LIZ.append(" on restartPublish");
        AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ));
        doStop();
    }

    public void sendResultToLiveStreamEventTracker(int i, int i2, int i3) {
        if (this.mLiveStreamEventTracker != null) {
            this.mLiveStreamEventTracker.handleRtmpConnectResult(new LiveStreamConnectResultEventResult(i, i2, i3));
        }
    }

    private void reportLiveCoreInfo(int i, int i2, String str) {
        boolean canThrowException;
        AndroidRuntimeException androidRuntimeException;
        DebugLogUtils.isEnableDebugLog();
        ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = this.mInfoListener;
        if (iLiveStreamInfoListener != null) {
            try {
                iLiveStreamInfoListener.onInfo(i, i2, str);
            } finally {
                if (!canThrowException) {
                }
            }
        }
    }

    /* loaded from: classes12.dex */
    public class UserMetadata {
        public int flag;
        public String key;
        public String value;

        public UserMetadata(String str, String str2, int i) {
            this.key = str;
            this.value = str2;
            this.flag = i;
        }
    }

    public LiveStream(LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule) {
        this(liveStreamBuilder, handler, handler2, audioDeviceModule, null);
    }

    public /* synthetic */ void lambda$initBmfVideoFilters$9(int i, final int i2, final String str, Throwable th) {
        if (i == 1) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: X.P2q
                @Override // java.lang.Runnable
                public final void run() {
                    LiveStream.this.lambda$null$8(i2, str);
                }
            });
        }
    }

    private boolean shouldReconnectWitchCurrentUrlV2(int i, int i2, long j, boolean z) {
        if (isUsingOptimizedUrl()) {
            if (this.mOptUrlReachable != 1) {
                this.mOptUrlReachable = 0;
            }
        } else if (this.mUriReachable != 1) {
            this.mUriReachable = 0;
        }
        if (this.mUri != null) {
            return !z;
        }
        if (this.mUris == null) {
            return false;
        }
        if ((enableUrlFallBack(i) && this.mUris.size() > 1 && this.mUriReachable == 0) || z) {
            return false;
        }
        return true;
    }

    public void onEncodeFormatChanged(int i, int i2, long j, String str) {
        TEBundle tEBundle;
        if (i == 5) {
            if (i2 == 1 || i2 == 2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Video encode bitrate adjust from ");
                LIZ.append(this.mAdjustBitrate);
                LIZ.append(" to ");
                LIZ.append(j);
                AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ));
                reportBitrateAdjust(i2, j, str);
                this.mAdjustBitrate = j;
                TEBundle tEBundle2 = this.mEncodeStreamOpt;
                if (tEBundle2 != null) {
                    tEBundle2.setLong("video_bitrate", this.mAdjustBitrate);
                }
            } else if (i2 == 5) {
                try {
                    int indexOf = str.indexOf(LiveTryModeCountDownThresholdSetting.DEFAULT);
                    int parseInt = CastIntegerProtector.parseInt(str.substring(0, indexOf));
                    int parseInt2 = CastIntegerProtector.parseInt(str.substring(indexOf + 1));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Video encode size change to ");
                    LIZ2.append(str);
                    AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ2));
                    TEBundle tEBundle3 = this.mEncodeStreamOpt;
                    if (tEBundle3 != null && this.mMediaEncodeStream != null) {
                        tEBundle3.setInt("video_width", parseInt);
                        this.mEncodeStreamOpt.setInt("video_height", parseInt2);
                        this.mMediaEncodeStream.setParameter(this.mEncodeStreamOpt);
                    }
                    if (this.mRTMPTransport != null && (tEBundle = this.mTransportOpt) != null) {
                        tEBundle.setInt("video_width", parseInt);
                        this.mTransportOpt.setInt("video_height", parseInt2);
                        this.mRTMPTransport.setParameter(this.mTransportOpt);
                    }
                    reportLiveCoreInfo(27, parseInt, parseInt2);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            reportLiveCoreInfo(16, i, i2);
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.MediaEncodeStream.Observer
    public void onMediaEncodeStreamEvent(int i, int i2, long j, String str) {
        if (this.mStatus.get() == 7 || this.mStatus.get() == 8) {
            return;
        }
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.33
            public final /* synthetic */ int val$code1;
            public final /* synthetic */ int val$code2;
            public final /* synthetic */ long val$code3;
            public final /* synthetic */ String val$msg;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$33_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$33__run$___twin___() {
                String LIZIZ;
                String str2;
                int i3 = r2;
                if (i3 != 31) {
                    if (i3 != 32) {
                        switch (i3) {
                            case 1:
                                LiveStream.this.mVideoEncodeVsyncName = r3;
                                return;
                            case 2:
                            case 4:
                                LiveStream.this.onEncodeCreateEvent(i3, r4, r5);
                                return;
                            case 3:
                                LiveStream.this.mAudioEncodeVsyncName = r3;
                                return;
                            case 5:
                            case 6:
                                LiveStream.this.onEncodeFormatChanged(i3, r4, r5, r3);
                                return;
                            default:
                                switch (i3) {
                                    case 8:
                                        LiveStream.this.onAVFrameSyncError(i3, r4, r5);
                                        return;
                                    case 9:
                                    case 10:
                                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                        LiveStream.this.onRecorderEvent(i3, r4, r5, r3);
                                        return;
                                    default:
                                        boolean z = true;
                                        switch (i3) {
                                            case 14:
                                            case 15:
                                                if (i3 == 15) {
                                                    LIZIZ = "Audio";
                                                } else {
                                                    StringBuilder LIZ = X1D.LIZ();
                                                    LIZ.append("Video Encoder Error: code");
                                                    LIZ.append(r4);
                                                    LIZIZ = X1D.LIZIZ(LIZ);
                                                }
                                                AVLog.logKibana(6, "LiveStream", LIZIZ, null);
                                                LiveStreamLogService liveStreamLogService = LiveStream.this.mStreamLogService;
                                                if (liveStreamLogService == null) {
                                                    return;
                                                }
                                                if (r2 != 15) {
                                                    z = false;
                                                }
                                                liveStreamLogService.setEncoderErrorCode(z, r4);
                                                return;
                                            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                                                StringBuilder LIZ2 = X1D.LIZ();
                                                if (LiveStream.this.mLiveStreamBuilder.isEnableVideoEncodeAccelera()) {
                                                    str2 = "Hardware ";
                                                } else {
                                                    str2 = "Software ";
                                                }
                                                LIZ2.append(str2);
                                                LIZ2.append("roi is disabled, reason: ");
                                                LIZ2.append(r4);
                                                AVLog.iow("LiveStream", X1D.LIZIZ(LIZ2));
                                                if (LiveStream.this.mLiveStreamBuilder.getRoiOn() == 1) {
                                                    LiveStream.this.mLiveStreamBuilder.setRoiOn(r4);
                                                }
                                                LiveStream.this.reportLiveCoreInfo(16, 16, r4);
                                                return;
                                            case 17:
                                                StringBuilder LIZ3 = X1D.LIZ();
                                                LIZ3.append("Encode frame invalid(");
                                                LIZ3.append(r4);
                                                LIZ3.append("x");
                                                LIZ3.append(r5);
                                                LIZ3.append(") VS Encoder(");
                                                LIZ3.append(LiveStream.this.mLiveStreamBuilder.getVideoWidth());
                                                LIZ3.append("x");
                                                LIZ3.append(LiveStream.this.mLiveStreamBuilder.getVideoHeight());
                                                LIZ3.append(")");
                                                AVLog2.logToIODevice2(5, "LiveStream", X1D.LIZIZ(LIZ3), null, 35, 1000);
                                                LiveStream.this.reportLiveCoreInfo(43, r2, r4);
                                                return;
                                            case 18:
                                                LiveStream.this.onVideoEncodeFpsAdjust(r4, (int) r5);
                                                return;
                                            case 19:
                                                TEBundle tEBundle = new TEBundle();
                                                if (!LiveStream.this.mLiveStreamBuilder.getRtmpCacheCfgParams().getDropEncodeFps()) {
                                                    tEBundle.setInt("fps", (int) r5);
                                                    tEBundle.setString("from", "netAdapt");
                                                    LiveStream.this.updateSdkParams(tEBundle);
                                                } else {
                                                    LiveStream.this.lambda$adaptVideoFpsForEncode$3((int) r5, "netAdapt");
                                                }
                                                tEBundle.release();
                                                LiveStream.this.reportFpsAdjust(r4, (int) r5, "net");
                                                return;
                                            case 20:
                                                LiveStream.this.onAudioEncodeProfileChanged(r4);
                                                return;
                                            default:
                                                return;
                                        }
                                }
                        }
                    }
                    LiveStream.this.mAudioEncoderInfo = r3;
                    return;
                }
                LiveStream.this.mVideoEncoderInfo = r3;
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$33_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass33 anonymousClass33) {
                boolean LIZ;
                try {
                    anonymousClass33.com_ss_ttlivestreamer_livestreamv2_LiveStream$33__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass33(int i3, String str2, int i22, long j2) {
                r2 = i3;
                r3 = str2;
                r4 = i22;
                r5 = j2;
            }
        });
    }

    public void onRecorderEvent(int i, int i2, long j, String str) {
        IRecorderManager externRecordMgr;
        RecorderManager recorderManager = this.mRecorderManager;
        if (recorderManager != null && (externRecordMgr = recorderManager.getExternRecordMgr()) != null && (externRecordMgr instanceof SharedEncoderRecorder)) {
            ((SharedEncoderRecorder) externRecordMgr).onEvent(i, i2, j, str);
            return;
        }
        AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("BUG! force crash.");
        if (!AnonymousClass028.LJI(androidRuntimeException, "LiveStream.onRecorderEvent")) {
        } else {
            throw androidRuntimeException;
        }
    }

    public void onRtmpFailed(int i, int i2, long j, String str) {
        if (this.mStatus.get() == 8 || !this.mEnalbeReconnect) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Reconnect returned! mStatus: ");
            LIZ.append(this.mStatus.get());
            LIZ.append(" , mEnalbeReconnect : ");
            LIZ.append(this.mEnalbeReconnect);
            AVLog.iow("LiveStream", X1D.LIZIZ(LIZ));
            return;
        }
        if (this.mLiveStreamBuilder == null) {
            return;
        }
        if (isOnMicOptAndRtcPushing()) {
            AVLog.logKibana(4, "LiveStream", "rtmp failed under double send", null);
            stop();
            return;
        }
        destroyEncodeStream();
        this.mWorkThreadHandler.removeCallbacks(this.rtmpReconnectRunnable);
        this.mErrorCodeQuicDownGrade = i2;
        if (shouldReconnectWitchCurrentUrl(i, i2, j)) {
            AVLog.iow("LiveStream", "shouldReconnectWitchCurrentUrl");
            sendSourceToLiveStreamEventTracker(getConnectResultSource(), i, i2, j, str);
            this.mWorkThreadHandler.postDelayed(this.rtmpReconnectRunnable, r5.getRtmpReconnectIntervalSeconds() * 1000);
            return;
        }
        List<String> list = this.mUris;
        if (list != null) {
            boolean z = true;
            if (list.size() > 1 && enableUrlFallBack(i)) {
                ListProtector.remove(this.mUris, 0);
                this.mUriReachable = -1;
                this.mOptUrlReachable = -1;
                this.mFirstConnect = true;
                this.mRtmpReConnectCounts = -1;
                if (this.mDns == null && !this.mStrategyDnsOptOpen) {
                    z = false;
                }
                this.mDnsOptOpen = z;
                this.mDnsOptHit = false;
                this.mEvaluatorSymbol = "";
                sendSourceToLiveStreamEventTracker(getConnectResultSource(), i, i2, j, str);
                this.mWorkThreadHandler.postDelayed(this.rtmpReconnectRunnable, r5.getRtmpReconnectIntervalSeconds() * 1000);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Switched to next url: ");
                LIZ2.append(getLiveStreamUrl());
                AVLog.iow("LiveStream", X1D.LIZIZ(LIZ2));
                return;
            }
        }
        AVLog.ioe("LiveStream", "Rtmp connecting failed too many times");
        reportLiveCoreError(4, i2, new Exception("Rtmp connection fail"));
        doStop();
    }

    public void onRtmpReconnectNotify(int i, int i2, long j, String str) {
        if (this.mStatus.get() != 7 && this.mStatus.get() != 8) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.5
                public final /* synthetic */ int val$event1;
                public final /* synthetic */ int val$event2;
                public final /* synthetic */ long val$event3;
                public final /* synthetic */ String val$msg;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$5__run$___twin___() {
                    /*  JADX ERROR: Method code generation error
                        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                        	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        */
                    /*
                        Method dump skipped, instructions count: 610
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.LiveStream.AnonymousClass5.com_ss_ttlivestreamer_livestreamv2_LiveStream$5__run$___twin___():void");
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                    boolean LIZ;
                    try {
                        anonymousClass5.com_ss_ttlivestreamer_livestreamv2_LiveStream$5__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass5(String str2, int i3, int i22, long j2) {
                    r2 = str2;
                    r3 = i3;
                    r4 = i22;
                    r5 = j2;
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.core.engine.Transport.EventObserver
    public void onTransportEvent(int i, int i2, long j, String str) {
        DebugLogUtils.isEnableDebugLog();
        if (this.mStatus.get() != 7 && this.mStatus.get() != 8) {
            this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.30
                public final /* synthetic */ int val$code1;
                public final /* synthetic */ int val$code2;
                public final /* synthetic */ long val$code3;
                public final /* synthetic */ String val$msg;

                @Override // java.lang.Runnable
                public void run() {
                    com_ss_ttlivestreamer_livestreamv2_LiveStream$30_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public void com_ss_ttlivestreamer_livestreamv2_LiveStream$30__run$___twin___() {
                    long j2;
                    long j22;
                    long j3;
                    long j4;
                    boolean z;
                    VsyncModule vsyncModule;
                    RTMPReconnectHelper rTMPReconnectHelper;
                    if (LiveStream.this.mStatus.get() == 7 || LiveStream.this.mStatus.get() == 8) {
                        return;
                    }
                    String str2 = "";
                    long j5 = -1;
                    LiveStream liveStream = LiveStream.this;
                    if (liveStream.mRtmpReconnectVersion >= 2 && (rTMPReconnectHelper = liveStream.mRtmpReconnectHelper) != null) {
                        rTMPReconnectHelper.OnEvent(r2, r3, r4, r6);
                    }
                    switch (r2) {
                        case 0:
                            AVLog.ioi("LiveStream", "Rtmp start connecting");
                            LiveStream.this.reportLiveCoreInfo(10, 0, 0);
                            LiveStream.this.mStreamLogService.onRTMPConnecting();
                            return;
                        case 1:
                            LiveStream liveStream2 = LiveStream.this;
                            if (liveStream2.mRtmpReconnectVersion == 1 || liveStream2.isLWReconnectNotCatchTransEvent()) {
                                LiveStream.this.sendConnectResultWhenConnected();
                            }
                            LiveStream.this.reportLiveCoreInfo(11, 0, 0);
                            Transport transport = LiveStream.this.mRTMPTransport;
                            if (transport != null) {
                                str2 = transport.getString(21);
                                j5 = LiveStream.this.mRTMPTransport.getInt64Value(2);
                            }
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Rtmp connected: reconnect counts ");
                            LIZ.append(LiveStream.this.mRtmpReConnectCounts);
                            LIZ.append(", first connect ");
                            LIZ.append(LiveStream.this.mFirstConnect);
                            LIZ.append(", remote ip ");
                            LIZ.append(str2);
                            LIZ.append(", dns time ");
                            LIZ.append(j5);
                            AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ));
                            LiveStream liveStream3 = LiveStream.this;
                            liveStream3.mStreamLogService.onRTMPEnd(200, liveStream3.mRtmpReConnectCounts, liveStream3.mFirstConnect, str2, j5);
                            LiveStream liveStream4 = LiveStream.this;
                            liveStream4.mRtmpqDownGrade = false;
                            liveStream4.mProtocolDownGradeType = 0;
                            liveStream4.onRtmpConncted();
                            LiveStream.this.reportRtmpPublishSuccess();
                            if (!LiveStream.this.isLWReconnectNotCatchTransEvent()) {
                                return;
                            }
                            LiveStream.this.resetLightWeightReconnectStatus();
                            return;
                        case 2:
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("Rtmp send too slow: send delay ");
                            LIZ2.append(r3);
                            AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ2));
                            LiveStream.this.reportLiveCoreInfo(13, r3, 0);
                            LiveStream.this.mStreamLogService.onSendPktSlow(r3);
                            LiveStream.this.onRtmpSendTooSlow();
                            return;
                        case 3:
                            LiveStream liveStream5 = LiveStream.this;
                            liveStream5.mRtmpqDownGrade = true;
                            liveStream5.mProtocolDownGradeType = 1;
                            if (liveStream5.mRtmpReconnectVersion != 1 && !liveStream5.isLWReconnectNotCatchTransEvent()) {
                                return;
                            }
                            LiveStream.this.sendConnectResultWhenConnectFailed(r2, r3, r4, r6);
                            LiveStream liveStream6 = LiveStream.this;
                            if (liveStream6.mRtmpReConnectCounts >= liveStream6.mLiveStreamBuilder.getRtmpReconnectCounts()) {
                                Transport transport2 = LiveStream.this.mRTMPTransport;
                                if (transport2 != null) {
                                    str2 = transport2.getString(21);
                                    j5 = LiveStream.this.mRTMPTransport.getInt64Value(2);
                                }
                                LiveStream liveStream7 = LiveStream.this;
                                liveStream7.mStreamLogService.onRTMPEnd(r3, liveStream7.mRtmpReConnectCounts, liveStream7.mFirstConnect, str2, j5);
                            }
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("Rtmp connecting failed: code2 ");
                            LIZ3.append(r3);
                            LIZ3.append(", code3 ");
                            LIZ3.append(r4);
                            LIZ3.append(", reconnect counts ");
                            LIZ3.append(LiveStream.this.mRtmpReConnectCounts);
                            LIZ3.append(", first connect ");
                            LIZ3.append(LiveStream.this.mFirstConnect);
                            String LIZIZ = X1D.LIZIZ(LIZ3);
                            AVLog.ioe("LiveStream", LIZIZ);
                            LiveStream.this.onRtmpFailed(r2, r3, r4, r6);
                            LiveStream liveStream8 = LiveStream.this;
                            liveStream8.onUpLoadRtmpFailedLog(r3, liveStream8.mRtmpReConnectCounts, liveStream8.mFirstConnect, str2, j5, LIZIZ);
                            return;
                        case 4:
                            long j6 = r4;
                            String str22 = "avSync error: ";
                            long j7 = 0;
                            try {
                                j2 = CastIntegerProtector.parseInt(r6);
                            } catch (Exception unused) {
                                StringBuilder LIZJ = b1.LIZJ("avSync error: ", "realVideoPts: ");
                                str22 = JBR.LJFF(LIZJ, r6, " ", LIZJ);
                                j2 = 0;
                            }
                            long j8 = j6 + j2;
                            MediaEncodeStream mediaEncodeStream = LiveStream.this.mMediaEncodeStream;
                            if (mediaEncodeStream != null && (vsyncModule = mediaEncodeStream.getVsyncModule()) != null) {
                                j22 = vsyncModule.getFirstFrameTimestampMs(LiveStream.this.getOriginInputVideoStream().name());
                                j3 = vsyncModule.getFirstFrameTimestampMs(LiveStream.this.getOriginInputAudioStream().name());
                                j7 = vsyncModule.lastTimeMills(LiveStream.this.getOriginInputVideoStream().name());
                                j4 = vsyncModule.getMaxIntevalMs(LiveStream.this.getOriginInputVideoStream().name());
                            } else {
                                j22 = 0;
                                j3 = 0;
                                j4 = 0;
                            }
                            LiveStreamVideoCapture liveStreamVideoCapture = LiveStream.this.mVideoCapturer;
                            if (liveStreamVideoCapture != null) {
                                z = liveStreamVideoCapture.backgroundMode();
                            } else {
                                z = false;
                            }
                            long nativeNowNanos = VsyncModule.nativeNowNanos() / 1000000;
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append(str22);
                            LIZ4.append("audio pts ");
                            LIZ4.append(j8);
                            LIZ4.append(", video pts ");
                            LIZ4.append(j2);
                            C0MT.LIZLLL(LIZ4, " last vpts ", j7, " video maxFI ");
                            V1I.LIZJ(LIZ4, j4, " bgm ", z);
                            C0MT.LIZLLL(LIZ4, " CurrTimeMs ", nativeNowNanos, " vFirst ");
                            LIZ4.append(j22);
                            LIZ4.append(" aFirst ");
                            LIZ4.append(j3);
                            String LIZIZ2 = X1D.LIZIZ(LIZ4);
                            AVLog.ioe("LiveStream", LIZIZ2);
                            LiveStream.this.mStreamLogService.onPushStreamFail(r3, LIZIZ2);
                            LiveStream liveStream9 = LiveStream.this;
                            if (liveStream9.mRtmpReconnectVersion != 1 && !liveStream9.isLWReconnectNotCatchTransEvent()) {
                                return;
                            }
                            LiveStream.this.onRtmpFailed(r2, r3, r4, r6);
                            return;
                        case 5:
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("interleave fail: error code ");
                            LIZ5.append(r3);
                            AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ5));
                            LiveStream.this.mStreamLogService.onPushStreamFail(r3, "interleave fail");
                            LiveStream liveStream10 = LiveStream.this;
                            if (liveStream10.mRtmpReconnectVersion != 1 && !liveStream10.isLWReconnectNotCatchTransEvent()) {
                                return;
                            }
                            LiveStream.this.onRtmpFailed(r2, r3, r4, r6);
                            return;
                        case 6:
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append("Rtmp send package failed: error code ");
                            LIZ6.append(r3);
                            AVLog.ioe("LiveStream", X1D.LIZIZ(LIZ6));
                            LiveStream.this.mStreamLogService.onPushStreamFail(r3, "RtmpSendPacketFail");
                            long pushDuration = LiveStream.this.mStreamLogService.getPushDuration();
                            LiveStream liveStream11 = LiveStream.this;
                            if (liveStream11.mEableDownGradeInSend && pushDuration <= 10000) {
                                liveStream11.mRtmpqDownGrade = true;
                                liveStream11.mProtocolDownGradeType = 2;
                            }
                            if (liveStream11.mRtmpReconnectVersion != 1 && !liveStream11.isLWReconnectNotCatchTransEvent()) {
                                return;
                            }
                            LiveStream.this.onRtmpFailed(r2, r3, r4, r6);
                            return;
                        case 7:
                            AVLog.ioi("LiveStream", "Rtmp pushing stopped");
                            LiveStream.this.reportLiveCoreInfo(14, 0, 0);
                            return;
                        case 8:
                            LiveStream.this.mStreamLogService.onKCPMessage(r6);
                            return;
                        case 9:
                            LiveStream.this.mStreamLogService.onQUICMessage(r6);
                            return;
                        case 10:
                            StringBuilder LIZ7 = X1D.LIZ();
                            LIZ7.append("Rtmp connecting failed: error code ");
                            LIZ7.append(r3);
                            String LIZIZ3 = X1D.LIZIZ(LIZ7);
                            AVLog.ioe("LiveStream", LIZIZ3);
                            LiveStream liveStream12 = LiveStream.this;
                            liveStream12.mRtmpqDownGrade = true;
                            liveStream12.mProtocolDownGradeType = 1;
                            if (liveStream12.mRtmpReconnectVersion != 1 && !liveStream12.isLWReconnectNotCatchTransEvent()) {
                                return;
                            }
                            LiveStream.this.onRtmpFailed(r2, r3, r4, r6);
                            LiveStream liveStream13 = LiveStream.this;
                            liveStream13.onUpLoadRtmpFailedLog(r3, liveStream13.mRtmpReConnectCounts, liveStream13.mFirstConnect, "", -1L, LIZIZ3);
                            return;
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        case 12:
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                        case 15:
                        default:
                            return;
                        case 14:
                            LiveStream.this.mStreamLogService.onOtherMessage(r6);
                            return;
                        case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                            LiveStream.this.mStreamLogService.setSandboxProceedCost(r4);
                            return;
                        case 17:
                            LiveStream.this.mStreamLogService.onPushStreamStall(true, r3, r4);
                            return;
                        case 18:
                            LiveStream.this.mStreamLogService.onPushStreamStall(false, r3, r4);
                            return;
                        case 19:
                            LiveStream.this.mStreamLogService.onRTMPMessage(r6);
                            return;
                        case 20:
                            LiveStream.this.mStreamLogService.onReportBwAdjustTime(r3, r4);
                            return;
                        case 21:
                            LiveStream.this.mStreamLogService.onReportAvoCache(r3, r4);
                            return;
                    }
                }

                public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$30_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass30 anonymousClass30) {
                    boolean LIZ;
                    try {
                        anonymousClass30.com_ss_ttlivestreamer_livestreamv2_LiveStream$30__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                public AnonymousClass30(int i3, int i22, long j2, String str2) {
                    r2 = i3;
                    r3 = i22;
                    r4 = j2;
                    r6 = str2;
                }
            });
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.capture.LiveStreamVideoCapture.Observer
    public void onVideoCaptureInfo(int i, int i2, int i3, String str) {
        if (getLiveStreamBuilder().getSdkSetting().cameraSizeOptUpdateWhOnThread && i == 2) {
            LiveStreamBuilder liveStreamBuilder = this.mLiveStreamBuilder;
            if (liveStreamBuilder != null) {
                liveStreamBuilder.setVideoCaptureWidth(i2);
                liveStreamBuilder.setVideoCaptureHeight(i3);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("fallback using capture resolution:");
                LIZ.append(i2);
                LIZ.append(",");
                LIZ.append(i3);
                AVLog.logKibana(5, "LiveStream", X1D.LIZIZ(LIZ), null);
            }
        } else if (4 == i && !mayAddSeiForVideoE2EDelay()) {
            return;
        }
        this.mWorkThreadHandler.post(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.28
            public final /* synthetic */ int val$code1;
            public final /* synthetic */ int val$code2;
            public final /* synthetic */ int val$code3;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$28__run$___twin___() {
                LiveStreamBuilder liveStreamBuilder2;
                ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener;
                int i4 = r2;
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4 || (iLiveStreamInfoListener = LiveStream.this.mInfoListener) == null) {
                            return;
                        }
                        try {
                            iLiveStreamInfoListener.onInfo(44, r3, r4);
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    LiveStream.this.reportLiveCoreInfo(38, r3, r4);
                    return;
                }
                if (LiveStream.this.getLiveStreamBuilder().getSdkSetting().cameraSizeOptUpdateWhOnThread || (liveStreamBuilder2 = LiveStream.this.mLiveStreamBuilder) == null) {
                    return;
                }
                liveStreamBuilder2.setVideoCaptureWidth(r3);
                liveStreamBuilder2.setVideoCaptureHeight(r4);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("fallback using capture resolution:");
                LIZ2.append(r3);
                LIZ2.append(",");
                LIZ2.append(r4);
                AVLog.logKibana(5, "LiveStream", X1D.LIZIZ(LIZ2), null);
                LiveStream.this.reportLiveCoreInfo(37, r3, r4);
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$28_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass28 anonymousClass28) {
                boolean LIZ2;
                try {
                    anonymousClass28.com_ss_ttlivestreamer_livestreamv2_LiveStream$28__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }

            public AnonymousClass28(int i4, int i22, int i32) {
                r2 = i4;
                r3 = i22;
                r4 = i32;
            }
        });
    }

    public void sendConnectResultWhenConnectFailed(int i, int i2, long j, String str) {
        if (this.mStreamLogService != null) {
            if (this.mFirstConnectAction) {
                this.mFirstConnectAction = false;
                sendSourceToLiveStreamEventTracker(1, i, i2, j, str);
            }
            sendResultToLiveStreamEventTracker(0, getCurrentRetryCount(), getStreamRetryCount());
            this.mStreamLogService.onRTMPConnectResult(this.mHasFirstConnected);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01b6, code lost:
    
        if (r6 == null) goto L109;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiveStream(com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder r13, android.os.Handler r14, android.os.Handler r15, com.ss.ttlivestreamer.core.engine.AudioDeviceModule r16, com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor r17) {
        /*
            Method dump skipped, instructions count: 1045
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ttlivestreamer.livestreamv2.LiveStream.<init>(com.ss.ttlivestreamer.livestreamv2.LiveStreamBuilder, android.os.Handler, android.os.Handler, com.ss.ttlivestreamer.core.engine.AudioDeviceModule, com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor):void");
    }

    private void sendSourceToLiveStreamEventTracker(int i, int i2, int i3, long j, String str) {
        if (this.mLiveStreamEventTracker != null) {
            this.mLiveStreamEventTracker.createRtmpConnectBySource(new LiveStreamConnectResultEventSource(i, i2, i3, j, str));
        }
    }

    private void updateCaptureVideoResolution(int i, int i2, int i3, int i4, int i5) {
        StringBuilder LIZJ = C06460Ne.LIZJ("Encode Params changed(updateCaptureVideoResolution): Change to:(", i, ",", i2, ") fps change to:(");
        C15890jp.LIZIZ(LIZJ, i3, ":", i4, ") radioModeFps:");
        LIZJ.append(i5);
        AVLog.iod("LiveStream", X1D.LIZIZ(LIZJ));
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            liveStreamVideoCapture.updateCaptureVideoResolution(i, i2, i3, i4, i5);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int addSeiField(String str, Object obj, int i, boolean z, boolean z2) {
        return addSeiField(str, obj, i, z, z2, 0);
    }

    public void onRtmpFailedV2(int i, int i2, long j, String str, boolean z) {
        if (this.mStatus.get() == 8 || !this.mEnalbeReconnect) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Reconnect returned! mStatus: ");
            LIZ.append(this.mStatus.get());
            LIZ.append(" , mEnalbeReconnect : ");
            LIZ.append(this.mEnalbeReconnect);
            AVLog.iow("LiveStream", X1D.LIZIZ(LIZ));
            return;
        }
        if (this.mLiveStreamBuilder == null) {
            return;
        }
        if (isOnMicOptAndRtcPushing()) {
            AVLog.logKibana(4, "LiveStream", "rtmp failed under double send", null);
            stop();
            return;
        }
        destroyEncodeStream();
        this.mWorkThreadHandler.removeCallbacks(this.rtmpReconnectRunnable);
        this.mErrorCodeQuicDownGrade = i2;
        if (shouldReconnectWitchCurrentUrlV2(i, i2, j, z)) {
            sendSourceToLiveStreamEventTracker(getConnectResultSource(), i, i2, j, str);
            this.mWorkThreadHandler.postDelayed(this.rtmpReconnectRunnable, r5.getRtmpReconnectIntervalSeconds() * 1000);
            return;
        }
        List<String> list = this.mUris;
        if (list != null) {
            boolean z2 = true;
            if (list.size() > 1 && enableUrlFallBack(i)) {
                ListProtector.remove(this.mUris, 0);
                this.mUriReachable = -1;
                this.mOptUrlReachable = -1;
                this.mFirstConnect = true;
                this.mRtmpReConnectCounts = -1;
                if (this.mDns == null && !this.mStrategyDnsOptOpen) {
                    z2 = false;
                }
                this.mDnsOptOpen = z2;
                this.mDnsOptHit = false;
                this.mEvaluatorSymbol = "";
                sendSourceToLiveStreamEventTracker(getConnectResultSource(), i, i2, j, str);
                this.mWorkThreadHandler.postDelayed(this.rtmpReconnectRunnable, r5.getRtmpReconnectIntervalSeconds() * 1000);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Switched to next url: ");
                LIZ2.append(getLiveStreamUrl());
                AVLog.iow("LiveStream", X1D.LIZIZ(LIZ2));
                return;
            }
        }
        AVLog.ioe("LiveStream", "Rtmp connecting failed too many times");
        reportLiveCoreError(4, (int) j, new Exception("Rtmp connection fail"));
        doStop();
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            return liveStreamVideoCapture.pushVideoFrame(byteBuffer, i, i2, i3, j);
        }
        return -1;
    }

    public void vsyncEvent(VsyncModule vsyncModule, int i, int i2, long j, String str) {
        if (DebugLogUtils.isEnableDebugLog()) {
            StringBuilder LIZJ = C06460Ne.LIZJ("LiveStream arg1 ", i, " arg2 ", i2, " arg3 ");
            C65232Piu.LIZLLL(LIZJ, j, " msg ", str);
            StringBuilder LIZIZ = C25620zW.LIZIZ("VSYNC INFO (", X1D.LIZIZ(LIZJ), "):");
            LIZIZ.append(vsyncModule.toString());
            C16880lQ.LLLLIIL(new Exception(X1D.LIZIZ(LIZIZ)));
        }
        StringBuilder LIZJ2 = C06460Ne.LIZJ("Vsync event  arg1 ", i, " arg2 ", i2, " arg3 ");
        C65232Piu.LIZLLL(LIZJ2, j, " msg ", str);
        AVLog.iod("LiveStream", X1D.LIZIZ(LIZJ2));
        if (i != 100) {
            if (i != 101) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Timestamp exception(diff:");
            LIZ.append(i2);
            LIZ.append(") at track(");
            LIZ.append(str);
            LIZ.append(")");
            AVLog2.logToIODevice2(5, "LiveStream", X1D.LIZIZ(LIZ), null, 33, 10000);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Timestamp exception(diff:");
        LIZ2.append(i2);
        LIZ2.append(") at track(");
        LIZ2.append(str);
        LIZ2.append(") with reset stream");
        AVLog2.logToIODevice2(5, "LiveStream", X1D.LIZIZ(LIZ2), null, 34, 10000);
        vsyncModule.reset(str);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int addSeiField(final String str, final Object obj, final int i, final boolean z, final boolean z2, final int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.mLastAddSeiStatTime == 0) {
            this.mLastAddSeiStatTime = currentTimeMillis;
        }
        if (currentTimeMillis - this.mLastAddSeiStatTime > 30000) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addSeiField is called ");
            LIZ.append(this.mAddSeiCount);
            LIZ.append(" times in last 30s.");
            AVLog.ioi("LiveStream", X1D.LIZIZ(LIZ));
            this.mLastAddSeiStatTime = currentTimeMillis;
            this.mAddSeiCount = 0;
        }
        this.mAddSeiCount++;
        if (this.mRTMPTransport == null) {
            return -1;
        }
        checkIfChangeSource(str, obj);
        final int[] iArr = {0};
        final String str2 = this.mVideoEncodeVsyncName;
        this.mWorkThreadHandler.post(new Runnable() { // from class: X.P2l
            @Override // java.lang.Runnable
            public final void run() {
                LiveStream.this.lambda$addSeiField$16(z, str2, str, obj, i, z2, iArr, i2);
            }
        });
        return iArr[0];
    }

    public void onUpLoadRtmpFailedLog(int i, int i2, boolean z, String str, long j, String str2) {
        if (this.mLiveStreamBuilder == null) {
            return;
        }
        this.mWorkThreadHandler.postDelayed(new Runnable() { // from class: com.ss.ttlivestreamer.livestreamv2.LiveStream.32
            public final /* synthetic */ int val$code2;
            public final /* synthetic */ long val$dnsTime;
            public final /* synthetic */ boolean val$mFirstConnect;
            public final /* synthetic */ int val$mRtmpReConnectCounts;
            public final /* synthetic */ String val$message;
            public final /* synthetic */ String val$remoteIP;

            @Override // java.lang.Runnable
            public void run() {
                com_ss_ttlivestreamer_livestreamv2_LiveStream$32_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_ss_ttlivestreamer_livestreamv2_LiveStream$32__run$___twin___() {
                LiveStream.this.mStreamLogService.onRTMPFailed(r2, r3, r4, r5, r6, r8);
            }

            public static void com_ss_ttlivestreamer_livestreamv2_LiveStream$32_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass32 anonymousClass32) {
                boolean LIZ;
                try {
                    anonymousClass32.com_ss_ttlivestreamer_livestreamv2_LiveStream$32__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass32(int i3, int i22, boolean z2, String str3, long j2, String str22) {
                r2 = i3;
                r3 = i22;
                r4 = z2;
                r5 = str3;
                r6 = j2;
                r8 = str22;
            }
        }, r0.getRtmpReconnectIntervalSeconds() * 1000);
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushAudioFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        AudioCapturer audioCapturer = this.mAudioCapture;
        if (audioCapturer != null && (audioCapturer instanceof AudioCapturerExternal)) {
            return ((AudioCapturerExternal) audioCapturer).pushAudioFrame(byteBuffer, i, i2, i3, i4, j);
        }
        return -1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(ByteBuffer[] byteBufferArr, int[] iArr, int i, int i2, int i3, long j) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            return liveStreamVideoCapture.pushVideoFrame(byteBufferArr, iArr, i, i2, i3, j);
        }
        return -1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, long j) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            return liveStreamVideoCapture.pushVideoFrame(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, j);
        }
        return -1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j) {
        return pushVideoFrame(i, z, i2, i3, i4, fArr, j, null);
    }

    public /* synthetic */ void lambda$addSeiField$16(boolean z, String str, String str2, Object obj, int i, boolean z2, int[] iArr, int i2) {
        long j;
        VsyncModule vsyncModule;
        Transport transport = this.mRTMPTransport;
        if (transport != null) {
            VideoTrack videoTrack = this.mVideoTrack;
            if (!z && videoTrack != null && (vsyncModule = transport.getVsyncModule()) != null && str != null) {
                j = vsyncModule.lastTimeMills(str);
            } else {
                j = 0;
            }
            IVeLivePusher iVeLivePusher = this.mVeLivePusher;
            if (iVeLivePusher != null) {
                iVeLivePusher.sendSeiMessage(str2, obj, i, z, z2);
                return;
            } else {
                iArr[0] = transport.addSeiField(str2, obj, i, j, z, z2, i2);
                return;
            }
        }
        iArr[0] = -1;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream
    public int pushVideoFrame(int i, boolean z, int i2, int i3, int i4, float[] fArr, long j, Bundle bundle) {
        LiveStreamVideoCapture liveStreamVideoCapture = this.mVideoCapturer;
        if (liveStreamVideoCapture != null) {
            return liveStreamVideoCapture.pushVideoFrame(i, z, i2, i3, i4, fArr, j, bundle);
        }
        return -1;
    }
}
