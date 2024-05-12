package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.viewmodel.SearchSeparateTabHorizontalVM$getProxyData$currentAwemeList$1", f = "SearchSeparateTabHorizontalVM.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Jps, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50376Jps extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<Aweme>>, Object> {
    public final /* synthetic */ SearchSeparateTabHorizontalVM LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50376Jps(SearchSeparateTabHorizontalVM searchSeparateTabHorizontalVM, InterfaceC67352kd<? super C50376Jps> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = searchSeparateTabHorizontalVM;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C50376Jps(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C49825Jgz LIZJ;
        C141335gf.LIZJ(obj);
        InterfaceC50390Jq6 interfaceC50390Jq6 = this.LJLIL.LJLZ;
        if (interfaceC50390Jq6 != null && (LIZJ = interfaceC50390Jq6.LIZJ()) != null) {
            return LIZJ.getAwemeList();
        }
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<Aweme>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
