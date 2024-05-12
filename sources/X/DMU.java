package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class DMU extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DMU LJLIL = new DMU();

    public DMU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("lego_bootfinsh_threadpool_type", 0));
    }
}
