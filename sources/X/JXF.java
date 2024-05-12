package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JXF implements JWX<SearchMixFeed> {
    public static final JXF LIZ = new JXF();

    @Override // X.JWX
    public final JWV LIZ(SearchMixFeed searchMixFeed, Aweme aweme) {
        o.LJIIIZ(searchMixFeed, "searchMixFeed");
        if (!C78939UyV.LJJIIZ(aweme) || aweme == null) {
            return null;
        }
        Integer valueOf = Integer.valueOf(C78939UyV.LIZJ(searchMixFeed, aweme));
        if (valueOf.intValue() < 0) {
            return null;
        }
        return new C49288JWa(valueOf.intValue(), null);
    }
}
