package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dfj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34459Dfj extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34459Dfj LJLIL = new C34459Dfj();

    public C34459Dfj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("xjl_feed_sync_frame_state_opt_exp", 0));
    }
}
