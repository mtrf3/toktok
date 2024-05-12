package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* renamed from: X.DMj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33749DMj extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33749DMj LJLIL = new C33749DMj();

    public C33749DMj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = -1;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("block_gc_low_device", 0);
        }
        return Integer.valueOf(i);
    }
}
