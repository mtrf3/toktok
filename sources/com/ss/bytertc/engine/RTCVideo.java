package com.ss.bytertc.engine;

import X.X1D;
import android.content.Context;
import android.content.Intent;
import com.bytedance.realx.video.EglBaseCheckerHelper;
import com.ss.bytertc.engine.IRTCAudioDeviceManagerEx;
import com.ss.bytertc.engine.RTCEngine;
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
import com.ss.bytertc.engine.data.RTCLogConfig;
import com.ss.bytertc.engine.data.RecordingConfig;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.SEICountPerFrame;
import com.ss.bytertc.engine.data.ScreenMediaType;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamSycnInfoConfig;
import com.ss.bytertc.engine.data.VideoDenoiseMode;
import com.ss.bytertc.engine.data.VideoOrientation;
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
import com.ss.bytertc.engine.handler.RTCEncryptHandler;
import com.ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.ss.bytertc.engine.live.IChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.ILiveTranscodingObserver;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.IPushSingleStreamToCDNObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.PushSingleStreamParam;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoader;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderImpl;
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
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.utils.RTCEglContextChecker;
import com.ss.bytertc.engine.video.IFaceDetectionObserver;
import com.ss.bytertc.engine.video.ISnapshotResultCallback;
import com.ss.bytertc.engine.video.IVideoEffect;
import com.ss.bytertc.engine.video.IVideoProcessor;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.RTCWatermarkConfig;
import com.ss.bytertc.engine.video.VideoDecoderConfig;
import com.ss.bytertc.engine.video.VideoEffectExpressionConfig;
import com.ss.bytertc.engine.video.VideoEncoderConfiguration;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.VideoPreprocessorConfig;
import com.ss.bytertc.ktv.IKTVManager;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes33.dex */
public abstract class RTCVideo {
    public static RTCVideoImpl mInstance;
    public static RTCEglContextChecker mRtcEglContextChecker;
    public static RTCNativeLibraryLoader mRtcNativeLibraryLoader = new RTCNativeLibraryLoaderImpl();

    public abstract int appendVideoEffectNodes(List<String> list);

    public abstract int checkVideoEffectLicense(Context context, String str);

    public abstract int clearVideoWatermark(StreamIndex streamIndex);

    public abstract RTCRoom createRTCRoom(String str);

