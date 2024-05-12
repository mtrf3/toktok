package X;

import Y.ARunnableS29S0200000_10;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.MessageBody;
import java.util.HashMap;

/* renamed from: X.OsM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63270OsM implements InterfaceC86963bA<MessageBody> {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ ConversationInfoV2 LIZIZ;
    public final /* synthetic */ C63271OsN LIZJ;

    @Override // X.InterfaceC86963bA
    public final void LIZIZ(C63623Oy3 c63623Oy3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pull msg error ");
        LIZ.append(c63623Oy3.toString());
        C63272OsO.LJIIJ(-2004, X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC86963bA
    public final void onSuccess(MessageBody messageBody) {
        MessageBody messageBody2 = messageBody;
        if (messageBody2 != null) {
            Integer num = messageBody2.status;
            if (num != null && num.intValue() == 1) {
                HashMap hashMap = new HashMap();
                hashMap.put("conversation_id", messageBody2.conversation_id);
                hashMap.put("msg_id", String.valueOf(messageBody2.server_message_id));
                C63275OsR.LIZIZ().LIZLLL(EnumC63665Oyj.COUNTER, "conversation_repair_last_msg_disable", hashMap);
            }
            C63346Ota.LIZIZ().execute(new ARunnableS29S0200000_10(messageBody2, this, 59));
            return;
        }
        C63272OsO.LJIIJ(-2005, "pull msg result null");
    }

    public C63270OsM(C63271OsN c63271OsN, int i, ConversationInfoV2 conversationInfoV2) {
        this.LIZJ = c63271OsN;
        this.LIZ = i;
        this.LIZIZ = conversationInfoV2;
    }
}
