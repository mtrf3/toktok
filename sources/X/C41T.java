package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.BaseChatPanel$observeChatNotice$1$1", f = "BaseChatPanel.kt", l = {1456}, m = "invokeSuspend")
/* renamed from: X.41T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C41T extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ BaseChatPanel LJLILLLLZI;
    public final /* synthetic */ ImChatTopTipModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41T(BaseChatPanel baseChatPanel, ImChatTopTipModel imChatTopTipModel, InterfaceC67352kd<? super C41T> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = baseChatPanel;
        this.LJLJI = imChatTopTipModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41T(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            BaseChatPanel baseChatPanel = this.LJLILLLLZI;
            ImChatTopTipModel imChatTopTipModel = this.LJLJI;
            this.LJLIL = 1;
            if (baseChatPanel.LIZJ(imChatTopTipModel, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C1036745b LJI = this.LJLILLLLZI.LJI();
        if (LJI != null) {
            LJI.LJIILIIL();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
