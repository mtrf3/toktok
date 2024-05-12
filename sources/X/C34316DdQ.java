package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DdQ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34316DdQ extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34316DdQ LJLIL = new C34316DdQ();

    public C34316DdQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("IdleScheduleTest", 0));
    }
}
