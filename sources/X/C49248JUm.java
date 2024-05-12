package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* renamed from: X.JUm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49248JUm implements InterfaceC49245JUj {
    @Override // X.InterfaceC49245JUj
    public final List LIZ(int i, SearchResultActivity searchResultActivity, SearchMixFeed searchMixFeed) {
        Aweme aweme = searchMixFeed.getAweme();
        if (aweme == null || searchMixFeed.getFeedType() != 65280) {
            return null;
        }
        return C47261Igj.LJJIJ(aweme);
    }
}
