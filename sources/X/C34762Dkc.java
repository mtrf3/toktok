package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.experiment.ViewStubOptExperimentV2;

/* renamed from: X.Dkc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34762Dkc extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34762Dkc LJLIL = new C34762Dkc();

    public C34762Dkc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        ViewStubOptExperimentV2.Companion.getClass();
        if (!ViewStubOptExperimentV2.hasInit) {
            ViewStubOptExperimentV2.hasInit = true;
            ViewStubOptExperimentV2.expVal = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean(ViewStubOptExperimentV2.KEY, false);
        }
        return Boolean.valueOf(ViewStubOptExperimentV2.expVal);
    }
}
