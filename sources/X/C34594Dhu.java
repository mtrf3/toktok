package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dhu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34594Dhu extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34594Dhu LJLIL = new C34594Dhu();

    public C34594Dhu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("assem_performance_opt", 0));
    }
}
