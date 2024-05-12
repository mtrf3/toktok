package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.FVv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39091FVv {
    public static int LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);

    public static final void LIZ() {
        if (LIZJ != 0) {
            LIZIZ = (System.currentTimeMillis() - LIZJ) + LIZIZ;
            LIZJ = 0L;
            LIZ++;
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeInt("loadmore_wait_count", LIZ);
            Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).storeLong("loadmore_wait_duration", LIZIZ);
            LIZLLL.set(false);
        }
    }
}
