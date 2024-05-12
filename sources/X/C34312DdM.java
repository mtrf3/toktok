package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DdM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34312DdM extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34312DdM LJLIL = new C34312DdM();

    public C34312DdM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("feed_cache_preload_opt", 0));
    }
}
