package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.2PZ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2PZ extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C2PZ LJLIL = new C2PZ();

    public C2PZ() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Object obj;
        try {
            Object valueOf = Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("paging_transition_more_fast_scroll_experiment", 0));
            C3C5.m7constructorimpl(valueOf);
            obj = valueOf;
        } catch (Throwable th) {
            Object LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            obj = LIZ;
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(obj);
        Integer num = obj;
        if (m10exceptionOrNullimpl != null) {
            num = 0;
        }
        num.intValue();
        return num;
    }
}
