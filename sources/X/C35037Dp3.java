package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dp3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35037Dp3 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35037Dp3 LJLIL = new C35037Dp3();

    public C35037Dp3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("apm_thread_opt_type", 0));
    }
}
