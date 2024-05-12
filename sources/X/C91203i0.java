package X;

import com.bytedance.keva.Keva;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3i0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C91203i0 {
    public final C91093hp LIZ;
    public final boolean LIZIZ;
    public final C64962gm LIZJ;
    public final C63120Opw LIZLLL;

    public C91203i0(String conversationId) {
        C91093hp c91093hp = C91093hp.LIZ;
        o.LJIIIZ(conversationId, "conversationId");
        this.LIZ = c91093hp;
        this.LIZIZ = C88963eO.LIZLLL();
        this.LIZJ = C48841JEv.LIZ(C78613UtF.LIZJ);
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        this.LIZLLL = C4WC.LIZIZ.LIZ(conversationId);
    }

    public static boolean LIZIZ(C109544Rq c109544Rq) {
        if ((c109544Rq.getMsgType() == 5 && !o.LJ(c109544Rq.getExt().get("a:src"), "action_bar:nudge")) || c109544Rq.getMsgType() == 1805) {
            return true;
        }
        return false;
    }

    public final void LIZJ(AbstractC89473fD event) {
        o.LJIIIZ(event, "event");
        boolean z = false;
        if (event instanceof C91233i3) {
            C109544Rq message = ((C91233i3) event).LIZIZ;
            o.LJIIIZ(message, "message");
            if (this.LIZIZ && C91093hp.LJFF(this.LIZ) == null) {
                z = true;
            }
            if (z && LIZIZ(message) && !o.LJ(message.getLocalExt().get("enter_method"), EnumC88973eP.STICKER_STORE.getValue()) && message.getMsgStatus() == 1 && message.getUuid() != null && message.getConversationId() != null) {
                String uuid = message.getUuid();
                o.LJIIIIZZ(uuid, "message.uuid");
                String conversationId = message.getConversationId();
                o.LJIIIIZZ(conversationId, "message.conversationId");
                C91093hp.LJIIL(uuid, conversationId);
                java.util.Map<String, String> localExt = message.getLocalExt();
                o.LJIIIIZZ(localExt, "message.localExt");
                localExt.put("a:sticker_store_inline", "");
                C106674Gp.LJIILJJIL(message);
                return;
            }
            if (!this.LIZIZ) {
                return;
            }
            this.LIZ.getClass();
            Keva kevaRepo = C91093hp.LIZLLL();
            o.LJIIIIZZ(kevaRepo, "kevaRepo");
            String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
            o.LJIIIIZZ(curUserId, "userService().curUserId");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("key_sticker_inline_conv_id");
            LIZ.append(curUserId);
            if (!o.LJ(kevaRepo.getString(X1D.LIZIZ(LIZ), null), message.getConversationId()) || message.getLocalExt().get("a:sticker_store_inline") != null || message.getMsgStatus() != 1) {
                return;
            }
            XKX.LIZLLL(this.LIZJ, null, null, new C91213i1(this, null), 3);
            return;
        }
        if (event instanceof C91613if) {
            List<C109544Rq> messageList = ((C91613if) event).LIZ;
            o.LJIIIZ(messageList, "messageList");
            LIZ(messageList, true);
        } else {
            if (!(event instanceof C89463fC)) {
                return;
            }
            List<C109544Rq> messageList2 = ((C89463fC) event).LIZ;
            o.LJIIIZ(messageList2, "messageList");
            LIZ(messageList2, false);
        }
    }

    public final boolean LIZ(List<? extends C109544Rq> list, boolean z) {
        Object obj;
        if (this.LIZLLL == null || !this.LIZIZ || C91093hp.LJFF(this.LIZ) != null) {
            return true;
        }
        Iterator it = ORZ.LLILLL(list, 5).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C109544Rq c109544Rq = (C109544Rq) obj;
                if (LIZIZ(c109544Rq) && c109544Rq.getUuid() != null && c109544Rq.getConversationId() != null && !c109544Rq.isSelf() && (!z || c109544Rq.getIndex() > this.LIZLLL.getReadIndex())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C109544Rq c109544Rq2 = (C109544Rq) obj;
        if (c109544Rq2 != null) {
            String uuid = c109544Rq2.getUuid();
            o.LJIIIIZZ(uuid, "firstQualifiedMessage.uuid");
            String conversationId = c109544Rq2.getConversationId();
            o.LJIIIIZZ(conversationId, "firstQualifiedMessage.conversationId");
            C91093hp.LJIIL(uuid, conversationId);
            java.util.Map<String, String> localExt = c109544Rq2.getLocalExt();
            o.LJIIIIZZ(localExt, "message.localExt");
            localExt.put("a:sticker_store_inline", "");
            C106674Gp.LJIILJJIL(c109544Rq2);
        }
        return false;
    }
}
