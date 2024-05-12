package X;

import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import defpackage.e1;

/* renamed from: X.Yb9, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87683Yb9 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87683Yb9 LJLIL = new C87683Yb9();

    public C87683Yb9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        FollowFeedViewStubExperiment.Companion.getClass();
        if (!FollowFeedViewStubExperiment.hasInit) {
            FollowFeedViewStubExperiment.hasInit = true;
            FollowFeedViewStubExperiment.expVal = e1.LIZ(31744, FollowFeedViewStubExperiment.KEY, true, false);
        }
        return Boolean.valueOf(FollowFeedViewStubExperiment.expVal);
    }
}
