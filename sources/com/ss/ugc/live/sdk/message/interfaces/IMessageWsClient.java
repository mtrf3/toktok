package com.ss.ugc.live.sdk.message.interfaces;

import X.C64972Pei;
import X.XM9;
import X.YME;
import X.YMF;
import X.YMT;
import android.content.Context;
import com.ss.ugc.live.sdk.message.data.PayloadItem;
import com.ss.ugc.live.sdk.message.data.ProtoApiResult;
import java.util.Map;

/* loaded from: classes16.dex */
public interface IMessageWsClient extends YMT {

    /* loaded from: classes16.dex */
    public interface Callback {
        void onApiError(Exception exc, int i);

        void onApiSuccess(ProtoApiResult protoApiResult, int i, boolean z);

        void onHostWebSocketMessage(PayloadItem payloadItem);

        void onHostWebSocketPayloadDecoded(ProtoApiResult protoApiResult, boolean z);

        void onWebSocketConnected();

        void onWebSocketDisconnected();

        void onWebSocketMessage(PayloadItem payloadItem);

        void onWebSocketPayloadDecoded(ProtoApiResult protoApiResult, boolean z);
    }

    void apiCall(Map<String, String> map, int i, boolean z);

    void connectToWebSocket(Map<String, String> map, String str);

    void connectToWebSocketReuse();

    void decodeHostWebSocketPayload(PayloadItem payloadItem, boolean z);

    ProtoApiResult decodeProtoApiResult(ProtoApiResult protoApiResult);

    void decodeWebSocketPayload(PayloadItem payloadItem, boolean z);

    void disconnectFromWebSocket(String str);

    /* synthetic */ XM9<YME, Exception> executeMessagePost(C64972Pei c64972Pei);

    @Override // X.YMT
    /* synthetic */ void get(C64972Pei c64972Pei, YMF ymf);

    long getCurrentTimeMillis();

    String getDomain();

    Map<String, String> getFetchHistoryParams();

    long getRoomId();

    long getUserId();

    boolean isWsConnected();

    void onRelease();

    void onStartMessage();

    void onStopMessage(boolean z);

    @Override // X.YMT
    /* synthetic */ void post(C64972Pei c64972Pei, YMF ymf);

    void sendHeartBeatMsg(long j, long j2, long j3, boolean z);

    void sendImEnterRoomMsg(String str, long j, long j2, long j3);

    void sendUplinkPacket(PayloadItem payloadItem);

    void sendWebSocketMessage(String str, String str2, byte[] bArr, long j, long j2);

    void setCallback(Callback callback);

    void setData(long j, Context context);

    void setWebSocketServerTimeGap(long j);
}
