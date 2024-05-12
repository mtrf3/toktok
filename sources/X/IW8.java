package X;

import android.os.Build;
import com.ss.android.ugc.aweme.ml.ab.FeedLoadMorePlan;
import com.ss.android.ugc.aweme.ml.ab.SmartFeedLoadMoreStrategyConfig;
import defpackage.i0;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class IW8 {
    public static SmartFeedLoadMoreStrategyConfig LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static HashMap<Boolean, String> LIZLLL;

    public static SmartFeedLoadMoreStrategyConfig LIZ() {
        if (!LIZIZ) {
            SmartFeedLoadMoreStrategyConfig smartFeedLoadMoreStrategyConfig = null;
            SmartFeedLoadMoreStrategyConfig smartFeedLoadMoreStrategyConfig2 = (SmartFeedLoadMoreStrategyConfig) i0.LJ(true, "feed_load_more_strategy", 31744, SmartFeedLoadMoreStrategyConfig.class, null);
            LIZ = smartFeedLoadMoreStrategyConfig2;
            if (smartFeedLoadMoreStrategyConfig2 == null) {
                if (Build.VERSION.SDK_INT >= 23 && FO1.LIZ() && C86797Y4r.LIZIZ.contains(C86797Y4r.LIZ)) {
                    smartFeedLoadMoreStrategyConfig = new SmartFeedLoadMoreStrategyConfig();
                    smartFeedLoadMoreStrategyConfig.setDefaultIndex(1);
                    smartFeedLoadMoreStrategyConfig.setLabelIndexMapping(C47261Igj.LJII("lt_40s", "gt_40s"));
                    FeedLoadMorePlan feedLoadMorePlan = new FeedLoadMorePlan();
                    feedLoadMorePlan.setDelay(16);
                    feedLoadMorePlan.setPreload(true);
                    smartFeedLoadMoreStrategyConfig.setPlans(C47261Igj.LJII(feedLoadMorePlan, new FeedLoadMorePlan()));
                }
                LIZ = smartFeedLoadMoreStrategyConfig;
            }
            LIZIZ = true;
        }
        return LIZ;
    }
}
