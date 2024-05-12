package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.26D, reason: invalid class name */
/* loaded from: classes.dex */
public final class C26D extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C26D LJLIL = new C26D();

    public C26D() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("gecko_clean_phase_three_expire_day_experiment", 7));
    }
}
