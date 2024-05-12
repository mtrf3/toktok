package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* loaded from: classes7.dex */
public final class DN3 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DN3 LJLIL = new DN3();

    public DN3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = -1;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("backgroundtask_opt_v2", 0);
        }
        return Integer.valueOf(i);
    }
}
