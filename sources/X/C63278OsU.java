package X;

import Y.ARunnableS29S0200000_10;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.im.core.proto.GetMessageByIdRequestBody;
import com.bytedance.im.core.proto.GetMessageByIdResponseBody;
import com.bytedance.im.core.proto.MessageInfo;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.HashMap;

/* renamed from: X.OsU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63278OsU extends AbstractC63515OwJ<C109544Rq> {
    public static boolean LIZLLL;
    public final LruCache<Long, C109544Rq> LIZJ;

    @Override // X.AbstractC63515OwJ
    public final boolean LJFF() {
        return false;
    }

    public C63278OsU(C63174Oqo c63174Oqo) {
        super(EnumC63625Oy5.GET_MESSAGE_INFO_BY_SERVER_ID.getValue(), c63174Oqo);
        this.LIZJ = new LruCache<>(C63308Osy.LJI().LIZLLL().LJJJJIZL);
        LIZLLL = true;
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        Response response;
        ResponseBody responseBody;
        GetMessageByIdResponseBody getMessageByIdResponseBody;
        MessageInfo messageInfo;
        if (c63622Oy2 != null && (response = c63622Oy2.LJLJL) != null && (responseBody = response.body) != null && (getMessageByIdResponseBody = responseBody.get_message_by_id_body) != null && (messageInfo = getMessageByIdResponseBody.msg_info) != null && messageInfo.body != null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        boolean z;
        String str;
        if (c63622Oy2.LJIIJ() && LJIIIZ(c63622Oy2)) {
            z = true;
        } else {
            z = false;
        }
        if (LJIIIZ(c63622Oy2)) {
            GetMessageByIdResponseBody getMessageByIdResponseBody = c63622Oy2.LJLJL.body.get_message_by_id_body;
            java.util.Map<String, String> map = getMessageByIdResponseBody.msg_info.body.ext;
            if (map != null && map.containsKey("s:client_message_id") && !TextUtils.isEmpty(map.get("s:client_message_id"))) {
                str = map.get("s:client_message_id");
            } else {
                str = "";
            }
            C109544Rq LJIIL = C63081OpJ.LJIIL(str, null, getMessageByIdResponseBody.msg_info.body);
            if (C63308Osy.LJI().LIZLLL().LJJZZIII) {
                LJIIL.updateMentionLocalExt();
            }
            LJIIL.setMessageStatus(getMessageByIdResponseBody.msg_info.status);
            this.LIZJ.put(Long.valueOf(LJIIL.getMsgId()), LJIIL);
            if (LIZLLL) {
                HashMap hashMap = new HashMap();
                hashMap.put("s:get_msg_log_id", c63622Oy2.LJIIIIZZ());
                C63195Or9 LJIJ = C63192Or6.LJIJ(getMessageByIdResponseBody.msg_info.body, false, hashMap, -1);
                if (LJIJ != null && LJIJ.LIZJ) {
                    LIZLLL(LJIJ.LIZ);
                } else {
                    C63623Oy3 c63623Oy3 = new C63375Ou3().LIZ;
                    c63623Oy3.LIZJ = "saveMessage fail";
                    LIZ(c63623Oy3);
                }
            } else {
                LIZLLL(LJIIL);
            }
        } else {
            LIZIZ(c63622Oy2);
        }
        C63337OtR.LJII(c63622Oy2, z).LIZ();
    }

    public final void LJIILIIL(long j, C63120Opw c63120Opw) {
        String conversationId = c63120Opw.getConversationId();
        Long valueOf = Long.valueOf(c63120Opw.getConversationShortId());
        Integer valueOf2 = Integer.valueOf(c63120Opw.getConversationType());
        Integer valueOf3 = Integer.valueOf(c63120Opw.getInboxType());
        C63477Ovh c63477Ovh = new C63477Ovh();
        c63477Ovh.LIZLLL = conversationId;
        c63477Ovh.LJFF = valueOf;
        c63477Ovh.LJ = valueOf2;
        c63477Ovh.LJI = Long.valueOf(j);
        GetMessageByIdRequestBody build = c63477Ovh.build();
        C89453Z8v c89453Z8v = new C89453Z8v();
        c89453Z8v.LJIIIZ = build;
        LJIIJJI(valueOf3.intValue(), c89453Z8v.build(), null, new Object[0]);
    }
}
