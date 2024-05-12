package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dc1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34229Dc1 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C34229Dc1 LJLIL = new C34229Dc1();

    public C34229Dc1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("aot_threshold_opt", -1L));
    }
}
