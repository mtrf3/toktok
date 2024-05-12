package com.ss.bytertc.engine.handler;

import X.V0N;
import X.X1D;
import com.ss.bytertc.engine.InternalRTCUser;
import com.ss.bytertc.engine.InternalRemoteStreamSwitch;
import com.ss.bytertc.engine.InternalSourceWantedData;
import com.ss.bytertc.engine.SysStats;
import com.ss.bytertc.engine.data.AudioMixingError;
import com.ss.bytertc.engine.data.AudioMixingState;
import com.ss.bytertc.engine.data.AudioPlaybackDevice;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.DataMessageSourceType;
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
import com.ss.bytertc.engine.data.VideoDenoiseMode;
import com.ss.bytertc.engine.data.VideoDenoiseModeChangedReason;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.data.VideoSuperResolutionModeChangedReason;
import com.ss.bytertc.engine.engineimpl.RTCVideoImpl;
import com.ss.bytertc.engine.type.AudioDeviceType;
import com.ss.bytertc.engine.type.AudioDumpStatus;
import com.ss.bytertc.engine.type.AudioRecordingErrorCode;
import com.ss.bytertc.engine.type.AudioRecordingState;
import com.ss.bytertc.engine.type.EchoTestResult;
import com.ss.bytertc.engine.type.FirstFramePlayState;
import com.ss.bytertc.engine.type.FirstFrameSendState;
import com.ss.bytertc.engine.type.HardwareEchoDetectionResult;
import com.ss.bytertc.engine.type.LocalProxyError;
import com.ss.bytertc.engine.type.LocalProxyState;
import com.ss.bytertc.engine.type.LocalProxyType;
import com.ss.bytertc.engine.type.LocalVideoStreamError;
import com.ss.bytertc.engine.type.LocalVideoStreamState;
import com.ss.bytertc.engine.type.NetworkDetectionLinkType;
import com.ss.bytertc.engine.type.NetworkDetectionStopReason;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.PublicStreamErrorCode;
import com.ss.bytertc.engine.type.RecordingErrorCode;
import com.ss.bytertc.engine.type.RecordingState;
import com.ss.bytertc.engine.type.RemoteStreamSwitch;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.bytertc.engine.type.RtcUser;
import com.ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.type.VideoDeviceType;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes33.dex */
public class RTCVideoEventHandler {
    public long mJoinChannelTime;
    public WeakReference<RTCVideoImpl> mRTCVideoImpl;
    public String mRoom;
    public String mSession;
    public State mState = State.IDLE;
    public String mUser;

