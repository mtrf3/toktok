package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* loaded from: classes7.dex */
public final class DNA extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DNA LJLIL = new DNA();

    public DNA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = -1;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("feed_onsuccess_v1", 0);
        }
        return Integer.valueOf(i);
    }
}
