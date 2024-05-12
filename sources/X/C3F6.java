package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnotice.single.SingleChatNoticeAssem$registerChatNoticeHandlers$1$4", f = "SingleChatNoticeAssem.kt", l = {205}, m = "invokeSuspend")
/* renamed from: X.3F6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3F6 extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super IMUser>, Object> {
    public int LJLIL;
    public final /* synthetic */ SingleChatNoticeAssem LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3F6(SingleChatNoticeAssem singleChatNoticeAssem, InterfaceC67352kd<? super C3F6> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLILLLLZI = singleChatNoticeAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3F6(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super IMUser> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
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
            ChatRoomViewModel chatRoomViewModel = (ChatRoomViewModel) this.LJLILLLLZI.LLD.getValue();
            obj = null;
            if (chatRoomViewModel != null) {
                this.LJLIL = 1;
                obj = XKX.LJI(chatRoomViewModel.LJLLJ, new C3F4(chatRoomViewModel, null), this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return obj;
    }
}
