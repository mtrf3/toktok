package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.96G, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C96G {
    public static final boolean LIZ;
    public static final boolean LIZIZ;

    static {
        boolean z;
        int i = 2;
        int i2 = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("zl_queuedwork_opt", 2);
        if (!C35810E3q.LJIIIIZZ() || i2 != 2) {
            i = i2;
        }
        boolean z2 = false;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ = z;
        if ((i & 4) != 0) {
            z2 = true;
        }
        LIZIZ = z2;
    }
}
