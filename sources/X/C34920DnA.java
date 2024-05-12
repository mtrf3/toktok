package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DnA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34920DnA extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C34920DnA LJLIL = new C34920DnA();

    public C34920DnA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("player_jato_boost_min_interval", 500L));
    }
}
