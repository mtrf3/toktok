package X;

import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Ds7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35227Ds7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35227Ds7 LJLIL = new C35227Ds7();

    public C35227Ds7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return C278517l.LIZ(FollowFeedViewStubExperiment.REPO_NAME, "ab_common_request_retry_experiment", false);
    }
}
