package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.2a2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C60782a2 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C60782a2 LJLIL = new C60782a2();

    public C60782a2() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Integer num;
        try {
            Integer valueOf = Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("slow_method_drop_count_index_experiment", 0));
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
