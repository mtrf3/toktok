package com.ss.bytertc.engine.handler;

import X.V0N;
import X.X1D;
import com.ss.bytertc.engine.InternalAudioVolumeInfo;
import com.ss.bytertc.engine.InternalLocalStreamStats;
import com.ss.bytertc.engine.InternalNetworkQualityInfo;
import com.ss.bytertc.engine.InternalRTCStats;
import com.ss.bytertc.engine.InternalRTCUser;
import com.ss.bytertc.engine.InternalRemoteAudioStats;
import com.ss.bytertc.engine.InternalRemoteStreamStats;
import com.ss.bytertc.engine.InternalRemoteStreamSwitch;
import com.ss.bytertc.engine.InternalSourceWantedData;
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
import com.ss.bytertc.engine.engineimpl.RTCEngineImpl;
import com.ss.bytertc.engine.type.AudioDeviceType;
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
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes33.dex */
public class RTCEngineEventHandler {
    public long mJoinChannelTime;
    public String mRoom;
    public WeakReference<RTCEngineImpl> mRtcEngineImpl;
    public String mSession;
    public State mState = State.IDLE;
    public String mUser;

    public void onAudioMixingFinished() {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onAudioMixingFinished...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioMixingFinished();
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onAudioMixingFinished callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onLogout() {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onLogout");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLogout();
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLogout callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onTokenWillExpire() {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onTokenWillExpire");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onTokenWillExpire();
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onTokenWillExpire callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    /* loaded from: classes33.dex */
    public enum State {
        IDLE,
        IN_ROOM;

        public static State valueOf(String str) {
            return (State) V0N.LJJJ(State.class, str);
        }
    }

    public RTCEngineEventHandler(RTCEngineImpl rTCEngineImpl) {
        this.mRtcEngineImpl = new WeakReference<>(rTCEngineImpl);
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public void onAVSyncStateChange(AVSyncState aVSyncState) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAVSyncStateChange state: ");
        LIZ.append(aVSyncState.value());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAVSyncStateChange(aVSyncState);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioMixingStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onActiveSpeaker(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onActiveSpeaker...uid: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onActiveSpeaker(str);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onActiveSpeaker callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onAudioEffectFinished(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioEffectFinished...soundId: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioEffectFinished(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioEffectFinished callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioPlaybackDeviceChanged...device: ");
        LIZ.append(audioPlaybackDevice.value());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioPlaybackDeviceChanged(audioPlaybackDevice);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioPlaybackDeviceChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onAudioPlaybackDeviceTestVolume(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onAudioPlaybackDeviceTestVolume");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioPlaybackDeviceTestVolume(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onAudioPlaybackDeviceTestVolume callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onAudioRouteChanged(AudioRoute audioRoute) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioRouteChanged...route: ");
        LIZ.append(audioRoute.value());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioRouteChanged(audioRoute);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioRouteChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onCloudProxyConnected(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCloudProxyConnected, interval: ");
        LIZ.append(i);
        LogUtil.i("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onCloudProxyConnected(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onCloudProxyConnected callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onConnectionStateChanged(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConnectionStateChanged, state: ");
        LIZ.append(i);
        LogUtil.i("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onConnectionStateChanged(i, -1);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onConnectionStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onEchoTestResult(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onEchoTestResult...error code: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                EchoTestResult echoTestResult = EchoTestResult.ECHO_TEST_SUCCESS;
                switch (i) {
                    case 1:
                        echoTestResult = EchoTestResult.ECHO_TEST_TIMEOUT;
                        break;
                    case 2:
                        echoTestResult = EchoTestResult.ECHO_TEST_INTERVAL_SHORT;
                        break;
                    case 3:
                        echoTestResult = EchoTestResult.ECHO_TEST_AUDIO_DEVICE_ERROR;
                        break;
                    case 4:
                        echoTestResult = EchoTestResult.ECHO_TEST_VIDEO_DEVICE_ERROR;
                        break;
                    case 5:
                        echoTestResult = EchoTestResult.ECHO_TEST_AUDIO_RECEIVE_ERROR;
                        break;
                    case 6:
                        echoTestResult = EchoTestResult.ECHO_TEST_VIDEO_RECEIVE_ERROR;
                        break;
                    case 7:
                        echoTestResult = EchoTestResult.ECHO_TEST_INTERNAL_ERROR;
                        break;
                }
                rtcEngineHandler.onEchoTestResult(echoTestResult);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onEchoTestResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onError(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError...errorNum: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onError(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onError callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstLocalAudioFrame...streamIndex: ");
        LIZ.append(streamIndex.value());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalAudioFrame(streamIndex);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstLocalAudioFrame callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstPublicStreamAudioFrame(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstPublicStreamAudioFrame...streamid: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstPublicStreamAudioFrame(str);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstPublicStreamAudioFrame callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteAudioFrame...uid: ");
        LIZ.append(remoteStreamKey.getUserId());
        LIZ.append(", roomid: ");
        LIZ.append(remoteStreamKey.getRoomId());
        LIZ.append(", streamIndex: ");
        LIZ.append(remoteStreamKey.getStreamIndex().value());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteAudioFrame(remoteStreamKey);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstRemoteAudioFrame callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "OnForwardStreamEvent");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onForwardStreamEvent(forwardStreamEventInfoArr);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("OnForwardStreamEvent callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "OnForwardStreamStateChanged");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onForwardStreamStateChanged(forwardStreamStateInfoArr);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("OnForwardStreamStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onHttpProxyState(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHttpProxyState, state: ");
        LIZ.append(i);
        LogUtil.i("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onHttpProxyState(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onHttpProxyState callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onHttpsProxyState(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHttpsProxyState, state: ");
        LIZ.append(i);
        LogUtil.i("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onHttpsProxyState(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onHttpsProxyState callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onInvokeExperimentalAPI(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInvokeExperimentalAPI...param: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onInvokeExperimentalAPI(str);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onInvokeExperimentalAPI callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onLeaveRoom(InternalRTCStats internalRTCStats) {
        LogUtil.d("RtcEngineEventHandler", "onLeaveChannel...");
    }

    public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onLocalAudioPropertiesReport");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalAudioPropertiesReport(localAudioPropertiesInfoArr);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLocalAudioPropertiesReport callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onLocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onLocalStreamStats...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalStreamStats(new LocalStreamStats(internalLocalStreamStats));
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLocalStreamStats callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onNetworkProbeStopped(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNetworkProbeStopped: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkDetectionStopped(NetworkDetectionStopReason.values()[i]);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onNetworkDetectionStopped callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onNetworkTypeChanged(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNetworkTypeChanged, type: ");
        LIZ.append(i);
        LogUtil.i("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkTypeChanged(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onNetworkTypeChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        int i;
        LogUtil.d("RtcEngineEventHandler", "onRemoteStreamStats...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                InternalRemoteAudioStats internalRemoteAudioStats = internalRemoteStreamStats.audioStats;
                int i2 = internalRemoteAudioStats.quality;
                if (i2 != -1) {
                    if (i2 != 0) {
                        i = 4;
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        i = 0;
                                    } else {
                                        i = 1;
                                    }
                                } else {
                                    i = 2;
                                }
                            } else {
                                i = 3;
                            }
                        }
                    } else {
                        i = 5;
                    }
                } else {
                    i = 6;
                }
                internalRemoteAudioStats.quality = i;
                rtcEngineHandler.onRemoteStreamStats(new RemoteStreamStats(internalRemoteStreamStats));
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRemoteStreamStats callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onResponse(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResponse, res: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onResponse(str);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onResponse callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRoomStats(InternalRTCStats internalRTCStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRtcStats...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomStats(new RTCRoomStats(internalRTCStats));
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRtcStats callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onServerParamsSetResult(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onServerParamsSetResult: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onServerParamsSetResult(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onServerParamsSetResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onSimulcastSubscribeFallback(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSimulcastSubscribeFallback, uid: ");
        LIZ.append(internalRemoteStreamSwitch.uid);
        LIZ.append(", isScreen: ");
        LIZ.append(internalRemoteStreamSwitch.isScreen);
        LIZ.append(", before_video_index: ");
        LIZ.append(internalRemoteStreamSwitch.beforeVideoIndex);
        LIZ.append(", after_video_index: ");
        LIZ.append(internalRemoteStreamSwitch.afterVideoIndex);
        LIZ.append(", before_enable: ");
        LIZ.append(internalRemoteStreamSwitch.beforeEnable);
        LIZ.append(", after_enable: ");
        LIZ.append(internalRemoteStreamSwitch.afterEnable);
        LIZ.append(", reason: ");
        LIZ.append(internalRemoteStreamSwitch.reason);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSimulcastSubscribeFallback(new RemoteStreamSwitch(internalRemoteStreamSwitch));
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRemoteStreamSwitch callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onStreamAdd(RTCStream rTCStream) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onStreamAdd...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamAdd(rTCStream);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStreamAdd callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onSysStats(SysStats sysStats) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSysStats... ");
        LIZ.append(sysStats.toString());
        LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSysStats(sysStats);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSysStats callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserStartAudioCapture(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserStartAudioCapture... uid: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStartAudioCapture(str);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserStartAudioCapture callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserStartVideoCapture(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserStartVideoCapture... uid: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStartVideoCapture(str);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserStartVideoCapture callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserStopAudioCapture(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserStopAudioCapture... uid: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStopAudioCapture(str);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserStopAudioCapture callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserStopVideoCapture(String str) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserStopVideoCapture... uid: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStopVideoCapture(str);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserStopVideoCapture callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onWarning(int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWarning, warnNum: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onWarning(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onWarning callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void setJoinChannelTime(long j) {
        this.mJoinChannelTime = j;
    }

    public void onActiveSpeaker(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onActiveSpeaker");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onActiveSpeaker(str, str2);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onActiveSpeaker callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onAudioFramePlayStateChanged(InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioFramePlayStateChanged, user: ");
        LIZ.append(internalRTCUser);
        LIZ.append(", state: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
                }
            } else {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFramePlayStateChanged(new RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcEngineEventHandler", "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onAudioFrameSendStateChanged(InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioFrameSendStateChanged, user: ");
        LIZ.append(internalRTCUser);
        LIZ.append(", state: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
                }
            } else {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFrameSendStateChanged(new RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcEngineEventHandler", "onAudioFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onAudioMixingPlayingProgress(int i, long j) {
        IRTCEngineEventHandler rtcEngineHandler;
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioMixingPlayingProgress(i, j);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onAudioMixingPlayingProgress callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onAudioStreamBanned(String str, boolean z) {
        String str2;
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioStreamBanned, user: ");
        LIZ.append(str);
        LIZ.append(", banned: ");
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        LIZ.append(str2);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioStreamBanned(str, z);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioStreamBanned callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onAudioVolumeIndication(InternalAudioVolumeInfo[] internalAudioVolumeInfoArr, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        try {
            AudioVolumeInfo[] audioVolumeInfoArr = new AudioVolumeInfo[internalAudioVolumeInfoArr.length];
            for (int i2 = 0; i2 < internalAudioVolumeInfoArr.length; i2++) {
                audioVolumeInfoArr[i2] = new AudioVolumeInfo(internalAudioVolumeInfoArr[i2]);
            }
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioVolumeIndication(audioVolumeInfoArr, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onAudioVolumeIndication callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onExtensionAccessError(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onExtensionAccessError...extensionName: ");
        LIZ.append(str);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onExtensionAccessError(str, str2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onExtensionAccessError callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstLocalVideoFrame...width: ");
        LIZ.append(videoFrameInfo.getWidth());
        LIZ.append(", height: ");
        LIZ.append(videoFrameInfo.getHeight());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstLocalVideoFrame callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstPublicStreamVideoFrameDecoded(String str, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstPublicStreamVideoFrameDecoded...streamid: ");
        LIZ.append(str);
        LIZ.append(", width: ");
        LIZ.append(videoFrameInfo.getWidth());
        LIZ.append(", height: ");
        LIZ.append(videoFrameInfo.getHeight());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstPublicStreamVideoFrameDecoded(str, videoFrameInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstPublicStreamVideoFrameDecoded callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstRemoteVideoFrameDecoded(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrameDecoded...uid: ");
        LIZ.append(remoteStreamKey.getUserId());
        LIZ.append(", StreamIndex:");
        LIZ.append(remoteStreamKey.getStreamIndex());
        LIZ.append(", width: ");
        LIZ.append(videoFrameInfo.getWidth());
        LIZ.append(", height: ");
        LIZ.append(videoFrameInfo.getHeight());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteVideoFrameDecoded(remoteStreamKey, videoFrameInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstRemoteVideoFrameDecoded callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrameRendered...uid: ");
        LIZ.append(remoteStreamKey.getUserId());
        LIZ.append(", StreamIndex:");
        LIZ.append(remoteStreamKey.getStreamIndex());
        LIZ.append(", width: ");
        LIZ.append(videoFrameInfo.getWidth());
        LIZ.append(", height: ");
        LIZ.append(videoFrameInfo.getHeight());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstRemoteVideoFrameRendered callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onGetPeerOnlineStatus(String str, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGetPeerOnlineStatus: ");
        LIZ.append(str);
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onGetPeerOnlineStatus(str, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onGetPeerOnlineStatus callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onLocalAudioStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLocalAudioStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLocalVideoSizeChanged... streamIndex: ");
        LIZ.append(streamIndex);
        LIZ.append(", frameInfo: ");
        LIZ.append(videoFrameInfo);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLocalVideoSizeChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onLogReport(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        try {
            if ("live_webrtc_monitor_log".equals(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
                    if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                        rtcEngineHandler.onLogReport(str, jSONObject);
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onLogReport...parse json catch exception: ");
                    LIZ.append(e.getMessage());
                    LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
                    return;
                }
            }
            LogUtil.i(str, str2);
        } catch (Exception e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLogReport callback catch exception.\n");
            LIZ2.append(e2.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onMuteAllRemoteAudio(String str, MuteState muteState) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMuteAllRemoteAudio... uid: ");
        LIZ.append(str);
        LIZ.append(", muteState: ");
        LIZ.append(muteState.value());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMuteAllRemoteAudio(str, muteState);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onMuteAllRemoteAudio callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onMuteAllRemoteVideo(String str, MuteState muteState) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMuteAllRemoteVideo... uid: ");
        LIZ.append(str);
        LIZ.append(", muteState: ");
        LIZ.append(muteState);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMuteAllRemoteVideo(str, muteState);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onMuteAllRemoteVideo callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onNetworkQuality(InternalNetworkQualityInfo internalNetworkQualityInfo, InternalNetworkQualityInfo[] internalNetworkQualityInfoArr) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Local onNetworkQuality, uid: ");
        LIZ.append(internalNetworkQualityInfo.uid);
        LIZ.append(", info: ");
        LIZ.append(internalNetworkQualityInfo.toString());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                NetworkQualityStats[] networkQualityStatsArr = new NetworkQualityStats[internalNetworkQualityInfoArr.length];
                for (int i = 0; i < internalNetworkQualityInfoArr.length; i++) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Remote onNetworkQuality, uid: ");
                    LIZ2.append(internalNetworkQualityInfoArr[i].uid);
                    LIZ2.append(", info: ");
                    LIZ2.append(internalNetworkQualityInfoArr[i].toString());
                    LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
                    networkQualityStatsArr[i] = new NetworkQualityStats(internalNetworkQualityInfoArr[i]);
                }
                rtcEngineHandler.onNetworkQuality(new NetworkQualityStats(internalNetworkQualityInfo), networkQualityStatsArr);
            }
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onNetworkQuality callback catch exception.\n");
            LIZ3.append(e.getMessage());
            LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ3));
        }
    }

    public void onPlayPublicStreamResult(String str, PublicStreamErrorCode publicStreamErrorCode) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayPublicStreamError error(");
        LIZ.append(publicStreamErrorCode.value());
        LIZ.append(") streamId:");
        LIZ.append(str);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onPlayPublicStreamResult(str, publicStreamErrorCode);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPlayPublicStreamError callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onPushPublicStreamResult(String str, PublicStreamErrorCode publicStreamErrorCode) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPushPublicStreamError error(");
        LIZ.append(publicStreamErrorCode.value());
        LIZ.append(") streamId:");
        LIZ.append(str);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onPushPublicStreamResult(str, publicStreamErrorCode);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPushPublicStreamError callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRemoteAudioPropertiesReport");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteAudioPropertiesReport(remoteAudioPropertiesInfoArr, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRemoteAudioPropertiesReport callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onRemoteUserAudioRecvModeChange(String str, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("remote user audio recv mode change: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteUserAudioRecvModeChange(str, RangeAudioMode.values()[i]);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRemoteUserAudioRecvModeChange callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRemoteUserAudioSendModeChange(String str, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("remote user audio send mode change: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteUserAudioSendModeChange(str, RangeAudioMode.values()[i]);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRemoteUserAudioSendModeChange callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRemoteVideoSizeChanged... RemoteStreamKey: ");
        LIZ.append(remoteStreamKey);
        LIZ.append(", frameInfo: ");
        LIZ.append(videoFrameInfo);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRemoteVideoSizeChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomBinaryMessageReceived, length: ");
        LIZ.append(byteBuffer.capacity());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomBinaryMessageReceived(str, byteBuffer);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRoomBinaryMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRoomMessageReceived(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomMessageReceived: ");
        LIZ.append(str2);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomMessageReceived(str, str2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRoomMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRoomMessageSendResult(long j, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomMessageSendResult: ");
        LIZ.append(j);
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomMessageSendResult(j, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRoomMessageSendResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onSEIMessageReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSEIMessageReceived");
        LIZ.append(remoteStreamKey.getRoomId());
        LIZ.append(remoteStreamKey.getUserId());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSEIMessageReceived(remoteStreamKey, byteBuffer);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSEIMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onSEIStreamUpdate(RemoteStreamKey remoteStreamKey, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSEIStreamUpdate");
        LIZ.append(remoteStreamKey.getRoomId());
        LIZ.append(remoteStreamKey.getUserId());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSEIStreamUpdate(remoteStreamKey, SEIStreamUpdateEvent.values()[i]);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSEIStreamUpdate callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onScreenVideoFramePlayStateChanged(InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScreenVideoFramePlayStateChanged, user: ");
        LIZ.append(internalRTCUser);
        LIZ.append(", state: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
                }
            } else {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenVideoFramePlayStateChanged(new RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcEngineEventHandler", "onScreenVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onScreenVideoFrameSendStateChanged(InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScreenVideoFrameSendStateChanged, user: ");
        LIZ.append(internalRTCUser);
        LIZ.append(", state: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
                }
            } else {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenVideoFrameSendStateChanged(new RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcEngineEventHandler", "onScreenVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onStreamPublishSuccess(String str, boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onStreamPublishSucceed...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamPublishSuccess(str, z);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStreamPublishSucceed callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onStreamRemove(RTCStream rTCStream, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStreamRemove...uid: ");
        LIZ.append(rTCStream.userId);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamRemove(rTCStream, StreamRemoveReason.values()[i]);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onStreamRemove callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onSubscribe(String str, boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSubscribe, uesr_id: ");
        LIZ.append(str);
        LIZ.append(", isReconnect: ");
        LIZ.append(z);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSubscribe(str, z);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSubsribe callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUnSubscribe(String str, boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUnSubscribe, uesr_id: ");
        LIZ.append(str);
        LIZ.append(", isReconnect: ");
        LIZ.append(z);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUnSubscribe(str, z);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUnSubscribe callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserBinaryMessageReceived: ");
        LIZ.append(str);
        LIZ.append(byteBuffer.capacity());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserBinaryMessageReceived(str, byteBuffer);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserBinaryMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserBinaryMessageReceivedOutsideRoom(String str, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserBinaryMessageReceivedOutsideRoom: ");
        LIZ.append(str);
        LIZ.append(byteBuffer.capacity());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserBinaryMessageReceivedOutsideRoom(str, byteBuffer);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserBinaryMessageReceivedOutsideRoom callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserEnableLocalAudio(String str, boolean z) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserEnableLocalAudio... uid: ");
        LIZ.append(str);
        LIZ.append(", enabled: ");
        LIZ.append(z);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserEnableLocalAudio(str, z);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserEnableLocalAudio callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserJoined(UserInfo userInfo, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserJoined... uid: ");
        LIZ.append(userInfo.getUid());
        LIZ.append(", extraInfo: ");
        LIZ.append(userInfo.getExtraInfo());
        LIZ.append(", elapsed: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserJoined(userInfo, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserJoined callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserLeave(String str, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserLeave... uid: ");
        LIZ.append(str);
        LIZ.append(", reason: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserLeave(str, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserLeave callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserMessageReceived(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMessageReceived: ");
        LIZ.append(str);
        LIZ.append(str2);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageReceived(str, str2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserMessageReceivedOutsideRoom(String str, String str2) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMessageReceivedOutsideRoom: ");
        LIZ.append(str);
        LIZ.append(str2);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageReceivedOutsideRoom(str, str2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserMessageReceivedOutsideRoom callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserMessageSendResult(long j, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMessageSendResult: ");
        LIZ.append(j);
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageSendResult(j, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserMessageSendResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserMessageSendResultOutsideRoom(long j, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMessageSendResultOutsideRoom: ");
        LIZ.append(j);
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageSendResultOutsideRoom(j, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserMessageSendResultOutsideRoom callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserMuteAudio(String str, MuteState muteState) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMuteAudio... uid: ");
        LIZ.append(str);
        LIZ.append(", muteState: ");
        LIZ.append(muteState.value());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMuteAudio(str, muteState);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserMuteAudio callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserMuteVideo(String str, MuteState muteState) {
        boolean z;
        IRTCEngineEventHandler rtcEngineHandler;
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMuteVideo... uid: ");
        LIZ.append(str);
        LIZ.append(", muted: ");
        LIZ.append(z);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMuteVideo(str, muteState);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserMuteVideo callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserPublishScreen(String str, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserPublishScreen... uid: ");
        LIZ.append(str);
        LIZ.append(", type: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserPublishScreen(str, MediaStreamType.valueOf(i));
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserPublishScreen callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserPublishStream(String str, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserPublishStream... uid: ");
        LIZ.append(str);
        LIZ.append(", type: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserPublishStream(str, MediaStreamType.valueOf(i));
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserPublishStream callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onVideoFramePlayStateChanged(InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoFramePlayStateChanged, user: ");
        LIZ.append(internalRTCUser);
        LIZ.append(", state: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        FirstFramePlayState firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYING;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_END;
                }
            } else {
                firstFramePlayState = FirstFramePlayState.FIRST_FRAME_PLAY_STATE_PLAYED;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFramePlayStateChanged(new RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcEngineEventHandler", "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onVideoFrameSendStateChanged(InternalRTCUser internalRTCUser, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoFrameSendStateChanged, user: ");
        LIZ.append(internalRTCUser);
        LIZ.append(", state: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        FirstFrameSendState firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENDING;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STAT_END;
                }
            } else {
                firstFrameSendState = FirstFrameSendState.FIRST_FRAME_SEND_STATE_SENT;
            }
        }
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFrameSendStateChanged(new RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcEngineEventHandler", "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onVideoStreamBanned(String str, boolean z) {
        String str2;
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoStreamBanned, user: ");
        LIZ.append(str);
        LIZ.append(", banned: ");
        if (z) {
            str2 = "true";
        } else {
            str2 = "false";
        }
        LIZ.append(str2);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoStreamBanned(str, z);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onVideoStreamBanned callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onAudioDeviceWarning(String str, AudioDeviceType audioDeviceType, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioDeviceWarning, AudioDeviceType: ");
        LIZ.append(audioDeviceType);
        LIZ.append(", device_warning ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioDeviceWarning(str, audioDeviceType, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioDeviceWarning callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onAudioMixingStateChanged(int i, AudioMixingState audioMixingState, AudioMixingError audioMixingError) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioMixingStateChanged... mixId: ");
        LIZ.append(i);
        LIZ.append(", state: ");
        LIZ.append(audioMixingState.value());
        LIZ.append(", error: ");
        LIZ.append(audioMixingError.value());
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioMixingStateChanged(i, audioMixingState, audioMixingError);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioMixingStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onLocalVideoStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLocalVideoStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onLoginResult(String str, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OnLoginResult: ");
        LIZ.append(str);
        LIZ.append(i);
        LIZ.append(i2);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLoginResult(str, i, i2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLoginResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onMediaDeviceWarning(String str, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMediaDeviceWarning, MediaDeviceType: ");
        LIZ.append(i);
        LIZ.append(", device_warning ");
        LIZ.append(i2);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMediaDeviceWarning(str, i, i2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onMediaDeviceWarning callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onPublicStreamSEIMessageReceived(String str, ByteBuffer byteBuffer, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPublicStreamSEIMessageReceived, streamid");
        LIZ.append(str);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onPublicStreamSEIMessageReceived(str, byteBuffer, DataMessageSourceType.fromId(i));
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPublicStreamSEIMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRecordingProgressUpdate(StreamIndex streamIndex, RecordingProgress recordingProgress, RecordingInfo recordingInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRecordingProgressUpdate, StreamIndex: ");
        LIZ.append(streamIndex);
        LIZ.append(", progress.dur: ");
        LIZ.append(recordingProgress.duration);
        LIZ.append(", progress.fileSize: ");
        LIZ.append(recordingProgress.fileSize);
        LIZ.append(", info.filePath: ");
        LIZ.append(recordingInfo.filePath);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRecordingProgressUpdate(streamIndex, recordingProgress, recordingInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRecordingProgressUpdate callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRemoteAudioStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRemoteAudioStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRemoteVideoStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRemoteVideoStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onServerMessageSendResult(long j, int i, ByteBuffer byteBuffer) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onServerMessageSendResult: ");
        LIZ.append(j);
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onServerMessageSendResult(j, i, byteBuffer);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onServerMessageSendResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onStreamSubscribed...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamSubscribed(SubscribeState.values()[i], str, subscribeConfig);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStreamSubscribed callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onStreamSyncInfoReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onStreamSyncInfoReceived");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamSyncInfoReceived(remoteStreamKey, StreamSycnInfoConfig.SyncInfoStreamType.SYNC_INFO_STREAM_TYPE_AUDIO, byteBuffer);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStreamSyncInfoReceived callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onUserUnPublishScreen(String str, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserUnPublishScreen... uid: ");
        LIZ.append(str);
        LIZ.append(", type: ");
        LIZ.append(i);
        LIZ.append(", reasen:");
        LIZ.append(i2);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserUnPublishScreen(str, MediaStreamType.valueOf(i), StreamRemoveReason.values()[i2]);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserUnPublishScreen callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserUnPublishStream(String str, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserUnPublishStream... uid: ");
        LIZ.append(str);
        LIZ.append(", type: ");
        LIZ.append(i);
        LIZ.append(", reasen:");
        LIZ.append(i2);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserUnPublishStream(str, MediaStreamType.valueOf(i), StreamRemoveReason.values()[i2]);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserUnPublishStream callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onVideoDeviceWarning(String str, VideoDeviceType videoDeviceType, int i) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoDeviceWarning, VideoDeviceType: ");
        LIZ.append(videoDeviceType);
        LIZ.append(", device_warning ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoDeviceWarning(str, videoDeviceType, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onVideoDeviceWarning callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioDeviceStateChanged, AudioDeviceType: ");
        LIZ.append(audioDeviceType);
        LIZ.append(", device_state: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioDeviceStateChanged(str, audioDeviceType, i, i2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioDeviceStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onMediaDeviceStateChanged(String str, int i, int i2, int i3) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMediaDeviceStateChanged, MediaDeviceType: ");
        LIZ.append(i);
        LIZ.append(", device_state: ");
        LIZ.append(i2);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMediaDeviceStateChanged(str, i, i2, i3);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onMediaDeviceStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onPerformanceAlarms(int i, String str, int i2, InternalSourceWantedData internalSourceWantedData) {
        PerformanceAlarmReason performanceAlarmReason;
        PerformanceAlarmMode performanceAlarmMode;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPerformanceAlarms, level: ");
        LIZ.append(i2);
        LIZ.append(", data: ");
        LIZ.append(internalSourceWantedData);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_RESUMED;
                            } else {
                                performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_RESUMED;
                            }
                        } else {
                            performanceAlarmReason = PerformanceAlarmReason.PERFORMANCE_FALLBACKED;
                        }
                    } else {
                        performanceAlarmReason = PerformanceAlarmReason.BANDWIDTH_RESUMED;
                    }
                } else {
                    performanceAlarmReason = PerformanceAlarmReason.BANDWIDTH_FALLBACKED;
                }
                IRTCEngineEventHandler rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler();
                if (rtcEngineHandler != null) {
                    if (i != 0) {
                        performanceAlarmMode = PerformanceAlarmMode.SIMULCAST;
                    } else {
                        performanceAlarmMode = PerformanceAlarmMode.NORMAL;
                    }
                    rtcEngineHandler.onPerformanceAlarms(performanceAlarmMode, str, performanceAlarmReason, new SourceWantedData(internalSourceWantedData));
                }
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPerformanceAlarms callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRecordingStateUpdate(StreamIndex streamIndex, int i, int i2, RecordingInfo recordingInfo) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRecordingStateUpdate, StreamIndex: ");
        LIZ.append(streamIndex);
        LIZ.append(", RecordingState: ");
        LIZ.append(i);
        LIZ.append(", RecordingErrorCode: ");
        LIZ.append(i2);
        LIZ.append(", info.filePath: ");
        LIZ.append(recordingInfo.filePath);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRecordingStateUpdate(streamIndex, RecordingState.fromId(i), RecordingErrorCode.fromId(i2), recordingInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRecordingStateUpdate callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRoomStateChanged(String str, String str2, int i, String str3) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onRoomStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRoomStateChanged(str, str2, i, str3);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRoomStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onStreamStateChanged(String str, String str2, int i, String str3) {
        IRTCEngineEventHandler rtcEngineHandler;
        LogUtil.d("RtcEngineEventHandler", "onStreamStateChanged...");
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamStateChanged(str, str2, i, str3);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStreamStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onVideoDeviceStateChanged(String str, VideoDeviceType videoDeviceType, int i, int i2) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoDeviceStateChanged, VideoDeviceType: ");
        LIZ.append(videoDeviceType);
        LIZ.append(", device_state: ");
        LIZ.append(i);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoDeviceStateChanged(str, videoDeviceType, i, i2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onVideoDeviceStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onSocks5ProxyState(int i, String str, String str2, String str3, String str4) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSocks5ProxyState, state: ");
        LIZ.append(i);
        LIZ.append(", cmd: ");
        LIZ.append(str);
        LIZ.append(", proxy_address: ");
        LIZ.append(str2);
        LIZ.append(", local_address: ");
        LIZ.append(str3);
        LIZ.append(", remote_address: ");
        LIZ.append(str4);
        LogUtil.i("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSocks5ProxyState(i, str, str2, str3, str4);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSocks5ProxyState callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onNetworkProbeResult(int i, int i2, int i3, double d, int i4, int i5) {
        IRTCEngineEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNetworkProbeResult: ");
        LIZ.append(i);
        LIZ.append(",");
        LIZ.append(i2);
        LIZ.append(",");
        LIZ.append(i3);
        LIZ.append(",");
        LIZ.append(d);
        LIZ.append(",");
        LIZ.append(i4);
        LIZ.append(",");
        LIZ.append(i5);
        LogUtil.d("RtcEngineEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCEngineImpl rTCEngineImpl = this.mRtcEngineImpl.get();
            if (rTCEngineImpl != null && (rtcEngineHandler = rTCEngineImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkDetectionResult(NetworkDetectionLinkType.values()[i], i2, i3, d, i4, i5);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onNetworkDetectionResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcEngineEventHandler", X1D.LIZIZ(LIZ2));
        }
    }
}
