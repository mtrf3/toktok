package X;

import Y.ARunnableS29S0200000_10;
import Y.ARunnableS9S1200000_10;
import android.text.TextUtils;
import com.bytedance.im.core.proto.MessagesCheckInfo;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.List;

/* renamed from: X.OsQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63274OsQ extends AbstractC63515OwJ {
    public long LIZJ;
    public long LIZLLL;
    public final boolean LJ;

    public C63274OsQ() {
        super(EnumC63625Oy5.GET_MESSAGES_CHECKINFO_IN_CONVERSATION.getValue());
        this.LJ = false;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        Response response;
        ResponseBody responseBody;
        if (c63622Oy2 != null && (response = c63622Oy2.LJLJL) != null && (responseBody = response.body) != null && responseBody.get_messages_checkinfo_in_conversation_body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        if (LJIIIZ(c63622Oy2) && c63622Oy2.LJIIJ()) {
            String str = (String) c63622Oy2.LJLJJL[0];
            c63622Oy2.LJLJJLL.inbox_type.intValue();
            List<MessagesCheckInfo> list = c63622Oy2.LJLJL.body.get_messages_checkinfo_in_conversation_body.msgs_checkinfo_list;
            if (list == null || list.isEmpty() || TextUtils.isEmpty(str)) {
                return;
            }
            C63346Ota.LIZIZ().execute(new ARunnableS9S1200000_10(this, list, str, 10));
        }
    }
}
