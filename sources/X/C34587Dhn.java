package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dhn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34587Dhn extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34587Dhn LJLIL = new C34587Dhn();

    public C34587Dhn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("feed_assem_performance_opt", 0));
    }
}
