package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel$dismissBannersForInputPanel$1", f = "CommonChatNoticeViewModel.kt", l = {174}, m = "invokeSuspend")
/* renamed from: X.42F, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42F extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CommonChatNoticeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42F(CommonChatNoticeViewModel commonChatNoticeViewModel, InterfaceC67352kd<? super C42F> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = commonChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42F(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C1036745b c1036745b = this.LJLILLLLZI.LJLIL;
            C42E c42e = new C42E(null);
            this.LJLIL = 1;
            if (c1036745b.LJIIIIZZ(false, c42e, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}