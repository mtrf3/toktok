package X;

import com.bytedance.im.core.proto.MarkConversationReadNotify;
import com.bytedance.im.core.proto.ResponseBody;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.OxS, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63586OxS extends AbstractC63234Orm {
    public C63586OxS() {
        super(EnumC63625Oy5.MARK_READ_NOTIFY.getValue());
    }

    @Override // X.AbstractC63234Orm
    public final void LJIILIIL(int i, ResponseBody responseBody, EP1 ep1) {
        Long l;
        MarkConversationReadNotify markConversationReadNotify;
        Long l2;
        String str;
        Long l3;
        Long l4;
        MarkConversationReadNotify markConversationReadNotify2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handleResponse msgId: ");
        if (responseBody != null && (markConversationReadNotify2 = responseBody.mark_conversation_read_notify) != null) {
            l = markConversationReadNotify2.message_id;
        } else {
            l = null;
        }
        LIZ.append(l);
        C63322OtC.LJI("NewMarkReadMsgNotifyHandler", X1D.LIZIZ(LIZ), null);
        if (responseBody == null || (markConversationReadNotify = responseBody.mark_conversation_read_notify) == null || (l2 = markConversationReadNotify.message_id) == null) {
            return;
        }
        long longValue = l2.longValue();
        MarkConversationReadNotify markConversationReadNotify3 = responseBody.mark_conversation_read_notify;
        if (markConversationReadNotify3 == null || (str = markConversationReadNotify3.conversation_id) == null || markConversationReadNotify3 == null || (l3 = markConversationReadNotify3.user_id) == null) {
            return;
        }
        long longValue2 = l3.longValue();
        MarkConversationReadNotify markConversationReadNotify4 = responseBody.mark_conversation_read_notify;
        if (markConversationReadNotify4 == null || (l4 = markConversationReadNotify4.read_index) == null) {
            return;
        }
        C4WD.LIZ().LIZJ(longValue2, longValue, str, true, l4.longValue());
        C63323OtD c63323OtD = new C63323OtD();
        c63323OtD.LIZJ("qos_read_receipt_perf");
        c63323OtD.LIZ("-1", "mark_read_cost");
        c63323OtD.LIZ(CardStruct.IStatusCode.DEFAULT, "display_cost");
        c63323OtD.LIZ("-1", "server_cost");
        c63323OtD.LIZLLL();
    }
}
