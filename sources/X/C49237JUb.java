package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JUb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49237JUb implements InterfaceC49245JUj {
    public final List<Integer> LIZ = C47261Igj.LJJIJIIJI(8, 20);

    @Override // X.InterfaceC49245JUj
    public final List LIZ(int i, SearchResultActivity searchResultActivity, SearchMixFeed searchMixFeed) {
        boolean z;
        DynamicPatch LJI;
        List<Aweme> awemeList;
        Aweme aweme;
        if (searchMixFeed.getFeedType() == 65514) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (LJI = searchMixFeed.LJI()) == null || !this.LIZ.contains(Integer.valueOf(LJI.getOriginType())) || (awemeList = LJI.getAwemeList()) == null) {
            return null;
        }
        Iterator<Aweme> it = awemeList.iterator();
        while (true) {
            if (it.hasNext()) {
                aweme = it.next();
                if (aweme.getAwemeType() == 101) {
                    break;
                }
            } else {
                aweme = null;
                break;
            }
        }
        Aweme aweme2 = aweme;
        if (aweme2 == null) {
            return null;
        }
        if (LJI.getOriginType() == 20) {
            aweme2.appendExtraParamUseInSearch("search_result_id", aweme2.getAuthorUid());
        }
        return C47261Igj.LJJIJ(aweme2);
    }
}
