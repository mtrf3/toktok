package X;

import Y.IDfS129S0100000_8;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.proxy.TopProxyFragment;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.proxy.TopProxyFragment$onViewCreated$4", f = "TopProxyFragment.kt", l = {847}, m = "invokeSuspend")
/* renamed from: X.Jlc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50112Jlc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ TopProxyFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50112Jlc(TopProxyFragment topProxyFragment, InterfaceC67352kd<? super C50112Jlc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = topProxyFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C50112Jlc(this.LJLILLLLZI, interfaceC67352kd);
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
            TopProxyFragment topProxyFragment = this.LJLILLLLZI;
            SearchGlobalViewModel searchGlobalViewModel = topProxyFragment.LLJJJJLIIL;
            if (searchGlobalViewModel != null) {
                C79883Bo c79883Bo = searchGlobalViewModel.LJLLILLLL;
                IDfS129S0100000_8 iDfS129S0100000_8 = new IDfS129S0100000_8(topProxyFragment, 1);
                this.LJLIL = 1;
                if (c79883Bo.collect(iDfS129S0100000_8, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("globalViewModel");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
