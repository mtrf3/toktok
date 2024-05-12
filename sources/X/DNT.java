package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class DNT extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final DNT LJLIL = new DNT();

    public DNT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("lego_boot_finish_sparse", 300L));
    }
}
