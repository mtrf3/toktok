package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class DX6 {
    public static final boolean LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("enable_fix_fragment_assemble_memory_leak", true);
}
