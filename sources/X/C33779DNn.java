package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import com.ss.android.ugc.aweme.impl.StrategyImpl;

/* renamed from: X.DNn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C33779DNn extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C33779DNn LJLIL = new C33779DNn();

    public C33779DNn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        if (StrategyImpl.LIZIZ().LJIILL()) {
            i = -1;
        } else {
            i = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("linux_threadpriority", 0);
        }
        return Integer.valueOf(i);
    }
}
