package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DXy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34050DXy extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34050DXy LJLIL = new C34050DXy();

    public C34050DXy() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int LIZ;
        if (C34565DhR.LIZ()) {
            LIZ = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("feed_small_screen_for_size_experiment", 0);
        } else {
            LIZ = C00F.LIZ(31744, 0, "feed_small_screen_for_size_experiment", true);
        }
        return Integer.valueOf(LIZ);
    }
}
