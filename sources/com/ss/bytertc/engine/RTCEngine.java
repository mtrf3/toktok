package com.ss.bytertc.engine;

import X.V0N;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.opengl.EGLContext;
import com.bytedance.realx.video.EglBaseCheckerHelper;
import com.ss.bytertc.engine.IRTCAudioDeviceManagerEx;
import com.ss.bytertc.engine.audio.IAudioMixingManager;
import com.ss.bytertc.engine.data.AudioAlignmentMode;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.AudioProcessorMethod;
import com.ss.bytertc.engine.data.AudioPropertiesConfig;
import com.ss.bytertc.engine.data.AudioRenderType;
import com.ss.bytertc.engine.data.AudioRoute;
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
import com.ss.bytertc.engine.data.RecordingConfig;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.data.SEICountPerFrame;
import com.ss.bytertc.engine.data.ScreenMediaType;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamSycnInfoConfig;
import com.ss.bytertc.engine.data.VideoOrientation;
import com.ss.bytertc.engine.data.VideoRotationMode;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.handler.IExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.IRTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCEngineEventHandler;
import com.ss.bytertc.engine.handler.IRTCEngineInternalEventHandler;
import com.ss.bytertc.engine.handler.RTCEncryptHandler;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderImpl;
import com.ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.IRemoteEncodedVideoFrameObserver;
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
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.RTCEglContextChecker;
import com.ss.bytertc.engine.video.IFaceDetectionObserver;
import com.ss.bytertc.engine.video.IVideoEffect;
import com.ss.bytertc.engine.video.IVideoProcessor;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.RTCWatermarkConfig;
import com.ss.bytertc.engine.video.ScreenSharingParameters;
import com.ss.bytertc.engine.video.VideoDecoderConfig;
import com.ss.bytertc.engine.video.VideoEffectExpressionConfig;
import com.ss.bytertc.engine.video.VideoEncoderConfiguration;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.VideoPreprocessorConfig;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes33.dex */
public abstract class RTCEngine {
    public static RTCEngineImpl mInstance;
    public static RTCEglContextChecker mRtcEglContextChecker;
    public static RTCNativeLibraryLoader mRtcNativeLibraryLoader = new RTCNativeLibraryLoaderImpl();

    public abstract int adjustAudioMixingPlayoutVolume(int i);

    public abstract int adjustAudioMixingPublishVolume(int i);

    public abstract int adjustAudioMixingVolume(int i);

    public abstract int appendVideoEffectNodes(List<String> list);

    public abstract int checkVideoEffectLicense(Context context, String str);

    public abstract void clearVideoWatermark(StreamIndex streamIndex);

