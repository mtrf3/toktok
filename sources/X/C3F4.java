package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatRoomViewModel$getOtherUser$2", f = "ChatRoomViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3F4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3F4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super IMUser>, Object> {
    public final /* synthetic */ ChatRoomViewModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3F4(ChatRoomViewModel chatRoomViewModel, InterfaceC67352kd<? super C3F4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = chatRoomViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3F4(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IMUser singleChatFromUser = this.LJLIL.LJLIL.getSingleChatFromUser();
        if (singleChatFromUser == null) {
            return null;
        }
        IMUser LJFF = C80533Eb.LJFF(singleChatFromUser.getUid(), singleChatFromUser.getSecUid());
        if (LJFF == null) {
            return singleChatFromUser;
        }
        return LJFF;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super IMUser> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
