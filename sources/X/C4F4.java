package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatprofile.ChatProfileViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatprofile.ChatProfileViewModel$trackShowProfileAvatarEvent$1", f = "ChatProfileViewModel.kt", l = {35}, m = "invokeSuspend")
/* renamed from: X.4F4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4F4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ChatProfileViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4F4(ChatProfileViewModel chatProfileViewModel, InterfaceC67352kd<? super C4F4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = chatProfileViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4F4(this.LJLILLLLZI, interfaceC67352kd);
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
            ChatProfileViewModel chatProfileViewModel = this.LJLILLLLZI;
            XKW xkw = chatProfileViewModel.LJLJI;
            C4F5 c4f5 = new C4F5(chatProfileViewModel, null);
            this.LJLIL = 1;
            obj = XKX.LJI(xkw, c4f5, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        IMUser iMUser = (IMUser) obj;
        if (iMUser != null && iMUser.getUid() != null) {
            C1042547h.LJIIJ(((C99033ud) this.LJLILLLLZI.LJLJJL.getValue()).getEnterFromForMob(), String.valueOf(iMUser.getFriendRecType()), String.valueOf(iMUser.getFollowStatus()));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
