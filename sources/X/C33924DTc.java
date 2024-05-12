package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DTc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33924DTc {
    public static final boolean LIZ;

    static {
        boolean z = true;
        int i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("zl_network_ipc_fix", 1);
        if ((!C35810E3q.LJIIIIZZ() || i != 1) && (i & 2) == 0) {
            z = false;
        }
        LIZ = z;
    }
}
