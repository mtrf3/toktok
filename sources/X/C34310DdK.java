package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DdK, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34310DdK extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34310DdK LJLIL = new C34310DdK();

    public C34310DdK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("feed_cache_get_order", 0));
    }
}
