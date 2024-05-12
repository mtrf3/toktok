package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import java.util.List;

/* renamed from: X.JUd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49239JUd implements InterfaceC49245JUj {
    @Override // X.InterfaceC49245JUj
    public final List LIZ(int i, SearchResultActivity searchResultActivity, SearchMixFeed searchMixFeed) {
        Aweme aweme;
        SingleLive singleLive = searchMixFeed.singleLive;
        if (singleLive != null && (aweme = singleLive.aweme) != null) {
            return C47261Igj.LJJIJ(aweme);
        }
        return null;
    }
}
