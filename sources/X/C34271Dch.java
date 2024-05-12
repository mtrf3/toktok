package X;

import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dch, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34271Dch extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34271Dch LJLIL = new C34271Dch();

    public C34271Dch() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(KevaImpl.getRepoSync(FollowFeedViewStubExperiment.REPO_NAME, 1).getInt("cold_boot_optim_v1", 0));
    }
}
