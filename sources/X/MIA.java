package X;

import com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.vm.QnaSuggestedTabViewModel$fetchInvitesQuestions$1", f = "QnaSuggestedTabViewModel.kt", l = {129}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class MIA extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ QnaSuggestedTabViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIA(QnaSuggestedTabViewModel qnaSuggestedTabViewModel, InterfaceC67352kd<? super MIA> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = qnaSuggestedTabViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new MIA(this.LJLILLLLZI, interfaceC67352kd);
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
            T7O t7o = this.LJLILLLLZI.LJLJL;
            this.LJLIL = 1;
            if (t7o.LIZLLL(this) == enumC58928NAu) {
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