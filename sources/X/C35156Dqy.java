package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dqy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35156Dqy {
    public static final float LIZ;

    static {
        float f = 6.0f;
        float f2 = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getFloat("zl_scalpelconfig", 6.0f);
        if (!C35810E3q.LJIIIIZZ() || f2 != 6.0f) {
            f = f2;
        }
        LIZ = f;
    }
}