    public abstract void disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod);

    public abstract void disableAudioProcessor(AudioProcessorMethod audioProcessorMethod);

    public abstract void disableExternalAudioDevice();

    public abstract void enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat);

    public abstract void enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat);

    public abstract void enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig);

    public abstract void enableAutoSubscribe(SubscribeMode subscribeMode, SubscribeMode subscribeMode2);

    public abstract int enableEffectBeauty(boolean z);

    public abstract void enableExternalAudioDevice(AudioFormat audioFormat, AudioFormat audioFormat2);

    public abstract void enableExternalSoundCard(boolean z);

    public abstract void enablePlaybackDucking(boolean z);

    public abstract int enableSimulcastMode(boolean z);

    public abstract void enableSubscribeLocalStream(boolean z);

    public abstract int enableVideoEffect(boolean z);

    public abstract void enableVocalInstrumentBalance(boolean z);

    public abstract int feedback(List<ProblemFeedbackOption> list, ProblemFeedbackInfo problemFeedbackInfo);

    public abstract int getAudioMixingCurrentPosition();

    public abstract int getAudioMixingDuration();

    public abstract IAudioMixingManager getAudioMixingManager();

    public abstract int getAudioMixingStreamCachedFrameNum();

    public abstract AudioRoute getAudioRoute();

    public abstract float getCameraZoomMaxRatio();

    public abstract int getEffectVolume(int i);

    public abstract void getPeerOnlineStatus(String str);

    public abstract IVideoEffect getVideoEffectInterface();

    public abstract int invokeExperimentalAPI(String str);

    public abstract boolean isCameraExposurePositionSupported();

    public abstract boolean isCameraFocusPositionSupported();

    public abstract boolean isCameraTorchSupported();

    public abstract boolean isCameraZoomSupported();

    public abstract boolean isSpeakerphoneEnabled();

    public abstract int joinRoom(String str, String str2, UserInfo userInfo, RTCRoomConfig rTCRoomConfig);

    public abstract int joinRoom(String str, String str2, UserInfo userInfo, ChannelProfile channelProfile);

    public abstract int leaveRoom();

    public abstract long login(String str, String str2);

    public abstract void logout();

    public abstract void muteAllRemoteAudio(MuteState muteState);

    public abstract int muteAllRemoteVideo(MuteState muteState);

    public abstract void muteAudioPlayback(MuteState muteState);

    public abstract void muteLocalAudio(MuteState muteState);

    public abstract void muteLocalVideo(MuteState muteState);

    public abstract void muteRemoteAudio(String str, MuteState muteState);

    public abstract int muteRemoteVideo(String str, MuteState muteState);

    public abstract int pauseAllEffects();

    public abstract void pauseAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType);

    public abstract int pauseAudioMixing();

    public abstract int pauseEffect(int i);

    public abstract void pauseForwardStreamToAllRooms();

    public abstract int playEffect(int i, String str, boolean z, int i2, int i3);

    public abstract int preloadEffect(int i, String str);

    public abstract int publish();

    public abstract int publishScreen();

    public abstract int publishScreen(MediaStreamType mediaStreamType);

    public abstract int publishStream(MediaStreamType mediaStreamType);

    public abstract int pullExternalAudioFrame(AudioFrame audioFrame);

    public abstract boolean pushAudioMixingStreamData(byte[] bArr, int i);

    public abstract int pushExternalAudioFrame(AudioFrame audioFrame);

    public abstract boolean pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i, RTCEncodedVideoFrame rTCEncodedVideoFrame);

    public abstract boolean pushExternalVideoFrame(VideoFrame videoFrame);

    public abstract boolean pushExternalVideoFrame(VideoFrame videoFrame, boolean z);

    public abstract int pushScreenAudioFrame(AudioFrame audioFrame);

    public abstract boolean pushScreenFrame(VideoFrame videoFrame);

    public abstract int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    public abstract int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor);

    public abstract int registerFaceDetectionObserver(IFaceDetectionObserver iFaceDetectionObserver, int i);

    public abstract void registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver);

    public abstract int registerLocalVideoProcessor(IVideoProcessor iVideoProcessor, VideoPreprocessorConfig videoPreprocessorConfig);

    public abstract void registerMetadataObserver(IMetadataObserver iMetadataObserver);

    public abstract void registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver);

    public abstract int removeVideoEffectNodes(List<String> list);

    public abstract int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel);

    public abstract void requestRemoteVideoKeyFrame(RemoteStreamKey remoteStreamKey);

    public abstract int resumeAllEffects();

    public abstract void resumeAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType);

    public abstract int resumeAudioMixing();

    public abstract int resumeEffect(int i);

    public abstract void resumeForwardStreamToAllRooms();

    public abstract long sendRoomBinaryMessage(byte[] bArr);

    public abstract long sendRoomMessage(String str);

    public abstract int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i);

    public abstract int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i, SEICountPerFrame sEICountPerFrame);

    public abstract long sendServerBinaryMessage(byte[] bArr);

    public abstract long sendServerMessage(String str);

    public abstract int sendStreamSyncInfo(byte[] bArr, StreamSycnInfoConfig streamSycnInfoConfig);

    public abstract long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig);

    public abstract long sendUserBinaryMessageOutsideRoom(String str, byte[] bArr, MessageConfig messageConfig);

    public abstract long sendUserMessage(String str, String str2, MessageConfig messageConfig);

    public abstract long sendUserMessageOutsideRoom(String str, String str2, MessageConfig messageConfig);

    public abstract void setAudioAlignmentProperty(RemoteStreamKey remoteStreamKey, AudioAlignmentMode audioAlignmentMode);

    public abstract int setAudioMixingPosition(int i);

    public abstract int setAudioPlaybackDevice(AudioPlaybackDevice audioPlaybackDevice);

    public abstract void setAudioPlayoutMixStream(boolean z, int i, int i2);

    public abstract void setAudioProfile(AudioProfileType audioProfileType);

    public abstract int setAudioRenderType(AudioRenderType audioRenderType);

    public abstract int setAudioRoute(AudioRoute audioRoute);

    public abstract void setAudioScenario(AudioScenarioType audioScenarioType);

    public abstract int setAudioSourceType(AudioSourceType audioSourceType);

    public abstract void setAudioVolumeIndicationInterval(int i);

    public abstract int setBeautyIntensity(EffectBeautyMode effectBeautyMode, float f);

    public abstract int setBusinessId(String str);

    public abstract int setCameraExposureCompensation(float f);

    public abstract int setCameraExposurePosition(float f, float f2);

    public abstract int setCameraFocusPosition(float f, float f2);

    public abstract int setCameraTorch(TorchState torchState);

    public abstract int setCameraZoomRatio(float f);

    public abstract void setCaptureVolume(StreamIndex streamIndex, int i);

    public abstract void setCustomizeEncryptHandler(RTCEncryptHandler rTCEncryptHandler);

    public abstract int setDefaultAudioRoute(AudioRoute audioRoute);

    public abstract int setDummyCaptureImagePath(String str);

    public abstract void setEarMonitorMode(EarMonitorMode earMonitorMode);

    public abstract void setEarMonitorVolume(int i);

    public abstract int setEffectsVolume(int i);

    public abstract void setEncryptInfo(int i, String str);

    public abstract void setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler);

    public abstract void setInternalEventHandler(IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler);

    public abstract int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas);

    public abstract int setLocalVideoMirrorMode(MirrorMode mirrorMode);

    public abstract int setLocalVideoMirrorType(MirrorType mirrorType);

    public abstract void setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i);

    public abstract void setLocalVoicePitch(int i);

    public abstract int setMultiDeviceAVSync(String str);

    public abstract void setOnDestroyCompletedCallback(Runnable runnable);

    public abstract void setPlaybackVolume(int i);

    public abstract int setPublicStreamVideoCanvas(String str, VideoCanvas videoCanvas);

    public abstract void setPublicStreamVideoSink(String str, IVideoSink iVideoSink, int i);

    public abstract int setPublishFallbackOption(PublishFallbackOption publishFallbackOption);

    public abstract void setRecordingVolume(int i);

    public abstract void setRemoteAudioPlaybackVolume(String str, int i);

    public abstract int setRemoteUserPriority(String str, RemoteUserPriority remoteUserPriority);

    public abstract int setRemoteVideoCanvas(RemoteStreamKey remoteStreamKey, VideoCanvas videoCanvas);

    public abstract int setRemoteVideoConfig(String str, RemoteVideoConfig remoteVideoConfig);

    public abstract void setRemoteVideoSink(RemoteStreamKey remoteStreamKey, IVideoSink iVideoSink, int i);

    public abstract void setRtcEngineEventHandler(IRTCEngineEventHandler iRTCEngineEventHandler);

    public abstract void setRuntimeParameters(JSONObject jSONObject);

    public abstract void setScreenAudioSourceType(AudioSourceType audioSourceType);

    public abstract void setScreenAudioStreamIndex(StreamIndex streamIndex);

    public abstract int setScreenVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig);

    public abstract void setServerParams(String str, String str2);

    public abstract int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions);

    public abstract int setUserRole(ClientRole clientRole);

    public abstract int setUserVisibility(boolean z);

    public abstract int setVideoCaptureConfig(com.ss.bytertc.engine.video.VideoCaptureConfig videoCaptureConfig);

    public abstract void setVideoDecoderConfig(RemoteStreamKey remoteStreamKey, VideoDecoderConfig videoDecoderConfig);

    public abstract void setVideoEffectAlgoModelPath(String str);

    public abstract int setVideoEffectAlgoModelResourceFinder(long j, long j2);

    public abstract int setVideoEffectColorFilter(String str);

    public abstract int setVideoEffectColorFilterIntensity(float f);

    public abstract int setVideoEffectExpressionDetect(VideoEffectExpressionConfig videoEffectExpressionConfig);

    public abstract int setVideoEffectNodes(List<String> list);

    public abstract int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig);

    public abstract int setVideoEncoderConfig(StreamIndex streamIndex, List<VideoStreamDescription> list);

    public abstract int setVideoEncoderConfig(List<VideoStreamDescription> list);

    public abstract int setVideoEncoderConfig(List<VideoStreamDescription> list, VideoEncoderConfiguration.OrientationMode orientationMode);

    public abstract int setVideoEncoderConfig(VideoEncoderConfig[] videoEncoderConfigArr);

    public abstract void setVideoInputType(MediaInputType mediaInputType);

    public abstract void setVideoOrientation(VideoOrientation videoOrientation);

    public abstract int setVideoRotationMode(VideoRotationMode videoRotationMode);

    public abstract void setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType);

    public abstract void setVideoSourceType(VideoSourceType videoSourceType);

    public abstract void setVideoWatermark(StreamIndex streamIndex, String str, RTCWatermarkConfig rTCWatermarkConfig);

    public abstract void setVoiceChangerType(VoiceChangerType voiceChangerType);

    public abstract void setVoiceReverbType(VoiceReverbType voiceReverbType);

    public abstract int setVolumeOfEffect(int i, int i2);

    public abstract int setupLocalVideoRender(com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink, String str);

    public abstract int setupRemoteVideoRender(com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink, String str);

    public abstract int setupRemoteVideoRender(com.ss.bytertc.engine.mediaio.IVideoSink iVideoSink, String str, String str2);

    public abstract void startASR(RTCASRConfig rTCASRConfig, IRTCASREngineEventHandler iRTCASREngineEventHandler);

    public abstract void startAudioCapture();

    public abstract int startAudioMixing(String str, boolean z, boolean z2, int i);

    public abstract void startCloudProxy(List<CloudProxyInfo> list);

    public abstract void startCloudRendering(String str);

    public abstract int startEchoTest(EchoTestConfig echoTestConfig, int i);

    public abstract int startFileRecording(StreamIndex streamIndex, RecordingConfig recordingConfig, RecordingType recordingType);

    public abstract int startForwardStreamToRooms(List<ForwardStreamInfo> list);

    public abstract void startLiveTranscoding(String str, LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver);

    public abstract int startNetworkDetection(boolean z, int i, boolean z2, int i2);

    public abstract int startPlayPublicStream(String str);

    public abstract int startPushPublicStream(String str, PublicStreaming publicStreaming);

    public abstract void startScreenAudioCapture();

    public abstract void startScreenCapture(ScreenMediaType screenMediaType, Intent intent);

    public abstract int startScreenSharing(Intent intent, ScreenSharingParameters screenSharingParameters);

    public abstract int startScreenVideoCapture(Intent intent);

    public abstract void startVideoCapture();

    public abstract void stopASR();

    public abstract int stopAllEffects();

    public abstract void stopAudioCapture();

    public abstract int stopAudioMixing();

    public abstract void stopCloudProxy();

    public abstract void stopCloudRendering();

    public abstract int stopEchoTest();

    public abstract int stopEffect(int i);

    public abstract void stopFileRecording(StreamIndex streamIndex);

    public abstract void stopForwardStreamToRooms();

    public abstract void stopLiveTranscoding(String str);

    public abstract void stopNetworkDetection();

    public abstract int stopPlayPublicStream(String str);

    public abstract int stopPushPublicStream(String str);

    public abstract void stopScreenAudioCapture();

    public abstract void stopScreenCapture();

    public abstract int stopScreenSharing();

    public abstract int stopScreenVideoCapture();

    public abstract void stopVideoCapture();

    public abstract void subscribeScreen(String str, MediaStreamType mediaStreamType);

    public abstract void subscribeStream(String str, SubscribeConfig subscribeConfig);

    public abstract void subscribeStream(String str, MediaStreamType mediaStreamType);

    public abstract void subscribeUserStream(String str, StreamIndex streamIndex, SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig);

    public abstract int switchCamera(CameraId cameraId);

    public abstract void unSubscribe(String str, boolean z);

    public abstract int unloadAllEffects();

    public abstract int unloadEffect(int i);

    public abstract int unpublish();

    public abstract int unpublishScreen();

    public abstract int unpublishScreen(MediaStreamType mediaStreamType);

    public abstract int unpublishStream(MediaStreamType mediaStreamType);

    public abstract void unsubscribeScreen(String str, MediaStreamType mediaStreamType);

    public abstract void unsubscribeStream(String str, MediaStreamType mediaStreamType);

    public abstract void updateCloudRendering(String str);

    public abstract int updateForwardStreamToRooms(List<ForwardStreamInfo> list);

    public abstract void updateLiveTranscoding(String str, LiveTranscoding liveTranscoding);

    public abstract int updateLocalVideoCanvas(StreamIndex streamIndex, int i, int i2);

    public abstract void updateLoginToken(String str);

    public abstract int updatePublicStreamParam(String str, PublicStreaming publicStreaming);

    public abstract void updateRemoteStreamVideoCanvas(String str, String str2, StreamIndex streamIndex, int i, int i2);

    public abstract void updateScreenCapture(ScreenMediaType screenMediaType);

    public abstract int updateScreenSharingParameters(ScreenSharingParameters screenSharingParameters);

    public abstract int updateToken(String str);

    public abstract int updateVideoEffectNode(String str, String str2, float f);

    public static synchronized void destroy() {
        synchronized (RTCEngine.class) {
            RTCEngineImpl rTCEngineImpl = mInstance;
            if (rTCEngineImpl != null) {
                rTCEngineImpl.doDestroy();
                mInstance = null;
                mRtcNativeLibraryLoader = null;
                mRtcEglContextChecker = null;
                System.gc();
            }
        }
    }

    public static String getSdkVersion() {
        return RTCEngineImpl.getSdkVersion();
    }

    /* loaded from: classes33.dex */
    public enum Env {
        ENV_PRODUCT,
        ENV_BOE,
        ENV_TEST;

        public static Env valueOf(String str) {
            return (Env) V0N.LJJJ(Env.class, str);
        }
    }

    public static synchronized IRTCAudioDeviceManagerEx createAudioDeviceManager(IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler iRTCAudioDeviceEventHandler) {
        IRTCAudioDeviceManagerEx createAudioDeviceManager;
        synchronized (RTCEngine.class) {
            createAudioDeviceManager = RTCEngineImpl.createAudioDeviceManager(iRTCAudioDeviceEventHandler);
        }
        return createAudioDeviceManager;
    }

    public static synchronized void destroyEngine(RTCEngine rTCEngine) {
        synchronized (RTCEngine.class) {
            if (rTCEngine != null) {
                if (rTCEngine == mInstance) {
                    destroy();
                } else {
                    ((RTCEngineImpl) rTCEngine).doDestroy();
                    System.gc();
                }
            }
        }
    }

    public static String getErrorDescription(int i) {
        return RTCEngineImpl.getErrorDescription(i);
    }

    public static int setDeviceId(String str) {
        return RTCEngineImpl.setDeviceId(str);
    }

    public static int setEnv(Env env) {
        return RTCEngineImpl.setEnv(env);
    }

    public static void setHttpClient(RTCHttpClient rTCHttpClient) {
        RTCEngineImpl.setRtcHttpClient(rTCHttpClient);
    }

    public static int setParameters(String str) {
        return RTCEngineImpl.setParameters(str);
    }

    public static void setRtcEglContextChecker(RTCEglContextChecker rTCEglContextChecker) {
        if (rTCEglContextChecker != null) {
            mRtcEglContextChecker = rTCEglContextChecker;
            EglBaseCheckerHelper.setEglContextChecker(rTCEglContextChecker);
        }
    }

    public static void setRtcNativeLibraryLoader(RTCNativeLibraryLoader rTCNativeLibraryLoader) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set rtc native library loader");
        LIZ.append(rTCNativeLibraryLoader);
        LogUtil.i("RtcEngine", X1D.LIZIZ(LIZ));
        mRtcNativeLibraryLoader = rTCNativeLibraryLoader;
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            createShared = createShared(context, str, iRTCEngineEventHandler);
        }
        return createShared;
    }

    public static synchronized RTCEngine createShared(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler) {
        synchronized (RTCEngine.class) {
            if (context == null || str == null) {
                return null;
            }
            if (mInstance == null) {
                try {
                    mInstance = new RTCEngineImpl(context, str, iRTCEngineEventHandler, null);
                } catch (IllegalStateException unused) {
                    return null;
                }
            }
            return mInstance;
        }
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Env env) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            RTCEngineImpl.setEnv(env);
            createShared = createShared(context, str, iRTCEngineEventHandler);
        }
        return createShared;
    }

    public static synchronized RTCEngine createEngine(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, JSONObject jSONObject) {
        synchronized (RTCEngine.class) {
            if (context == null || str == null) {
                return null;
            }
            try {
                return new RTCEngineImpl(context, str, iRTCEngineEventHandler, jSONObject);
            } catch (IllegalStateException unused) {
                return null;
            }
        }
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, EGLContext eGLContext) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            createShared = createShared(context, str, iRTCEngineEventHandler);
        }
        return createShared;
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Object obj) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            createShared = createShared(context, str, iRTCEngineEventHandler);
        }
        return createShared;
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, javax.microedition.khronos.egl.EGLContext eGLContext) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            createShared = createShared(context, str, iRTCEngineEventHandler);
        }
        return createShared;
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Env env, EGLContext eGLContext) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            RTCEngineImpl.setEnv(env);
            createShared = createShared(context, str, iRTCEngineEventHandler);
        }
        return createShared;
    }

    public static synchronized RTCEngine createEngine(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Object obj, JSONObject jSONObject) {
        synchronized (RTCEngine.class) {
            if (context == null || str == null) {
                return null;
            }
            try {
                return new RTCEngineImpl(context, str, iRTCEngineEventHandler, jSONObject);
            } catch (IllegalStateException unused) {
                return null;
            }
        }
    }

    public static synchronized RTCEngine create(Context context, String str, IRTCEngineEventHandler iRTCEngineEventHandler, Env env, javax.microedition.khronos.egl.EGLContext eGLContext) {
        RTCEngine createShared;
        synchronized (RTCEngine.class) {
            RTCEngineImpl.setEnv(env);
            createShared = createShared(context, str, iRTCEngineEventHandler);
        }
        return createShared;
    }
}
