package X;

import Y.IDcS135S0200000_1;
import android.os.SystemClock;
import android.util.LruCache;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS1S0600000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4MX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4MX {
    public static volatile int LJIILL;
    public final int LIZ;
    public String LIZIZ;
    public List<? extends C117824jq> LJ;
    public java.util.Map<String, String> LJFF;
    public java.util.Map<String, String> LJII;
    public C108144Mg LJIIIIZZ;
    public InterfaceC92793kZ LJIIJ;
    public ReferenceInfo LJIIJJI;
    public boolean LJIIL;
    public final List<C91933jB> LIZJ = new ArrayList();
    public final List<BaseTemplate> LIZLLL = new ArrayList();
    public String LJI = "";
    public int LJIIIZ = -1;
    public int LJIILIIL = -1;
    public List<C109544Rq> LJIILJJIL = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public final List<C109544Rq> LIZIZ() {
        ArrayList arrayList;
        long j;
        List<C109544Rq> list = this.LJIILJJIL;
        if (list == null || list.isEmpty()) {
            String str = this.LIZIZ;
            o.LJI(str);
            List<C91933jB> list2 = this.LIZJ;
            if (list2 == null) {
                list2 = C61878OQg.INSTANCE;
            }
            List<BaseTemplate> list3 = this.LIZLLL;
            List<? extends C117824jq> list4 = this.LJ;
            C108144Mg c108144Mg = this.LJIIIIZZ;
            java.util.Map<String, String> map = this.LJFF;
            java.util.Map<String, String> map2 = this.LJII;
            String str2 = this.LJI;
            ReferenceInfo referenceInfo = this.LJIIJJI;
            C63120Opw LIZ = C4WC.LIZIZ.LIZ(str);
            if (LIZ == null) {
                C4ZL.LIZJ();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("buildMessageList conversation null: ");
                LIZ2.append(str);
                C114834f1.LJIIJJI("MessageOperator", X1D.LIZIZ(LIZ2));
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList();
                C109544Rq lastShowMessage = LIZ.getLastShowMessage();
                if (lastShowMessage != null) {
                    j = lastShowMessage.getOrderIndex();
                } else {
                    j = 0;
                }
                long j2 = j + 1;
                Iterator it = ((ArrayList) list3).iterator();
                while (it.hasNext()) {
                    BaseTemplate baseTemplate = (BaseTemplate) it.next();
                    C109494Rl c109494Rl = new C109494Rl();
                    c109494Rl.conversation(LIZ);
                    c109494Rl.msgType(baseTemplate.getMessageType());
                    c109494Rl.contentPB(baseTemplate.encode());
                    c109494Rl.scene(str2);
                    C109544Rq msg = c109494Rl.build();
                    o.LJIIIIZZ(msg, "msg");
                    arrayList.add(msg);
                }
                for (C91933jB c91933jB : list2) {
                    C4ZL.LIZIZ();
                    int LJIIZILJ = C82873Nb.LJIIZILJ(c91933jB);
                    if (LJIIZILJ <= -1) {
                        C4ZL.LIZJ();
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("buildMessageList msgType unknown: ");
                        LIZ3.append(LJIIZILJ);
                        C114834f1.LJIIJJI("MessageOperator", X1D.LIZIZ(LIZ3));
                    } else {
                        C109494Rl c109494Rl2 = new C109494Rl();
                        c109494Rl2.conversation(LIZ);
                        c109494Rl2.msgType(LJIIZILJ);
                        c109494Rl2.scene(str2);
                        c109494Rl2.content(C75792yF.LIZJ(c91933jB));
                        C109544Rq msg2 = c109494Rl2.build();
                        C4ZL.LIZIZ();
                        o.LJIIIIZZ(msg2, "msg");
                        C82873Nb.LJIIJ(LIZ, msg2, c91933jB);
                        arrayList.add(msg2);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C109544Rq c109544Rq = (C109544Rq) it2.next();
                    if (map != null) {
                        c109544Rq.putExt(map);
                    }
                    if (map2 != null) {
                        c109544Rq.putLocalExt(map2);
                    }
                    c109544Rq.setOrderIndex(j2);
                    j2++;
                    if (list4 != null) {
                        Iterator<? extends C117824jq> it3 = list4.iterator();
                        while (it3.hasNext()) {
                            it3.next().setMsgUuid(c109544Rq.getUuid());
                        }
                    }
                    c109544Rq.setAttachments(list4);
                    if (c108144Mg != null) {
                        ((LruCache) C108094Mb.LIZJ.getValue()).put(c109544Rq.getUuid(), c108144Mg);
                    }
                    if (referenceInfo != null) {
                        c109544Rq.setRefMsg(referenceInfo);
                    }
                }
            }
            this.LJIILJJIL = arrayList;
        }
        return this.LJIILJJIL;
    }

    public final InterfaceC92803ka LIZLLL() {
        InterfaceC92793kZ interfaceC92793kZ = this.LJIIJ;
        if (interfaceC92793kZ instanceof InterfaceC92803ka) {
            return (InterfaceC92803ka) interfaceC92793kZ;
        }
        return null;
    }

    public final String toString() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageTask{");
        LIZ.append(this.LIZIZ);
        LIZ.append(", ");
        LIZ.append(this.LIZ);
        LIZ.append(", ");
        List<C91933jB> list = this.LIZJ;
        if (list != null) {
            num = Integer.valueOf(((ArrayList) list).size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", ");
        LIZ.append(this.LJIIL);
        LIZ.append(", ");
        return b0.LIZJ(LIZ, this.LJIILIIL, '}', LIZ);
    }

    public C4MX(int i) {
        this.LIZ = i;
    }

    public static String LJI(C63120Opw c63120Opw) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Conversation{");
        LIZ.append(c63120Opw.getConversationId());
        LIZ.append(", ");
        LIZ.append(c63120Opw.isTemp());
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZ(C63120Opw c63120Opw) {
        if (this.LJIILIIL >= 2) {
            return;
        }
        this.LJIILIIL = 2;
        List<C109544Rq> LIZIZ = LIZIZ();
        for (C109544Rq c109544Rq : LIZIZ) {
            int i = this.LJIIIZ;
            if (i < 0 || i > 5) {
                i = 2;
            }
            c109544Rq.setMsgStatus(i);
            C63164Oqe.LIZIZ.LJFF(new IDcS135S0200000_1(C4MY.LJLIL, null, 8), c109544Rq);
            InterfaceC92793kZ interfaceC92793kZ = this.LJIIJ;
            if (interfaceC92793kZ != null) {
                interfaceC92793kZ.LIZJ(c63120Opw, c109544Rq);
            }
        }
        InterfaceC92793kZ interfaceC92793kZ2 = this.LJIIJ;
        if (interfaceC92793kZ2 != null) {
            interfaceC92793kZ2.LIZ(c63120Opw, LIZIZ);
        }
    }

    public final void LJ(C63120Opw c63120Opw) {
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConversationReady: ");
        LIZ.append(LJI(c63120Opw));
        LIZ.append(", ");
        LIZ.append(this);
        c114834f1.i("MsgSender_Task", X1D.LIZIZ(LIZ));
        SystemClock.uptimeMillis();
        if (this.LJIIL) {
            LIZ(c63120Opw);
            return;
        }
        if (this.LJIILIIL >= 1) {
            return;
        }
        this.LJIILIIL = 1;
        List<C109544Rq> LIZIZ = LIZIZ();
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C109544Rq c109544Rq : LIZIZ) {
            InterfaceC92803ka LIZLLL = LIZLLL();
            if (LIZLLL != null) {
                LIZLLL.LIZIZ(c63120Opw, c109544Rq);
            }
            C63164Oqe.LIZIZ.LJIJI(new IDcS135S0200000_1(new AqS1S0600000_1(this, c63120Opw, c109544Rq, LIZIZ, arrayList, linkedHashMap, 1), new AqS1S0600000_1(this, c63120Opw, c109544Rq, arrayList, LIZIZ, linkedHashMap, 0), 8), c109544Rq);
        }
    }

    public final void LJFF(C63120Opw conversation) {
        o.LJIIIZ(conversation, "conversation");
        C4ZL.LIZJ();
        C114834f1 c114834f1 = C114834f1.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onConversationTemp: ");
        LIZ.append(LJI(conversation));
        LIZ.append(", ");
        LIZ.append(this);
        c114834f1.i("MsgSender_Task", X1D.LIZIZ(LIZ));
        if (this.LJIIL) {
            LIZ(conversation);
            return;
        }
        if (this.LJIILIIL >= 0) {
            return;
        }
        this.LJIILIIL = 0;
        List<C109544Rq> LIZIZ = LIZIZ();
        for (C109544Rq c109544Rq : LIZIZ) {
            c109544Rq.setMsgStatus(0);
            C63164Oqe.LIZIZ.LJFF(new IDcS135S0200000_1(C4MZ.LJLIL, null, 8), c109544Rq);
            InterfaceC92793kZ interfaceC92793kZ = this.LJIIJ;
            if (interfaceC92793kZ != null) {
                interfaceC92793kZ.LIZJ(conversation, c109544Rq);
            }
        }
        InterfaceC92793kZ interfaceC92793kZ2 = this.LJIIJ;
        if (interfaceC92793kZ2 != null) {
            interfaceC92793kZ2.LIZ(conversation, LIZIZ);
        }
    }

    public final void LIZJ(C63120Opw c63120Opw, List<C109544Rq> list, List<C109544Rq> list2, java.util.Map<C109544Rq, C63623Oy3> map) {
        int i;
        if (map.size() + list2.size() != list.size()) {
            return;
        }
        if (!list2.isEmpty()) {
            i = 2;
        } else {
            i = 3;
        }
        this.LJIILIIL = i;
        InterfaceC92803ka LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.LIZLLL(c63120Opw, list2, map);
        }
    }
}
