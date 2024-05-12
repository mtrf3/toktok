package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* renamed from: X.JUf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49241JUf implements InterfaceC49245JUj {
    @Override // X.InterfaceC49245JUj
    public final List LIZ(int i, SearchResultActivity searchResultActivity, SearchMixFeed searchMixFeed) {
        boolean z;
        DynamicPatch LJI;
        List<Aweme> awemeList;
        Object LJLLLL;
        if (searchMixFeed.getFeedType() == 65514) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (LJI = searchMixFeed.LJI()) == null || LJI.getOriginType() != 33 || (awemeList = LJI.getAwemeList()) == null || (LJLLLL = ORZ.LJLLLL(awemeList)) == null) {
            return null;
        }
        return C47261Igj.LJJIJ(LJLLLL);
    }
}
