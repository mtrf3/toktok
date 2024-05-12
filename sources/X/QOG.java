package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QOG implements InterfaceC66944QPc, InterfaceC67147QWx, InterfaceC67145QWv, InterfaceC67148QWy {
    public static final QOG LJLIL = new QOG();

    public final void LIZIZ() {
        C67128QWe c67128QWe = C67128QWe.LIZIZ;
        c67128QWe.LJIIIIZZ(this);
        c67128QWe.LIZJ(new M50(16778115, 1).LJLIL, new M50(16778115, 1).LJLILLLLZI, this);
        c67128QWe.LIZJ(new M50(16778115, 2).LJLIL, new M50(16778115, 2).LJLILLLLZI, this);
    }

    @Override // X.InterfaceC67147QWx
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg != null && wsChannelMsg.service == 16778115) {
            IO7.LIZ(new AqS161S0100000_11(wsChannelMsg, 98));
        }
    }

    @Override // X.InterfaceC66944QPc
    public final void LIZLLL(LZK lzk) {
        C0NB.LIZIZ("LiveReplyClipMessageListener", String.valueOf(lzk.LIZ));
    }

    @Override // X.InterfaceC67148QWy
    public final void LJIJJLI(WsChannelMsg msg) {
        o.LJIIIZ(msg, "msg");
        LIZ(msg);
    }

    @Override // X.InterfaceC67145QWv
    public final void LJII(C66930QOo connectEvent, JSONObject jSONObject) {
        o.LJIIIZ(connectEvent, "connectEvent");
        LIZLLL(new LZK(connectEvent, jSONObject));
    }
}
