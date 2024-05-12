package X;

import com.bytedance.common.wschannel.MainProcessMsg;
import com.bytedance.common.wschannel.model.ServiceConnectEvent;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QOK implements InterfaceC66931QOp {
    @Override // X.InterfaceC66931QOp
    public final void onSendResult(String str, boolean z) {
    }

    @Override // X.InterfaceC66931QOp
    public final void onReceive(WsChannelMsg wsChannelMsg) {
        QOQ qoq;
        QOL LIZIZ = QOV.LIZIZ(wsChannelMsg.channelId);
        if (LIZIZ != null && (qoq = LIZIZ.LIZIZ) != null && !wsChannelMsg.isAckMsg) {
            qoq.LIZ(wsChannelMsg);
        }
    }

    @Override // X.InterfaceC66931QOp
    public final void onReceiveServiceEvent(ServiceConnectEvent serviceConnectEvent) {
        QOL LIZIZ = QOV.LIZIZ(serviceConnectEvent.mChannelId);
        if (LIZIZ != null) {
            LIZIZ.LJII.put(Integer.valueOf(serviceConnectEvent.mServiceId), Boolean.valueOf(serviceConnectEvent.mConnected));
        }
    }

    public static final void LIZ(WsChannelMsg wsChannelMsg, boolean z) {
        QOR qor;
        if (QOV.LIZIZ(wsChannelMsg.channelId) != null && (wsChannelMsg instanceof MainProcessMsg) && (qor = ((MainProcessMsg) wsChannelMsg).mListener) != null) {
            qor.LIZ();
        }
    }

    @Override // X.InterfaceC66931QOp
    public final void onReceiveConnectEvent(C66930QOo c66930QOo, JSONObject jSONObject) {
        QOQ qoq;
        QOL LIZIZ = QOV.LIZIZ(c66930QOo.LIZJ);
        if (LIZIZ != null && (qoq = LIZIZ.LIZIZ) != null) {
            qoq.onReceiveConnectEvent(c66930QOo, jSONObject);
        }
    }

    @Override // X.InterfaceC66931QOp
    public final void syncState(int i, EnumC66933QOr enumC66933QOr, boolean z) {
        QOL LIZIZ = QOV.LIZIZ(i);
        if (LIZIZ != null) {
            LIZIZ.LJFF = enumC66933QOr;
            if (enumC66933QOr == EnumC66933QOr.CONNECT_CLOSED && LIZIZ.LJI.get()) {
                int i2 = LIZIZ.LIZ.LIZ;
                ((ConcurrentHashMap) QOV.LIZIZ).remove(Integer.valueOf(i2));
            }
        }
    }
}
