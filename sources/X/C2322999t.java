package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.99t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2322999t extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C2322999t LJLIL = new C2322999t();

    public C2322999t() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("optimize_delayliverequest", -1L));
    }
}
