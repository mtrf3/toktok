package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DpN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35057DpN extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C35057DpN LJLIL = new C35057DpN();

    public C35057DpN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("player_jato_receiver_config", 0L));
    }
}
