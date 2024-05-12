package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.9B3, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9B3 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C9B3 LJLIL = new C9B3();

    public C9B3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("optimize_feedbackground", false) && C56662Kg.LIZ().LJI != 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
