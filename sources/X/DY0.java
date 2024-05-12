package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class DY0 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DY0 LJLIL = new DY0();

    public DY0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int LIZ;
        if (C34565DhR.LIZ()) {
            LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("feed_small_screen_for_size_no_bottom_experiment", 0);
        } else {
            LIZ = C00F.LIZ(31744, 0, "feed_small_screen_for_size_no_bottom_experiment", true);
        }
        return Integer.valueOf(LIZ);
    }
}
