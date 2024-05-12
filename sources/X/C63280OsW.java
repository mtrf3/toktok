package X;

import Y.ARunnableS29S0200000_10;
import Y.IDcS134S0200000_10;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetUserConversationListResponseBody;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.List;

/* renamed from: X.OsW, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63280OsW extends AbstractC63515OwJ<List<C63120Opw>> {
    public final int LIZJ;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63280OsW(C86943b8 c86943b8) {
        super(EnumC63625Oy5.GET_USER_CONVERSATION_LIST.getValue(), c86943b8);
        this.LIZJ = 1;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        GetUserConversationListResponseBody getUserConversationListResponseBody;
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && (getUserConversationListResponseBody = responseBody.get_conversation_list_body) != null && getUserConversationListResponseBody.list != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            GetUserConversationListResponseBody getUserConversationListResponseBody = c63622Oy2.LJLJL.body.get_conversation_list_body;
            List<ConversationInfoV2> list = getUserConversationListResponseBody.list;
            boolean booleanValue = getUserConversationListResponseBody.has_more.booleanValue();
            RunnableC63345OtZ.LJ(new IDcS134S0200000_10(this, list, 13), new C63279OsV(this, c63622Oy2, c63622Oy2.LJLJL.body.get_conversation_list_body.next_cursor.longValue(), booleanValue), false);
            return;
        }
        C63337OtR.LJII(c63622Oy2, false).LIZ();
        LIZIZ(c63622Oy2);
    }
}
