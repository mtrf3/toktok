package com.ss.bytertc.engine;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.ss.bytertc.engine.data.EchoTestConfig;
import com.ss.bytertc.engine.handler.RTCASREngineEventHandler;
import com.ss.bytertc.engine.handler.RTCAudioDeviceEventHandler;
import com.ss.bytertc.engine.handler.RTCEncryptHandler;
import com.ss.bytertc.engine.handler.RTCEngineEventHandler;
import com.ss.bytertc.engine.handler.RTCEngineInternalEventHandler;
import com.ss.bytertc.engine.handler.RTCExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.RTCFaceDetectionObserver;
import com.ss.bytertc.engine.handler.RTCLocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCMetadataObserver;
import com.ss.bytertc.engine.handler.RTCRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCVideoFrameObserver;
import com.ss.bytertc.engine.handler.RTCVideoProcessor;
import com.ss.bytertc.engine.live.LiveTranscoding;
import com.ss.bytertc.engine.live.LiveTranscodingObserver;
import com.ss.bytertc.engine.type.ProblemFeedbackInfo;
import com.ss.bytertc.engine.utils.RTCRunnable;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.VideoFrame;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes33.dex */
public final class NativeFunctions {
    public static native int nativeAdjustAudioMixingPlayoutVolume(long j, int i);

    public static native int nativeAdjustAudioMixingPublishVolume(long j, int i);

    public static native int nativeAdjustAudioMixingVolume(long j, int i);

    public static native int nativeAppendVideoEffectNodes(long j, String[] strArr);

    public static native int nativeCheckVideoEffectLicense(Context context, long j, String str);

    public static native void nativeClearHardWareEncodeContext();

    public static native void nativeClearVideoWatermark(long j, int i);

    public static native long nativeCreateAudioDeviceManager(RTCAudioDeviceEventHandler rTCAudioDeviceEventHandler);

    public static native long nativeCreateEngine(Context context, String str, RTCEngineEventHandler rTCEngineEventHandler, String str2);

    public static native void nativeDestroyEngine(long j);

    public static native void nativeDisableAudioFrameCallback(long j, int i);

    public static native void nativeDisableAudioProcessor(long j, int i);

    public static native void nativeDisableExternalAudioDevice(long j);

    public static native int nativeDisableFaceDetection(long j);

    public static native int nativeDisableVideoEffect(long j);

    public static native int nativeDisableVirtualBackground(long j);

    public static native int nativeEenableRescaleAudioVolume(long j, boolean z);

    public static native void nativeEnableAudioFrameCallback(long j, int i, int i2, int i3);

    public static native void nativeEnableAudioProcessor(long j, int i, int i2, int i3);

    public static native void nativeEnableAudioPropertiesReport(long j, int i, boolean z, boolean z2, int i2, float f, int i3, boolean z3);

    public static native int nativeEnableAutoSubscribe(long j, int i, int i2);

    public static native int nativeEnableCameraTorch(long j, boolean z);

    public static native int nativeEnableEffectBeauty(long j, boolean z);

    public static native void nativeEnableExternalAudioDevice(long j, int i, int i2, int i3, int i4);

    public static native void nativeEnableExternalSoundCard(long j, boolean z);

    public static native int nativeEnableFaceDetection(long j, RTCFaceDetectionObserver rTCFaceDetectionObserver, int i, String str);

    public static native void nativeEnablePlaybackDucking(long j, boolean z);

    public static native void nativeEnableSimulcastMode(long j, boolean z);

    public static native int nativeEnableSubscribeLocalStream(long j, boolean z);

    public static native int nativeEnableVideoEffect(long j, boolean z);

    public static native int nativeEnableVideoEffect2(long j);

    public static native int nativeEnableVirtualBackground(long j, String str, int i, int i2, String str2);

    public static native void nativeEnableVocalInstrumentBalance(long j, boolean z);

    public static native int nativeGetAudioMixingCurrentPosition(long j);

    public static native int nativeGetAudioMixingDuration(long j);

    public static native long nativeGetAudioMixingManager(long j);

    public static native int nativeGetAudioMixingStreamCachedFrameNum(long j);

    public static native int nativeGetAudioRoute(long j);

    public static native float nativeGetCameraZoomMaxRatio(long j);

    public static native int nativeGetEffectVolume(long j, int i);

    public static native String nativeGetErrorDescription(int i);

