package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.ConversationApplyInfo;
import com.bytedance.im.core.proto.GetConversationAuditListRequestBody;
import com.bytedance.im.core.proto.GetConversationAuditListResponseBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.List;

/* renamed from: X.4nv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C120354nv extends AbstractC63515OwJ<C95963pg> {
    static {
        GetConversationAuditListRequestBody.registerAdapter();
        GetConversationAuditListResponseBody.registerAdapter();
    }

    public C120354nv(InterfaceC86963bA<C95963pg> interfaceC86963bA) {
        super(EnumC63625Oy5.GET_CONVERSATION_AUDIT_LIST.getValue(), interfaceC86963bA);
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        ResponseBody responseBody;
        Response response = c63622Oy2.LJLJL;
        if (response != null && (responseBody = response.body) != null && responseBody.getExtension(2027) != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        int i = 0;
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            GetConversationAuditListResponseBody getConversationAuditListResponseBody = (GetConversationAuditListResponseBody) c63622Oy2.LJLJL.body.getExtension(2027);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("GetConversationAuditListHandler Successlist_size = ");
            List<ConversationApplyInfo> list = getConversationAuditListResponseBody.apply_info_list;
            if (list != null) {
                i = list.size();
            }
            LIZ.append(i);
            C63322OtC.LIZ(X1D.LIZIZ(LIZ));
            LIZLLL(new C95963pg(getConversationAuditListResponseBody.next_cursor.longValue(), getConversationAuditListResponseBody.apply_info_list, getConversationAuditListResponseBody.has_more.booleanValue()));
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("GetConversationAuditListHandler Failed, code = ");
        LIZ2.append(c63622Oy2.LJLL);
        LIZ2.append(" &status = ");
        LIZ2.append(c63622Oy2.LJIIIZ());
        LIZ2.append(" &checkCode = ");
        LIZ2.append(c63622Oy2.LIZLLL());
        LIZ2.append(" &checkMsg = ");
        LIZ2.append(c63622Oy2.LJ());
        LIZ2.append(" &logId = ");
        LIZ2.append(c63622Oy2.LJIIIIZZ());
        C63322OtC.LIZLLL(X1D.LIZIZ(LIZ2));
        C63337OtR.LJII(c63622Oy2, false).LIZ();
        LIZIZ(c63622Oy2);
    }

    public final void LJIILIIL(long j, long j2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GetConversationAuditListHandler, request cursor = ");
        LIZ.append(j);
        LIZ.append(" &limit = ");
        LIZ.append(20);
        LIZ.append(" &no_clear_unread");
        LIZ.append(false);
        C63322OtC.LIZ(X1D.LIZIZ(LIZ));
        C120484o8 c120484o8 = new C120484o8();
        c120484o8.LIZLLL = Long.valueOf(j);
        c120484o8.LJ = 20;
        c120484o8.LJFF = Long.valueOf(j2);
        c120484o8.LJI = Boolean.FALSE;
        GetConversationAuditListRequestBody build = c120484o8.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LIZIZ(2027, GetConversationAuditListRequestBody.ADAPTER, build);
        LJIIJJI(0, c89453Z8v.build(), null, new Object[0]);
    }
}
