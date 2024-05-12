package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QWQ implements InterfaceC67148QWy {
    @Override // X.InterfaceC67148QWy
    public final void LJIJJLI(WsChannelMsg msg) {
        o.LJIIIZ(msg, "msg");
        byte[] LIZ = msg.LIZ();
        o.LJIIIIZZ(LIZ, "msg.payload");
        ((QTW) QTW.LIZIZ(C58725N2z.LIZ())).LJ(new String(LIZ, PVC.LIZ));
    }

    @QD3
    public final void onReceivedMsgEvent(C67139QWp event) {
        o.LJIIIZ(event, "event");
        QWW qww = event.LJLIL;
        if (qww.LJ == 3001) {
            byte[] bArr = qww.LIZIZ;
            o.LJIIIIZZ(bArr, "event.event.payload");
            ((QTW) QTW.LIZIZ(C58725N2z.LIZ())).LJ(new String(bArr, PVC.LIZ));
        }
    }
}
