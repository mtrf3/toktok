package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DnG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34926DnG extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C34926DnG LJLIL = new C34926DnG();

    public C34926DnG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("player_jato_pager_scroll_config", 0L));
    }
}
