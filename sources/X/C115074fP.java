package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.4fP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C115074fP implements InterfaceC106764Gy, QOQ, InterfaceC67148QWy, InterfaceC67145QWv {
    public static final C115074fP LJLIL;
    public static final C62822Ol8 LJLILLLLZI;
    public static C115104fS LJLJI;

    static {
        C115074fP c115074fP = new C115074fP();
        LJLIL = c115074fP;
        LJLILLLLZI = C221108m2.LIZIZ(C75462xi.LJLIL);
        if (L2B.LIZ() == 2 || L2B.LIZ() == 3 || L2B.LIZ() == 4) {
            C34B.LIZJ("WsDependImpl", "init ignored by reversing ws");
        } else {
            if (C35154Dqw.LIZ()) {
                C67128QWe c67128QWe = C67128QWe.LIZIZ;
                c67128QWe.LIZJ(-10000, -10000, c115074fP);
                c67128QWe.LJIIIIZZ(c115074fP);
                return;
            }
            QWY.LJIIIZ.LIZ().LJI.add(c115074fP);
        }
    }

    public static final C115104fS LIZIZ() {
        C115104fS c115104fS = LJLJI;
        if (c115104fS != null) {
            EnumC66933QOr state = c115104fS.LIZ;
            String str = c115104fS.LIZIZ;
            String str2 = c115104fS.LIZJ;
            o.LJIIIZ(state, "state");
            return new C115104fS(state, str, str2);
        }
        return C115104fS.LIZLLL;
    }

    public static final boolean LIZJ() {
        if (C35154Dqw.LIZ()) {
            return C67128QWe.LIZIZ.isConnected();
        }
        if (QWY.LJIIIZ.LIZ().LIZLLL == EnumC66933QOr.CONNECTED) {
            return true;
        }
        return false;
    }

    public static final void LIZLLL(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        if (C35154Dqw.LIZ()) {
            C67128QWe.LIZIZ.LJII(enterFrom);
        } else {
            C67124QWa.LIZ(enterFrom);
        }
    }

    public static final void LJ(C4ZB c4zb) {
        ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).add(c4zb);
    }

    public static final void LJFF(WsChannelMsg wsChannelMsg) {
        String str;
        if (L2B.LIZ() == 2 || L2B.LIZ() == 3 || L2B.LIZ() == 4) {
            C34B.LIZJ("WsDependImpl", "sendMsg ignored by reversing ws");
            return;
        }
        if (C35154Dqw.LIZ()) {
            str = C67128QWe.LIZIZ.LJI();
        } else {
            str = QWY.LJIIIZ.LIZ().LIZJ;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        if (localTestApi.isPPEEnable()) {
            String pPELane = localTestApi.getPPELane();
            o.LJI(pPELane);
            linkedHashMap.put("X-Tt-Env", pPELane);
            linkedHashMap.put("X-USE-PPE", "1");
        }
        if (localTestApi.enableBoe()) {
            String boeLane = localTestApi.getBoeLane();
            o.LJI(boeLane);
            linkedHashMap.put("X-Tt-Env", boeLane);
        }
        if (C35154Dqw.LIZ()) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                List<WsChannelMsg.MsgHeader> list = wsChannelMsg.msgHeaders;
                WsChannelMsg.MsgHeader msgHeader = new WsChannelMsg.MsgHeader();
                msgHeader.key = (String) entry.getKey();
                msgHeader.value = (String) entry.getValue();
                list.add(msgHeader);
            }
            XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C115084fQ(wsChannelMsg, null), 3);
            return;
        }
        List<WsChannelMsg.MsgHeader> list2 = wsChannelMsg.msgHeaders;
        if (list2 != null) {
            for (WsChannelMsg.MsgHeader msgHeader2 : list2) {
                String str2 = msgHeader2.key;
                o.LJIIIIZZ(str2, "it.key");
                String str3 = msgHeader2.value;
                o.LJIIIIZZ(str3, "it.value");
                linkedHashMap.put(str2, str3);
            }
        }
        XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C115094fR(str, new C67134QWk(wsChannelMsg.service, wsChannelMsg.seqId, wsChannelMsg.logId, wsChannelMsg.method, wsChannelMsg.LIZ(), wsChannelMsg.payloadType, wsChannelMsg.payloadEncoding, linkedHashMap), null), 3);
    }

    @Override // X.QOQ
    public final void LIZ(WsChannelMsg wsChannelMsg) {
        if (wsChannelMsg == null) {
            return;
        }
        if (wsChannelMsg.service == 5 && wsChannelMsg.method == 1 && (C4LY.LIZIZ() & 4) == 4) {
            C85773Yf.LIZJ(EnumC100693xJ.ON_RECEIVE_WS);
        }
        Iterator it = ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).iterator();
        while (it.hasNext()) {
            ((C4ZB) it.next()).LIZLLL(wsChannelMsg);
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
        onReceiveConnectEvent(connectEvent, jSONObject);
    }

    @Override // X.QOQ
    public final void onReceiveConnectEvent(C66930QOo c66930QOo, JSONObject jSONObject) {
        String str;
        if (c66930QOo == null) {
            return;
        }
        EnumC66933QOr enumC66933QOr = c66930QOo.LIZIZ;
        o.LJIIIIZZ(enumC66933QOr, "connectEvent.connectionState");
        if (C35154Dqw.LIZ()) {
            str = C67128QWe.LIZIZ.LJI();
        } else {
            str = QWY.LJIIIZ.LIZ().LIZJ;
        }
        LJLJI = new C115104fS(enumC66933QOr, str, null);
        Iterator it = ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).iterator();
        while (it.hasNext()) {
            C4ZB c4zb = (C4ZB) it.next();
            C115104fS c115104fS = LJLJI;
            o.LJI(c115104fS);
            c4zb.LIZIZ(c115104fS);
        }
        C115104fS c115104fS2 = LJLJI;
        if (!C115204fc.LIZ() || c115104fS2 == null || c115104fS2.LIZ != EnumC66933QOr.CONNECTED) {
            return;
        }
        C34B.LIZIZ("GlobalActionExecutor", "invokeOnWsReconnectActions");
        C3Y2 c3y2 = new C3Y2("ws_reconnect");
        C3VM c3vm = C115114fT.LJI;
        if (c3vm != null) {
            c3vm.LIZIZ(c3y2, false);
        }
        List LIZJ = ((C169706lK) C115114fT.LIZJ.getValue()).LIZJ();
        o.LJIIIIZZ(LIZJ, "onWsReconnectActionList.immutableList");
        Iterator it2 = LIZJ.iterator();
        while (it2.hasNext()) {
            ((C3VL) it2.next()).LJLIL.invoke();
        }
        C3VM c3vm2 = C115114fT.LJI;
        if (c3vm2 != null) {
            c3vm2.LIZ(c3y2, C46B.LIZLLL);
        }
    }
}
