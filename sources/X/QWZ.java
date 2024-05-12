package X;

import com.bytedance.common.wschannel.model.SocketState;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.websocket.api.ab.WsMonitorConfigExp;
import com.ss.android.ugc.aweme.websocket.bridge.WsManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QWZ implements QOQ {
    public final /* synthetic */ WsManager LJLIL;

    public QWZ(WsManager wsManager) {
        this.LJLIL = wsManager;
    }

    @Override // X.QOQ
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        if (L2B.LIZIZ()) {
            QPY.LIZ("WsManager", "[onReceiveMsg], ignored by REVERSE_WS");
            return;
        }
        if (wsChannelMsg == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onReceiveMsg], msg = ");
        LIZ.append(wsChannelMsg);
        QPY.LIZ("WsManager", X1D.LIZIZ(LIZ));
        int i = wsChannelMsg.service;
        int i2 = wsChannelMsg.method;
        InterfaceC67148QWy interfaceC67148QWy = this.LJLIL.LJIIL().get(new C35754E1m(i, i2));
        if (interfaceC67148QWy != null) {
            interfaceC67148QWy.LJIJJLI(wsChannelMsg);
        }
        InterfaceC67148QWy interfaceC67148QWy2 = this.LJLIL.LJIIL().get(new C35754E1m(i, -10000));
        if (interfaceC67148QWy2 != null) {
            interfaceC67148QWy2.LJIJJLI(wsChannelMsg);
        }
        Iterator it = ((CopyOnWriteArraySet) this.LJLIL.LJ.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC67148QWy) it.next()).LJIJJLI(wsChannelMsg);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("service", i);
        jSONObject.put("method", i2);
        jSONObject.put("type", 0);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[mobReceiveMsg], json = ");
        LIZ2.append(jSONObject);
        QPY.LIZ("WsMobTool", X1D.LIZIZ(LIZ2));
        FMX.LJIILJJIL("ws_msg_event", jSONObject);
    }

    @Override // X.QOQ
    public final void onReceiveConnectEvent(C66930QOo c66930QOo, JSONObject jSONObject) {
        EnumC66933QOr enumC66933QOr;
        if (L2B.LIZIZ()) {
            QPY.LIZ("WsManager", "[onStateChanged], ignored by REVERSE_WS");
            return;
        }
        if (c66930QOo == null || jSONObject == null || (enumC66933QOr = c66930QOo.LIZIZ) == null) {
            return;
        }
        WsManager wsManager = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[onStateChanged], state = ");
        LIZ.append(enumC66933QOr.name());
        LIZ.append(", json = ");
        LIZ.append(jSONObject);
        QPY.LIZ("WsManager", X1D.LIZIZ(LIZ));
        wsManager.LIZ = enumC66933QOr;
        Iterator it = ((CopyOnWriteArraySet) wsManager.LJFF.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC67145QWv) it.next()).LJII(c66930QOo, jSONObject);
        }
        SocketState LIZ2 = SocketState.LIZ(jSONObject);
        if (QPM.LIZ[enumC66933QOr.ordinal()] == 1) {
            String str = LIZ2.connectionUrl;
            o.LJIIIIZZ(str, "socketState.connectionUrl");
            wsManager.LIZJ = str;
            if (((Boolean) C34040DXo.LIZIZ.getValue()).booleanValue()) {
                C48208Iw0.LIZIZ();
            }
        }
        if (WsMonitorConfigExp.LJFF() && R1W.LJIIIIZZ != R1Y.UNKNOWN) {
            C57139Mbf.LIZ(new AqS161S0100000_11(enumC66933QOr, 91));
        }
        C57139Mbf.LIZ(new AqS158S0200000_11(c66930QOo, jSONObject, 16));
        EnumC66933QOr enumC66933QOr2 = c66930QOo.LIZIZ;
        if (enumC66933QOr2 == null) {
            return;
        }
        if (QPO.LIZ[enumC66933QOr2.ordinal()] == 1) {
            QPY.LIZ("WsReconnectUtils", "[stopReconnectTimer]");
            ScheduledFuture<?> scheduledFuture = QPP.LIZ;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            QPP.LIZ = null;
            return;
        }
        if (QPP.LIZ != null) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("[startReconnectTimer], state = ");
        LIZ3.append(enumC66933QOr2.name());
        QPY.LIZ("WsReconnectUtils", X1D.LIZIZ(LIZ3));
        QPP.LIZ = C38995FSd.LJ().schedule(RunnableC67130QWg.LJLIL, 15L, TimeUnit.SECONDS);
    }
}
