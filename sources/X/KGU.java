package X;

import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KGU implements InterfaceC191547fS {
    public final /* synthetic */ KGR LJLIL;
    public final /* synthetic */ SearchKeywordPresenter LJLILLLLZI;

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        KGV kgv = this.LJLIL.LJLILLLLZI;
        if (kgv != null) {
            kgv.LJIILL(4, this.LJLILLLLZI.getKeyword().LJLIL, 1);
        } else {
            o.LJIJI("searchUserPresenter");
            throw null;
        }
    }

    public KGU(KGR kgr, SearchKeywordPresenter searchKeywordPresenter) {
        this.LJLIL = kgr;
        this.LJLILLLLZI = searchKeywordPresenter;
    }
}
