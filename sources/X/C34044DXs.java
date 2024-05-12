package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DXs, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34044DXs extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34044DXs LJLIL = new C34044DXs();

    public C34044DXs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (!C34565DhR.LIZ() ? C00F.LIZ(31744, 0, "big_screen_bottom_height", true) == 0 : Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("big_screen_bottom_height", 0) == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
