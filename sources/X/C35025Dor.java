package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dor, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35025Dor extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C35025Dor LJLIL = new C35025Dor();

    public C35025Dor() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("splash_realtime_timeout", 1000L));
    }
}
