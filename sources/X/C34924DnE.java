package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DnE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34924DnE extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C34924DnE LJLIL = new C34924DnE();

    public C34924DnE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("player_jato_pager_adapter_config", 0L));
    }
}
