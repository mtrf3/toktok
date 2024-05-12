package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DqI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35114DqI extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35114DqI LJLIL = new C35114DqI();

    public C35114DqI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("is_downgrade_splite_opt_v2", 0));
    }
}
