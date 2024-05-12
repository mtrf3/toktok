package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.BatchGetMessagesResponseBody;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Otm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63358Otm extends AbstractC63515OwJ<List<? extends C109544Rq>> {
    public C63358Otm(InterfaceC86963bA<List<C109544Rq>> interfaceC86963bA) {
        super(EnumC63625Oy5.BATCH_GET_MESSAGES.getValue(), interfaceC86963bA);
    }

    @Override // X.AbstractC63515OwJ
    public final boolean LJIIIZ(C63622Oy2 c63622Oy2) {
        Response response;
        ResponseBody responseBody;
        if (c63622Oy2 == null || !c63622Oy2.LJIIJ() || (response = c63622Oy2.LJLJL) == null || (responseBody = response.body) == null || responseBody.batch_get_messages_body == null) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC63515OwJ
    public final void LJII(C63622Oy2 c63622Oy2, ARunnableS29S0200000_10 aRunnableS29S0200000_10) {
        ResponseBody responseBody;
        BatchGetMessagesResponseBody batchGetMessagesResponseBody;
        List<MessageBody> list;
        String str;
        if (!LJIIIZ(c63622Oy2)) {
            LIZIZ(c63622Oy2);
            return;
        }
        Response response = c63622Oy2.LJLJL;
        if (response != null && (responseBody = response.body) != null && (batchGetMessagesResponseBody = responseBody.batch_get_messages_body) != null && (list = batchGetMessagesResponseBody.messages) != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            for (MessageBody messageBody : list) {
                java.util.Map<String, String> map = messageBody.ext;
                if (map == null || (str = map.get("s:client_message_id")) == null) {
                    str = "";
                }
                arrayList.add(C63081OpJ.LJIIL(str, null, messageBody));
            }
            LIZLLL(arrayList);
            return;
        }
        LIZIZ(c63622Oy2);
    }
}
