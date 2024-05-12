package X;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchState;
import kotlin.jvm.internal.o;

/* renamed from: X.T2m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74000T2m extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchState, ListState, SearchState> {
    public static final C74000T2m LJLIL = new C74000T2m();

    public C74000T2m() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final SearchState invoke(SearchState searchState, ListState listState) {
        SearchState inject = searchState;
        ListState it = listState;
        o.LJIIIZ(inject, "$this$inject");
        o.LJIIIZ(it, "it");
        return SearchState.copy$default(inject, it, null, 2, null);
    }
}
