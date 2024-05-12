package X;

import kotlin.jvm.internal.o;

/* renamed from: X.3zY, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102083zY {
    public static final /* synthetic */ int LJFF = 0;
    public final C63120Opw LIZ;
    public C109544Rq LIZIZ;
    public int LIZJ = -1;
    public C109544Rq LIZLLL;
    public boolean LJ;

    static {
        new C102103za();
    }

    public final void LIZ() {
        Long l;
        C109544Rq c109544Rq = this.LIZIZ;
        if (c109544Rq == null || o.LJ(this.LIZLLL, c109544Rq)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("reportMessageReply lastReportMessage has been replied: ");
            C109544Rq c109544Rq2 = this.LIZIZ;
            Long l2 = null;
            if (c109544Rq2 != null) {
                l = Long.valueOf(c109544Rq2.getMsgId());
            } else {
                l = null;
            }
            LIZ.append(l);
            LIZ.append(", ");
            C109544Rq c109544Rq3 = this.LIZLLL;
            if (c109544Rq3 != null) {
                l2 = Long.valueOf(c109544Rq3.getMsgId());
            }
            LIZ.append(l2);
            C34B.LIZIZ("ReadStateReporter", X1D.LIZIZ(LIZ));
            return;
        }
        this.LIZLLL = this.LIZIZ;
        LIZIZ("replied");
    }

    public C102083zY(C63120Opw c63120Opw) {
        this.LIZ = c63120Opw;
    }

    public final void LIZIZ(String str) {
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportReadStateInternal: ");
        LIZ.append(str);
        C34B.LIZIZ("ReadStateReporter", X1D.LIZIZ(LIZ));
        C63120Opw conversation = this.LIZ;
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(conversation, "conversation");
        o.LJIIIZ(eventSender, "eventSender");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("conversation_id", conversation.getConversationId());
        if (conversation.isGroupChat()) {
            str2 = "group";
        } else {
            str2 = "private";
        }
        c188727au.LJIIIZ("chat_type", str2);
        if (!conversation.isGroupChat()) {
            c188727au.LJ(C81273Gx.LIZLLL(conversation.getConversationId()), "to_user_id");
        }
        c188727au.LJIIIZ("read_status", str);
        java.util.Map<String, String> map = c188727au.LIZ;
        o.LJIIIIZZ(map, "newBuilder()\n           …               .builder()");
        eventSender.LIZIZ("message_read_status", map);
    }
}
