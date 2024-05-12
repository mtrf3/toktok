package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DpT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35063DpT extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C35063DpT LJLIL = new C35063DpT();

    public C35063DpT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("player_jato_start_service_config", 0L));
    }
}
