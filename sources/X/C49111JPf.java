package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import kotlin.jvm.internal.o;

/* renamed from: X.JPf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49111JPf {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C49112JPg.LJLIL);

    public static boolean LIZ() {
        if (((Number) LIZ.getValue()).intValue() != 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme) {
        String str;
        if (LIZ()) {
            if (aweme != null) {
                str = aweme.getSearchFeedType();
            } else {
                str = null;
            }
            if (o.LJ(str, "search_trending_native")) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(SearchMixFeed searchMixFeed) {
        SearchSpot searchSpot;
        if (!LIZ() || searchMixFeed == null || (searchSpot = searchMixFeed.hotSpot) == null || !searchSpot.isHotspotDegradation) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(SearchSpot searchSpot) {
        if (!LIZ() || searchSpot == null || !searchSpot.isHotspotDegradation) {
            return false;
        }
        return true;
    }
}
