package X;

import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dcj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34273Dcj extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34273Dcj LJLIL = new C34273Dcj();

    public C34273Dcj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(KevaImpl.getRepoSync(FollowFeedViewStubExperiment.REPO_NAME, 1).getInt("cold_boot_optim_v2", 0));
    }
}
