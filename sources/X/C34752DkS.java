package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.experiment.ViewStubOptExperiment;

/* renamed from: X.DkS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34752DkS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34752DkS LJLIL = new C34752DkS();

    public C34752DkS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        ViewStubOptExperiment.Companion.getClass();
        if (!ViewStubOptExperiment.hasInit) {
            ViewStubOptExperiment.hasInit = true;
            ViewStubOptExperiment.expVal = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean(ViewStubOptExperiment.KEY, true);
        }
        return Boolean.valueOf(ViewStubOptExperiment.expVal);
    }
}