    public static native void nativeGetPeerOnlineStatus(long j, String str);

    public static native String nativeGetSDKVersion();

    public static native int nativeHttpClientCallback(int i, int i2, int i3, String str);

    public static native int nativeInitCVResource(long j, String str, String str2);

    public static native int nativeInvokeExperimentalAPI(long j, String str);

    public static native void nativeInvokeWorkerUninterruptibly(long j, RTCRunnable rTCRunnable);

    public static native boolean nativeIsCameraExposurePositionSupported(long j);

    public static native boolean nativeIsCameraFocusPositionSupported(long j);

    public static native boolean nativeIsCameraZoomSupported(long j);

    public static native boolean nativeIsSupportFlashLight(long j);

    public static native int nativeJoinRoom(long j, String str, String str2, UserInfo userInfo, int i);

    public static native int nativeJoinRoomWithRoomConfig(long j, String str, String str2, UserInfo userInfo, RTCRoomConfig rTCRoomConfig);

    public static native int nativeLeaveRoom(long j);

    public static native long nativeLogin(long j, String str, String str2);

    public static native void nativeLogout(long j);

    public static native void nativeMuteAllRemoteAudio(long j, int i);

    public static native int nativeMuteAllRemoteVideo(long j, int i);

    public static native void nativeMuteAudioPlayback(long j, int i);

    public static native void nativeMuteLocalAudio(long j, int i);

    public static native void nativeMuteLocalVideo(long j, int i);

    public static native void nativeMuteRemoteAudio(long j, String str, int i);

    public static native int nativeMuteRemoteVideo(long j, String str, int i);

    public static native int nativePauseAllEffects(long j);

    public static native void nativePauseAllSubscribedStream(long j, int i);

    public static native int nativePauseAudioMixing(long j);

    public static native int nativePauseEffect(long j, int i);

    public static native int nativePauseForwardStreamToAllRooms(long j);

    public static native int nativePlayEffect(long j, int i, String str, boolean z, int i2, int i3);

    public static native int nativePreloadEffect(long j, int i, String str);

    public static native int nativePublish(long j);

    public static native int nativePublishScreen(long j);

    public static native int nativePublishScreenWithMediaStreamType(long j, int i);

    public static native int nativePublishStream(long j, int i);

    public static native boolean nativePullExternalAudioFrame(long j, byte[] bArr, int i, int i2, int i3);

    public static native boolean nativePushAudioMixingStreamData(long j, byte[] bArr, int i);

    public static native boolean nativePushExternalAudioFrame(long j, byte[] bArr, int i, int i2, int i3);

    public static native boolean nativePushExternalByteRtcVideoFrame(long j, VideoFrame videoFrame);

    public static native boolean nativePushExternalEncodedVideoFrame(long j, int i, int i2, ByteBuffer byteBuffer, long j2, long j3, int i3, int i4, int i5, int i6, int i7);

    public static native boolean nativePushExternalWebrtcVideoFrame(long j, com.bytedance.realx.video.VideoFrame videoFrame, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, long j2);

    public static native int nativePushScreenAudioFrame(long j, byte[] bArr, int i, int i2, int i3);

    public static native boolean nativePushScreenByteRtcFrame(long j, VideoFrame videoFrame);

    public static native boolean nativePushScreenFrame(long j, com.bytedance.realx.video.VideoFrame videoFrame);

    public static native int nativeRegisterFaceDetectionObserver(long j, RTCFaceDetectionObserver rTCFaceDetectionObserver, int i);

    public static native void nativeRegisterInternalEventObserver(long j, RTCEngineInternalEventHandler rTCEngineInternalEventHandler);

    public static native void nativeRegisterLocalEncodedVideoFrameObserver(long j, RTCLocalEncodedVideoFrameObserver rTCLocalEncodedVideoFrameObserver);

    public static native int nativeRegisterLocalVideoProcessor(long j, RTCVideoProcessor rTCVideoProcessor, int i);

    public static native void nativeRegisterRemoteEncodedVideoFrameObserver(long j, RTCRemoteEncodedVideoFrameObserver rTCRemoteEncodedVideoFrameObserver);

    public static native void nativeRegisterVideoFrameObserver(long j, RTCVideoFrameObserver rTCVideoFrameObserver);

    public static native int nativeRemoveVideoEffectNodes(long j, String[] strArr);

    public static native int nativeReportFeedback(long j, long j2, ProblemFeedbackInfo problemFeedbackInfo);

