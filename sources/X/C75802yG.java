package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatNoticeViewModel$sendNoticeAck$1", f = "ChatNoticeViewModel.kt", l = {172}, m = "invokeSuspend")
/* renamed from: X.2yG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75802yG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ ChatNoticeViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75802yG(String str, int i, ChatNoticeViewModel chatNoticeViewModel, InterfaceC67352kd<? super C75802yG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = chatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75802yG(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                TikTokImApi LIZ = C30U.LIZ();
                String str = this.LJLILLLLZI;
                int i2 = this.LJLJI;
                String conversationId = this.LJLJJI.LJLIL.getConversationId();
                this.LJLIL = 1;
                if (C80753Ex.LIZ(LIZ, str, "dm_chat", i2, conversationId, null, this, 16) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        } catch (Exception e) {
            C34B.LIZLLL("ChatNoticeViewModel", "read status ack error: ", e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
