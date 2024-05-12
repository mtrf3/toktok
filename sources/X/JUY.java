package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JUY extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchMixFeed, String, Boolean> {
    public static final JUY LJLIL = new JUY();

    public JUY() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final Boolean invoke(SearchMixFeed searchMixFeed, String aid) {
        List<Aweme> awemeList;
        SearchMixFeed searchMixFeed2 = searchMixFeed;
        o.LJIIIZ(searchMixFeed2, "searchMixFeed");
        o.LJIIIZ(aid, "aid");
        boolean z = false;
        if (searchMixFeed2.getFeedType() == 65514 && searchMixFeed2.LJI() != null && ((searchMixFeed2.LJI().getOriginType() == 8 || searchMixFeed2.LJI().getOriginType() == 20) && (awemeList = searchMixFeed2.LJI().getAwemeList()) != null && !awemeList.isEmpty())) {
            Iterator<Aweme> it = awemeList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(it.next().getAid(), aid)) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
