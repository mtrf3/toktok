package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.GetStrangerConversationListRequestBody;
import com.bytedance.im.core.proto.GetStrangerConversationListResponseBody;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.StrangerConversation;
import java.util.List;

/* renamed from: X.OwX, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63529OwX extends AbstractC63515OwJ<List<C63120Opw>> {
    public boolean LIZJ;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63529OwX(AbstractC75682y4<List<C63120Opw>> abstractC75682y4) {
        super(EnumC63625Oy5.GET_STRANGER_CONVERSATION_LIST.getValue(), abstractC75682y4);
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && responseBody.get_stranger_conversation_body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        long j;
        boolean z;
        int intValue;
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            GetStrangerConversationListResponseBody getStrangerConversationListResponseBody = c63622Oy2.LJLJL.body.get_stranger_conversation_body;
            List<StrangerConversation> list = getStrangerConversationListResponseBody.conversation_list;
            Long l = getStrangerConversationListResponseBody.next_cursor;
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            Boolean bool = getStrangerConversationListResponseBody.has_more;
            if (bool != null && bool.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            int intValue2 = c63622Oy2.LJLJL.inbox_type.intValue();
            if (this.LIZJ) {
                Integer num = getStrangerConversationListResponseBody.total_unread;
                if (num == null) {
                    intValue = 0;
                } else {
                    intValue = num.intValue();
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("StrangerConversationHandler get totalUnread:");
                LIZ.append(intValue);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                C115394fv.LJII().getClass();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("StrangerManager setTotalUnread:");
                LIZ2.append(intValue);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
            }
            if (list == null || list.isEmpty()) {
                C63322OtC.LJFF("StrangerConversationHandler handleResponse list empty");
                LIZJ(j, null, z);
            } else {
                RunnableC63345OtZ.LJ(new C63118Opu(list, intValue2), new C63532Owa(this, j, z), false);
            }
            C63337OtR.LJII(c63622Oy2, true).LIZ();
            return;
        }
        C63337OtR.LJII(c63622Oy2, false).LIZ();
        LIZIZ(c63622Oy2);
    }

    public final void LJIILIIL(long j, long j2) {
        StringBuilder LIZLLL = C1FJ.LIZLLL("StrangerConversationHandler get, inbox:", 0, ", cursor:", j);
        C0MT.LIZLLL(LIZLLL, ", count:", j2, ", needTotalUnread:");
        LIZLLL.append(false);
        C63322OtC.LJFF(X1D.LIZIZ(LIZLLL));
        if (j2 <= 0) {
            j2 = 20;
        }
        this.LIZJ = false;
        C63530OwY c63530OwY = new C63530OwY();
        c63530OwY.LJ = Long.valueOf(j2);
        c63530OwY.LIZLLL = Long.valueOf(j);
        c63530OwY.LJFF = Boolean.FALSE;
        GetStrangerConversationListRequestBody build = c63530OwY.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJJJIL = build;
        LJIIJJI(0, c89453Z8v.build(), null, new Object[0]);
    }
}
