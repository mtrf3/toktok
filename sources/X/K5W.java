package X;

import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentNew;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class K5W implements InterfaceC74055T4p {
    public final /* synthetic */ SearchResultFragmentNew LIZ;

    @Override // X.InterfaceC74055T4p
    public final void LIZ(KEI tab) {
        o.LJIIIZ(tab, "tab");
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZIZ(KEI kei) {
    }

    public K5W(SearchResultFragmentNew searchResultFragmentNew) {
        this.LIZ = searchResultFragmentNew;
    }

    @Override // X.InterfaceC74055T4p
    public final void LIZJ(KEI tab) {
        o.LJIIIZ(tab, "tab");
        SearchResultFragmentNew searchResultFragmentNew = this.LIZ;
        if (searchResultFragmentNew.dm(searchResultFragmentNew.LJLJJL.getHint().toString())) {
            this.LIZ.getClass();
            SearchResultFragmentNew searchResultFragmentNew2 = this.LIZ;
            searchResultFragmentNew2.LJLJJL.setHint(searchResultFragmentNew2.Kl());
        }
        this.LIZ.Cn(tab.LIZLLL);
        this.LIZ.kn(tab.LIZLLL);
    }
}
