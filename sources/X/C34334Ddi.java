package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Ddi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34334Ddi extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34334Ddi LJLIL = new C34334Ddi();

    public C34334Ddi() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("aweme_oncreate_before_super_tasks_anr_opt", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
