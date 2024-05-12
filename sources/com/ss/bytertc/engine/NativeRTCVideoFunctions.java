package com.ss.bytertc.engine;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ss.bytertc.engine.data.EchoTestConfig;
import com.ss.bytertc.engine.handler.RTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;
import com.ss.bytertc.engine.handler.RTCEncryptHandler;
import com.ss.bytertc.engine.handler.RTCEngineInternalEventHandler;
import com.ss.bytertc.engine.handler.RTCExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.RTCFaceDetectionObserver;
import com.ss.bytertc.engine.handler.RTCLocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCVideoEventHandler;
import com.ss.bytertc.engine.handler.RTCVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCVideoProcessor;
import com.ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.ss.bytertc.engine.live.ChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.live.LiveTranscodingObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.live.PushMixedStreamToCDNObserver;
import com.ss.bytertc.engine.live.PushSingleStreamToCDNObserver;
import com.ss.bytertc.engine.type.ProblemFeedbackInfo;
import com.ss.bytertc.engine.video.ISnapshotResultCallback;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.VideoFrame;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes33.dex */
public class NativeRTCVideoFunctions {
    public static native int nativeAppendVideoEffectNodes(long j, String[] strArr);

    public static native int nativeApplyStickerEffect(long j, String str);

    public static native int nativeCheckVideoEffectLicense(Context context, long j, String str);

    public static native void nativeClearHardWareEncodeContext();

    public static native int nativeClearVideoWatermark(long j, int i);

    public static native long nativeCreateAudioDeviceManager(RTCAudioDeviceEventHandler rTCAudioDeviceEventHandler);

    public static native long nativeCreateRTCVideo(Context context, String str, RTCVideoEventHandler rTCVideoEventHandler, String str2);

    public static native long nativeCreateRoom(long j, String str);

    public static native void nativeDestroyRTCVideo(long j);

    public static native int nativeDisableAudioFrameCallback(long j, int i);

    public static native int nativeDisableAudioProcessor(long j, int i);

    public static native int nativeDisableFaceDetection(long j);

    public static native int nativeDisableVideoEffect(long j);

    public static native int nativeDisableVirtualBackground(long j);

    public static native int nativeEnableAudioFrameCallback(long j, int i, int i2, int i3);

    public static native int nativeEnableAudioProcessor(long j, int i, int i2, int i3, int i4);

    public static native int nativeEnableAudioPropertiesReport(long j, int i, boolean z, boolean z2, int i2, float f, int i3, boolean z3);

    public static native int nativeEnableCameraAutoExposureFaceMode(long j, boolean z);

    public static native int nativeEnableCameraTorch(long j, boolean z);

    public static native int nativeEnableEffectBeauty(long j, boolean z);

    public static native int nativeEnableExternalSoundCard(long j, boolean z);

    public static native int nativeEnableFaceDetection(long j, RTCFaceDetectionObserver rTCFaceDetectionObserver, int i, String str);

    public static native int nativeEnableLocalVoiceReverb(long j, boolean z);

    public static native int nativeEnablePlaybackDucking(long j, boolean z);

    public static native int nativeEnableSimulcastMode(long j, boolean z);

    public static native int nativeEnableVideoEffect(long j, boolean z);

    public static native int nativeEnableVideoEffect2(long j);

    public static native int nativeEnableVirtualBackground(long j, String str, int i, int i2, String str2);

    public static native int nativeEnableVocalInstrumentBalance(long j, boolean z);

    public static native long nativeGetAudioDeviceManager(long j);

    public static native long nativeGetAudioEffectPlayer(long j);

    public static native long nativeGetAudioMixingManager(long j);

    public static native int nativeGetAudioRoute(long j);

    public static native float nativeGetCameraZoomMaxRatio(long j);

    public static native String nativeGetErrorDescription(int i);

    public static native long nativeGetKTVManager(long j);

    public static native long nativeGetMediaPlayer(long j, int i);

    public static native NetworkTimeInfo nativeGetNetworkTimeInfo(long j);

    public static native int nativeGetPeerOnlineStatus(long j, String str);

    public static native String nativeGetSDKVersion();

    public static native long nativeGetSingScoringManager(long j);

    public static native long nativeGetVideoEffectHandle(long j);

    public static native int nativeInitCVResource(long j, String str, String str2);

    public static native int nativeInvokeExperimentalAPI(long j, String str);

    public static native boolean nativeIsCameraExposurePositionSupported(long j);

    public static native boolean nativeIsCameraFocusPositionSupported(long j);

    public static native boolean nativeIsCameraZoomSupported(long j);

    public static native boolean nativeIsSupportFlashLight(long j);

    public static native int nativeLogin(long j, String str, String str2);

