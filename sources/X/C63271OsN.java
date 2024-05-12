package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.GetConversationInfoListV2ResponseBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.List;

/* renamed from: X.OsN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63271OsN extends AbstractC63515OwJ {
    public volatile boolean LIZJ;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return true;
    }

    public C63271OsN() {
        super(EnumC63625Oy5.GET_CONVERSATION_INFO_LIST_V2.getValue());
        this.LIZJ = false;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        GetConversationInfoListV2ResponseBody getConversationInfoListV2ResponseBody;
        ResponseBody responseBody = c63622Oy2.LJLJL.body;
        if (responseBody != null && (getConversationInfoListV2ResponseBody = responseBody.get_conversation_info_list_v2_body) != null && getConversationInfoListV2ResponseBody.conversation_info_list != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        String str;
        Boolean bool;
        int intValue = c63622Oy2.LJLJJLL.inbox_type.intValue();
        if (!c63622Oy2.LJIIJ() || !LJIIIZ(c63622Oy2)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pull conversation_info error ");
            Response response = c63622Oy2.LJLJL;
            if (response != null) {
                str = response.error_desc;
            } else {
                str = "";
            }
            LIZ.append(str);
            C63272OsO.LJIIJ(-2001, X1D.LIZIZ(LIZ));
            return;
        }
        List<ConversationInfoV2> list = c63622Oy2.LJLJL.body.get_conversation_info_list_v2_body.conversation_info_list;
        if (list == null || list.isEmpty()) {
            C63272OsO.LJIIJ(-2002, "body isEmpty ");
            return;
        }
        for (ConversationInfoV2 conversationInfoV2 : list) {
            if (conversationInfoV2 == null || ((bool = conversationInfoV2.is_participant) != null && !bool.booleanValue())) {
                C63272OsO.LJIIJ(-2003, "not member");
            } else {
                new C63273OsP(-1, new C63270OsM(this, intValue, conversationInfoV2)).LJIILIIL(conversationInfoV2.conversation_short_id.longValue(), 0L, intValue, conversationInfoV2.conversation_type.intValue(), conversationInfoV2.conversation_id);
            }
        }
    }
}
