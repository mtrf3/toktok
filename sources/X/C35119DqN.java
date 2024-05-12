package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DqN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35119DqN extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C35119DqN LJLIL = new C35119DqN();

    public C35119DqN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("player_config_simplify_opt", 0));
    }
}
