package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DaU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34134DaU extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34134DaU LJLIL = new C34134DaU();

    public C34134DaU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(C2NW.LIZ().LJII(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("load_more_timing_opt", 0)));
    }
}
