package X;

import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes12.dex */
public final class QO5 implements YM4 {
    public final /* synthetic */ QO6 LIZ;

    @Override // X.YM4
    public final void LIZIZ() {
        ((QOL) this.LIZ).LIZJ();
    }

    @Override // X.YM4
    public final boolean isConnected() {
        if (((QOL) this.LIZ).LJFF == EnumC66933QOr.CONNECTED) {
            return true;
        }
        return false;
    }

    public QO5(QOL qol) {
        this.LIZ = qol;
    }

    @Override // X.YM4
    public final void LIZ(LiveWsMessage liveWsMessage) {
        QMR qmr = new QMR(liveWsMessage.channelId);
        qmr.LIZJ = liveWsMessage.logId;
        qmr.LJ = liveWsMessage.method;
        qmr.LJIIIIZZ = liveWsMessage.seqId;
        qmr.LIZLLL = liveWsMessage.service;
        qmr.LJI = liveWsMessage.payloadType;
        qmr.LJII = liveWsMessage.payloadEncoding;
        if (liveWsMessage.payload == null) {
            liveWsMessage.payload = new byte[1];
        }
        qmr.LJFF = liveWsMessage.payload;
        qmr.LJIIIZ = liveWsMessage.replayToComponentName;
        List<LiveWsMessage.MsgHeader> list = liveWsMessage.msgHeaders;
        if (list != null) {
            for (LiveWsMessage.MsgHeader msgHeader : list) {
                ((HashMap) qmr.LIZIZ).put(msgHeader.key, msgHeader.value);
            }
        }
        ((QOL) this.LIZ).LIZIZ(qmr.LIZ(), null);
    }
}
