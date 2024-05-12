package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Doo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35022Doo extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C35022Doo LJLIL = new C35022Doo();

    public C35022Doo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getLong("splash_realtime_np_delay_time", 0L));
    }
}
