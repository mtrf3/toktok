package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dq5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35101Dq5 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35101Dq5 LJLIL = new C35101Dq5();

    public C35101Dq5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("xjl_feed_enter_homepage_binder_call_opt_v2", 0));
    }
}
