package X;

import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dcl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34275Dcl extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34275Dcl LJLIL = new C34275Dcl();

    public C34275Dcl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(KevaImpl.getRepoSync(FollowFeedViewStubExperiment.REPO_NAME, 0).getInt("main_looper_private_repo_opt_enable", 0));
    }
}