    public static native void nativeRequestRemoteVideoKeyFrame(long j, String str, String str2, int i);

    public static native int nativeResumeAllEffects(long j);

    public static native void nativeResumeAllSubscribedStream(long j, int i);

    public static native int nativeResumeAudioMixing(long j);

    public static native int nativeResumeEffect(long j, int i);

    public static native int nativeResumeForwardStreamToAllRooms(long j);

    public static native int nativeSendMultiSEIMessagePerVideoFrame(long j, int i, byte[] bArr, int i2, int i3);

    public static native int nativeSendRoomBinaryMessage(long j, byte[] bArr);

    public static native int nativeSendRoomMessage(long j, String str);

    public static native int nativeSendSEIMessage(long j, int i, byte[] bArr, int i2);

    public static native long nativeSendServerBinaryMessage(long j, byte[] bArr);

    public static native long nativeSendServerMessage(long j, String str);

    public static native int nativeSendStreamSyncInfo(long j, byte[] bArr, int i, int i2, int i3);

    public static native long nativeSendUserBinaryMessage(long j, String str, byte[] bArr, int i);

    public static native long nativeSendUserBinaryMessageOutsideRoom(long j, String str, byte[] bArr, int i);

    public static native long nativeSendUserMessage(long j, String str, String str2, int i);

    public static native long nativeSendUserMessageOutsideRoom(long j, String str, String str2, int i);

    public static native void nativeSetAppState(long j, String str);

    public static native void nativeSetAudioAlignmentProperty(long j, String str, String str2, int i, int i2);

    public static native void nativeSetAudioFrameObserver(long j, IAudioFrameObserver iAudioFrameObserver);

    public static native void nativeSetAudioFrameProcessor(long j, IAudioFrameProcessor iAudioFrameProcessor);

    public static native int nativeSetAudioMixingPosition(long j, int i);

    public static native int nativeSetAudioPlaybackDevice(long j, int i);

    public static native void nativeSetAudioPlayoutMixStream(long j, boolean z, int i, int i2);

    public static native void nativeSetAudioProfile(long j, int i);

    public static native int nativeSetAudioRenderType(long j, int i);

    public static native int nativeSetAudioRoute(long j, int i);

    public static native void nativeSetAudioScenario(long j, int i);

    public static native int nativeSetAudioSourceType(long j, int i);

    public static native void nativeSetAudioVolumeIndicationInterval(long j, int i);

    public static native int nativeSetBeautyIntensity(long j, int i, float f);

    public static native int nativeSetBusinessId(long j, String str);

    public static native int nativeSetCameraExposureCompensation(long j, float f);

    public static native int nativeSetCameraExposurePosition(long j, float f, float f2);

    public static native int nativeSetCameraFocusPosition(long j, float f, float f2);

    public static native int nativeSetCameraZoomRatio(long j, float f);

    public static native void nativeSetCaptureVolume(long j, int i, int i2);

    public static native int nativeSetCellularEnhancement(long j, InternalMediaTypeEnhancementConfig internalMediaTypeEnhancementConfig);

    public static native void nativeSetCustomizeEncryptHandler(long j, RTCEncryptHandler rTCEncryptHandler);

    public static native int nativeSetDefaultAudioRoute(long j, int i);

    public static native int nativeSetDeviceId(String str);

    public static native int nativeSetDummyCaptureImagePath(long j, String str);

    public static native void nativeSetEarMonitorMode(long j, int i);

    public static native void nativeSetEarMonitorVolume(long j, int i);

    public static native int nativeSetEffectsVolume(long j, int i);

    public static native void nativeSetEnableSpeakerphoneForTest(long j, boolean z);

    public static native void nativeSetEncryptInfo(long j, int i, String str);

    public static native int nativeSetEnv(int i);

    public static native void nativeSetExternalVideoEncoderEventHandler(long j, RTCExternalVideoEncoderEventHandler rTCExternalVideoEncoderEventHandler);

    public static native boolean nativeSetHardWareEncodeContext();

    public static native int nativeSetLocalVideoCanvas(long j, int i, View view, int i2, int i3);

    public static native int nativeSetLocalVideoMirrorMode(long j, int i);

    public static native int nativeSetLocalVideoMirrorType(long j, int i);

    public static native int nativeSetLocalVideoSink(long j, int i, IVideoSink iVideoSink, int i2);

