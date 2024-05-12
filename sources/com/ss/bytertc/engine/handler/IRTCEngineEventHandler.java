package com.ss.bytertc.engine.handler;

import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.SubscribeState;
import com.ss.bytertc.engine.SysStats;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.data.AVSyncState;
import com.ss.bytertc.engine.data.AudioMixingError;
import com.ss.bytertc.engine.data.AudioMixingState;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.DataMessageSourceType;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.ss.bytertc.engine.data.LocalAudioStreamError;
import com.ss.bytertc.engine.data.LocalAudioStreamState;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RecordingInfo;
import com.ss.bytertc.engine.data.RecordingProgress;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteAudioState;
import com.ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamSycnInfoConfig;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.type.AudioDeviceType;
import com.ss.bytertc.engine.type.AudioDumpStatus;
import com.ss.bytertc.engine.type.AudioVolumeInfo;
import com.ss.bytertc.engine.type.EchoTestResult;
import com.ss.bytertc.engine.type.FirstFramePlayState;
import com.ss.bytertc.engine.type.FirstFrameSendState;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.LocalVideoStreamError;
import com.ss.bytertc.engine.type.LocalVideoStreamState;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.NetworkDetectionLinkType;
import com.ss.bytertc.engine.type.NetworkDetectionStopReason;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.PublicStreamErrorCode;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RangeAudioMode;
import com.ss.bytertc.engine.type.RecordingErrorCode;
import com.ss.bytertc.engine.type.RecordingState;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteStreamSwitch;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.bytertc.engine.type.RtcUser;
import com.ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import com.ss.bytertc.engine.type.VideoDeviceType;
import com.ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* loaded from: classes33.dex */
public abstract class IRTCEngineEventHandler {
    public void onAVSyncStateChange(AVSyncState aVSyncState) {
    }

    public void onActiveSpeaker(String str) {
    }

    public void onActiveSpeaker(String str, String str2) {
    }

