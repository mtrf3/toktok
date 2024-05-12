package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SingleLive;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JWT extends AbstractC49300JWm<SearchMixFeed> {
    public final C49854JhS LIZIZ = new C49854JhS(true, true, false, false, true, true, true, 3092);
    public final JWU LIZJ = JWU.LIZ;

    @Override // X.AbstractC49300JWm
    public final EnumC49272JVk LIZIZ() {
        return EnumC49272JVk.ONE_COLUMN;
    }

    @Override // X.AbstractC49300JWm
    public final JWX<SearchMixFeed> LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC49300JWm
    public final C49854JhS LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC49300JWm
    public final List LIZ(SearchMixFeed searchMixFeed, C49847JhL streamRoot) {
        Aweme aweme;
        SearchMixFeed item = searchMixFeed;
        o.LJIIIZ(item, "item");
        o.LJIIIZ(streamRoot, "streamRoot");
        SingleLive singleLive = item.singleLive;
        if (singleLive != null && (aweme = singleLive.aweme) != null) {
            return C47261Igj.LJJIJ(aweme);
        }
        return null;
    }
}
