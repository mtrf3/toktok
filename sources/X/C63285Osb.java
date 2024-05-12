package X;

import Y.ARunnableS29S0200000_10;
import Y.IDbS399S0100000_10;
import com.bytedance.im.core.proto.GetMessageError;
import com.bytedance.im.core.proto.GetMessagesRequestBody;
import com.bytedance.im.core.proto.GetMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageIDIndexEntry;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Osb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63285Osb extends AbstractC63515OwJ<List<C109544Rq>> {
    public final C63120Opw LIZJ;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.get_messages_body != null) {
            return true;
        }
        return false;
    }

    public final void LJIILIIL(List<C109544Rq> list) {
        ArrayList arrayList = new ArrayList();
        for (C109544Rq c109544Rq : list) {
            arrayList.add(new MessageIDIndexEntry(Long.valueOf(c109544Rq.getMsgId()), Long.valueOf(c109544Rq.getIndex())));
        }
        C63450OvG c63450OvG = new C63450OvG();
        c63450OvG.LIZLLL = this.LIZJ.getConversationId();
        c63450OvG.LJ = Integer.valueOf(this.LIZJ.getConversationType());
        c63450OvG.LJFF = Long.valueOf(this.LIZJ.getConversationShortId());
        C63685Oz3.LIZ(arrayList);
        c63450OvG.LJI = arrayList;
        GetMessagesRequestBody build = c63450OvG.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJLIL = build;
        LJIIJJI(this.LIZJ.getInboxType(), c89453Z8v.build(), null, new Object[0]);
    }

    public C63285Osb(C63120Opw c63120Opw, InterfaceC86963bA<List<C109544Rq>> interfaceC86963bA) {
        super(EnumC63625Oy5.GET_MESSAGES.getValue(), interfaceC86963bA);
        this.LIZJ = c63120Opw;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        boolean z;
        List<GetMessageError> list;
        Integer valueOf;
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            z = true;
            GetMessagesResponseBody getMessagesResponseBody = c63622Oy2.LJLJL.body.get_messages_body;
            List<MessageBody> list2 = getMessagesResponseBody.messages;
            if ((list2 != null && list2.size() > 0) || ((list = getMessagesResponseBody.errors) != null && list.size() > 0)) {
                List<MessageBody> list3 = getMessagesResponseBody.messages;
                List<GetMessageError> list4 = getMessagesResponseBody.errors;
                long j = c63622Oy2.LJLIL;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("GetMessagesByMsgIDsHandler update msg, messages:");
                if (list3 == null) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(list3.size());
                }
                LIZ.append(valueOf);
                LIZ.append(" conversation id: ");
                LIZ.append(this.LIZJ.getConversationId());
                LIZ.append(" inbox type: ");
                LIZ.append(this.LIZJ.getInboxType());
                C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                RunnableC63345OtZ.LIZLLL(new C63182Oqw(j, list4, list3), new IDbS399S0100000_10(this, 11), C63346Ota.LIZJ());
            } else {
                LIZLLL(new ArrayList());
            }
        } else {
            z = false;
            LIZIZ(c63622Oy2);
        }
        C63337OtR.LJII(c63622Oy2, z).LIZ();
    }
}
