package X;

import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QO9 implements InterfaceC66944QPc, InterfaceC67147QWx, InterfaceC67145QWv, InterfaceC67148QWy {
    public static final QO9 LJLIL = new QO9();
    public static final int LJLILLLLZI;
    public static final int LJLJI;

    static {
        C3GQ.LIZ().getClass();
        LJLILLLLZI = 20347;
        C3GQ.LIZ().getClass();
        LJLJI = 1;
    }

    @Override // X.InterfaceC67147QWx
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg != null && wsChannelMsg.service == LJLILLLLZI && wsChannelMsg.method == LJLJI) {
            QO7 qo7 = new QO7(wsChannelMsg.channelId);
            qo7.LIZJ = wsChannelMsg.logId;
            qo7.LJ = wsChannelMsg.method;
            qo7.LJIIIIZZ = wsChannelMsg.seqId;
            qo7.LIZLLL = wsChannelMsg.service;
            qo7.LJI = wsChannelMsg.payloadType;
            qo7.LJII = wsChannelMsg.payloadEncoding;
            qo7.LJFF = wsChannelMsg.LIZ();
            qo7.LJIIIZ = wsChannelMsg.replayToComponentName;
            List<WsChannelMsg.MsgHeader> list = wsChannelMsg.msgHeaders;
            if (list != null) {
                for (WsChannelMsg.MsgHeader msgHeader : list) {
                    ((HashMap) qo7.LIZIZ).put(msgHeader.key, msgHeader.value);
                }
            }
            C40579FwF LIZLLL = C40579FwF.LIZLLL();
            LiveWsMessage LIZ = qo7.LIZ();
            Iterator it = ((OJM) LIZLLL.LIZ).iterator();
            while (it.hasNext()) {
                QOA qoa = (QOA) it.next();
                if (qoa != null) {
                    qoa.LIZ(LIZ);
                }
            }
        }
    }

    @Override // X.InterfaceC66944QPc
    public final void LIZLLL(LZK lzk) {
        int i;
        C66930QOo c66930QOo = lzk.LIZ;
        if (c66930QOo == null) {
            return;
        }
        QOC qoc = QOC.CONNECTION_UNKNOWN;
        EnumC66933QOr enumC66933QOr = c66930QOo.LIZIZ;
        if (enumC66933QOr != null && (i = C66935QOt.LIZ[enumC66933QOr.ordinal()]) != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            qoc = QOC.CONNECTED;
                        }
                    } else {
                        qoc = QOC.CONNECT_CLOSED;
                    }
                } else {
                    qoc = QOC.CONNECT_FAILED;
                }
            } else {
                qoc = QOC.CONNECTING;
            }
        }
        C40579FwF LIZLLL = C40579FwF.LIZLLL();
        JSONObject jSONObject = lzk.LIZIZ;
        Iterator it = ((OJM) LIZLLL.LIZ).iterator();
        while (it.hasNext()) {
            ((QOA) it.next()).LIZIZ(qoc, jSONObject);
        }
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
