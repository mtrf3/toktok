package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DpP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35059DpP extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C35059DpP LJLIL = new C35059DpP();

    public C35059DpP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("player_jato_view_adapter_config", 0L));
    }
}
