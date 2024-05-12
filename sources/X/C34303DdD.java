package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DdD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34303DdD extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34303DdD LJLIL = new C34303DdD();

    public C34303DdD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("coldboot_commerce_logic_opt_enable", false));
    }
}
