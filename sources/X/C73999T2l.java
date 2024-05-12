package X;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchState;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* renamed from: X.T2l, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73999T2l extends AbstractC65781Prl implements InterfaceC88472Yns<SearchState, SearchState> {
    public static final C73999T2l LJLIL = new C73999T2l();

    public C73999T2l() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final SearchState invoke(SearchState searchState) {
        SearchState setState = searchState;
        o.LJIIIZ(setState, "$this$setState");
        return SearchState.copy$default(setState, ListState.copy$default(setState.getListState(), null, null, new C163586bS(new CancellationException()), null, null, 27, null), null, 2, null);
    }
}
