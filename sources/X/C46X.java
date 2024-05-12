package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.SuggestedReplyViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.SuggestedReplyViewModel$loadSuggestedReplyForActionbar$1", f = "SuggestedReplyViewModel.kt", l = {135}, m = "invokeSuspend")
/* renamed from: X.46X, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C46X extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ SuggestedReplyViewModel LJLILLLLZI;
    public final /* synthetic */ C109544Rq LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46X(SuggestedReplyViewModel suggestedReplyViewModel, C109544Rq c109544Rq, InterfaceC67352kd<? super C46X> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = suggestedReplyViewModel;
        this.LJLJI = c109544Rq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C46X(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            XKQ xkq = this.LJLILLLLZI.LJLJL;
            if (xkq != null) {
                this.LJLIL = 1;
                if (xkq.LJJJJ(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        SuggestedReplyViewModel suggestedReplyViewModel = this.LJLILLLLZI;
        suggestedReplyViewModel.LJLJL = null;
        suggestedReplyViewModel.rv0(this.LJLJI);
        this.LJLILLLLZI.LJLJJLL = null;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
