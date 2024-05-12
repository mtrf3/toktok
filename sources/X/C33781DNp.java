package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* renamed from: X.DNp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33781DNp extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33781DNp LJLIL = new C33781DNp();

    public C33781DNp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        int i2 = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("appflyer_opt", 0);
        if (StrategyImpl.LIZIZ().LJIILL() && (i2 == 7 || i2 == 0)) {
            i = 8;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("appflyer_opt", 0);
        }
        return Integer.valueOf(i);
    }
}
