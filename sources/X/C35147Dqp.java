package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dqp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35147Dqp extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35147Dqp LJLIL = new C35147Dqp();

    public C35147Dqp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("fluency_downgrade_opt_v2", 0));
    }
}