    public static native void nativeSetLocalVoicePitch(long j, int i);

    public static native void nativeSetMetadataObserver(long j, RTCMetadataObserver rTCMetadataObserver);

    public static native int nativeSetMirror(long j, boolean z);

    public static native int nativeSetMultiDeviceAVSync(long j, String str);

    public static native void nativeSetNetworkRequestIntercept(int i);

    public static native int nativeSetParameters(String str);

    public static native void nativeSetPlaybackVolume(long j, int i);

    public static native int nativeSetPublicStreamVideoCanvas(long j, String str, View view, int i);

    public static native void nativeSetPublicStreamVideoSink(long j, String str, IVideoSink iVideoSink, int i);

    public static native int nativeSetPublishChannel(long j, String str);

    public static native int nativeSetPublishFallbackOption(long j, int i);

    public static native int nativeSetPublishSpecialStream(long j, int i);

    public static native void nativeSetRecordingVolume(long j, int i);

    public static native void nativeSetRemoteAudioPlaybackVolume(long j, String str, int i);

    public static native int nativeSetRemoteSubscribeFallbackOption(long j, int i);

    public static native int nativeSetRemoteUserPriority(long j, String str, int i);

    public static native int nativeSetRemoteVideoCanvas(long j, String str, int i, View view, int i2, int i3);

    public static native void nativeSetRemoteVideoConfig(long j, String str, int i, int i2, int i3);

    public static native int nativeSetRemoteVideoSink(long j, String str, String str2, int i, IVideoSink iVideoSink, int i2);

    public static native void nativeSetRuntimeParameters(long j, String str);

    public static native void nativeSetScreenAudioSourceType(long j, int i);

    public static native void nativeSetScreenAudioStreamIndex(long j, int i);

    public static native int nativeSetScreenVideoEncoderConfig(long j, InternalVideoEncoderConfig internalVideoEncoderConfig);

    public static native void nativeSetServerParams(long j, String str, String str2);

    public static native int nativeSetSubscribeChannels(long j, String[] strArr, boolean z);

    public static native int nativeSetSubscribeSpecialStream(long j, int[] iArr);

    public static native void nativeSetUpperHttpClient(boolean z);

    public static native int nativeSetUserRole(long j, int i);

    public static native int nativeSetUserVisibility(long j, boolean z);

    public static native int nativeSetVideoCaptureConfig(long j, InternalVideoCaptureConfig internalVideoCaptureConfig);

    public static native void nativeSetVideoDecoderConfig(long j, String str, String str2, int i, int i2);

    public static native void nativeSetVideoEffectAlgoModelPath(long j, String str);

    public static native int nativeSetVideoEffectAlgoModelResourceFinder(long j, long j2, long j3);

    public static native int nativeSetVideoEffectColorFilter(long j, String str);

    public static native int nativeSetVideoEffectColorFilterIntensity(long j, float f);

    public static native int nativeSetVideoEffectExpressionDetect(long j, InternalExpressDetectConfig internalExpressDetectConfig);

    public static native int nativeSetVideoEffectNodes(long j, String[] strArr);

    public static native void nativeSetVideoEncoderConfig(long j, int i, List<InternalVideoStreamDescription> list);

    public static native int nativeSetVideoEncoderConfigV2(long j, List<InternalVideoEncoderConfig> list);

    public static native void nativeSetVideoInputType(long j, int i);

    public static native void nativeSetVideoOrientation(long j, int i);

    public static native int nativeSetVideoRotationMode(long j, int i);

    public static native void nativeSetVideoSourceType(long j, int i);

    public static native void nativeSetVideoSourceTypeWithStreamId(long j, int i, int i2);

    public static native void nativeSetVideoWatermark(long j, int i, String str, boolean z, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8);

    public static native void nativeSetVoiceChangerType(long j, int i);

    public static native void nativeSetVoiceReverbType(long j, int i);

    public static native int nativeSetVolumeOfEffect(long j, int i, int i2);

    public static native int nativeSetupLocalScreenSink(long j, IVideoSink iVideoSink, String str);

    public static native int nativeSetupLocalVideoSink(long j, IVideoSink iVideoSink, String str);

    public static native void nativeStartASR(long j, RTCASREngineEventHandler rTCASREngineEventHandler, String str, String str2, String str3, String str4, int i, String str5);

    public static native void nativeStartAudioCapture(long j);

