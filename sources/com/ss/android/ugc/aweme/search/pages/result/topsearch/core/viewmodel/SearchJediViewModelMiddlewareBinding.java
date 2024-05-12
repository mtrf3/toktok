package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel;

import X.C74000T2m;
import X.C74002T2o;
import X.InterfaceC72022SOk;
import X.TBT;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchState;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SearchJediViewModelMiddlewareBinding implements InterfaceC72022SOk<SearchState, SearchJediViewModel> {
    public static final int $stable = 0;

    private final void bind0(SearchJediViewModel searchJediViewModel) {
        ListMiddleware<SearchState, SearchMixFeed, C74002T2o> listMiddleware = searchJediViewModel.LJLJLJ;
        listMiddleware.LJ(new TBT() { // from class: X.T2n
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((SearchState) obj).getListState();
            }
        }, C74000T2m.LJLIL);
        searchJediViewModel.iv0(listMiddleware);
    }

    @Override // X.InterfaceC72022SOk
    public void binding(SearchJediViewModel target) {
        o.LJIIIZ(target, "target");
        bind0(target);
    }
}
