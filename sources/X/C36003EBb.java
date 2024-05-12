package X;

import com.google.gson.Gson;
import com.google.gson.m;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.SearchShopList;
import com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultShopViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.result.common.core.viewmodel.EcSearchResultShopViewModel$fetchData$1$resultList$1", f = "EcSearchResultShopViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.EBb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36003EBb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super SearchShopList>, Object> {
    public final /* synthetic */ EcSearchResultShopViewModel LJLIL;
    public final /* synthetic */ m LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36003EBb(EcSearchResultShopViewModel ecSearchResultShopViewModel, m mVar, InterfaceC67352kd<? super C36003EBb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = ecSearchResultShopViewModel;
        this.LJLILLLLZI = mVar;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36003EBb(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            Gson gson = this.LJLIL.LJLJL;
            return gson.LJI(gson.LJIILJJIL(this.LJLILLLLZI), SearchShopList.class);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super SearchShopList> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
