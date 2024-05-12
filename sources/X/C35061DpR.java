package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DpR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35061DpR extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C35061DpR LJLIL = new C35061DpR();

    public C35061DpR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("player_jato_start_activity_config", 0L));
    }
}
