package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Gx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106754Gx implements C4ZB, C4K3 {
    public static final C106754Gx LJLIL = new C106754Gx();
    public static final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C85823Yk.LJLIL);

    @Override // X.C4ZB
    public final void LIZIZ(C115104fS c115104fS) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Ws state changed: ");
        LIZ.append(c115104fS);
        LJ(X1D.LIZIZ(LIZ));
    }

    @Override // X.C4ZB
    public final void LIZJ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Connect event: ");
        LIZ.append(str);
        LJ(X1D.LIZIZ(LIZ));
    }

    @Override // X.C4ZB
    public final void LIZLLL(WsChannelMsg channelMsg) {
        o.LJIIIZ(channelMsg, "channelMsg");
    }

    public final void LJ(String str) {
        synchronized (this) {
            C62822Ol8 c62822Ol8 = LJLILLLLZI;
            if (((LinkedList) c62822Ol8.getValue()).size() >= 5) {
                ((LinkedList) c62822Ol8.getValue()).remove(0);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(System.currentTimeMillis());
            LIZ.append(":  ");
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            ((LinkedList) c62822Ol8.getValue()).add(LIZIZ);
            C34B.LIZIZ("IMErrorMonitor", LIZIZ);
        }
    }

    @Override // X.C4K3
    public final void LJFF(C4ZA type, C4ZM c4zm) {
        String str;
        o.LJIIIZ(type, "type");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Account changed: ");
        LIZ.append(type);
        LIZ.append(", ");
        if (c4zm != null) {
            str = c4zm.LIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        LJ(X1D.LIZIZ(LIZ));
    }

    public static final void LIZ(int i, C109544Rq c109544Rq, C63540Owi c63540Owi) {
        List LLJILJILJ;
        if (c109544Rq == null || c63540Owi == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("Message{");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c109544Rq.getConversationId());
        LIZ.append(", ");
        LIZ.append(c109544Rq.getConversationShortId());
        LIZ.append(", ");
        LIZ.append(c109544Rq.getMsgId());
        LIZ.append(", ");
        LIZ.append(c109544Rq.getMsgType());
        sb.append(X1D.LIZIZ(LIZ));
        sb.append('}');
        String sb2 = sb.toString();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(sb2);
        LIZ2.append(" send failed: ");
        LIZ2.append(i);
        LIZ2.append("  and ");
        LIZ2.append(c63540Owi.LIZ());
        C34B.LJIIIIZZ("IMErrorMonitor", X1D.LIZIZ(LIZ2));
        EnumC106744Gw LIZ3 = c63540Owi.LIZ();
        o.LJIIIIZZ(LIZ3, "metrics.resultCode");
        int LIZ4 = C106714Gt.LIZ(c63540Owi);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("Msg: ");
        LIZ5.append(sb2);
        LIZ5.append(", Result: ");
        LIZ5.append(LIZ3);
        LIZ5.append(", Status Code: ");
        LIZ5.append(LIZ4);
        LIZ5.append(", Log id: ");
        LIZ5.append(c63540Owi.LJJIJIL);
        LIZ5.append("Network State: ");
        C4ZL.LIZLLL();
        LIZ5.append(C76482zM.LIZLLL());
        LIZ5.append(", WS state: ");
        C4ZL.LJI();
        LIZ5.append(C115074fP.LIZJ());
        LIZ5.append(", Trace: ");
        synchronized (LJLIL) {
            LLJILJILJ = ORZ.LLJILJILJ((LinkedList) LJLILLLLZI.getValue());
        }
        StringBuilder sb3 = new StringBuilder();
        Iterator it = ((ArrayList) LLJILJILJ).iterator();
        while (it.hasNext()) {
            sb3.append((String) it.next());
            sb3.append("\n");
            sb3.length();
        }
        String sb4 = sb3.toString();
        o.LJIIIIZZ(sb4, "traceBuilder.toString()");
        LIZ5.append(sb4);
        String LIZIZ = X1D.LIZIZ(LIZ5);
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ6 = X1D.LIZ();
        LIZ6.append("feedback: message_send_fail, ");
        LIZ6.append(LIZIZ);
        c114834f1.i("IMErrorMonitor", X1D.LIZIZ(LIZ6));
        C4ZL.LIZJ();
        c114834f1.LJIILIIL(LIZIZ);
    }
}
