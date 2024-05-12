package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* renamed from: X.DNr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33783DNr extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33783DNr LJLIL = new C33783DNr();

    public C33783DNr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = -1;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("instance_preload_v2_opt", 0);
        }
        return Integer.valueOf(i);
    }
}
