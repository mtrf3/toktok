package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DXw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34048DXw extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34048DXw LJLIL = new C34048DXw();

    public C34048DXw() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!C34565DhR.LIZ() ? C00F.LIZ(31744, 0, "feed_binder_sim_country_info_exp", true) != 1 : Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("feed_binder_sim_country_info_exp", 0) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
