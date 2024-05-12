package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dqc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35134Dqc extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C35134Dqc LJLIL = new C35134Dqc();

    public C35134Dqc() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("optimize_asyncinflateprofiledelaytime", -1L));
    }
}
