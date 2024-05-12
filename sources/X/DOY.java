package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class DOY extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DOY LJLIL = new DOY();

    public DOY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("request_downgrade_opt", 0));
    }
}
