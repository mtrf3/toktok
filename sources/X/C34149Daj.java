package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Daj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34149Daj extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34149Daj LJLIL = new C34149Daj();

    public C34149Daj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("load_more_opt_high_network_speed", 2500));
    }
}
