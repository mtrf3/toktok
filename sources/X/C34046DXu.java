package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DXu, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34046DXu extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34046DXu LJLIL = new C34046DXu();

    public C34046DXu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!C34565DhR.LIZ() ? C00F.LIZ(31744, 0, "bottom_tab_search_icon", true) != 1 : Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("bottom_tab_search_icon", 0) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
