package X;

import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Ds5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35225Ds5 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35225Ds5 LJLIL = new C35225Ds5();

    public C35225Ds5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return C278517l.LIZ(FollowFeedViewStubExperiment.REPO_NAME, "request_combine_lazy_startup_experiment", false);
    }
}
