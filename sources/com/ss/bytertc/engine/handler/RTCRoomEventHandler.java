package com.ss.bytertc.engine.handler;

import X.X1D;
import com.ss.bytertc.engine.InternalLocalStreamStats;
import com.ss.bytertc.engine.InternalNetworkQualityInfo;
import com.ss.bytertc.engine.InternalRTCStats;
import com.ss.bytertc.engine.InternalRemoteStreamStats;
import com.ss.bytertc.engine.RTCRoomImpl;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.data.AVSyncState;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.SetRoomExtraInfoResult;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import com.ss.bytertc.engine.type.SubtitleErrorCode;
import com.ss.bytertc.engine.type.SubtitleMessage;
import com.ss.bytertc.engine.type.SubtitleState;
import com.ss.bytertc.engine.type.UserVisibilityChangeError;
import com.ss.bytertc.engine.utils.LogUtil;
import java.nio.ByteBuffer;

/* loaded from: classes33.dex */
public class RTCRoomEventHandler {
    public RTCRoomImpl mRtcRoom;

    public void onPublishPrivilegeTokenWillExpire() {
        LogUtil.d("RtcRoomEventHandler", "onPublishPrivilegeTokenWillExpire");
        try {
            this.mRtcRoom.getRtcRoomHandler().onPublishPrivilegeTokenWillExpire();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onPublishPrivilegeTokenWillExpire callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onSubscribePrivilegeTokenWillExpire() {
        LogUtil.d("RtcRoomEventHandler", "onSubscribePrivilegeTokenWillExpire");
        try {
            this.mRtcRoom.getRtcRoomHandler().onSubscribePrivilegeTokenWillExpire();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSubscribePrivilegeTokenWillExpire callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onTokenWillExpire() {
        LogUtil.d("RtcRoomEventHandler", "onTokenWillExpire");
        try {
            this.mRtcRoom.getRtcRoomHandler().onTokenWillExpire();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onTokenWillExpire callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public RTCRoomEventHandler(RTCRoomImpl rTCRoomImpl) {
        this.mRtcRoom = rTCRoomImpl;
    }

    public static ByteBuffer allocateDirectByteBuffer(int i) {
        return ByteBuffer.allocateDirect(i);
    }

    public void onAVSyncStateChange(AVSyncState aVSyncState) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onAVSyncStateChange: ");
        LIZ.append(aVSyncState);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onAVSyncStateChange(aVSyncState);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAVSyncStateChange callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
        LogUtil.d("RtcRoomEventHandler", "onForwardStreamEvent");
        try {
            this.mRtcRoom.getRtcRoomHandler().onForwardStreamEvent(forwardStreamEventInfoArr);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onForwardStreamEvent callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
        LogUtil.d("RtcRoomEventHandler", "OnForwardStreamStateChanged");
        try {
            this.mRtcRoom.getRtcRoomHandler().onForwardStreamStateChanged(forwardStreamStateInfoArr);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onForwardStreamStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onLeaveRoom(InternalRTCStats internalRTCStats) {
        LogUtil.d("RtcRoomEventHandler", "onLeaveRoom...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLeaveRoom(new RTCRoomStats(internalRTCStats));
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLeaveRoom callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onLocalStreamStats(InternalLocalStreamStats internalLocalStreamStats) {
        LogUtil.d("RtcRoomEventHandler", "onLocalStreamStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onLocalStreamStats(new LocalStreamStats(internalLocalStreamStats));
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onLocalStreamStats callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onRemoteStreamStats(InternalRemoteStreamStats internalRemoteStreamStats) {
        LogUtil.d("RtcRoomEventHandler", "onRemoteStreamStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRemoteStreamStats(new RemoteStreamStats(internalRemoteStreamStats));
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRemoteStreamStats callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onRoomError(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomError...errorNum: ");
        LIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomError(i);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRoomError callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRoomStats(InternalRTCStats internalRTCStats) {
        LogUtil.d("RtcRoomEventHandler", "onRtcStats...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomStats(new RTCRoomStats(internalRTCStats));
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRtcStats callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onRoomWarning(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomWarning, warnNum: ");
        LIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomWarning(i);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRoomWarning callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onStreamAdd(RTCStream rTCStream) {
        LogUtil.d("RtcRoomEventHandler", "onStreamAdd...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamAdd(rTCStream);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStreamAdd callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onSubtitleMessageReceived(SubtitleMessage[] subtitleMessageArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSubtitleMessageReceived, subtitles length: ");
        LIZ.append(subtitleMessageArr.length);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onSubtitleMessageReceived(subtitleMessageArr);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSubtitleMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onAudioStreamBanned(String str, boolean z) {
        String str2;
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
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onAudioStreamBanned(str, z);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAudioStreamBanned callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onNetworkQuality(InternalNetworkQualityInfo internalNetworkQualityInfo, InternalNetworkQualityInfo[] internalNetworkQualityInfoArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Local onNetworkQuality, uid: ");
        LIZ.append(internalNetworkQualityInfo.uid);
        LIZ.append(", info: ");
        LIZ.append(internalNetworkQualityInfo.toString());
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            IRTCRoomEventHandler rtcRoomHandler = this.mRtcRoom.getRtcRoomHandler();
            if (rtcRoomHandler != null) {
                NetworkQualityStats[] networkQualityStatsArr = new NetworkQualityStats[internalNetworkQualityInfoArr.length];
                for (int i = 0; i < internalNetworkQualityInfoArr.length; i++) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("Remote onNetworkQuality, uid: ");
                    LIZ2.append(internalNetworkQualityInfoArr[i].uid);
                    LIZ2.append(", info: ");
                    LIZ2.append(internalNetworkQualityInfoArr[i].toString());
                    LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
                    networkQualityStatsArr[i] = new NetworkQualityStats(internalNetworkQualityInfoArr[i]);
                }
                rtcRoomHandler.onNetworkQuality(new NetworkQualityStats(internalNetworkQualityInfo), networkQualityStatsArr);
            }
        } catch (Exception e) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("onNetworkQuality callback catch exception.\n");
            LIZ3.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ3));
        }
    }

    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomBinaryMessageReceived, length: ");
        LIZ.append(byteBuffer.capacity());
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomBinaryMessageReceived(str, byteBuffer);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRoomBinaryMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRoomMessageReceived(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomMessageReceived: ");
        LIZ.append(str2);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomMessageReceived(str, str2);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRoomMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRoomMessageSendResult(long j, int i) {
        LogUtil.d("RtcRoomEventHandler", "onRoomMessageSendResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomMessageSendResult(j, i);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRoomMessageSendResult callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onSetRoomExtraInfoResult(long j, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSetRoomExtraInfoResult,result:");
        LIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onSetRoomExtraInfoResult(j, SetRoomExtraInfoResult.fromId(i));
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSetRoomExtraInfoResult callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onStreamPublishSuccess(String str, boolean z) {
        LogUtil.d("RtcRoomEventHandler", "onStreamPublishSuccess...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamPublishSuccess(str, z);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStreamPublishSuccess callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onStreamRemove(RTCStream rTCStream, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStreamRemove...uid: ");
        LIZ.append(rTCStream.userId);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamRemove(rTCStream, StreamRemoveReason.values()[i]);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onStreamRemove callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserBinaryMessageReceived: uid:");
        LIZ.append(str);
        LIZ.append("binary message length");
        LIZ.append(byteBuffer.capacity());
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserBinaryMessageReceived(str, byteBuffer);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserBinaryMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserJoined(UserInfo userInfo, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserJoined... uid: ");
        LIZ.append(userInfo.getUid());
        LIZ.append(", extraInfo: ");
        LIZ.append(userInfo.getExtraInfo());
        LIZ.append(", elapsed: ");
        LIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserJoined(userInfo, i);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserJoined callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserLeave(String str, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserLeave... uid: ");
        LIZ.append(str);
        LIZ.append(", reason: ");
        LIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserLeave(str, i);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserLeave callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserMessageReceived(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserMessageReceived: uid:");
        LIZ.append(str);
        LIZ.append("message");
        LIZ.append(str2);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMessageReceived(str, str2);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserMessageReceived callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserMessageSendResult(long j, int i) {
        LogUtil.d("RtcRoomEventHandler", "onUserMessageSendResult...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserMessageSendResult(j, i);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onUserMessageSendResult callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onUserPublishScreen(String str, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserPublishScreen... uid: ");
        LIZ.append(str);
        LIZ.append(", type: ");
        LIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserPublishScreen(str, MediaStreamType.valueOf(i));
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserPublishScreen callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserPublishStream(String str, int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserPublishStream... uid: ");
        LIZ.append(str);
        LIZ.append(", type: ");
        LIZ.append(i);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserPublishStream(str, MediaStreamType.valueOf(i));
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserPublishStream callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserVisibilityChanged(boolean z, UserVisibilityChangeError userVisibilityChangeError) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserVisibilityChanged, currentUserVisibility:");
        LIZ.append(z);
        LIZ.append(", errorCode:");
        LIZ.append(userVisibilityChangeError);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserVisibilityChanged(z, userVisibilityChangeError);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserVisibilityChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onVideoStreamBanned(String str, boolean z) {
        String str2;
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
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onVideoStreamBanned(str, z);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onVideoStreamBanned callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
        LogUtil.d("RtcRoomEventHandler", "onStreamSubscribed...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamSubscribed(i, str, subscribeConfig);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStreamSubscribed callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onSubtitleStateChanged(int i, int i2, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSubtitleStateChanged, state: ");
        LIZ.append(i);
        LIZ.append(", errorCode: ");
        LIZ.append(i2);
        LIZ.append(", errorMessage: ");
        LIZ.append(str);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onSubtitleStateChanged(SubtitleState.fromId(i), SubtitleErrorCode.fromId(i2), str);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSubtitleStateChanged callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserUnpublishScreen(String str, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserUnPublishScreen... uid: ");
        LIZ.append(str);
        LIZ.append(", type: ");
        LIZ.append(i);
        LIZ.append(", reasen:");
        LIZ.append(i2);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserUnpublishScreen(str, MediaStreamType.valueOf(i), StreamRemoveReason.values()[i2]);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserUnPublishScreen callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onUserUnpublishStream(String str, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onUserUnPublishStream... uid: ");
        LIZ.append(str);
        LIZ.append(", type: ");
        LIZ.append(i);
        LIZ.append(", reasen:");
        LIZ.append(i2);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onUserUnpublishStream(str, MediaStreamType.valueOf(i), StreamRemoveReason.values()[i2]);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onUserUnPublishStream callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRoomExtraInfoUpdate(String str, String str2, String str3, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRoomExtraInfoUpdate , key:");
        LIZ.append(str);
        LIZ.append(",value:");
        LIZ.append(str2);
        LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomExtraInfoUpdate(str, str2, str3, j);
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onRoomExtraInfoUpdate callback catch exception.\n");
            LIZ2.append(e.getMessage());
            LogUtil.e("RtcRoomEventHandler", X1D.LIZIZ(LIZ2));
        }
    }

    public void onRoomStateChanged(String str, String str2, int i, String str3) {
        LogUtil.d("RtcRoomEventHandler", "onRoomStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onRoomStateChanged(str, str2, i, str3);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRoomStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }

    public void onStreamStateChanged(String str, String str2, int i, String str3) {
        LogUtil.d("RtcRoomEventHandler", "onStreamStateChanged...");
        try {
            this.mRtcRoom.getRtcRoomHandler().onStreamStateChanged(str, str2, i, str3);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onStreamStateChanged callback catch exception.\n");
            LIZ.append(e.getMessage());
            LogUtil.d("RtcRoomEventHandler", X1D.LIZIZ(LIZ));
        }
    }
}
