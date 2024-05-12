package X;

import Y.IDfS126S0100000_1;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopFeedFragment$setupObservers$1", f = "TopFeedFragment.kt", l = {1298}, m = "invokeSuspend")
/* renamed from: X.3CY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3CY extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ActivityC45651qj LJLILLLLZI;
    public final /* synthetic */ TopFeedFragment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3CY(ActivityC45651qj activityC45651qj, TopFeedFragment topFeedFragment, InterfaceC67352kd<? super C3CY> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = topFeedFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3CY(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C79883Bo c79883Bo = ((SearchGlobalViewModel) ViewModelProviders.of(this.LJLILLLLZI).get(SearchGlobalViewModel.class)).LJLLL;
            IDfS126S0100000_1 iDfS126S0100000_1 = new IDfS126S0100000_1(this.LJLJI, 28);
            this.LJLIL = 1;
            if (c79883Bo.collect(iDfS126S0100000_1, this) == enumC58928NAu) {
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
