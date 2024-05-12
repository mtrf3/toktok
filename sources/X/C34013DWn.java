package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DWn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34013DWn extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34013DWn LJLIL = new C34013DWn();

    public C34013DWn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("xjl_bd_location_net_manager_opt", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
