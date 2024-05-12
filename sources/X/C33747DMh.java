package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* renamed from: X.DMh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33747DMh extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33747DMh LJLIL = new C33747DMh();

    public C33747DMh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = -1;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("launchertask_opt", 0);
        }
        return Integer.valueOf(i);
    }
}
