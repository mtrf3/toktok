package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* renamed from: X.2X7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2X7 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C2X7 LJLIL = new C2X7();

    public C2X7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = 16;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("measure_downgrade", 0);
        }
        return Integer.valueOf(i);
    }
}
