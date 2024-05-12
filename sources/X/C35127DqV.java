package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DqV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35127DqV {
    public static boolean LIZ;
    public static volatile boolean LIZIZ;

    public static boolean LIZ() {
        if (!LIZIZ) {
            LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("performance_player_opt_great_reversal", false);
            LIZIZ = true;
        }
        return LIZ;
    }
}
