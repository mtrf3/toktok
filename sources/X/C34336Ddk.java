package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Ddk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34336Ddk extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34336Ddk LJLIL = new C34336Ddk();

    public C34336Ddk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("feed_cache_filter_opt", 0) > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
