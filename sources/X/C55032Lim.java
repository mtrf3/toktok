package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.toptab.data.LiveAwemeData;
import com.ss.android.ugc.aweme.toptab.data.LiveAwemeList;
import com.ss.android.ugc.aweme.toptab.repo.LiveFeedApi;
import java.util.List;

/* renamed from: X.Lim, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55032Lim implements InterfaceC207188Be {
    @Override // X.InterfaceC207188Be
    public final FeedItemList fetchLiveFeedList(String str) {
        LiveAwemeList liveAwemeList;
        int i;
        LiveAwemeData liveAwemeData = LiveFeedApi.LIZIZ.fetchLiveFeedList(str).get();
        List<Aweme> list = null;
        if (liveAwemeData != null) {
            liveAwemeList = liveAwemeData.data;
        } else {
            liveAwemeList = null;
        }
        FeedItemList feedItemList = new FeedItemList();
        if (liveAwemeList != null) {
            list = liveAwemeList.items;
        }
        feedItemList.items = list;
        if (liveAwemeList != null) {
            i = liveAwemeList.hasMore;
        } else {
            i = 0;
        }
        feedItemList.hasMore = i;
        return feedItemList;
    }
}
