package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Ddm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34338Ddm extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34338Ddm LJLIL = new C34338Ddm();

    public C34338Ddm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("xjl_feed_apm_looper_println_opt", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
