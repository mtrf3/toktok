package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dhj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34583Dhj extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C34583Dhj LJLIL = new C34583Dhj();

    public C34583Dhj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        if (((Number) C34585Dhl.LIZ.getValue()).intValue() == 1) {
            return new FIN(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME));
        }
        return Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
    }
}
