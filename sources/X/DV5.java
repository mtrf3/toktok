package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class DV5 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final DV5 LJLIL = new DV5();

    public DV5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C35810E3q.LJIIIIZZ()) {
            z = true;
        } else {
            z = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("optimize_preloawarmdvideocover", false);
        }
        return Boolean.valueOf(z);
    }
}