    public static native int nativeLogout(long j);

    public static native int nativeMuteAudioPlayback(long j, int i);

    public static native int nativePullExternalAudioFrame(long j, byte[] bArr, int i, int i2, int i3);

    public static native int nativePushExternalAudioFrame(long j, byte[] bArr, int i, int i2, int i3);

    public static native int nativePushExternalByteRtcVideoFrame(long j, VideoFrame videoFrame);

    public static native int nativePushExternalEncodedVideoFrame(long j, int i, int i2, ByteBuffer byteBuffer, long j2, long j3, int i3, int i4, int i5, int i6, int i7);

    public static native int nativePushExternalWebrtcVideoFrame(long j, com.bytedance.realx.video.VideoFrame videoFrame, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, long j2);

    public static native int nativePushScreenAudioFrame(long j, byte[] bArr, int i, int i2, int i3);

    public static native int nativePushScreenByteRtcFrame(long j, VideoFrame videoFrame);

    public static native int nativePushScreenFrame(long j, com.bytedance.realx.video.VideoFrame videoFrame);

    public static native int nativeRegisterFaceDetectionObserver(long j, RTCFaceDetectionObserver rTCFaceDetectionObserver, int i);

    public static native int nativeRegisterInternalEventObserver(long j, RTCEngineInternalEventHandler rTCEngineInternalEventHandler);

    public static native int nativeRegisterLocalEncodedVideoFrameObserver(long j, RTCLocalEncodedVideoFrameObserver rTCLocalEncodedVideoFrameObserver);

    public static native int nativeRegisterLocalVideoProcessor(long j, RTCVideoProcessor rTCVideoProcessor, int i);

    public static native int nativeRegisterRemoteEncodedVideoFrameObserver(long j, RTCRemoteEncodedVideoFrameObserver rTCRemoteEncodedVideoFrameObserver);

    public static native int nativeRegisterVideoFrameObserver(long j, RTCVideoFrameObserver rTCVideoFrameObserver);

    public static native int nativeRemoveVideoEffectNodes(long j, String[] strArr);

    public static native int nativeReportFeedback(long j, long j2, ProblemFeedbackInfo problemFeedbackInfo);

    public static native int nativeRequestRemoteVideoKeyFrame(long j, String str, String str2, int i);

    public static native int nativeSendMultiSEIMessagePerVideoFrame(long j, int i, byte[] bArr, int i2, int i3);

    public static native int nativeSendSEIMessage(long j, int i, byte[] bArr, int i2);

    public static native long nativeSendServerBinaryMessage(long j, byte[] bArr);

    public static native long nativeSendServerMessage(long j, String str);

    public static native int nativeSendStreamSyncInfo(long j, byte[] bArr, int i, int i2, int i3);

    public static native long nativeSendUserBinaryMessageOutsideRoom(long j, String str, byte[] bArr, int i);

    public static native long nativeSendUserMessageOutsideRoom(long j, String str, String str2, int i);

    public static native int nativeSetAnsMode(long j, int i);

    public static native void nativeSetAppState(long j, String str);

    public static native int nativeSetAudioAlignmentProperty(long j, String str, String str2, int i, int i2);

    public static native int nativeSetAudioFrameObserver(long j, IAudioFrameObserver iAudioFrameObserver);

    public static native int nativeSetAudioFrameProcessor(long j, IAudioFrameProcessor iAudioFrameProcessor);

    public static native int nativeSetAudioPlaybackDevice(long j, int i);

    public static native int nativeSetAudioProfile(long j, int i);

    public static native int nativeSetAudioRenderType(long j, int i);

    public static native int nativeSetAudioRoute(long j, int i);

    public static native int nativeSetAudioScenario(long j, int i);

    public static native int nativeSetAudioSourceType(long j, int i);

    public static native int nativeSetBackgroundSticker(long j, String str, int i, int i2, String str2);

    public static native int nativeSetBeautyIntensity(long j, int i, float f);

    public static native int nativeSetBusinessId(long j, String str);

    public static native int nativeSetCameraAdaptiveMinimumFrameRate(long j, int i);

    public static native int nativeSetCameraExposureCompensation(long j, float f);

    public static native int nativeSetCameraExposurePosition(long j, float f, float f2);

    public static native int nativeSetCameraFocusPosition(long j, float f, float f2);

    public static native int nativeSetCameraZoomRatio(long j, float f);

    public static native int nativeSetCaptureVolume(long j, int i, int i2);

    public static native int nativeSetCellularEnhancement(long j, InternalMediaTypeEnhancementConfig internalMediaTypeEnhancementConfig);

    public static native int nativeSetCustomizeEncryptHandler(long j, RTCEncryptHandler rTCEncryptHandler);

