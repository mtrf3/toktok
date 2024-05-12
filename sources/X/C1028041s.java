package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeViewModel$onSendMessageEvent$1", f = "SingleChatNoticeViewModel.kt", l = {171, 172}, m = "invokeSuspend")
/* renamed from: X.41s, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1028041s extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SingleChatNoticeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1028041s(SingleChatNoticeViewModel singleChatNoticeViewModel, InterfaceC67352kd<? super C1028041s> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = singleChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1028041s(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            C1036745b c1036745b = this.LJLILLLLZI.LJLIL;
            C1028641y c1028641y = new C1028641y(null);
            this.LJLIL = 1;
            if (C1036745b.LJIIIZ(c1036745b, c1028641y, this, 1) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C1036745b c1036745b2 = this.LJLILLLLZI.LJLIL;
        C41X c41x = C41X.MATCHED_FRIEND;
        this.LJLIL = 2;
        if (c1036745b2.LJFF(c41x, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
