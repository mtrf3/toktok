package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.im.core.proto.ResponseBody;

/* renamed from: X.OsD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63261OsD extends AbstractC63515OwJ {
    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63261OsD() {
        super(EnumC63625Oy5.GET_MESSAGES_BY_CONVERSATION.getValue());
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.messages_in_conversation_body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            String str = (String) c63622Oy2.LJLJJL[0];
            RunnableC63345OtZ.LIZLLL(new C63190Or4(this, c63622Oy2.LJLJL.body.messages_in_conversation_body, c63622Oy2, str), new C63187Or1(str), C63346Ota.LIZJ());
            C63337OtR.LJII(c63622Oy2, true).LIZ();
            return;
        }
        C63337OtR.LJII(c63622Oy2, false).LIZ();
    }

    public final void LJIILIIL(long j, C63120Opw c63120Opw) {
        C63469OvZ c63469OvZ = new C63469OvZ();
        c63469OvZ.LIZLLL = c63120Opw.getConversationId();
        c63469OvZ.LJFF = Long.valueOf(c63120Opw.getConversationShortId());
        c63469OvZ.LJ = Integer.valueOf(c63120Opw.getConversationType());
        c63469OvZ.LJI = EnumC63513OwH.OLDER;
        c63469OvZ.LJII = Long.valueOf(j);
        MessagesInConversationRequestBody build = c63469OvZ.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJIIJ = build;
        LJIIJJI(c63120Opw.getInboxType(), c89453Z8v.build(), null, c63120Opw.getConversationId());
    }
}