    public static native int nativeStartAudioMixing(long j, String str, boolean z, boolean z2, int i);

    public static native int nativeStartAudioPlaybackDeviceTest(long j, String str, int i);

    public static native void nativeStartCloudProxy(long j, List<InternalCloudProxyInfo> list);

    public static native int nativeStartEchoTest(long j, EchoTestConfig echoTestConfig, int i);

    public static native int nativeStartFileRecording(long j, int i, String str, int i2, int i3);

    public static native int nativeStartForwardStreamToRooms(long j, List<InternalForwardStreamInfo> list);

    public static native void nativeStartLiveTranscoding(long j, String str, LiveTranscoding liveTranscoding, LiveTranscodingObserver liveTranscodingObserver);

    public static native int nativeStartNetworkProbe(long j, boolean z, int i, boolean z2, int i2);

    public static native int nativeStartPlayPublicStream(long j, String str);

    public static native int nativeStartPushPublicStream(long j, String str, String str2);

    public static native void nativeStartScreenAudioCapture(long j);

    public static native void nativeStartScreenCapture(long j, int i, Intent intent);

    public static native int nativeStartScreenSharing(long j, Intent intent, InternalScreenSharingParams internalScreenSharingParams);

    public static native int nativeStartScreenVideoCapture(long j, Intent intent);

    public static native void nativeStartVideoCapture(long j);

    public static native void nativeStopASR(long j);

    public static native int nativeStopAllEffects(long j);

    public static native void nativeStopAudioCapture(long j);

    public static native void nativeStopAudioMixing(long j);

    public static native int nativeStopAudioPlaybackDeviceTest(long j);

    public static native void nativeStopCloudProxy(long j);

    public static native int nativeStopEchoTest(long j);

    public static native int nativeStopEffect(long j, int i);

    public static native void nativeStopFileRecording(long j, int i);

    public static native int nativeStopForwardStreamToRooms(long j);

    public static native void nativeStopLiveTranscoding(long j, String str);

    public static native void nativeStopNetworkProbe(long j);

    public static native int nativeStopPlayPublicStream(long j, String str);

    public static native int nativeStopPushPublicStream(long j, String str);

    public static native void nativeStopScreenAudioCapture(long j);

    public static native void nativeStopScreenCapture(long j);

    public static native int nativeStopScreenSharing(long j);

    public static native int nativeStopScreenVideoCapture(long j);

    public static native void nativeStopVideoCapture(long j);

    public static native void nativeSubscribeScreenWithMediaStreamType(long j, String str, int i);

    public static native void nativeSubscribeStream(long j, String str, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5);

    public static native void nativeSubscribeStreamWithMediaStreamType(long j, String str, int i);

    public static native void nativeSubscribeUserStream(long j, String str, boolean z, int i, int i2, int i3);

    public static native int nativeSwitchCamera(long j, int i);

    public static native int nativeUnPublish(long j);

    public static native int nativeUnSubscribe(long j, String str, boolean z);

    public static native int nativeUnloadAllEffects(long j);

    public static native int nativeUnloadEffect(long j, int i);

    public static native int nativeUnpublishScreen(long j);

    public static native int nativeUnpublishScreenWithMediaStreamType(long j, int i);

    public static native int nativeUnpublishStream(long j, int i);

    public static native void nativeUnsubscribeScreenWithMediaStreamType(long j, String str, int i);

    public static native void nativeUnsubscribeStreamWithMediaStreamType(long j, String str, int i);

    public static native void nativeUpdateCloudRending(long j, String str);

    public static native int nativeUpdateForwardStreamToRooms(long j, List<InternalForwardStreamInfo> list);

    public static native void nativeUpdateLiveTranscoding(long j, String str, LiveTranscoding liveTranscoding);

    public static native int nativeUpdateLocalVideoCanvas(long j, int i, int i2, int i3);

    public static native void nativeUpdateLoginToken(long j, String str);

    public static native int nativeUpdatePublicStreamParam(long j, String str, String str2);

    public static native int nativeUpdateRemoteStreamVideoCanvas(long j, String str, String str2, int i, int i2, int i3);

    public static native void nativeUpdateScreenCapture(long j, int i);

    public static native int nativeUpdateScreenSharingParameters(long j, InternalScreenSharingParams internalScreenSharingParams);

    public static native int nativeUpdateToken(long j, String str);

    public static native int nativeUpdateVideoEffectNode(long j, String str, String str2, float f);
}
