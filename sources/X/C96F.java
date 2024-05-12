package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.96F, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C96F {
    public static final int LIZ;

    static {
        int i = 100;
        int i2 = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("zl_queuedwork_sleep", 100);
        if (!C35810E3q.LJIIIIZZ() || i2 != 100) {
            i = i2;
        }
        LIZ = i;
    }
}
