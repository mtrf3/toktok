package com.ss.bytertc.engine.engineimpl;

import X.C16880lQ;
import X.RunnableC90005ZUb;
import X.X1D;
import X.ZVB;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.ss.bytertc.engine.AudioEffectPlayer;
import com.ss.bytertc.engine.AudioMixingManager;
import com.ss.bytertc.engine.IAudioFrameObserver;
import com.ss.bytertc.engine.IAudioFrameProcessor;
import com.ss.bytertc.engine.IMetadataObserver;
import com.ss.bytertc.engine.IRTCAudioDeviceManager;
import com.ss.bytertc.engine.InternalCloudProxyInfo;
import com.ss.bytertc.engine.InternalLocalProxyConfiguration;
import com.ss.bytertc.engine.InternalMediaTypeEnhancementConfig;
import com.ss.bytertc.engine.InternalScreenVideoEncoderConfig;
import com.ss.bytertc.engine.InternalVideoCaptureConfig;
import com.ss.bytertc.engine.InternalVideoEncoderConfig;
import com.ss.bytertc.engine.InternalVideoStreamDescription;
import com.ss.bytertc.engine.NativeRTCVideoFunctions;
import com.ss.bytertc.engine.NetworkTimeInfo;
import com.ss.bytertc.engine.RTCAudioDeviceManager;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCRoomImpl;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.RtcMediaPlayer;
import com.ss.bytertc.engine.ScreenVideoEncoderConfig;
import com.ss.bytertc.engine.SingScoringManager;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.adapter.VideoSinkAdapter;
import com.ss.bytertc.engine.adapter.VideoSinkTask;
import com.ss.bytertc.engine.audio.IAudioEffectPlayer;
import com.ss.bytertc.engine.audio.IAudioMixingManager;
import com.ss.bytertc.engine.audio.IMediaPlayer;
import com.ss.bytertc.engine.audio.ISingScoringManager;
import com.ss.bytertc.engine.data.AudioAlignmentMode;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.AudioProcessorMethod;
import com.ss.bytertc.engine.data.AudioPropertiesConfig;
import com.ss.bytertc.engine.data.AudioRecordingConfig;
import com.ss.bytertc.engine.data.AudioRenderType;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.AudioSourceType;
import com.ss.bytertc.engine.data.CameraId;
import com.ss.bytertc.engine.data.CloudProxyInfo;
import com.ss.bytertc.engine.data.EarMonitorMode;
import com.ss.bytertc.engine.data.EchoTestConfig;
import com.ss.bytertc.engine.data.EffectBeautyMode;
import com.ss.bytertc.engine.data.MirrorType;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RTCASRConfig;
import com.ss.bytertc.engine.data.RTCData;
import com.ss.bytertc.engine.data.RTCLogConfig;
import com.ss.bytertc.engine.data.RecordingConfig;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.data.SEICountPerFrame;
import com.ss.bytertc.engine.data.ScreenMediaType;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamSycnInfoConfig;
import com.ss.bytertc.engine.data.VideoDenoiseMode;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoOrientation;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotationMode;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.data.VirtualBackgroundSource;
import com.ss.bytertc.engine.data.ZoomConfigType;
import com.ss.bytertc.engine.data.ZoomDirectionType;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.handler.IExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.IRTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCEngineInternalEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.handler.RTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.RTCEncryptHandler;
import com.ss.bytertc.engine.handler.RTCEngineInternalEventHandler;
import com.ss.bytertc.engine.handler.RTCExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.RTCLocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCVideoEventHandler;
import com.ss.bytertc.engine.handler.RTCVideoProcessor;
import com.ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.ss.bytertc.engine.live.ChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.IChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.IPushSingleStreamToCDNObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.live.LiveTranscodingObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.PushMixedStreamToCDNObserver;
import com.ss.bytertc.engine.live.PushSingleStreamParam;
import com.ss.bytertc.engine.live.PushSingleStreamToCDNObserver;
import com.ss.bytertc.engine.loader.RTCNativeLibraryListenerImpl;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderInfo;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener;
import com.ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.IRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import com.ss.bytertc.engine.publicstream.PublicStreaming;
import com.ss.bytertc.engine.type.AnsMode;
import com.ss.bytertc.engine.type.AudioProfileType;
import com.ss.bytertc.engine.type.AudioScenarioType;
import com.ss.bytertc.engine.type.BackgroundMode;
import com.ss.bytertc.engine.type.DivideModel;
import com.ss.bytertc.engine.type.LocalProxyConfiguration;
import com.ss.bytertc.engine.type.MediaTypeEnhancementConfig;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.bytertc.engine.type.ProblemFeedbackInfo;
import com.ss.bytertc.engine.type.ProblemFeedbackOption;
import com.ss.bytertc.engine.type.PublishFallbackOption;
import com.ss.bytertc.engine.type.RecordingType;
import com.ss.bytertc.engine.type.RemoteUserPriority;
import com.ss.bytertc.engine.type.SubscribeFallbackOptions;
import com.ss.bytertc.engine.type.TorchState;
import com.ss.bytertc.engine.type.VoiceChangerType;
import com.ss.bytertc.engine.type.VoiceEqualizationConfig;
import com.ss.bytertc.engine.type.VoiceReverbConfig;
import com.ss.bytertc.engine.type.VoiceReverbType;
import com.ss.bytertc.engine.utils.AppMonitor;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.VideoFrameConverter;
import com.ss.bytertc.engine.video.ByteWatermark;
import com.ss.bytertc.engine.video.IFaceDetectionObserver;
import com.ss.bytertc.engine.video.ISnapshotResultCallback;
import com.ss.bytertc.engine.video.IVideoEffect;
import com.ss.bytertc.engine.video.IVideoProcessor;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.RTCVideoEffect;
import com.ss.bytertc.engine.video.RTCWatermarkConfig;
import com.ss.bytertc.engine.video.VideoCaptureConfig;
import com.ss.bytertc.engine.video.VideoDecoderConfig;
import com.ss.bytertc.engine.video.VideoEffectExpressionConfig;
import com.ss.bytertc.engine.video.VideoEncoderConfiguration;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.VideoPreprocessorConfig;
import com.ss.bytertc.engine.video.builder.GLTextureVideoFrameBuilder;
import com.ss.bytertc.ktv.IKTVManager;
import com.ss.bytertc.ktv.KTVManagerImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes33.dex */
public class RTCVideoImpl extends RTCVideo {
    public static boolean mLibraryLoaded;
    public AppMonitor.Callback appStateCallback;
    public RTCVideoEffect mAdvanceVideoEffect;
    public RTCAudioDeviceManager mAudioDeviceManagerInterval;
    public AudioEffectPlayer mAudioEffectPlayer;
    public AudioMixingManager mAudioMixingManager;
    public ChorusCacheSyncObserver mChorusObserver;
    public Context mContext;
    public Handler mEglHandler;
    public HandlerThread mEglThread;
    public boolean mEnableTranscode;
    public RTCVideoEventHandler mEngineEventHandler;
    public RTCEngineInternalEventHandler mEngineInternalEventHandler;
    public IExternalVideoEncoderEventHandler mExternalVideoEncoderHandler;
    public boolean mIsUseCustomEglEnv;
    public final ReentrantReadWriteLock.ReadLock mJniReadLock;
    public final ReentrantReadWriteLock.WriteLock mJniWriteLock;
    public KTVManagerImpl mKTVManager;
    public LiveTranscoding mLiveTranscoding;
    public ILiveTranscodingObserver mLiveTranscodingObserver;
    public ILocalEncodedVideoFrameObserver mLocalEncodedVideoFrameObserver;
    public LogUtil.LoggerSink mLoggerSink;
    public IMetadataObserver mMetadataObserver;
    public PushMixedStreamToCDNObserver mMixedStreamToCDNObserver;
    public long mNativeEngine;
    public Runnable mOnDestroyCompletedCallback;
    public RTCASREngineEventHandler mRTCASREngineEventHandler;
    public final ReentrantReadWriteLock mReadWriteLock;
    public IRemoteEncodedVideoFrameObserver mRemoteEncodedVideoFrameObserver;
    public EglBase mRootEglBase;
    public IRTCVideoEventHandler mRtcEngineHandler;
    public RTCExternalVideoEncoderEventHandler mRtcExVideoEncoderHandler;
    public RTCLocalEncodedVideoFrameObserver mRtcLocalEncodedVideoFrameObserver;
    public Map<Integer, RtcMediaPlayer> mRtcMediaPlayerMap;
    public RTCRemoteEncodedVideoFrameObserver mRtcRemoteEncodedVideoFrameObserver;
    public RTCVideoProcessor mRtcVideoPreprocessor;
    public VideoFrameConverter mScreenFrameConverter;
    public SingScoringManager mSingScoringManager;
    public PushSingleStreamToCDNObserver mSingleStreamToCDNObserver;
    public RTCEngineImpl.State mState;
    public LiveTranscodingObserver mTranscodingObserver;
    public boolean mUseExtVideoSource;
    public VideoFrameConverter mVideoFrameConverter;
    public VideoSinkTask mVideoSinkTask;
    public static RTCNativeLibraryLoaderListener mRtcNativeLibraryListener = new RTCNativeLibraryListenerImpl();
    public static RTCNativeLibraryLoaderInfo sRtcLoaderInfo = new RTCNativeLibraryLoaderInfo();
    public static String mDeviceId = "";
    public boolean mIsVideoMirror = true;
    public boolean mIsFront = true;

