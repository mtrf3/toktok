package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* renamed from: X.DMy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33764DMy extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33764DMy LJLIL = new C33764DMy();

    public C33764DMy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = -1;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("backgroundtask_opt_v4", 0);
        }
        return Integer.valueOf(i);
    }
}