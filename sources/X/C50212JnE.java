package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model.SearchLabel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM$mobTabClick$1$1", f = "SearchHubHeaderVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.JnE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50212JnE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ SearchHubHeaderVM LJLIL;
    public final /* synthetic */ C50201Jn3 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ SearchLabel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50212JnE(SearchHubHeaderVM searchHubHeaderVM, C50201Jn3 c50201Jn3, int i, SearchLabel searchLabel, InterfaceC67352kd<? super C50212JnE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = searchHubHeaderVM;
        this.LJLILLLLZI = c50201Jn3;
        this.LJLJI = i;
        this.LJLJJI = searchLabel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C50212JnE(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C50220JnM c50220JnM = new C50220JnM();
        SearchHubHeaderVM searchHubHeaderVM = this.LJLIL;
        C50201Jn3 c50201Jn3 = this.LJLILLLLZI;
        int i = this.LJLJI;
        SearchLabel searchLabel = this.LJLJJI;
        searchHubHeaderVM.getClass();
        SearchHubHeaderVM.gv0(c50220JnM, c50201Jn3, i, searchLabel);
        c50220JnM.LJIILIIL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
