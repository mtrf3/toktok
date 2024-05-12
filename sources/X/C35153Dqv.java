package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dqv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35153Dqv extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35153Dqv LJLIL = new C35153Dqv();

    public C35153Dqv() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("ws_modularization", 0));
    }
}
