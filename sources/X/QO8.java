package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QO8 implements QOQ {
    public final /* synthetic */ QOA LJLIL;

    public QO8(QOA qoa) {
        this.LJLIL = qoa;
    }

    @Override // X.QOQ
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        int i;
        if (wsChannelMsg == null || (i = wsChannelMsg.channelId) != 10001) {
            return;
        }
        QO7 qo7 = new QO7(i);
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
        this.LJLIL.LIZ(qo7.LIZ());
    }

    @Override // X.QOQ
    public final void onReceiveConnectEvent(C66930QOo c66930QOo, JSONObject jSONObject) {
        if (c66930QOo == null || c66930QOo.LIZJ != 10001) {
            return;
        }
        QOC qoc = QOC.CONNECTION_UNKNOWN;
        int i = C66934QOs.LIZ[c66930QOo.LIZIZ.ordinal()];
        if (i != 1) {
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
        this.LJLIL.LIZIZ(qoc, jSONObject);
    }
}
