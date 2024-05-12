package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* renamed from: X.DNl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33777DNl extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33777DNl LJLIL = new C33777DNl();

    public C33777DNl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = 1985;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("backgroundtask_schedule_opt", 0);
        }
        return Integer.valueOf(i);
    }
}
