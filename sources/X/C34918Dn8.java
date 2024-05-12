package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dn8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34918Dn8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C34918Dn8 LJLIL = new C34918Dn8();

    public C34918Dn8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        if (Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("xjl_alog_report_by_thread_pool_exp", 0) == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
