package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class DV2 {
    public static final boolean LIZ;

    static {
        boolean z = true;
        int i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("zl_feed_opt_print", 1);
        if ((!C35810E3q.LJIIIIZZ() || i != 1) && (i & 2) == 0) {
            z = false;
        }
        LIZ = z;
    }
}
