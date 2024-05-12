package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dqz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35157Dqz {
    public static final float LIZ;

    static {
        float f = 0.5f;
        float f2 = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getFloat("zl_feed_opt_doframe_level1", 0.5f);
        if (!C35810E3q.LJIIIIZZ() || f2 != 0.5f) {
            f = f2;
        }
        LIZ = f;
    }
}