    public static native int nativeSetDefaultAudioRoute(long j, int i);

    public static native int nativeSetDeviceId(String str);

    public static native int nativeSetDummyCaptureImagePath(long j, String str);

    public static native int nativeSetEarMonitorMode(long j, int i);

    public static native int nativeSetEarMonitorVolume(long j, int i);

    public static native void nativeSetEnableSpeakerphoneForTest(long j, boolean z);

    public static native int nativeSetEncryptInfo(long j, int i, String str);

    public static native int nativeSetEnv(int i);

    public static native int nativeSetExternalVideoEncoderEventHandler(long j, RTCExternalVideoEncoderEventHandler rTCExternalVideoEncoderEventHandler);

    public static native boolean nativeSetHardWareEncodeContext();

    public static native int nativeSetLocalProxy(long j, List<InternalLocalProxyConfiguration> list);

    public static native int nativeSetLocalVideoCanvas(long j, int i, View view, int i2, int i3);

    public static native int nativeSetLocalVideoMirrorType(long j, int i);

    public static native int nativeSetLocalVideoSink(long j, int i, IVideoSink iVideoSink, int i2);

    public static native int nativeSetLocalVoiceEqualization(long j, int i, int i2);

    public static native int nativeSetLocalVoicePitch(long j, int i);

    public static native int nativeSetLocalVoiceReverbParam(long j, float f, float f2, float f3, float f4, float f5, float f6);

    public static native int nativeSetLogConfig(int i, String str, int i2, String str2);

    public static native void nativeSetNetworkRequestIntercept(int i);

    public static native int nativeSetParameters(String str);

    public static native int nativeSetPlaybackVolume(long j, int i);

    public static native int nativeSetPublicStreamAudioPlaybackVolume(long j, String str, int i);

    public static native int nativeSetPublicStreamVideoCanvas(long j, String str, View view, int i);

    public static native int nativeSetPublicStreamVideoSink(long j, String str, IVideoSink iVideoSink, int i);

    public static native int nativeSetPublishFallbackOption(long j, int i);

    public static native int nativeSetRemoteAudioPlaybackVolume(long j, String str, String str2, int i);

    public static native int nativeSetRemoteSubscribeFallbackOption(long j, int i);

    public static native int nativeSetRemoteUserPriority(long j, String str, String str2, int i);

    public static native int nativeSetRemoteVideoCanvas(long j, String str, String str2, int i, View view, int i2, int i3);

    public static native int nativeSetRemoteVideoSink(long j, String str, String str2, int i, IVideoSink iVideoSink, int i2);

    public static native int nativeSetRemoteVideoSuperResolution(long j, String str, String str2, int i, int i2);

    public static native int nativeSetRuntimeParameters(long j, String str);

    public static native int nativeSetScreenAudioSourceType(long j, int i);

    public static native int nativeSetScreenAudioStreamIndex(long j, int i);

    public static native int nativeSetScreenVideoEncoderConfig(long j, InternalScreenVideoEncoderConfig internalScreenVideoEncoderConfig);

    public static native int nativeSetServerParams(long j, String str, String str2);

    public static native int nativeSetVideoCaptureConfig(long j, InternalVideoCaptureConfig internalVideoCaptureConfig);

    public static native int nativeSetVideoDecoderConfig(long j, String str, String str2, int i, int i2);

    public static native int nativeSetVideoDenoiser(long j, int i);

    public static native int nativeSetVideoDigitalZoomConfig(long j, int i, float f);

    public static native int nativeSetVideoDigitalZoomControl(long j, int i);

    public static native int nativeSetVideoEffectAlgoModelPath(long j, String str);

    public static native int nativeSetVideoEffectAlgoModelResourceFinder(long j, long j2, long j3);

    public static native int nativeSetVideoEffectColorFilter(long j, String str);

    public static native int nativeSetVideoEffectColorFilterIntensity(long j, float f);

    public static native int nativeSetVideoEffectExpressionDetect(long j, InternalExpressDetectConfig internalExpressDetectConfig);

    public static native int nativeSetVideoEffectNodes(long j, String[] strArr);

    public static native int nativeSetVideoEncoderConfig(long j, int i, List<InternalVideoStreamDescription> list);

    public static native int nativeSetVideoEncoderConfigV2(long j, List<InternalVideoEncoderConfig> list);

    public static native int nativeSetVideoEncoderConfigV3(long j, InternalVideoEncoderConfig internalVideoEncoderConfig, String str);

    public static native int nativeSetVideoOrientation(long j, int i);

    public static native int nativeSetVideoRotationMode(long j, int i);

    public static native int nativeSetVideoSourceTypeWithStreamId(long j, int i, int i2);

    public static native int nativeSetVideoWatermark(long j, int i, String str, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8);

