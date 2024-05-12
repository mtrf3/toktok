package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel$onFinishPermissionReminderPopup$1", f = "CommonChatNoticeViewModel.kt", l = {275}, m = "invokeSuspend")
/* renamed from: X.42K, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C42K extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CommonChatNoticeViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42K(CommonChatNoticeViewModel commonChatNoticeViewModel, InterfaceC67352kd<? super C42K> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = commonChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42K(this.LJLILLLLZI, interfaceC67352kd);
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
            CommonChatNoticeViewModel commonChatNoticeViewModel = this.LJLILLLLZI;
            commonChatNoticeViewModel.LJLJJL = true;
            C1036745b c1036745b = commonChatNoticeViewModel.LJLIL;
            this.LJLIL = 1;
            if (c1036745b.LJIILJJIL(this) == enumC58928NAu) {
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
