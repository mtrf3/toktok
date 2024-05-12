package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dqr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35149Dqr extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35149Dqr LJLIL = new C35149Dqr();

    public C35149Dqr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("memory_downgrade_v2_opt", 0));
    }
}