    public void onLogout() {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onLogout");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLogout();
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLogout callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onNetworkTimeSynchronized() {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onNetworkTimeSynchronized...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkTimeSynchronized();
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onNetworkTimeSynchronized callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
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

    public RTCVideoEventHandler(RTCVideoImpl rTCVideoImpl) {
        this.mRTCVideoImpl = new WeakReference<>(rTCVideoImpl);
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public void onAudioDumpStateChanged(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioDumpStateChanged...status: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                AudioDumpStatus audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_START_FAILURE;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i == 5) {
                                        audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_RUNNING_SUCCESS;
                                    }
                                } else {
                                    audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_RUNNING_FAILURE;
                                }
                            } else {
                                audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_STOP_SUCCESS;
                            }
                        } else {
                            audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_STOP_FAILURE;
                        }
                    } else {
                        audioDumpStatus = AudioDumpStatus.AUDIO_DUMP_START_SUCCESS;
                    }
                }
                rtcEngineHandler.onAudioDumpStateChanged(audioDumpStatus);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioDumpStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onAudioPlaybackDeviceChanged(AudioPlaybackDevice audioPlaybackDevice) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioPlaybackDeviceChanged...device: ");
        LIZ.append(audioPlaybackDevice.value());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioPlaybackDeviceChanged(audioPlaybackDevice);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioPlaybackDeviceChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onAudioPlaybackDeviceTestVolume(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onAudioPlaybackDeviceTestVolume");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioPlaybackDeviceTestVolume(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onAudioPlaybackDeviceTestVolume callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onAudioRouteChanged(AudioRoute audioRoute) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioRouteChanged...device: ");
        LIZ.append(audioRoute.value());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioRouteChanged(audioRoute);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioRouteChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onCloudProxyConnected(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCloudProxyConnected, interval: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onCloudProxyConnected(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onCloudProxyConnected callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onConnectionStateChanged(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConnectionStateChanged, state: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onConnectionStateChanged(i, -1);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onConnectionStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onEchoTestResult(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onEchoTestResult...error code: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
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
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onError(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError...errorNum: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onError(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onError callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstLocalAudioFrame...streamIndex: ");
        LIZ.append(streamIndex.value());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalAudioFrame(streamIndex);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstLocalAudioFrame callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstPublicStreamAudioFrame(String str) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstPublicStreamAudioFrame...streamid: ");
        LIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstPublicStreamAudioFrame(str);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstPublicStreamAudioFrame callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstRemoteAudioFrame(RemoteStreamKey remoteStreamKey) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteAudioFrame...uid: ");
        LIZ.append(remoteStreamKey.getUserId());
        LIZ.append(", roomid: ");
        LIZ.append(remoteStreamKey.getRoomId());
        LIZ.append(", streamIndex: ");
        LIZ.append(remoteStreamKey.getStreamIndex().value());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteAudioFrame(remoteStreamKey);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstRemoteAudioFrame callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onHardwareEchoDetectionResult(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHardwareEchoDetectionResult...result code: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                HardwareEchoDetectionResult hardwareEchoDetectionResult = HardwareEchoDetectionResult.HARDWARE_ECHO_RESULT_NORMAL;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 3) {
                            hardwareEchoDetectionResult = HardwareEchoDetectionResult.HARDWARE_ECHO_RESULT_POOR;
                        }
                    } else {
                        hardwareEchoDetectionResult = HardwareEchoDetectionResult.HARDWARE_ECHO_RESULT_UNKNOWN;
                    }
                } else {
                    hardwareEchoDetectionResult = HardwareEchoDetectionResult.HARDWARE_ECHO_RESULT_CANCELED;
                }
                rtcEngineHandler.onHardwareEchoDetectionResult(hardwareEchoDetectionResult);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onHardwareEchoDetectionResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onHttpProxyState(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHttpProxyState, state: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onHttpProxyState(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onHttpProxyState callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onHttpsProxyState(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onHttpsProxyState, state: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onHttpsProxyState(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onHttpsProxyState callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onInvokeExperimentalAPI(String str) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInvokeExperimentalAPI...param: ");
        LIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onInvokeExperimentalAPI(str);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onInvokeExperimentalAPI callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onLicenseWillExpire(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLicenseWillExpire, days: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLicenseWillExpire(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLicenseWillExpire callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onLocalAudioPropertiesReport");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalAudioPropertiesReport(localAudioPropertiesInfoArr);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLocalAudioPropertiesReport callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onNetworkProbeStopped(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNetworkProbeStopped: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkDetectionStopped(NetworkDetectionStopReason.values()[i]);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onNetworkDetectionStopped callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onNetworkTypeChanged(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onNetworkTypeChanged, type: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkTypeChanged(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onNetworkTypeChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onServerParamsSetResult(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onServerParamsSetResult: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onServerParamsSetResult(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onServerParamsSetResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onSimulcastSubscribeFallback(InternalRemoteStreamSwitch internalRemoteStreamSwitch) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSimulcastSubscribeFallback, uid: ");
        LIZ.append(internalRemoteStreamSwitch.uid);
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
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSimulcastSubscribeFallback(new RemoteStreamSwitch(internalRemoteStreamSwitch));
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onNetworkTypeChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onSysStats(SysStats sysStats) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSysStats... ");
        LIZ.append(sysStats.toString());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSysStats(sysStats);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSysStats callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onWarning(int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onWarning, warnNum: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onWarning(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onWarning callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void setJoinChannelTime(long j) {
        this.mJoinChannelTime = j;
    }

    public void onActiveSpeaker(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onActiveSpeaker");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onActiveSpeaker(str, str2);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onActiveSpeaker callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onAudioMixingPlayingProgress(int i, long j) {
        IRTCVideoEventHandler rtcEngineHandler;
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioMixingPlayingProgress(i, j);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onAudioMixingPlayingProgress callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onAudioRecordingStateUpdate(int i, int i2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioRecordingStateUpdate, state: ");
        LIZ.append(i);
        LIZ.append(", errorCode: ");
        LIZ.append(i2);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioRecordingStateUpdate(AudioRecordingState.fromId(i), AudioRecordingErrorCode.fromId(i2));
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioRecordingStateUpdate callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onCreateRoomStateChanged(String str, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onCreateRoomStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onCreateRoomStateChanged(str, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onCreateRoomStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onExtensionAccessError(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onExtensionAccessError(str, str2);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onExtensionAccessError callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstLocalVideoFrame...width: ");
        LIZ.append(videoFrameInfo.getWidth());
        LIZ.append(", height: ");
        LIZ.append(videoFrameInfo.getHeight());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstLocalVideoFrame callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstPublicStreamVideoFrameDecoded(String str, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstPublicStreamVideoFrameDecoded...streamid: ");
        LIZ.append(str);
        LIZ.append(", width: ");
        LIZ.append(videoFrameInfo.getWidth());
        LIZ.append(", height: ");
        LIZ.append(videoFrameInfo.getHeight());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstPublicStreamVideoFrameDecoded(str, videoFrameInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstPublicStreamVideoFrameDecoded callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstRemoteVideoFrameDecoded(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrameDecoded...uid: ");
        LIZ.append(remoteStreamKey.getUserId());
        LIZ.append(", StreamIndex:");
        LIZ.append(remoteStreamKey.getStreamIndex());
        LIZ.append(", width: ");
        LIZ.append(videoFrameInfo.getWidth());
        LIZ.append(", height: ");
        LIZ.append(videoFrameInfo.getHeight());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteVideoFrameDecoded(remoteStreamKey, videoFrameInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstRemoteVideoFrameDecoded callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onFirstRemoteVideoFrameRendered(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onFirstRemoteVideoFrameRendered...uid: ");
        LIZ.append(remoteStreamKey.getUserId());
        LIZ.append(", StreamIndex:");
        LIZ.append(remoteStreamKey.getStreamIndex());
        LIZ.append(", width: ");
        LIZ.append(videoFrameInfo.getWidth());
        LIZ.append(", height: ");
        LIZ.append(videoFrameInfo.getHeight());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onFirstRemoteVideoFrameRendered(remoteStreamKey, videoFrameInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onFirstRemoteVideoFrameRendered callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onGetPeerOnlineStatus(String str, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onGetPeerOnlineStatus: ");
        LIZ.append(str);
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onGetPeerOnlineStatus(str, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onGetPeerOnlineStatus callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onLocalAudioStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLocalAudioStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLocalVideoSizeChanged... streamIndex: ");
        LIZ.append(streamIndex);
        LIZ.append(", frameInfo: ");
        LIZ.append(videoFrameInfo);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLocalVideoSizeChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onLogReport(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        try {
            if ("live_webrtc_monitor_log".equals(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
                    if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                        rtcEngineHandler.onLogReport(str, jSONObject);
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("onLogReport...parse json catch exception: ");
                    LIZ.append(e.getMessage());
                    LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
                    return;
                }
            }
            LogUtil.i(str, str2);
        } catch (Exception e2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLogReport callback catch exception.\n");
            LIZ2.append(e2.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onPlayPublicStreamResult(String str, PublicStreamErrorCode publicStreamErrorCode) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPlayPublicStreamError error(");
        LIZ.append(publicStreamErrorCode);
        LIZ.append(") streamId:");
        LIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onPlayPublicStreamResult(str, publicStreamErrorCode);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPlayPublicStreamError callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onRemoteAudioPropertiesReport");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteAudioPropertiesReport(remoteAudioPropertiesInfoArr, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRemoteAudioPropertiesReport callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onRemoteVideoSizeChanged(RemoteStreamKey remoteStreamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRemoteVideoSizeChanged... RemoteStreamKey: ");
        LIZ.append(remoteStreamKey);
        LIZ.append(", frameInfo: ");
        LIZ.append(videoFrameInfo);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoSizeChanged(remoteStreamKey, videoFrameInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRemoteVideoSizeChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onSEIMessageReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSEIMessageReceived");
        LIZ.append(remoteStreamKey.getRoomId());
        LIZ.append(remoteStreamKey.getUserId());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSEIMessageReceived(remoteStreamKey, byteBuffer);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSEIMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onSEIStreamUpdate(RemoteStreamKey remoteStreamKey, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSEIStreamUpdate");
        LIZ.append(remoteStreamKey.getRoomId());
        LIZ.append(remoteStreamKey.getUserId());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSEIStreamUpdate(remoteStreamKey, SEIStreamUpdateEvent.values()[i]);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSEIStreamUpdate callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserBinaryMessageReceivedOutsideRoom(String str, ByteBuffer byteBuffer) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserBinaryMessageReceivedOutsideRoom: ");
        LIZ.append(str);
        LIZ.append(byteBuffer.capacity());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserBinaryMessageReceivedOutsideRoom(str, byteBuffer);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserBinaryMessageReceivedOutsideRoom callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserMessageReceivedOutsideRoom(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMessageReceivedOutsideRoom: ");
        LIZ.append(str);
        LIZ.append(str2);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageReceivedOutsideRoom(str, str2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserMessageReceivedOutsideRoom callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserMessageSendResultOutsideRoom(long j, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMessageSendResultOutsideRoom: ");
        LIZ.append(j);
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMessageSendResultOutsideRoom(j, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserMessageSendResultOutsideRoom callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserStartAudioCapture(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserStartAudioCapture... uid: ");
        LIZ.append(str2);
        LIZ.append(", roomId: ");
        LIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStartAudioCapture(str, str2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserStartAudioCapture callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserStartVideoCapture(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserStartVideoCapture... uid: ");
        LIZ.append(str2);
        LIZ.append(", roomId: ");
        LIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStartVideoCapture(str, str2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserStartVideoCapture callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserStopAudioCapture(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserStopAudioCapture... uid: ");
        LIZ.append(str2);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStopAudioCapture(str, str2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserStopAudioCapture callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserStopVideoCapture(String str, String str2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserStopVideoCapture... uid: ");
        LIZ.append(str2);
        LIZ.append(", roomId: ");
        LIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserStopVideoCapture(str, str2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserStopVideoCapture callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onVideoDenoiseModeChanged(VideoDenoiseMode videoDenoiseMode, VideoDenoiseModeChangedReason videoDenoiseModeChangedReason) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onVideoDenoiseModeChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoDenoiseModeChanged(videoDenoiseMode, videoDenoiseModeChangedReason);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onVideoDenoiseModeChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onAudioDeviceWarning(String str, AudioDeviceType audioDeviceType, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioDeviceWarning, AudioDeviceType: ");
        LIZ.append(audioDeviceType);
        LIZ.append(", device_warning ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioDeviceWarning(str, audioDeviceType, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioDeviceWarning callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onAudioFramePlayStateChanged(String str, InternalRTCUser internalRTCUser, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioFramePlayStateChanged, user: ");
        LIZ.append(internalRTCUser);
        LIZ.append(", state: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
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
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFramePlayStateChanged(str, new RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcVideoEventHandler", "onAudioFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onAudioFrameSendStateChanged(String str, InternalRTCUser internalRTCUser, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioFrameSendStateChanged, user: ");
        LIZ.append(internalRTCUser);
        LIZ.append(", state: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
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
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioFrameSendStateChanged(str, new RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcVideoEventHandler", "onAudioFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onAudioMixingStateChanged(int i, AudioMixingState audioMixingState, AudioMixingError audioMixingError) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioMixingStateChanged... mixId: ");
        LIZ.append(i);
        LIZ.append(", state: ");
        LIZ.append(audioMixingState.value());
        LIZ.append(", error: ");
        LIZ.append(audioMixingError.value());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioMixingStateChanged(i, audioMixingState, audioMixingError);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioMixingStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onLocalProxyStateChanged(LocalProxyType localProxyType, LocalProxyState localProxyState, LocalProxyError localProxyError) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLocalProxyStateChanged...: ");
        LIZ.append(localProxyType.value());
        LIZ.append(", state: ");
        LIZ.append(localProxyState.value());
        LIZ.append(", error: ");
        LIZ.append(localProxyError.value());
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalProxyStateChanged(localProxyType, localProxyState, localProxyError);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLocalProxyStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onLocalVideoStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLocalVideoStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onLoginResult(String str, int i, int i2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OnLoginResult: ");
        LIZ.append(str);
        LIZ.append(i);
        LIZ.append(i2);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onLoginResult(str, i, i2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onLoginResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onMediaDeviceWarning(String str, int i, int i2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMediaDeviceWarning, MediaDeviceType: ");
        LIZ.append(i);
        LIZ.append(", device_warning ");
        LIZ.append(i2);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMediaDeviceWarning(str, i, i2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onMediaDeviceWarning callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onPublicStreamDataMessageReceived(String str, ByteBuffer byteBuffer, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPublicStreamDataMessageReceived, streamid");
        LIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onPublicStreamDataMessageReceived(str, byteBuffer, DataMessageSourceType.fromId(i));
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPublicStreamDataMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onPublicStreamSEIMessageReceived(String str, ByteBuffer byteBuffer, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPublicStreamSEIMessageReceived, streamid");
        LIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onPublicStreamSEIMessageReceived(str, byteBuffer, DataMessageSourceType.fromId(i));
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPublicStreamSEIMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onPushPublicStreamResult(String str, String str2, PublicStreamErrorCode publicStreamErrorCode) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPushPublicStreamError error(");
        LIZ.append(publicStreamErrorCode.value());
        LIZ.append(") streamId:");
        LIZ.append(str2);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onPushPublicStreamResult(str, str2, publicStreamErrorCode);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onPushPublicStreamError callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRecordingProgressUpdate(StreamIndex streamIndex, RecordingProgress recordingProgress, RecordingInfo recordingInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRecordingProgressUpdate, StreamIndex: ");
        LIZ.append(streamIndex);
        LIZ.append(", progress.dur: ");
        LIZ.append(recordingProgress.duration);
        LIZ.append(", progress.fileSize: ");
        LIZ.append(recordingProgress.fileSize);
        LIZ.append(", info.filePath: ");
        LIZ.append(recordingInfo.filePath);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRecordingProgressUpdate(streamIndex, recordingProgress, recordingInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRecordingProgressUpdate callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRemoteAudioStateChanged(RemoteStreamKey remoteStreamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onRemoteAudioStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteAudioStateChanged(remoteStreamKey, remoteAudioState, remoteAudioStateChangeReason);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRemoteAudioStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onRemoteVideoStateChanged(RemoteStreamKey remoteStreamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onRemoteVideoStateChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoStateChanged(remoteStreamKey, remoteVideoState, remoteVideoStateChangeReason);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRemoteVideoStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onRemoteVideoSuperResolutionModeChanged(RemoteStreamKey remoteStreamKey, VideoSuperResolutionMode videoSuperResolutionMode, VideoSuperResolutionModeChangedReason videoSuperResolutionModeChangedReason) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onRemoteVideoSuperResolutionModeChanged...");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRemoteVideoSuperResolutionModeChanged(remoteStreamKey, videoSuperResolutionMode, videoSuperResolutionModeChangedReason);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRemoteVideoSuperResolutionModeChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onScreenVideoFramePlayStateChanged(String str, InternalRTCUser internalRTCUser, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScreenVideoFramePlayStateChanged, user: ");
        LIZ.append(internalRTCUser);
        LIZ.append(", state: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
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
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenVideoFramePlayStateChanged(str, new RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcVideoEventHandler", "onScreenVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onScreenVideoFrameSendStateChanged(String str, InternalRTCUser internalRTCUser, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onScreenVideoFrameSendStateChanged, user: ");
        LIZ.append(internalRTCUser);
        LIZ.append(", state: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
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
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onScreenVideoFrameSendStateChanged(str, new RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcVideoEventHandler", "onScreenVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onServerMessageSendResult(long j, int i, ByteBuffer byteBuffer) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onServerMessageSendResult: ");
        LIZ.append(j);
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onServerMessageSendResult(j, i, byteBuffer);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onServerMessageSendResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onStreamSyncInfoReceived(RemoteStreamKey remoteStreamKey, ByteBuffer byteBuffer, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        LogUtil.d("RtcVideoEventHandler", "onStreamSyncInfoReceived");
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onStreamSyncInfoReceived(remoteStreamKey, StreamSycnInfoConfig.SyncInfoStreamType.SYNC_INFO_STREAM_TYPE_AUDIO, byteBuffer);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStreamSyncInfoReceived callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onUserMuteAudio(String str, String str2, MuteState muteState) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMuteAudio... uid: ");
        LIZ.append(str2);
        LIZ.append(", muteState: ");
        LIZ.append(muteState.value());
        LIZ.append(", roomId: ");
        LIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMuteAudio(str, str2, muteState);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserMuteAudio callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserMuteVideo(String str, String str2, MuteState muteState) {
        boolean z;
        IRTCVideoEventHandler rtcEngineHandler;
        if (muteState == MuteState.MUTE_STATE_ON) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMuteVideo... uid: ");
        LIZ.append(str2);
        LIZ.append(", muted: ");
        LIZ.append(z);
        LIZ.append(", roomId: ");
        LIZ.append(str);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onUserMuteVideo(str, str2, muteState);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserMuteVideo callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onVideoDeviceWarning(String str, VideoDeviceType videoDeviceType, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoDeviceWarning, VideoDeviceType: ");
        LIZ.append(videoDeviceType);
        LIZ.append(", device_warning ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoDeviceWarning(str, videoDeviceType, i);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onVideoDeviceWarning callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onVideoFramePlayStateChanged(String str, InternalRTCUser internalRTCUser, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoFramePlayStateChanged, user: ");
        LIZ.append(internalRTCUser);
        LIZ.append(", state: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
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
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFramePlayStateChanged(str, new RtcUser(internalRTCUser), firstFramePlayState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcVideoEventHandler", "onVideoFramePlayStateChanged callback catch exception.\n");
        }
    }

    public void onVideoFrameSendStateChanged(String str, InternalRTCUser internalRTCUser, int i) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoFrameSendStateChanged, user: ");
        LIZ.append(internalRTCUser);
        LIZ.append(", state: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
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
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoFrameSendStateChanged(str, new RtcUser(internalRTCUser), firstFrameSendState);
            }
        } catch (Exception unused) {
            LogUtil.e("RtcVideoEventHandler", "onVideoFrameSendStateChanged callback catch exception.\n");
        }
    }

    public void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i, int i2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAudioDeviceStateChanged, AudioDeviceType: ");
        LIZ.append(audioDeviceType);
        LIZ.append(", device_state: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onAudioDeviceStateChanged(str, audioDeviceType, i, i2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioDeviceStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onMediaDeviceStateChanged(String str, int i, int i2, int i3) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onMediaDeviceStateChanged, MediaDeviceType: ");
        LIZ.append(i);
        LIZ.append(", device_state: ");
        LIZ.append(i2);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onMediaDeviceStateChanged(str, i, i2, i3);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onMediaDeviceStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
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
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null) {
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
                IRTCVideoEventHandler rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler();
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
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRecordingStateUpdate(StreamIndex streamIndex, int i, int i2, RecordingInfo recordingInfo) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRecordingStateUpdate, StreamIndex: ");
        LIZ.append(streamIndex);
        LIZ.append(", RecordingState: ");
        LIZ.append(i);
        LIZ.append(", RecordingErrorCode: ");
        LIZ.append(i2);
        LIZ.append(", info.filePath: ");
        LIZ.append(recordingInfo.filePath);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onRecordingStateUpdate(streamIndex, RecordingState.fromId(i), RecordingErrorCode.fromId(i2), recordingInfo);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRecordingStateUpdate callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onVideoDeviceStateChanged(String str, VideoDeviceType videoDeviceType, int i, int i2) {
        IRTCVideoEventHandler rtcEngineHandler;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoDeviceStateChanged, VideoDeviceType: ");
        LIZ.append(videoDeviceType);
        LIZ.append(", device_state: ");
        LIZ.append(i);
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onVideoDeviceStateChanged(str, videoDeviceType, i, i2);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onVideoDeviceStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onSocks5ProxyState(int i, String str, String str2, String str3, String str4) {
        IRTCVideoEventHandler rtcEngineHandler;
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
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onSocks5ProxyState(i, str, str2, str3, str4);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSocks5ProxyState callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onNetworkProbeResult(int i, int i2, int i3, double d, int i4, int i5) {
        IRTCVideoEventHandler rtcEngineHandler;
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
        LogUtil.d("RtcVideoEventHandler", X1D.LIZIZ(LIZ));
        try {
            RTCVideoImpl rTCVideoImpl = this.mRTCVideoImpl.get();
            if (rTCVideoImpl != null && (rtcEngineHandler = rTCVideoImpl.getRtcEngineHandler()) != null) {
                rtcEngineHandler.onNetworkDetectionResult(NetworkDetectionLinkType.values()[i], i2, i3, d, i4, i5);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onNetworkDetectionResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcVideoEventHandler", X1D.LIZIZ(LIZ2));
        }
    }
}
