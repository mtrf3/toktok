package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.26B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26B extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C26B LJLIL = new C26B();

    public C26B() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("gecko_clean_phase_three_experiment", 0));
    }
}
