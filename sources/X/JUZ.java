package X;

import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.List;

/* loaded from: classes9.dex */
public final class JUZ implements InterfaceC49245JUj {
    @Override // X.InterfaceC49245JUj
    public final List LIZ(int i, SearchResultActivity searchResultActivity, SearchMixFeed searchMixFeed) {
        int size;
        if ((searchResultActivity != null && JWA.LIZLLL(Integer.valueOf(searchMixFeed.getFeedType()), searchMixFeed.LJI())) || (0 != 0 && searchMixFeed != null)) {
            boolean LIZJ = JTB.LIZJ(searchResultActivity);
            List LIZ = JTB.LIZ(searchResultActivity);
            if (searchMixFeed.LJLJI || (i == 0 && LIZJ)) {
                size = LIZ.size();
            } else {
                size = 3;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("isDualStream:");
            LIZ2.append(LIZJ);
            LIZ2.append(", poi take ");
            LIZ2.append(size);
            LIZ2.append(" videos");
            X1D.LIZIZ(LIZ2);
            return ORZ.LLILLL(LIZ, size);
        }
        return null;
    }
}
