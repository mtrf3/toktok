package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dqk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35142Dqk extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35142Dqk LJLIL = new C35142Dqk();

    public C35142Dqk() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("app_launcher_cpu_stage", 0));
    }
}
