package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Di3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34603Di3 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34603Di3 LJLIL = new C34603Di3();

    public C34603Di3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("is_downgrade_opt", 2047));
    }
}
