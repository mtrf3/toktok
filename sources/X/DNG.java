package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* loaded from: classes7.dex */
public final class DNG extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DNG LJLIL = new DNG();

    public DNG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = -1;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("lego_request_opt", 0);
        }
        return Integer.valueOf(i);
    }
}
