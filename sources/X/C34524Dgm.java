package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dgm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34524Dgm extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C34524Dgm LJLIL = new C34524Dgm();

    public C34524Dgm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("cold_boot_request_sparse_time", 0L));
    }
}
