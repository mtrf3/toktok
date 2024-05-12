package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* renamed from: X.DNa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33766DNa extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33766DNa LJLIL = new C33766DNa();

    public C33766DNa() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = -1;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("effect_platform_opt", 0);
        }
        return Integer.valueOf(i);
    }
}
