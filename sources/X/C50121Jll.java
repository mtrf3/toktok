package X;

import com.ss.android.ugc.aweme.search.pages.result.common.core.ui.fragment.SearchFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.o;

/* renamed from: X.Jll, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50121Jll extends AbstractC65781Prl implements InterfaceC88472Yns<SearchFragment<SearchMixFeed>, C76800UCe> {
    public static final C50121Jll LJLIL = new C50121Jll();

    public C50121Jll() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SearchFragment<SearchMixFeed> searchFragment) {
        SearchFragment<SearchMixFeed> runDelegates = searchFragment;
        o.LJIIIZ(runDelegates, "$this$runDelegates");
        runDelegates.showLoadMoreLoading();
        return C76800UCe.LIZ;
    }
}