    public abstract int disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod);

    public abstract int disableAudioProcessor(AudioProcessorMethod audioProcessorMethod);

    public abstract int enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat);

    public abstract int enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat);

    public abstract int enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig);

    public abstract int enableCameraAutoExposureFaceMode(boolean z);

    public abstract int enableEffectBeauty(boolean z);

    public abstract int enableExternalSoundCard(boolean z);

    public abstract int enableLocalVoiceReverb(boolean z);

    public abstract int enablePlaybackDucking(boolean z);

    public abstract int enableSimulcastMode(boolean z);

    public abstract int enableVideoEffect(boolean z);

    public abstract int enableVocalInstrumentBalance(boolean z);

    public abstract int feedback(List<ProblemFeedbackOption> list, ProblemFeedbackInfo problemFeedbackInfo);

    public abstract IRTCAudioDeviceManager getAudioDeviceManager();

    public abstract IAudioEffectPlayer getAudioEffectPlayer();

    public abstract IAudioMixingManager getAudioMixingManager();

    public abstract AudioRoute getAudioRoute();

    public abstract float getCameraZoomMaxRatio();

    public abstract IKTVManager getKTVManager();

    public abstract IMediaPlayer getMediaPlayer(int i);

    public abstract long getNativeHandle();

    public abstract NetworkTimeInfo getNetworkTimeInfo();

    public abstract int getPeerOnlineStatus(String str);

    public abstract ISingScoringManager getSingScoringManager();

    public abstract IVideoEffect getVideoEffectInterface();

    public abstract int invokeExperimentalAPI(String str);

    public abstract boolean isCameraExposurePositionSupported();

    public abstract boolean isCameraFocusPositionSupported();

    public abstract boolean isCameraTorchSupported();

    public abstract boolean isCameraZoomSupported();

    public abstract int login(String str, String str2);

    public abstract int logout();

    public abstract int muteAudioPlayback(MuteState muteState);

    public abstract int pullExternalAudioFrame(AudioFrame audioFrame);

    public abstract int pushExternalAudioFrame(AudioFrame audioFrame);

    public abstract int pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i, RTCEncodedVideoFrame rTCEncodedVideoFrame);

    public abstract int pushExternalVideoFrame(VideoFrame videoFrame);

    public abstract int pushExternalVideoFrame(VideoFrame videoFrame, boolean z);

    public abstract int pushScreenAudioFrame(AudioFrame audioFrame);

    public abstract int pushScreenVideoFrame(VideoFrame videoFrame);

    public abstract int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver);

    public abstract int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor);

    public abstract int registerFaceDetectionObserver(IFaceDetectionObserver iFaceDetectionObserver, int i);

    public abstract int registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver);

    public abstract int registerLocalVideoProcessor(IVideoProcessor iVideoProcessor, VideoPreprocessorConfig videoPreprocessorConfig);

    public abstract int registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver);

    public abstract int removeVideoEffectNodes(List<String> list);

    public abstract int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel);

    public abstract int requestRemoteVideoKeyFrame(RemoteStreamKey remoteStreamKey);

    public abstract int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i);

    public abstract int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i, SEICountPerFrame sEICountPerFrame);

    public abstract long sendServerBinaryMessage(byte[] bArr);

    public abstract long sendServerMessage(String str);

    public abstract int sendStreamSyncInfo(byte[] bArr, StreamSycnInfoConfig streamSycnInfoConfig);

    public abstract long sendUserBinaryMessageOutsideRoom(String str, byte[] bArr, MessageConfig messageConfig);

    public abstract long sendUserMessageOutsideRoom(String str, String str2, MessageConfig messageConfig);

    public abstract int setAnsMode(AnsMode ansMode);

    public abstract int setAudioAlignmentProperty(RemoteStreamKey remoteStreamKey, AudioAlignmentMode audioAlignmentMode);

    public abstract int setAudioPlaybackDevice(AudioPlaybackDevice audioPlaybackDevice);

    public abstract int setAudioProfile(AudioProfileType audioProfileType);

    public abstract int setAudioRenderType(AudioRenderType audioRenderType);

    public abstract int setAudioRoute(AudioRoute audioRoute);

    public abstract int setAudioScenario(AudioScenarioType audioScenarioType);

    public abstract int setAudioSourceType(AudioSourceType audioSourceType);

    public abstract int setBackgroundSticker(String str, VirtualBackgroundSource virtualBackgroundSource);

    public abstract int setBeautyIntensity(EffectBeautyMode effectBeautyMode, float f);

    public abstract int setBusinessId(String str);

    public abstract int setCameraAdaptiveMinimumFrameRate(int i);

    public abstract int setCameraExposureCompensation(float f);

    public abstract int setCameraExposurePosition(float f, float f2);

    public abstract int setCameraFocusPosition(float f, float f2);

    public abstract int setCameraTorch(TorchState torchState);

    public abstract int setCameraZoomRatio(float f);

    public abstract int setCaptureVolume(StreamIndex streamIndex, int i);

    public abstract int setCellularEnhancement(MediaTypeEnhancementConfig mediaTypeEnhancementConfig);

    public abstract int setCustomizeEncryptHandler(RTCEncryptHandler rTCEncryptHandler);

    public abstract int setDefaultAudioRoute(AudioRoute audioRoute);

    public abstract int setDummyCaptureImagePath(String str);

    public abstract int setEarMonitorMode(EarMonitorMode earMonitorMode);

    public abstract int setEarMonitorVolume(int i);

    public abstract int setEncryptInfo(int i, String str);

    public abstract int setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler);

    public abstract int setInternalEventHandler(IRTCEngineInternalEventHandler iRTCEngineInternalEventHandler);

    public abstract int setLocalProxy(List<LocalProxyConfiguration> list);

    public abstract int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas);

    public abstract int setLocalVideoMirrorType(MirrorType mirrorType);

    public abstract int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i);

    public abstract int setLocalVoiceEqualization(VoiceEqualizationConfig voiceEqualizationConfig);

    public abstract int setLocalVoicePitch(int i);

    public abstract int setLocalVoiceReverbParam(VoiceReverbConfig voiceReverbConfig);

    public abstract int setOnDestroyCompletedCallback(Runnable runnable);

    public abstract int setPlaybackVolume(int i);

    public abstract int setPublicStreamAudioPlaybackVolume(String str, int i);

    public abstract int setPublicStreamVideoCanvas(String str, VideoCanvas videoCanvas);

    public abstract int setPublicStreamVideoSink(String str, IVideoSink iVideoSink, int i);

    public abstract int setPublishFallbackOption(PublishFallbackOption publishFallbackOption);

    public abstract int setRemoteAudioPlaybackVolume(String str, String str2, int i);

    public abstract int setRemoteUserPriority(String str, String str2, RemoteUserPriority remoteUserPriority);

    public abstract int setRemoteVideoCanvas(RemoteStreamKey remoteStreamKey, VideoCanvas videoCanvas);

    public abstract int setRemoteVideoSink(RemoteStreamKey remoteStreamKey, IVideoSink iVideoSink, int i);

    public abstract int setRemoteVideoSuperResolution(RemoteStreamKey remoteStreamKey, VideoSuperResolutionMode videoSuperResolutionMode);

    public abstract int setRtcVideoEventHandler(IRTCVideoEventHandler iRTCVideoEventHandler);

    public abstract int setRuntimeParameters(JSONObject jSONObject);

    public abstract int setScreenAudioSourceType(AudioSourceType audioSourceType);

    public abstract int setScreenAudioStreamIndex(StreamIndex streamIndex);

    public abstract int setScreenVideoEncoderConfig(ScreenVideoEncoderConfig screenVideoEncoderConfig);

    public abstract int setServerParams(String str, String str2);

    public abstract int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions);

    public abstract int setVideoCaptureConfig(com.ss.bytertc.engine.video.VideoCaptureConfig videoCaptureConfig);

    public abstract int setVideoDecoderConfig(RemoteStreamKey remoteStreamKey, VideoDecoderConfig videoDecoderConfig);

    public abstract int setVideoDenoiser(VideoDenoiseMode videoDenoiseMode);

    public abstract int setVideoDigitalZoomConfig(ZoomConfigType zoomConfigType, float f);

    public abstract int setVideoDigitalZoomControl(ZoomDirectionType zoomDirectionType);

    public abstract int setVideoEffectAlgoModelPath(String str);

    public abstract int setVideoEffectAlgoModelResourceFinder(long j, long j2);

    public abstract int setVideoEffectColorFilter(String str);

    public abstract int setVideoEffectColorFilterIntensity(float f);

    public abstract int setVideoEffectExpressionDetect(VideoEffectExpressionConfig videoEffectExpressionConfig);

    public abstract int setVideoEffectNodes(List<String> list);

    public abstract int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig);

    public abstract int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig, JSONObject jSONObject);

    public abstract int setVideoEncoderConfig(StreamIndex streamIndex, List<VideoStreamDescription> list);

    public abstract int setVideoEncoderConfig(List<VideoStreamDescription> list, VideoEncoderConfiguration.OrientationMode orientationMode);

    public abstract int setVideoEncoderConfig(VideoEncoderConfig[] videoEncoderConfigArr);

    public abstract int setVideoOrientation(VideoOrientation videoOrientation);

    public abstract int setVideoRotationMode(VideoRotationMode videoRotationMode);

    public abstract int setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType);

    public abstract int setVideoWatermark(StreamIndex streamIndex, String str, RTCWatermarkConfig rTCWatermarkConfig);

    public abstract int setVoiceChangerType(VoiceChangerType voiceChangerType);

    public abstract int setVoiceReverbType(VoiceReverbType voiceReverbType);

    public abstract int startASR(RTCASRConfig rTCASRConfig, IRTCASREngineEventHandler iRTCASREngineEventHandler);

    public abstract int startAudioCapture();

    public abstract int startAudioRecording(AudioRecordingConfig audioRecordingConfig);

    public abstract int startChorusCacheSync(ChorusCacheSyncConfig chorusCacheSyncConfig, IChorusCacheSyncObserver iChorusCacheSyncObserver);

    public abstract int startCloudProxy(List<CloudProxyInfo> list);

    public abstract int startEchoTest(EchoTestConfig echoTestConfig, int i);

    public abstract int startFileRecording(StreamIndex streamIndex, RecordingConfig recordingConfig, RecordingType recordingType);

    public abstract int startHardwareEchoDetection(String str);

    public abstract int startLiveTranscoding(String str, LiveTranscoding liveTranscoding, ILiveTranscodingObserver iLiveTranscodingObserver);

    public abstract int startNetworkDetection(boolean z, int i, boolean z2, int i2);

    public abstract int startPlayPublicStream(String str);

    public abstract int startPushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig, IMixedStreamObserver iMixedStreamObserver);

    public abstract int startPushPublicStream(String str, PublicStreaming publicStreaming);

    public abstract int startPushSingleStreamToCDN(String str, PushSingleStreamParam pushSingleStreamParam, IPushSingleStreamToCDNObserver iPushSingleStreamToCDNObserver);

    public abstract int startScreenCapture(ScreenMediaType screenMediaType, Intent intent);

    public abstract int startVideoCapture();

    public abstract int startVideoDigitalZoomControl(ZoomDirectionType zoomDirectionType);

    public abstract int stopASR();

    public abstract int stopAudioCapture();

    public abstract int stopAudioRecording();

    public abstract int stopChorusCacheSync();

    public abstract int stopCloudProxy();

    public abstract int stopEchoTest();

    public abstract int stopFileRecording(StreamIndex streamIndex);

    public abstract int stopHardwareEchoDetection();

    public abstract int stopLiveTranscoding(String str);

    public abstract int stopNetworkDetection();

    public abstract int stopPlayPublicStream(String str);

    public abstract int stopPushPublicStream(String str);

    public abstract int stopPushStreamToCDN(String str);

    public abstract int stopScreenCapture();

    public abstract int stopVideoCapture();

    public abstract int stopVideoDigitalZoomControl();

    public abstract int switchCamera(CameraId cameraId);

    public abstract long takeLocalSnapshot(StreamIndex streamIndex, ISnapshotResultCallback iSnapshotResultCallback);

    public abstract long takeRemoteSnapshot(RemoteStreamKey remoteStreamKey, ISnapshotResultCallback iSnapshotResultCallback);

    public abstract int updateLiveTranscoding(String str, LiveTranscoding liveTranscoding);

    public abstract int updateLocalVideoCanvas(StreamIndex streamIndex, int i, int i2);

    public abstract int updateLoginToken(String str);

    public abstract int updatePublicStreamParam(String str, PublicStreaming publicStreaming);

    public abstract int updatePushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig);

    public abstract int updateRemoteStreamVideoCanvas(RemoteStreamKey remoteStreamKey, int i, int i2);

    public abstract int updateScreenCapture(ScreenMediaType screenMediaType);

    public abstract int updateVideoEffectNode(String str, String str2, float f);

    public static synchronized void destroyRTCVideo() {
        synchronized (RTCVideo.class) {
            RTCVideoImpl rTCVideoImpl = mInstance;
            if (rTCVideoImpl != null) {
                rTCVideoImpl.doDestroy();
                mInstance = null;
                mRtcNativeLibraryLoader = null;
                mRtcEglContextChecker = null;
                System.gc();
            }
        }
    }

    public static String getSDKVersion() {
        return RTCEngineImpl.getSdkVersion();
    }

    public static synchronized IRTCAudioDeviceManagerEx createAudioDeviceManager(IRTCAudioDeviceManagerEx.IRTCAudioDeviceEventHandler iRTCAudioDeviceEventHandler) {
        IRTCAudioDeviceManagerEx createAudioDeviceManager;
        synchronized (RTCVideo.class) {
            createAudioDeviceManager = RTCEngineImpl.createAudioDeviceManager(iRTCAudioDeviceEventHandler);
        }
        return createAudioDeviceManager;
    }

    public static String getErrorDescription(int i) {
        return RTCEngineImpl.getErrorDescription(i);
    }

    public static int setDeviceId(String str) {
        return RTCEngineImpl.setDeviceId(str);
    }

    public static int setEnv(RTCEngine.Env env) {
        return RTCEngineImpl.setEnv(env);
    }

    public static int setLogConfig(RTCLogConfig rTCLogConfig) {
        return RTCVideoImpl.setLogConfig(rTCLogConfig);
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
        LogUtil.i("RtcVideo", X1D.LIZIZ(LIZ));
        mRtcNativeLibraryLoader = rTCNativeLibraryLoader;
    }

    public static synchronized RTCVideo createRTCVideo(Context context, String str, IRTCVideoEventHandler iRTCVideoEventHandler, Object obj, JSONObject jSONObject) {
        synchronized (RTCVideo.class) {
            if (context == null || str == null) {
                return null;
            }
            if (mInstance == null) {
                try {
                    mInstance = new RTCVideoImpl(context, str, iRTCVideoEventHandler, obj, jSONObject);
                } catch (IllegalStateException unused) {
                    return null;
                }
            }
            return mInstance;
        }
    }
}
