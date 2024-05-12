package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JXK implements JWX<SearchMixFeed> {
    public static final JXK LIZ = new JXK();

    @Override // X.JWX
    public final JWV LIZ(SearchMixFeed searchMixFeed, Aweme aweme) {
        List<Aweme> awemeList;
        o.LJIIIZ(searchMixFeed, "searchMixFeed");
        if (!o.LJ(aweme.getSearchFeedType(), "SearchBotFeed") || (awemeList = searchMixFeed.bot.getAwemeList()) == null) {
            return null;
        }
        Iterator<Aweme> it = awemeList.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(it.next().getAid(), aweme.getAid())) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return new C49288JWa(i, null);
    }
}
