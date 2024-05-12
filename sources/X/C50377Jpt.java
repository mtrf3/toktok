package X;

import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM$getMoreTabHorizontalData$2$1", f = "SearchSeparateTabHorizontalVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Jpt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50377Jpt extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SearchSeparateTabHorizontalVM LJLIL;
    public final /* synthetic */ InterfaceC51679KPz LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50377Jpt(SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM, InterfaceC51679KPz interfaceC51679KPz, InterfaceC67352kd<? super C50377Jpt> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = searchSeparateTabHorizontalVM;
        this.LJLILLLLZI = interfaceC51679KPz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C50377Jpt(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM = this.LJLIL;
        searchSeparateTabHorizontalVM.LL = false;
        KQA kqa = searchSeparateTabHorizontalVM.operatorView;
        if (kqa != null) {
            this.LJLILLLLZI.bindView(kqa);
            return C76800UCe.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
