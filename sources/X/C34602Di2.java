package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Di2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34602Di2 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34602Di2 LJLIL = new C34602Di2();

    public C34602Di2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("downgrade_bg_experiment", 0));
    }
}
