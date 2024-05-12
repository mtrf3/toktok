package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class DMX extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DMX LJLIL = new DMX();

    public DMX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("lego_threadpool_type", 11));
    }
}
