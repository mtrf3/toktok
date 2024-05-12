package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* renamed from: X.DMf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33745DMf extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33745DMf LJLIL = new C33745DMf();

    public C33745DMf() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = 1;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("apm_downgrade_v2", 0);
        }
        return Integer.valueOf(i);
    }
}
