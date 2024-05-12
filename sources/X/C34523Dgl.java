package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dgl, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34523Dgl extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C34523Dgl LJLIL = new C34523Dgl();

    public C34523Dgl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("bg_task_sparse_time", 0L));
    }
}
