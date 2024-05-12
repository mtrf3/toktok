package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JMT extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchMixFeed, String, Boolean> {
    public static final JMT LJLIL = new JMT();

    public JMT() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(SearchMixFeed searchMixFeed, String aid) {
        boolean z;
        SearchMixFeed searchMixFeed2 = searchMixFeed;
        o.LJIIIZ(searchMixFeed2, "searchMixFeed");
        o.LJIIIZ(aid, "aid");
        if (searchMixFeed2.getFeedType() == 35) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
