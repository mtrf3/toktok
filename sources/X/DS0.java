package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class DS0 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DS0 LJLIL = new DS0();

    public DS0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("fluency_insert_downgrade_opt", 3));
    }
}