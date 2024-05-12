package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel;
import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatNoticeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatNoticeViewModel$fetch$1$1", f = "ChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2yI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75822yI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ChatNoticeViewModel LJLIL;
    public final /* synthetic */ ImChatTopTipModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75822yI(ChatNoticeViewModel chatNoticeViewModel, ImChatTopTipModel imChatTopTipModel, InterfaceC67352kd<? super C75822yI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = chatNoticeViewModel;
        this.LJLILLLLZI = imChatTopTipModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75822yI(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLJLJ.setValue(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
