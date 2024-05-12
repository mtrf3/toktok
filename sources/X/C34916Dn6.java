package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dn6, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34916Dn6 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34916Dn6 LJLIL = new C34916Dn6();

    public C34916Dn6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("thread_pool_block_opt", 0));
    }
}
