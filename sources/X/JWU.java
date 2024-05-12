package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JWU implements JWX<SearchMixFeed> {
    public static final JWU LIZ = new JWU();

    @Override // X.JWX
    public final JWV LIZ(SearchMixFeed item, Aweme aweme) {
        Aweme aweme2;
        o.LJIIIZ(item, "item");
        JWW jww = JWW.LIZ;
        SingleLive singleLive = item.singleLive;
        if (singleLive != null) {
            aweme2 = singleLive.aweme;
        } else {
            aweme2 = null;
        }
        if (!o.LJ(aweme2, aweme)) {
            return null;
        }
        return jww;
    }
}
