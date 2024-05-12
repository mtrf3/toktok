package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.Dn1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34911Dn1 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34911Dn1 LJLIL = new C34911Dn1();

    public C34911Dn1() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("is_downgrade_splite_opt", 0));
    }
}