    public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i, int i2) {
    }

    public void onAudioDeviceWarning(String str, AudioDeviceType audioDeviceType, int i) {
    }

    public void onAudioDumpStateChanged(AudioDumpStatus audioDumpStatus) {
    }

    public void onAudioEffectFinished(int i) {
    }

    public void onAudioFramePlayStateChanged(RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onAudioFrameSendStateChanged(RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onAudioMixingFinished() {
    }

    public void onAudioMixingPlayingProgress(int i, long j) {
    }

    public void onAudioMixingStateChanged(int i, AudioMixingState audioMixingState, AudioMixingError audioMixingError) {
    }

    public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
    }

    public void onAudioPlaybackDeviceTestVolume(int i) {
    }

    public void onAudioRouteChanged(AudioRoute audioRoute) {
    }

    public void onAudioStreamBanned(String str, boolean z) {
    }

    public void onAudioVolumeIndication(AudioVolumeInfo[] audioVolumeInfoArr, int i) {
    }

    public void onCloudProxyConnected(int i) {
    }

    public void onConnectionStateChanged(int i, int i2) {
    }

    public void onEchoTestResult(EchoTestResult echoTestResult) {
    }

    public void onError(int i) {
    }

    public void onExtensionAccessError(String str, String str2) {
    }

    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
    }

    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
    }

    public void onFirstPublicStreamAudioFrame(String str) {
    }

    public void onFirstPublicStreamVideoFrameDecoded(String str, VideoFrameInfo videoFrameInfo) {
    }

    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
    }

    public void onFirstRemoteVideoFrameDecoded(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
    }

    public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
    }

    public void onGetPeerOnlineStatus(String str, int i) {
    }

    public void onHttpProxyState(int i) {
    }

    public void onHttpsProxyState(int i) {
    }

    public void onInvokeExperimentalAPI(String str) {
    }

    public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
    }

    public void onLicenseWillExpire(int i) {
    }

    public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
    }

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
    }

    public void onLocalStreamStats(LocalStreamStats localStreamStats) {
    }

    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
    }

    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
    }

    public void onLogReport(String str, JSONObject jSONObject) {
    }

    public void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th) {
    }

    public void onLoginResult(String str, int i, int i2) {
    }

    public void onLogout() {
    }

    public void onMediaDeviceStateChanged(String str, int i, int i2, int i3) {
    }

    public void onMediaDeviceWarning(String str, int i, int i2) {
    }

    public void onMuteAllRemoteAudio(String str, MuteState muteState) {
    }

    public void onMuteAllRemoteVideo(String str, MuteState muteState) {
    }

    public void onNetworkDetectionResult(NetworkDetectionLinkType networkDetectionLinkType, int i, int i2, double d, int i3, int i4) {
    }

    public void onNetworkDetectionStopped(NetworkDetectionStopReason networkDetectionStopReason) {
    }

    public void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
    }

    public void onNetworkTypeChanged(int i) {
    }

    public void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
    }

    public void onPlayPublicStreamResult(String str, PublicStreamErrorCode publicStreamErrorCode) {
    }

    public void onPublicStreamDataMessageReceived(String str, ByteBuffer byteBuffer, DataMessageSourceType dataMessageSourceType) {
    }

    public void onPublicStreamSEIMessageReceived(String str, ByteBuffer byteBuffer, DataMessageSourceType dataMessageSourceType) {
    }

    public void onPushPublicStreamResult(String str, PublicStreamErrorCode publicStreamErrorCode) {
    }

    public void onRecordingProgressUpdate(StreamIndex streamIndex, RecordingProgress recordingProgress, RecordingInfo recordingInfo) {
    }

    public void onRecordingStateUpdate(StreamIndex streamIndex, RecordingState recordingState, RecordingErrorCode recordingErrorCode, RecordingInfo recordingInfo) {
    }

    public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
    }

    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
    }

    public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
    }

    public void onRemoteUserAudioRecvModeChange(String str, RangeAudioMode rangeAudioMode) {
    }

    public void onRemoteUserAudioSendModeChange(String str, RangeAudioMode rangeAudioMode) {
    }

    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
    }

    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
    }

    public void onResponse(String str) {
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onRoomMessageReceived(String str, String str2) {
    }

    public void onRoomMessageSendResult(long j, int i) {
    }

    public void onRoomStateChanged(String str, String str2, int i, String str3) {
    }

    public void onRoomStats(RTCRoomStats rTCRoomStats) {
    }

    public void onSEIMessageReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer) {
    }

    public void onSEIStreamUpdate(RemoteStreamKey remoteStreamKey, SEIStreamUpdateEvent sEIStreamUpdateEvent) {
    }

    public void onScreenVideoFramePlayStateChanged(RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onScreenVideoFrameSendStateChanged(RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onServerMessageSendResult(long j, int i, ByteBuffer byteBuffer) {
    }

    public void onServerParamsSetResult(int i) {
    }

    public void onSimulcastSubscribeFallback(RemoteStreamSwitch remoteStreamSwitch) {
    }

    public void onSocks5ProxyState(int i, String str, String str2, String str3, String str4) {
    }

    public void onStreamAdd(RTCStream rTCStream) {
    }

    public void onStreamPublishSuccess(String str, boolean z) {
    }

    public void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
    }

    public void onStreamStateChanged(String str, String str2, int i, String str3) {
    }

    public void onStreamSubscribed(SubscribeState subscribeState, String str, SubscribeConfig subscribeConfig) {
    }

    public void onStreamSyncInfoReceived(RemoteStreamKey remoteStreamKey, StreamSycnInfoConfig.SyncInfoStreamType syncInfoStreamType, ByteBuffer byteBuffer) {
    }

    public void onSubscribe(String str, boolean z) {
    }

    public void onSysStats(SysStats sysStats) {
    }

    public void onTokenWillExpire() {
    }

    public void onUnSubscribe(String str, boolean z) {
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    public void onUserBinaryMessageReceivedOutsideRoom(String str, ByteBuffer byteBuffer) {
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
    }

    public void onUserJoined(UserInfo userInfo, int i) {
    }

    public void onUserLeave(String str, int i) {
    }

    public void onUserMessageReceived(String str, String str2) {
    }

    public void onUserMessageReceivedOutsideRoom(String str, String str2) {
    }

    public void onUserMessageSendResult(long j, int i) {
    }

    public void onUserMessageSendResultOutsideRoom(long j, int i) {
    }

    public void onUserMuteAudio(String str, MuteState muteState) {
    }

    public void onUserMuteVideo(String str, MuteState muteState) {
    }

    public void onUserPublishScreen(String str, MediaStreamType mediaStreamType) {
    }

    public void onUserPublishStream(String str, MediaStreamType mediaStreamType) {
    }

    public void onUserStartAudioCapture(String str) {
    }

    public void onUserStartVideoCapture(String str) {
    }

    public void onUserStopAudioCapture(String str) {
    }

    public void onUserStopVideoCapture(String str) {
    }

    public void onUserUnPublishScreen(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }

    public void onUserUnPublishStream(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }

    public void onVideoDeviceStateChanged(String str, VideoDeviceType videoDeviceType, int i, int i2) {
    }

    public void onVideoDeviceWarning(String str, VideoDeviceType videoDeviceType, int i) {
    }

    public void onVideoFramePlayStateChanged(RtcUser rtcUser, FirstFramePlayState firstFramePlayState) {
    }

    public void onVideoFrameSendStateChanged(RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
    }

    public void onVideoStreamBanned(String str, boolean z) {
    }

    public void onWarning(int i) {
    }
}
