package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QWX implements QOQ {
    public final /* synthetic */ QWY LJLIL;

    public QWX(QWY qwy) {
        this.LJLIL = qwy;
    }

    @Override // X.QOQ
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        if (L2B.LIZIZ()) {
            C221018lt.LIZIZ("WsChannelBridge", "onReceiveMsg ignored by reversing ws");
            return;
        }
        if (wsChannelMsg != null) {
            QWY qwy = this.LJLIL;
            QWW qww = new QWW(qwy.LIZJ, wsChannelMsg.LIZ(), qwy.LIZIZ.LIZ(new C56265M6j(wsChannelMsg)));
            qww.LIZLLL = wsChannelMsg.method;
            qww.LJ = Integer.valueOf(wsChannelMsg.service).intValue();
            C2U8.LIZ(new C67139QWp(qww));
        }
        Iterator<QOQ> it = this.LJLIL.LJI.iterator();
        while (it.hasNext()) {
            it.next().LIZ(wsChannelMsg);
        }
        if (wsChannelMsg == null) {
            return;
        }
        int i = wsChannelMsg.service;
        int i2 = wsChannelMsg.method;
        InterfaceC67147QWx interfaceC67147QWx = this.LJLIL.LJIIIIZZ.get(new M50(i, i2));
        if (interfaceC67147QWx != null) {
            interfaceC67147QWx.LIZ(wsChannelMsg);
        }
        this.LJLIL.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("service", i);
        jSONObject.put("method", i2);
        jSONObject.put("type", 0);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[mobReceiveMsg], json = ");
        LIZ.append(jSONObject);
        C221018lt.LJFF("WsChannelBridge", X1D.LIZIZ(LIZ));
        FMX.LJIILJJIL("ws_msg_event", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2 A[LOOP:0: B:42:0x00cc->B:44:0x00d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b3 A[LOOP:1: B:47:0x01ad->B:49:0x01b3, LOOP_END] */
    @Override // X.QOQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceiveConnectEvent(X.C66930QOo r9, org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QWX.onReceiveConnectEvent(X.QOo, org.json.JSONObject):void");
    }
}
