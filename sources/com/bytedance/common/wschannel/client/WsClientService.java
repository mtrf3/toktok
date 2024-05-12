package com.bytedance.common.wschannel.client;

import X.C35532Dx2;
import X.C38413F5t;
import X.C66163Pxv;
import X.C66930QOo;
import X.C84763XOl;
import X.EnumC66933QOr;
import X.QOQ;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.wschannel.WsConstants;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class WsClientService extends AbsWsClientService {
    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C66163Pxv.LIZ(this, intent, i, i2);
        return super.onStartCommand(intent, i, i2);
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService
    public final void replySendMsgResult(WsChannelMsg wsChannelMsg, boolean z) {
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, android.app.Service, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (!C84763XOl.LJIIJJI && C38413F5t.LIZ("serviceAttachBaseContext")) {
            C35532Dx2.LIZJ();
        }
        super.attachBaseContext(context);
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, X.InterfaceC66931QOp
    public final void onReceive(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg != null) {
            try {
                QOQ listener = WsConstants.getListener(wsChannelMsg.channelId);
                if (listener != null && !wsChannelMsg.isAckMsg) {
                    listener.LIZ(wsChannelMsg);
                } else {
                    WsConstants.getMessageAckListener();
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, X.InterfaceC66931QOp
    public final void onReceiveServiceEvent(ServiceConnectEvent serviceConnectEvent) {
        if (serviceConnectEvent == null) {
            return;
        }
        WsConstants.setServiceState(serviceConnectEvent);
        WsConstants.getServiceConnectListener();
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, X.InterfaceC66931QOp
    public final void onReceiveConnectEvent(C66930QOo c66930QOo, JSONObject jSONObject) {
        QOQ listener;
        if (c66930QOo != null && (listener = WsConstants.getListener(c66930QOo.LIZJ)) != null) {
            listener.onReceiveConnectEvent(c66930QOo, jSONObject);
        }
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, X.InterfaceC66931QOp
    public final void onSendResult(String str, boolean z) {
        super.onSendResult(str, z);
    }

    @Override // com.bytedance.common.wschannel.client.AbsWsClientService, X.InterfaceC66931QOp
    public final void syncState(int i, EnumC66933QOr enumC66933QOr, boolean z) {
        WsConstants.setConnectionState(i, enumC66933QOr, z);
    }
}
