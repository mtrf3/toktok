package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DqA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35106DqA extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35106DqA LJLIL = new C35106DqA();

    public C35106DqA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("xjl_feed_enter_homepage_binder_call_opt_v3", 0));
    }
}
