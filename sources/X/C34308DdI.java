package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DdI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34308DdI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34308DdI LJLIL = new C34308DdI();

    public C34308DdI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("apm_init_push_process_opt", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
