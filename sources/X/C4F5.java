package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatprofile.ChatProfileViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatprofile.ChatProfileViewModel$trackShowProfileAvatarEvent$1$user$1", f = "ChatProfileViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4F5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4F5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super IMUser>, Object> {
    public final /* synthetic */ ChatProfileViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4F5(ChatProfileViewModel chatProfileViewModel, InterfaceC67352kd<? super C4F5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = chatProfileViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4F5(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C80533Eb.LJIIJ(((C99033ud) this.LJLIL.LJLJJL.getValue()).getSingleChatFromUserId(), null);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super IMUser> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
