package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.ParticipantReadIndex;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.List;

/* renamed from: X.Orn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63235Orn extends AbstractC63515OwJ<List<ParticipantReadIndex>> {
    public C63235Orn(C63227Orf c63227Orf) {
        super(EnumC63625Oy5.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3.getValue(), c63227Orf);
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        Response response;
        ResponseBody responseBody;
        if (c63622Oy2 != null && (response = c63622Oy2.LJLJL) != null && (responseBody = response.body) != null && responseBody.participants_read_index_body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        boolean z;
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            z = true;
        } else {
            z = false;
        }
        C63120Opw c63120Opw = (C63120Opw) c63622Oy2.LJLJJL[0];
        String conversationId = c63120Opw.getConversationId();
        if (z) {
            LIZLLL(c63622Oy2.LJLJL.body.participants_read_index_body.indexes);
        } else {
            LIZIZ(c63622Oy2);
        }
        C115064fO LJII = C63337OtR.LJII(c63622Oy2, z);
        LJII.LIZJ.put("conversation_id", conversationId);
        LJII.LIZJ.put("conversation_type", Integer.valueOf(c63120Opw.getConversationType()));
        LJII.LIZ();
    }
}
