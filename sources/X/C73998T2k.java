package X;

import com.bytedance.jedi.arch.ext.list.ListState;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchState;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* renamed from: X.T2k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73998T2k extends AbstractC65781Prl implements InterfaceC88472Yns<SearchState, SearchState> {
    public static final C73998T2k LJLIL = new C73998T2k();

    public C73998T2k() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final SearchState invoke(SearchState searchState) {
        SearchState setState = searchState;
        o.LJIIIZ(setState, "$this$setState");
        return SearchState.copy$default(setState, ListState.copy$default(setState.getListState(), null, null, null, new C163586bS(new CancellationException()), null, 23, null), null, 2, null);
    }
}
