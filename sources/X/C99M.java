package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.99M, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C99M extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C99M LJLIL = new C99M();

    public C99M() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (C35810E3q.LJIIIIZZ()) {
            z = true;
        } else {
            z = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("first_feed_preloadnetvideocover_v2", false);
        }
        return Boolean.valueOf(z);
    }
}
