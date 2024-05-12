package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dqo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35146Dqo extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35146Dqo LJLIL = new C35146Dqo();

    public C35146Dqo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("echo_preload", 0));
    }
}
