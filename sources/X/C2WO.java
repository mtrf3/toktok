package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.2WO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WO extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C2WO LJLIL = new C2WO();

    public C2WO() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            Integer valueOf = Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("tt_friends_top_tab_experiment_index", -1));
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
        return -1;
    }
}