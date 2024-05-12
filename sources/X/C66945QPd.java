package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import org.json.JSONObject;

/* renamed from: X.QPd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66945QPd implements QOQ {
    public final /* synthetic */ C66946QPe LJLIL;

    public C66945QPd(C66946QPe c66946QPe) {
        this.LJLIL = c66946QPe;
    }

    @Override // X.QOQ
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        Integer num;
        InterfaceC66942QPa interfaceC66942QPa;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("default ws received msg, serverId: ");
        if (wsChannelMsg != null) {
            num = Integer.valueOf(wsChannelMsg.service);
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        if (wsChannelMsg != null) {
            int i = wsChannelMsg.service;
            C66946QPe c66946QPe = this.LJLIL;
            if (i != c66946QPe.LJLIL.LJLJLJ || (interfaceC66942QPa = c66946QPe.LJLJI) == null) {
                return;
            }
            interfaceC66942QPa.LIZ(wsChannelMsg);
        }
    }

    @Override // X.QOQ
    public final void onReceiveConnectEvent(C66930QOo c66930QOo, JSONObject jSONObject) {
        InterfaceC66942QPa interfaceC66942QPa = this.LJLIL.LJLJI;
        if (interfaceC66942QPa != null) {
            interfaceC66942QPa.LIZLLL(c66930QOo);
        }
    }
}
