package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.common.CommonChatNoticeViewModel$onSendMessageEvent$1", f = "CommonChatNoticeViewModel.kt", l = {196}, m = "invokeSuspend")
/* renamed from: X.41c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1026441c extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C91233i3 LJLILLLLZI;
    public final /* synthetic */ CommonChatNoticeViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1026441c(C91233i3 c91233i3, CommonChatNoticeViewModel commonChatNoticeViewModel, InterfaceC67352kd<? super C1026441c> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c91233i3;
        this.LJLJI = commonChatNoticeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C1026441c(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            int msgStatus = this.LJLILLLLZI.LIZIZ.getMsgStatus();
            if (msgStatus != 2) {
                if (msgStatus == 3) {
                    CommonChatNoticeViewModel commonChatNoticeViewModel = this.LJLJI;
                    C109544Rq c109544Rq = this.LJLILLLLZI.LIZIZ;
                    commonChatNoticeViewModel.getClass();
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(commonChatNoticeViewModel), null, null, new C1026341b(c109544Rq, commonChatNoticeViewModel, null), 3);
                }
                return C76800UCe.LIZ;
            }
            CommonChatNoticeViewModel commonChatNoticeViewModel2 = this.LJLJI;
            this.LJLIL = 1;
            if (commonChatNoticeViewModel2.gv0(true, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJI.LJLIL.LJIILIIL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
