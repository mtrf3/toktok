package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DqE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35110DqE extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35110DqE LJLIL = new C35110DqE();

    public C35110DqE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("new_fps_monitor_exp", 0));
    }
}
