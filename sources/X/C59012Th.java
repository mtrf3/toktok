package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.2Th, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59012Th extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C59012Th LJLIL = new C59012Th();

    public C59012Th() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        Object obj;
        try {
            Object valueOf = Integer.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getInt("ultimate_inflater_layout_preload_for_fyp_at_lest_2880", 0));
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
