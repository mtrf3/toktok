package X;

import com.bytedance.im.core.proto.NewDirectPushNotify;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* renamed from: X.Os9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63257Os9 extends AbstractC63234Orm {
    public C63257Os9() {
        super(EnumC63625Oy5.NEW_DIRECT_PUSH_NOTIFY.getValue());
    }

    @Override // X.AbstractC63234Orm
    public final void LJIILIIL(int i, ResponseBody responseBody, EP1 ep1) {
        int value;
        NewDirectPushNotify newDirectPushNotify = responseBody.has_new_direct_push_notify;
        if (newDirectPushNotify == null) {
            C63322OtC.LJFF("NewP2PMsgNotifyHandler receive NewP2PMessageNotify:null");
            return;
        }
        EnumC63735Ozr enumC63735Ozr = newDirectPushNotify.send_type;
        if (enumC63735Ozr == null) {
            value = 0;
        } else {
            value = enumC63735Ozr.getValue();
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NewP2PMsgNotifyHandler receive NewP2PMessageNotify, inbox:");
        LIZ.append(i);
        LIZ.append(", sendType:");
        LIZ.append(value);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        C109544Rq c109544Rq = new C109544Rq();
        c109544Rq.setSender(newDirectPushNotify.sender.longValue());
        c109544Rq.setSecSender(newDirectPushNotify.sec_sender);
        c109544Rq.setConversationId(newDirectPushNotify.conversation_id);
        c109544Rq.setConversationShortId(newDirectPushNotify.conversation_short_id.longValue());
        c109544Rq.setConversationType(newDirectPushNotify.conversation_type.intValue());
        c109544Rq.setMsgType(newDirectPushNotify.message_type.intValue());
        c109544Rq.setContent(newDirectPushNotify.content);
        c109544Rq.setExt(newDirectPushNotify.ext);
        c109544Rq.setCreatedAt(newDirectPushNotify.create_time.longValue());
        Iterator it = ((CopyOnWriteArraySet) C63309Osz.LIZLLL().LJI).iterator();
        while (it.hasNext()) {
            InterfaceC63256Os8 interfaceC63256Os8 = (InterfaceC63256Os8) it.next();
            if (interfaceC63256Os8 != null) {
                interfaceC63256Os8.LIZ();
            }
        }
        int msgType = c109544Rq.getMsgType();
        EnumC63179Oqt enumC63179Oqt = EnumC63179Oqt.MESSAGE_TYPE_READ_COMMAND;
        if (msgType == enumC63179Oqt.getValue()) {
            C4WD LIZ2 = C4WD.LIZ();
            LIZ2.getClass();
            if (c109544Rq.getMsgType() == enumC63179Oqt.getValue()) {
                try {
                    JSONObject jSONObject = new JSONObject(c109544Rq.getContent());
                    LIZ2.LIZJ(jSONObject.optLong("UserId"), jSONObject.optLong("MessageId"), c109544Rq.getConversationId(), false, jSONObject.optLong("ReadIndex"));
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }
}
