package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.DbU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34196DbU extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C34196DbU LJLIL = new C34196DbU();

    public C34196DbU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("is_opt_lego_bootfinish", 1));
    }
}
