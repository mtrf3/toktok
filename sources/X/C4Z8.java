package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;

/* renamed from: X.4Z8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4Z8 implements C4ZB, InterfaceC106764Gy {
    public static final C4Z8 LJLIL;
    public static final C62822Ol8 LJLILLLLZI;

    static {
        C4Z8 c4z8 = new C4Z8();
        LJLIL = c4z8;
        LJLILLLLZI = C221108m2.LIZIZ(C4Z7.LJLIL);
        C4ZL.LJI();
        C115074fP.LJ(c4z8);
    }

    public static final C115104fS LIZ() {
        C4ZL.LJI();
        return C115074fP.LIZIZ();
    }

    public static final boolean LJ() {
        C4ZL.LJI();
        return C115074fP.LIZJ();
    }

    public static final void LJFF(String enterFrom) {
        o.LJIIIZ(enterFrom, "enterFrom");
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reconnectWs, enterFrom = ");
        LIZ.append(enterFrom);
        c114834f1.i("WsBridge", X1D.LIZIZ(LIZ));
        C4ZL.LJI();
        C115074fP.LIZLLL(enterFrom);
    }

    public static final void LJI(C4ZB bridge) {
        o.LJIIIZ(bridge, "bridge");
        ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).add(bridge);
    }

    public static final void LJII(WsChannelMsg wsChannelMsg) {
        C4ZL.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendMsg: ");
        LIZ.append(wsChannelMsg.service);
        LIZ.append(", ");
        LIZ.append(wsChannelMsg.method);
        C114834f1.LJIIJ("WsBridge", X1D.LIZIZ(LIZ));
        C4ZL.LJI();
        C115074fP.LJFF(wsChannelMsg);
    }

    @Override // X.C4ZB
    public final void LIZIZ(C115104fS c115104fS) {
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onStateChanged: ");
        LIZ.append(c115104fS);
        c114834f1.i("WsBridge", X1D.LIZIZ(LIZ));
        Iterator it = ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).iterator();
        while (it.hasNext()) {
            ((C4ZB) it.next()).LIZIZ(c115104fS);
        }
    }

    @Override // X.C4ZB
    public final void LIZJ(String str) {
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLogConnectEvent: ");
        LIZ.append(str);
        c114834f1.i("WsBridge", X1D.LIZIZ(LIZ));
        Iterator it = ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).iterator();
        while (it.hasNext()) {
            ((C4ZB) it.next()).LIZJ(str);
        }
    }

    @Override // X.C4ZB
    public final void LIZLLL(WsChannelMsg channelMsg) {
        o.LJIIIZ(channelMsg, "channelMsg");
        C4ZL.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onReceivedMsg: ");
        LIZ.append(channelMsg.service);
        LIZ.append(", ");
        LIZ.append(channelMsg.method);
        C114834f1.LJIIJ("WsBridge", X1D.LIZIZ(LIZ));
        Iterator it = ((CopyOnWriteArraySet) LJLILLLLZI.getValue()).iterator();
        while (it.hasNext()) {
            ((C4ZB) it.next()).LIZLLL(channelMsg);
        }
    }
}
