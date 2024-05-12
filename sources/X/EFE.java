package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class EFE extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final EFE LJLIL = new EFE();

    public EFE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return KevaImpl.getRepoSync(FollowFeedViewStubExperiment.REPO_NAME, 1);
    }
}
