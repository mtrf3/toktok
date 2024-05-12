package com.ss.bytertc.engine.engineimpl;

import X.C16880lQ;
import X.V0N;
import X.X1D;
import X.ZVB;
import X.ZVE;
import X.ZVG;
import X.ZVP;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.realx.base.ContextUtils;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.bytertc.engine.AudioMixingManager;
import com.ss.bytertc.engine.IAudioFrameObserver;
import com.ss.bytertc.engine.IAudioFrameProcessor;
import com.ss.bytertc.engine.IMetadataObserver;
import com.ss.bytertc.engine.IRTCAudioDeviceManagerEx;
import com.ss.bytertc.engine.InternalCloudProxyInfo;
import com.ss.bytertc.engine.InternalForwardStreamInfo;
import com.ss.bytertc.engine.InternalScreenSharingParams;
import com.ss.bytertc.engine.InternalVideoCaptureConfig;
import com.ss.bytertc.engine.InternalVideoEncoderConfig;
import com.ss.bytertc.engine.InternalVideoStreamDescription;
import com.ss.bytertc.engine.NativeFunctions;
import com.ss.bytertc.engine.RTCAudioDeviceManagerEx;
import com.ss.bytertc.engine.RTCEngine;
import com.ss.bytertc.engine.RTCEngineEx;
import com.ss.bytertc.engine.RTCHttpClient;
import com.ss.bytertc.engine.RTCRoomConfig;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.SubscribeVideoConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.adapter.VideoSinkAdapter;
import com.ss.bytertc.engine.adapter.VideoSinkTask;
import com.ss.bytertc.engine.audio.IAudioMixingManager;
import com.ss.bytertc.engine.data.AudioAlignmentMode;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.AudioProcessorMethod;
import com.ss.bytertc.engine.data.AudioPropertiesConfig;
import com.ss.bytertc.engine.data.AudioRenderType;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.AudioSampleRate;
import com.ss.bytertc.engine.data.AudioSourceType;
import com.ss.bytertc.engine.data.CameraId;
import com.ss.bytertc.engine.data.CloudProxyInfo;
import com.ss.bytertc.engine.data.EarMonitorMode;
import com.ss.bytertc.engine.data.EchoTestConfig;
import com.ss.bytertc.engine.data.EffectBeautyMode;
import com.ss.bytertc.engine.data.ForwardStreamInfo;
import com.ss.bytertc.engine.data.MediaInputType;
import com.ss.bytertc.engine.data.MirrorMode;
import com.ss.bytertc.engine.data.MirrorType;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RTCASRConfig;
import com.ss.bytertc.engine.data.RTCData;
import com.ss.bytertc.engine.data.RecordingConfig;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.data.SEICountPerFrame;
import com.ss.bytertc.engine.data.ScreenMediaType;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamSycnInfoConfig;
import com.ss.bytertc.engine.data.VideoFrameType;
import com.ss.bytertc.engine.data.VideoOrientation;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotationMode;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.handler.IExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.IRTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCEngineInternalEventHandler;
import com.ss.bytertc.engine.handler.RTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;
import com.ss.bytertc.engine.handler.RTCEncryptHandler;
import com.ss.bytertc.engine.handler.RTCEngineEventHandler;
import com.ss.bytertc.engine.handler.RTCEngineInternalEventHandler;
import com.ss.bytertc.engine.handler.RTCExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.RTCLocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCMetadataObserver;
import com.ss.bytertc.engine.handler.RTCRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCVideoProcessor;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.live.LiveTranscodingObserver;
import com.ss.bytertc.engine.loader.RTCNativeLibraryListenerImpl;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderInfo;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderListener;
import com.ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.IRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.IVideoSink;
import com.ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import com.ss.bytertc.engine.publicstream.PublicStreaming;
import com.ss.bytertc.engine.type.AudioProfileType;
import com.ss.bytertc.engine.type.AudioScenarioType;
import com.ss.bytertc.engine.type.BackgroundMode;
import com.ss.bytertc.engine.type.ChannelProfile;
import com.ss.bytertc.engine.type.ClientRole;
import com.ss.bytertc.engine.type.DivideModel;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.bytertc.engine.type.PauseResumeControlMediaType;
import com.ss.bytertc.engine.type.ProblemFeedbackInfo;
import com.ss.bytertc.engine.type.ProblemFeedbackOption;
import com.ss.bytertc.engine.type.PublishFallbackOption;
import com.ss.bytertc.engine.type.RecordingType;
import com.ss.bytertc.engine.type.RemoteUserPriority;
import com.ss.bytertc.engine.type.SubscribeFallbackOptions;
import com.ss.bytertc.engine.type.SubscribeMediaType;
import com.ss.bytertc.engine.type.SubscribeMode;
import com.ss.bytertc.engine.type.TorchState;
import com.ss.bytertc.engine.type.VoiceChangerType;
import com.ss.bytertc.engine.type.VoiceReverbType;
import com.ss.bytertc.engine.utils.AppMonitor;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.VideoFrameConverter;
import com.ss.bytertc.engine.video.ByteWatermark;
import com.ss.bytertc.engine.video.IFaceDetectionObserver;
import com.ss.bytertc.engine.video.IVideoEffect;
import com.ss.bytertc.engine.video.IVideoProcessor;
import com.ss.bytertc.engine.video.RTCVideoEffect;
import com.ss.bytertc.engine.video.RTCWatermarkConfig;
import com.ss.bytertc.engine.video.ScreenSharingParameters;
import com.ss.bytertc.engine.video.VideoCaptureConfig;
import com.ss.bytertc.engine.video.VideoDecoderConfig;
import com.ss.bytertc.engine.video.VideoEffectExpressionConfig;
import com.ss.bytertc.engine.video.VideoEncoderConfiguration;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.VideoPreprocessorConfig;
import com.ss.bytertc.engine.video.builder.GLTextureVideoFrameBuilder;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes33.dex */
public class RTCEngineImpl extends RTCEngineEx {
    public static WeakReference<IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler> mAudioDeviceManagerEventHandler;
    public static boolean mLibraryLoaded;
    public static String mPackageName;
    public static RTCEngineImpl sRtcEngineInstance;
    public boolean isMultiRoom;
    public RTCVideoEffect mAdvanceVideoEffect;
    public String mAppId;
    public AudioMixingManager mAudioMixingManager;
    public int mChannelProfile;
    public Context mContext;
    public WeakReference<IVideoProcessor> mCustomVideoPreprocessor;
    public Handler mEglHandler;
    public HandlerThread mEglThread;
    public boolean mEnableTranscode;
    public RTCEngineEventHandler mEngineEventHandler;
    public RTCEngineInternalEventHandler mEngineInternalEventHandler;
    public WeakReference<IExternalVideoEncoderEventHandler> mExternalVideoEncoderHandler;
    public boolean mIsUseCustomEglEnv;
    public LiveTranscoding mLiveTranscoding;
    public ILiveTranscodingObserver mLiveTranscodingObserver;
    public WeakReference<ILocalEncodedVideoFrameObserver> mLocalEncodedVideoFrameObserver;
    public WeakReference<IMetadataObserver> mMetadataObserver;
    public long mNativeEngine;
    public Runnable mOnDestroyCompletedCallback;
    public PublicStreaming mPublicStreaming;
    public RTCASREngineEventHandler mRTCASREngineEventHandler;
    public WeakReference<IRemoteEncodedVideoFrameObserver> mRemoteEncodedVideoFrameObserver;
    public boolean mRequestSoftwareEncoder;
    public String mRoom;
    public EglBase mRootEglBase;
    public WeakReference<IRTCEngineEventHandler> mRtcEngineHandler;
    public RTCExternalVideoEncoderEventHandler mRtcExVideoEncoderHandler;
    public RTCLocalEncodedVideoFrameObserver mRtcLocalEncodedVideoFrameObserver;
    public RTCMetadataObserver mRtcMetadataObserver;
    public RTCRemoteEncodedVideoFrameObserver mRtcRemoteEncodedVideoFrameObserver;
    public RTCVideoFrameObserver mRtcVideoFrameObserver;
    public RTCVideoProcessor mRtcVideoPreprocessor;
    public VideoFrameConverter mScreenFrameConverter;
    public String mSessionId;
    public State mState;
    public String mToken;
    public LiveTranscodingObserver mTranscodingObserver;
    public boolean mUseExtTexture;
    public boolean mUseExtVideoSource;
    public String mUser;
    public VideoFrameConverter mVideoFrameConverter;
    public VideoSinkTask mVideoSinkTask;
    public static RTCNativeLibraryLoaderListener mRtcNativeLibraryListener = new RTCNativeLibraryListenerImpl();
    public static RTCNativeLibraryLoaderInfo sRtcLoaderInfo = new RTCNativeLibraryLoaderInfo();
    public static RTCHttpClient nativeHttpClient = null;
    public static RTCAudioDeviceEventHandler mRTCAudioDeviceManagerEventHandler = null;
    public static RTCAudioDeviceManagerEx mAudioDeviceManager = null;
    public static String mDeviceId = "";
    public boolean mPushMode = true;
    public boolean mVideoEnabled = true;
    public boolean mAudioEnabled = true;
    public int mClientRole = 2;
    public boolean mIsVideoMirror = true;
    public boolean mIsFront = true;
    public LogUtil.LoggerSink mLoggerSink = new LogUtil.LoggerSink() { // from class: X.ZWM
        @Override // com.ss.bytertc.engine.utils.LogUtil.LoggerSink
        public final void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th) {
            RTCEngineImpl.this.lambda$new$0(logLevel, str, th);
        }
    };
    public AppMonitor.Callback appStateCallback = new AppMonitor.Callback() { // from class: X.ZWN
        @Override // com.ss.bytertc.engine.utils.AppMonitor.Callback
        public final void callback(int i) {
            RTCEngineImpl.this.lambda$new$1(i);
        }
    };

    public /* synthetic */ void lambda$new$2() {
        initEglContext(null);
        this.mRootEglBase.createDummyPbufferSurface();
        this.mRootEglBase.makeCurrent();
        NativeFunctions.nativeSetHardWareEncodeContext();
        this.mRootEglBase.detachCurrent();
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel) {
        return 0;
    }

    /* renamed from: com.ss.bytertc.engine.engineimpl.RTCEngineImpl$1 */
    /* loaded from: classes33.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$RTCEngine$Env;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$AudioScenarioType;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$ClientRole;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$PauseResumeControlMediaType;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$SubscribeMediaType;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$VoiceChangerType;
        public static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType;

        static {
            int[] iArr = new int[SubscribeMediaType.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$SubscribeMediaType = iArr;
            try {
                iArr[SubscribeMediaType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$SubscribeMediaType[SubscribeMediaType.AUDIO_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$SubscribeMediaType[SubscribeMediaType.VIDEO_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$SubscribeMediaType[SubscribeMediaType.AUDIO_AND_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[PauseResumeControlMediaType.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$PauseResumeControlMediaType = iArr2;
            try {
                iArr2[PauseResumeControlMediaType.AUDIO.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$PauseResumeControlMediaType[PauseResumeControlMediaType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$PauseResumeControlMediaType[PauseResumeControlMediaType.AUDIO_AND_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ChannelProfile.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile = iArr3;
            try {
                iArr3[ChannelProfile.CHANNEL_PROFILE_GAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CLOUD_GAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_COMMUNICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LIVE_BROADCASTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LOW_LATENCY.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CHAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CHAT_ROOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LW_TOGETHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_GAME_HD.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CO_HOST.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_INTERACTIVE_PODCAST.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_KTV.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CHORUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFIEL_VR_CHAT.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_GAME_STREAMING.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_LAN_LIVE_STREAMING.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFIEL_MEETING.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_MEETING_ROOM.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[ChannelProfile.CHANNEL_PROFILE_CLASSROOM.ordinal()] = 19;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr4 = new int[ClientRole.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$ClientRole = iArr4;
            try {
                iArr4[ClientRole.CLIENT_ROLE_BROADCASTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$ClientRole[ClientRole.CLIENT_ROLE_SILENT_AUDIENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            int[] iArr5 = new int[VoiceReverbType.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType = iArr5;
            try {
                iArr5[VoiceReverbType.VOICE_REVERB_ORIGINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_ECHO.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_CONCERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_ETHEREAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_KTV.ordinal()] = 5;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_STUDIO.ordinal()] = 6;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_VIRTUAL_STEREO.ordinal()] = 7;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_SPACIOUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_3D.ordinal()] = 9;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_POP.ordinal()] = 10;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_DISCO.ordinal()] = 11;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_OLDRECORD.ordinal()] = 12;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_HARMONY.ordinal()] = 13;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_ROCK.ordinal()] = 14;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_BLUES.ordinal()] = 15;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_JAZZ.ordinal()] = 16;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_ELECTRONIC.ordinal()] = 17;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_VINYL.ordinal()] = 18;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[VoiceReverbType.VOICE_REVERB_CHAMBER.ordinal()] = 19;
            } catch (NoSuchFieldError unused47) {
            }
            int[] iArr6 = new int[VoiceChangerType.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$VoiceChangerType = iArr6;
            try {
                iArr6[VoiceChangerType.VOICE_CHANGER_ORIGINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceChangerType[VoiceChangerType.VOICE_CHANGER_GIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceChangerType[VoiceChangerType.VOICE_CHANGER_CHIPMUNK.ordinal()] = 3;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceChangerType[VoiceChangerType.VOICE_CHANGER_MINIONST.ordinal()] = 4;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceChangerType[VoiceChangerType.VOICE_CHANGER_VIBRATO.ordinal()] = 5;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$VoiceChangerType[VoiceChangerType.VOICE_CHANGER_ROBOT.ordinal()] = 6;
            } catch (NoSuchFieldError unused53) {
            }
            int[] iArr7 = new int[AudioScenarioType.values().length];
            $SwitchMap$com$ss$bytertc$engine$type$AudioScenarioType = iArr7;
            try {
                iArr7[AudioScenarioType.AUDIO_SCENARIO_MUSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$AudioScenarioType[AudioScenarioType.AUDIO_SCENARIO_HIGHQUALITY_COMMUNICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$AudioScenarioType[AudioScenarioType.AUDIO_SCENARIO_COMMUNICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$AudioScenarioType[AudioScenarioType.AUDIO_SCENARIO_MEDIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$AudioScenarioType[AudioScenarioType.AUDIO_SCENARIO_GAME_STREAMING.ordinal()] = 5;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$type$AudioScenarioType[AudioScenarioType.AUDIO_SCENARIO_HIGHQUALITY_CHAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused59) {
            }
            int[] iArr8 = new int[RTCEngine.Env.values().length];
            $SwitchMap$com$ss$bytertc$engine$RTCEngine$Env = iArr8;
            try {
                iArr8[RTCEngine.Env.ENV_PRODUCT.ordinal()] = 1;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$RTCEngine$Env[RTCEngine.Env.ENV_BOE.ordinal()] = 2;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                $SwitchMap$com$ss$bytertc$engine$RTCEngine$Env[RTCEngine.Env.ENV_TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused62) {
            }
        }
    }

    static {
        loadSoFile();
    }

    private boolean engineInvalid() {
        if (this.mNativeEngine == 0) {
            return true;
        }
        return false;
    }

    public static IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler getAudioDeviceManagerEvent() {
        return mAudioDeviceManagerEventHandler.get();
    }

    public static String getRtcPackageName() {
        String str = mPackageName;
        if (str != null) {
            return str;
        }
        return "";
    }

    public static String getSdkVersion() {
        if (!mLibraryLoaded) {
            return "";
        }
        try {
            NativeFunctions.nativeGetSDKVersion();
            return NativeFunctions.nativeGetSDKVersion();
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("rtc loader info:");
            LIZ.append(sRtcLoaderInfo.toString());
            LIZ.append(" exception info:");
            LIZ.append(e.getStackTrace().toString());
            throw new UnsatisfiedLinkError(X1D.LIZIZ(LIZ));
        }
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
            NativeFunctions.nativeClearHardWareEncodeContext();
        }
    }

    public static void loadSoFile() {
        if (mLibraryLoaded) {
            mRtcNativeLibraryListener.onLoadAlready("volcenginertc");
        } else {
            RTCNativeLibraryLoader rTCNativeLibraryLoader = RTCEngine.mRtcNativeLibraryLoader;
            if (rTCNativeLibraryLoader != null) {
                mLibraryLoaded = true;
                boolean load = rTCNativeLibraryLoader.load("bytenn") & true;
                mLibraryLoaded = load;
                boolean load2 = load & RTCEngine.mRtcNativeLibraryLoader.load("RealXBase");
                mLibraryLoaded = load2;
                boolean load3 = load2 & RTCEngine.mRtcNativeLibraryLoader.load("byteaudio");
                mLibraryLoaded = load3;
                boolean load4 = load3 & RTCEngine.mRtcNativeLibraryLoader.load("volcenginertc");
                mLibraryLoaded = load4;
                if (load4) {
                    mRtcNativeLibraryListener.onLoadSuccess("volcenginertc");
                } else {
                    mRtcNativeLibraryListener.onLoadError("volcenginertc");
                }
                sRtcLoaderInfo.setLoaderClassName(C16880lQ.LJLLJ(RTCEngine.mRtcNativeLibraryLoader.getClass()));
            } else {
                try {
                    C16880lQ.LLJJJIL("bytenn");
                    C16880lQ.LLJJJIL("RealXBase");
                    C16880lQ.LLJJJIL("byteaudio");
                    C16880lQ.LLJJJIL("volcenginertc");
                    mLibraryLoaded = true;
                    mRtcNativeLibraryListener.onLoadSuccess("volcenginertc");
                    sRtcLoaderInfo.setLoaderClassName("System.loader");
                } catch (UnsatisfiedLinkError e) {
                    LogUtil.e("RtcEngineImpl", "Failed to load native library: volcenginertc", e);
                }
                mRtcNativeLibraryListener.onLoadError("volcenginertc");
            }
            sRtcLoaderInfo.setLoadResult(mLibraryLoaded);
            sRtcLoaderInfo.setLoadTimeStampMs(System.currentTimeMillis());
            sRtcLoaderInfo.setSdkVersion(getSdkVersion());
        }
        sRtcLoaderInfo.loadLibrary();
    }

    public void doDestroy() {
        LogUtil.d("RtcEngineImpl", "destroy RtcEngineImpl.");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, no need to destroy now.");
            return;
        }
        this.mState = State.DESTORY;
        AudioMixingManager audioMixingManager = this.mAudioMixingManager;
        if (audioMixingManager instanceof AudioMixingManager) {
            audioMixingManager.destroy();
        }
        NativeFunctions.nativeDestroyEngine(this.mNativeEngine);
        this.mNativeEngine = 0L;
        this.mIsFront = true;
        this.mIsVideoMirror = true;
        this.mVideoFrameConverter.dispose();
        this.mVideoFrameConverter = null;
        this.mScreenFrameConverter.dispose();
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect != null) {
            rTCVideoEffect.dispose();
            this.mAdvanceVideoEffect = null;
        }
        this.mScreenFrameConverter = null;
        new Handler(C16880lQ.LLJJJJ()).post(new ZVE(1, this));
        AppMonitor appMonitor = AppMonitor.get(this.mContext);
        appMonitor.unRegister(this.appStateCallback);
        appMonitor.release(this.mContext);
        this.mRtcVideoPreprocessor.dispose();
        this.mRtcVideoPreprocessor = null;
        ThreadUtils.invokeAtFrontUninterruptibly(this.mEglHandler, new ZVG(1, this));
        HandlerThread handlerThread = this.mEglThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        VideoSinkTask videoSinkTask = this.mVideoSinkTask;
        if (videoSinkTask != null) {
            videoSinkTask.exit();
        }
        LogUtil.setLoggerSink(null);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public AudioRoute getAudioRoute() {
        LogUtil.d("RtcEngineImpl", "getAudioRoute");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, getAudioRoute failed.");
            return null;
        }
        return AudioRoute.fromId(NativeFunctions.nativeGetAudioRoute(this.mNativeEngine));
    }

    public IVideoProcessor getCustomVideoPreprocessor() {
        return this.mCustomVideoPreprocessor.get();
    }

    public EglBase getEGLContext() {
        EglBase eglBase = this.mRootEglBase;
        if (eglBase != null) {
            return eglBase;
        }
        return null;
    }

    public ILocalEncodedVideoFrameObserver getEncodedVideoFrameObserver() {
        return this.mLocalEncodedVideoFrameObserver.get();
    }

    public IExternalVideoEncoderEventHandler getExternalVideoEncoderEventHandler() {
        return this.mExternalVideoEncoderHandler.get();
    }

    public IMetadataObserver getMetadataObserver() {
        return this.mMetadataObserver.get();
    }

    public IRemoteEncodedVideoFrameObserver getRemoteEncodedVideoFrameObserver() {
        return this.mRemoteEncodedVideoFrameObserver.get();
    }

    public IRTCEngineEventHandler getRtcEngineHandler() {
        return this.mRtcEngineHandler.get();
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public IVideoEffect getVideoEffectInterface() {
        LogUtil.d("RtcEngineImpl", "getVideoEffectInterface");
        return this.mAdvanceVideoEffect;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean isSpeakerphoneEnabled() {
        Context context = this.mContext;
        if (context == null) {
            return false;
        }
        return ((AudioManager) C16880lQ.LLILL(context, "audio")).isSpeakerphoneOn();
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int leaveRoom() {
        IRTCEngineEventHandler iRTCEngineEventHandler;
        LogUtil.d("RtcEngineImpl", "leaveChannel");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, leaveChannel failed.");
            return -1;
        }
        this.mState = State.IDLE;
        this.mRoom = "";
        this.mUser = "";
        this.mSessionId = "";
        this.mToken = "";
        WeakReference<IRTCEngineEventHandler> weakReference = this.mRtcEngineHandler;
        if (weakReference != null && (iRTCEngineEventHandler = weakReference.get()) != null) {
            iRTCEngineEventHandler.onLeaveRoom(null);
        }
        NativeFunctions.nativeLeaveRoom(this.mNativeEngine);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void pauseForwardStreamToAllRooms() {
        long j = this.mNativeEngine;
        if (j == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pauseForwardStreamToAllRooms failed.");
        } else {
            NativeFunctions.nativePauseForwardStreamToAllRooms(j);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int publish() {
        LogUtil.d("RtcEngineImpl", "publish");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, publish failed.");
            return -1;
        }
        NativeFunctions.nativePublish(this.mNativeEngine);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void resumeForwardStreamToAllRooms() {
        long j = this.mNativeEngine;
        if (j == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, resumeForwardStreamToAllRooms failed.");
        } else {
            NativeFunctions.nativeResumeForwardStreamToAllRooms(j);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startAudioCapture() {
        LogUtil.d("RtcEngineImpl", "startAudioCapture");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startAudioCapture failed.");
        } else {
            NativeFunctions.nativeStartAudioCapture(this.mNativeEngine);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startScreenAudioCapture() {
        LogUtil.d("RtcEngineImpl", "StartScreenAudioCapture");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, StartScreenAudioCapture failed.");
        } else {
            NativeFunctions.nativeStartScreenAudioCapture(this.mNativeEngine);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startVideoCapture() {
        LogUtil.d("RtcEngineImpl", "startVideoCapture");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startVideoCapture failed.");
        } else {
            NativeFunctions.nativeStartVideoCapture(this.mNativeEngine);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopAudioCapture() {
        LogUtil.d("RtcEngineImpl", "stopAudioCapture");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopAudioCapture failed.");
        } else {
            NativeFunctions.nativeStopAudioCapture(this.mNativeEngine);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopCloudProxy() {
        long j = this.mNativeEngine;
        if (j == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopCloudProxy failed.");
        } else {
            NativeFunctions.nativeStopCloudProxy(j);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int stopEchoTest() {
        LogUtil.d("RtcEngineImpl", "stopEchoTest");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopEchoTest failed.");
            return -2;
        }
        return NativeFunctions.nativeStopEchoTest(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopForwardStreamToRooms() {
        long j = this.mNativeEngine;
        if (j == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopForwardStreamToRooms failed.");
        } else {
            NativeFunctions.nativeStopForwardStreamToRooms(j);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopScreenAudioCapture() {
        LogUtil.d("RtcEngineImpl", "StopScreenAudioCapture");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, StopScreenAudioCapture failed.");
        } else {
            NativeFunctions.nativeStopScreenAudioCapture(this.mNativeEngine);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopScreenCapture() {
        LogUtil.d("RtcEngineImpl", "StopScreenCapture");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, StopScreenAudioCapture failed.");
        } else {
            NativeFunctions.nativeStopScreenCapture(this.mNativeEngine);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopVideoCapture() {
        LogUtil.d("RtcEngineImpl", "stopVideoCapture");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopVideoCapture failed.");
        } else {
            NativeFunctions.nativeStopVideoCapture(this.mNativeEngine);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int unpublish() {
        LogUtil.d("RtcEngineImpl", "unpublish");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, unpublish failed.");
            return -1;
        }
        NativeFunctions.nativeUnPublish(this.mNativeEngine);
        return 0;
    }

    public static Context getApplicationContext() {
        return ContextUtils.getApplicationContext();
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void disableExternalAudioDevice() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, disableExternalAudioDevice failed.");
        } else {
            NativeFunctions.nativeDisableExternalAudioDevice(this.mNativeEngine);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int getAudioMixingCurrentPosition() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, getAudioMixingCurrentPosition failed.");
            return -1;
        }
        return NativeFunctions.nativeGetAudioMixingCurrentPosition(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int getAudioMixingDuration() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, getAudioMixingDuration failed.");
            return -1;
        }
        return NativeFunctions.nativeGetAudioMixingDuration(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public IAudioMixingManager getAudioMixingManager() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, getAudioMixingManager");
            return null;
        }
        AudioMixingManager audioMixingManager = this.mAudioMixingManager;
        if (audioMixingManager != null) {
            return audioMixingManager;
        }
        long nativeGetAudioMixingManager = NativeFunctions.nativeGetAudioMixingManager(this.mNativeEngine);
        if (nativeGetAudioMixingManager == 0) {
            LogUtil.e("RtcEngineImpl", "getAudioMixingManager failed");
            return null;
        }
        AudioMixingManager audioMixingManager2 = new AudioMixingManager(nativeGetAudioMixingManager, this.mNativeEngine);
        this.mAudioMixingManager = audioMixingManager2;
        return audioMixingManager2;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int getAudioMixingStreamCachedFrameNum() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, getAudioMixingStreamCachedFrameNum failed.");
            return -1;
        }
        return NativeFunctions.nativeGetAudioMixingStreamCachedFrameNum(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public float getCameraZoomMaxRatio() {
        if (engineInvalid() || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, PushScreenAudioFrame failed.");
            return -1.0f;
        }
        return NativeFunctions.nativeGetCameraZoomMaxRatio(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean isCameraExposurePositionSupported() {
        if (engineInvalid() || this.mState == State.DESTORY) {
            return false;
        }
        return NativeFunctions.nativeIsCameraExposurePositionSupported(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean isCameraFocusPositionSupported() {
        if (engineInvalid() || this.mState == State.DESTORY) {
            return false;
        }
        return NativeFunctions.nativeIsCameraFocusPositionSupported(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean isCameraTorchSupported() {
        if (engineInvalid() || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, PushScreenAudioFrame failed.");
            return false;
        }
        return NativeFunctions.nativeIsSupportFlashLight(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean isCameraZoomSupported() {
        if (engineInvalid() || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, PushScreenAudioFrame failed.");
            return false;
        }
        return NativeFunctions.nativeIsCameraZoomSupported(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void logout() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
        } else {
            NativeFunctions.nativeLogout(this.mNativeEngine);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int pauseAllEffects() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pauseAllEffects failed.");
            return -1;
        }
        return NativeFunctions.nativePauseAllEffects(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int pauseAudioMixing() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pauseAudioMixing failed.");
            return -1;
        }
        return NativeFunctions.nativePauseAudioMixing(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int publishScreen() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, publishScreen failed.");
            return -1;
        }
        return NativeFunctions.nativePublishScreen(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int resumeAllEffects() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, resumeAllEffects failed.");
            return -1;
        }
        return NativeFunctions.nativeResumeAllEffects(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int resumeAudioMixing() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, resumeAudioMixing failed.");
            return -1;
        }
        return NativeFunctions.nativeResumeAudioMixing(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopASR() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopASR");
        } else {
            NativeFunctions.nativeStopASR(this.mNativeEngine);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int stopAllEffects() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopAllEffects failed.");
            return -1;
        }
        return NativeFunctions.nativeStopAllEffects(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int stopAudioMixing() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopAudioMixing failed.");
            return -1;
        }
        NativeFunctions.nativeStopAudioMixing(this.mNativeEngine);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopCloudRendering() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopCloudRendering failed.");
            return;
        }
        String cloudRenderingInfo = getCloudRenderingInfo("stopped", "");
        if (cloudRenderingInfo == null) {
            return;
        }
        NativeFunctions.nativeUpdateCloudRending(this.mNativeEngine, cloudRenderingInfo);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopNetworkDetection() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendCustomMessage failed.");
        }
        NativeFunctions.nativeStopNetworkProbe(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int stopScreenSharing() {
        return stopScreenVideoCapture();
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int stopScreenVideoCapture() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopScreenCapture failed.");
            return -1;
        }
        return NativeFunctions.nativeStopScreenVideoCapture(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int unloadAllEffects() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, unloadAllEffects failed.");
            return -1;
        }
        return NativeFunctions.nativeUnloadAllEffects(this.mNativeEngine);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int unpublishScreen() {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, unpublishScreen failed.");
            return -1;
        }
        return NativeFunctions.nativeUnpublishScreen(this.mNativeEngine);
    }

    /* loaded from: classes33.dex */
    public static class RtcHttpCallbackImpl implements RTCHttpClient.RtcHttpCallback {
        public int callbackId;
        public int clientId;

        public int getCallbackId() {
            return this.callbackId;
        }

        public void setCallbackId(int i) {
            this.callbackId = i;
        }

        public void setClientId(int i) {
            this.clientId = i;
        }

        @Override // com.ss.bytertc.engine.RTCHttpClient.RtcHttpCallback
        public void run(int i, String str) {
            NativeFunctions.nativeHttpClientCallback(this.callbackId, this.clientId, i, str);
        }
    }

    public long NativeEngine() {
        return this.mNativeEngine;
    }

    public ILiveTranscodingObserver getLiveTranscodingObserver() {
        return this.mLiveTranscodingObserver;
    }

    public String getLocalUser() {
        return this.mUser;
    }

    public String getRoomName() {
        return this.mRoom;
    }

    public VideoSinkTask getVideoSinkTask() {
        return this.mVideoSinkTask;
    }

    /* loaded from: classes33.dex */
    public enum State {
        IDLE,
        IN_ROOM,
        DESTORY;

        public static State valueOf(String str) {
            return (State) V0N.LJJJ(State.class, str);
        }
    }

    public static IRTCAudioDeviceManagerEx createAudioDeviceManager(IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler iRTCAudioDeviceEventHandler) {
        mAudioDeviceManagerEventHandler = new WeakReference<>(iRTCAudioDeviceEventHandler);
        RTCAudioDeviceManagerEx rTCAudioDeviceManagerEx = mAudioDeviceManager;
        if (rTCAudioDeviceManagerEx != null) {
            return rTCAudioDeviceManagerEx;
        }
        RTCAudioDeviceEventHandler rTCAudioDeviceEventHandler = new RTCAudioDeviceEventHandler();
        mRTCAudioDeviceManagerEventHandler = rTCAudioDeviceEventHandler;
        RTCAudioDeviceManagerEx rTCAudioDeviceManagerEx2 = new RTCAudioDeviceManagerEx(rTCAudioDeviceEventHandler);
        mAudioDeviceManager = rTCAudioDeviceManagerEx2;
        return rTCAudioDeviceManagerEx2;
    }

    public static String getErrorDescription(int i) {
        if (i != -1072) {
            return NativeFunctions.nativeGetErrorDescription(i);
        }
        return "Failed to load library.";
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
        long j = this.mNativeEngine;
        if (i == 1) {
            str = "active";
        } else {
            str = "background";
        }
        NativeFunctions.nativeSetAppState(j, str);
    }

    public static int setDeviceId(String str) {
        if (str == null) {
            return -1;
        }
        mDeviceId = str;
        if (!mLibraryLoaded) {
            return -1;
        }
        return NativeFunctions.nativeSetDeviceId(str);
    }

    public static int setEnv(RTCEngine.Env env) {
        if (!mLibraryLoaded) {
            return -1;
        }
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$RTCEngine$Env[env.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    i2 = 2;
                }
            }
            return NativeFunctions.nativeSetEnv(i2);
        }
        i2 = 0;
        return NativeFunctions.nativeSetEnv(i2);
    }

    public static int setParameters(String str) {
        if (!mLibraryLoaded || str == null || str.isEmpty()) {
            return -1;
        }
        return NativeFunctions.nativeSetParameters(str);
    }

    public static void setRtcHttpClient(RTCHttpClient rTCHttpClient) {
        if (mLibraryLoaded) {
            nativeHttpClient = rTCHttpClient;
            NativeFunctions.nativeSetUpperHttpClient(true);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int adjustAudioMixingPlayoutVolume(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingPlayoutVolume failed.");
            return -1;
        }
        return NativeFunctions.nativeAdjustAudioMixingPlayoutVolume(this.mNativeEngine, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int adjustAudioMixingPublishVolume(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingPublishVolume failed.");
            return -1;
        }
        return NativeFunctions.nativeAdjustAudioMixingPublishVolume(this.mNativeEngine, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int adjustAudioMixingVolume(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, adjustAudioMixingVolume failed.");
            return -1;
        }
        return NativeFunctions.nativeAdjustAudioMixingVolume(this.mNativeEngine, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int appendVideoEffectNodes(List<String> list) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.appendEffectNodes(list);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void clearVideoWatermark(StreamIndex streamIndex) {
        long j = this.mNativeEngine;
        if (j == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, clearVideoWatermark failed.");
        } else {
            NativeFunctions.nativeClearVideoWatermark(j, streamIndex.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, disableAudioFrameCallback failed.");
        } else {
            NativeFunctions.nativeDisableAudioFrameCallback(this.mNativeEngine, audioFrameCallbackMethod.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void disableAudioProcessor(AudioProcessorMethod audioProcessorMethod) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, disableAudioProcessor failed.");
        } else {
            NativeFunctions.nativeDisableAudioProcessor(this.mNativeEngine, audioProcessorMethod.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig) {
        if (engineInvalid() || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, EnableAudioPropertiesReport failed.");
        } else {
            NativeFunctions.nativeEnableAudioPropertiesReport(this.mNativeEngine, audioPropertiesConfig.interval, audioPropertiesConfig.enableSpectrum, audioPropertiesConfig.enableVad, audioPropertiesConfig.localMainReportMode.value(), audioPropertiesConfig.smooth, audioPropertiesConfig.audioReportMode.value(), audioPropertiesConfig.enableVoicePitch);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int enableEffectBeauty(boolean z) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableEffectBeauty failed.");
            return 1000;
        }
        return NativeFunctions.nativeEnableEffectBeauty(this.mNativeEngine, z);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void enableExternalSoundCard(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableExternalSoundCard: ");
        LIZ.append(z);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableExternalSoundCard failed.");
        } else {
            NativeFunctions.nativeEnableExternalSoundCard(this.mNativeEngine, z);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void enablePlaybackDucking(boolean z) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, EnablePlaybackDucking failed.");
        } else {
            NativeFunctions.nativeEnablePlaybackDucking(this.mNativeEngine, z);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int enableSimulcastMode(boolean z) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoResolutions failed.");
            return -1;
        }
        NativeFunctions.nativeEnableSimulcastMode(this.mNativeEngine, z);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void enableSubscribeLocalStream(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableSubscribeLocalStream: ");
        LIZ.append(z);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableSubscribeLocalStream failed.");
        } else {
            NativeFunctions.nativeEnableSubscribeLocalStream(this.mNativeEngine, z);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int enableVideoEffect(boolean z) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableVideoEffect failed.");
            return 1000;
        }
        return NativeFunctions.nativeEnableVideoEffect(this.mNativeEngine, z);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void enableVocalInstrumentBalance(boolean z) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, EnableVocalInstrumentBalance failed.");
        } else {
            NativeFunctions.nativeEnableVocalInstrumentBalance(this.mNativeEngine, z);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int getEffectVolume(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, getEffectVolume failed.");
            return -1;
        }
        return NativeFunctions.nativeGetEffectVolume(this.mNativeEngine, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void getPeerOnlineStatus(String str) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
        } else {
            NativeFunctions.nativeGetPeerOnlineStatus(this.mNativeEngine, str);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int invokeExperimentalAPI(String str) {
        LogUtil.d("RtcEngineImpl", "invokeExperimentalAPI");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, invokeExperimentalAPI failed.");
            return -2;
        }
        return NativeFunctions.nativeInvokeExperimentalAPI(this.mNativeEngine, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void muteAllRemoteAudio(MuteState muteState) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("muteAllRemoteAudio: ");
        LIZ.append(muteState.value());
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteAllRemoteAudio failed.");
        } else {
            NativeFunctions.nativeMuteAllRemoteAudio(this.mNativeEngine, muteState.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int muteAllRemoteVideo(MuteState muteState) {
        boolean z;
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("muteAllRemoteVideoStreams: ");
        LIZ.append(z);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteAllRemoteVideoStreams failed.");
            return -1;
        }
        NativeFunctions.nativeMuteAllRemoteVideo(this.mNativeEngine, muteState.value());
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void muteAudioPlayback(MuteState muteState) {
        long j = this.mNativeEngine;
        if (j == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteAudioPlayback failed.");
        } else {
            NativeFunctions.nativeMuteAudioPlayback(j, muteState.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void muteLocalAudio(MuteState muteState) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("muteLocalAudio ");
        LIZ.append(muteState.value());
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteLocalAudio failed.");
        } else {
            NativeFunctions.nativeMuteLocalAudio(this.mNativeEngine, muteState.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void muteLocalVideo(MuteState muteState) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("muteLocalVideo: ");
        LIZ.append(muteState.toString());
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteLocalVideoStream failed.");
        }
        NativeFunctions.nativeMuteLocalVideo(this.mNativeEngine, muteState.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void pauseAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pauseAllSubscribedStream: ");
        LIZ.append(pauseResumeControlMediaType);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteAllRemoteAudio failed.");
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$type$PauseResumeControlMediaType[pauseResumeControlMediaType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    i2 = 2;
                }
            }
            NativeFunctions.nativePauseAllSubscribedStream(this.mNativeEngine, i2);
        }
        i2 = 0;
        NativeFunctions.nativePauseAllSubscribedStream(this.mNativeEngine, i2);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int pauseEffect(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pauseEffect failed.");
            return -1;
        }
        return NativeFunctions.nativePauseEffect(this.mNativeEngine, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int publishScreen(MediaStreamType mediaStreamType) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, publishScreen failed.");
            return -1;
        }
        return NativeFunctions.nativePublishScreenWithMediaStreamType(this.mNativeEngine, mediaStreamType.value);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int publishStream(MediaStreamType mediaStreamType) {
        LogUtil.d("RtcEngineImpl", "publish");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, publish failed.");
            return -1;
        }
        NativeFunctions.nativePublishStream(this.mNativeEngine, mediaStreamType.value);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int pullExternalAudioFrame(AudioFrame audioFrame) {
        if (engineInvalid() || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pullExternalAudioFrame failed.");
            return -1;
        }
        if (NativeFunctions.nativePullExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value())) {
            return 0;
        }
        return -2;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int pushExternalAudioFrame(AudioFrame audioFrame) {
        if (engineInvalid() || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pushExternalAudioFrame failed.");
            return -1;
        }
        if (NativeFunctions.nativePushExternalAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value())) {
            return 0;
        }
        return -2;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean pushExternalVideoFrame(final VideoFrame videoFrame) {
        if (engineInvalid() || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "pushExternalVideoFrame: native engine is invalid, pushExternalVideoFrame failed.");
            return false;
        }
        if (videoFrame == null) {
            LogUtil.i("RtcEngineImpl", "pushExternalVideoFrame: videoFrame is null, drop frame.");
            return false;
        }
        if (!this.mUseExtVideoSource) {
            LogUtil.i("RtcEngineImpl", "pushExternalVideoFrame: not enable external video source, drop frame.");
            return false;
        }
        if (videoFrame.getFrameType() == VideoFrameType.RAW_MEMORY || videoFrame.hasReleaseCallback()) {
            NativeFunctions.nativePushExternalByteRtcVideoFrame(this.mNativeEngine, videoFrame);
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
            gLTextureVideoFrameBuilder.setReleaseCallback(new Runnable() { // from class: X.ZVe
                @Override // java.lang.Runnable
                public final void run() {
                    RTCEngineImpl.lambda$pushExternalVideoFrame$5(VideoFrame.this, countDownLatch);
                }
            });
            VideoFrame build = gLTextureVideoFrameBuilder.build();
            NativeFunctions.nativePushExternalByteRtcVideoFrame(this.mNativeEngine, build);
            build.release();
            if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 1000L)) {
                LogUtil.w("RtcEngineImpl", "pushExternalVideoFrame: pushExternalVideoFrame timeout.");
            }
        }
        return true;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int pushScreenAudioFrame(AudioFrame audioFrame) {
        if (engineInvalid() || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, PushScreenAudioFrame failed.");
            return -1;
        }
        return NativeFunctions.nativePushScreenAudioFrame(this.mNativeEngine, audioFrame.buffer, audioFrame.samples, audioFrame.sampleRate.value(), audioFrame.channel.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean pushScreenFrame(VideoFrame videoFrame) {
        boolean z = false;
        if (engineInvalid() || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pushExternalVideoFrame failed.");
            return false;
        }
        if (videoFrame == null) {
            LogUtil.i("RtcEngineImpl", "videoFrame is null, drop frame.");
            return false;
        }
        videoFrame.retain();
        if (videoFrame.getFrameType() == VideoFrameType.RAW_MEMORY) {
            z = NativeFunctions.nativePushScreenByteRtcFrame(this.mNativeEngine, videoFrame);
        } else if (videoFrame.getFrameType() == VideoFrameType.GL_TEXTURE) {
            VideoFrameConverter videoFrameConverter = this.mScreenFrameConverter;
            if (videoFrameConverter == null) {
                videoFrame.release();
                return false;
            }
            com.bytedance.realx.video.VideoFrame convert2WebrtcI420Frame = videoFrameConverter.convert2WebrtcI420Frame(videoFrame);
            if (convert2WebrtcI420Frame == null) {
                LogUtil.e("RtcEngineImpl", "pushExternalVideoFrame failed because no converted webrtcVideoFrame is null");
                videoFrame.release();
                return false;
            }
            z = NativeFunctions.nativePushScreenFrame(this.mNativeEngine, convert2WebrtcI420Frame);
            convert2WebrtcI420Frame.release();
        }
        videoFrame.release();
        return z;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, registerAudioFrameObserver failed.");
            return -1;
        }
        NativeFunctions.nativeSetAudioFrameObserver(this.mNativeEngine, iAudioFrameObserver);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, registerAudioProcessor failed.");
            return -1;
        }
        NativeFunctions.nativeSetAudioFrameProcessor(this.mNativeEngine, iAudioFrameProcessor);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver) {
        this.mLocalEncodedVideoFrameObserver = new WeakReference<>(iLocalEncodedVideoFrameObserver);
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, registerAudioFrameObserver failed.");
        } else if (iLocalEncodedVideoFrameObserver == null) {
            NativeFunctions.nativeRegisterLocalEncodedVideoFrameObserver(this.mNativeEngine, null);
        } else {
            NativeFunctions.nativeRegisterLocalEncodedVideoFrameObserver(this.mNativeEngine, this.mRtcLocalEncodedVideoFrameObserver);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void registerMetadataObserver(IMetadataObserver iMetadataObserver) {
        this.mMetadataObserver = new WeakReference<>(iMetadataObserver);
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, registerMetadataObserver failed.");
        } else if (iMetadataObserver == null) {
            NativeFunctions.nativeSetMetadataObserver(this.mNativeEngine, null);
        } else {
            NativeFunctions.nativeSetMetadataObserver(this.mNativeEngine, this.mRtcMetadataObserver);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver) {
        this.mRemoteEncodedVideoFrameObserver = new WeakReference<>(iRemoteEncodedVideoFrameObserver);
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, RegisterRemoteEncodedVideoFrameObserver failed.");
        } else if (iRemoteEncodedVideoFrameObserver == null) {
            NativeFunctions.nativeRegisterRemoteEncodedVideoFrameObserver(this.mNativeEngine, null);
        } else {
            NativeFunctions.nativeRegisterRemoteEncodedVideoFrameObserver(this.mNativeEngine, this.mRtcRemoteEncodedVideoFrameObserver);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int removeVideoEffectNodes(List<String> list) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.removeEffectNodes(list);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void requestRemoteVideoKeyFrame(RemoteStreamKey remoteStreamKey) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, RequestRemoteVideoKeyFrame failed.");
        } else {
            NativeFunctions.nativeRequestRemoteVideoKeyFrame(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void resumeAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("resumeAllSubscribedStream: ");
        LIZ.append(pauseResumeControlMediaType);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteAllRemoteAudio failed.");
            return;
        }
        int i = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$type$PauseResumeControlMediaType[pauseResumeControlMediaType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    i2 = 2;
                }
            }
            NativeFunctions.nativeResumeAllSubscribedStream(this.mNativeEngine, i2);
        }
        i2 = 0;
        NativeFunctions.nativeResumeAllSubscribedStream(this.mNativeEngine, i2);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int resumeEffect(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, resumeEffect failed.");
            return -1;
        }
        return NativeFunctions.nativeResumeEffect(this.mNativeEngine, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendRoomBinaryMessage(byte[] bArr) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendCustomMessage failed.");
            return -1L;
        }
        return NativeFunctions.nativeSendRoomBinaryMessage(this.mNativeEngine, bArr);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendRoomMessage(String str) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendCustomMessage failed.");
            return -1L;
        }
        return NativeFunctions.nativeSendRoomMessage(this.mNativeEngine, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendServerBinaryMessage(byte[] bArr) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            return -1L;
        }
        return NativeFunctions.nativeSendServerBinaryMessage(this.mNativeEngine, bArr);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendServerMessage(String str) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            return -1L;
        }
        return NativeFunctions.nativeSendServerMessage(this.mNativeEngine, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setAudioMixingPosition(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setAudioMixingPosition failed.");
            return -1;
        }
        return NativeFunctions.nativeSetAudioMixingPosition(this.mNativeEngine, i);
    }

    public void setAudioMode(int i) {
        AudioManager audioManager;
        Context context = this.mContext;
        if (context != null && (audioManager = (AudioManager) C16880lQ.LLILL(context, "audio")) != null && audioManager.getMode() != i) {
            audioManager.setMode(i);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setAudioPlaybackDevice(AudioPlaybackDevice audioPlaybackDevice) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioPlaybackDevice: ");
        LIZ.append(audioPlaybackDevice.value());
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setAudioPlaybackDevice failed.");
            return -1;
        }
        return NativeFunctions.nativeSetAudioPlaybackDevice(this.mNativeEngine, audioPlaybackDevice.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setAudioProfile(AudioProfileType audioProfileType) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioProfile:");
        LIZ.append(audioProfileType);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setAudioProfile failed.");
        } else if (audioProfileType != null) {
            NativeFunctions.nativeSetAudioProfile(this.mNativeEngine, audioProfileType.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setAudioRenderType(AudioRenderType audioRenderType) {
        LogUtil.d("RtcEngineImpl", "SetAudioRenderType");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SetAudioRenderType failed.");
            return -1;
        }
        return NativeFunctions.nativeSetAudioRenderType(this.mNativeEngine, audioRenderType.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setAudioRoute(AudioRoute audioRoute) {
        if (audioRoute == null) {
            LogUtil.e("RtcEngineImpl", "param audioRoute is null, setAudioRoute failed.");
            return -1;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioRoute: ");
        LIZ.append(audioRoute.value());
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setAudioRoute failed.");
            return -1;
        }
        return NativeFunctions.nativeSetAudioRoute(this.mNativeEngine, audioRoute.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setAudioScenario(AudioScenarioType audioScenarioType) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioScenario...audioScenario: ");
        LIZ.append(audioScenarioType);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setAudioScenario failed.");
            return;
        }
        int i = 0;
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$type$AudioScenarioType[audioScenarioType.ordinal()]) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
        }
        NativeFunctions.nativeSetAudioScenario(this.mNativeEngine, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setAudioSourceType(AudioSourceType audioSourceType) {
        LogUtil.d("RtcEngineImpl", "SetAudioSourceType");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SetAudioSourceType failed.");
            return -1;
        }
        return NativeFunctions.nativeSetAudioSourceType(this.mNativeEngine, audioSourceType.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setAudioVolumeIndicationInterval(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setAudioVolumeIndicationInterval interval: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setAudioVolumeIndicationInterval failed.");
        } else {
            NativeFunctions.nativeSetAudioVolumeIndicationInterval(this.mNativeEngine, i);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setBusinessId(String str) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setBusinessId failed.");
            return -1;
        }
        return NativeFunctions.nativeSetBusinessId(this.mNativeEngine, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setCameraExposureCompensation(float f) {
        if (engineInvalid() || this.mState == State.DESTORY) {
            return -1;
        }
        return NativeFunctions.nativeSetCameraExposureCompensation(this.mNativeEngine, f);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setCameraTorch(TorchState torchState) {
        boolean z;
        if (engineInvalid() || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, PushScreenAudioFrame failed.");
            return -1;
        }
        if (torchState == TorchState.TORCH_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        return NativeFunctions.nativeEnableCameraTorch(this.mNativeEngine, z);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setCameraZoomRatio(float f) {
        if (engineInvalid() || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, PushScreenAudioFrame failed.");
            return -1;
        }
        return NativeFunctions.nativeSetCameraZoomRatio(this.mNativeEngine, f);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setCustomizeEncryptHandler(RTCEncryptHandler rTCEncryptHandler) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setCustomizeEncryptHandler failed.");
        } else {
            NativeFunctions.nativeSetCustomizeEncryptHandler(this.mNativeEngine, rTCEncryptHandler);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setDefaultAudioRoute(AudioRoute audioRoute) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDefaultAudioRoute: ");
        LIZ.append(audioRoute.value());
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setDefaultAudioRoute failed.");
            return -1;
        }
        return NativeFunctions.nativeSetDefaultAudioRoute(this.mNativeEngine, audioRoute.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setDummyCaptureImagePath(String str) {
        long j = this.mNativeEngine;
        if (j == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setDummyCaptureImagePath failed.");
            return -1;
        }
        return NativeFunctions.nativeSetDummyCaptureImagePath(j, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setEarMonitorMode(EarMonitorMode earMonitorMode) {
        LogUtil.d("RtcEngineImpl", "setEarMonitorMode");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setEarMonitorMode failed.");
        } else {
            NativeFunctions.nativeSetEarMonitorMode(this.mNativeEngine, earMonitorMode.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setEarMonitorVolume(int i) {
        LogUtil.d("RtcEngineImpl", "setEarMonitorVolume");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setEarMonitorVolume failed.");
        } else {
            NativeFunctions.nativeSetEarMonitorVolume(this.mNativeEngine, i);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setEffectsVolume(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setEffectsVolume failed.");
            return -1;
        }
        return NativeFunctions.nativeSetEffectsVolume(this.mNativeEngine, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler) {
        this.mExternalVideoEncoderHandler = new WeakReference<>(iExternalVideoEncoderEventHandler);
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setExternalVideoEncoderEventHandler failed.");
        } else if (iExternalVideoEncoderEventHandler == null) {
            NativeFunctions.nativeSetExternalVideoEncoderEventHandler(this.mNativeEngine, null);
        } else {
            NativeFunctions.nativeSetExternalVideoEncoderEventHandler(this.mNativeEngine, this.mRtcExVideoEncoderHandler);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setInternalEventHandler(IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler) {
        this.mEngineInternalEventHandler.setInternalEventHandler(iRTCEngineInternalEventHandler);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setLocalVideoMirrorMode(MirrorMode mirrorMode) {
        boolean z;
        if (mirrorMode != MirrorMode.MIRROR_MODE_OFF) {
            z = true;
        } else {
            z = false;
        }
        this.mIsVideoMirror = z;
        NativeFunctions.nativeSetLocalVideoMirrorMode(this.mNativeEngine, mirrorMode.value());
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setLocalVideoMirrorType(MirrorType mirrorType) {
        NativeFunctions.nativeSetLocalVideoMirrorType(this.mNativeEngine, mirrorType.value());
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setLocalVoicePitch(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setLocalVoicePitch failed.");
        } else {
            NativeFunctions.nativeSetLocalVoicePitch(this.mNativeEngine, i);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setMultiDeviceAVSync(String str) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setMultiDeviceAVSync failed.");
            return -1;
        }
        return NativeFunctions.nativeSetMultiDeviceAVSync(this.mNativeEngine, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setOnDestroyCompletedCallback(Runnable runnable) {
        this.mOnDestroyCompletedCallback = runnable;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setPlaybackVolume(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setPlaybackVolume failed.");
        } else {
            NativeFunctions.nativeSetPlaybackVolume(this.mNativeEngine, i);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setPublishFallbackOption(PublishFallbackOption publishFallbackOption) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPublishFallbackOption: option: ");
        LIZ.append(publishFallbackOption);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setPublishFallbackOption failed.");
            return -1;
        }
        NativeFunctions.nativeSetPublishFallbackOption(this.mNativeEngine, publishFallbackOption.value());
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setRecordingVolume(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setRecordingVolume failed.");
        } else {
            NativeFunctions.nativeSetRecordingVolume(this.mNativeEngine, i);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setRtcEngineEventHandler(IRTCEngineEventHandler iRTCEngineEventHandler) {
        LogUtil.d("RtcEngineImpl", "setRtcEngineEventHandler");
        this.mRtcEngineHandler = new WeakReference<>(iRTCEngineEventHandler);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setRuntimeParameters(JSONObject jSONObject) {
        String jSONObject2;
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SetRuntimeParameters failed.");
            return;
        }
        long j = this.mNativeEngine;
        if (jSONObject == null) {
            jSONObject2 = "";
        } else {
            jSONObject2 = jSONObject.toString();
        }
        NativeFunctions.nativeSetRuntimeParameters(j, jSONObject2);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setScreenAudioSourceType(AudioSourceType audioSourceType) {
        LogUtil.d("RtcEngineImpl", "SetScreenAudioSourceType");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SetScreenAudioSourceType failed.");
        } else {
            NativeFunctions.nativeSetScreenAudioSourceType(this.mNativeEngine, audioSourceType.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setScreenAudioStreamIndex(StreamIndex streamIndex) {
        LogUtil.d("RtcEngineImpl", "SetScreenAudioStreamIndex");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SetScreenAudioStreamIndex failed.");
        } else {
            NativeFunctions.nativeSetScreenAudioStreamIndex(this.mNativeEngine, streamIndex.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setScreenVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoEncoderConfig failed.");
            return -1;
        }
        return NativeFunctions.nativeSetScreenVideoEncoderConfig(this.mNativeEngine, new InternalVideoEncoderConfig(videoEncoderConfig));
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setRemoteSubscribeFallbackOption: option: ");
        LIZ.append(subscribeFallbackOptions);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setRemoteSubscribeFallbackOption failed.");
            return -1;
        }
        NativeFunctions.nativeSetRemoteSubscribeFallbackOption(this.mNativeEngine, subscribeFallbackOptions.value());
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setUserRole(ClientRole clientRole) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setUserRole. role : ");
        LIZ.append(clientRole);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setUserRole failed.");
            return -1;
        }
        int i = 1;
        if (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$type$ClientRole[clientRole.ordinal()] != 1) {
            i = 2;
        }
        NativeFunctions.nativeSetUserRole(this.mNativeEngine, i);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setUserVisibility(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setUserVisibility. enable : ");
        LIZ.append(z);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setUserVisibility failed.");
            return -1;
        }
        NativeFunctions.nativeSetUserVisibility(this.mNativeEngine, z);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoCaptureConfig(VideoCaptureConfig videoCaptureConfig) {
        if (videoCaptureConfig == null || engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid or videoCaptureConfig is null, setVideoCaptureConfig failed.");
            return -1;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVideoCaptureConfig: ");
        LIZ.append(videoCaptureConfig.toString());
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        return NativeFunctions.nativeSetVideoCaptureConfig(this.mNativeEngine, new InternalVideoCaptureConfig(videoCaptureConfig.capturePreference.getValue(), videoCaptureConfig.width, videoCaptureConfig.height, videoCaptureConfig.frameRate));
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setVideoEffectAlgoModelPath(String str) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoEffectAlgoModelPath failed.");
        } else {
            NativeFunctions.nativeSetVideoEffectAlgoModelPath(this.mNativeEngine, str);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEffectColorFilter(String str) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.setColorFilter(str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEffectColorFilterIntensity(float f) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.setColorFilterIntensity(f);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEffectExpressionDetect(VideoEffectExpressionConfig videoEffectExpressionConfig) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.setVideoEffectExpressionDetect(videoEffectExpressionConfig);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEffectNodes(List<String> list) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.setEffectNodes(list);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEncoderConfig(VideoEncoderConfig[] videoEncoderConfigArr) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoEncoderConfig failed.");
            return -1;
        }
        if (videoEncoderConfigArr == null) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoEncoderConfig videoEncoderConfig : videoEncoderConfigArr) {
            if (!videoEncoderConfig.isValid()) {
                LogUtil.e("RtcEngineImpl", "setVideoEncoderConfig with illegal params");
                return -2;
            }
            arrayList.add(new InternalVideoEncoderConfig(videoEncoderConfig));
        }
        return NativeFunctions.nativeSetVideoEncoderConfigV2(this.mNativeEngine, arrayList);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setVideoInputType(MediaInputType mediaInputType) {
        boolean z;
        if (mediaInputType == MediaInputType.MEDIA_INPUT_TYPE_EXTERNAL) {
            z = true;
        } else {
            z = false;
        }
        this.mUseExtVideoSource = z;
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoInputType failed.");
        } else {
            NativeFunctions.nativeSetVideoInputType(this.mNativeEngine, mediaInputType.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setVideoOrientation(VideoOrientation videoOrientation) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoOrientation failed.");
        } else {
            NativeFunctions.nativeSetVideoOrientation(this.mNativeEngine, videoOrientation.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoRotationMode(VideoRotationMode videoRotationMode) {
        return NativeFunctions.nativeSetVideoRotationMode(this.mNativeEngine, videoRotationMode.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setVideoSourceType(VideoSourceType videoSourceType) {
        boolean z;
        if (videoSourceType == VideoSourceType.VIDEO_SOURCE_TYPE_EXTERNAL) {
            z = true;
        } else {
            z = false;
        }
        this.mUseExtVideoSource = z;
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoInputType failed.");
        } else {
            NativeFunctions.nativeSetVideoSourceType(this.mNativeEngine, videoSourceType.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setVoiceChangerType(VoiceChangerType voiceChangerType) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVoiceChangerType...voiceChanger: ");
        LIZ.append(voiceChangerType);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVoiceChangerType failed.");
        }
        int i = 0;
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$type$VoiceChangerType[voiceChangerType.ordinal()]) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
        }
        NativeFunctions.nativeSetVoiceChangerType(this.mNativeEngine, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setVoiceReverbType(VoiceReverbType voiceReverbType) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setVoiceReverbType...voiceReverb: ");
        LIZ.append(voiceReverbType);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVoiceReverbType failed.");
        }
        int i = 0;
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$type$VoiceReverbType[voiceReverbType.ordinal()]) {
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 9;
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                i = 10;
                break;
            case 12:
                i = 11;
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                i = 12;
                break;
            case 14:
                i = 13;
                break;
            case 15:
                i = 14;
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                i = 15;
                break;
            case 17:
                i = 16;
                break;
            case 18:
                i = 17;
                break;
            case 19:
                i = 18;
                break;
        }
        NativeFunctions.nativeSetVoiceReverbType(this.mNativeEngine, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startCloudProxy(List<CloudProxyInfo> list) {
        if (this.mNativeEngine == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startCloudProxy failed.");
            return;
        }
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<CloudProxyInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new InternalCloudProxyInfo(it.next()));
        }
        NativeFunctions.nativeStartCloudProxy(this.mNativeEngine, arrayList);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startCloudRendering(String str) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startCloudRendering failed.");
            return;
        }
        String cloudRenderingInfo = getCloudRenderingInfo("started", str);
        if (cloudRenderingInfo == null) {
            return;
        }
        NativeFunctions.nativeUpdateCloudRending(this.mNativeEngine, cloudRenderingInfo);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int startForwardStreamToRooms(List<ForwardStreamInfo> list) {
        if (this.mNativeEngine == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startForwardStreamToRooms failed.");
            return -1;
        }
        if (list == null) {
            return -1;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<ForwardStreamInfo> it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(new InternalForwardStreamInfo(it.next()));
        }
        return NativeFunctions.nativeStartForwardStreamToRooms(this.mNativeEngine, linkedList);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int startPlayPublicStream(String str) {
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startPlayPublicStream failed.");
            return -1;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startPlayPublicStream...public stream id: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        return NativeFunctions.nativeStartPlayPublicStream(this.mNativeEngine, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int startScreenVideoCapture(Intent intent) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startScreenVideoCapture failed.");
            return -1;
        }
        return NativeFunctions.nativeStartScreenVideoCapture(this.mNativeEngine, intent);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int stopEffect(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopEffect failed.");
            return -1;
        }
        return NativeFunctions.nativeStopEffect(this.mNativeEngine, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopFileRecording(StreamIndex streamIndex) {
        LogUtil.d("RtcEngineImpl", "stopFileRecording");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopFileRecording failed.");
        } else {
            NativeFunctions.nativeStopFileRecording(this.mNativeEngine, streamIndex.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void stopLiveTranscoding(String str) {
        LogUtil.d("RtcEngineImpl", "disableLiveTranscoding...");
        this.mEnableTranscode = false;
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, disableLiveTranscoding failed.");
        } else {
            NativeFunctions.nativeStopLiveTranscoding(this.mNativeEngine, str);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int stopPlayPublicStream(String str) {
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopPlayPublicStream failed.");
            return -1;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startPlayPublicStream...public stream id: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        return NativeFunctions.nativeStopPlayPublicStream(this.mNativeEngine, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int stopPushPublicStream(String str) {
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, stopPushPublicStream failed.");
            return -1;
        }
        PublicStreaming publicStreaming = this.mPublicStreaming;
        if (publicStreaming == null) {
            LogUtil.e("RtcEngineImpl", "stopPushPublicStream failed for publicStreaming is null.");
            return -1;
        }
        publicStreaming.setAction("stopped");
        return NativeFunctions.nativeStopPushPublicStream(this.mNativeEngine, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int switchCamera(CameraId cameraId) {
        LogUtil.d("RtcEngineImpl", "switchCamera");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, switchCamera failed.");
            return -1;
        }
        NativeFunctions.nativeSwitchCamera(this.mNativeEngine, cameraId.value());
        this.mIsFront = !this.mIsFront;
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int unloadEffect(int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, unloadEffect failed.");
            return -1;
        }
        return NativeFunctions.nativeUnloadEffect(this.mNativeEngine, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int unpublishScreen(MediaStreamType mediaStreamType) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, publishScreen failed.");
            return -1;
        }
        return NativeFunctions.nativeUnpublishScreenWithMediaStreamType(this.mNativeEngine, mediaStreamType.value);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int unpublishStream(MediaStreamType mediaStreamType) {
        LogUtil.d("RtcEngineImpl", "unpublishStream");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, unpublishStream failed.");
            return -1;
        }
        NativeFunctions.nativeUnpublishStream(this.mNativeEngine, mediaStreamType.value);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void updateCloudRendering(String str) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, updateCloudRendering failed.");
            return;
        }
        String cloudRenderingInfo = getCloudRenderingInfo("changed", str);
        if (cloudRenderingInfo == null) {
            return;
        }
        NativeFunctions.nativeUpdateCloudRending(this.mNativeEngine, cloudRenderingInfo);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int updateForwardStreamToRooms(List<ForwardStreamInfo> list) {
        if (this.mNativeEngine == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, updateForwardStreamToRooms failed.");
            return -1;
        }
        if (list == null) {
            return -1;
        }
        LinkedList linkedList = new LinkedList();
        Iterator<ForwardStreamInfo> it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(new InternalForwardStreamInfo(it.next()));
        }
        return NativeFunctions.nativeUpdateForwardStreamToRooms(this.mNativeEngine, linkedList);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void updateLoginToken(String str) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
        } else {
            NativeFunctions.nativeUpdateLoginToken(this.mNativeEngine, str);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void updateScreenCapture(ScreenMediaType screenMediaType) {
        LogUtil.d("RtcEngineImpl", "UpdateScreenCapture");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, StopScreenAudioCapture failed.");
        } else {
            NativeFunctions.nativeUpdateScreenCapture(this.mNativeEngine, screenMediaType.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int updateScreenSharingParameters(ScreenSharingParameters screenSharingParameters) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, updateScreenSharingParameters failed.");
            return -1;
        }
        return NativeFunctions.nativeUpdateScreenSharingParameters(this.mNativeEngine, new InternalScreenSharingParams(screenSharingParameters));
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int updateToken(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateToken: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, updateToken failed.");
            return -1;
        }
        NativeFunctions.nativeUpdateToken(this.mNativeEngine, str);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoResolutions failed.");
            return -1;
        }
        return setVideoEncoderConfig(new VideoEncoderConfig[]{videoEncoderConfig});
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEncoderConfig(List<VideoStreamDescription> list) {
        return setVideoEncoderConfig(list, VideoEncoderConfiguration.OrientationMode.ORIENTATION_MODE_ADAPTIVE);
    }

    private JSONObject AddParameters(JSONObject jSONObject, Context context) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String path = C16880lQ.LLIIJLIL(context).getPath();
        if (path == null || path.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/data/data/");
            LIZ.append(context.getPackageName());
            LIZ.append("/files");
            path = X1D.LIZIZ(LIZ);
        }
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(path);
            LIZ2.append("/rtc_log");
            jSONObject.put("rtc.log_location", X1D.LIZIZ(LIZ2));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public static String getCloudRenderingInfo(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
            jSONObject.put("externalService", "render");
            jSONObject.put("renderMeta", str2);
            return jSONObject.toString();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getCloudRenderingInfo catch exception , e : ");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineImpl", X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public static /* synthetic */ void lambda$pushExternalVideoFrame$5(VideoFrame videoFrame, CountDownLatch countDownLatch) {
        videoFrame.release();
        countDownLatch.countDown();
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int checkVideoEffectLicense(Context context, String str) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, checkVideoEffectLicense failed.");
            return -1;
        }
        return NativeFunctions.nativeCheckVideoEffectLicense(context, this.mNativeEngine, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableAudioFrameCallback failed.");
        } else {
            NativeFunctions.nativeEnableAudioFrameCallback(this.mNativeEngine, audioFrameCallbackMethod.value(), audioFormat.sampleRate.value(), audioFormat.channel.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableAudioProcessor failed.");
        } else {
            NativeFunctions.nativeEnableAudioProcessor(this.mNativeEngine, audioProcessorMethod.value(), audioFormat.sampleRate.value(), audioFormat.channel.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void enableAutoSubscribe(SubscribeMode subscribeMode, SubscribeMode subscribeMode2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableAutoSubscribe: audio:");
        LIZ.append(subscribeMode);
        LIZ.append(", video: ");
        LIZ.append(subscribeMode2);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableAutoSubscribe failed.");
        } else {
            NativeFunctions.nativeEnableAutoSubscribe(this.mNativeEngine, subscribeMode.value(), subscribeMode2.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void enableExternalAudioDevice(AudioFormat audioFormat, AudioFormat audioFormat2) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableExternalAudioDevice failed.");
            return;
        }
        AudioSampleRate audioSampleRate = audioFormat.sampleRate;
        if (audioSampleRate == null || audioFormat.channel == null || audioFormat2.sampleRate == null || audioFormat2.channel == null) {
            LogUtil.e("RtcEngineImpl", "parameter is invalid, EnableExternalAudioDevice failed.");
        } else {
            NativeFunctions.nativeEnableExternalAudioDevice(this.mNativeEngine, audioSampleRate.value(), audioFormat.channel.value(), audioFormat2.sampleRate.value(), audioFormat2.channel.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int feedback(List<ProblemFeedbackOption> list, ProblemFeedbackInfo problemFeedbackInfo) {
        if (!mLibraryLoaded) {
            loadSoFile();
        }
        long j = 0;
        for (int i = 0; i < list.size(); i++) {
            j |= ((ProblemFeedbackOption) ListProtector.get(list, i)).value;
        }
        return NativeFunctions.nativeReportFeedback(this.mNativeEngine, j, problemFeedbackInfo);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long login(String str, String str2) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            return -3L;
        }
        return NativeFunctions.nativeLogin(this.mNativeEngine, str, str2);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void muteRemoteAudio(String str, MuteState muteState) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("muteRemoteAudio, uid: ");
        LIZ.append(str);
        LIZ.append(" , muted: ");
        LIZ.append(muteState.value());
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteRemoteAudio failed.");
        } else if (str == null) {
            LogUtil.e("RtcEngineImpl", "muteRemoteAudio, uid is null mute failed.");
        } else {
            NativeFunctions.nativeMuteRemoteAudio(this.mNativeEngine, str, muteState.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int muteRemoteVideo(String str, MuteState muteState) {
        boolean z;
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("muteRemoteVideoStream, uid: ");
        LIZ.append(str);
        LIZ.append(" , muted: ");
        LIZ.append(z);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteRemoteVideo failed.");
            return -1;
        }
        if (str == null) {
            LogUtil.e("RtcEngineImpl", "muteRemoteVideoStream, uid is null mute failed");
            return -2;
        }
        NativeFunctions.nativeMuteRemoteVideo(this.mNativeEngine, str, muteState.value());
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int preloadEffect(int i, String str) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, preloadEffect failed.");
            return -1;
        }
        return NativeFunctions.nativePreloadEffect(this.mNativeEngine, i, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean pushAudioMixingStreamData(byte[] bArr, int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, pushAudioMixingStreamData failed.");
            return false;
        }
        return NativeFunctions.nativePushAudioMixingStreamData(this.mNativeEngine, bArr, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean pushExternalVideoFrame(VideoFrame videoFrame, boolean z) {
        return pushExternalVideoFrame(videoFrame);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int registerFaceDetectionObserver(IFaceDetectionObserver iFaceDetectionObserver, int i) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.registerFaceDetectionObserver(iFaceDetectionObserver, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int registerLocalVideoProcessor(IVideoProcessor iVideoProcessor, VideoPreprocessorConfig videoPreprocessorConfig) {
        VideoPixelFormat videoPixelFormat;
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, registerLocalVideoProcessor failed.");
            return -1;
        }
        if (videoPreprocessorConfig == null) {
            videoPreprocessorConfig = new VideoPreprocessorConfig();
        }
        RTCVideoProcessor rTCVideoProcessor = this.mRtcVideoPreprocessor;
        if (rTCVideoProcessor == null || rTCVideoProcessor.registerLocalVideoProcessor(iVideoProcessor, videoPreprocessorConfig.requiredPixelFormat) != 0) {
            return -1;
        }
        this.mCustomVideoPreprocessor = new WeakReference<>(iVideoProcessor);
        VideoPixelFormat videoPixelFormat2 = videoPreprocessorConfig.requiredPixelFormat;
        if (videoPixelFormat2 != VideoPixelFormat.I420 && videoPixelFormat2 != (videoPixelFormat = VideoPixelFormat.UNKNOWN)) {
            videoPixelFormat2 = videoPixelFormat;
        }
        if (iVideoProcessor == null) {
            return NativeFunctions.nativeRegisterLocalVideoProcessor(this.mNativeEngine, null, videoPixelFormat2.value());
        }
        return NativeFunctions.nativeRegisterLocalVideoProcessor(this.mNativeEngine, this.mRtcVideoPreprocessor, videoPixelFormat2.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int sendStreamSyncInfo(byte[] bArr, StreamSycnInfoConfig streamSycnInfoConfig) {
        if (engineInvalid() || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SendStreamSyncInfo failed.");
            return -1;
        }
        return NativeFunctions.nativeSendStreamSyncInfo(this.mNativeEngine, bArr, streamSycnInfoConfig.streamIndex.value(), streamSycnInfoConfig.repeatCount, 0);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setAudioAlignmentProperty(RemoteStreamKey remoteStreamKey, AudioAlignmentMode audioAlignmentMode) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setAudioAlignmentProperty failed.");
        } else if (remoteStreamKey == null) {
            LogUtil.e("RtcEngineImpl", "setAudioAlignmentProperty: streamKey is null");
        } else {
            NativeFunctions.nativeSetAudioAlignmentProperty(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), audioAlignmentMode.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setBeautyIntensity(EffectBeautyMode effectBeautyMode, float f) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setBeautyIntensity failed.");
            return 1000;
        }
        return NativeFunctions.nativeSetBeautyIntensity(this.mNativeEngine, effectBeautyMode.value(), f);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setCameraExposurePosition(float f, float f2) {
        if (engineInvalid() || this.mState == State.DESTORY) {
            return -1;
        }
        return NativeFunctions.nativeSetCameraExposurePosition(this.mNativeEngine, f, f2);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setCameraFocusPosition(float f, float f2) {
        if (engineInvalid() || this.mState == State.DESTORY) {
            return -1;
        }
        return NativeFunctions.nativeSetCameraFocusPosition(this.mNativeEngine, f, f2);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setCaptureVolume(StreamIndex streamIndex, int i) {
        LogUtil.d("RtcEngineImpl", "setCaptureVolume");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setCaptureVolume failed.");
        } else {
            NativeFunctions.nativeSetCaptureVolume(this.mNativeEngine, i, streamIndex.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setEncryptInfo(int i, String str) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setEncryptInfo failed.");
        } else {
            NativeFunctions.nativeSetEncryptInfo(this.mNativeEngine, i, str);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas) {
        if (videoCanvas == null) {
            videoCanvas = new VideoCanvas();
        }
        NativeFunctions.nativeSetLocalVideoCanvas(this.mNativeEngine, streamIndex.value(), videoCanvas.renderView, videoCanvas.renderMode, videoCanvas.backgroundColor);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setPublicStreamVideoCanvas(String str, VideoCanvas videoCanvas) {
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setPublicStreamVideoCanvas failed.");
            return -1;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startPlayPublicStream...public stream id: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        return NativeFunctions.nativeSetPublicStreamVideoCanvas(this.mNativeEngine, str, videoCanvas.renderView, videoCanvas.renderMode);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setRemoteAudioPlaybackVolume(String str, int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setRemoteAudioPlaybackVolume failed.");
        } else if (str == null) {
            LogUtil.e("RtcEngineImpl", "setRemoteAudioPlaybackVolume: uid is null adjust failed");
        } else {
            NativeFunctions.nativeSetRemoteAudioPlaybackVolume(this.mNativeEngine, str, i);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setRemoteUserPriority(String str, RemoteUserPriority remoteUserPriority) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setRemoteUserPriority: uid: ");
        LIZ.append(str);
        LIZ.append(", priority: ");
        LIZ.append(remoteUserPriority);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setRemoteUserPriority failed.");
            return -1;
        }
        if (str == null) {
            LogUtil.e("RtcEngineImpl", "setRemoteUserPriority: uid is null set failed");
            return -2;
        }
        NativeFunctions.nativeSetRemoteUserPriority(this.mNativeEngine, str, remoteUserPriority.value());
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setRemoteVideoCanvas(RemoteStreamKey remoteStreamKey, VideoCanvas videoCanvas) {
        if (remoteStreamKey == null || remoteStreamKey.hasNullProperty()) {
            LogUtil.i("RtcEngineImpl", "EventType: setupRemoteVideo stream_key has null property");
            return -1;
        }
        if (videoCanvas == null) {
            videoCanvas = new VideoCanvas();
        }
        NativeFunctions.nativeSetRemoteVideoCanvas(this.mNativeEngine, remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoCanvas.renderView, videoCanvas.renderMode, videoCanvas.backgroundColor);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setRemoteVideoConfig(String str, RemoteVideoConfig remoteVideoConfig) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoResolutions failed.");
            return -1;
        }
        NativeFunctions.nativeSetRemoteVideoConfig(this.mNativeEngine, str, remoteVideoConfig.getWidth(), remoteVideoConfig.getHeight(), remoteVideoConfig.getFrameRate());
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setServerParams(String str, String str2) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
        } else {
            NativeFunctions.nativeSetServerParams(this.mNativeEngine, str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setVideoDecoderConfig(RemoteStreamKey remoteStreamKey, VideoDecoderConfig videoDecoderConfig) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, SetVideoDecoderConfig failed.");
        } else {
            NativeFunctions.nativeSetVideoDecoderConfig(this.mNativeEngine, remoteStreamKey.getRoomId(), remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoDecoderConfig.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEffectAlgoModelResourceFinder(long j, long j2) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.setAlgoModelResourceFinder(j, j2);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEncoderConfig(StreamIndex streamIndex, List<VideoStreamDescription> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoResolutions failed.");
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        for (VideoStreamDescription videoStreamDescription : list) {
            if (streamIndex == StreamIndex.STREAM_INDEX_MAIN && !videoStreamDescription.isValid()) {
                LogUtil.e("RtcEngineImpl", "setVideoResolutions with illegal params");
                return -2;
            }
            arrayList.add(new InternalVideoStreamDescription(videoStreamDescription));
        }
        NativeFunctions.nativeSetVideoEncoderConfig(this.mNativeEngine, streamIndex.value(), arrayList);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType) {
        boolean z;
        if (videoSourceType == VideoSourceType.VIDEO_SOURCE_TYPE_EXTERNAL) {
            z = true;
        } else {
            z = false;
        }
        this.mUseExtVideoSource = z;
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoInputType failed.");
        } else {
            NativeFunctions.nativeSetVideoSourceTypeWithStreamId(this.mNativeEngine, streamIndex.value(), videoSourceType.value());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVolumeOfEffect(int i, int i2) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVolumeOfEffect failed.");
            return -1;
        }
        return NativeFunctions.nativeSetVolumeOfEffect(this.mNativeEngine, i, i2);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setupLocalVideoRender(IVideoSink iVideoSink, String str) {
        VideoSinkAdapter videoSinkAdapter;
        if (str == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setupLocalVideoRender, uid is null");
            return -2;
        }
        if (iVideoSink == null) {
            LogUtil.i("RtcEngineImpl", "EventType: setupLocalVideoRender deprecatedVideoSink is null");
            videoSinkAdapter = null;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EventType: setupLocalVideoRender canvas:");
            LIZ.append(iVideoSink.hashCode());
            LogUtil.i("RtcEngineImpl", X1D.LIZIZ(LIZ));
            videoSinkAdapter = new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask);
            iVideoSink.onInitialize();
            iVideoSink.onStart();
        }
        setLocalVideoSink(StreamIndex.STREAM_INDEX_MAIN, videoSinkAdapter, 1);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str) {
        return setupRemoteVideoRender(iVideoSink, this.mRoom, str);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startASR(RTCASRConfig rTCASRConfig, IRTCASREngineEventHandler iRTCASREngineEventHandler) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startASR");
            return;
        }
        if (iRTCASREngineEventHandler == null || rTCASRConfig == null) {
            return;
        }
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
        int value = rTCASRConfig.authorizationType.value();
        String str6 = rTCASRConfig.cluster;
        if (str6 != null) {
            str2 = str6;
        }
        this.mRTCASREngineEventHandler.setAsrEventHandler(iRTCASREngineEventHandler);
        NativeFunctions.nativeStartASR(this.mNativeEngine, this.mRTCASREngineEventHandler, str, str3, str4, str5, value, str2);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int startEchoTest(EchoTestConfig echoTestConfig, int i) {
        LogUtil.d("RtcEngineImpl", "startEchoTest");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startEchoTest failed.");
            return -4;
        }
        return NativeFunctions.nativeStartEchoTest(this.mNativeEngine, echoTestConfig, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int startPushPublicStream(String str, PublicStreaming publicStreaming) {
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startPushPublicStream failed.");
            return -1;
        }
        if (publicStreaming == null) {
            LogUtil.e("RtcEngineImpl", "startPushPublicStream failed for publicStreaming is null.");
            return -1;
        }
        this.mPublicStreaming = publicStreaming;
        publicStreaming.setRoomId(this.mRoom);
        this.mPublicStreaming.setAction("started");
        JSONObject publicStreamMessage = this.mPublicStreaming.getPublicStreamMessage();
        if (publicStreamMessage == null) {
            LogUtil.e("RtcEngineImpl", "public stream parameter is invalid, startPushPublicStream failed.");
            return -1;
        }
        String jSONObject = publicStreamMessage.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("startPushPublicStream...public stream parameter: ");
        LIZ.append(jSONObject);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        return NativeFunctions.nativeStartPushPublicStream(this.mNativeEngine, str, jSONObject);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startScreenCapture(ScreenMediaType screenMediaType, Intent intent) {
        LogUtil.d("RtcEngineImpl", "StartScreenAudioCapture");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, StopScreenAudioCapture failed.");
        } else {
            NativeFunctions.nativeStartScreenCapture(this.mNativeEngine, screenMediaType.value(), intent);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int startScreenSharing(Intent intent, ScreenSharingParameters screenSharingParameters) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startScreenSharing failed.");
            return -1;
        }
        return NativeFunctions.nativeStartScreenSharing(this.mNativeEngine, intent, new InternalScreenSharingParams(screenSharingParameters));
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void subscribeScreen(String str, MediaStreamType mediaStreamType) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("subscribeScreen: ");
        LIZ.append(str);
        LIZ.append(", MediaStreamType:");
        LIZ.append(mediaStreamType);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, subscribeScreen failed.");
        } else {
            NativeFunctions.nativeSubscribeScreenWithMediaStreamType(this.mNativeEngine, str, mediaStreamType.value);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void subscribeStream(String str, SubscribeConfig subscribeConfig) {
        String subscribeConfig2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("subscribeStream: ");
        LIZ.append(str);
        LIZ.append(", info:");
        if (subscribeConfig == null) {
            subscribeConfig2 = "null";
        } else {
            subscribeConfig2 = subscribeConfig.toString();
        }
        LIZ.append(subscribeConfig2);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (subscribeConfig != null) {
            if (engineInvalid()) {
                LogUtil.e("RtcEngineImpl", "native engine is invalid, subscribeStream failed.");
            } else {
                NativeFunctions.nativeSubscribeStream(this.mNativeEngine, str, subscribeConfig.isScreen, subscribeConfig.subVideo, subscribeConfig.subAudio, subscribeConfig.videoIndex, subscribeConfig.svcLayer.getValue(), subscribeConfig.subWidth, subscribeConfig.subHeight, subscribeConfig.subVideoIndex);
            }
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void unSubscribe(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unSubscribe: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, unSubscribe failed.");
        } else {
            NativeFunctions.nativeUnSubscribe(this.mNativeEngine, str, z);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void unsubscribeScreen(String str, MediaStreamType mediaStreamType) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unsubscribeScreen: ");
        LIZ.append(str);
        LIZ.append(", MediaStreamType:");
        LIZ.append(mediaStreamType);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, subscribeStream failed.");
        } else {
            NativeFunctions.nativeUnsubscribeScreenWithMediaStreamType(this.mNativeEngine, str, mediaStreamType.value);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void unsubscribeStream(String str, MediaStreamType mediaStreamType) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unsubscribeStream: ");
        LIZ.append(str);
        LIZ.append(", MediaStreamType:");
        LIZ.append(mediaStreamType);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, subscribeStream failed.");
        } else {
            NativeFunctions.nativeUnsubscribeStreamWithMediaStreamType(this.mNativeEngine, str, mediaStreamType.value);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void updateLiveTranscoding(String str, LiveTranscoding liveTranscoding) {
        LogUtil.d("RtcEngineImpl", "updateLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.d("RtcEngineImpl", "updateLiveTranscoding...mLiveTranscoding is null, no effect, please check.");
            return;
        }
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, updateLiveTranscoding failed.");
            return;
        }
        liveTranscoding.setAction("layoutChanged");
        JSONObject transcodeMessage = liveTranscoding.getTranscodeMessage();
        if (transcodeMessage == null) {
            return;
        }
        String jSONObject = transcodeMessage.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateLiveTranscoding...liveTranscodeJson: ");
        LIZ.append(jSONObject);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        NativeFunctions.nativeUpdateLiveTranscoding(this.mNativeEngine, str, liveTranscoding);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int updatePublicStreamParam(String str, PublicStreaming publicStreaming) {
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, updatePublicStreamParam failed.");
            return -1;
        }
        if (publicStreaming == null) {
            LogUtil.e("RtcEngineImpl", "updatePublicStreamParam failed for publicStreaming is null.");
            return -1;
        }
        this.mPublicStreaming = publicStreaming;
        publicStreaming.setRoomId(this.mRoom);
        this.mPublicStreaming.setAction("layoutChanged");
        JSONObject publicStreamMessage = this.mPublicStreaming.getPublicStreamMessage();
        if (publicStreamMessage == null) {
            LogUtil.e("RtcEngineImpl", "public stream parameter is invalid, updatePublicStreamParam failed.");
            return -1;
        }
        String jSONObject = publicStreamMessage.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updatePublicStreamParam...public stream parameter: ");
        LIZ.append(jSONObject);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        return NativeFunctions.nativeUpdatePublicStreamParam(this.mNativeEngine, str, jSONObject);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setVideoEncoderConfig(List<VideoStreamDescription> list, VideoEncoderConfiguration.OrientationMode orientationMode) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setVideoResolutions failed.");
            return -1;
        }
        RTCData.instance().setOrientationMode(orientationMode);
        setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN, list);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void subscribeStream(String str, MediaStreamType mediaStreamType) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("subscribeStream: ");
        LIZ.append(str);
        LIZ.append(", MediaStreamType:");
        LIZ.append(mediaStreamType);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, subscribeStream failed.");
        } else {
            NativeFunctions.nativeSubscribeStreamWithMediaStreamType(this.mNativeEngine, str, mediaStreamType.value);
        }
    }

    public /* synthetic */ void lambda$new$0(LogUtil.LogLevel logLevel, String str, Throwable th) {
        IRTCEngineEventHandler rtcEngineHandler = getRtcEngineHandler();
        if (rtcEngineHandler != null) {
            try {
                rtcEngineHandler.onLoggerMessage(logLevel, str, th);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public boolean pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i, RTCEncodedVideoFrame rTCEncodedVideoFrame) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, PushExternalEncodedVideoFrame failed.");
            return false;
        }
        return NativeFunctions.nativePushExternalEncodedVideoFrame(this.mNativeEngine, streamIndex.value(), i, rTCEncodedVideoFrame.buffer, rTCEncodedVideoFrame.timestampUs, rTCEncodedVideoFrame.timestampDtsUs, rTCEncodedVideoFrame.width, rTCEncodedVideoFrame.height, rTCEncodedVideoFrame.videoCodecType.value(), rTCEncodedVideoFrame.videoPictureType.value(), rTCEncodedVideoFrame.videoRotation.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, registerMetadataObserver failed.");
            return -1;
        }
        return NativeFunctions.nativeSendSEIMessage(this.mNativeEngine, streamIndex.value(), bArr, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            return -1L;
        }
        if (str == null) {
            LogUtil.e("RtcEngineImpl", "sendBinaryMessage: uid is null send failed");
            return -2L;
        }
        return NativeFunctions.nativeSendUserBinaryMessage(this.mNativeEngine, str, bArr, messageConfig.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendUserBinaryMessageOutsideRoom(String str, byte[] bArr, MessageConfig messageConfig) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            return -1L;
        }
        if (str == null) {
            LogUtil.e("RtcEngineImpl", "sendUserBinaryMessageOutsideRoom: uid is null send failed");
            return -2L;
        }
        return NativeFunctions.nativeSendUserBinaryMessageOutsideRoom(this.mNativeEngine, str, bArr, messageConfig.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendUserMessage(String str, String str2, MessageConfig messageConfig) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendMessage failed.");
            return -1L;
        }
        if (str == null) {
            LogUtil.e("RtcEngineImpl", "sendMessage: uid is null send failed");
            return -2L;
        }
        return NativeFunctions.nativeSendUserMessage(this.mNativeEngine, str, str2, messageConfig.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public long sendUserMessageOutsideRoom(String str, String str2, MessageConfig messageConfig) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendBinaryMessage failed.");
            return -1L;
        }
        if (str == null) {
            LogUtil.e("RtcEngineImpl", "sendUserMessageOutsideRoom: uid is null send failed");
            return -2L;
        }
        return NativeFunctions.nativeSendUserMessageOutsideRoom(this.mNativeEngine, str, str2, messageConfig.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setAudioPlayoutMixStream(boolean z, int i, int i2) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setAudioPlayoutMixStream failed.");
        } else {
            NativeFunctions.nativeSetAudioPlayoutMixStream(this.mNativeEngine, z, i, i2);
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setLocalVideoSink(StreamIndex streamIndex, com.ss.bytertc.engine.video.IVideoSink iVideoSink, int i) {
        VideoSinkAdapter videoSinkAdapter;
        if (streamIndex == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setLocalVideoSink, streamIndex is null");
            return;
        }
        if (iVideoSink != null) {
            videoSinkAdapter = new VideoSinkAdapter(iVideoSink);
        } else {
            videoSinkAdapter = null;
        }
        NativeFunctions.nativeSetLocalVideoSink(this.mNativeEngine, streamIndex.value(), videoSinkAdapter, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setPublicStreamVideoSink(String str, com.ss.bytertc.engine.video.IVideoSink iVideoSink, int i) {
        VideoSinkAdapter videoSinkAdapter;
        if (this.mNativeEngine == -1) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, setPublicStreamVideoSink failed.");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setPublicStreamVideoSink...public stream id: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (iVideoSink != null) {
            videoSinkAdapter = new VideoSinkAdapter(iVideoSink);
        } else {
            videoSinkAdapter = null;
        }
        NativeFunctions.nativeSetPublicStreamVideoSink(this.mNativeEngine, str, videoSinkAdapter, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setRemoteVideoSink(RemoteStreamKey remoteStreamKey, com.ss.bytertc.engine.video.IVideoSink iVideoSink, int i) {
        String str;
        VideoSinkAdapter videoSinkAdapter;
        if (remoteStreamKey == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setupRemoteRenderInternal, streamKey is null");
            return;
        }
        if (remoteStreamKey.getStreamIndex() == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setupRemoteRenderInternal, streamIndex is null");
            return;
        }
        if (remoteStreamKey.getUserId() == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setupRemoteRenderInternal, uid is null");
            return;
        }
        if (remoteStreamKey.getRoomId() == null || remoteStreamKey.getRoomId().isEmpty()) {
            str = this.mRoom;
            if (str == null) {
                str = "";
            }
        } else {
            str = remoteStreamKey.getRoomId();
        }
        if (iVideoSink != null) {
            videoSinkAdapter = new VideoSinkAdapter(iVideoSink);
        } else {
            videoSinkAdapter = null;
        }
        NativeFunctions.nativeSetRemoteVideoSink(this.mNativeEngine, str, remoteStreamKey.getUserId(), remoteStreamKey.getStreamIndex().value(), videoSinkAdapter, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void setVideoWatermark(StreamIndex streamIndex, String str, RTCWatermarkConfig rTCWatermarkConfig) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        long j = this.mNativeEngine;
        if (j == -1 || this.mState == State.DESTORY) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, muteAudioPlayback failed.");
            return;
        }
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
        NativeFunctions.nativeSetVideoWatermark(j, streamIndex.value(), str, rTCWatermarkConfig.visibleInPreview, f, f2, f3, f4, f5, f6, f7, f8);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int setupRemoteVideoRender(IVideoSink iVideoSink, String str, String str2) {
        VideoSinkAdapter videoSinkAdapter;
        if (str2 == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setupRemoteVideoRender, uid is null");
            return -2;
        }
        if (iVideoSink == null) {
            LogUtil.i("RtcEngineImpl", "EventType: setupRemoteVideoRender deprecatedVideoSink is null");
            videoSinkAdapter = null;
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EventType: setupLocalVideoRender canvas:");
            LIZ.append(iVideoSink.hashCode());
            LogUtil.i("RtcEngineImpl", X1D.LIZIZ(LIZ));
            videoSinkAdapter = new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask);
            iVideoSink.onInitialize();
            iVideoSink.onStart();
        }
        setRemoteVideoSink(new RemoteStreamKey(this.mRoom, str2, StreamIndex.STREAM_INDEX_MAIN), videoSinkAdapter, 1);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int startFileRecording(StreamIndex streamIndex, RecordingConfig recordingConfig, RecordingType recordingType) {
        LogUtil.d("RtcEngineImpl", "startFileRecording");
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startFileRecording failed.");
            return -1;
        }
        return NativeFunctions.nativeStartFileRecording(this.mNativeEngine, streamIndex.value(), recordingConfig.dirPath, recordingConfig.recordingFileType.value(), recordingType.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void startLiveTranscoding(String str, LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver) {
        this.mLiveTranscodingObserver = iLiveTranscodingObserver;
        LiveTranscodingObserver liveTranscodingObserver = this.mTranscodingObserver;
        if (liveTranscodingObserver != null) {
            liveTranscodingObserver.setUserObserver(str, iLiveTranscodingObserver);
        }
        LogUtil.d("RtcEngineImpl", "enableLiveTranscoding...");
        if (liveTranscoding == null) {
            LogUtil.d("RtcEngineImpl", "enableLiveTranscoding...liveTranscode is null, no effect, please check.");
            return;
        }
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, enableLiveTranscoding failed.");
            return;
        }
        this.mEnableTranscode = true;
        this.mLiveTranscoding = liveTranscoding;
        liveTranscoding.setAction("started");
        JSONObject transcodeMessage = this.mLiveTranscoding.getTranscodeMessage();
        if (transcodeMessage == null) {
            return;
        }
        String jSONObject = transcodeMessage.toString();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("enableLiveTranscoding...liveTranscodeJson: ");
        LIZ.append(jSONObject);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        NativeFunctions.nativeStartLiveTranscoding(this.mNativeEngine, str, this.mLiveTranscoding, this.mTranscodingObserver);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int updateLocalVideoCanvas(StreamIndex streamIndex, int i, int i2) {
        if (streamIndex == null) {
            LogUtil.e("RtcEngineImpl", "EventType: updateLocalVideoCanvas, StreamIndex has null");
            return -1;
        }
        NativeFunctions.nativeUpdateLocalVideoCanvas(this.mNativeEngine, streamIndex.value(), i, i2);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int updateVideoEffectNode(String str, String str2, float f) {
        RTCVideoEffect rTCVideoEffect = this.mAdvanceVideoEffect;
        if (rTCVideoEffect == null) {
            return -1006;
        }
        return rTCVideoEffect.updateEffectNode(str, str2, f);
    }

    public RTCEngineImpl(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, JSONObject jSONObject) {
        String str2;
        int i;
        String jSONObject2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create RtcEngineImpl with appId: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (mLibraryLoaded && str != null) {
            sRtcEngineInstance = this;
            HandlerThread handlerThread = new HandlerThread("rtc_egl_thread");
            this.mEglThread = handlerThread;
            handlerThread.start();
            VideoSinkTask videoSinkTask = new VideoSinkTask();
            this.mVideoSinkTask = videoSinkTask;
            videoSinkTask.init();
            Handler handler = new Handler(this.mEglThread.getLooper());
            this.mEglHandler = handler;
            ThreadUtils.invokeAtFrontUninterruptibly(handler, new ZVP(1, this));
            this.mRtcVideoPreprocessor = new RTCVideoProcessor();
            Context LLLLL = C16880lQ.LLLLL(context);
            this.mContext = LLLLL;
            mPackageName = LLLLL.getPackageName();
            this.mAppId = str;
            this.mState = State.IDLE;
            this.mRtcEngineHandler = new WeakReference<>(iRTCEngineEventHandler);
            LogUtil.setLoggerSink(this.mLoggerSink);
            this.mEngineEventHandler = new RTCEngineEventHandler(this);
            this.mEngineInternalEventHandler = new RTCEngineInternalEventHandler(this);
            this.mVideoFrameConverter = new VideoFrameConverter();
            this.mScreenFrameConverter = new VideoFrameConverter();
            this.mRtcVideoFrameObserver = new RTCVideoFrameObserver();
            this.mRtcLocalEncodedVideoFrameObserver = new RTCLocalEncodedVideoFrameObserver(this);
            this.mRtcRemoteEncodedVideoFrameObserver = new RTCRemoteEncodedVideoFrameObserver(this);
            this.mRtcMetadataObserver = new RTCMetadataObserver(this);
            this.mTranscodingObserver = new LiveTranscodingObserver();
            this.mRTCASREngineEventHandler = new RTCASREngineEventHandler();
            this.mRtcExVideoEncoderHandler = new RTCExternalVideoEncoderEventHandler(this);
            try {
                Context LLLLL2 = C16880lQ.LLLLL(this.mContext);
                RTCEngineEventHandler rTCEngineEventHandler = this.mEngineEventHandler;
                if (jSONObject == null) {
                    jSONObject2 = "";
                } else {
                    jSONObject2 = jSONObject.toString();
                }
                this.mNativeEngine = NativeFunctions.nativeCreateEngine(LLLLL2, str, rTCEngineEventHandler, jSONObject2);
                if (engineInvalid()) {
                    LogUtil.e("RtcEngineImpl", "create native engine error, native engine is invalid.");
                } else {
                    NativeFunctions.nativeRegisterInternalEventObserver(this.mNativeEngine, this.mEngineInternalEventHandler);
                    this.mAdvanceVideoEffect = new RTCVideoEffect(this.mNativeEngine, false);
                }
                AppMonitor.get(context).register(context, this.appStateCallback);
                return;
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
        if (iRTCEngineEventHandler != null) {
            iRTCEngineEventHandler.onLogReport("live_webrtc_monitor_log", jSONObject3);
            iRTCEngineEventHandler.onError(i);
        }
        LogUtil.e("RtcEngineImpl", str2);
        throw new IllegalStateException("Create engine failed ".concat(str2));
    }

    public static void httpGetAsync(String str, int i, int i2, int i3) {
        if (nativeHttpClient == null) {
            return;
        }
        RtcHttpCallbackImpl rtcHttpCallbackImpl = new RtcHttpCallbackImpl();
        rtcHttpCallbackImpl.setCallbackId(i2);
        rtcHttpCallbackImpl.setClientId(i3);
        nativeHttpClient.GetAsync(str, rtcHttpCallbackImpl, i);
    }

    private int setLocalRenderInternal(IVideoSink iVideoSink, String str, boolean z, boolean z2) {
        if (str == null) {
            LogUtil.e("RtcEngineImpl", "setLocalRenderInternal, uid is null set failed.");
            return -2;
        }
        if (iVideoSink == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EventType: setLocalRenderInternal videoSink is null, ThreadPool  workthreadID");
            LIZ.append(C16880lQ.LLLLIIIILLL().getId());
            LogUtil.i("RtcEngineImpl", X1D.LIZIZ(LIZ));
            return 0;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("EventType: setLocalRenderInternal videoSink:");
        LIZ2.append(iVideoSink.hashCode());
        LIZ2.append(", ThreadPool  workthreadID");
        LIZ2.append(C16880lQ.LLLLIIIILLL().getId());
        LogUtil.i("RtcEngineImpl", X1D.LIZIZ(LIZ2));
        new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int joinRoom(String str, String str2, UserInfo userInfo, ChannelProfile channelProfile) {
        String uid;
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinChannel with token: ");
        LIZ.append(str);
        LIZ.append(" , roomId: ");
        LIZ.append(str2);
        LIZ.append(" and uid: ");
        if (userInfo == null) {
            uid = "";
        } else {
            uid = userInfo.getUid();
        }
        LIZ.append(uid);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (this.mState != State.IDLE) {
            return -4;
        }
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, joinChannel failed.");
            return -3;
        }
        if (userInfo == null) {
            LogUtil.e("RtcEngineImpl", "userInfo is null, joinChannel failed");
            return -2;
        }
        if (userInfo.getUid() == null || userInfo.getUid().isEmpty()) {
            LogUtil.e("RtcEngineImpl", "uid is invalid, joinChannel failed.");
            return -2;
        }
        if (str2 == null || str2.isEmpty()) {
            LogUtil.e("RtcEngineImpl", "channel is invalid, joinChannel failed.");
            return -1;
        }
        if (str == null) {
            return -1;
        }
        this.mState = State.IN_ROOM;
        this.mRoom = str2;
        this.mUser = userInfo.getUid();
        switch (AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$type$ChannelProfile[channelProfile.ordinal()]) {
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
            default:
                i = 0;
                break;
            case 4:
                i = 1;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 7;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 9;
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                i = 10;
                break;
            case 12:
                i = 11;
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                i = 12;
                break;
            case 14:
                i = 13;
                break;
            case 15:
                i = 14;
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                i = 15;
                break;
            case 17:
                i = 16;
                break;
            case 18:
                i = 17;
                break;
            case 19:
                i = 18;
                break;
        }
        return Math.min(NativeFunctions.nativeJoinRoom(this.mNativeEngine, str, str2, userInfo, i), 0);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i, SEICountPerFrame sEICountPerFrame) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, registerMetadataObserver failed.");
            return -1;
        }
        return NativeFunctions.nativeSendMultiSEIMessagePerVideoFrame(this.mNativeEngine, streamIndex.value(), bArr, i, sEICountPerFrame.value());
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int startAudioMixing(String str, boolean z, boolean z2, int i) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, startAudioMixing failed.");
            return -1;
        }
        return NativeFunctions.nativeStartAudioMixing(this.mNativeEngine, str, z, z2, i);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int startNetworkDetection(boolean z, int i, boolean z2, int i2) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, sendCustomMessage failed.");
            return -1;
        }
        return NativeFunctions.nativeStartNetworkProbe(this.mNativeEngine, z, i, z2, i2);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void subscribeUserStream(String str, StreamIndex streamIndex, SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig) {
        boolean z;
        String subscribeVideoConfig2;
        int i;
        if (streamIndex == StreamIndex.STREAM_INDEX_SCREEN) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("subscribeUserStream: ");
        LIZ.append(str);
        LIZ.append(", isScreen: ");
        LIZ.append(z);
        LIZ.append(", mediaType: ");
        LIZ.append(subscribeMediaType);
        LIZ.append(", info: ");
        if (subscribeVideoConfig == null) {
            subscribeVideoConfig2 = "null";
        } else {
            subscribeVideoConfig2 = subscribeVideoConfig.toString();
        }
        LIZ.append(subscribeVideoConfig2);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (subscribeVideoConfig != null) {
            if (engineInvalid()) {
                LogUtil.e("RtcEngineImpl", "native engine is invalid, subscribeStream failed.");
                return;
            }
            int i2 = AnonymousClass1.$SwitchMap$com$ss$bytertc$engine$type$SubscribeMediaType[subscribeMediaType.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            i = 3;
                        }
                    } else {
                        i = 2;
                    }
                } else {
                    i = 1;
                }
                NativeFunctions.nativeSubscribeUserStream(this.mNativeEngine, str, z, i, subscribeVideoConfig.getVideoIndex(), subscribeVideoConfig.getPriority());
            }
            i = 0;
            NativeFunctions.nativeSubscribeUserStream(this.mNativeEngine, str, z, i, subscribeVideoConfig.getVideoIndex(), subscribeVideoConfig.getPriority());
        }
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int joinRoom(String str, String str2, UserInfo userInfo, RTCRoomConfig rTCRoomConfig) {
        String uid;
        if (userInfo == null) {
            LogUtil.e("RtcEngineImpl", "userInfo is null, joinChannel failed");
            return -2;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("joinChannel with token: ");
        LIZ.append(str);
        LIZ.append(" , roomId: ");
        LIZ.append(str2);
        LIZ.append(" and uid: ");
        if (userInfo.getUid() == null) {
            uid = "";
        } else {
            uid = userInfo.getUid();
        }
        LIZ.append(uid);
        LogUtil.d("RtcEngineImpl", X1D.LIZIZ(LIZ));
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, joinChannel failed.");
            return -3;
        }
        if (str == null) {
            return -1;
        }
        this.mState = State.IN_ROOM;
        this.mRoom = str2;
        this.mUser = userInfo.getUid();
        return Math.min(NativeFunctions.nativeJoinRoomWithRoomConfig(this.mNativeEngine, str, str2, userInfo, rTCRoomConfig), 0);
    }

    public static void httpPostAsync(String str, String str2, int i, int i2, int i3) {
        if (nativeHttpClient == null) {
            return;
        }
        RtcHttpCallbackImpl rtcHttpCallbackImpl = new RtcHttpCallbackImpl();
        rtcHttpCallbackImpl.setCallbackId(i2);
        rtcHttpCallbackImpl.setClientId(i3);
        nativeHttpClient.PostAsync(str, str2, rtcHttpCallbackImpl, i);
    }

    private int setupRemoteVideoRenderInternal(IVideoSink iVideoSink, String str, String str2, boolean z, boolean z2) {
        if (str2 == null) {
            LogUtil.e("RtcEngineImpl", "EventType: setupRemoteRenderInternal, uid is null");
            return -2;
        }
        if (iVideoSink == null) {
            LogUtil.i("RtcEngineImpl", "EventType: setupRemoteRenderInternal videoSink is null");
            return 0;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventType: setupRemoteRenderInternal canvas:");
        LIZ.append(iVideoSink.hashCode());
        LogUtil.i("RtcEngineImpl", X1D.LIZIZ(LIZ));
        new VideoSinkAdapter(iVideoSink, this.mVideoSinkTask);
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public int playEffect(int i, String str, boolean z, int i2, int i3) {
        if (engineInvalid()) {
            LogUtil.e("RtcEngineImpl", "native engine is invalid, playEffect failed.");
            return -1;
        }
        return NativeFunctions.nativePlayEffect(this.mNativeEngine, i, str, z, i2, i3);
    }

    @Override // com.ss.bytertc.engine.RTCEngine
    public void updateRemoteStreamVideoCanvas(String str, String str2, StreamIndex streamIndex, int i, int i2) {
        if (str == null || str2 == null || streamIndex == null) {
            LogUtil.e("RtcEngineImpl", "EventType: updateRemoteStreamVideoCanvas, argv has null");
        } else {
            NativeFunctions.nativeUpdateRemoteStreamVideoCanvas(this.mNativeEngine, str, str2, streamIndex.value(), i, i2);
        }
    }
}
