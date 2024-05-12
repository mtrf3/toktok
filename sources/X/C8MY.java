package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;

/* renamed from: X.8MY, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8MY {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme, BaseFeedPageParams baseFeedPageParams) {
        if (aweme.isAd() || J8V.LIZLLL()) {
            return false;
        }
        if (baseFeedPageParams != null && baseFeedPageParams.pageType == 30) {
            return false;
        }
        if (!aweme.hasTrendingBar() && !aweme.hasTrendingBarFYP()) {
            return false;
        }
        return true;
    }
}
