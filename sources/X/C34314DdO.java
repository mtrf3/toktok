package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DdO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34314DdO extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34314DdO LJLIL = new C34314DdO();

    public C34314DdO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("strict_mode_thread_policy_violation_check", false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
