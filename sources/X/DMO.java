package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class DMO extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DMO LJLIL = new DMO();

    public DMO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("fresco_total_opt", 0));
    }
}
