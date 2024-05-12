package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dde, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34330Dde extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34330Dde LJLIL = new C34330Dde();

    public C34330Dde() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("xjl_feed_alog_sampling_exp", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
