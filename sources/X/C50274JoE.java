package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JoE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50274JoE<T, R> implements InterfaceC48038ItG {
    public static final C50274JoE<T, R> LJLIL = new C50274JoE<>();

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        boolean z;
        String str;
        SearchMixFeedList it = (SearchMixFeedList) obj;
        o.LJIIIZ(it, "it");
        if (it.LJLILLLLZI != null || it.hasMore) {
            z = true;
        } else {
            z = false;
        }
        List<SearchMixFeed> list = it.mItems;
        LogPbBean logPbBean = it.logPb;
        if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
            str = "";
        }
        return new OSZ(list, new C74002T2o(str, z, it.cursor, it));
    }
}
