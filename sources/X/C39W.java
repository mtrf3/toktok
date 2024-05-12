package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.ChatViewModel$restoreMessageDraft$1", f = "ChatViewModel.kt", l = {659}, m = "invokeSuspend")
/* renamed from: X.39W, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C39W extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ChatViewModel LJLILLLLZI;
    public final /* synthetic */ AbstractC90763hI LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39W(AbstractC90763hI abstractC90763hI, ChatViewModel chatViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = chatViewModel;
        this.LJLJI = abstractC90763hI;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C39W(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
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
            ChatViewModel chatViewModel = this.LJLILLLLZI;
            XKW xkw = chatViewModel.LJLJJI;
            C39X c39x = new C39X(this.LJLJI, chatViewModel, null);
            this.LJLIL = 1;
            obj = XKX.LJI(xkw, c39x, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        OSZ osz = (OSZ) obj;
        Object first = osz.getFirst();
        this.LJLILLLLZI.iv0((C109544Rq) osz.getSecond());
        this.LJLILLLLZI.LJLLILLLL.setValue(first);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
