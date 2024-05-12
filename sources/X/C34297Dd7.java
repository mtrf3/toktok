package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dd7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34297Dd7 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34297Dd7 LJLIL = new C34297Dd7();

    public C34297Dd7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (C34710Djm.LJI() && Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("optimize_userstore_early", false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
