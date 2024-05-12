package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.96S, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C96S extends AbstractC65781Prl implements InterfaceC65784Pro<Keva> {
    public static final C96S LJLIL = new C96S();

    public C96S() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Keva invoke() {
        return Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME);
    }
}
