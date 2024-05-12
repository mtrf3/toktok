package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IInterceptor;
import org.json.JSONObject;

/* renamed from: X.CQp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31311CQp implements IInterceptor {
    public long LIZ;

    @Override // com.ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if (!(iMessage instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) iMessage;
        if (this.LIZ <= 0) {
            this.LIZ = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        }
        User user = chatMessage.userInfo;
        if (user == null) {
            C77633UdR c77633UdR = new C77633UdR();
            c77633UdR.LIZ(chatMessage.content, "content");
            c77633UdR.LIZ(String.valueOf(chatMessage.visibleToSender), "is_visiable_to_senter");
            c77633UdR.LIZ(String.valueOf(chatMessage.supportDisplayText()), "support_display_text");
            c77633UdR.LIZ(String.valueOf(this.LIZ), "client_user_id");
            JSONObject jSONObject = (JSONObject) c77633UdR.LIZ;
            JSONObject jSONObject2 = (JSONObject) c77633UdR.LIZIZ;
            InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
            if (interfaceC31203CMl != null) {
                interfaceC31203CMl.monitorStatusAndDuration("chat_message_exception_log", 0, jSONObject, jSONObject2);
            }
            return true;
        }
        if (chatMessage.visibleToSender) {
            return false;
        }
        long j = this.LIZ;
        if (j <= 0 || j != user.getId() || chatMessage.isHistoryMessage) {
            return false;
        }
        return true;
    }
}
