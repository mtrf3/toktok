package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model.AggregatedVideo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* renamed from: X.JWr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49305JWr implements InterfaceC49245JUj {
    @Override // X.InterfaceC49245JUj
    public final List LIZ(int i, SearchResultActivity searchResultActivity, SearchMixFeed searchMixFeed) {
        List<Aweme> list;
        AggregatedVideo aggregatedVideo;
        List<Aweme> list2;
        boolean z = false;
        if (searchMixFeed.LJII() && (aggregatedVideo = searchMixFeed.aggregatedVideo) != null && (list2 = aggregatedVideo.awemes) != null && list2.size() >= 3) {
            z = true;
        }
        if (!z) {
            return null;
        }
        if (searchMixFeed.LJLJI || searchMixFeed.LJLJJL) {
            AggregatedVideo aggregatedVideo2 = searchMixFeed.aggregatedVideo;
            if (aggregatedVideo2 == null) {
                return null;
            }
            return aggregatedVideo2.awemes;
        }
        AggregatedVideo aggregatedVideo3 = searchMixFeed.aggregatedVideo;
        if (aggregatedVideo3 == null || (list = aggregatedVideo3.awemes) == null) {
            return null;
        }
        return ORZ.LLILLL(list, 3);
    }
}
