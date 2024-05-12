package com.ss.avframework.livestreamv2.core.interact.livertc;

import com.ss.bytertc.engine.SysStats;
import com.ss.bytertc.engine.data.AudioMixingError;
import com.ss.bytertc.engine.data.AudioMixingState;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.DataMessageSourceType;
import com.ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.ss.bytertc.engine.data.LocalAudioStreamError;
import com.ss.bytertc.engine.data.LocalAudioStreamState;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteAudioState;
import com.ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.ss.bytertc.engine.data.RemoteStreamKey;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.type.FirstFrameSendState;
import com.ss.bytertc.engine.type.LocalVideoStreamError;
import com.ss.bytertc.engine.type.LocalVideoStreamState;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.PublicStreamErrorCode;
import com.ss.bytertc.engine.type.RemoteStreamSwitch;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.bytertc.engine.type.RtcUser;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class RTCHandlerProxy extends IRTCVideoEventHandler {
    public WeakReference<IRTCVideoEventHandler> mHandler;
    public WeakReference<ILiveRtcEventObserver> mObserver;

    public IRTCVideoEventHandler getHandler() {
        WeakReference<IRTCVideoEventHandler> weakReference = this.mHandler;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public ILiveRtcEventObserver getObserver() {
        WeakReference<ILiveRtcEventObserver> weakReference = this.mObserver;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onAudioPlaybackDeviceChanged(audioPlaybackDevice);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onError(int i) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onError(i);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onFirstLocalAudioFrame(streamIndex);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstPublicStreamAudioFrame(String str) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onFirstPublicStreamAudioFrame(str);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onFirstRemoteAudioFrame(remoteStreamKey);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLocalAudioPropertiesReport(localAudioPropertiesInfoArr);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onNetworkTypeChanged(int i) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onNetworkTypeChanged(i);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSimulcastSubscribeFallback(RemoteStreamSwitch remoteStreamSwitch) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onSimulcastSubscribeFallback(remoteStreamSwitch);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onSysStats(SysStats sysStats) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onSysStats(sysStats);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onWarning(int i) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onWarning(i);
        }
    }

    public RTCHandlerProxy(IRTCVideoEventHandler iRTCVideoEventHandler, ILiveRtcEventObserver iLiveRtcEventObserver) {
        this.mHandler = new WeakReference<>(iRTCVideoEventHandler);
        this.mObserver = new WeakReference<>(iLiveRtcEventObserver);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onConnectionStateChanged(int i, int i2) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onConnectionStateChanged(i, i2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstPublicStreamVideoFrameDecoded(String str, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onFirstPublicStreamVideoFrameDecoded(str, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstRemoteVideoFrameDecoded(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onFirstRemoteVideoFrameDecoded(remoteStreamKey, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLogReport(String str, JSONObject jSONObject) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLogReport(str, jSONObject);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onPlayPublicStreamResult(String str, PublicStreamErrorCode publicStreamErrorCode) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onPlayPublicStreamResult(str, publicStreamErrorCode);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRemoteAudioPropertiesReport(remoteAudioPropertiesInfoArr, i);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserStartAudioCapture(String str, String str2) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserStartAudioCapture(str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserStartVideoCapture(String str, String str2) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserStartVideoCapture(str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserStopAudioCapture(String str, String str2) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserStopAudioCapture(str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onUserStopVideoCapture(String str, String str2) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserStopVideoCapture(str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onAudioMixingStateChanged(int i, AudioMixingState audioMixingState, AudioMixingError audioMixingError) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onAudioMixingStateChanged(i, audioMixingState, audioMixingError);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLoggerMessage(logLevel, str, th);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onPublicStreamSEIMessageReceived(String str, ByteBuffer byteBuffer, DataMessageSourceType dataMessageSourceType) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onPublicStreamSEIMessageReceived(str, byteBuffer, dataMessageSourceType);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onPushPublicStreamResult(String str, String str2, PublicStreamErrorCode publicStreamErrorCode) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onPushPublicStreamResult(str, str2, publicStreamErrorCode);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
        super.onVideoFrameSendStateChanged(str, rtcUser, firstFrameSendState);
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onVideoFrameSendStateChanged(str, rtcUser, firstFrameSendState);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onMediaDeviceStateChanged(String str, int i, int i2, int i3) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onMediaDeviceStateChanged(str, i, i2, i3);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
        IRTCVideoEventHandler handler = getHandler();
        if (handler != null) {
            handler.onPerformanceAlarms(performanceAlarmMode, str, performanceAlarmReason, sourceWantedData);
        }
    }
}
