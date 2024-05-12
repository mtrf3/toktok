package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DKr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33705DKr extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33705DKr LJLIL = new C33705DKr();

    public C33705DKr() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 0;
        try {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("push_start_app_opt_precise", 0);
        } catch (Exception unused) {
        }
        return Integer.valueOf(i);
    }
}
