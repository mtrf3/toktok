package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;

/* renamed from: X.2R9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2R9 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C2R9 LJLIL = new C2R9();

    public C2R9() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        Boolean bool;
        try {
            Boolean valueOf = Boolean.valueOf(Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getBoolean("applog_no_deep_copy_optimization", false));
            C3C5.m7constructorimpl(valueOf);
            bool = valueOf;
        } catch (Throwable th) {
            C3C4 LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
            bool = LIZ;
        }
        if (C3C5.m10exceptionOrNullimpl(bool) == null) {
            return bool;
        }
        return Boolean.FALSE;
    }
}
