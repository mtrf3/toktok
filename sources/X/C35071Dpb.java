package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dpb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35071Dpb extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35071Dpb LJLIL = new C35071Dpb();

    public C35071Dpb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("thread_convergence_init_async", 0));
    }
}
