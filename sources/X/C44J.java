package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel$parseTopMessageExtras$2", f = "CommonChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.44J, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44J extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super SystemContent>, Object> {
    public final /* synthetic */ C109544Rq LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44J(C109544Rq c109544Rq, InterfaceC67352kd<? super C44J> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C44J(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        CheckMessage.StatusMsg statusMsg;
        C141335gf.LIZJ(obj);
        CheckMessage checkMessage = (CheckMessage) C62070OXq.LIZ(CheckMessage.class, this.LJLIL.getLocalExt().get("s:send_response_check_msg"));
        if (checkMessage != null && (statusMsg = checkMessage.getStatusMsg()) != null && statusMsg.getMsgType() == 1022) {
            return CheckMessage.Companion.getContent(checkMessage);
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super SystemContent> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