    public static native int nativeSetVoiceChangerType(long j, int i);

    public static native int nativeSetVoiceReverbType(long j, int i);

    public static native int nativeSetupLocalScreenSink(long j, IVideoSink iVideoSink, String str);

    public static native int nativeSetupLocalVideoSink(long j, IVideoSink iVideoSink, String str);

    public static native int nativeStartASR(long j, RTCASREngineEventHandler rTCASREngineEventHandler, String str, String str2, String str3, String str4, int i, String str5);

    public static native int nativeStartAudioCapture(long j);

    public static native int nativeStartAudioCaptureDeviceTestEx(long j, int i);

    public static native int nativeStartAudioPlaybackDeviceTestEx(long j, String str, int i);

    public static native int nativeStartAudioRecording(long j, String str, int i, int i2, int i3, int i4);

    public static native int nativeStartChorusCacheSync(long j, ChorusCacheSyncConfig chorusCacheSyncConfig, ChorusCacheSyncObserver chorusCacheSyncObserver);

    public static native int nativeStartCloudProxy(long j, List<InternalCloudProxyInfo> list);

    public static native int nativeStartEchoTest(long j, EchoTestConfig echoTestConfig, int i);

    public static native int nativeStartFileRecording(long j, int i, String str, int i2, int i3);

    public static native int nativeStartHardwareEchoDetection(long j, String str);

    public static native int nativeStartLiveTranscoding(long j, String str, LiveTranscoding liveTranscoding, LiveTranscodingObserver liveTranscodingObserver);

    public static native int nativeStartNetworkProbe(long j, boolean z, int i, boolean z2, int i2);

    public static native int nativeStartPlayPublicStream(long j, String str);

    public static native int nativeStartPushMixedStreamToCDN(long j, String str, MixedStreamConfig mixedStreamConfig, PushMixedStreamToCDNObserver pushMixedStreamToCDNObserver);

    public static native int nativeStartPushPublicStream(long j, String str, String str2);

    public static native int nativeStartPushSingleStreamToCDN(long j, String str, String str2, String str3, String str4, boolean z, PushSingleStreamToCDNObserver pushSingleStreamToCDNObserver);

    public static native int nativeStartScreenAudioCapture(long j);

    public static native int nativeStartScreenCapture(long j, int i, Intent intent);

    public static native int nativeStartVideoCapture(long j);

    public static native int nativeStartVideoDigitalZoomControl(long j, int i);

    public static native int nativeStopASR(long j);

    public static native int nativeStopAudioCapture(long j);

    public static native int nativeStopAudioCaptureDeviceTestEx(long j);

    public static native int nativeStopAudioPlaybackDeviceTestEx(long j);

    public static native int nativeStopAudioRecording(long j);

    public static native int nativeStopChorusCacheSync(long j);

    public static native int nativeStopCloudProxy(long j);

    public static native int nativeStopEchoTest(long j);

    public static native int nativeStopFileRecording(long j, int i);

    public static native int nativeStopHardwareEchoDetection(long j);

    public static native int nativeStopLiveTranscoding(long j, String str);

    public static native int nativeStopNetworkProbe(long j);

    public static native int nativeStopPlayPublicStream(long j, String str);

    public static native int nativeStopPushPublicStream(long j, String str);

    public static native int nativeStopPushStreamToCDN(long j, String str);

    public static native int nativeStopScreenAudioCapture(long j);

    public static native int nativeStopScreenCapture(long j);

    public static native int nativeStopScreenVideoCapture(long j);

    public static native int nativeStopVideoCapture(long j);

    public static native int nativeStopVideoDigitalZoomControl(long j);

    public static native int nativeSwitchCamera(long j, int i);

    public static native long nativeTakeLocalSnapshot(long j, int i, ISnapshotResultCallback iSnapshotResultCallback);

    public static native long nativeTakeRemoteSnapshot(long j, String str, String str2, int i, ISnapshotResultCallback iSnapshotResultCallback);

    public static native int nativeUpdateLiveTranscoding(long j, String str, LiveTranscoding liveTranscoding);

    public static native int nativeUpdateLocalVideoCanvas(long j, int i, int i2, int i3);

    public static native int nativeUpdateLoginToken(long j, String str);

    public static native int nativeUpdatePublicStreamParam(long j, String str, String str2);

    public static native int nativeUpdatePushMixedStreamToCDN(long j, String str, MixedStreamConfig mixedStreamConfig);

    public static native int nativeUpdateRemoteVideoCanvas(long j, String str, String str2, int i, int i2, int i3);

    public static native int nativeUpdateScreenCapture(long j, int i);

    public static native int nativeUpdateVideoEffectNode(long j, String str, String str2, float f);
}
