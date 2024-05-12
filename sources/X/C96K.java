package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.96K, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C96K {
    public static final int LIZ;

    static {
        int i = 0;
        int i2 = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("zl_perflock_interval", 0);
        if (!C35810E3q.LJIIIIZZ() || i2 != 0) {
            i = i2;
        }
        LIZ = i;
    }
}