    @Override // com.ss.bytertc.engine.RTCVideo
    public int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel) {
        return 0;
    }

    static {
        loadSoFile();
    }

    public /* synthetic */ void lambda$doDestroy$3() {
        Runnable runnable = this.mOnDestroyCompletedCallback;
        if (runnable != null) {
            runnable.run();
        }
    }

    public /* synthetic */ void lambda$doDestroy$4() {
        EglBase eglBase = this.mRootEglBase;
        if (eglBase != null) {
            eglBase.release();
            this.mRootEglBase = null;
        }
    }

    public static void loadSoFile() {
        if (mLibraryLoaded) {
            mRtcNativeLibraryListener.onLoadAlready("volcenginertc");
        } else {
            RTCNativeLibraryLoader rTCNativeLibraryLoader = RTCVideo.mRtcNativeLibraryLoader;
            if (rTCNativeLibraryLoader != null) {
                mLibraryLoaded = true;
                boolean load = rTCNativeLibraryLoader.load("bytenn") & true;
                mLibraryLoaded = load;
                boolean load2 = load & RTCVideo.mRtcNativeLibraryLoader.load("byteaudio");
                mLibraryLoaded = load2;
                boolean load3 = load2 & RTCVideo.mRtcNativeLibraryLoader.load("volcenginertc");
                mLibraryLoaded = load3;
                if (load3) {
                    mRtcNativeLibraryListener.onLoadSuccess("volcenginertc");
                } else {
                    mRtcNativeLibraryListener.onLoadError("volcenginertc");
                }
                sRtcLoaderInfo.setLoaderClassName(C16880lQ.LJLLJ(RTCVideo.mRtcNativeLibraryLoader.getClass()));
            } else {
                try {
                    C16880lQ.LLJJJIL("bytenn");
                    C16880lQ.LLJJJIL("byteaudio");
                    C16880lQ.LLJJJIL("volcenginertc");
                    mLibraryLoaded = true;
                    mRtcNativeLibraryListener.onLoadSuccess("volcenginertc");
                    sRtcLoaderInfo.setLoaderClassName("System.loader");
                } catch (UnsatisfiedLinkError e) {
                    LogUtil.e("RtcVideoImpl", "Failed to load native library: volcenginertc", e);
                }
                mRtcNativeLibraryListener.onLoadError("volcenginertc");
            }
            sRtcLoaderInfo.setLoadResult(mLibraryLoaded);
            sRtcLoaderInfo.setLoadTimeStampMs(System.currentTimeMillis());
            sRtcLoaderInfo.setSdkVersion(RTCEngineImpl.getSdkVersion());
        }
        sRtcLoaderInfo.loadLibrary();
    }

    public void doDestroy() {
        LogUtil.d("RtcVideoImpl", "destroy RtcEngineImpl.");
        this.mJniWriteLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, no need to destroy now.");
                return;
            }
            long j = this.mNativeEngine;
            this.mNativeEngine = 0L;
            this.mJniWriteLock.unlock();
            AudioMixingManager audioMixingManager = this.mAudioMixingManager;
            if (audioMixingManager instanceof AudioMixingManager) {
                audioMixingManager.destroy();
            }
            this.mState = RTCEngineImpl.State.DESTORY;
            destroyRTCVideo(j);
            NativeRTCVideoFunctions.nativeClearHardWareEncodeContext();
            AudioEffectPlayer audioEffectPlayer = this.mAudioEffectPlayer;
            if (audioEffectPlayer instanceof AudioEffectPlayer) {
                audioEffectPlayer.destroy();
            }
            Map<Integer, RtcMediaPlayer> map = this.mRtcMediaPlayerMap;
            if (map != null) {
                Iterator<RtcMediaPlayer> it = map.values().iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
            }
            this.mIsFront = true;
            this.mIsVideoMirror = true;
            this.mVideoFrameConverter.dispose();
            this.mVideoFrameConverter = null;
            this.mScreenFrameConverter.dispose();
            this.mScreenFrameConverter = null;
            RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
            if (rTCVideoEffect != null) {
                rTCVideoEffect.dispose();
                this.mAdvanceVideoEffect = null;
            }
            new Handler(C16880lQ.LLJJJJ()).post(new RunnableC90005ZUb(1, this));
            AppMonitor appMonitor = AppMonitor.get(this.mContext);
            appMonitor.unRegister(this.appStateCallback);
            appMonitor.release(this.mContext);
            this.mRtcVideoPreprocessor.dispose();
            this.mRtcVideoPreprocessor = null;
            ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, new Runnable() { // from class: X.ZVi
                @Override // java.lang.Runnable
                public final void run() {
                    RTCVideoImpl.this.lambda$doDestroy$4();
                }
            });
            HandlerThread handlerThread = this.mEglThread;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            VideoSinkTask videoSinkTask = this.mVideoSinkTask;
            if (videoSinkTask != null) {
                videoSinkTask.exit();
            }
            KTVManagerImpl kTVManagerImpl = this.mKTVManager;
            if (kTVManagerImpl != null) {
                kTVManagerImpl.destroy();
                this.mKTVManager = null;
            }
            LogUtil.setLoggerSink(null);
        } finally {
            this.mJniWriteLock.unlock();
        }
    }

    public boolean engineInvalid() {
        if (this.mNativeEngine == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IRTCAudioDeviceManager getAudioDeviceManager() {
        LogUtil.d("RtcVideoImpl", "getAudioDeviceManager");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getAudioDeviceManager failed.");
                return null;
            }
            long nativeGetAudioDeviceManager = NativeRTCVideoFunctions.nativeGetAudioDeviceManager(this.mNativeEngine);
            if (nativeGetAudioDeviceManager != 0 && nativeGetAudioDeviceManager != -1) {
                this.mAudioDeviceManagerInterval = new RTCAudioDeviceManager(nativeGetAudioDeviceManager);
                return this.mAudioDeviceManagerInterval;
            }
            LogUtil.e("RtcVideoImpl", "getAudioDeviceManager failed");
            this.mAudioDeviceManagerInterval = null;
            return this.mAudioDeviceManagerInterval;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IAudioEffectPlayer getAudioEffectPlayer() {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getAudioEffectPlayer");
            } else {
                AudioEffectPlayer audioEffectPlayer = this.mAudioEffectPlayer;
                if (audioEffectPlayer == null) {
                    long nativeGetAudioEffectPlayer = NativeRTCVideoFunctions.nativeGetAudioEffectPlayer(this.mNativeEngine);
                    if (nativeGetAudioEffectPlayer == 0) {
                        LogUtil.e("RtcVideoImpl", "getAudioEffectPlayer failed");
                    } else {
                        audioEffectPlayer = new AudioEffectPlayer(nativeGetAudioEffectPlayer, this.mNativeEngine);
                        this.mAudioEffectPlayer = audioEffectPlayer;
                    }
                }
                return audioEffectPlayer;
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IAudioMixingManager getAudioMixingManager() {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getAudioMixingManager");
            } else {
                AudioMixingManager audioMixingManager = this.mAudioMixingManager;
                if (audioMixingManager == null) {
                    long nativeGetAudioMixingManager = NativeRTCVideoFunctions.nativeGetAudioMixingManager(this.mNativeEngine);
                    if (nativeGetAudioMixingManager == 0) {
                        LogUtil.e("RtcVideoImpl", "getAudioMixingManager failed");
                    } else {
                        audioMixingManager = new AudioMixingManager(nativeGetAudioMixingManager, this.mNativeEngine);
                        this.mAudioMixingManager = audioMixingManager;
                    }
                }
                return audioMixingManager;
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public AudioRoute getAudioRoute() {
        LogUtil.d("RtcVideoImpl", "getAudioRoute");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getAudioRoute failed.");
                this.mJniReadLock.unlock();
                return null;
            }
            return AudioRoute.fromId(NativeRTCVideoFunctions.nativeGetAudioRoute(this.mNativeEngine));
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public float getCameraZoomMaxRatio() {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, PushScreenAudioFrame failed.");
                this.mJniReadLock.unlock();
                return -1.0f;
            }
            return NativeRTCVideoFunctions.nativeGetCameraZoomMaxRatio(this.mNativeEngine);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public EglBase getEGLContext() {
        EglBase eglBase = this.mRootEglBase;
        if (eglBase != null) {
            return eglBase;
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IKTVManager getKTVManager() {
        this.mJniReadLock.lock();
        try {
            KTVManagerImpl kTVManagerImpl = null;
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getKTVManger failed.");
            } else {
                synchronized (RTCVideoImpl.class) {
                    KTVManagerImpl kTVManagerImpl2 = this.mKTVManager;
                    if (kTVManagerImpl2 != null) {
                        return kTVManagerImpl2;
                    }
                    long nativeGetKTVManager = NativeRTCVideoFunctions.nativeGetKTVManager(this.mNativeEngine);
                    if (nativeGetKTVManager == 0) {
                        LogUtil.e("RtcVideoImpl", "getKTVManger failed");
                    } else {
                        kTVManagerImpl = new KTVManagerImpl(nativeGetKTVManager);
                        this.mKTVManager = kTVManagerImpl;
                    }
                }
            }
            return kTVManagerImpl;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public NetworkTimeInfo getNetworkTimeInfo() {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getNetworkTimeInfo");
                this.mJniReadLock.unlock();
                return null;
            }
            return NativeRTCVideoFunctions.nativeGetNetworkTimeInfo(this.mNativeEngine);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public ISingScoringManager getSingScoringManager() {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getSingScoringManager");
            } else {
                SingScoringManager singScoringManager = this.mSingScoringManager;
                if (singScoringManager == null) {
                    long nativeGetSingScoringManager = NativeRTCVideoFunctions.nativeGetSingScoringManager(this.mNativeEngine);
                    if (nativeGetSingScoringManager == 0) {
                        LogUtil.e("RtcVideoImpl", "getSingScoringManager failed");
                    } else {
                        singScoringManager = new SingScoringManager(this.mNativeEngine, nativeGetSingScoringManager);
                        this.mSingScoringManager = singScoringManager;
                    }
                }
                return singScoringManager;
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IVideoEffect getVideoEffectInterface() {
        LogUtil.d("RtcVideoImpl", "getVideoEffectInterface");
        return this.mAdvanceVideoEffect;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public boolean isCameraExposurePositionSupported() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != RTCEngineImpl.State.DESTORY) {
                return NativeRTCVideoFunctions.nativeIsCameraExposurePositionSupported(this.mNativeEngine);
            }
            this.mJniReadLock.unlock();
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public boolean isCameraFocusPositionSupported() {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != RTCEngineImpl.State.DESTORY) {
                return NativeRTCVideoFunctions.nativeIsCameraFocusPositionSupported(this.mNativeEngine);
            }
            this.mJniReadLock.unlock();
            return false;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public boolean isCameraTorchSupported() {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, PushScreenAudioFrame failed.");
                this.mJniReadLock.unlock();
                return false;
            }
            return NativeRTCVideoFunctions.nativeIsSupportFlashLight(this.mNativeEngine);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public boolean isCameraZoomSupported() {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, PushScreenAudioFrame failed.");
                this.mJniReadLock.unlock();
                return false;
            }
            return NativeRTCVideoFunctions.nativeIsCameraZoomSupported(this.mNativeEngine);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int logout() {
        int nativeLogout;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendBinaryMessage failed.");
                nativeLogout = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeLogout = NativeRTCVideoFunctions.nativeLogout(this.mNativeEngine);
            }
            return nativeLogout;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startAudioCapture() {
        int nativeStartAudioCapture;
        LogUtil.d("RtcVideoImpl", "startAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startAudioCapture failed.");
                nativeStartAudioCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStartAudioCapture = NativeRTCVideoFunctions.nativeStartAudioCapture(this.mNativeEngine);
            }
            return nativeStartAudioCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startVideoCapture() {
        int nativeStartVideoCapture;
        LogUtil.d("RtcVideoImpl", "startVideoCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startVideoCapture failed.");
                nativeStartVideoCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStartVideoCapture = NativeRTCVideoFunctions.nativeStartVideoCapture(this.mNativeEngine);
            }
            return nativeStartVideoCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopASR() {
        int nativeStopASR;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopASR");
                nativeStopASR = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopASR = NativeRTCVideoFunctions.nativeStopASR(this.mNativeEngine);
            }
            return nativeStopASR;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopAudioCapture() {
        int nativeStopAudioCapture;
        LogUtil.d("RtcVideoImpl", "stopAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopAudioCapture failed.");
                nativeStopAudioCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopAudioCapture = NativeRTCVideoFunctions.nativeStopAudioCapture(this.mNativeEngine);
            }
            return nativeStopAudioCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopAudioRecording() {
        int nativeStopAudioRecording;
        LogUtil.d("RtcVideoImpl", "startAudioRecording");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startFileRecording failed.");
                nativeStopAudioRecording = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopAudioRecording = NativeRTCVideoFunctions.nativeStopAudioRecording(this.mNativeEngine);
            }
            return nativeStopAudioRecording;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopChorusCacheSync() {
        int nativeStopChorusCacheSync;
        LogUtil.d("RtcVideoImpl", "stopChorusCacheSync...");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopChorusCacheSync failed.");
                nativeStopChorusCacheSync = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopChorusCacheSync = NativeRTCVideoFunctions.nativeStopChorusCacheSync(this.mNativeEngine);
            }
            return nativeStopChorusCacheSync;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopCloudProxy() {
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopCloudProxy failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                value = NativeRTCVideoFunctions.nativeStopCloudProxy(this.mNativeEngine);
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopEchoTest() {
        int nativeStopEchoTest;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopEchoTest failed.");
                nativeStopEchoTest = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.d("RtcVideoImpl", "stopEchoTest");
                nativeStopEchoTest = NativeRTCVideoFunctions.nativeStopEchoTest(this.mNativeEngine);
            }
            return nativeStopEchoTest;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopHardwareEchoDetection() {
        LogUtil.d("RtcVideoImpl", "stopHardwareEchoDetection");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopHardwareEchoDetection failed.");
                this.mJniReadLock.unlock();
                return -2;
            }
            return NativeRTCVideoFunctions.nativeStopHardwareEchoDetection(this.mNativeEngine);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopNetworkDetection() {
        int nativeStopNetworkProbe;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendCustomMessage failed.");
                nativeStopNetworkProbe = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopNetworkProbe = NativeRTCVideoFunctions.nativeStopNetworkProbe(this.mNativeEngine);
            }
            return nativeStopNetworkProbe;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopScreenCapture() {
        int nativeStopScreenCapture;
        LogUtil.d("RtcVideoImpl", "StopScreenCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, StopScreenAudioCapture failed.");
                nativeStopScreenCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopScreenCapture = NativeRTCVideoFunctions.nativeStopScreenCapture(this.mNativeEngine);
            }
            return nativeStopScreenCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopVideoCapture() {
        int nativeStopVideoCapture;
        LogUtil.d("RtcVideoImpl", "stopVideoCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopVideoCapture failed.");
                nativeStopVideoCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopVideoCapture = NativeRTCVideoFunctions.nativeStopVideoCapture(this.mNativeEngine);
            }
            return nativeStopVideoCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopVideoDigitalZoomControl() {
        int nativeStopVideoDigitalZoomControl;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopVideoDigitalZoomControl failed.");
                nativeStopVideoDigitalZoomControl = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopVideoDigitalZoomControl = NativeRTCVideoFunctions.nativeStopVideoDigitalZoomControl(this.mNativeEngine);
            }
            return nativeStopVideoDigitalZoomControl;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long getNativeHandle() {
        if (engineInvalid()) {
            LogUtil.e("RtcVideoImpl", "native engine is invalid, getNativeHandle failed.");
            return -1L;
        }
        return this.mNativeEngine;
    }

    public ILocalEncodedVideoFrameObserver getEncodedVideoFrameObserver() {
        return this.mLocalEncodedVideoFrameObserver;
    }

    public IExternalVideoEncoderEventHandler getExternalVideoEncoderEventHandler() {
        return this.mExternalVideoEncoderHandler;
    }

    public ILiveTranscodingObserver getLiveTranscodingObserver() {
        return this.mLiveTranscodingObserver;
    }

    public IMetadataObserver getMetadataObserver() {
        return this.mMetadataObserver;
    }

    public IRemoteEncodedVideoFrameObserver getRemoteEncodedVideoFrameObserver() {
        return this.mRemoteEncodedVideoFrameObserver;
    }

    public IRTCVideoEventHandler getRtcEngineHandler() {
        return this.mRtcEngineHandler;
    }

    private void initEglContext(Object obj) {
        if (obj == null) {
            this.mRootEglBase = ZVB.LIZ();
            this.mIsUseCustomEglEnv = false;
            return;
        }
        if (obj instanceof EGLContext) {
            this.mRootEglBase = ZVB.LIZLLL((EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof android.opengl.EGLContext) {
            this.mRootEglBase = ZVB.LJFF((android.opengl.EGLContext) obj, EglBase.CONFIG_PLAIN);
        } else if (obj instanceof EglBase) {
            this.mRootEglBase = ZVB.LIZJ(((EglBase) obj).getEglBaseContext(), EglBase.CONFIG_PLAIN);
        } else {
            this.mRootEglBase = ZVB.LIZ();
        }
        this.mIsUseCustomEglEnv = true;
    }

    public /* synthetic */ void lambda$new$1(int i) {
        String str;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetAppState failed.");
                return;
            }
            long j = this.mNativeEngine;
            if (i == 1) {
                str = "active";
            } else {
                str = "background";
            }
            NativeRTCVideoFunctions.nativeSetAppState(j, str);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public /* synthetic */ void lambda$new$2(Object obj) {
        initEglContext(obj);
        this.mRootEglBase.createDummyPbufferSurface();
        this.mRootEglBase.makeCurrent();
        NativeRTCVideoFunctions.nativeSetHardWareEncodeContext();
        this.mRootEglBase.detachCurrent();
    }

    public static int setLogConfig(RTCLogConfig rTCLogConfig) {
        if (!mLibraryLoaded) {
            return -1;
        }
        return NativeRTCVideoFunctions.nativeSetLogConfig(rTCLogConfig.logLevel.getValue(), rTCLogConfig.logPath, rTCLogConfig.logFileSize, rTCLogConfig.logFilenamePrefix);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int appendVideoEffectNodes(List<String> list) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.appendEffectNodes(list);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int clearVideoWatermark(StreamIndex streamIndex) {
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, clearVideoWatermark failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                value = NativeRTCVideoFunctions.nativeClearVideoWatermark(this.mNativeEngine, streamIndex.value());
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public RTCRoom createRTCRoom(String str) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, createRoom failed.");
            } else {
                if (str == null) {
                    str = "";
                }
                long nativeCreateRoom = NativeRTCVideoFunctions.nativeCreateRoom(this.mNativeEngine, str);
                if (nativeCreateRoom == 0) {
                    LogUtil.e("RtcVideoImpl", "createRoom faildd, native room is invalid");
                } else {
                    return new RTCRoomImpl(str, nativeCreateRoom);
                }
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public void destroyRTCVideo(long j) {
        NativeRTCVideoFunctions.nativeDestroyRTCVideo(j);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod) {
        int nativeDisableAudioFrameCallback;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, disableAudioFrameCallback failed.");
                nativeDisableAudioFrameCallback = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeDisableAudioFrameCallback = NativeRTCVideoFunctions.nativeDisableAudioFrameCallback(this.mNativeEngine, audioFrameCallbackMethod.value());
            }
            return nativeDisableAudioFrameCallback;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int disableAudioProcessor(AudioProcessorMethod audioProcessorMethod) {
        int nativeDisableAudioProcessor;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, disableAudioProcessor failed.");
                nativeDisableAudioProcessor = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeDisableAudioProcessor = NativeRTCVideoFunctions.nativeDisableAudioProcessor(this.mNativeEngine, audioProcessorMethod.value());
            }
            return nativeDisableAudioProcessor;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig) {
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, EnableAudioPropertiesReport failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                value = NativeRTCVideoFunctions.nativeEnableAudioPropertiesReport(this.mNativeEngine, audioPropertiesConfig.interval, audioPropertiesConfig.enableSpectrum, audioPropertiesConfig.enableVad, audioPropertiesConfig.localMainReportMode.value(), audioPropertiesConfig.smooth, audioPropertiesConfig.audioReportMode.value(), audioPropertiesConfig.enableVoicePitch);
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableCameraAutoExposureFaceMode(boolean z) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != RTCEngineImpl.State.DESTORY) {
                return NativeRTCVideoFunctions.nativeEnableCameraAutoExposureFaceMode(this.mNativeEngine, z);
            }
            this.mJniReadLock.unlock();
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableEffectBeauty(boolean z) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableEffectBeauty failed.");
                this.mJniReadLock.unlock();
                return 1000;
            }
            return NativeRTCVideoFunctions.nativeEnableEffectBeauty(this.mNativeEngine, z);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableExternalSoundCard(boolean z) {
        int nativeEnableExternalSoundCard;
        LogUtil.d("RtcVideoImpl", "enableExternalSoundCard");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableExternalSoundCard failed.");
                nativeEnableExternalSoundCard = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeEnableExternalSoundCard = NativeRTCVideoFunctions.nativeEnableExternalSoundCard(this.mNativeEngine, z);
            }
            return nativeEnableExternalSoundCard;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableLocalVoiceReverb(boolean z) {
        int nativeEnableLocalVoiceReverb;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableLocalVoiceReverb...enable: ");
        LIZ.append(z);
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableLocalVoiceReverb failed.");
                nativeEnableLocalVoiceReverb = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeEnableLocalVoiceReverb = NativeRTCVideoFunctions.nativeEnableLocalVoiceReverb(this.mNativeEngine, z);
            }
            return nativeEnableLocalVoiceReverb;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enablePlaybackDucking(boolean z) {
        int nativeEnablePlaybackDucking;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, EnablePlaybackDucking failed.");
                nativeEnablePlaybackDucking = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeEnablePlaybackDucking = NativeRTCVideoFunctions.nativeEnablePlaybackDucking(this.mNativeEngine, z);
            }
            return nativeEnablePlaybackDucking;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableSimulcastMode(boolean z) {
        int nativeEnableSimulcastMode;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoResolutions failed.");
                nativeEnableSimulcastMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeEnableSimulcastMode = NativeRTCVideoFunctions.nativeEnableSimulcastMode(this.mNativeEngine, z);
            }
            return nativeEnableSimulcastMode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableVideoEffect(boolean z) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableVideoEffect failed.");
                this.mJniReadLock.unlock();
                return 1000;
            }
            return NativeRTCVideoFunctions.nativeEnableVideoEffect(this.mNativeEngine, z);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableVocalInstrumentBalance(boolean z) {
        int nativeEnableVocalInstrumentBalance;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, EnableVocalInstrumentBalance failed.");
                nativeEnableVocalInstrumentBalance = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeEnableVocalInstrumentBalance = NativeRTCVideoFunctions.nativeEnableVocalInstrumentBalance(this.mNativeEngine, z);
            }
            return nativeEnableVocalInstrumentBalance;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public IMediaPlayer getMediaPlayer(int i) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, getMediaPlayer");
            } else {
                Map<Integer, RtcMediaPlayer> map = this.mRtcMediaPlayerMap;
                if (map != null && map.containsKey(Integer.valueOf(i))) {
                    return this.mRtcMediaPlayerMap.get(Integer.valueOf(i));
                }
                long nativeGetMediaPlayer = NativeRTCVideoFunctions.nativeGetMediaPlayer(this.mNativeEngine, i);
                if (nativeGetMediaPlayer == 0) {
                    LogUtil.e("RtcVideoImpl", "getMediaPlayer failed");
                } else {
                    RtcMediaPlayer rtcMediaPlayer = new RtcMediaPlayer(nativeGetMediaPlayer, this.mNativeEngine);
                    if (this.mRtcMediaPlayerMap == null) {
                        this.mRtcMediaPlayerMap = new HashMap();
                    }
                    this.mRtcMediaPlayerMap.put(Integer.valueOf(i), rtcMediaPlayer);
                    return rtcMediaPlayer;
                }
            }
            return null;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int getPeerOnlineStatus(String str) {
        int nativeGetPeerOnlineStatus;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendBinaryMessage failed.");
                nativeGetPeerOnlineStatus = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeGetPeerOnlineStatus = NativeRTCVideoFunctions.nativeGetPeerOnlineStatus(this.mNativeEngine, str);
            }
            return nativeGetPeerOnlineStatus;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int invokeExperimentalAPI(String str) {
        int value;
        LogUtil.d("RtcVideoImpl", "invokeExperimentalAPI");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startCloudProxy failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                value = NativeRTCVideoFunctions.nativeInvokeExperimentalAPI(this.mNativeEngine, str);
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int muteAudioPlayback(MuteState muteState) {
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, muteAudioPlayback failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                value = NativeRTCVideoFunctions.nativeMuteAudioPlayback(this.mNativeEngine, muteState.value());
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pullExternalAudioFrame(AudioFrame audioFrame) {
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, pullExternalAudioFrame failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                value = NativeRTCVideoFunctions.nativePullExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pushExternalAudioFrame(AudioFrame audioFrame) {
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, pushExternalAudioFrame failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                value = NativeRTCVideoFunctions.nativePushExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pushExternalVideoFrame(VideoFrame videoFrame) {
        return pushExternalVideoFrame(videoFrame, this.mIsUseCustomEglEnv);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pushScreenAudioFrame(AudioFrame audioFrame) {
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, PushScreenAudioFrame failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                value = NativeRTCVideoFunctions.nativePushScreenAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pushScreenVideoFrame(final VideoFrame videoFrame) {
        int value;
        ReturnStatus fromId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "pushExternalVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
                videoFrame.release();
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoFrame == null) {
                LogUtil.i("RtcVideoImpl", "pushExternalVideoFrame: videoFrame is null, drop frame.");
                value = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (!this.mUseExtVideoSource) {
                LogUtil.i("RtcVideoImpl", "pushExternalVideoFrame: not enable external video source, drop frame.");
                videoFrame.release();
                value = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                if (videoFrame.getFrameType() == VideoFrameType.RAW_MEMORY || videoFrame.hasReleaseCallback()) {
                    fromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushScreenByteRtcFrame(this.mNativeEngine, videoFrame));
                } else {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    videoFrame.retain();
                    GLTextureVideoFrameBuilder gLTextureVideoFrameBuilder = new GLTextureVideoFrameBuilder(videoFrame.getPixelFormat());
                    gLTextureVideoFrameBuilder.setTextureID(videoFrame.getTextureID());
                    gLTextureVideoFrameBuilder.setTextureMatrix(videoFrame.getTextureMatrix());
                    gLTextureVideoFrameBuilder.setEGLContext(videoFrame.getEGLContext());
                    gLTextureVideoFrameBuilder.setColorSpace(videoFrame.getColorSpace());
                    gLTextureVideoFrameBuilder.setWidth(videoFrame.getWidth());
                    gLTextureVideoFrameBuilder.setHeight(videoFrame.getHeight());
                    gLTextureVideoFrameBuilder.setRotation(videoFrame.getRotation());
                    gLTextureVideoFrameBuilder.setExternalDataInfo(videoFrame.getExternalDataInfo());
                    gLTextureVideoFrameBuilder.setSupplementaryInfo(videoFrame.getSupplementaryInfo());
                    gLTextureVideoFrameBuilder.setTimeStampUs(videoFrame.getTimeStampUs());
                    gLTextureVideoFrameBuilder.setReleaseCallback(new Runnable() { // from class: X.ZVg
                        @Override // java.lang.Runnable
                        public final void run() {
                            RTCVideoImpl.lambda$pushScreenVideoFrame$6(VideoFrame.this, countDownLatch);
                        }
                    });
                    VideoFrame build = gLTextureVideoFrameBuilder.build();
                    fromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushScreenByteRtcFrame(this.mNativeEngine, build));
                    build.release();
                    if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 1000L)) {
                        LogUtil.w("RtcVideoImpl", "pushExternalVideoFrame: pushExternalVideoFrame timeout.");
                    }
                }
                value = fromId.value();
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        int nativeSetAudioFrameObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, registerAudioFrameObserver failed.");
                nativeSetAudioFrameObserver = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetAudioFrameObserver = NativeRTCVideoFunctions.nativeSetAudioFrameObserver(this.mNativeEngine, iAudioFrameObserver);
            }
            return nativeSetAudioFrameObserver;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor) {
        int nativeSetAudioFrameProcessor;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, registerAudioProcessor failed.");
                nativeSetAudioFrameProcessor = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetAudioFrameProcessor = NativeRTCVideoFunctions.nativeSetAudioFrameProcessor(this.mNativeEngine, iAudioFrameProcessor);
            }
            return nativeSetAudioFrameProcessor;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver) {
        int nativeRegisterLocalEncodedVideoFrameObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, registerAudioFrameObserver failed.");
                nativeRegisterLocalEncodedVideoFrameObserver = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mLocalEncodedVideoFrameObserver = iLocalEncodedVideoFrameObserver;
                if (iLocalEncodedVideoFrameObserver == null) {
                    nativeRegisterLocalEncodedVideoFrameObserver = NativeRTCVideoFunctions.nativeRegisterLocalEncodedVideoFrameObserver(this.mNativeEngine, null);
                } else {
                    nativeRegisterLocalEncodedVideoFrameObserver = NativeRTCVideoFunctions.nativeRegisterLocalEncodedVideoFrameObserver(this.mNativeEngine, this.mRtcLocalEncodedVideoFrameObserver);
                }
            }
            return nativeRegisterLocalEncodedVideoFrameObserver;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver) {
        int nativeRegisterRemoteEncodedVideoFrameObserver;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, RegisterRemoteEncodedVideoFrameObserver failed.");
                nativeRegisterRemoteEncodedVideoFrameObserver = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mRemoteEncodedVideoFrameObserver = iRemoteEncodedVideoFrameObserver;
                if (iRemoteEncodedVideoFrameObserver == null) {
                    nativeRegisterRemoteEncodedVideoFrameObserver = NativeRTCVideoFunctions.nativeRegisterRemoteEncodedVideoFrameObserver(this.mNativeEngine, null);
                } else {
                    nativeRegisterRemoteEncodedVideoFrameObserver = NativeRTCVideoFunctions.nativeRegisterRemoteEncodedVideoFrameObserver(this.mNativeEngine, this.mRtcRemoteEncodedVideoFrameObserver);
                }
            }
            return nativeRegisterRemoteEncodedVideoFrameObserver;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int removeVideoEffectNodes(List<String> list) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.removeEffectNodes(list);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int requestRemoteVideoKeyFrame(RemoteStreamKey remoteStreamKey) {
        int nativeRequestRemoteVideoKeyFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, RequestRemoteVideoKeyFrame failed.");
                nativeRequestRemoteVideoKeyFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeRequestRemoteVideoKeyFrame = NativeRTCVideoFunctions.nativeRequestRemoteVideoKeyFrame(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value());
            }
            return nativeRequestRemoteVideoKeyFrame;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long sendServerBinaryMessage(byte[] bArr) {
        long nativeSendServerBinaryMessage;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendBinaryMessage failed.");
                nativeSendServerBinaryMessage = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSendServerBinaryMessage = NativeRTCVideoFunctions.nativeSendServerBinaryMessage(this.mNativeEngine, bArr);
            }
            return nativeSendServerBinaryMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long sendServerMessage(String str) {
        long nativeSendServerMessage;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendBinaryMessage failed.");
                nativeSendServerMessage = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSendServerMessage = NativeRTCVideoFunctions.nativeSendServerMessage(this.mNativeEngine, str);
            }
            return nativeSendServerMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAnsMode(AnsMode ansMode) {
        int nativeSetAnsMode;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAnsMode:");
        LIZ.append(ansMode);
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setAnsMode failed.");
                nativeSetAnsMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (ansMode == null) {
                LogUtil.e("RtcVideoImpl", "ansMode is invalid, setAnsMode failed.");
                nativeSetAnsMode = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                nativeSetAnsMode = NativeRTCVideoFunctions.nativeSetAnsMode(this.mNativeEngine, ansMode.value());
            }
            return nativeSetAnsMode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioPlaybackDevice(AudioPlaybackDevice audioPlaybackDevice) {
        int nativeSetAudioPlaybackDevice;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioPlaybackDevice: ");
        LIZ.append(audioPlaybackDevice.value());
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setAudioPlaybackDevice failed.");
                nativeSetAudioPlaybackDevice = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetAudioPlaybackDevice = NativeRTCVideoFunctions.nativeSetAudioPlaybackDevice(this.mNativeEngine, audioPlaybackDevice.value());
            }
            return nativeSetAudioPlaybackDevice;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioProfile(AudioProfileType audioProfileType) {
        int nativeSetAudioProfile;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioProfile:");
        LIZ.append(audioProfileType);
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setAudioProfile failed.");
                nativeSetAudioProfile = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (audioProfileType == null) {
                LogUtil.e("RtcVideoImpl", "audioProfile is invalid, setAudioProfile failed.");
                nativeSetAudioProfile = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                nativeSetAudioProfile = NativeRTCVideoFunctions.nativeSetAudioProfile(this.mNativeEngine, audioProfileType.value());
            }
            return nativeSetAudioProfile;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioRenderType(AudioRenderType audioRenderType) {
        int nativeSetAudioRenderType;
        LogUtil.d("RtcVideoImpl", "SetAudioRenderType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetAudioRenderType failed.");
                nativeSetAudioRenderType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetAudioRenderType = NativeRTCVideoFunctions.nativeSetAudioRenderType(this.mNativeEngine, audioRenderType.value());
            }
            return nativeSetAudioRenderType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioRoute(AudioRoute audioRoute) {
        int nativeSetAudioRoute;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioRoute: ");
        LIZ.append(audioRoute.value());
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setAudioRoute failed.");
                nativeSetAudioRoute = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetAudioRoute = NativeRTCVideoFunctions.nativeSetAudioRoute(this.mNativeEngine, audioRoute.value());
            }
            return nativeSetAudioRoute;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioScenario(AudioScenarioType audioScenarioType) {
        int nativeSetAudioScenario;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioScenario...audioScenario: ");
        LIZ.append(audioScenarioType);
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setAudioScenario failed.");
                nativeSetAudioScenario = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetAudioScenario = NativeRTCVideoFunctions.nativeSetAudioScenario(this.mNativeEngine, audioScenarioType.value());
            }
            return nativeSetAudioScenario;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioSourceType(AudioSourceType audioSourceType) {
        int nativeSetAudioSourceType;
        LogUtil.d("RtcVideoImpl", "SetAudioSourceType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetAudioSourceType failed.");
                nativeSetAudioSourceType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetAudioSourceType = NativeRTCVideoFunctions.nativeSetAudioSourceType(this.mNativeEngine, audioSourceType.value());
            }
            return nativeSetAudioSourceType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setBusinessId(String str) {
        int nativeSetBusinessId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setBusinessId failed.");
                nativeSetBusinessId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetBusinessId = NativeRTCVideoFunctions.nativeSetBusinessId(this.mNativeEngine, str);
            }
            return nativeSetBusinessId;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCameraAdaptiveMinimumFrameRate(int i) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != RTCEngineImpl.State.DESTORY) {
                return NativeRTCVideoFunctions.nativeSetCameraAdaptiveMinimumFrameRate(this.mNativeEngine, i);
            }
            this.mJniReadLock.unlock();
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCameraExposureCompensation(float f) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != RTCEngineImpl.State.DESTORY) {
                return NativeRTCVideoFunctions.nativeSetCameraExposureCompensation(this.mNativeEngine, f);
            }
            this.mJniReadLock.unlock();
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCameraTorch(TorchState torchState) {
        boolean z;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, PushScreenAudioFrame failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            if (torchState == TorchState.TORCH_STATE_ON) {
                z = true;
            } else {
                z = false;
            }
            return NativeRTCVideoFunctions.nativeEnableCameraTorch(this.mNativeEngine, z);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCameraZoomRatio(float f) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, PushScreenAudioFrame failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            return NativeRTCVideoFunctions.nativeSetCameraZoomRatio(this.mNativeEngine, f);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCellularEnhancement(MediaTypeEnhancementConfig mediaTypeEnhancementConfig) {
        LogUtil.d("RtcVideoImpl", "setCellularEnhancement");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setCellularEnhancement failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            return NativeRTCVideoFunctions.nativeSetCellularEnhancement(this.mNativeEngine, new InternalMediaTypeEnhancementConfig(mediaTypeEnhancementConfig));
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCustomizeEncryptHandler(RTCEncryptHandler rTCEncryptHandler) {
        int nativeSetCustomizeEncryptHandler;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setCustomizeEncryptHandler failed.");
                nativeSetCustomizeEncryptHandler = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetCustomizeEncryptHandler = NativeRTCVideoFunctions.nativeSetCustomizeEncryptHandler(this.mNativeEngine, rTCEncryptHandler);
            }
            return nativeSetCustomizeEncryptHandler;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setDefaultAudioRoute(AudioRoute audioRoute) {
        int nativeSetDefaultAudioRoute;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDefaultAudioRoute: ");
        LIZ.append(audioRoute.value());
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setDefaultAudioRoute failed.");
                nativeSetDefaultAudioRoute = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetDefaultAudioRoute = NativeRTCVideoFunctions.nativeSetDefaultAudioRoute(this.mNativeEngine, audioRoute.value());
            }
            return nativeSetDefaultAudioRoute;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setDummyCaptureImagePath(String str) {
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setDummyCaptureImagePath failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                value = NativeRTCVideoFunctions.nativeSetDummyCaptureImagePath(this.mNativeEngine, str);
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setEarMonitorMode(EarMonitorMode earMonitorMode) {
        int nativeSetEarMonitorMode;
        LogUtil.d("RtcVideoImpl", "setEarMonitorMode");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setEarMonitorMode failed.");
                nativeSetEarMonitorMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetEarMonitorMode = NativeRTCVideoFunctions.nativeSetEarMonitorMode(this.mNativeEngine, earMonitorMode.value());
            }
            return nativeSetEarMonitorMode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setEarMonitorVolume(int i) {
        int nativeSetEarMonitorVolume;
        LogUtil.d("RtcVideoImpl", "setEarMonitorVolume");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setEarMonitorVolume failed.");
                nativeSetEarMonitorVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetEarMonitorVolume = NativeRTCVideoFunctions.nativeSetEarMonitorVolume(this.mNativeEngine, i);
            }
            return nativeSetEarMonitorVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler) {
        int nativeSetExternalVideoEncoderEventHandler;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setExternalVideoEncoderEventHandler failed.");
                nativeSetExternalVideoEncoderEventHandler = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mExternalVideoEncoderHandler = iExternalVideoEncoderEventHandler;
                if (iExternalVideoEncoderEventHandler == null) {
                    nativeSetExternalVideoEncoderEventHandler = NativeRTCVideoFunctions.nativeSetExternalVideoEncoderEventHandler(this.mNativeEngine, null);
                } else {
                    nativeSetExternalVideoEncoderEventHandler = NativeRTCVideoFunctions.nativeSetExternalVideoEncoderEventHandler(this.mNativeEngine, this.mRtcExVideoEncoderHandler);
                }
            }
            return nativeSetExternalVideoEncoderEventHandler;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setInternalEventHandler(IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler) {
        this.mEngineInternalEventHandler.setInternalEventHandler(iRTCEngineInternalEventHandler);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalProxy(List<LocalProxyConfiguration> list) {
        LogUtil.d("RtcVideoImpl", "setLocalProxy");
        this.mJniReadLock.lock();
        try {
            if (this.mNativeEngine == -1 || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setLocalProxy failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<LocalProxyConfiguration> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new InternalLocalProxyConfiguration(it.next()));
            }
            return NativeRTCVideoFunctions.nativeSetLocalProxy(this.mNativeEngine, arrayList);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVideoMirrorType(MirrorType mirrorType) {
        int nativeSetLocalVideoMirrorType;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setLocalVideoMirrorType failed.");
                nativeSetLocalVideoMirrorType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetLocalVideoMirrorType = NativeRTCVideoFunctions.nativeSetLocalVideoMirrorType(this.mNativeEngine, mirrorType.value());
            }
            return nativeSetLocalVideoMirrorType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVoiceEqualization(VoiceEqualizationConfig voiceEqualizationConfig) {
        int nativeSetLocalVoiceEqualization;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLocalVoiceEqualization...frequency : ");
        LIZ.append(voiceEqualizationConfig.frequency);
        LIZ.append(", gain: ");
        LIZ.append(voiceEqualizationConfig.gain);
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setLocalVoiceEqualization failed.");
                nativeSetLocalVoiceEqualization = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetLocalVoiceEqualization = NativeRTCVideoFunctions.nativeSetLocalVoiceEqualization(this.mNativeEngine, voiceEqualizationConfig.frequency.value(), voiceEqualizationConfig.gain);
            }
            return nativeSetLocalVoiceEqualization;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVoicePitch(int i) {
        int nativeSetLocalVoicePitch;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setLocalVoicePitch failed.");
                nativeSetLocalVoicePitch = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetLocalVoicePitch = NativeRTCVideoFunctions.nativeSetLocalVoicePitch(this.mNativeEngine, i);
            }
            return nativeSetLocalVoicePitch;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVoiceReverbParam(VoiceReverbConfig voiceReverbConfig) {
        int nativeSetLocalVoiceReverbParam;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLocalVoiceReverbParam...roomSize: ");
        LIZ.append(voiceReverbConfig.roomSize);
        LIZ.append(", decayTime: ");
        LIZ.append(voiceReverbConfig.decayTime);
        LIZ.append(", damping:");
        LIZ.append(voiceReverbConfig.damping);
        LIZ.append(", wetGain:");
        LIZ.append(voiceReverbConfig.wetGain);
        LIZ.append(", dryGain:");
        LIZ.append(voiceReverbConfig.dryGain);
        LIZ.append(", preDelay:");
        LIZ.append(voiceReverbConfig.preDelay);
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setLocalVoiceReverbParam failed.");
                nativeSetLocalVoiceReverbParam = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetLocalVoiceReverbParam = NativeRTCVideoFunctions.nativeSetLocalVoiceReverbParam(this.mNativeEngine, voiceReverbConfig.roomSize, voiceReverbConfig.decayTime, voiceReverbConfig.damping, voiceReverbConfig.wetGain, voiceReverbConfig.dryGain, voiceReverbConfig.preDelay);
            }
            return nativeSetLocalVoiceReverbParam;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setOnDestroyCompletedCallback(Runnable runnable) {
        this.mOnDestroyCompletedCallback = runnable;
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setPlaybackVolume(int i) {
        int nativeSetPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setPlaybackVolume failed.");
                nativeSetPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetPlaybackVolume = NativeRTCVideoFunctions.nativeSetPlaybackVolume(this.mNativeEngine, i);
            }
            return nativeSetPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setPublishFallbackOption(PublishFallbackOption publishFallbackOption) {
        int nativeSetPublishFallbackOption;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPublishFallbackOption: option: ");
        LIZ.append(publishFallbackOption);
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setPublishFallbackOption failed.");
                nativeSetPublishFallbackOption = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetPublishFallbackOption = NativeRTCVideoFunctions.nativeSetPublishFallbackOption(this.mNativeEngine, publishFallbackOption.value());
            }
            return nativeSetPublishFallbackOption;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRtcVideoEventHandler(IRTCVideoEventHandler iRTCVideoEventHandler) {
        LogUtil.d("RtcVideoImpl", "setRtcEngineEventHandler");
        this.mRtcEngineHandler = iRTCVideoEventHandler;
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRuntimeParameters(JSONObject jSONObject) {
        String jSONObject2;
        int nativeSetRuntimeParameters;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetRuntimeParameters failed.");
                nativeSetRuntimeParameters = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                long j = this.mNativeEngine;
                if (jSONObject == null) {
                    jSONObject2 = "";
                } else {
                    jSONObject2 = jSONObject.toString();
                }
                nativeSetRuntimeParameters = NativeRTCVideoFunctions.nativeSetRuntimeParameters(j, jSONObject2);
            }
            return nativeSetRuntimeParameters;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setScreenAudioSourceType(AudioSourceType audioSourceType) {
        int nativeSetScreenAudioSourceType;
        LogUtil.d("RtcVideoImpl", "SetScreenAudioSourceType");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetScreenAudioSourceType failed.");
                nativeSetScreenAudioSourceType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetScreenAudioSourceType = NativeRTCVideoFunctions.nativeSetScreenAudioSourceType(this.mNativeEngine, audioSourceType.value());
            }
            return nativeSetScreenAudioSourceType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setScreenAudioStreamIndex(StreamIndex streamIndex) {
        int nativeSetScreenAudioStreamIndex;
        this.mJniReadLock.lock();
        try {
            LogUtil.d("RtcVideoImpl", "SetScreenAudioStreamIndex");
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetScreenAudioStreamIndex failed.");
                nativeSetScreenAudioStreamIndex = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetScreenAudioStreamIndex = NativeRTCVideoFunctions.nativeSetScreenAudioStreamIndex(this.mNativeEngine, streamIndex.value());
            }
            return nativeSetScreenAudioStreamIndex;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setScreenVideoEncoderConfig(ScreenVideoEncoderConfig screenVideoEncoderConfig) {
        int nativeSetScreenVideoEncoderConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setScreenVideoEncoderConfig failed.");
                nativeSetScreenVideoEncoderConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetScreenVideoEncoderConfig = NativeRTCVideoFunctions.nativeSetScreenVideoEncoderConfig(this.mNativeEngine, new InternalScreenVideoEncoderConfig(screenVideoEncoderConfig));
            }
            return nativeSetScreenVideoEncoderConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions) {
        int nativeSetRemoteSubscribeFallbackOption;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setRemoteSubscribeFallbackOption: option: ");
        LIZ.append(subscribeFallbackOptions);
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setRemoteSubscribeFallbackOption failed.");
                nativeSetRemoteSubscribeFallbackOption = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetRemoteSubscribeFallbackOption = NativeRTCVideoFunctions.nativeSetRemoteSubscribeFallbackOption(this.mNativeEngine, subscribeFallbackOptions.value());
            }
            return nativeSetRemoteSubscribeFallbackOption;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoCaptureConfig(VideoCaptureConfig videoCaptureConfig) {
        int nativeSetVideoCaptureConfig;
        this.mJniReadLock.lock();
        try {
            if (videoCaptureConfig == null) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid or videoCaptureConfig is null, setVideoCaptureConfig failed.");
                nativeSetVideoCaptureConfig = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid or videoCaptureConfig is null, setVideoCaptureConfig failed.");
                nativeSetVideoCaptureConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setVideoCaptureConfig: ");
                LIZ.append(videoCaptureConfig.toString());
                LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
                nativeSetVideoCaptureConfig = NativeRTCVideoFunctions.nativeSetVideoCaptureConfig(this.mNativeEngine, new InternalVideoCaptureConfig(videoCaptureConfig.capturePreference.getValue(), videoCaptureConfig.width, videoCaptureConfig.height, videoCaptureConfig.frameRate));
            }
            return nativeSetVideoCaptureConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoDenoiser(VideoDenoiseMode videoDenoiseMode) {
        int nativeSetVideoDenoiser;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVideoDenoiser: ");
        LIZ.append(videoDenoiseMode.toString());
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoDenoiser failed.");
                nativeSetVideoDenoiser = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetVideoDenoiser = NativeRTCVideoFunctions.nativeSetVideoDenoiser(this.mNativeEngine, videoDenoiseMode.value());
            }
            return nativeSetVideoDenoiser;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoDigitalZoomControl(ZoomDirectionType zoomDirectionType) {
        int nativeSetVideoDigitalZoomControl;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoDigitalZoomControl failed.");
                nativeSetVideoDigitalZoomControl = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetVideoDigitalZoomControl = NativeRTCVideoFunctions.nativeSetVideoDigitalZoomControl(this.mNativeEngine, zoomDirectionType.value());
            }
            return nativeSetVideoDigitalZoomControl;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEffectAlgoModelPath(String str) {
        int nativeSetVideoEffectAlgoModelPath;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoEffectAlgoModelPath failed.");
                nativeSetVideoEffectAlgoModelPath = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetVideoEffectAlgoModelPath = NativeRTCVideoFunctions.nativeSetVideoEffectAlgoModelPath(this.mNativeEngine, str);
            }
            return nativeSetVideoEffectAlgoModelPath;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEffectColorFilter(String str) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.setColorFilter(str);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEffectColorFilterIntensity(float f) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.setColorFilterIntensity(f);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEffectExpressionDetect(VideoEffectExpressionConfig videoEffectExpressionConfig) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.setVideoEffectExpressionDetect(videoEffectExpressionConfig);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEffectNodes(List<String> list) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.setEffectNodes(list);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEncoderConfig(VideoEncoderConfig[] videoEncoderConfigArr) {
        int nativeSetVideoEncoderConfigV2;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoEncoderConfig failed.");
                nativeSetVideoEncoderConfigV2 = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoEncoderConfigArr == null) {
                nativeSetVideoEncoderConfigV2 = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ArrayList arrayList = new ArrayList();
                int length = videoEncoderConfigArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        VideoEncoderConfig videoEncoderConfig = videoEncoderConfigArr[i];
                        if (!videoEncoderConfig.isValid()) {
                            LogUtil.e("RtcVideoImpl", "setVideoEncoderConfig with illegal params");
                            nativeSetVideoEncoderConfigV2 = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                            break;
                        }
                        arrayList.add(new InternalVideoEncoderConfig(videoEncoderConfig));
                        i++;
                    } else {
                        nativeSetVideoEncoderConfigV2 = NativeRTCVideoFunctions.nativeSetVideoEncoderConfigV2(this.mNativeEngine, arrayList);
                        break;
                    }
                }
            }
            return nativeSetVideoEncoderConfigV2;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoOrientation(VideoOrientation videoOrientation) {
        int nativeSetVideoOrientation;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoOrientation failed.");
                nativeSetVideoOrientation = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetVideoOrientation = NativeRTCVideoFunctions.nativeSetVideoOrientation(this.mNativeEngine, videoOrientation.value());
            }
            return nativeSetVideoOrientation;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoRotationMode(VideoRotationMode videoRotationMode) {
        int nativeSetVideoRotationMode;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoRotationMode failed.");
                nativeSetVideoRotationMode = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetVideoRotationMode = NativeRTCVideoFunctions.nativeSetVideoRotationMode(this.mNativeEngine, videoRotationMode.value());
            }
            return nativeSetVideoRotationMode;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVoiceChangerType(VoiceChangerType voiceChangerType) {
        int nativeSetVoiceChangerType;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVoiceChangerType...voiceChanger: ");
        LIZ.append(voiceChangerType);
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVoiceChangerType failed.");
                nativeSetVoiceChangerType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetVoiceChangerType = NativeRTCVideoFunctions.nativeSetVoiceChangerType(this.mNativeEngine, voiceChangerType.value());
            }
            return nativeSetVoiceChangerType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVoiceReverbType(VoiceReverbType voiceReverbType) {
        int nativeSetVoiceReverbType;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVoiceReverbType...voiceReverb: ");
        LIZ.append(voiceReverbType);
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVoiceReverbType failed.");
                nativeSetVoiceReverbType = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetVoiceReverbType = NativeRTCVideoFunctions.nativeSetVoiceReverbType(this.mNativeEngine, voiceReverbType.value());
            }
            return nativeSetVoiceReverbType;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startAudioRecording(AudioRecordingConfig audioRecordingConfig) {
        int nativeStartAudioRecording;
        LogUtil.d("RtcVideoImpl", "startAudioRecording");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startFileRecording failed.");
                nativeStartAudioRecording = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStartAudioRecording = NativeRTCVideoFunctions.nativeStartAudioRecording(this.mNativeEngine, audioRecordingConfig.absoluteFileName, audioRecordingConfig.sampleRate.value(), audioRecordingConfig.channel.value(), audioRecordingConfig.frameSource.value(), audioRecordingConfig.quality.value());
            }
            return nativeStartAudioRecording;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startCloudProxy(List<CloudProxyInfo> list) {
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startCloudProxy failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (list == null) {
                value = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<CloudProxyInfo> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new InternalCloudProxyInfo(it.next()));
                }
                value = NativeRTCVideoFunctions.nativeStartCloudProxy(this.mNativeEngine, arrayList);
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startHardwareEchoDetection(String str) {
        LogUtil.d("RtcVideoImpl", "startHardwareEchoDetection");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startHardwareEchoDetection failed.");
                this.mJniReadLock.unlock();
                return -2;
            }
            return NativeRTCVideoFunctions.nativeStartHardwareEchoDetection(this.mNativeEngine, str);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startPlayPublicStream(String str) {
        int nativeStartPlayPublicStream;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startPlayPublicStream failed.");
                nativeStartPlayPublicStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startPlayPublicStream...public stream id: ");
                LIZ.append(str);
                LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
                nativeStartPlayPublicStream = NativeRTCVideoFunctions.nativeStartPlayPublicStream(this.mNativeEngine, str);
            }
            return nativeStartPlayPublicStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startVideoDigitalZoomControl(ZoomDirectionType zoomDirectionType) {
        int nativeStartVideoDigitalZoomControl;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startVideoDigitalZoomControl failed.");
                nativeStartVideoDigitalZoomControl = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStartVideoDigitalZoomControl = NativeRTCVideoFunctions.nativeStartVideoDigitalZoomControl(this.mNativeEngine, zoomDirectionType.value());
            }
            return nativeStartVideoDigitalZoomControl;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopFileRecording(StreamIndex streamIndex) {
        int nativeStopFileRecording;
        LogUtil.d("RtcVideoImpl", "stopFileRecording");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopFileRecording failed.");
                nativeStopFileRecording = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopFileRecording = NativeRTCVideoFunctions.nativeStopFileRecording(this.mNativeEngine, streamIndex.value());
            }
            return nativeStopFileRecording;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopLiveTranscoding(String str) {
        int nativeStopLiveTranscoding;
        LogUtil.d("RtcVideoImpl", "disableLiveTranscoding...");
        this.mJniReadLock.lock();
        try {
            this.mEnableTranscode = false;
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, disableLiveTranscoding failed.");
                nativeStopLiveTranscoding = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopLiveTranscoding = NativeRTCVideoFunctions.nativeStopLiveTranscoding(this.mNativeEngine, str);
            }
            return nativeStopLiveTranscoding;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopPlayPublicStream(String str) {
        int nativeStopPlayPublicStream;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopPlayPublicStream failed.");
                nativeStopPlayPublicStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startPlayPublicStream...public stream id: ");
                LIZ.append(str);
                LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
                nativeStopPlayPublicStream = NativeRTCVideoFunctions.nativeStopPlayPublicStream(this.mNativeEngine, str);
            }
            return nativeStopPlayPublicStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopPushPublicStream(String str) {
        int nativeStopPushPublicStream;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopPushPublicStream failed.");
                nativeStopPushPublicStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopPushPublicStream = NativeRTCVideoFunctions.nativeStopPushPublicStream(this.mNativeEngine, str);
            }
            return nativeStopPushPublicStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int stopPushStreamToCDN(String str) {
        int nativeStopPushStreamToCDN;
        LogUtil.d("RtcVideoImpl", "stopPushStreamToCDN...");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, stopPushStreamToCDN failed.");
                nativeStopPushStreamToCDN = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStopPushStreamToCDN = NativeRTCVideoFunctions.nativeStopPushStreamToCDN(this.mNativeEngine, str);
            }
            return nativeStopPushStreamToCDN;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int switchCamera(CameraId cameraId) {
        int nativeSwitchCamera;
        boolean z;
        LogUtil.d("RtcVideoImpl", "switchCamera");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, switchCamera failed.");
                nativeSwitchCamera = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSwitchCamera = NativeRTCVideoFunctions.nativeSwitchCamera(this.mNativeEngine, cameraId.value());
                if (!this.mIsFront) {
                    z = true;
                } else {
                    z = false;
                }
                this.mIsFront = z;
            }
            return nativeSwitchCamera;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateLoginToken(String str) {
        int nativeUpdateLoginToken;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendBinaryMessage failed.");
                nativeUpdateLoginToken = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeUpdateLoginToken = NativeRTCVideoFunctions.nativeUpdateLoginToken(this.mNativeEngine, str);
            }
            return nativeUpdateLoginToken;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateScreenCapture(ScreenMediaType screenMediaType) {
        int nativeUpdateScreenCapture;
        LogUtil.d("RtcVideoImpl", "UpdateScreenCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, StopScreenAudioCapture failed.");
                nativeUpdateScreenCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeUpdateScreenCapture = NativeRTCVideoFunctions.nativeUpdateScreenCapture(this.mNativeEngine, screenMediaType.value());
            }
            return nativeUpdateScreenCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        return setVideoEncoderConfig(videoEncoderConfig, (JSONObject) null);
    }

    public static /* synthetic */ void lambda$pushExternalVideoFrame$5(VideoFrame videoFrame, CountDownLatch countDownLatch) {
        videoFrame.release();
        countDownLatch.countDown();
    }

    public static /* synthetic */ void lambda$pushScreenVideoFrame$6(VideoFrame videoFrame, CountDownLatch countDownLatch) {
        videoFrame.release();
        countDownLatch.countDown();
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int checkVideoEffectLicense(Context context, String str) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, checkVideoEffectLicense failed.");
                this.mJniReadLock.unlock();
                return -1;
            }
            return NativeRTCVideoFunctions.nativeCheckVideoEffectLicense(context, this.mNativeEngine, str);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat) {
        int nativeEnableAudioFrameCallback;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableAudioFrameCallback failed.");
                nativeEnableAudioFrameCallback = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeEnableAudioFrameCallback = NativeRTCVideoFunctions.nativeEnableAudioFrameCallback(this.mNativeEngine, audioFrameCallbackMethod.value(), audioFormat.sampleRate.value(), audioFormat.channel.value());
            }
            return nativeEnableAudioFrameCallback;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat) {
        int nativeEnableAudioProcessor;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableAudioProcessor failed.");
                nativeEnableAudioProcessor = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeEnableAudioProcessor = NativeRTCVideoFunctions.nativeEnableAudioProcessor(this.mNativeEngine, audioProcessorMethod.value(), audioFormat.sampleRate.value(), audioFormat.channel.value(), audioFormat.samplesPerCall);
            }
            return nativeEnableAudioProcessor;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int feedback(List<ProblemFeedbackOption> list, ProblemFeedbackInfo problemFeedbackInfo) {
        int nativeReportFeedback;
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetRuntimeParameters failed.");
                nativeReportFeedback = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                long j = 0;
                for (int i = 0; i < list.size(); i++) {
                    j |= list.get(i).value;
                }
                nativeReportFeedback = NativeRTCVideoFunctions.nativeReportFeedback(this.mNativeEngine, j, problemFeedbackInfo);
            }
            return nativeReportFeedback;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int login(String str, String str2) {
        int nativeLogin;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendBinaryMessage failed.");
                nativeLogin = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeLogin = NativeRTCVideoFunctions.nativeLogin(this.mNativeEngine, str, str2);
            }
            return nativeLogin;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pushExternalVideoFrame(final VideoFrame videoFrame, boolean z) {
        int value;
        ReturnStatus fromId;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "pushExternalVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
                videoFrame.release();
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (videoFrame == null) {
                LogUtil.i("RtcVideoImpl", "pushExternalVideoFrame: videoFrame is null, drop frame.");
                value = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (!this.mUseExtVideoSource) {
                LogUtil.i("RtcVideoImpl", "pushExternalVideoFrame: not enable external video source, drop frame.");
                videoFrame.release();
                value = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                if (videoFrame.getFrameType() == VideoFrameType.RAW_MEMORY || videoFrame.hasReleaseCallback()) {
                    fromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushExternalByteRtcVideoFrame(this.mNativeEngine, videoFrame));
                } else {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    videoFrame.retain();
                    GLTextureVideoFrameBuilder gLTextureVideoFrameBuilder = new GLTextureVideoFrameBuilder(videoFrame.getPixelFormat());
                    gLTextureVideoFrameBuilder.setTextureID(videoFrame.getTextureID());
                    gLTextureVideoFrameBuilder.setTextureMatrix(videoFrame.getTextureMatrix());
                    gLTextureVideoFrameBuilder.setEGLContext(videoFrame.getEGLContext());
                    gLTextureVideoFrameBuilder.setColorSpace(videoFrame.getColorSpace());
                    gLTextureVideoFrameBuilder.setWidth(videoFrame.getWidth());
                    gLTextureVideoFrameBuilder.setHeight(videoFrame.getHeight());
                    gLTextureVideoFrameBuilder.setRotation(videoFrame.getRotation());
                    gLTextureVideoFrameBuilder.setExternalDataInfo(videoFrame.getExternalDataInfo());
                    gLTextureVideoFrameBuilder.setSupplementaryInfo(videoFrame.getSupplementaryInfo());
                    gLTextureVideoFrameBuilder.setTimeStampUs(videoFrame.getTimeStampUs());
                    gLTextureVideoFrameBuilder.setReleaseCallback(new Runnable() { // from class: X.ZVf
                        @Override // java.lang.Runnable
                        public final void run() {
                            RTCVideoImpl.lambda$pushExternalVideoFrame$5(VideoFrame.this, countDownLatch);
                        }
                    });
                    VideoFrame build = gLTextureVideoFrameBuilder.build();
                    fromId = ReturnStatus.fromId(NativeRTCVideoFunctions.nativePushExternalByteRtcVideoFrame(this.mNativeEngine, build));
                    build.release();
                    if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 1000L)) {
                        LogUtil.w("RtcVideoImpl", "pushExternalVideoFrame: pushExternalVideoFrame timeout.");
                    }
                }
                value = fromId.value();
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int registerFaceDetectionObserver(IFaceDetectionObserver iFaceDetectionObserver, int i) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.registerFaceDetectionObserver(iFaceDetectionObserver, i);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int registerLocalVideoProcessor(IVideoProcessor iVideoProcessor, VideoPreprocessorConfig videoPreprocessorConfig) {
        int value;
        VideoPixelFormat videoPixelFormat;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, registerLocalVideoProcessor failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                if (videoPreprocessorConfig == null) {
                    videoPreprocessorConfig = new VideoPreprocessorConfig();
                }
                RTCVideoProcessor rTCVideoProcessor = this.mRtcVideoPreprocessor;
                if (rTCVideoProcessor == null || rTCVideoProcessor.registerLocalVideoProcessor(iVideoProcessor, videoPreprocessorConfig.requiredPixelFormat) != 0) {
                    value = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    VideoPixelFormat videoPixelFormat2 = videoPreprocessorConfig.requiredPixelFormat;
                    if (videoPixelFormat2 != VideoPixelFormat.I420 && videoPixelFormat2 != (videoPixelFormat = VideoPixelFormat.UNKNOWN)) {
                        videoPixelFormat2 = videoPixelFormat;
                    }
                    if (iVideoProcessor == null) {
                        value = NativeRTCVideoFunctions.nativeRegisterLocalVideoProcessor(this.mNativeEngine, null, videoPixelFormat2.value());
                    } else {
                        value = NativeRTCVideoFunctions.nativeRegisterLocalVideoProcessor(this.mNativeEngine, this.mRtcVideoPreprocessor, videoPixelFormat2.value());
                    }
                }
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int sendStreamSyncInfo(byte[] bArr, StreamSycnInfoConfig streamSycnInfoConfig) {
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SendStreamSyncInfo failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                value = NativeRTCVideoFunctions.nativeSendStreamSyncInfo(this.mNativeEngine, bArr, streamSycnInfoConfig.streamIndex.value(), streamSycnInfoConfig.repeatCount, 0);
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setAudioAlignmentProperty(RemoteStreamKey remoteStreamKey, AudioAlignmentMode audioAlignmentMode) {
        int nativeSetAudioAlignmentProperty;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setAudioAlignmentProperty failed.");
                nativeSetAudioAlignmentProperty = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (remoteStreamKey == null) {
                LogUtil.e("RtcVideoImpl", "setAudioAlignmentProperty: streamKey is null");
                nativeSetAudioAlignmentProperty = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                nativeSetAudioAlignmentProperty = NativeRTCVideoFunctions.nativeSetAudioAlignmentProperty(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), audioAlignmentMode.value());
            }
            return nativeSetAudioAlignmentProperty;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setBackgroundSticker(String str, VirtualBackgroundSource virtualBackgroundSource) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        if (str != null) {
            return rTCVideoEffect.enableVirtualBackground(str, virtualBackgroundSource);
        }
        return rTCVideoEffect.disableVirtualBackground();
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setBeautyIntensity(EffectBeautyMode effectBeautyMode, float f) {
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setBeautyIntensity failed.");
                this.mJniReadLock.unlock();
                return 1000;
            }
            return NativeRTCVideoFunctions.nativeSetBeautyIntensity(this.mNativeEngine, effectBeautyMode.value(), f);
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCameraExposurePosition(float f, float f2) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != RTCEngineImpl.State.DESTORY) {
                return NativeRTCVideoFunctions.nativeSetCameraExposurePosition(this.mNativeEngine, f, f2);
            }
            this.mJniReadLock.unlock();
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCameraFocusPosition(float f, float f2) {
        this.mJniReadLock.lock();
        try {
            if (!engineInvalid() && this.mState != RTCEngineImpl.State.DESTORY) {
                return NativeRTCVideoFunctions.nativeSetCameraFocusPosition(this.mNativeEngine, f, f2);
            }
            this.mJniReadLock.unlock();
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setCaptureVolume(StreamIndex streamIndex, int i) {
        int nativeSetCaptureVolume;
        LogUtil.d("RtcVideoImpl", "setCaptureVolume");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setCaptureVolume failed.");
                nativeSetCaptureVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetCaptureVolume = NativeRTCVideoFunctions.nativeSetCaptureVolume(this.mNativeEngine, i, streamIndex.value());
            }
            return nativeSetCaptureVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setEncryptInfo(int i, String str) {
        int nativeSetEncryptInfo;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setEncryptInfo failed.");
                nativeSetEncryptInfo = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetEncryptInfo = NativeRTCVideoFunctions.nativeSetEncryptInfo(this.mNativeEngine, i, str);
            }
            return nativeSetEncryptInfo;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas) {
        int nativeSetLocalVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setLocalVideoCanvas failed.");
                nativeSetLocalVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                if (videoCanvas == null) {
                    videoCanvas = new VideoCanvas();
                }
                nativeSetLocalVideoCanvas = NativeRTCVideoFunctions.nativeSetLocalVideoCanvas(this.mNativeEngine, streamIndex.value(), videoCanvas.renderView, videoCanvas.renderMode, videoCanvas.backgroundColor);
            }
            return nativeSetLocalVideoCanvas;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setPublicStreamAudioPlaybackVolume(String str, int i) {
        int nativeSetPublicStreamAudioPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setPublicStreamAudioPlaybackVolume failed.");
                nativeSetPublicStreamAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setPublicStreamAudioPlaybackVolume...public stream id: ");
                LIZ.append(str);
                LIZ.append(", volume: ");
                LIZ.append(i);
                LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
                nativeSetPublicStreamAudioPlaybackVolume = NativeRTCVideoFunctions.nativeSetPublicStreamAudioPlaybackVolume(this.mNativeEngine, str, i);
            }
            return nativeSetPublicStreamAudioPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setPublicStreamVideoCanvas(String str, VideoCanvas videoCanvas) {
        int nativeSetPublicStreamVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setPublicStreamVideoCanvas failed.");
                nativeSetPublicStreamVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("startPlayPublicStream...public stream id: ");
                LIZ.append(str);
                LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
                nativeSetPublicStreamVideoCanvas = NativeRTCVideoFunctions.nativeSetPublicStreamVideoCanvas(this.mNativeEngine, str, videoCanvas.renderView, videoCanvas.renderMode);
            }
            return nativeSetPublicStreamVideoCanvas;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRemoteVideoCanvas(RemoteStreamKey remoteStreamKey, VideoCanvas videoCanvas) {
        int nativeSetRemoteVideoCanvas;
        this.mJniReadLock.lock();
        if (remoteStreamKey != null) {
            try {
                if (!remoteStreamKey.hasNullProperty()) {
                    if (engineInvalid()) {
                        LogUtil.e("RtcVideoImpl", "native engine is invalid, setRemoteVideoCanvas failed.");
                        nativeSetRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
                    } else {
                        if (videoCanvas == null) {
                            videoCanvas = new VideoCanvas();
                        }
                        nativeSetRemoteVideoCanvas = NativeRTCVideoFunctions.nativeSetRemoteVideoCanvas(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoCanvas.renderView, videoCanvas.renderMode, videoCanvas.backgroundColor);
                    }
                    return nativeSetRemoteVideoCanvas;
                }
            } finally {
                this.mJniReadLock.unlock();
            }
        }
        LogUtil.i("RtcVideoImpl", "EventType: setupRemoteVideo stream_key has null property");
        nativeSetRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        return nativeSetRemoteVideoCanvas;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRemoteVideoSuperResolution(RemoteStreamKey remoteStreamKey, VideoSuperResolutionMode videoSuperResolutionMode) {
        int nativeSetRemoteVideoSuperResolution;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setRemoteVideoSuperResolution: ");
        LIZ.append(remoteStreamKey.toString());
        LIZ.append(" ");
        LIZ.append(videoSuperResolutionMode.toString());
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setRemoteVideoSuperResolution failed.");
                nativeSetRemoteVideoSuperResolution = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetRemoteVideoSuperResolution = NativeRTCVideoFunctions.nativeSetRemoteVideoSuperResolution(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoSuperResolutionMode.value());
            }
            return nativeSetRemoteVideoSuperResolution;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setServerParams(String str, String str2) {
        int nativeSetServerParams;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendBinaryMessage failed.");
                nativeSetServerParams = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetServerParams = NativeRTCVideoFunctions.nativeSetServerParams(this.mNativeEngine, str, str2);
            }
            return nativeSetServerParams;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoDecoderConfig(RemoteStreamKey remoteStreamKey, VideoDecoderConfig videoDecoderConfig) {
        int nativeSetVideoDecoderConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, SetVideoDecoderConfig failed.");
                nativeSetVideoDecoderConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetVideoDecoderConfig = NativeRTCVideoFunctions.nativeSetVideoDecoderConfig(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoDecoderConfig.value());
            }
            return nativeSetVideoDecoderConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoDigitalZoomConfig(ZoomConfigType zoomConfigType, float f) {
        int nativeSetVideoDigitalZoomConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoDigitalZoomConfig failed.");
                nativeSetVideoDigitalZoomConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetVideoDigitalZoomConfig = NativeRTCVideoFunctions.nativeSetVideoDigitalZoomConfig(this.mNativeEngine, zoomConfigType.value(), f);
            }
            return nativeSetVideoDigitalZoomConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEffectAlgoModelResourceFinder(long j, long j2) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.setAlgoModelResourceFinder(j, j2);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEncoderConfig(StreamIndex streamIndex, List<VideoStreamDescription> list) {
        int nativeSetVideoEncoderConfig;
        this.mJniReadLock.lock();
        if (list == null) {
            try {
                list = new ArrayList<>();
            } finally {
                this.mJniReadLock.unlock();
            }
        }
        if (engineInvalid()) {
            LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoResolutions failed.");
            nativeSetVideoEncoderConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<VideoStreamDescription> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    VideoStreamDescription next = it.next();
                    if (streamIndex == StreamIndex.STREAM_INDEX_MAIN && !next.isValid()) {
                        LogUtil.e("RtcVideoImpl", "setVideoResolutions with illegal params");
                        nativeSetVideoEncoderConfig = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                        break;
                    }
                    arrayList.add(new InternalVideoStreamDescription(next));
                } else {
                    nativeSetVideoEncoderConfig = NativeRTCVideoFunctions.nativeSetVideoEncoderConfig(this.mNativeEngine, streamIndex.value(), arrayList);
                    break;
                }
            }
        }
        return nativeSetVideoEncoderConfig;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType) {
        boolean z;
        int nativeSetVideoSourceTypeWithStreamId;
        this.mJniReadLock.lock();
        try {
            if (videoSourceType == VideoSourceType.VIDEO_SOURCE_TYPE_EXTERNAL) {
                z = true;
            } else {
                z = false;
            }
            this.mUseExtVideoSource = z;
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoInputType failed.");
                nativeSetVideoSourceTypeWithStreamId = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSetVideoSourceTypeWithStreamId = NativeRTCVideoFunctions.nativeSetVideoSourceTypeWithStreamId(this.mNativeEngine, streamIndex.value(), videoSourceType.value());
            }
            return nativeSetVideoSourceTypeWithStreamId;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startASR(RTCASRConfig rTCASRConfig, IRTCASREngineEventHandler iRTCASREngineEventHandler) {
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startASR");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                if (iRTCASREngineEventHandler != null && rTCASRConfig != null) {
                    String str = rTCASRConfig.userId;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    String str3 = rTCASRConfig.appId;
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = rTCASRConfig.accessToken;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = rTCASRConfig.secretKey;
                    if (str5 == null) {
                        str5 = "";
                    }
                    int value2 = rTCASRConfig.authorizationType.value();
                    String str6 = rTCASRConfig.cluster;
                    if (str6 != null) {
                        str2 = str6;
                    }
                    this.mRTCASREngineEventHandler.setAsrEventHandler(iRTCASREngineEventHandler);
                    value = NativeRTCVideoFunctions.nativeStartASR(this.mNativeEngine, this.mRTCASREngineEventHandler, str, str3, str4, str5, value2, str2);
                }
                value = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startChorusCacheSync(ChorusCacheSyncConfig chorusCacheSyncConfig, IChorusCacheSyncObserver iChorusCacheSyncObserver) {
        int nativeStartChorusCacheSync;
        this.mJniReadLock.lock();
        if (iChorusCacheSyncObserver != null) {
            try {
                this.mChorusObserver.setUserObserver(iChorusCacheSyncObserver);
            } finally {
                this.mJniReadLock.unlock();
            }
        }
        LogUtil.d("RtcVideoImpl", "startChorusCacheSync...");
        if (chorusCacheSyncConfig == null) {
            LogUtil.d("RtcVideoImpl", "startChorusCacheSync...chorusConfig is null, no effect, please check.");
            nativeStartChorusCacheSync = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
        } else if (engineInvalid()) {
            LogUtil.e("RtcVideoImpl", "native engine is invalid, startChorusCacheSync failed.");
            nativeStartChorusCacheSync = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
        } else {
            nativeStartChorusCacheSync = NativeRTCVideoFunctions.nativeStartChorusCacheSync(this.mNativeEngine, chorusCacheSyncConfig, this.mChorusObserver);
        }
        return nativeStartChorusCacheSync;
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startEchoTest(EchoTestConfig echoTestConfig, int i) {
        int nativeStartEchoTest;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startEchoTest failed.");
                nativeStartEchoTest = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                LogUtil.d("RtcVideoImpl", "startEchoTest");
                nativeStartEchoTest = NativeRTCVideoFunctions.nativeStartEchoTest(this.mNativeEngine, echoTestConfig, i);
            }
            return nativeStartEchoTest;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startPushPublicStream(String str, PublicStreaming publicStreaming) {
        int nativeStartPushPublicStream;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startPushPublicStream failed.");
                nativeStartPushPublicStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (publicStreaming == null) {
                LogUtil.e("RtcVideoImpl", "startPushPublicStream failed for publicStreaming is null.");
                nativeStartPushPublicStream = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                publicStreaming.setAction("started");
                JSONObject publicStreamMessage = publicStreaming.getPublicStreamMessage();
                if (publicStreamMessage == null) {
                    LogUtil.e("RtcVideoImpl", "public stream parameter is invalid, startPushPublicStream failed.");
                    nativeStartPushPublicStream = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
                } else {
                    String jSONObject = publicStreamMessage.toString();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("startPushPublicStream...public stream parameter: ");
                    LIZ.append(jSONObject);
                    LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
                    nativeStartPushPublicStream = NativeRTCVideoFunctions.nativeStartPushPublicStream(this.mNativeEngine, str, jSONObject);
                }
            }
            return nativeStartPushPublicStream;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startScreenCapture(ScreenMediaType screenMediaType, Intent intent) {
        int nativeStartScreenCapture;
        LogUtil.d("RtcVideoImpl", "StartScreenAudioCapture");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, StopScreenAudioCapture failed.");
                nativeStartScreenCapture = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStartScreenCapture = NativeRTCVideoFunctions.nativeStartScreenCapture(this.mNativeEngine, screenMediaType.value(), intent);
            }
            return nativeStartScreenCapture;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long takeLocalSnapshot(StreamIndex streamIndex, ISnapshotResultCallback iSnapshotResultCallback) {
        long nativeTakeLocalSnapshot;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, takeLocalSnapshot failed.");
                nativeTakeLocalSnapshot = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeTakeLocalSnapshot = NativeRTCVideoFunctions.nativeTakeLocalSnapshot(this.mNativeEngine, streamIndex.value(), iSnapshotResultCallback);
            }
            return nativeTakeLocalSnapshot;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long takeRemoteSnapshot(RemoteStreamKey remoteStreamKey, ISnapshotResultCallback iSnapshotResultCallback) {
        long nativeTakeRemoteSnapshot;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, takeRemoteSnapshot failed.");
                nativeTakeRemoteSnapshot = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                if (remoteStreamKey == null) {
                    LogUtil.e("RtcVideoImpl", "EventType: setupRemoteRenderInternal, streamKey is null");
                } else if (remoteStreamKey.getStreamIndex() == null) {
                    LogUtil.e("RtcVideoImpl", "EventType: setupRemoteRenderInternal, streamIndex is null");
                } else {
                    nativeTakeRemoteSnapshot = NativeRTCVideoFunctions.nativeTakeRemoteSnapshot(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), iSnapshotResultCallback);
                }
                return -1L;
            }
            return nativeTakeRemoteSnapshot;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateLiveTranscoding(String str, LiveTranscoding liveTranscoding) {
        int nativeUpdateLiveTranscoding;
        LogUtil.d("RtcVideoImpl", "updateLiveTranscoding...");
        this.mJniReadLock.lock();
        try {
            if (liveTranscoding == null) {
                LogUtil.d("RtcVideoImpl", "updateLiveTranscoding...mLiveTranscoding is null, no effect, please check.");
                nativeUpdateLiveTranscoding = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, updateLiveTranscoding failed.");
                nativeUpdateLiveTranscoding = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                liveTranscoding.setAction("layoutChanged");
                if (liveTranscoding.getTranscodeMessage() == null) {
                    nativeUpdateLiveTranscoding = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    LogUtil.d("RtcVideoImpl", "updateLiveTranscoding...");
                    nativeUpdateLiveTranscoding = NativeRTCVideoFunctions.nativeUpdateLiveTranscoding(this.mNativeEngine, str, liveTranscoding);
                }
            }
            return nativeUpdateLiveTranscoding;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updatePublicStreamParam(String str, PublicStreaming publicStreaming) {
        int nativeUpdatePublicStreamParam;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, updatePublicStreamParam failed.");
                nativeUpdatePublicStreamParam = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (publicStreaming == null) {
                LogUtil.e("RtcVideoImpl", "updatePublicStreamParam failed for publicStreaming is null.");
                nativeUpdatePublicStreamParam = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                publicStreaming.setAction("layoutChanged");
                JSONObject publicStreamMessage = publicStreaming.getPublicStreamMessage();
                if (publicStreamMessage == null) {
                    LogUtil.e("RtcVideoImpl", "public stream parameter is invalid, updatePublicStreamParam failed.");
                    nativeUpdatePublicStreamParam = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    String jSONObject = publicStreamMessage.toString();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("updatePublicStreamParam...public stream parameter: ");
                    LIZ.append(jSONObject);
                    LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
                    nativeUpdatePublicStreamParam = NativeRTCVideoFunctions.nativeUpdatePublicStreamParam(this.mNativeEngine, str, jSONObject);
                }
            }
            return nativeUpdatePublicStreamParam;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updatePushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig) {
        this.mJniReadLock.lock();
        try {
            LogUtil.d("RtcVideoImpl", "updatePushMixedStreamToCDN...");
            if (mixedStreamConfig == null) {
                LogUtil.d("RtcVideoImpl", "updatePushMixedStreamToCDN...mLiveTranscoding is null, no effect, please check.");
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, updatePushMixedStreamToCDN failed.");
            } else if (mixedStreamConfig.getTranscodeMessage() != null) {
                LogUtil.d("RtcVideoImpl", "updatePushMixedStreamToCDN...");
                return NativeRTCVideoFunctions.nativeUpdatePushMixedStreamToCDN(this.mNativeEngine, str, mixedStreamConfig);
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig, JSONObject jSONObject) {
        int nativeSetVideoEncoderConfigV3;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoResolutions failed.");
                nativeSetVideoEncoderConfigV3 = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                String str = "";
                if (jSONObject != null) {
                    str = jSONObject.toString();
                }
                nativeSetVideoEncoderConfigV3 = NativeRTCVideoFunctions.nativeSetVideoEncoderConfigV3(this.mNativeEngine, new InternalVideoEncoderConfig(videoEncoderConfig), str);
            }
            return nativeSetVideoEncoderConfigV3;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoEncoderConfig(List<VideoStreamDescription> list, VideoEncoderConfiguration.OrientationMode orientationMode) {
        int videoEncoderConfig;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setVideoResolutions failed.");
                videoEncoderConfig = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                RTCData.instance().setOrientationMode(orientationMode);
                videoEncoderConfig = setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN, list);
            }
            return videoEncoderConfig;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public /* synthetic */ void lambda$new$0(LogUtil.LogLevel logLevel, String str, Throwable th) {
        IRTCVideoEventHandler rtcEngineHandler = getRtcEngineHandler();
        if (rtcEngineHandler != null) {
            try {
                rtcEngineHandler.onLoggerMessage(logLevel, str, th);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i, RTCEncodedVideoFrame rTCEncodedVideoFrame) {
        int nativePushExternalEncodedVideoFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, PushExternalEncodedVideoFrame failed.");
                nativePushExternalEncodedVideoFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativePushExternalEncodedVideoFrame = NativeRTCVideoFunctions.nativePushExternalEncodedVideoFrame(this.mNativeEngine, streamIndex.value(), i, rTCEncodedVideoFrame.buffer, rTCEncodedVideoFrame.timestampUs, rTCEncodedVideoFrame.timestampDtsUs, rTCEncodedVideoFrame.width, rTCEncodedVideoFrame.height, rTCEncodedVideoFrame.videoCodecType.value(), rTCEncodedVideoFrame.videoPictureType.value(), rTCEncodedVideoFrame.videoRotation.value());
            }
            return nativePushExternalEncodedVideoFrame;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i) {
        int nativeSendSEIMessage;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, registerMetadataObserver failed.");
                nativeSendSEIMessage = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSendSEIMessage = NativeRTCVideoFunctions.nativeSendSEIMessage(this.mNativeEngine, streamIndex.value(), bArr, i);
            }
            return nativeSendSEIMessage;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long sendUserBinaryMessageOutsideRoom(String str, byte[] bArr, MessageConfig messageConfig) {
        long nativeSendUserBinaryMessageOutsideRoom;
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendBinaryMessage failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (str == null) {
                LogUtil.e("RtcVideoImpl", "sendUserBinaryMessageOutsideRoom: uid is null send failed");
                value = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                nativeSendUserBinaryMessageOutsideRoom = NativeRTCVideoFunctions.nativeSendUserBinaryMessageOutsideRoom(this.mNativeEngine, str, bArr, messageConfig.value());
                return nativeSendUserBinaryMessageOutsideRoom;
            }
            nativeSendUserBinaryMessageOutsideRoom = value;
            return nativeSendUserBinaryMessageOutsideRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public long sendUserMessageOutsideRoom(String str, String str2, MessageConfig messageConfig) {
        long nativeSendUserMessageOutsideRoom;
        int value;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendBinaryMessage failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (str == null) {
                LogUtil.e("RtcVideoImpl", "sendUserMessageOutsideRoom: uid is null send failed");
                value = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                nativeSendUserMessageOutsideRoom = NativeRTCVideoFunctions.nativeSendUserMessageOutsideRoom(this.mNativeEngine, str, str2, messageConfig.value());
                return nativeSendUserMessageOutsideRoom;
            }
            nativeSendUserMessageOutsideRoom = value;
            return nativeSendUserMessageOutsideRoom;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i) {
        VideoSinkAdapter videoSinkAdapter;
        int nativeSetLocalVideoSink;
        this.mJniReadLock.lock();
        try {
            if (streamIndex == null) {
                LogUtil.e("RtcVideoImpl", "EventType: setLocalVideoSink, streamIndex is null");
                nativeSetLocalVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setLocalVideoSink failed.");
                nativeSetLocalVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                if (iVideoSink == null) {
                    videoSinkAdapter = null;
                } else {
                    videoSinkAdapter = new VideoSinkAdapter(iVideoSink);
                }
                nativeSetLocalVideoSink = NativeRTCVideoFunctions.nativeSetLocalVideoSink(this.mNativeEngine, streamIndex.value(), videoSinkAdapter, i);
            }
            return nativeSetLocalVideoSink;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setPublicStreamVideoSink(String str, IVideoSink iVideoSink, int i) {
        VideoSinkAdapter videoSinkAdapter;
        int nativeSetPublicStreamVideoSink;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setPublicStreamVideoSink failed.");
                nativeSetPublicStreamVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setPublicStreamVideoSink...public stream id: ");
                LIZ.append(str);
                LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
                if (iVideoSink == null) {
                    videoSinkAdapter = null;
                } else {
                    videoSinkAdapter = new VideoSinkAdapter(iVideoSink);
                }
                nativeSetPublicStreamVideoSink = NativeRTCVideoFunctions.nativeSetPublicStreamVideoSink(this.mNativeEngine, str, videoSinkAdapter, i);
            }
            return nativeSetPublicStreamVideoSink;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRemoteAudioPlaybackVolume(String str, String str2, int i) {
        int nativeSetRemoteAudioPlaybackVolume;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setRemoteAudioPlaybackVolume failed.");
                nativeSetRemoteAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (str == null) {
                LogUtil.e("RtcVideoImpl", "setRemoteAudioPlaybackVolume: roomId is null adjust failed");
                nativeSetRemoteAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (str2 == null) {
                LogUtil.e("RtcVideoImpl", "setRemoteAudioPlaybackVolume: uid is null adjust failed");
                nativeSetRemoteAudioPlaybackVolume = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                nativeSetRemoteAudioPlaybackVolume = NativeRTCVideoFunctions.nativeSetRemoteAudioPlaybackVolume(this.mNativeEngine, str, str2, i);
            }
            return nativeSetRemoteAudioPlaybackVolume;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRemoteUserPriority(String str, String str2, RemoteUserPriority remoteUserPriority) {
        int nativeSetRemoteUserPriority;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setRemoteUserPriority: uid: ");
        LIZ.append(str2);
        LIZ.append(", priority: ");
        LIZ.append(remoteUserPriority);
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setRemoteUserPriority failed.");
                nativeSetRemoteUserPriority = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else if (str2 == null) {
                LogUtil.e("RtcVideoImpl", "setRemoteUserPriority: uid is null set failed");
                nativeSetRemoteUserPriority = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else {
                nativeSetRemoteUserPriority = NativeRTCVideoFunctions.nativeSetRemoteUserPriority(this.mNativeEngine, str, str2, remoteUserPriority.value());
            }
            return nativeSetRemoteUserPriority;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setRemoteVideoSink(RemoteStreamKey remoteStreamKey, IVideoSink iVideoSink, int i) {
        VideoSinkAdapter videoSinkAdapter;
        int nativeSetRemoteVideoSink;
        this.mJniReadLock.lock();
        try {
            if (remoteStreamKey == null) {
                LogUtil.e("RtcVideoImpl", "EventType: setupRemoteRenderInternal, streamKey is null");
                nativeSetRemoteVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (remoteStreamKey.getStreamIndex() == null) {
                LogUtil.e("RtcVideoImpl", "EventType: setupRemoteRenderInternal, streamIndex is null");
                nativeSetRemoteVideoSink = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, setRemoteVideoSink failed.");
                nativeSetRemoteVideoSink = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                String roomId = remoteStreamKey.getRoomId();
                if (iVideoSink != null) {
                    videoSinkAdapter = new VideoSinkAdapter(iVideoSink);
                } else {
                    videoSinkAdapter = null;
                }
                nativeSetRemoteVideoSink = NativeRTCVideoFunctions.nativeSetRemoteVideoSink(this.mNativeEngine, roomId, remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoSinkAdapter, i);
            }
            return nativeSetRemoteVideoSink;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int setVideoWatermark(StreamIndex streamIndex, String str, RTCWatermarkConfig rTCWatermarkConfig) {
        int value;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid() || this.mState == RTCEngineImpl.State.DESTORY) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, muteAudioPlayback failed.");
                value = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                ByteWatermark byteWatermark = rTCWatermarkConfig.positionInLandscapeMode;
                if (byteWatermark != null) {
                    f = byteWatermark.x;
                    f2 = byteWatermark.y;
                    f3 = byteWatermark.width;
                    f4 = byteWatermark.height;
                } else {
                    f = 0.0f;
                    f2 = 0.0f;
                    f3 = 0.0f;
                    f4 = 0.0f;
                }
                ByteWatermark byteWatermark2 = rTCWatermarkConfig.positionInPortraitMode;
                if (byteWatermark2 != null) {
                    f5 = byteWatermark2.x;
                    f6 = byteWatermark2.y;
                    f7 = byteWatermark2.width;
                    f8 = byteWatermark2.height;
                } else {
                    f5 = 0.0f;
                    f6 = 0.0f;
                    f7 = 0.0f;
                    f8 = 0.0f;
                }
                value = NativeRTCVideoFunctions.nativeSetVideoWatermark(this.mNativeEngine, streamIndex.value(), str, rTCWatermarkConfig.visibleInPreview, f, f2, f3, f4, f5, f6, f7, f8);
            }
            return value;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startFileRecording(StreamIndex streamIndex, RecordingConfig recordingConfig, RecordingType recordingType) {
        int nativeStartFileRecording;
        LogUtil.d("RtcVideoImpl", "startFileRecording");
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startFileRecording failed.");
                nativeStartFileRecording = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStartFileRecording = NativeRTCVideoFunctions.nativeStartFileRecording(this.mNativeEngine, streamIndex.value(), recordingConfig.dirPath, recordingConfig.recordingFileType.value(), recordingType.value());
            }
            return nativeStartFileRecording;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startLiveTranscoding(String str, LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver) {
        int nativeStartLiveTranscoding;
        this.mJniReadLock.lock();
        try {
            this.mLiveTranscodingObserver = iLiveTranscodingObserver;
            LiveTranscodingObserver liveTranscodingObserver = this.mTranscodingObserver;
            if (liveTranscodingObserver != null) {
                liveTranscodingObserver.setUserObserver(str, iLiveTranscodingObserver);
            }
            LogUtil.d("RtcVideoImpl", "enableLiveTranscoding...");
            if (liveTranscoding == null) {
                LogUtil.d("RtcVideoImpl", "enableLiveTranscoding...liveTranscode is null, no effect, please check.");
                nativeStartLiveTranscoding = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableLiveTranscoding failed.");
                nativeStartLiveTranscoding = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                this.mEnableTranscode = true;
                this.mLiveTranscoding = liveTranscoding;
                liveTranscoding.setAction("started");
                if (this.mLiveTranscoding.getTranscodeMessage() == null) {
                    nativeStartLiveTranscoding = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
                } else {
                    LogUtil.d("RtcVideoImpl", "enableLiveTranscoding...");
                    nativeStartLiveTranscoding = NativeRTCVideoFunctions.nativeStartLiveTranscoding(this.mNativeEngine, str, liveTranscoding, this.mTranscodingObserver);
                }
            }
            return nativeStartLiveTranscoding;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startPushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig, IMixedStreamObserver iMixedStreamObserver) {
        this.mJniReadLock.lock();
        try {
            LogUtil.d("RtcVideoImpl", "startPushMixedStreamToCDN...");
            if (mixedStreamConfig == null) {
                LogUtil.d("RtcVideoImpl", "startPushMixedStreamToCDN...liveTranscode is null, no effect, please check.");
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, enableLiveTranscoding failed.");
            } else {
                this.mEnableTranscode = true;
                if (mixedStreamConfig.getTranscodeMessage() != null) {
                    PushMixedStreamToCDNObserver pushMixedStreamToCDNObserver = this.mMixedStreamToCDNObserver;
                    if (pushMixedStreamToCDNObserver != null) {
                        pushMixedStreamToCDNObserver.setUserObserver(str, iMixedStreamObserver);
                    }
                    LogUtil.d("RtcVideoImpl", "startPushMixedStreamToCDN...");
                    return NativeRTCVideoFunctions.nativeStartPushMixedStreamToCDN(this.mNativeEngine, str, mixedStreamConfig, this.mMixedStreamToCDNObserver);
                }
            }
            return -1;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startPushSingleStreamToCDN(String str, PushSingleStreamParam pushSingleStreamParam, IPushSingleStreamToCDNObserver iPushSingleStreamToCDNObserver) {
        int nativeStartPushSingleStreamToCDN;
        this.mJniReadLock.lock();
        try {
            PushSingleStreamToCDNObserver pushSingleStreamToCDNObserver = this.mSingleStreamToCDNObserver;
            if (pushSingleStreamToCDNObserver != null) {
                pushSingleStreamToCDNObserver.setUserObserver(str, iPushSingleStreamToCDNObserver);
            }
            LogUtil.d("RtcVideoImpl", "startSingleStreamToCDN...");
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, startSingleStreamToCDN failed.");
                nativeStartPushSingleStreamToCDN = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStartPushSingleStreamToCDN = NativeRTCVideoFunctions.nativeStartPushSingleStreamToCDN(this.mNativeEngine, str, pushSingleStreamParam.roomId, pushSingleStreamParam.userId, pushSingleStreamParam.url, pushSingleStreamParam.isScreen, this.mSingleStreamToCDNObserver);
            }
            return nativeStartPushSingleStreamToCDN;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateLocalVideoCanvas(StreamIndex streamIndex, int i, int i2) {
        int nativeUpdateLocalVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, updateLocalVideoCanvas failed.");
                nativeUpdateLocalVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeUpdateLocalVideoCanvas = NativeRTCVideoFunctions.nativeUpdateLocalVideoCanvas(this.mNativeEngine, streamIndex.value(), i, i2);
            }
            return nativeUpdateLocalVideoCanvas;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateRemoteStreamVideoCanvas(RemoteStreamKey remoteStreamKey, int i, int i2) {
        int nativeUpdateRemoteVideoCanvas;
        this.mJniReadLock.lock();
        try {
            if (remoteStreamKey == null) {
                LogUtil.e("RtcVideoImpl", "EventType: updateRemoteStreamVideoCanvas, streamKey is null");
                nativeUpdateRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (remoteStreamKey.hasNullProperty()) {
                LogUtil.e("RtcVideoImpl", "EventType: updateRemoteStreamVideoCanvas, hasNullProperty");
                nativeUpdateRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_PARAMETER_ERR.value();
            } else if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, updateRemoteStreamVideoCanvas failed.");
                nativeUpdateRemoteVideoCanvas = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeUpdateRemoteVideoCanvas = NativeRTCVideoFunctions.nativeUpdateRemoteVideoCanvas(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), i, i2);
            }
            return nativeUpdateRemoteVideoCanvas;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int updateVideoEffectNode(String str, String str2, float f) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.updateEffectNode(str, str2, f);
    }

    public long createRTCVideo(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2) {
        return NativeRTCVideoFunctions.nativeCreateRTCVideo(context, str, rTCVideoEventHandler, str2);
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i, SEICountPerFrame sEICountPerFrame) {
        int nativeSendMultiSEIMessagePerVideoFrame;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, registerMetadataObserver failed.");
                nativeSendMultiSEIMessagePerVideoFrame = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeSendMultiSEIMessagePerVideoFrame = NativeRTCVideoFunctions.nativeSendMultiSEIMessagePerVideoFrame(this.mNativeEngine, streamIndex.value(), bArr, i, sEICountPerFrame.value());
            }
            return nativeSendMultiSEIMessagePerVideoFrame;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideo
    public int startNetworkDetection(boolean z, int i, boolean z2, int i2) {
        int nativeStartNetworkProbe;
        this.mJniReadLock.lock();
        try {
            if (engineInvalid()) {
                LogUtil.e("RtcVideoImpl", "native engine is invalid, sendCustomMessage failed.");
                nativeStartNetworkProbe = ReturnStatus.RETURN_STATUS_NATIVE_IN_VALID.value();
            } else {
                nativeStartNetworkProbe = NativeRTCVideoFunctions.nativeStartNetworkProbe(this.mNativeEngine, z, i, z2, i2);
            }
            return nativeStartNetworkProbe;
        } finally {
            this.mJniReadLock.unlock();
        }
    }

    public RTCVideoImpl(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, final Object obj, JSONObject jSONObject) {
        String str2;
        int i;
        String jSONObject2;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.mReadWriteLock = reentrantReadWriteLock;
        this.mJniReadLock = reentrantReadWriteLock.readLock();
        this.mJniWriteLock = reentrantReadWriteLock.writeLock();
        this.mLoggerSink = new LogUtil.LoggerSink() { // from class: X.ZWO
            @Override // com.ss.bytertc.engine.utils.LogUtil.LoggerSink
            public final void onLoggerMessage(LogUtil.LogLevel logLevel, String str3, Throwable th) {
                RTCVideoImpl.this.lambda$new$0(logLevel, str3, th);
            }
        };
        this.appStateCallback = new AppMonitor.Callback() { // from class: X.ZWP
            @Override // com.ss.bytertc.engine.utils.AppMonitor.Callback
            public final void callback(int i2) {
                RTCVideoImpl.this.lambda$new$1(i2);
            }
        };
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create RtcEngineImpl with appId: ");
        LIZ.append(str);
        LogUtil.d("RtcVideoImpl", X1D.LIZIZ(LIZ));
        if (mLibraryLoaded && str != null) {
            HandlerThread handlerThread = new HandlerThread("rtc_egl_thread");
            this.mEglThread = handlerThread;
            handlerThread.start();
            VideoSinkTask videoSinkTask = new VideoSinkTask();
            this.mVideoSinkTask = videoSinkTask;
            videoSinkTask.init();
            Handler handler = new Handler(this.mEglThread.getLooper());
            this.mEglHandler = handler;
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new Runnable() { // from class: X.ZVh
                @Override // java.lang.Runnable
                public final void run() {
                    RTCVideoImpl.this.lambda$new$2(obj);
                }
            });
            this.mRtcVideoPreprocessor = new RTCVideoProcessor();
            this.mContext = C16880lQ.LLLLL(context);
            this.mState = RTCEngineImpl.State.IDLE;
            this.mRtcEngineHandler = iRTCVideoEventHandler;
            LogUtil.setLoggerSink(this.mLoggerSink);
            this.mEngineEventHandler = new RTCVideoEventHandler(this);
            this.mEngineInternalEventHandler = new RTCEngineInternalEventHandler(this);
            this.mVideoFrameConverter = new VideoFrameConverter();
            this.mScreenFrameConverter = new VideoFrameConverter();
            this.mRtcLocalEncodedVideoFrameObserver = new RTCLocalEncodedVideoFrameObserver(this);
            this.mRtcRemoteEncodedVideoFrameObserver = new RTCRemoteEncodedVideoFrameObserver(this);
            this.mTranscodingObserver = new LiveTranscodingObserver();
            this.mChorusObserver = new ChorusCacheSyncObserver();
            this.mMixedStreamToCDNObserver = new PushMixedStreamToCDNObserver();
            this.mSingleStreamToCDNObserver = new PushSingleStreamToCDNObserver();
            this.mRTCASREngineEventHandler = new RTCASREngineEventHandler();
            this.mRtcExVideoEncoderHandler = new RTCExternalVideoEncoderEventHandler(this);
            try {
                Context LLLLL = C16880lQ.LLLLL(this.mContext);
                RTCVideoEventHandler rTCVideoEventHandler = this.mEngineEventHandler;
                if (jSONObject == null) {
                    jSONObject2 = "";
                } else {
                    jSONObject2 = jSONObject.toString();
                }
                this.mNativeEngine = createRTCVideo(LLLLL, str, rTCVideoEventHandler, jSONObject2);
                if (!engineInvalid()) {
                    NativeRTCVideoFunctions.nativeRegisterInternalEventObserver(this.mNativeEngine, this.mEngineInternalEventHandler);
                    this.mAdvanceVideoEffect = new RTCVideoEffect(this.mNativeEngine, true);
                    AppMonitor.get(context).register(context, this.appStateCallback);
                    return;
                }
                LogUtil.e("RtcVideoImpl", "create native engine error, native engine is invalid.");
                throw new IllegalStateException("pthread key create fail");
            } catch (UnsatisfiedLinkError e) {
                e.printStackTrace();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("rtc loader info:");
                LIZ2.append(sRtcLoaderInfo.toString());
                LIZ2.append(" exception info:");
                LIZ2.append(e.getStackTrace().toString());
                throw new UnsatisfiedLinkError(X1D.LIZIZ(LIZ2));
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        if (!mLibraryLoaded) {
            str2 = "rtc sdk load so failed";
            i = -1072;
        } else {
            str2 = "app id is null";
            i = -1005;
        }
        try {
            jSONObject3.put("event_key", "rtc_error");
            jSONObject3.put("rtc_app_id", str);
            jSONObject3.put("device_id", mDeviceId);
            jSONObject3.put("error_code", i);
            jSONObject3.put("message", str2);
            jSONObject3.put("timestamp", System.currentTimeMillis());
            jSONObject3.put("rtc_timestamp", System.currentTimeMillis());
            jSONObject3.put("os", "android");
            jSONObject3.put("product_line", "rtc");
            jSONObject3.put("report_version", 5);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        if (iRTCVideoEventHandler != null) {
            iRTCVideoEventHandler.onLogReport("live_webrtc_monitor_log", jSONObject3);
            iRTCVideoEventHandler.onError(i);
        }
        LogUtil.e("RtcVideoImpl", str2);
        throw new IllegalStateException("Create engine failed ".concat(str2));
    }
}
