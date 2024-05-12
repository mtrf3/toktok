package X;

import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DbD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34179DbD {
    public static final boolean LIZ() {
        return KevaImpl.getRepo(FollowFeedViewStubExperiment.REPO_NAME, 1).getBoolean("enable_topview_json_opt", false);
    }
}
