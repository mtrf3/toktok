package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* loaded from: classes7.dex */
public final class DRC extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final DRC LJLIL = new DRC();

    public DRC() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            Integer valueOf = Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("system_launch_ab_preload_experiment", 0));
            C3C5.m7constructorimpl(valueOf);
            num = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            num = LIZ;
        }
        if (C3C5.m10exceptionOrNullimpl(num) == null) {
            return num;
        }
        return 0;
    }
}
