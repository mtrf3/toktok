package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dqq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35148Dqq extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35148Dqq LJLIL = new C35148Dqq();

    public C35148Dqq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("memory_downgrade_opt", 0));
    }
}
