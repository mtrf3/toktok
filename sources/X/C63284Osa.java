package X;

import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.ResponseBody;

/* renamed from: X.Osa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63284Osa extends AbstractC63234Orm {
    public C63284Osa() {
        super(EnumC63625Oy5.STRANGER_NEW_MSG_NOTIFY.getValue());
    }

    @Override // X.AbstractC63234Orm
    public final void LJIILIIL(int i, ResponseBody responseBody, EP1 ep1) {
        NewMessageNotify newMessageNotify;
        String str;
        if (responseBody == null || (newMessageNotify = responseBody.has_new_message_notify) == null) {
            return;
        }
        MessageBody messageBody = newMessageNotify.message;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive new stranger msg, cid:");
        Long l = null;
        if (messageBody == null) {
            str = null;
        } else {
            str = messageBody.conversation_id;
        }
        LIZ.append(str);
        LIZ.append(", msgId:");
        if (messageBody != null) {
            l = messageBody.server_message_id;
        }
        LIZ.append(l);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        C115394fv LJII = C115394fv.LJII();
        NewMessageNotify newMessageNotify2 = responseBody.has_new_message_notify;
        LJII.getClass();
        if (newMessageNotify2 == null) {
            return;
        }
        C63322OtC.LJFF("StrangerManager receiveStrangerMsg");
        LJII.LJ();
    }
}
