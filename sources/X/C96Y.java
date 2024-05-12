package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.96Y, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C96Y extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C96Y LJLIL = new C96Y();

    public C96Y() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("decorview_async_optim", -1) != -1) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
