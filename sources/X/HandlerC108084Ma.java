package X;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ma, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC108084Ma extends Handler {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C62822Ol8 LIZ;

    public HandlerC108084Ma() {
        super(C16880lQ.LLJJJJ());
        this.LIZ = C221108m2.LIZIZ(C108104Mc.LJLIL);
    }

    public final void LIZ(C4MX c4mx) {
        C4ZL.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancelTimeOut[");
        LIZ.append(c4mx.LIZIZ);
        LIZ.append(']');
        C114834f1.LJIIJ("MsgSender_MQ", X1D.LIZIZ(LIZ));
        removeMessages(c4mx.LIZ);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleMessage[");
        LIZ.append(msg.obj);
        LIZ.append(']');
        c114834f1.i("MsgSender_MQ", X1D.LIZIZ(LIZ));
        Object obj = msg.obj;
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        C63623Oy3 c63623Oy3 = new C63375Ou3().LIZ;
        c63623Oy3.LIZJ = "MQ timeout";
        LIZIZ((String) obj, true, c63623Oy3);
    }

    public final void LIZJ(java.util.Map<String, java.util.Set<C4MX>> map, C63120Opw c63120Opw) {
        java.util.Set<C4MX> set;
        Integer num;
        synchronized (this) {
            set = map.get(c63120Opw.getConversationId());
        }
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifyPending[");
        LIZ.append(c63120Opw.getConversationId());
        LIZ.append("]: ");
        java.util.Set<C4MX> set2 = set;
        if (set2 != null) {
            num = Integer.valueOf(set2.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        c114834f1.i("MsgSender_MQ", X1D.LIZIZ(LIZ));
        if (set2 != null) {
            Iterator<C4MX> it = set2.iterator();
            while (it.hasNext()) {
                it.next().LJFF(c63120Opw);
            }
        }
    }

    public final void LIZLLL(java.util.Map<String, java.util.Set<C4MX>> map, C63120Opw c63120Opw) {
        java.util.Set<C4MX> remove;
        Integer num;
        synchronized (this) {
            remove = map.remove(c63120Opw.getConversationId());
        }
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("notifySend[");
        LIZ.append(c63120Opw.getConversationId());
        LIZ.append("]: ");
        java.util.Set<C4MX> set = remove;
        if (set != null) {
            num = Integer.valueOf(set.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        c114834f1.i("MsgSender_MQ", X1D.LIZIZ(LIZ));
        if (set != null) {
            for (C4MX c4mx : set) {
                LIZ(c4mx);
                c4mx.LJ(c63120Opw);
            }
        }
    }

    public final void LIZIZ(String conversationId, boolean z, C63623Oy3 c63623Oy3) {
        Boolean bool;
        Object remove;
        Integer num;
        C63623Oy3 c63623Oy32;
        String str;
        InterfaceC92793kZ interfaceC92793kZ;
        o.LJIIIZ(conversationId, "conversationId");
        C63120Opw LJIIIZ = C115284fk.LJIILIIL().LJIIIZ(conversationId);
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZIZ2 = C25620zW.LIZIZ("dequeue[", conversationId, "], ");
        if (LJIIIZ != null) {
            bool = Boolean.valueOf(LJIIIZ.isTemp());
        } else {
            bool = null;
        }
        LIZIZ2.append(bool);
        LIZIZ2.append(", ");
        LIZIZ2.append(z);
        c114834f1.i("MsgSender_MQ", X1D.LIZIZ(LIZIZ2));
        if (LJIIIZ == null || (LJIIIZ.isTemp() && z)) {
            java.util.Map map = (java.util.Map) this.LIZ.getValue();
            synchronized (this) {
                remove = map.remove(conversationId);
            }
            C4ZL.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("notifyError[");
            LIZ.append(conversationId);
            LIZ.append("]: ");
            java.util.Set<C4MX> set = (java.util.Set) remove;
            if (set != null) {
                num = Integer.valueOf(set.size());
            } else {
                num = null;
            }
            LIZ.append(num);
            LIZ.append(", ");
            LIZ.append(c63623Oy3);
            c114834f1.i("MsgSender_MQ", X1D.LIZIZ(LIZ));
            if (set != null) {
                for (C4MX c4mx : set) {
                    LIZ(c4mx);
                    if (c63623Oy3 == null) {
                        c63623Oy32 = new C63375Ou3().LIZ;
                        c63623Oy32.LIZJ = "UnKnown error";
                    } else {
                        c63623Oy32 = c63623Oy3;
                    }
                    C4WC c4wc = C4WC.LIZIZ;
                    String str2 = c4mx.LIZIZ;
                    o.LJI(str2);
                    C63120Opw LIZ2 = c4wc.LIZ(str2);
                    C4ZL.LIZJ();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("onConversationError: ");
                    if (LIZ2 != null) {
                        str = C4MX.LJI(LIZ2);
                    } else {
                        str = null;
                    }
                    LIZ3.append(str);
                    LIZ3.append(", ");
                    LIZ3.append(c63623Oy32);
                    C114834f1.LJIIJJI("MsgSender_Task", X1D.LIZIZ(LIZ3));
                    if (c4mx.LJIIL) {
                        if (c4mx.LJIILIIL == -1 && (interfaceC92793kZ = c4mx.LJIIJ) != null) {
                            interfaceC92793kZ.LIZJ(LIZ2, null);
                        }
                        c4mx.LJIILIIL = 3;
                    } else {
                        List<C109544Rq> list = c4mx.LJIILJJIL;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (c4mx.LJIILIIL == 0 && list != null && !list.isEmpty()) {
                            for (C109544Rq c109544Rq : list) {
                                InterfaceC92803ka LIZLLL = c4mx.LIZLLL();
                                if (LIZLLL != null) {
                                    LIZLLL.LIZIZ(LIZ2, c109544Rq);
                                }
                                c109544Rq.setMsgStatus(3);
                                c109544Rq.addLocalExt("s:log_id", c63623Oy32.toString());
                                linkedHashMap.put(c109544Rq, c63623Oy32);
                                InterfaceC92803ka LIZLLL2 = c4mx.LIZLLL();
                                if (LIZLLL2 != null) {
                                    LIZLLL2.LJ(LIZ2, c109544Rq, c63623Oy32);
                                }
                                C63164Oqe.LIZIZ.LJIJ(c109544Rq, null, -100001, c63623Oy32);
                            }
                        }
                        c4mx.LJIILIIL = 3;
                        InterfaceC92803ka LIZLLL3 = c4mx.LIZLLL();
                        if (LIZLLL3 != null) {
                            LIZLLL3.LIZLLL(LIZ2, null, linkedHashMap);
                        }
                    }
                }
                return;
            }
            return;
        }
        if (LJIIIZ.isTemp()) {
            LIZJ((java.util.Map) this.LIZ.getValue(), LJIIIZ);
        } else {
            LIZLLL((java.util.Map) this.LIZ.getValue(), LJIIIZ);
        }
    }
}
