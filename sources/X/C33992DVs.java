package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DVs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33992DVs extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33992DVs LJLIL = new C33992DVs();

    public C33992DVs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("xjl_feed_sync_frame_opt_type_exp", 0));
    }
}
