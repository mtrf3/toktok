package com.ss.avframework.livestreamv2.core.interact.livertc;

import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.data.AVSyncState;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class RTCRoomHandlerProxy extends IRTCRoomEventHandler {
    public WeakReference<IRTCRoomEventHandler> mHandler;

    public IRTCRoomEventHandler getHandler() {
        WeakReference<IRTCRoomEventHandler> weakReference = this.mHandler;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onTokenWillExpire() {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onTokenWillExpire();
        }
    }

    public RTCRoomHandlerProxy(IRTCRoomEventHandler iRTCRoomEventHandler) {
        this.mHandler = new WeakReference<>(iRTCRoomEventHandler);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onAVSyncStateChange(AVSyncState aVSyncState) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onAVSyncStateChange(aVSyncState);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onForwardStreamEvent(forwardStreamEventInfoArr);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onForwardStreamStateChanged(forwardStreamStateInfoArr);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onLeaveRoom(RTCRoomStats rTCRoomStats) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLeaveRoom(rTCRoomStats);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onLocalStreamStats(LocalStreamStats localStreamStats) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onLocalStreamStats(localStreamStats);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRemoteStreamStats(remoteStreamStats);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomError(int i) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRoomError(i);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomStats(RTCRoomStats rTCRoomStats) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRoomStats(rTCRoomStats);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomWarning(int i) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRoomWarning(i);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamAdd(RTCStream rTCStream) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onStreamAdd(rTCStream);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onAudioStreamBanned(String str, boolean z) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onAudioStreamBanned(str, z);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onNetworkQuality(networkQualityStats, networkQualityStatsArr);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRoomBinaryMessageReceived(str, byteBuffer);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomMessageReceived(String str, String str2) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRoomMessageReceived(str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomMessageSendResult(long j, int i) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRoomMessageSendResult(j, i);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamPublishSuccess(String str, boolean z) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onStreamPublishSuccess(str, z);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onStreamRemove(rTCStream, streamRemoveReason);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserBinaryMessageReceived(str, byteBuffer);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserJoined(UserInfo userInfo, int i) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserJoined(userInfo, i);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserLeave(String str, int i) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserLeave(str, i);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserMessageReceived(String str, String str2) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserMessageReceived(str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserMessageSendResult(long j, int i) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserMessageSendResult(j, i);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserPublishScreen(String str, MediaStreamType mediaStreamType) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserPublishScreen(str, mediaStreamType);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserPublishStream(String str, MediaStreamType mediaStreamType) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserPublishStream(str, mediaStreamType);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onVideoStreamBanned(String str, boolean z) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onVideoStreamBanned(str, z);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onStreamSubscribed(i, str, subscribeConfig);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserUnpublishScreen(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserUnpublishScreen(str, mediaStreamType, streamRemoveReason);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onUserUnpublishStream(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onUserUnpublishStream(str, mediaStreamType, streamRemoveReason);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onRoomStateChanged(String str, String str2, int i, String str3) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onRoomStateChanged(str, str2, i, str3);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public void onStreamStateChanged(String str, String str2, int i, String str3) {
        IRTCRoomEventHandler handler = getHandler();
        if (handler != null) {
            handler.onStreamStateChanged(str, str2, i, str3);
        }
    }
}
