package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.2MS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2MS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2MS LJLIL = new C2MS();

    public C2MS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("xjl_feed_refresh_populate_opt", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
