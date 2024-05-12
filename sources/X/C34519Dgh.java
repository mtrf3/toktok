package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dgh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34519Dgh extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C34519Dgh LJLIL = new C34519Dgh();

    public C34519Dgh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("bg_task_sum_time", 0L));
    }
}
