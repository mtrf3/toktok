package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SpO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73278SpO extends AbstractC65781Prl implements InterfaceC88471Ynr<List<? extends SearchMixFeed>, List<? extends SearchMixFeed>, List<? extends SearchMixFeed>> {
    public static final C73278SpO LJLIL = new C73278SpO();

    public C73278SpO() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final List<? extends SearchMixFeed> invoke(List<? extends SearchMixFeed> list, List<? extends SearchMixFeed> list2) {
        List<? extends SearchMixFeed> list3 = list;
        List<? extends SearchMixFeed> loadMore = list2;
        o.LJIIIZ(list3, "list");
        o.LJIIIZ(loadMore, "loadMore");
        return ORZ.LJLJJL(ORZ.LLIIIZ(loadMore, list3));
    }
}
