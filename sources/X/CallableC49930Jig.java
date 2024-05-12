package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: X.Jig, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class CallableC49930Jig<V> implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ SearchMixFeedList LJLJI;

    public CallableC49930Jig(String str, int i, SearchMixFeedList searchMixFeedList) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = searchMixFeedList;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SearchMixFeedList searchMixFeedList = (SearchMixFeedList) GsonProtectorUtils.fromJson(C50089JlF.LIZIZ, this.LJLIL, SearchMixFeedList.class);
        if (searchMixFeedList != null) {
            List<SearchMixFeed> list = searchMixFeedList.mItems;
            if (list.size() > this.LJLILLLLZI) {
                searchMixFeedList.setRequestId(this.LJLJI.getRequestId());
                searchMixFeedList.mItems = list.subList(this.LJLILLLLZI, list.size());
                return searchMixFeedList;
            }
        }
        return null;
    }
}
