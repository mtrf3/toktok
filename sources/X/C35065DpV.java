package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DpV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35065DpV extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C35065DpV LJLIL = new C35065DpV();

    public C35065DpV() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("player_jato_view_scroll_config", 0L));
    }
}
