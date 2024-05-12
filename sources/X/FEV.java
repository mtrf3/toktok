package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class FEV {
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final int LIZJ;

    static {
        boolean z;
        int i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("zl_async_inflate", 1074);
        boolean z2 = false;
        if ((i & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ = z;
        if ((i & 2048) != 0) {
            z2 = true;
        }
        LIZIZ = z2;
        LIZJ = i & 15;
    }
}
